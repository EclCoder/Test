package androidx.media3.exoplayer.drm;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import c2.x1;
import com.facebook.ads.AdError;
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
import t1.v;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class DefaultDrmSessionManager implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UUID f5194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m.c f5195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p f5196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f5197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f5198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f5199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f5200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f f5201i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f5202j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final g f5203k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f5204l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f5205m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f5206n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set f5207o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f5208p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private m f5209q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private DefaultDrmSession f5210r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private DefaultDrmSession f5211s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Looper f5212t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Handler f5213u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f5214v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte[] f5215w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private x1 f5216x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    volatile d f5217y;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f5221d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f5218a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private UUID f5219b = t1.e.f52666d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private m.c f5220c = n.f5267d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f5222e = new int[0];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f5223f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f5224g = new androidx.media3.exoplayer.upstream.a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f5225h = 300000;

        public DefaultDrmSessionManager a(p pVar) {
            return new DefaultDrmSessionManager(this.f5219b, this.f5220c, pVar, this.f5218a, this.f5221d, this.f5222e, this.f5223f, this.f5224g, this.f5225h);
        }

        public b b(androidx.media3.exoplayer.upstream.b bVar) {
            this.f5224g = (androidx.media3.exoplayer.upstream.b) w1.a.e(bVar);
            return this;
        }

        public b c(boolean z10) {
            this.f5221d = z10;
            return this;
        }

        public b d(boolean z10) {
            this.f5223f = z10;
            return this;
        }

        public b e(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                w1.a.a(z10);
            }
            this.f5222e = (int[]) iArr.clone();
            return this;
        }

        public b f(UUID uuid, m.c cVar) {
            this.f5219b = (UUID) w1.a.e(uuid);
            this.f5220c = (m.c) w1.a.e(cVar);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class c implements m.b {
        private c() {
        }

        @Override // androidx.media3.exoplayer.drm.m.b
        public void a(m mVar, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) w1.a.e(DefaultDrmSessionManager.this.f5217y)).obtainMessage(i10, bArr).sendToTarget();
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
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f5205m) {
                if (defaultDrmSession.s(bArr)) {
                    defaultDrmSession.y(message.what);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements i.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h.a f5228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private DrmSession f5229c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f5230d;

        public e(h.a aVar) {
            this.f5228b = aVar;
        }

        public static /* synthetic */ void b(e eVar, t1.o oVar) {
            if (DefaultDrmSessionManager.this.f5208p == 0 || eVar.f5230d) {
                return;
            }
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            eVar.f5229c = defaultDrmSessionManager.t((Looper) w1.a.e(defaultDrmSessionManager.f5212t), eVar.f5228b, oVar, false);
            DefaultDrmSessionManager.this.f5206n.add(eVar);
        }

        public static /* synthetic */ void c(e eVar) {
            if (eVar.f5230d) {
                return;
            }
            DrmSession drmSession = eVar.f5229c;
            if (drmSession != null) {
                drmSession.g(eVar.f5228b);
            }
            DefaultDrmSessionManager.this.f5206n.remove(eVar);
            eVar.f5230d = true;
        }

        public void d(final t1.o oVar) {
            ((Handler) w1.a.e(DefaultDrmSessionManager.this.f5213u)).post(new Runnable() { // from class: androidx.media3.exoplayer.drm.d
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDrmSessionManager.e.b(this.f5244a, oVar);
                }
            });
        }

        @Override // androidx.media3.exoplayer.drm.i.b
        public void release() {
            c0.K0((Handler) w1.a.e(DefaultDrmSessionManager.this.f5213u), new Runnable() { // from class: androidx.media3.exoplayer.drm.e
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDrmSessionManager.e.c(this.f5246a);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class f implements DefaultDrmSession.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f5232a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private DefaultDrmSession f5233b;

        public f() {
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.a
        public void a(Exception exc, boolean z10) {
            this.f5233b = null;
            com.google.common.collect.c0 c0VarX = com.google.common.collect.c0.x(this.f5232a);
            this.f5232a.clear();
            p1 it = c0VarX.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).A(exc, z10);
            }
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.a
        public void b(DefaultDrmSession defaultDrmSession) {
            this.f5232a.add(defaultDrmSession);
            if (this.f5233b != null) {
                return;
            }
            this.f5233b = defaultDrmSession;
            defaultDrmSession.E();
        }

        public void c(DefaultDrmSession defaultDrmSession) {
            this.f5232a.remove(defaultDrmSession);
            if (this.f5233b == defaultDrmSession) {
                this.f5233b = null;
                if (this.f5232a.isEmpty()) {
                    return;
                }
                DefaultDrmSession defaultDrmSession2 = (DefaultDrmSession) this.f5232a.iterator().next();
                this.f5233b = defaultDrmSession2;
                defaultDrmSession2.E();
            }
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.a
        public void onProvisionCompleted() {
            this.f5233b = null;
            com.google.common.collect.c0 c0VarX = com.google.common.collect.c0.x(this.f5232a);
            this.f5232a.clear();
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

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.b
        public void a(DefaultDrmSession defaultDrmSession, int i10) {
            if (DefaultDrmSessionManager.this.f5204l != C.TIME_UNSET) {
                DefaultDrmSessionManager.this.f5207o.remove(defaultDrmSession);
                ((Handler) w1.a.e(DefaultDrmSessionManager.this.f5213u)).removeCallbacksAndMessages(defaultDrmSession);
            }
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.b
        public void b(final DefaultDrmSession defaultDrmSession, int i10) {
            if (i10 == 1 && DefaultDrmSessionManager.this.f5208p > 0 && DefaultDrmSessionManager.this.f5204l != C.TIME_UNSET) {
                DefaultDrmSessionManager.this.f5207o.add(defaultDrmSession);
                ((Handler) w1.a.e(DefaultDrmSessionManager.this.f5213u)).postAtTime(new Runnable() { // from class: androidx.media3.exoplayer.drm.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        defaultDrmSession.g(null);
                    }
                }, defaultDrmSession, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.f5204l);
            } else if (i10 == 0) {
                DefaultDrmSessionManager.this.f5205m.remove(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f5210r == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f5210r = null;
                }
                if (DefaultDrmSessionManager.this.f5211s == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f5211s = null;
                }
                DefaultDrmSessionManager.this.f5201i.c(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f5204l != C.TIME_UNSET) {
                    ((Handler) w1.a.e(DefaultDrmSessionManager.this.f5213u)).removeCallbacksAndMessages(defaultDrmSession);
                    DefaultDrmSessionManager.this.f5207o.remove(defaultDrmSession);
                }
            }
            DefaultDrmSessionManager.this.C();
        }
    }

    private DrmSession A(int i10, boolean z10) {
        m mVar = (m) w1.a.e(this.f5209q);
        if ((mVar.a() == 2 && e2.l.f37053d) || c0.C0(this.f5199g, i10) == -1 || mVar.a() == 1) {
            return null;
        }
        DefaultDrmSession defaultDrmSession = this.f5210r;
        if (defaultDrmSession == null) {
            DefaultDrmSession defaultDrmSessionX = x(com.google.common.collect.c0.C(), true, null, z10);
            this.f5205m.add(defaultDrmSessionX);
            this.f5210r = defaultDrmSessionX;
        } else {
            defaultDrmSession.f(null);
        }
        return this.f5210r;
    }

    private void B(Looper looper) {
        if (this.f5217y == null) {
            this.f5217y = new d(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (this.f5209q != null && this.f5208p == 0 && this.f5205m.isEmpty() && this.f5206n.isEmpty()) {
            ((m) w1.a.e(this.f5209q)).release();
            this.f5209q = null;
        }
    }

    private void D() {
        p1 it = g0.v(this.f5207o).iterator();
        while (it.hasNext()) {
            ((DrmSession) it.next()).g(null);
        }
    }

    private void E() {
        p1 it = g0.v(this.f5206n).iterator();
        while (it.hasNext()) {
            ((e) it.next()).release();
        }
    }

    private void G(DrmSession drmSession, h.a aVar) {
        drmSession.g(aVar);
        if (this.f5204l != C.TIME_UNSET) {
            drmSession.g(null);
        }
    }

    private void H(boolean z10) {
        if (z10 && this.f5212t == null) {
            w1.n.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) w1.a.e(this.f5212t)).getThread()) {
            w1.n.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f5212t.getThread().getName(), new IllegalStateException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public DrmSession t(Looper looper, h.a aVar, t1.o oVar, boolean z10) {
        List listY;
        B(looper);
        t1.k kVar = oVar.f52761r;
        if (kVar == null) {
            return A(v.f(oVar.f52757n), z10);
        }
        DefaultDrmSession defaultDrmSession = null;
        Object[] objArr = 0;
        if (this.f5215w == null) {
            listY = y((t1.k) w1.a.e(kVar), this.f5194b, false);
            if (listY.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f5194b);
                w1.n.d("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (aVar != null) {
                    aVar.l(missingSchemeDataException);
                }
                return new l(new DrmSession.DrmSessionException(missingSchemeDataException, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            listY = null;
        }
        if (this.f5198f) {
            for (DefaultDrmSession defaultDrmSession2 : this.f5205m) {
                if (c0.c(defaultDrmSession2.f5161a, listY)) {
                    defaultDrmSession = defaultDrmSession2;
                    break;
                }
            }
        } else {
            defaultDrmSession = this.f5211s;
        }
        if (defaultDrmSession != null) {
            defaultDrmSession.f(aVar);
            return defaultDrmSession;
        }
        DefaultDrmSession defaultDrmSessionX = x(listY, false, aVar, z10);
        if (!this.f5198f) {
            this.f5211s = defaultDrmSessionX;
        }
        this.f5205m.add(defaultDrmSessionX);
        return defaultDrmSessionX;
    }

    private static boolean u(DrmSession drmSession) {
        if (drmSession.getState() != 1) {
            return false;
        }
        Throwable cause = ((DrmSession.DrmSessionException) w1.a.e(drmSession.getError())).getCause();
        return (cause instanceof ResourceBusyException) || j.c(cause);
    }

    private boolean v(t1.k kVar) {
        if (this.f5215w != null) {
            return true;
        }
        if (y(kVar, this.f5194b, true).isEmpty()) {
            if (kVar.f52715d != 1 || !kVar.c(0).b(t1.e.f52664b)) {
                return false;
            }
            w1.n.h("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f5194b);
        }
        String str = kVar.f52714c;
        if (str == null || C.CENC_TYPE_cenc.equals(str)) {
            return true;
        }
        if (C.CENC_TYPE_cbcs.equals(str)) {
            return c0.f55769a >= 25;
        }
        return (C.CENC_TYPE_cbc1.equals(str) || C.CENC_TYPE_cens.equals(str)) ? false : true;
    }

    private DefaultDrmSession w(List list, boolean z10, h.a aVar) {
        w1.a.e(this.f5209q);
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.f5194b, this.f5209q, this.f5201i, this.f5203k, list, this.f5214v, this.f5200h | z10, z10, this.f5215w, this.f5197e, this.f5196d, (Looper) w1.a.e(this.f5212t), this.f5202j, (x1) w1.a.e(this.f5216x));
        defaultDrmSession.f(aVar);
        if (this.f5204l != C.TIME_UNSET) {
            defaultDrmSession.f(null);
        }
        return defaultDrmSession;
    }

    private DefaultDrmSession x(List list, boolean z10, h.a aVar, boolean z11) {
        DefaultDrmSession defaultDrmSessionW = w(list, z10, aVar);
        if (u(defaultDrmSessionW) && !this.f5207o.isEmpty()) {
            D();
            G(defaultDrmSessionW, aVar);
            defaultDrmSessionW = w(list, z10, aVar);
        }
        if (!u(defaultDrmSessionW) || !z11 || this.f5206n.isEmpty()) {
            return defaultDrmSessionW;
        }
        E();
        if (!this.f5207o.isEmpty()) {
            D();
        }
        G(defaultDrmSessionW, aVar);
        return w(list, z10, aVar);
    }

    private static List y(t1.k kVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(kVar.f52715d);
        for (int i10 = 0; i10 < kVar.f52715d; i10++) {
            t1.k.b bVarC = kVar.c(i10);
            if ((bVarC.b(uuid) || (t1.e.f52665c.equals(uuid) && bVarC.b(t1.e.f52664b))) && (bVarC.f52720e != null || z10)) {
                arrayList.add(bVarC);
            }
        }
        return arrayList;
    }

    private synchronized void z(Looper looper) {
        try {
            Looper looper2 = this.f5212t;
            if (looper2 == null) {
                this.f5212t = looper;
                this.f5213u = new Handler(looper);
            } else {
                w1.a.g(looper2 == looper);
                w1.a.e(this.f5213u);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void F(int i10, byte[] bArr) {
        w1.a.g(this.f5205m.isEmpty());
        if (i10 == 1 || i10 == 3) {
            w1.a.e(bArr);
        }
        this.f5214v = i10;
        this.f5215w = bArr;
    }

    @Override // androidx.media3.exoplayer.drm.i
    public final void a() {
        H(true);
        int i10 = this.f5208p;
        this.f5208p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f5209q == null) {
            m mVarA = this.f5195c.a(this.f5194b);
            this.f5209q = mVarA;
            mVarA.f(new c());
        } else if (this.f5204l != C.TIME_UNSET) {
            for (int i11 = 0; i11 < this.f5205m.size(); i11++) {
                ((DefaultDrmSession) this.f5205m.get(i11)).f(null);
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.i
    public int b(t1.o oVar) {
        H(false);
        int iA = ((m) w1.a.e(this.f5209q)).a();
        t1.k kVar = oVar.f52761r;
        if (kVar == null) {
            if (c0.C0(this.f5199g, v.f(oVar.f52757n)) == -1) {
                return 0;
            }
        } else if (!v(kVar)) {
            return 1;
        }
        return iA;
    }

    @Override // androidx.media3.exoplayer.drm.i
    public i.b c(h.a aVar, t1.o oVar) {
        w1.a.g(this.f5208p > 0);
        w1.a.i(this.f5212t);
        e eVar = new e(aVar);
        eVar.d(oVar);
        return eVar;
    }

    @Override // androidx.media3.exoplayer.drm.i
    public DrmSession d(h.a aVar, t1.o oVar) {
        H(false);
        w1.a.g(this.f5208p > 0);
        w1.a.i(this.f5212t);
        return t(this.f5212t, aVar, oVar, true);
    }

    @Override // androidx.media3.exoplayer.drm.i
    public void e(Looper looper, x1 x1Var) {
        z(looper);
        this.f5216x = x1Var;
    }

    @Override // androidx.media3.exoplayer.drm.i
    public final void release() {
        H(true);
        int i10 = this.f5208p - 1;
        this.f5208p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f5204l != C.TIME_UNSET) {
            ArrayList arrayList = new ArrayList(this.f5205m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((DefaultDrmSession) arrayList.get(i11)).g(null);
            }
        }
        E();
        C();
    }

    private DefaultDrmSessionManager(UUID uuid, m.c cVar, p pVar, HashMap map, boolean z10, int[] iArr, boolean z11, androidx.media3.exoplayer.upstream.b bVar, long j10) {
        w1.a.e(uuid);
        w1.a.b(!t1.e.f52664b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f5194b = uuid;
        this.f5195c = cVar;
        this.f5196d = pVar;
        this.f5197e = map;
        this.f5198f = z10;
        this.f5199g = iArr;
        this.f5200h = z11;
        this.f5202j = bVar;
        this.f5201i = new f();
        this.f5203k = new g();
        this.f5214v = 0;
        this.f5205m = new ArrayList();
        this.f5206n = g1.i();
        this.f5207o = g1.i();
        this.f5204l = j10;
    }
}
