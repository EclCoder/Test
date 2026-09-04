package com.mbridge.msdk.tracker.network.toolbox;

import com.google.api.client.http.HttpMethods;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.tracker.network.t;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class h extends com.mbridge.msdk.tracker.network.toolbox.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SSLSocketFactory f33867a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HttpURLConnection f33868a;

        a(HttpURLConnection httpURLConnection) {
            super(h.b(httpURLConnection));
            this.f33868a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.f33868a.disconnect();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
    }

    public h() {
        this(null);
    }

    private static boolean a(int i10, int i11) {
        if (i10 != 4) {
            return ((100 <= i11 && i11 < 200) || i11 == 204 || i11 == 304) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    public h(b bVar) {
        this(bVar, null);
    }

    public h(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.f33867a = sSLSocketFactory;
    }

    @Override // com.mbridge.msdk.tracker.network.toolbox.a
    public g a(t<?> tVar, Map<String, String> map) {
        String strA = tVar.g() == 0 ? d.a(tVar.t(), tVar) : tVar.t();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(tVar.f());
        HttpsURLConnection httpsURLConnectionA = a(new URL(strA), tVar);
        try {
            for (String str : map2.keySet()) {
                httpsURLConnectionA.setRequestProperty(str, (String) map2.get(str));
            }
            b(httpsURLConnectionA, tVar);
            int responseCode = httpsURLConnectionA.getResponseCode();
            if (responseCode != -1) {
                if (!a(tVar.g(), responseCode)) {
                    g gVar = new g(responseCode, a(httpsURLConnectionA.getHeaderFields()));
                    httpsURLConnectionA.disconnect();
                    return gVar;
                }
                return new g(responseCode, a(httpsURLConnectionA.getHeaderFields()), httpsURLConnectionA.getContentLength(), a(tVar, httpsURLConnectionA));
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th2) {
            if (0 == 0) {
                httpsURLConnectionA.disconnect();
            }
            throw th2;
        }
    }

    void b(HttpURLConnection httpURLConnection, t<?> tVar) throws IOException {
        switch (tVar.g()) {
            case 0:
                httpURLConnection.setRequestMethod(HttpMethods.GET);
                return;
            case 1:
                httpURLConnection.setRequestMethod(HttpMethods.POST);
                a(httpURLConnection, tVar);
                return;
            case 2:
                httpURLConnection.setRequestMethod(HttpMethods.PUT);
                a(httpURLConnection, tVar);
                return;
            case 3:
                httpURLConnection.setRequestMethod(HttpMethods.DELETE);
                return;
            case 4:
                httpURLConnection.setRequestMethod(HttpMethods.HEAD);
                return;
            case 5:
                httpURLConnection.setRequestMethod(HttpMethods.OPTIONS);
                return;
            case 6:
                httpURLConnection.setRequestMethod(HttpMethods.TRACE);
                return;
            case 7:
                httpURLConnection.setRequestMethod(HttpMethods.PATCH);
                a(httpURLConnection, tVar);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    static List<com.mbridge.msdk.tracker.network.g> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.mbridge.msdk.tracker.network.g(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    protected InputStream a(t<?> tVar, HttpURLConnection httpURLConnection) {
        return new a(httpURLConnection);
    }

    protected HttpsURLConnection a(URL url) {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
        httpsURLConnection.setHostnameVerifier(new MBridgeHostnameVerifier(url));
        httpsURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpsURLConnection;
    }

    private HttpsURLConnection a(URL url, t<?> tVar) {
        SSLSocketFactory sSLSocketFactory;
        HttpsURLConnection httpsURLConnectionA = a(url);
        int iQ = tVar.q();
        httpsURLConnectionA.setConnectTimeout(iQ);
        httpsURLConnectionA.setReadTimeout(iQ);
        httpsURLConnectionA.setUseCaches(false);
        httpsURLConnectionA.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f33867a) != null) {
            httpsURLConnectionA.setSSLSocketFactory(sSLSocketFactory);
        }
        return httpsURLConnectionA;
    }

    private void a(HttpURLConnection httpURLConnection, t<?> tVar) throws IOException {
        byte[] bArrB = tVar.b();
        if (bArrB != null) {
            a(httpURLConnection, tVar, bArrB);
        }
    }

    private void a(HttpURLConnection httpURLConnection, t<?> tVar, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", tVar.c());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(a(tVar, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    protected OutputStream a(t<?> tVar, HttpURLConnection httpURLConnection, int i10) {
        return httpURLConnection.getOutputStream();
    }
}
