package com.google.android.exoplayer2.drm;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.v0;
import com.google.common.collect.c0;
import com.google.common.collect.g0;
import com.google.common.collect.g1;
import com.google.common.collect.p1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import ob.r0;
import ob.u;
import ob.y;
import p9.s1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class DefaultDrmSessionManager implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final UUID f16795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n.c f16796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q f16797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap f16798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f16799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f16800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f16801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f16802j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.c f16803k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final g f16804l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f16805m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f16806n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set f16807o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Set f16808p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f16809q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private n f16810r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private DefaultDrmSession f16811s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private DefaultDrmSession f16812t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Looper f16813u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Handler f16814v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f16815w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private byte[] f16816x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private s1 f16817y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    volatile d f16818z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f16822d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f16824f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f16819a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private UUID f16820b = o9.b.f48265d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n.c f16821c = o.f16877d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.c f16825g = new com.google.android.exoplayer2.upstream.b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f16823e = new int[0];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f16826h = 300000;

        public DefaultDrmSessionManager a(q qVar) {
            return new DefaultDrmSessionManager(this.f16820b, this.f16821c, qVar, this.f16819a, this.f16822d, this.f16823e, this.f16824f, this.f16825g, this.f16826h);
        }

        public b b(boolean z10) {
            this.f16822d = z10;
            return this;
        }

        public b c(boolean z10) {
            this.f16824f = z10;
            return this;
        }

        public b d(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                ob.a.a(z10);
            }
            this.f16823e = (int[]) iArr.clone();
            return this;
        }

        public b e(UUID uuid, n.c cVar) {
            this.f16820b = (UUID) ob.a.e(uuid);
            this.f16821c = (n.c) ob.a.e(cVar);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class c implements n.b {
        private c() {
        }

        @Override // com.google.android.exoplayer2.drm.n.b
        public void a(n nVar, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) ob.a.e(DefaultDrmSessionManager.this.f16818z)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f16806n) {
                if (defaultDrmSession.s(bArr)) {
                    defaultDrmSession.y(message.what);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements j.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i.a f16829b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private DrmSession f16830c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f16831d;

        public e(i.a aVar) {
            this.f16829b = aVar;
        }

        public static /* synthetic */ void b(e eVar, v0 v0Var) {
            if (DefaultDrmSessionManager.this.f16809q == 0 || eVar.f16831d) {
                return;
            }
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            eVar.f16830c = defaultDrmSessionManager.t((Looper) ob.a.e(defaultDrmSessionManager.f16813u), eVar.f16829b, v0Var, false);
            DefaultDrmSessionManager.this.f16807o.add(eVar);
        }

        public static /* synthetic */ void c(e eVar) {
            if (eVar.f16831d) {
                return;
            }
            DrmSession drmSession = eVar.f16830c;
            if (drmSession != null) {
                drmSession.f(eVar.f16829b);
            }
            DefaultDrmSessionManager.this.f16807o.remove(eVar);
            eVar.f16831d = true;
        }

        public void d(final v0 v0Var) {
            ((Handler) ob.a.e(DefaultDrmSessionManager.this.f16814v)).post(new Runnable() { // from class: com.google.android.exoplayer2.drm.d
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDrmSessionManager.e.b(this.f16845a, v0Var);
                }
            });
        }

        @Override // com.google.android.exoplayer2.drm.j.b
        public void release() {
            r0.Q0((Handler) ob.a.e(DefaultDrmSessionManager.this.f16814v), new Runnable() { // from class: com.google.android.exoplayer2.drm.e
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDrmSessionManager.e.c(this.f16847a);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class f implements DefaultDrmSession.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f16833a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private DefaultDrmSession f16834b;

        public f() {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public void a(Exception exc, boolean z10) {
            this.f16834b = null;
            c0 c0VarX = c0.x(this.f16833a);
            this.f16833a.clear();
            p1 it = c0VarX.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).A(exc, z10);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public void b(DefaultDrmSession defaultDrmSession) {
            this.f16833a.add(defaultDrmSession);
            if (this.f16834b != null) {
                return;
            }
            this.f16834b = defaultDrmSession;
            defaultDrmSession.E();
        }

        public void c(DefaultDrmSession defaultDrmSession) {
            this.f16833a.remove(defaultDrmSession);
            if (this.f16834b == defaultDrmSession) {
                this.f16834b = null;
                if (this.f16833a.isEmpty()) {
                    return;
                }
                DefaultDrmSession defaultDrmSession2 = (DefaultDrmSession) this.f16833a.iterator().next();
                this.f16834b = defaultDrmSession2;
                defaultDrmSession2.E();
            }
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public void onProvisionCompleted() {
            this.f16834b = null;
            c0 c0VarX = c0.x(this.f16833a);
            this.f16833a.clear();
            p1 it = c0VarX.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g implements DefaultDrmSession.b {
        private g() {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.b
        public void a(DefaultDrmSession defaultDrmSession, int i10) {
            if (DefaultDrmSessionManager.this.f16805m != C.TIME_UNSET) {
                DefaultDrmSessionManager.this.f16808p.remove(defaultDrmSession);
                ((Handler) ob.a.e(DefaultDrmSessionManager.this.f16814v)).removeCallbacksAndMessages(defaultDrmSession);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.b
        public void b(final DefaultDrmSession defaultDrmSession, int i10) {
            if (i10 == 1 && DefaultDrmSessionManager.this.f16809q > 0 && DefaultDrmSessionManager.this.f16805m != C.TIME_UNSET) {
                DefaultDrmSessionManager.this.f16808p.add(defaultDrmSession);
                ((Handler) ob.a.e(DefaultDrmSessionManager.this.f16814v)).postAtTime(new Runnable() { // from class: com.google.android.exoplayer2.drm.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        defaultDrmSession.f(null);
                    }
                }, defaultDrmSession, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.f16805m);
            } else if (i10 == 0) {
                DefaultDrmSessionManager.this.f16806n.remove(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f16811s == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f16811s = null;
                }
                if (DefaultDrmSessionManager.this.f16812t == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f16812t = null;
                }
                DefaultDrmSessionManager.this.f16802j.c(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f16805m != C.TIME_UNSET) {
                    ((Handler) ob.a.e(DefaultDrmSessionManager.this.f16814v)).removeCallbacksAndMessages(defaultDrmSession);
                    DefaultDrmSessionManager.this.f16808p.remove(defaultDrmSession);
                }
            }
            DefaultDrmSessionManager.this.C();
        }
    }

    private DrmSession A(int i10, boolean z10) {
        n nVar = (n) ob.a.e(this.f16810r);
        if ((nVar.a() == 2 && t9.l.f53178d) || r0.F0(this.f16800h, i10) == -1 || nVar.a() == 1) {
            return null;
        }
        DefaultDrmSession defaultDrmSession = this.f16811s;
        if (defaultDrmSession == null) {
            DefaultDrmSession defaultDrmSessionX = x(c0.C(), true, null, z10);
            this.f16806n.add(defaultDrmSessionX);
            this.f16811s = defaultDrmSessionX;
        } else {
            defaultDrmSession.e(null);
        }
        return this.f16811s;
    }

    private void B(Looper looper) {
        if (this.f16818z == null) {
            this.f16818z = new d(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (this.f16810r != null && this.f16809q == 0 && this.f16806n.isEmpty() && this.f16807o.isEmpty()) {
            ((n) ob.a.e(this.f16810r)).release();
            this.f16810r = null;
        }
    }

    private void D() {
        p1 it = g0.v(this.f16808p).iterator();
        while (it.hasNext()) {
            ((DrmSession) it.next()).f(null);
        }
    }

    private void E() {
        p1 it = g0.v(this.f16807o).iterator();
        while (it.hasNext()) {
            ((e) it.next()).release();
        }
    }

    private void G(DrmSession drmSession, i.a aVar) {
        drmSession.f(aVar);
        if (this.f16805m != C.TIME_UNSET) {
            drmSession.f(null);
        }
    }

    private void H(boolean z10) {
        if (z10 && this.f16813u == null) {
            u.j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) ob.a.e(this.f16813u)).getThread()) {
            u.j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f16813u.getThread().getName(), new IllegalStateException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public DrmSession t(Looper looper, i.a aVar, v0 v0Var, boolean z10) {
        List listY;
        B(looper);
        h hVar = v0Var.f18871o;
        if (hVar == null) {
            return A(y.k(v0Var.f18868l), z10);
        }
        DefaultDrmSession defaultDrmSession = null;
        Object[] objArr = 0;
        if (this.f16816x == null) {
            listY = y((h) ob.a.e(hVar), this.f16795c, false);
            if (listY.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f16795c);
                u.d("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (aVar != null) {
                    aVar.l(missingSchemeDataException);
                }
                return new m(new DrmSession.DrmSessionException(missingSchemeDataException, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            listY = null;
        }
        if (this.f16799g) {
            for (DefaultDrmSession defaultDrmSession2 : this.f16806n) {
                if (r0.c(defaultDrmSession2.f16762a, listY)) {
                    defaultDrmSession = defaultDrmSession2;
                    break;
                }
            }
        } else {
            defaultDrmSession = this.f16812t;
        }
        if (defaultDrmSession != null) {
            defaultDrmSession.e(aVar);
            return defaultDrmSession;
        }
        DefaultDrmSession defaultDrmSessionX = x(listY, false, aVar, z10);
        if (!this.f16799g) {
            this.f16812t = defaultDrmSessionX;
        }
        this.f16806n.add(defaultDrmSessionX);
        return defaultDrmSessionX;
    }

    private static boolean u(DrmSession drmSession) {
        if (drmSession.getState() == 1) {
            return r0.f48425a < 19 || (((DrmSession.DrmSessionException) ob.a.e(drmSession.getError())).getCause() instanceof ResourceBusyException);
        }
        return false;
    }

    private boolean v(h hVar) {
        if (this.f16816x != null) {
            return true;
        }
        if (y(hVar, this.f16795c, true).isEmpty()) {
            if (hVar.f16857d != 1 || !hVar.f(0).e(o9.b.f48263b)) {
                return false;
            }
            u.i("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f16795c);
        }
        String str = hVar.f16856c;
        if (str == null || C.CENC_TYPE_cenc.equals(str)) {
            return true;
        }
        if (C.CENC_TYPE_cbcs.equals(str)) {
            return r0.f48425a >= 25;
        }
        return (C.CENC_TYPE_cbc1.equals(str) || C.CENC_TYPE_cens.equals(str)) ? false : true;
    }

    private DefaultDrmSession w(List list, boolean z10, i.a aVar) {
        ob.a.e(this.f16810r);
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.f16795c, this.f16810r, this.f16802j, this.f16804l, list, this.f16815w, this.f16801i | z10, z10, this.f16816x, this.f16798f, this.f16797e, (Looper) ob.a.e(this.f16813u), this.f16803k, (s1) ob.a.e(this.f16817y));
        defaultDrmSession.e(aVar);
        if (this.f16805m != C.TIME_UNSET) {
            defaultDrmSession.e(null);
        }
        return defaultDrmSession;
    }

    private DefaultDrmSession x(List list, boolean z10, i.a aVar, boolean z11) {
        DefaultDrmSession defaultDrmSessionW = w(list, z10, aVar);
        if (u(defaultDrmSessionW) && !this.f16808p.isEmpty()) {
            D();
            G(defaultDrmSessionW, aVar);
            defaultDrmSessionW = w(list, z10, aVar);
        }
        if (!u(defaultDrmSessionW) || !z11 || this.f16807o.isEmpty()) {
            return defaultDrmSessionW;
        }
        E();
        if (!this.f16808p.isEmpty()) {
            D();
        }
        G(defaultDrmSessionW, aVar);
        return w(list, z10, aVar);
    }

    private static List y(h hVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(hVar.f16857d);
        for (int i10 = 0; i10 < hVar.f16857d; i10++) {
            h.b bVarF = hVar.f(i10);
            if ((bVarF.e(uuid) || (o9.b.f48264c.equals(uuid) && bVarF.e(o9.b.f48263b))) && (bVarF.f16862e != null || z10)) {
                arrayList.add(bVarF);
            }
        }
        return arrayList;
    }

    private synchronized void z(Looper looper) {
        try {
            Looper looper2 = this.f16813u;
            if (looper2 == null) {
                this.f16813u = looper;
                this.f16814v = new Handler(looper);
            } else {
                ob.a.g(looper2 == looper);
                ob.a.e(this.f16814v);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void F(int i10, byte[] bArr) {
        ob.a.g(this.f16806n.isEmpty());
        if (i10 == 1 || i10 == 3) {
            ob.a.e(bArr);
        }
        this.f16815w = i10;
        this.f16816x = bArr;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public final void a() {
        H(true);
        int i10 = this.f16809q;
        this.f16809q = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f16810r == null) {
            n nVarA = this.f16796d.a(this.f16795c);
            this.f16810r = nVarA;
            nVarA.e(new c());
        } else if (this.f16805m != C.TIME_UNSET) {
            for (int i11 = 0; i11 < this.f16806n.size(); i11++) {
                ((DefaultDrmSession) this.f16806n.get(i11)).e(null);
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.j
    public int b(v0 v0Var) {
        H(false);
        int iA = ((n) ob.a.e(this.f16810r)).a();
        h hVar = v0Var.f18871o;
        if (hVar == null) {
            if (r0.F0(this.f16800h, y.k(v0Var.f18868l)) == -1) {
                return 0;
            }
        } else if (!v(hVar)) {
            return 1;
        }
        return iA;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public DrmSession c(i.a aVar, v0 v0Var) {
        H(false);
        ob.a.g(this.f16809q > 0);
        ob.a.i(this.f16813u);
        return t(this.f16813u, aVar, v0Var, true);
    }

    @Override // com.google.android.exoplayer2.drm.j
    public j.b d(i.a aVar, v0 v0Var) {
        ob.a.g(this.f16809q > 0);
        ob.a.i(this.f16813u);
        e eVar = new e(aVar);
        eVar.d(v0Var);
        return eVar;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public void e(Looper looper, s1 s1Var) {
        z(looper);
        this.f16817y = s1Var;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public final void release() {
        H(true);
        int i10 = this.f16809q - 1;
        this.f16809q = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f16805m != C.TIME_UNSET) {
            ArrayList arrayList = new ArrayList(this.f16806n);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((DefaultDrmSession) arrayList.get(i11)).f(null);
            }
        }
        E();
        C();
    }

    private DefaultDrmSessionManager(UUID uuid, n.c cVar, q qVar, HashMap map, boolean z10, int[] iArr, boolean z11, com.google.android.exoplayer2.upstream.c cVar2, long j10) {
        ob.a.e(uuid);
        ob.a.b(!o9.b.f48263b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f16795c = uuid;
        this.f16796d = cVar;
        this.f16797e = qVar;
        this.f16798f = map;
        this.f16799g = z10;
        this.f16800h = iArr;
        this.f16801i = z11;
        this.f16803k = cVar2;
        this.f16802j = new f();
        this.f16804l = new g();
        this.f16815w = 0;
        this.f16806n = new ArrayList();
        this.f16807o = g1.i();
        this.f16808p = g1.i();
        this.f16805m = j10;
    }
}
