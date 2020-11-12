package com.example.dragger2implementation.Utils;

import android.util.Log;

import static android.content.ContentValues.TAG;
import static com.example.dragger2implementation.basics.Constants.MY_TAG;

public class DataStorageHelper {
    private boolean mPermission;
    private Transaction mTransaction;

    //this class is not part of our own code
    //this class is from third party library
    //so we cannot change any code in this class

    public DataStorageHelper(Transaction mTransaction) {
        this.mTransaction = mTransaction;
    }

    public void storeData(String data) {
        if (mPermission)
            Log.d(MY_TAG, "storeData: Storing data: " + data + ", at " + mTransaction);
        else
            Log.d(MY_TAG, "storeData: Storage permission not granted");
    }

    public void setStoragePermission(boolean permission) {
        this.mPermission = permission;
        Log.d(MY_TAG, "checkStoragePermission: Storage Permission: ? " + mPermission);
    }

}