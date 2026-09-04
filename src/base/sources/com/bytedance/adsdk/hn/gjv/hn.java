package com.bytedance.adsdk.hn.gjv;

import com.google.api.client.http.HttpMethods;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn implements dkl {
    @Override // com.bytedance.adsdk.hn.gjv.dkl
    public gjv hnj(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(HttpMethods.GET);
        httpURLConnection.connect();
        return new hnj(httpURLConnection);
    }
}
