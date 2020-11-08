package com.example.dragger2implementation.network;


import com.example.dragger2implementation.BuildConfig;
import com.example.dragger2implementation.basics.Constants;

import javax.inject.Inject;

public class NetworkConnection {
    private final String mEndpoint;

    @Inject
    public NetworkConnection(){

        if(BuildConfig.DEBUG){
            this.mEndpoint= Constants.DEBUG_ENDPOINT;
        }else {
            this.mEndpoint=Constants.PROD_ENDPOINT;
        }

    }
    public String doReq() {
        return this.mEndpoint;
    }

}
