package com.example.dragger2implementation.network;

import android.util.Log;

import javax.inject.Inject;

import static android.content.ContentValues.TAG;
import static com.example.dragger2implementation.basics.Constants.MY_TAG;

public class NetworkClient {
    @Inject
     NetworkConnection mConnection;


    @Inject
    public NetworkClient(NetworkConnection connection) {
        this.mConnection=connection;
    }

    @Inject
    public void testMethod(){
        Log.d(MY_TAG,"testMethod : this is test metyhos");
    }

    @Inject
    public  void attachToNetworkTester(NetworkTester tester)
    {
        tester.attachToNetwork(this);
    }

    public String fetchData(){
        return mConnection.doReq();
    }
}