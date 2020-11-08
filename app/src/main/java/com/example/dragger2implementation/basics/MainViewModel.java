package com.example.dragger2implementation.basics;

import com.example.dragger2implementation.network.NetworkClient;

public class MainViewModel {

    private final NetworkClient mClient;


    public MainViewModel(NetworkClient networkClient) {
        this.mClient = networkClient;
    }

    public String fetchData(){
        return mClient.fetchData();
    }
}

