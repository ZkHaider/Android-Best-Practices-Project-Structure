package com.sampleproject.api;

import retrofit.RestAdapter;

/**
 * Created by ZkHaider on 8/10/15.
 */
public class SampleClient {

    private static final String API_URL = "";
    private static SampleClient mSampleClient;
    private static RestAdapter mAsyncRestAdapter;

    public static SampleClient getInstance() {
        if (mSampleClient == null)
            mSampleClient = new SampleClient();
        return mSampleClient;
    }

    private SampleClient() {
        mAsyncRestAdapter = new RestAdapter.Builder()
                .setEndpoint(API_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
    }

}
