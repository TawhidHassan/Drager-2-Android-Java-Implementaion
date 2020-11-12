package com.example.dragger2implementation.di;

import com.example.dragger2implementation.Utils.DataStorageHelper;
import com.example.dragger2implementation.Utils.Transaction;

import dagger.Module;
import dagger.Provides;

@Module
public class DataStorageModule {

    @Provides
    public static Transaction getTransaction(){
        return new Transaction(System.currentTimeMillis());
    }

    @Provides
    public static DataStorageHelper getDataStorageHelper(Transaction transaction){
         DataStorageHelper helper = new DataStorageHelper(transaction);
         helper.setStoragePermission(true);
        return helper;
    }
}
