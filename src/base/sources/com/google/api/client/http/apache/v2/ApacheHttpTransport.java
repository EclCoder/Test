package com.google.api.client.http.apache.v2;

import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpTransport;
import fo.h;
import io.i;
import io.j;
import io.k;
import io.l;
import io.m;
import io.n;
import io.p;
import java.io.IOException;
import java.net.ProxySelector;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ssl.e;
import org.apache.http.impl.client.x;
import xo.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ApacheHttpTransport extends HttpTransport {
    private final h httpClient;
    private final boolean isMtls;

    public ApacheHttpTransport() {
        this(newDefaultHttpClient(), false);
    }

    public static h newDefaultHttpClient() {
        return newDefaultHttpClientBuilder().a();
    }

    public static x newDefaultHttpClientBuilder() {
        return x.b().p().n(e.b()).l(200).k(20).i(-1L, TimeUnit.MILLISECONDS).m(new s(ProxySelector.getDefault())).g().f();
    }

    public h getHttpClient() {
        return this.httpClient;
    }

    @Override // com.google.api.client.http.HttpTransport
    public boolean isMtls() {
        return this.isMtls;
    }

    @Override // com.google.api.client.http.HttpTransport
    public void shutdown() throws IOException {
        h hVar = this.httpClient;
        if (hVar instanceof org.apache.http.impl.client.h) {
            ((org.apache.http.impl.client.h) hVar).close();
        }
    }

    @Override // com.google.api.client.http.HttpTransport
    public boolean supportsMethod(String str) {
        return true;
    }

    public ApacheHttpTransport(h hVar) {
        this.httpClient = hVar;
        this.isMtls = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.api.client.http.HttpTransport
    public ApacheHttpRequest buildRequest(String str, String str2) {
        n jVar;
        if (str.equals(HttpMethods.DELETE)) {
            jVar = new io.e(str2);
        } else if (str.equals(HttpMethods.GET)) {
            jVar = new io.h(str2);
        } else if (str.equals(HttpMethods.HEAD)) {
            jVar = new i(str2);
        } else if (str.equals(HttpMethods.PATCH)) {
            jVar = new k(str2);
        } else if (str.equals(HttpMethods.POST)) {
            jVar = new l(str2);
        } else if (str.equals(HttpMethods.PUT)) {
            jVar = new m(str2);
        } else if (str.equals(HttpMethods.TRACE)) {
            jVar = new p(str2);
        } else {
            jVar = str.equals(HttpMethods.OPTIONS) ? new j(str2) : new HttpExtensionMethod(str, str2);
        }
        return new ApacheHttpRequest(this.httpClient, jVar);
    }

    public ApacheHttpTransport(h hVar, boolean z10) {
        this.httpClient = hVar;
        this.isMtls = z10;
    }
}
