package com.custom.easyhttp;

import java.util.ArrayList;
import java.util.List;

public class HttpClient {

    private Dispather mDispather;

    private List<Interceptor> mInterceptors;

    private int mRetryTimes;

    private ConnectionPool mConnectionPool;

    public Dispather getDispather() {
        return mDispather;
    }

    public List<Interceptor> getInterceptors() {
        return mInterceptors;
    }

    public int getRetryTimes() {
        return mRetryTimes;
    }

    public ConnectionPool getConnectionPool() {
        return mConnectionPool;
    }

    public HttpClient(Builder builder) {

    }

    public static final class Builder {

        Dispather dispather;
        List<Interceptor> interceptors = new ArrayList<>();
        int retryTimes;
        ConnectionPool connectionPool;

        public Builder addInterceptors(Interceptor interceptor) {
            interceptors.add(interceptor);
            return this;
        }

        public Builder setDispather(Dispather dispather) {
            this.dispather = dispather;
            return this;
        }

        public Builder setRetryTimes(int retryTimes) {
            this.retryTimes = retryTimes;
            return this;
        }

        public Builder setConnectionPool(ConnectionPool connectionPool) {
            this.connectionPool = connectionPool;
            return this;
        }

        public HttpClient build() {
            if (dispather == null) {
                dispather = new Dispather();
            }
            if (connectionPool == null) {
                connectionPool = new ConnectionPool();
            }
            return new HttpClient(this);
        }
    }
}
