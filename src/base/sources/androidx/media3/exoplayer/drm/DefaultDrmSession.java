package androidx.media3.exoplayer.drm;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import c2.x1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class DefaultDrmSession implements DrmSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f5162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f5163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f5164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f5165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f5166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f5167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f5168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w1.i f5169i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f5170j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final x1 f5171k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p f5172l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final UUID f5173m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Looper f5174n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e f5175o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f5176p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f5177q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private HandlerThread f5178r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f5179s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b2.b f5180t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private DrmSession.DrmSessionException f5181u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte[] f5182v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte[] f5183w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private m.a f5184x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private m.d f5185y;

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
        private boolean f5186a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            d dVar = (d) message.obj;
            if (!dVar.f5189b) {
                return false;
            }
            int i10 = dVar.f5192e + 1;
            dVar.f5192e = i10;
            if (i10 > DefaultDrmSession.this.f5170j.a(3)) {
                return false;
            }
            long jC = DefaultDrmSession.this.f5170j.c(new androidx.media3.exoplayer.upstream.b.a(new i2.i(dVar.f5188a, mediaDrmCallbackException.f5237a, mediaDrmCallbackException.f5238b, mediaDrmCallbackException.f5239c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f5190c, mediaDrmCallbackException.f5240d), new i2.j(3), mediaDrmCallbackException.getCause() instanceof IOException ? (IOException) mediaDrmCallbackException.getCause() : new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause()), dVar.f5192e));
            if (jC == C.TIME_UNSET) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f5186a) {
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
            obtainMessage(i10, new d(i2.i.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f5186a = true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objB;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 1) {
                    objB = DefaultDrmSession.this.f5172l.b(DefaultDrmSession.this.f5173m, (m.d) dVar.f5191d);
                } else {
                    if (i10 != 2) {
                        throw new RuntimeException();
                    }
                    objB = DefaultDrmSession.this.f5172l.a(DefaultDrmSession.this.f5173m, (m.a) dVar.f5191d);
                }
            } catch (MediaDrmCallbackException e10) {
                boolean zA = a(message, e10);
                objB = e10;
                if (zA) {
                    return;
                }
            } catch (Exception e11) {
                w1.n.i("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                objB = e11;
            }
            DefaultDrmSession.this.f5170j.b(dVar.f5188a);
            synchronized (this) {
                try {
                    if (!this.f5186a) {
                        DefaultDrmSession.this.f5175o.obtainMessage(message.what, Pair.create(dVar.f5191d, objB)).sendToTarget();
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
        public final long f5188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f5189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f5190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f5191d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5192e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f5188a = j10;
            this.f5189b = z10;
            this.f5190c = j11;
            this.f5191d = obj;
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
            if (i10 == 1) {
                DefaultDrmSession.this.B(obj, obj2);
            } else {
                if (i10 != 2) {
                    return;
                }
                DefaultDrmSession.this.v(obj, obj2);
            }
        }
    }

    public DefaultDrmSession(UUID uuid, m mVar, a aVar, b bVar, List list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap map, p pVar, Looper looper, androidx.media3.exoplayer.upstream.b bVar2, x1 x1Var) {
        if (i10 == 1 || i10 == 3) {
            w1.a.e(bArr);
        }
        this.f5173m = uuid;
        this.f5163c = aVar;
        this.f5164d = bVar;
        this.f5162b = mVar;
        this.f5165e = i10;
        this.f5166f = z10;
        this.f5167g = z11;
        if (bArr != null) {
            this.f5183w = bArr;
            this.f5161a = null;
        } else {
            this.f5161a = Collections.unmodifiableList((List) w1.a.e(list));
        }
        this.f5168h = map;
        this.f5172l = pVar;
        this.f5169i = new w1.i();
        this.f5170j = bVar2;
        this.f5171k = x1Var;
        this.f5176p = 2;
        this.f5174n = looper;
        this.f5175o = new e(looper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(Object obj, Object obj2) {
        if (obj == this.f5185y) {
            if (this.f5176p == 2 || t()) {
                this.f5185y = null;
                if (obj2 instanceof Exception) {
                    this.f5163c.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f5162b.provideProvisionResponse((byte[]) obj2);
                    this.f5163c.onProvisionCompleted();
                } catch (Exception e10) {
                    this.f5163c.a(e10, true);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    private boolean C() {
        if (t()) {
            return true;
        }
        try {
            byte[] bArrOpenSession = this.f5162b.openSession();
            this.f5182v = bArrOpenSession;
            this.f5162b.e(bArrOpenSession, this.f5171k);
            this.f5180t = this.f5162b.b(this.f5182v);
            final int i10 = 3;
            this.f5176p = 3;
            p(new w1.h() { // from class: androidx.media3.exoplayer.drm.b
                @Override // w1.h
                public final void accept(Object obj) {
                    ((h.a) obj).k(i10);
                }
            });
            w1.a.e(this.f5182v);
            return true;
        } catch (NotProvisionedException unused) {
            this.f5163c.b(this);
            return false;
        } catch (Exception e10) {
            e = e10;
            if (j.b(e)) {
                this.f5163c.b(this);
                return false;
            }
            u(e, 1);
            return false;
        } catch (NoSuchMethodError e11) {
            e = e11;
            if (j.b(e)) {
                this.f5163c.b(this);
                return false;
            }
            u(e, 1);
            return false;
        }
    }

    private void D(byte[] bArr, int i10, boolean z10) {
        try {
            this.f5184x = this.f5162b.d(bArr, this.f5161a, i10, this.f5168h);
            ((c) c0.h(this.f5179s)).b(2, w1.a.e(this.f5184x), z10);
        } catch (Exception | NoSuchMethodError e10) {
            w(e10, true);
        }
    }

    private boolean F() {
        try {
            this.f5162b.restoreKeys(this.f5182v, this.f5183w);
            return true;
        } catch (Exception | NoSuchMethodError e10) {
            u(e10, 1);
            return false;
        }
    }

    private void G() {
        if (Thread.currentThread() != this.f5174n.getThread()) {
            w1.n.i("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f5174n.getThread().getName(), new IllegalStateException());
        }
    }

    private void p(w1.h hVar) {
        Iterator it = this.f5169i.l().iterator();
        while (it.hasNext()) {
            hVar.accept((h.a) it.next());
        }
    }

    private void q(boolean z10) {
        if (this.f5167g) {
            return;
        }
        byte[] bArr = (byte[]) c0.h(this.f5182v);
        int i10 = this.f5165e;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                if (this.f5183w == null || F()) {
                    D(bArr, 2, z10);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            w1.a.e(this.f5183w);
            w1.a.e(this.f5182v);
            D(this.f5183w, 3, z10);
            return;
        }
        if (this.f5183w == null) {
            D(bArr, 1, z10);
            return;
        }
        if (this.f5176p == 4 || F()) {
            long jR = r();
            if (this.f5165e != 0 || jR > 60) {
                if (jR <= 0) {
                    u(new KeysExpiredException(), 2);
                    return;
                } else {
                    this.f5176p = 4;
                    p(new w1.h() { // from class: e2.c
                        @Override // w1.h
                        public final void accept(Object obj) {
                            ((androidx.media3.exoplayer.drm.h.a) obj).j();
                        }
                    });
                    return;
                }
            }
            w1.n.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jR);
            D(bArr, 2, z10);
        }
    }

    private long r() {
        if (!t1.e.f52666d.equals(this.f5173m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) w1.a.e(e2.p.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private boolean t() {
        int i10 = this.f5176p;
        return i10 == 3 || i10 == 4;
    }

    private void u(final Throwable th2, int i10) {
        this.f5181u = new DrmSession.DrmSessionException(th2, j.a(th2, i10));
        w1.n.d("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            p(new w1.h() { // from class: androidx.media3.exoplayer.drm.c
                @Override // w1.h
                public final void accept(Object obj) {
                    ((h.a) obj).l((Exception) th2);
                }
            });
        } else {
            if (!(th2 instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th2);
            }
            if (!j.c(th2) && !j.b(th2)) {
                throw ((Error) th2);
            }
        }
        if (this.f5176p != 4) {
            this.f5176p = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(Object obj, Object obj2) {
        if (obj == this.f5184x && t()) {
            this.f5184x = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                w((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f5165e == 3) {
                    this.f5162b.provideKeyResponse((byte[]) c0.h(this.f5183w), bArr);
                    p(new w1.h() { // from class: e2.a
                        @Override // w1.h
                        public final void accept(Object obj3) {
                            ((androidx.media3.exoplayer.drm.h.a) obj3).i();
                        }
                    });
                    return;
                }
                byte[] bArrProvideKeyResponse = this.f5162b.provideKeyResponse(this.f5182v, bArr);
                int i10 = this.f5165e;
                if ((i10 == 2 || (i10 == 0 && this.f5183w != null)) && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                    this.f5183w = bArrProvideKeyResponse;
                }
                this.f5176p = 4;
                p(new w1.h() { // from class: e2.b
                    @Override // w1.h
                    public final void accept(Object obj3) {
                        ((androidx.media3.exoplayer.drm.h.a) obj3).h();
                    }
                });
            } catch (Exception e10) {
                e = e10;
                w(e, true);
            } catch (NoSuchMethodError e11) {
                e = e11;
                w(e, true);
            }
        }
    }

    private void w(Throwable th2, boolean z10) {
        if ((th2 instanceof NotProvisionedException) || j.b(th2)) {
            this.f5163c.b(this);
        } else {
            u(th2, z10 ? 1 : 2);
        }
    }

    private void x() {
        if (this.f5165e == 0 && this.f5176p == 4) {
            c0.h(this.f5182v);
            q(false);
        }
    }

    void A(Exception exc, boolean z10) {
        u(exc, z10 ? 1 : 3);
    }

    void E() {
        this.f5185y = this.f5162b.getProvisionRequest();
        ((c) c0.h(this.f5179s)).b(1, w1.a.e(this.f5185y), true);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID a() {
        G();
        return this.f5173m;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean b() {
        G();
        return this.f5166f;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final b2.b c() {
        G();
        return this.f5180t;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean d(String str) {
        G();
        return this.f5162b.c((byte[]) w1.a.i(this.f5182v), str);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void f(h.a aVar) {
        G();
        if (this.f5177q < 0) {
            w1.n.c("DefaultDrmSession", "Session reference count less than zero: " + this.f5177q);
            this.f5177q = 0;
        }
        if (aVar != null) {
            this.f5169i.a(aVar);
        }
        int i10 = this.f5177q + 1;
        this.f5177q = i10;
        if (i10 == 1) {
            w1.a.g(this.f5176p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f5178r = handlerThread;
            handlerThread.start();
            this.f5179s = new c(this.f5178r.getLooper());
            if (C()) {
                q(true);
            }
        } else if (aVar != null && t() && this.f5169i.g0(aVar) == 1) {
            aVar.k(this.f5176p);
        }
        this.f5164d.a(this, this.f5177q);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void g(h.a aVar) {
        G();
        int i10 = this.f5177q;
        if (i10 <= 0) {
            w1.n.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f5177q = i11;
        if (i11 == 0) {
            this.f5176p = 0;
            ((e) c0.h(this.f5175o)).removeCallbacksAndMessages(null);
            ((c) c0.h(this.f5179s)).c();
            this.f5179s = null;
            ((HandlerThread) c0.h(this.f5178r)).quit();
            this.f5178r = null;
            this.f5180t = null;
            this.f5181u = null;
            this.f5184x = null;
            this.f5185y = null;
            byte[] bArr = this.f5182v;
            if (bArr != null) {
                this.f5162b.closeSession(bArr);
                this.f5182v = null;
            }
        }
        if (aVar != null) {
            this.f5169i.b(aVar);
            if (this.f5169i.g0(aVar) == 0) {
                aVar.m();
            }
        }
        this.f5164d.b(this, this.f5177q);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        G();
        if (this.f5176p == 1) {
            return this.f5181u;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        G();
        return this.f5176p;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public Map queryKeyStatus() {
        G();
        byte[] bArr = this.f5182v;
        if (bArr == null) {
            return null;
        }
        return this.f5162b.queryKeyStatus(bArr);
    }

    public boolean s(byte[] bArr) {
        G();
        return Arrays.equals(this.f5182v, bArr);
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
