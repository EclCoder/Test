package uj;

import android.util.Log;
import bm.r;
import com.google.api.client.http.HttpMethods;
import com.mbridge.msdk.foundation.download.Command;
import fl.g0;
import fl.w;
import gl.l0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.HttpsURLConnection;
import ji.k;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class d extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f54697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f54698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f54699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f54700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f54701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f54702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f54703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AtomicLong f54704i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ByteArrayOutputStream f54705j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ByteArrayInputStream f54706k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f54707l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f54708m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f54709n;

    public d(String host, int i10, boolean z10) {
        s.h(host, "host");
        this.f54697b = host;
        this.f54698c = i10;
        this.f54699d = z10;
        this.f54700e = "TcpTunneledSocket";
        this.f54701f = l0.l(w.a("Content-Type", "application/x-fcs"), w.a(Command.HTTP_HEADER_USER_AGENT, "Shockwave Flash"));
        this.f54702g = "";
        this.f54704i = new AtomicLong(0L);
        this.f54705j = new ByteArrayOutputStream();
        this.f54706k = new ByteArrayInputStream(new byte[0]);
        this.f54707l = new Object();
        this.f54709n = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(d dVar) {
        try {
            try {
                dVar.n("close/" + dVar.f54702g, dVar.f54699d, new byte[]{0});
                Log.i(dVar.f54700e, "Close success");
            } catch (IOException e10) {
                Log.e(dVar.f54700e, "Close request failed: " + e10.getMessage());
            }
        } finally {
            dVar.f54704i.set(0L);
            dVar.f54702g = "";
        }
    }

    private final HttpURLConnection l(String str, boolean z10) throws IOException {
        HttpURLConnection httpURLConnection;
        String str2 = z10 ? "https" : "http";
        URL url = new URL(str2 + "://" + this.f54697b + ":" + this.f54698c + "/" + str);
        if (z10) {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            s.f(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            httpURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
        } else {
            URLConnection uRLConnectionOpenConnection2 = url.openConnection();
            s.f(uRLConnectionOpenConnection2, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection2;
        }
        Log.i(this.f54700e, "open: " + url);
        httpURLConnection.setRequestMethod(HttpMethods.POST);
        for (Map.Entry entry : this.f54701f.entrySet()) {
            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(g());
        httpURLConnection.setReadTimeout(g());
        return httpURLConnection;
    }

    private final byte[] m(String str, boolean z10) throws IOException {
        HttpURLConnection httpURLConnectionL = l(str, z10);
        try {
            httpURLConnectionL.connect();
            InputStream inputStream = httpURLConnectionL.getInputStream();
            s.g(inputStream, "getInputStream(...)");
            byte[] bArrC = ql.a.c(inputStream);
            if (httpURLConnectionL.getResponseCode() == 200) {
                httpURLConnectionL.disconnect();
                return bArrC;
            }
            throw new IOException("receive packet failed: " + httpURLConnectionL.getResponseMessage());
        } catch (Throwable th2) {
            httpURLConnectionL.disconnect();
            throw th2;
        }
    }

    private final void n(String str, boolean z10, byte[] bArr) throws IOException {
        HttpURLConnection httpURLConnectionL = l(str, z10);
        try {
            httpURLConnectionL.connect();
            httpURLConnectionL.getOutputStream().write(bArr);
            InputStream inputStream = httpURLConnectionL.getInputStream();
            s.g(inputStream, "getInputStream(...)");
            byte[] bArrC = ql.a.c(inputStream);
            if (bArrC.length > 1) {
                this.f54706k = new ByteArrayInputStream(bArrC, 1, bArrC.length);
            }
            if (httpURLConnectionL.getResponseCode() == 200) {
                httpURLConnectionL.disconnect();
                return;
            }
            throw new IOException("send packet failed: " + httpURLConnectionL.getResponseMessage());
        } catch (Throwable th2) {
            httpURLConnectionL.disconnect();
            throw th2;
        }
    }

    @Override // uj.a
    public void a() {
        Log.i(this.f54700e, "closing tunneled socket...");
        this.f54703h = false;
        synchronized (this.f54707l) {
            new Thread(new Runnable() { // from class: uj.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.k(this.f54696a);
                }
            }).start();
            g0 g0Var = g0.f38750a;
        }
    }

    @Override // uj.a
    public void b() {
        synchronized (this.f54707l) {
            try {
                n("fcs/ident2", this.f54699d, new byte[]{0});
            } catch (IOException unused) {
            }
            try {
                String strJ = r.j(new String(m("open/1", this.f54699d), bm.d.f9079b));
                this.f54702g = strJ;
                n("idle/" + strJ + "/" + this.f54704i.get(), this.f54699d, new byte[]{0});
                this.f54703h = true;
                Log.i(this.f54700e, "Connection success");
            } catch (IOException e10) {
                Log.e(this.f54700e, "Connection failed: " + e10.getMessage());
                this.f54703h = false;
                g0 g0Var = g0.f38750a;
            }
        }
    }

    @Override // uj.a
    public void c(boolean z10) {
        synchronized (this.f54707l) {
            if (z10) {
                int i10 = this.f54708m;
                if (i10 < this.f54709n) {
                    this.f54708m = i10 + 1;
                    return;
                }
            }
            if (this.f54703h) {
                long jAddAndGet = this.f54704i.addAndGet(1L);
                byte[] byteArray = this.f54705j.toByteArray();
                this.f54705j.reset();
                String str = "send/" + this.f54702g + "/" + jAddAndGet;
                boolean z11 = this.f54699d;
                s.e(byteArray);
                n(str, z11, byteArray);
                this.f54708m = 0;
                g0 g0Var = g0.f38750a;
            }
        }
    }

    @Override // uj.a
    public InputStream e() {
        synchronized (this.f54707l) {
            try {
                long jA = k.a();
                while (this.f54706k.available() <= 1 && this.f54703h) {
                    long jAddAndGet = this.f54704i.addAndGet(1L);
                    byte[] bArrM = m("idle/" + this.f54702g + "/" + jAddAndGet, this.f54699d);
                    this.f54706k = new ByteArrayInputStream(bArrM, 1, bArrM.length);
                    if (k.a() - jA >= g()) {
                        throw new SocketTimeoutException("couldn't receive a valid packet");
                    }
                }
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f54706k;
    }

    @Override // uj.a
    public OutputStream f() {
        return this.f54705j;
    }

    @Override // uj.a
    public boolean h() {
        return this.f54703h;
    }

    @Override // uj.a
    public boolean i() {
        return this.f54703h;
    }
}
