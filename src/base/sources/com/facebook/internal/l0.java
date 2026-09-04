package com.facebook.internal;

import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f15305a = new l0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f15306b = l0.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static e0 f15307c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a extends BufferedInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HttpURLConnection f15308a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InputStream inputStream, HttpURLConnection connection) {
            super(inputStream, 8192);
            kotlin.jvm.internal.s.h(connection, "connection");
            this.f15308a = connection;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            e1.r(this.f15308a);
        }
    }

    private l0() {
    }

    public static final synchronized e0 a() {
        e0 e0Var;
        try {
            if (f15307c == null) {
                String TAG = f15306b;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                f15307c = new e0(TAG, new e0.e());
            }
            e0Var = f15307c;
            if (e0Var == null) {
                kotlin.jvm.internal.s.w("imageCache");
                e0Var = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return e0Var;
    }

    public static final InputStream b(Uri uri) {
        if (uri != null && f15305a.d(uri)) {
            try {
                e0 e0VarA = a();
                String string = uri.toString();
                kotlin.jvm.internal.s.g(string, "uri.toString()");
                return e0.g(e0VarA, string, null, 2, null);
            } catch (IOException e10) {
                r0.a aVar = r0.f15352e;
                com.facebook.r0 r0Var = com.facebook.r0.CACHE;
                String TAG = f15306b;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                aVar.a(r0Var, 5, TAG, e10.toString());
            }
        }
        return null;
    }

    public static final InputStream c(HttpURLConnection connection) throws IOException {
        kotlin.jvm.internal.s.h(connection, "connection");
        if (connection.getResponseCode() != 200) {
            return null;
        }
        Uri uri = Uri.parse(connection.getURL().toString());
        InputStream inputStream = connection.getInputStream();
        try {
            if (f15305a.d(uri)) {
                e0 e0VarA = a();
                String string = uri.toString();
                kotlin.jvm.internal.s.g(string, "uri.toString()");
                return e0VarA.h(string, new a(inputStream, connection));
            }
        } catch (IOException unused) {
        }
        return inputStream;
    }

    private final boolean d(Uri uri) {
        String host;
        return (uri == null || (host = uri.getHost()) == null || (!kotlin.jvm.internal.s.c(host, "fbcdn.net") && !bm.r.z(host, ".fbcdn.net", false, 2, null) && (!bm.r.N(host, "fbcdn", false, 2, null) || !bm.r.z(host, ".akamaihd.net", false, 2, null)))) ? false : true;
    }
}
