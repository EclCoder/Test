package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class j implements d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final b f11250g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x5.h f11251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f11253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HttpURLConnection f11254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InputStream f11255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f11256f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface b {
        HttpURLConnection a(URL url);
    }

    public j(x5.h hVar, int i10) {
        this(hVar, i10, f11250g);
    }

    private HttpURLConnection c(URL url, Map map) throws HttpException {
        try {
            HttpURLConnection httpURLConnectionA = this.f11253c.a(url);
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnectionA.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnectionA.setConnectTimeout(this.f11252b);
            httpURLConnectionA.setReadTimeout(this.f11252b);
            httpURLConnectionA.setUseCaches(false);
            httpURLConnectionA.setDoInput(true);
            httpURLConnectionA.setInstanceFollowRedirects(false);
            return httpURLConnectionA;
        } catch (IOException e10) {
            throw new HttpException("URL.openConnection threw", 0, e10);
        }
    }

    private static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e10);
            return -1;
        }
    }

    private InputStream g(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f11255e = m6.c.c(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f11255e = httpURLConnection.getInputStream();
            }
            return this.f11255e;
        } catch (IOException e10) {
            throw new HttpException("Failed to obtain InputStream", f(httpURLConnection), e10);
        }
    }

    private static boolean h(int i10) {
        return i10 / 100 == 2;
    }

    private static boolean i(int i10) {
        return i10 / 100 == 3;
    }

    private InputStream j(URL url, int i10, URL url2, Map map) throws HttpException {
        if (i10 >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionC = c(url, map);
        this.f11254d = httpURLConnectionC;
        try {
            httpURLConnectionC.connect();
            this.f11255e = this.f11254d.getInputStream();
            if (this.f11256f) {
                return null;
            }
            int iF = f(this.f11254d);
            if (h(iF)) {
                return g(this.f11254d);
            }
            if (!i(iF)) {
                if (iF == -1) {
                    throw new HttpException(iF);
                }
                try {
                    throw new HttpException(this.f11254d.getResponseMessage(), iF);
                } catch (IOException e10) {
                    throw new HttpException("Failed to get a response message", iF, e10);
                }
            }
            String headerField = this.f11254d.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new HttpException("Received empty or null redirect url", iF);
            }
            try {
                URL url3 = new URL(url, headerField);
                b();
                return j(url3, i10 + 1, url, map);
            } catch (MalformedURLException e11) {
                throw new HttpException("Bad redirect url: " + headerField, iF, e11);
            }
        } catch (IOException e12) {
            throw new HttpException("Failed to connect or obtain data", f(this.f11254d), e12);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f11255e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f11254d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f11254d = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f11256f = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public r5.a d() {
        return r5.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.h hVar, d.a aVar) {
        long jB = m6.g.b();
        try {
            aVar.f(j(this.f11251a.h(), 0, null, this.f11251a.e()));
        } catch (IOException e10) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
            }
            aVar.c(e10);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + m6.g.a(jB));
            }
        }
    }

    j(x5.h hVar, int i10, b bVar) {
        this.f11251a = hVar;
        this.f11252b = i10;
        this.f11253c = bVar;
    }
}
