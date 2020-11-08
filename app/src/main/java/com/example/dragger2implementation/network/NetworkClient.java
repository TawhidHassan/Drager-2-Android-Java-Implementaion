package com.example.dragger2implementation.network;

import javax.inject.Inject;

public class NetworkClient {

    private final NetworkConnection mConnection;


    @Inject
    public NetworkClient(NetworkConnection connection) {
        this.mConnection = connection;
    }

    public String fetchData(){
        return mConnection.doReq();
    }
}