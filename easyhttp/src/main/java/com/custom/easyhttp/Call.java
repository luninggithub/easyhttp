package com.custom.easyhttp;

public class Call {

    private HttpClient mHttpClient;

    private Request mRequest;

    boolean executed;

    boolean canceled;

    public HttpClient getHttpClient() {
        return mHttpClient;
    }

    public Request getRequest() {
        return mRequest;
    }

    public boolean isCanceled() {
        return canceled;
    }
}
