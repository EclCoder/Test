package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.i;
import com.mbridge.msdk.thrid.okhttp.internal.http2.n;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final /* synthetic */ boolean f33174o = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.a f33175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f.a f33176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c0 f33177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f33178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.d f33179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f33180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f33181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f f33182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f33183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f33184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f33185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f33186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f33187m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okhttp.internal.http.c f33188n;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends WeakReference<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f33189a;

        a(g gVar, Object obj) {
            super(gVar);
            this.f33189a = obj;
        }
    }

    public g(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar, Object obj) {
        this.f33178d = iVar;
        this.f33175a = aVar;
        this.f33179e = dVar;
        this.f33180f = oVar;
        this.f33182h = new f(aVar, i(), dVar, oVar);
        this.f33181g = obj;
    }

    private Socket g() {
        if (!f33174o && !Thread.holdsLock(this.f33178d)) {
            throw new AssertionError();
        }
        c cVar = this.f33184j;
        if (cVar == null || !cVar.f33156k) {
            return null;
        }
        return a(false, false, true);
    }

    private d i() {
        return com.mbridge.msdk.thrid.okhttp.internal.a.f33105a.a(this.f33178d);
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http.c a(v vVar, t.a aVar, boolean z10) {
        try {
            com.mbridge.msdk.thrid.okhttp.internal.http.c cVarA = a(aVar.a(), aVar.b(), aVar.c(), vVar.t(), vVar.z(), z10).a(vVar, aVar, this);
            synchronized (this.f33178d) {
                this.f33188n = cVarA;
            }
            return cVarA;
        } catch (IOException e10) {
            throw new e(e10);
        }
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http.c b() {
        com.mbridge.msdk.thrid.okhttp.internal.http.c cVar;
        synchronized (this.f33178d) {
            cVar = this.f33188n;
        }
        return cVar;
    }

    public synchronized c c() {
        return this.f33184j;
    }

    public boolean d() {
        if (this.f33177c != null) {
            return true;
        }
        f.a aVar = this.f33176b;
        return (aVar != null && aVar.b()) || this.f33182h.a();
    }

    public void e() {
        c cVar;
        Socket socketA;
        synchronized (this.f33178d) {
            cVar = this.f33184j;
            socketA = a(true, false, false);
            if (this.f33184j != null) {
                cVar = null;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar != null) {
            this.f33180f.connectionReleased(this.f33179e, cVar);
        }
    }

    public void f() {
        c cVar;
        Socket socketA;
        synchronized (this.f33178d) {
            cVar = this.f33184j;
            socketA = a(false, true, false);
            if (this.f33184j != null) {
                cVar = null;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar != null) {
            com.mbridge.msdk.thrid.okhttp.internal.a.f33105a.a(this.f33179e, (IOException) null);
            this.f33180f.connectionReleased(this.f33179e, cVar);
            this.f33180f.callEnd(this.f33179e);
        }
    }

    public c0 h() {
        return this.f33177c;
    }

    public String toString() {
        c cVarC = c();
        return cVarC != null ? cVarC.toString() : this.f33175a.toString();
    }

    public Socket b(c cVar) {
        if (!f33174o && !Thread.holdsLock(this.f33178d)) {
            throw new AssertionError();
        }
        if (this.f33188n == null && this.f33184j.f33159n.size() == 1) {
            Reference<g> reference = this.f33184j.f33159n.get(0);
            Socket socketA = a(true, false, false);
            this.f33184j = cVar;
            cVar.f33159n.add(reference);
            return socketA;
        }
        throw new IllegalStateException();
    }

    private c a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws Throwable {
        while (true) {
            c cVarA = a(i10, i11, i12, i13, z10);
            boolean z12 = z10;
            int i14 = i13;
            int i15 = i12;
            int i16 = i11;
            int i17 = i10;
            synchronized (this.f33178d) {
                try {
                    if (cVarA.f33157l == 0 && !cVarA.f()) {
                        return cVarA;
                    }
                    if (cVarA.a(z11)) {
                        return cVarA;
                    }
                    e();
                    i10 = i17;
                    i11 = i16;
                    i12 = i15;
                    i13 = i14;
                    z10 = z12;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private c a(int i10, int i11, int i12, int i13, boolean z10) throws Throwable {
        c cVar;
        Socket socketG;
        c cVar2;
        Socket socketA;
        c0 c0VarC;
        boolean z11;
        boolean z12;
        c cVar3;
        f.a aVar;
        synchronized (this.f33178d) {
            try {
                if (!this.f33186l) {
                    if (this.f33188n == null) {
                        if (!this.f33187m) {
                            cVar = this.f33184j;
                            socketG = g();
                            cVar2 = this.f33184j;
                            socketA = null;
                            if (cVar2 != null) {
                                cVar = null;
                            } else {
                                cVar2 = null;
                            }
                            if (!this.f33185k) {
                                cVar = null;
                            }
                            if (cVar2 == null) {
                                com.mbridge.msdk.thrid.okhttp.internal.a.f33105a.a(this.f33178d, this.f33175a, this, null);
                                c cVar4 = this.f33184j;
                                if (cVar4 != null) {
                                    z11 = true;
                                    cVar2 = cVar4;
                                    c0VarC = null;
                                } else {
                                    c0VarC = this.f33177c;
                                }
                            } else {
                                c0VarC = null;
                            }
                            z11 = false;
                        } else {
                            throw new IOException("Canceled");
                        }
                    } else {
                        throw new IllegalStateException("codec != null");
                    }
                } else {
                    throw new IllegalStateException("released");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketG);
        if (cVar != null) {
            this.f33180f.connectionReleased(this.f33179e, cVar);
        }
        if (z11) {
            this.f33180f.connectionAcquired(this.f33179e, cVar2);
        }
        if (cVar2 != null) {
            this.f33177c = this.f33184j.c();
            return cVar2;
        }
        if (c0VarC != null || ((aVar = this.f33176b) != null && aVar.b())) {
            z12 = false;
        } else {
            this.f33176b = this.f33182h.c();
            z12 = true;
        }
        synchronized (this.f33178d) {
            try {
                if (this.f33187m) {
                    throw new IOException("Canceled");
                }
                if (z12) {
                    List<c0> listA = this.f33176b.a();
                    int size = listA.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        c0 c0Var = listA.get(i14);
                        com.mbridge.msdk.thrid.okhttp.internal.a.f33105a.a(this.f33178d, this.f33175a, this, c0Var);
                        c cVar5 = this.f33184j;
                        if (cVar5 != null) {
                            this.f33177c = c0Var;
                            z11 = true;
                            cVar2 = cVar5;
                            break;
                        }
                    }
                }
                if (!z11) {
                    if (c0VarC == null) {
                        c0VarC = this.f33176b.c();
                    }
                    this.f33177c = c0VarC;
                    this.f33183i = 0;
                    cVar2 = new c(this.f33178d, c0VarC);
                    a(cVar2, false);
                }
                cVar3 = cVar2;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z11) {
            this.f33180f.connectionAcquired(this.f33179e, cVar3);
            return cVar3;
        }
        cVar3.a(i10, i11, i12, i13, z10, this.f33179e, this.f33180f);
        i().a(cVar3.c());
        synchronized (this.f33178d) {
            try {
                this.f33185k = true;
                com.mbridge.msdk.thrid.okhttp.internal.a.f33105a.b(this.f33178d, cVar3);
                if (cVar3.f()) {
                    socketA = com.mbridge.msdk.thrid.okhttp.internal.a.f33105a.a(this.f33178d, this.f33175a, this);
                    cVar3 = this.f33184j;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        this.f33180f.connectionAcquired(this.f33179e, cVar3);
        return cVar3;
    }

    public void a(boolean z10, com.mbridge.msdk.thrid.okhttp.internal.http.c cVar, long j10, IOException iOException) {
        c cVar2;
        Socket socketA;
        boolean z11;
        this.f33180f.responseBodyEnd(this.f33179e, j10);
        synchronized (this.f33178d) {
            if (cVar != null) {
                try {
                    if (cVar == this.f33188n) {
                        if (!z10) {
                            this.f33184j.f33157l++;
                        }
                        cVar2 = this.f33184j;
                        socketA = a(z10, false, true);
                        if (this.f33184j != null) {
                            cVar2 = null;
                        }
                        z11 = this.f33186l;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            throw new IllegalStateException("expected " + this.f33188n + " but was " + cVar);
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar2 != null) {
            this.f33180f.connectionReleased(this.f33179e, cVar2);
        }
        if (iOException != null) {
            this.f33180f.callFailed(this.f33179e, com.mbridge.msdk.thrid.okhttp.internal.a.f33105a.a(this.f33179e, iOException));
        } else if (z11) {
            com.mbridge.msdk.thrid.okhttp.internal.a.f33105a.a(this.f33179e, (IOException) null);
            this.f33180f.callEnd(this.f33179e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    private Socket a(boolean z10, boolean z11, boolean z12) {
        Socket socketG;
        if (!f33174o && !Thread.holdsLock(this.f33178d)) {
            throw new AssertionError();
        }
        if (z12) {
            this.f33188n = null;
        }
        if (z11) {
            this.f33186l = true;
        }
        c cVar = this.f33184j;
        if (cVar != null) {
            if (z10) {
                cVar.f33156k = true;
            }
            if (this.f33188n == null && (this.f33186l || cVar.f33156k)) {
                a(cVar);
                if (this.f33184j.f33159n.isEmpty()) {
                    this.f33184j.f33160o = System.nanoTime();
                    if (com.mbridge.msdk.thrid.okhttp.internal.a.f33105a.a(this.f33178d, this.f33184j)) {
                        socketG = this.f33184j.g();
                    } else {
                        socketG = null;
                    }
                } else {
                    socketG = null;
                }
                this.f33184j = null;
                return socketG;
            }
        }
        return null;
    }

    public void a() {
        com.mbridge.msdk.thrid.okhttp.internal.http.c cVar;
        c cVar2;
        synchronized (this.f33178d) {
            this.f33187m = true;
            cVar = this.f33188n;
            cVar2 = this.f33184j;
        }
        if (cVar != null) {
            cVar.cancel();
        } else if (cVar2 != null) {
            cVar2.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0048  */
    public void a(IOException iOException) {
        c cVar;
        boolean z10;
        Socket socketA;
        synchronized (this.f33178d) {
            try {
                cVar = null;
                if (iOException instanceof n) {
                    com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar = ((n) iOException).f33425a;
                    if (bVar == com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM) {
                        int i10 = this.f33183i + 1;
                        this.f33183i = i10;
                        if (i10 > 1) {
                            this.f33177c = null;
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else if (bVar != com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL) {
                        this.f33177c = null;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    c cVar2 = this.f33184j;
                    if (cVar2 == null || (cVar2.f() && !(iOException instanceof com.mbridge.msdk.thrid.okhttp.internal.http2.a))) {
                        z10 = false;
                    } else {
                        if (this.f33184j.f33157l == 0) {
                            c0 c0Var = this.f33177c;
                            if (c0Var != null && iOException != null) {
                                this.f33182h.a(c0Var, iOException);
                            }
                            this.f33177c = null;
                        }
                        z10 = true;
                    }
                }
                c cVar3 = this.f33184j;
                socketA = a(z10, false, true);
                if (this.f33184j == null && this.f33185k) {
                    cVar = cVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar != null) {
            this.f33180f.connectionReleased(this.f33179e, cVar);
        }
    }

    public void a(c cVar, boolean z10) {
        if (!f33174o && !Thread.holdsLock(this.f33178d)) {
            throw new AssertionError();
        }
        if (this.f33184j == null) {
            this.f33184j = cVar;
            this.f33185k = z10;
            cVar.f33159n.add(new a(this, this.f33181g));
            return;
        }
        throw new IllegalStateException();
    }

    private void a(c cVar) {
        int size = cVar.f33159n.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (cVar.f33159n.get(i10).get() == this) {
                cVar.f33159n.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }
}
