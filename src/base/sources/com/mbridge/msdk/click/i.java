package com.mbridge.msdk.click;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.api.client.http.HttpMethods;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f28395f = "i";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f28396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28398c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f28399d = 3145728;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f28400e;

    public i() {
        com.mbridge.msdk.setting.g gVarF = com.mbridge.msdk.setting.h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        this.f28396a = gVarF;
        if (gVarF == null) {
            this.f28396a = com.mbridge.msdk.setting.h.b().a();
        }
    }

    public com.mbridge.msdk.click.entity.a a(String str, boolean z10, boolean z11, CampaignEx campaignEx) {
        int i10;
        HttpsURLConnection httpsURLConnection = null;
        if (!URLUtil.isNetworkUrl(str)) {
            return null;
        }
        String strReplace = str.replace(" ", "%20");
        this.f28400e = new com.mbridge.msdk.click.entity.a();
        try {
            HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) new URL(strReplace).openConnection();
            try {
                httpsURLConnection2.setHostnameVerifier(new MBridgeHostnameVerifier(strReplace));
                httpsURLConnection2.setRequestMethod(HttpMethods.GET);
                if ((!z10 && !z11) || campaignEx == null) {
                    httpsURLConnection2.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, m0.i());
                }
                if (z10 && campaignEx != null && campaignEx.getcUA() == 1) {
                    httpsURLConnection2.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, m0.i());
                }
                if (z11 && campaignEx != null && campaignEx.getImpUA() == 1) {
                    httpsURLConnection2.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, m0.i());
                }
                httpsURLConnection2.setRequestProperty("Accept-Encoding", "gzip");
                if (this.f28396a.M0() && !TextUtils.isEmpty(this.f28397b)) {
                    httpsURLConnection2.setRequestProperty("referer", this.f28397b);
                }
                httpsURLConnection2.setConnectTimeout(60000);
                httpsURLConnection2.setReadTimeout(60000);
                httpsURLConnection2.setInstanceFollowRedirects(false);
                httpsURLConnection2.connect();
                this.f28400e.f28373a = httpsURLConnection2.getHeaderField("Location");
                this.f28400e.f28376d = httpsURLConnection2.getHeaderField("Referer");
                this.f28400e.f28378f = httpsURLConnection2.getResponseCode();
                this.f28400e.f28374b = httpsURLConnection2.getContentType();
                this.f28400e.f28377e = httpsURLConnection2.getContentLength();
                this.f28400e.f28375c = httpsURLConnection2.getContentEncoding();
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(this.f28400e.f28375c);
                com.mbridge.msdk.click.entity.a aVar = this.f28400e;
                if (aVar.f28378f == 200 && this.f28398c && (i10 = aVar.f28377e) > 0 && i10 < 3145728 && !TextUtils.isEmpty(strReplace)) {
                    try {
                        String strA = a(httpsURLConnection2.getInputStream(), zEqualsIgnoreCase);
                        if (!TextUtils.isEmpty(strA)) {
                            byte[] bytes = strA.getBytes();
                            if (bytes.length > 0 && bytes.length < 3145728) {
                                this.f28400e.f28379g = strA.trim();
                            }
                        }
                    } catch (Throwable th2) {
                        q0.b(f28395f, th2.getMessage());
                    }
                }
                this.f28397b = strReplace;
                httpsURLConnection2.disconnect();
                return this.f28400e;
            } catch (Throwable th3) {
                th = th3;
                httpsURLConnection = httpsURLConnection2;
                try {
                    this.f28400e.f28380h = th.getMessage();
                    return this.f28400e;
                } finally {
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0036 A[Catch: all -> 0x000f, TryCatch #5 {all -> 0x000f, blocks: (B:4:0x0008, B:9:0x0013, B:23:0x0032, B:25:0x0036, B:26:0x0043), top: B:45:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x004e A[Catch: Exception -> 0x002f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x002f, blocks: (B:18:0x002b, B:28:0x004e), top: B:41:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private String a(InputStream inputStream, boolean z10) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th2;
        Exception e10;
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            if (z10) {
                try {
                    try {
                        inputStream = new GZIPInputStream(inputStream);
                    } catch (Exception e11) {
                        e10 = e11;
                        if (this.f28400e == null) {
                            com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
                            this.f28400e = aVar;
                            aVar.f28380h = e10.getMessage();
                        }
                        q0.b(f28395f, e10.getMessage());
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                        return sb2.toString();
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e12) {
                            q0.b(f28395f, e12.getMessage());
                        }
                    }
                    throw th2;
                }
            }
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                } catch (Exception e13) {
                    e10 = e13;
                    bufferedReader2 = bufferedReader;
                    if (this.f28400e == null) {
                        com.mbridge.msdk.click.entity.a aVar2 = new com.mbridge.msdk.click.entity.a();
                        this.f28400e = aVar2;
                        aVar2.f28380h = e10.getMessage();
                    }
                    q0.b(f28395f, e10.getMessage());
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    return sb2.toString();
                } catch (Throwable th4) {
                    th2 = th4;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th2;
                }
            }
            bufferedReader.close();
        } catch (Exception e14) {
            q0.b(f28395f, e14.getMessage());
        }
        return sb2.toString();
    }
}
