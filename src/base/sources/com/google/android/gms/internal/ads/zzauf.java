package com.google.android.gms.internal.ads;

import com.google.api.client.http.HttpMethods;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzauf extends zzats {
    public zzauf() {
        throw null;
    }

    static List zzb(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new zzasw((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzats
    public final zzauc zza(zzate zzateVar, Map map) throws Throwable {
        String strZzh = zzateVar.zzh();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(zzateVar.zzm());
        URL url = new URL(strZzh);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int iZzo = zzateVar.zzo();
        httpURLConnection.setConnectTimeout(iZzo);
        httpURLConnection.setReadTimeout(iZzo);
        boolean z10 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        url.getProtocol();
        try {
            for (String str : map2.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) map2.get(str));
            }
            if (zzateVar.zza() != 0) {
                httpURLConnection.setRequestMethod(HttpMethods.POST);
                byte[] bArrZzn = zzateVar.zzn();
                if (bArrZzn != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(bArrZzn);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod(HttpMethods.GET);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            zzateVar.zza();
            if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                zzauc zzaucVar = new zzauc(responseCode, zzb(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return zzaucVar;
            }
            try {
                return new zzauc(responseCode, zzb(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new zzaud(httpURLConnection));
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                if (!z10) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public zzauf(zzaue zzaueVar, SSLSocketFactory sSLSocketFactory) {
    }
}
