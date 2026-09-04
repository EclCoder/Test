package com.google.android.exoplayer2.drm;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import ob.r0;
import ob.u;
import p9.s1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class DefaultDrmSession implements DrmSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f16763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f16764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f16765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f16766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f16767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f16768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f16769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ob.i f16770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.c f16771j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final s1 f16772k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final q f16773l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final UUID f16774m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Looper f16775n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e f16776o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f16777p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f16778q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private HandlerThread f16779r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f16780s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private s9.b f16781t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private DrmSession.DrmSessionException f16782u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte[] f16783v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte[] f16784w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private n.a f16785x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private n.d f16786y;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th2) {
            super(th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(Exception exc, boolean z10);

        void b(DefaultDrmSession defaultDrmSession);

        void onProvisionCompleted();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(DefaultDrmSession defaultDrmSession, int i10);

        void b(DefaultDrmSession defaultDrmSession, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f16787a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            d dVar = (d) message.obj;
            if (!dVar.f16790b) {
                return false;
            }
            int i10 = dVar.f16793e + 1;
            dVar.f16793e = i10;
            if (i10 > DefaultDrmSession.this.f16771j.a(3)) {
                return false;
            }
            long jC = DefaultDrmSession.this.f16771j.c(new com.google.android.exoplayer2.upstream.c.C0294c(new ra.i(dVar.f16789a, mediaDrmCallbackException.f16838a, mediaDrmCallbackException.f16839b, mediaDrmCallbackException.f16840c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f16791c, mediaDrmCallbackException.f16841d), new ra.j(3), mediaDrmCallbackException.getCause() instanceof IOException ? (IOException) mediaDrmCallbackException.getCause() : new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause()), dVar.f16793e));
            if (jC == C.TIME_UNSET) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f16787a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), jC);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(ra.i.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f16787a = true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objA;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 0) {
                    objA = DefaultDrmSession.this.f16773l.a(DefaultDrmSession.this.f16774m, (n.d) dVar.f16792d);
                } else {
                    if (i10 != 1) {
                        throw new RuntimeException();
                    }
                    objA = DefaultDrmSession.this.f16773l.b(DefaultDrmSession.this.f16774m, (n.a) dVar.f16792d);
                }
            } catch (MediaDrmCallbackException e10) {
                boolean zA = a(message, e10);
                objA = e10;
                if (zA) {
                    return;
                }
            } catch (Exception e11) {
                u.j("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                objA = e11;
            }
            DefaultDrmSession.this.f16771j.b(dVar.f16789a);
            synchronized (this) {
                try {
                    if (!this.f16787a) {
                        DefaultDrmSession.this.f16776o.obtainMessage(message.what, Pair.create(dVar.f16792d, objA)).sendToTarget();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f16789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f16790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f16791c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f16792d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f16793e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f16789a = j10;
            this.f16790b = z10;
            this.f16791c = j11;
            this.f16792d = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                DefaultDrmSession.this.B(obj, obj2);
            } else {
                if (i10 != 1) {
                    return;
                }
                DefaultDrmSession.this.v(obj, obj2);
            }
        }
    }

    public DefaultDrmSession(UUID uuid, n nVar, a aVar, b bVar, List list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap map, q qVar, Looper looper, com.google.android.exoplayer2.upstream.c cVar, s1 s1Var) {
        if (i10 == 1 || i10 == 3) {
            ob.a.e(bArr);
        }
        this.f16774m = uuid;
        this.f16764c = aVar;
        this.f16765d = bVar;
        this.f16763b = nVar;
        this.f16766e = i10;
        this.f16767f = z10;
        this.f16768g = z11;
        if (bArr != null) {
            this.f16784w = bArr;
            this.f16762a = null;
        } else {
            this.f16762a = Collections.unmodifiableList((List) ob.a.e(list));
        }
        this.f16769h = map;
        this.f16773l = qVar;
        this.f16770i = new ob.i();
        this.f16771j = cVar;
        this.f16772k = s1Var;
        this.f16777p = 2;
        this.f16775n = looper;
        this.f16776o = new e(looper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(Object obj, Object obj2) {
        if (obj == this.f16786y) {
            if (this.f16777p == 2 || t()) {
                this.f16786y = null;
                if (obj2 instanceof Exception) {
                    this.f16764c.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f16763b.provideProvisionResponse((byte[]) obj2);
                    this.f16764c.onProvisionCompleted();
                } catch (Exception e10) {
                    this.f16764c.a(e10, true);
                }
            }
        }
    }

    private boolean C() {
        if (t()) {
            return true;
        }
        try {
            byte[] bArrOpenSession = this.f16763b.openSession();
            this.f16783v = bArrOpenSession;
            this.f16763b.f(bArrOpenSession, this.f16772k);
            this.f16781t = this.f16763b.b(this.f16783v);
            final int i10 = 3;
            this.f16777p = 3;
            p(new ob.h() { // from class: com.google.android.exoplayer2.drm.b
                @Override // ob.h
                public final void accept(Object obj) {
                    ((i.a) obj).k(i10);
                }
            });
            ob.a.e(this.f16783v);
            return true;
        } catch (NotProvisionedException unused) {
            this.f16764c.b(this);
            return false;
        } catch (Exception e10) {
            u(e10, 1);
            return false;
        }
    }

    private void D(byte[] bArr, int i10, boolean z10) {
        try {
            this.f16785x = this.f16763b.d(bArr, this.f16762a, i10, this.f16769h);
            ((c) r0.j(this.f16780s)).b(1, ob.a.e(this.f16785x), z10);
        } catch (Exception e10) {
            w(e10, true);
        }
    }

    private boolean F() {
        try {
            this.f16763b.restoreKeys(this.f16783v, this.f16784w);
            return true;
        } catch (Exception e10) {
            u(e10, 1);
            return false;
        }
    }

    private void G() {
        if (Thread.currentThread() != this.f16775n.getThread()) {
            u.j("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f16775n.getThread().getName(), new IllegalStateException());
        }
    }

    private void p(ob.h hVar) {
        Iterator it = this.f16770i.l().iterator();
        while (it.hasNext()) {
            hVar.accept((i.a) it.next());
        }
    }

    private void q(boolean z10) {
        if (this.f16768g) {
            return;
        }
        byte[] bArr = (byte[]) r0.j(this.f16783v);
        int i10 = this.f16766e;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                if (this.f16784w == null || F()) {
                    D(bArr, 2, z10);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            ob.a.e(this.f16784w);
            ob.a.e(this.f16783v);
            D(this.f16784w, 3, z10);
            return;
        }
        if (this.f16784w == null) {
            D(bArr, 1, z10);
            return;
        }
        if (this.f16777p == 4 || F()) {
            long jR = r();
            if (this.f16766e != 0 || jR > 60) {
                if (jR <= 0) {
                    u(new KeysExpiredException(), 2);
                    return;
                } else {
                    this.f16777p = 4;
                    p(new ob.h() { // from class: t9.a
                        @Override // ob.h
                        public final void accept(Object obj) {
                            ((com.google.android.exoplayer2.drm.i.a) obj).j();
                        }
                    });
                    return;
                }
            }
            u.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jR);
            D(bArr, 2, z10);
        }
    }

    private long r() {
        if (!o9.b.f48265d.equals(this.f16774m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) ob.a.e(t9.o.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private boolean t() {
        int i10 = this.f16777p;
        return i10 == 3 || i10 == 4;
    }

    private void u(final Exception exc, int i10) {
        this.f16782u = new DrmSession.DrmSessionException(exc, k.a(exc, i10));
        u.d("DefaultDrmSession", "DRM session error", exc);
        p(new ob.h() { // from class: com.google.android.exoplayer2.drm.c
            @Override // ob.h
            public final void accept(Object obj) {
                ((i.a) obj).l(exc);
            }
        });
        if (this.f16777p != 4) {
            this.f16777p = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(Object obj, Object obj2) {
        if (obj == this.f16785x && t()) {
            this.f16785x = null;
            if (obj2 instanceof Exception) {
                w((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f16766e == 3) {
                    this.f16763b.provideKeyResponse((byte[]) r0.j(this.f16784w), bArr);
                    p(new ob.h() { // from class: t9.b
                        @Override // ob.h
                        public final void accept(Object obj3) {
                            ((com.google.android.exoplayer2.drm.i.a) obj3).i();
                        }
                    });
                    return;
                }
                byte[] bArrProvideKeyResponse = this.f16763b.provideKeyResponse(this.f16783v, bArr);
                int i10 = this.f16766e;
                if ((i10 == 2 || (i10 == 0 && this.f16784w != null)) && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                    this.f16784w = bArrProvideKeyResponse;
                }
                this.f16777p = 4;
                p(new ob.h() { // from class: t9.c
                    @Override // ob.h
                    public final void accept(Object obj3) {
                        ((com.google.android.exoplayer2.drm.i.a) obj3).h();
                    }
                });
            } catch (Exception e10) {
                w(e10, true);
            }
        }
    }

    private void w(Exception exc, boolean z10) {
        if (exc instanceof NotProvisionedException) {
            this.f16764c.b(this);
        } else {
            u(exc, z10 ? 1 : 2);
        }
    }

    private void x() {
        if (this.f16766e == 0 && this.f16777p == 4) {
            r0.j(this.f16783v);
            q(false);
        }
    }

    void A(Exception exc, boolean z10) {
        u(exc, z10 ? 1 : 3);
    }

    void E() {
        this.f16786y = this.f16763b.getProvisionRequest();
        ((c) r0.j(this.f16780s)).b(0, ob.a.e(this.f16786y), true);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID a() {
        G();
        return this.f16774m;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean b() {
        G();
        return this.f16767f;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final s9.b c() {
        G();
        return this.f16781t;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean d(String str) {
        G();
        return this.f16763b.c((byte[]) ob.a.i(this.f16783v), str);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void e(i.a aVar) {
        G();
        if (this.f16778q < 0) {
            u.c("DefaultDrmSession", "Session reference count less than zero: " + this.f16778q);
            this.f16778q = 0;
        }
        if (aVar != null) {
            this.f16770i.a(aVar);
        }
        int i10 = this.f16778q + 1;
        this.f16778q = i10;
        if (i10 == 1) {
            ob.a.g(this.f16777p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f16779r = handlerThread;
            handlerThread.start();
            this.f16780s = new c(this.f16779r.getLooper());
            if (C()) {
                q(true);
            }
        } else if (aVar != null && t() && this.f16770i.g0(aVar) == 1) {
            aVar.k(this.f16777p);
        }
        this.f16765d.a(this, this.f16778q);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void f(i.a aVar) {
        G();
        int i10 = this.f16778q;
        if (i10 <= 0) {
            u.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f16778q = i11;
        if (i11 == 0) {
            this.f16777p = 0;
            ((e) r0.j(this.f16776o)).removeCallbacksAndMessages(null);
            ((c) r0.j(this.f16780s)).c();
            this.f16780s = null;
            ((HandlerThread) r0.j(this.f16779r)).quit();
            this.f16779r = null;
            this.f16781t = null;
            this.f16782u = null;
            this.f16785x = null;
            this.f16786y = null;
            byte[] bArr = this.f16783v;
            if (bArr != null) {
                this.f16763b.closeSession(bArr);
                this.f16783v = null;
            }
        }
        if (aVar != null) {
            this.f16770i.b(aVar);
            if (this.f16770i.g0(aVar) == 0) {
                aVar.m();
            }
        }
        this.f16765d.b(this, this.f16778q);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        G();
        if (this.f16777p == 1) {
            return this.f16782u;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        G();
        return this.f16777p;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public Map queryKeyStatus() {
        G();
        byte[] bArr = this.f16783v;
        if (bArr == null) {
            return null;
        }
        return this.f16763b.queryKeyStatus(bArr);
    }

    public boolean s(byte[] bArr) {
        G();
        return Arrays.equals(this.f16783v, bArr);
    }

    void y(int i10) {
        if (i10 != 2) {
            return;
        }
        x();
    }

    void z() {
        if (C()) {
            q(true);
        }
    }
}
