package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import b9.n;
import b9.o;
import b9.p;
import b9.q;
import b9.r;
import b9.s;
import b9.t;
import b9.u;
import b9.v;
import b9.w;
import b9.x;
import c9.h;
import c9.i;
import com.google.api.client.http.HttpMethods;
import com.google.firebase.encoders.EncodingException;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import d9.f;
import d9.g;
import d9.m;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wd.a f16390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f16391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f16392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final URL f16393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m9.a f16394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m9.a f16395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f16396g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final URL f16397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final n f16398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f16399c;

        a(URL url, n nVar, String str) {
            this.f16397a = url;
            this.f16398b = nVar;
            this.f16399c = str;
        }

        a a(URL url) {
            return new a(url, this.f16398b, this.f16399c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f16400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final URL f16401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f16402c;

        b(int i10, URL url, long j10) {
            this.f16400a = i10;
            this.f16401b = url;
            this.f16402c = j10;
        }
    }

    d(Context context, m9.a aVar, m9.a aVar2, int i10) {
        this.f16390a = n.b();
        this.f16392c = context;
        this.f16391b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f16393d = n(com.google.android.datatransport.cct.a.f16381c);
        this.f16394e = aVar2;
        this.f16395f = aVar;
        this.f16396g = i10;
    }

    public static /* synthetic */ a d(a aVar, b bVar) {
        URL url = bVar.f16401b;
        if (url == null) {
            return null;
        }
        g9.a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f16401b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) throws IOException {
        g9.a.f("CctTransportBackend", "Making request to: %s", aVar.f16397a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f16397a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f16396g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(HttpMethods.POST);
        httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f16399c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f16390a.a(aVar.f16398b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    g9.a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    g9.a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    g9.a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamM = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, v.b(new BufferedReader(new InputStreamReader(inputStreamM))).c());
                            if (inputStreamM != null) {
                                inputStreamM.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (Throwable th2) {
                            if (inputStreamM != null) {
                                try {
                                    inputStreamM.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            } catch (Throwable th8) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                    }
                }
                throw th8;
            }
        } catch (EncodingException e10) {
            e = e10;
            g9.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e11) {
            e = e11;
            g9.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e12) {
            e = e12;
            g9.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e13) {
            e = e13;
            g9.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    private static String f(Context context) {
        String simOperator = k(context).getSimOperator();
        return simOperator != null ? simOperator : "";
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return w.b.UNKNOWN_MOBILE_SUBTYPE.d();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return w.b.COMBINED.d();
        }
        if (w.b.a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int h(NetworkInfo networkInfo) {
        return networkInfo == null ? w.c.NONE.d() : networkInfo.getType();
    }

    private static int i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            g9.a.d("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    private n j(f fVar) {
        t.a aVarL;
        HashMap map = new HashMap();
        for (i iVar : fVar.b()) {
            String strN = iVar.n();
            if (map.containsKey(strN)) {
                ((List) map.get(strN)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                map.put(strN, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            u.a aVarB = u.a().f(x.DEFAULT).g(this.f16395f.a()).h(this.f16394e.a()).b(o.a().c(o.b.ANDROID_FIREBASE).b(b9.a.a().m(Integer.valueOf(iVar2.i("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h hVarE = iVar3.e();
                a9.b bVarB = hVarE.b();
                if (bVarB.equals(a9.b.b("proto"))) {
                    aVarL = t.l(hVarE.a());
                } else if (bVarB.equals(a9.b.b("json"))) {
                    aVarL = t.k(new String(hVarE.a(), Charset.forName(C.UTF8_NAME)));
                } else {
                    g9.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", bVarB);
                }
                aVarL.d(iVar3.f()).e(iVar3.o()).j(iVar3.j("tz-offset")).g(w.a().c(w.c.a(iVar3.i("net-type"))).b(w.b.a(iVar3.i("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    aVarL.c(iVar3.d());
                }
                if (iVar3.l() != null) {
                    aVarL.b(p.a().b(s.a().b(r.a().b(iVar3.l()).a()).a()).c(p.b.EVENT_OVERRIDE).a());
                }
                if (iVar3.g() != null || iVar3.h() != null) {
                    q.a aVarA = q.a();
                    if (iVar3.g() != null) {
                        aVarA.b(iVar3.g());
                    }
                    if (iVar3.h() != null) {
                        aVarA.c(iVar3.h());
                    }
                    aVarL.f(aVarA.a());
                }
                arrayList3.add(aVarL.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return n.a(arrayList2);
    }

    private static TelephonyManager k(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long l() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    private static InputStream m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // d9.m
    public g a(f fVar) {
        n nVarJ = j(fVar);
        URL urlN = this.f16393d;
        String strD = null;
        if (fVar.c() != null) {
            try {
                com.google.android.datatransport.cct.a aVarC = com.google.android.datatransport.cct.a.c(fVar.c());
                strD = aVarC.d() != null ? aVarC.d() : null;
                if (aVarC.e() != null) {
                    urlN = n(aVarC.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) h9.b.a(5, new a(urlN, nVarJ, strD), new h9.a() { // from class: com.google.android.datatransport.cct.b
                @Override // h9.a
                public final Object apply(Object obj) {
                    return this.f16389a.e((d.a) obj);
                }
            }, new h9.c() { // from class: com.google.android.datatransport.cct.c
                @Override // h9.c
                public final Object a(Object obj, Object obj2) {
                    return d.d((d.a) obj, (d.b) obj2);
                }
            });
            int i10 = bVar.f16400a;
            if (i10 == 200) {
                return g.e(bVar.f16402c);
            }
            if (i10 < 500 && i10 != 404) {
                return i10 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e10) {
            g9.a.d("CctTransportBackend", "Could not make request to the backend", e10);
            return g.f();
        }
    }

    @Override // d9.m
    public i b(i iVar) {
        NetworkInfo activeNetworkInfo = this.f16391b.getActiveNetworkInfo();
        return iVar.p().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", l()).a("net-type", h(activeNetworkInfo)).a("mobile-subtype", g(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", f(this.f16392c)).c("application_build", Integer.toString(i(this.f16392c))).d();
    }

    d(Context context, m9.a aVar, m9.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
