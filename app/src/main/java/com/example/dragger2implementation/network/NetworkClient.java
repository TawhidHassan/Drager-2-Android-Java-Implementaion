package com.example.dragger2implementation.network;

import javax.inject.Inject;

public class NetworkClient {
    @Inject
     NetworkConnection mConnection;


    @Inject
    public NetworkClient() {
//        this.mConnection = connection;
    }

    public String fetchData(){
        return mConnection.doReq();
    }
}