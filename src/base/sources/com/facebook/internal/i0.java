package com.facebook.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.FacebookException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Handler f15233b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f15232a = new i0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final m1 f15234c = new m1(8, null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final m1 f15235d = new m1(2, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f15236e = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f15237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f15238b;

        public a(d key, boolean z10) {
            kotlin.jvm.internal.s.h(key, "key");
            this.f15237a = key;
            this.f15238b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (x7.a.c(this)) {
                return;
            }
            try {
                if (x7.a.c(this)) {
                    return;
                }
                try {
                    i0.f15232a.m(this.f15237a, this.f15238b);
                } catch (Throwable th2) {
                    x7.a.b(th2, this);
                }
            } catch (Throwable th3) {
                x7.a.b(th3, this);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f15239a;

        public b(d key) {
            kotlin.jvm.internal.s.h(key, "key");
            this.f15239a = key;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (x7.a.c(this)) {
                return;
            }
            try {
                if (x7.a.c(this)) {
                    return;
                }
                try {
                    i0.f15232a.e(this.f15239a);
                } catch (Throwable th2) {
                    x7.a.b(th2, this);
                }
            } catch (Throwable th3) {
                x7.a.b(th3, this);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private j0 f15240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private m1.b f15241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f15242c;

        public c(j0 request) {
            kotlin.jvm.internal.s.h(request, "request");
            this.f15240a = request;
        }

        public final j0 a() {
            return this.f15240a;
        }

        public final m1.b b() {
            return this.f15241b;
        }

        public final boolean c() {
            return this.f15242c;
        }

        public final void d(boolean z10) {
            this.f15242c = z10;
        }

        public final void e(j0 j0Var) {
            kotlin.jvm.internal.s.h(j0Var, "<set-?>");
            this.f15240a = j0Var;
        }

        public final void f(m1.b bVar) {
            this.f15241b = bVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f15243c = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Uri f15244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f15245b;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public d(Uri uri, Object tag) {
            kotlin.jvm.internal.s.h(uri, "uri");
            kotlin.jvm.internal.s.h(tag, "tag");
            this.f15244a = uri;
            this.f15245b = tag;
        }

        public final Object a() {
            return this.f15245b;
        }

        public final Uri b() {
            return this.f15244a;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof d)) {
                d dVar = (d) obj;
                if (kotlin.jvm.internal.s.c(dVar.f15244a, this.f15244a) && kotlin.jvm.internal.s.c(dVar.f15245b, this.f15245b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((1073 + this.f15244a.hashCode()) * 37) + this.f15245b.hashCode();
        }
    }

    private i0() {
    }

    public static final boolean d(j0 request) {
        boolean z10;
        kotlin.jvm.internal.s.h(request, "request");
        d dVar = new d(request.c(), request.b());
        Map map = f15236e;
        synchronized (map) {
            try {
                c cVar = (c) map.get(dVar);
                if (cVar != null) {
                    m1.b bVarB = cVar.b();
                    z10 = true;
                    if (bVarB == null || !bVarB.cancel()) {
                        cVar.d(true);
                    } else {
                        map.remove(dVar);
                    }
                } else {
                    z10 = false;
                }
                fl.g0 g0Var = fl.g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:53:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
    public final void e(d dVar) throws Throwable {
        HttpURLConnection httpURLConnection;
        ?? r10;
        Exception facebookException;
        InputStream inputStreamC;
        Bitmap bitmapDecodeStream;
        ?? r11 = 0;
        InputStream inputStream = null;
        r11 = 0;
        Bitmap bitmap = null;
        boolean z10 = true;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(dVar.b().toString()).openConnection();
            kotlin.jvm.internal.s.f(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                try {
                    httpURLConnection.setInstanceFollowRedirects(false);
                    ?? responseCode = httpURLConnection.getResponseCode();
                    try {
                        if (responseCode != 200) {
                            if (responseCode == 301 || responseCode == 302) {
                                try {
                                    String headerField = httpURLConnection.getHeaderField("location");
                                    if (!e1.e0(headerField)) {
                                        Uri redirectUri = Uri.parse(headerField);
                                        z0.a(dVar.b(), redirectUri);
                                        c cVarN = n(dVar);
                                        if (cVarN != null && !cVarN.c()) {
                                            j0 j0VarA = cVarN.a();
                                            kotlin.jvm.internal.s.g(redirectUri, "redirectUri");
                                            g(j0VarA, new d(redirectUri, dVar.a()), false);
                                        }
                                    }
                                    z10 = false;
                                    bitmapDecodeStream = null;
                                    facebookException = null;
                                } catch (IOException e10) {
                                    e = e10;
                                    z10 = false;
                                    r10 = 0;
                                    e1.j(r10);
                                    e1.r(httpURLConnection);
                                    facebookException = e;
                                }
                            } else {
                                inputStreamC = httpURLConnection.getErrorStream();
                                StringBuilder sb2 = new StringBuilder();
                                if (inputStreamC != null) {
                                    InputStreamReader inputStreamReader = new InputStreamReader(inputStreamC);
                                    char[] cArr = new char[128];
                                    while (true) {
                                        int i10 = inputStreamReader.read(cArr, 0, 128);
                                        if (i10 <= 0) {
                                            break;
                                        } else {
                                            sb2.append(cArr, 0, i10);
                                        }
                                    }
                                    e1.j(inputStreamReader);
                                } else {
                                    sb2.append("Unexpected error while downloading an image.");
                                }
                                facebookException = new FacebookException(sb2.toString());
                                bitmapDecodeStream = null;
                            }
                            e1.j(inputStream);
                            e1.r(httpURLConnection);
                            bitmap = bitmapDecodeStream;
                            if (z10) {
                                k(dVar, facebookException, bitmap, false);
                            }
                        }
                        inputStreamC = l0.c(httpURLConnection);
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamC);
                        facebookException = null;
                        inputStream = inputStreamC;
                        e1.j(inputStream);
                        e1.r(httpURLConnection);
                        bitmap = bitmapDecodeStream;
                    } catch (IOException e11) {
                        e = e11;
                        r10 = responseCode;
                        e1.j(r10);
                        e1.r(httpURLConnection);
                        facebookException = e;
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = responseCode;
                        e1.j(r11);
                        e1.r(httpURLConnection);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e12) {
                e = e12;
            }
        } catch (IOException e13) {
            e = e13;
            httpURLConnection = null;
            r10 = 0;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
        if (z10) {
            k(dVar, facebookException, bitmap, false);
        }
    }

    public static final void f(j0 j0Var) {
        if (j0Var == null) {
            return;
        }
        d dVar = new d(j0Var.c(), j0Var.b());
        Map map = f15236e;
        synchronized (map) {
            try {
                c cVar = (c) map.get(dVar);
                if (cVar != null) {
                    cVar.e(j0Var);
                    cVar.d(false);
                    m1.b bVarB = cVar.b();
                    if (bVarB != null) {
                        bVarB.a();
                        fl.g0 g0Var = fl.g0.f38750a;
                    }
                } else {
                    f15232a.g(j0Var, dVar, j0Var.d());
                    fl.g0 g0Var2 = fl.g0.f38750a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void g(j0 j0Var, d dVar, boolean z10) {
        i(j0Var, dVar, f15235d, new a(dVar, z10));
    }

    private final void h(j0 j0Var, d dVar) {
        i(j0Var, dVar, f15234c, new b(dVar));
    }

    private final void i(j0 j0Var, d dVar, m1 m1Var, Runnable runnable) {
        Map map = f15236e;
        synchronized (map) {
            c cVar = new c(j0Var);
            map.put(dVar, cVar);
            cVar.f(m1.f(m1Var, runnable, false, 2, null));
            fl.g0 g0Var = fl.g0.f38750a;
        }
    }

    private final synchronized Handler j() {
        try {
            if (f15233b == null) {
                f15233b = new Handler(Looper.getMainLooper());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f15233b;
    }

    private final void k(d dVar, final Exception exc, final Bitmap bitmap, final boolean z10) {
        Handler handlerJ;
        c cVarN = n(dVar);
        if (cVarN == null || cVarN.c()) {
            return;
        }
        final j0 j0VarA = cVarN.a();
        final j0.b bVarA = j0VarA != null ? j0VarA.a() : null;
        if (bVarA == null || (handlerJ = j()) == null) {
            return;
        }
        handlerJ.post(new Runnable() { // from class: com.facebook.internal.h0
            @Override // java.lang.Runnable
            public final void run() {
                i0.l(j0VarA, exc, z10, bitmap, bVarA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(j0 request, Exception exc, boolean z10, Bitmap bitmap, j0.b bVar) {
        kotlin.jvm.internal.s.h(request, "$request");
        bVar.a(new k0(request, exc, z10, bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(d dVar, boolean z10) {
        InputStream inputStreamB;
        Uri uriC;
        boolean z11 = false;
        if (!z10 || (uriC = z0.c(dVar.b())) == null) {
            inputStreamB = null;
        } else {
            inputStreamB = l0.b(uriC);
            if (inputStreamB != null) {
                z11 = true;
            }
        }
        if (!z11) {
            inputStreamB = l0.b(dVar.b());
        }
        if (inputStreamB != null) {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamB);
            e1.j(inputStreamB);
            k(dVar, null, bitmapDecodeStream, z11);
            return;
        }
        c cVarN = n(dVar);
        j0 j0VarA = cVarN != null ? cVarN.a() : null;
        if (cVarN == null || cVarN.c() || j0VarA == null) {
            return;
        }
        h(j0VarA, dVar);
    }

    private final c n(d dVar) {
        c cVar;
        Map map = f15236e;
        synchronized (map) {
            cVar = (c) map.remove(dVar);
        }
        return cVar;
    }
}
