package com.example.dragger2implementation.basics;

import com.example.dragger2implementation.network.NetworkClient;

import javax.inject.Inject;

public class MainViewModel {

    private final NetworkClient mClient;

    @Inject
    public MainViewModel(NetworkClient networkClient) {
        this.mClient = networkClient;
    }

    public String fetchData(){
        return mClient.fetchData();
    }
}

