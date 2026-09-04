package com.bytedance.adsdk.hn.gjv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj implements gjv {
    private final HttpURLConnection hnj;

    public hnj(HttpURLConnection httpURLConnection) {
        this.hnj = httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.hnj.disconnect();
    }

    @Override // com.bytedance.adsdk.hn.gjv.gjv
    public String gjv() {
        try {
            if (hnj()) {
                return null;
            }
            return "Unable to fetch " + this.hnj.getURL() + ". Failed with " + this.hnj.getResponseCode() + "\n" + hnj(this.hnj);
        } catch (IOException e10) {
            return e10.getMessage();
        }
    }

    @Override // com.bytedance.adsdk.hn.gjv.gjv
    public InputStream hn() {
        return this.hnj.getInputStream();
    }

    @Override // com.bytedance.adsdk.hn.gjv.gjv
    public boolean hnj() {
        try {
            return this.hnj.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.bytedance.adsdk.hn.gjv.gjv
    public String qor() {
        return this.hnj.getContentType();
    }

    private String hnj(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th2;
            }
        }
        bufferedReader.close();
        return sb2.toString();
    }
}
