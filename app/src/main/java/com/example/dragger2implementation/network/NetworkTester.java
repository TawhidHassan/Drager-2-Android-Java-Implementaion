package com.example.dragger2implementation.network;

import android.nfc.Tag;
import android.util.Log;

import javax.inject.Inject;

import static android.content.ContentValues.TAG;
import static com.example.dragger2implementation.basics.Constants.MY_TAG;

public class NetworkTester {

    @Inject
    public NetworkTester() {

    }

    public void attachToNetwork(NetworkClient client){
        Log.d(MY_TAG,"attach Network : Attached to network");
    }
}
