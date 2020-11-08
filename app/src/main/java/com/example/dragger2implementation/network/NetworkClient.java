package com.example.dragger2implementation.network;

public class NetworkClient {

    private final NetworkConnection mConnection;


    public NetworkClient(NetworkConnection connection) {
        this.mConnection = connection;
    }

    public String fetchData(){
        return mConnection.doReq();
    }
}