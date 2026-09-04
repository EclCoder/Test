package com.google.api.client.http.javanet;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class DefaultConnectionFactory implements ConnectionFactory {
    private final Proxy proxy;

    public DefaultConnectionFactory() {
        this(null);
    }

    @Override // com.google.api.client.http.javanet.ConnectionFactory
    public HttpURLConnection openConnection(URL url) {
        Proxy proxy = this.proxy;
        return (HttpURLConnection) (proxy == null ? url.openConnection() : url.openConnection(proxy));
    }

    public DefaultConnectionFactory(Proxy proxy) {
        this.proxy = proxy;
    }
}
