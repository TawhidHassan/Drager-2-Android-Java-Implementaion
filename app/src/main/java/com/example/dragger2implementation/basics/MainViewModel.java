package com.example.dragger2implementation.basics;

import com.example.dragger2implementation.Utils.DataStorageHelper;
import com.example.dragger2implementation.network.NetworkClient;

import javax.inject.Inject;

public class MainViewModel {

    private final NetworkClient mClient;
    private final DataStorageHelper mDataStorageHelper;

    @Inject
    public MainViewModel(NetworkClient networkClient,
                         DataStorageHelper dataStorageHelper) {
        this.mClient = networkClient;
        this.mDataStorageHelper = dataStorageHelper;
    }

    public String fetchData(){
        String data = mClient.fetchData();
        mDataStorageHelper.storeData(data);
        return data;
    }
}

