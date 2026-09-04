package d6;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.k;
import com.bumptech.glide.l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q5.a f36226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f36227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f36228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final l f36229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u5.d f36230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f36231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f36233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private k f36234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f36235j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f36236k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f36237l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Bitmap f36238m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private r5.k f36239n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f36240o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f36241p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f36242q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f36243r;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a extends j6.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Handler f36244d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f36245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f36246f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bitmap f36247g;

        a(Handler handler, int i10, long j10) {
            this.f36244d = handler;
            this.f36245e = i10;
            this.f36246f = j10;
        }

        @Override // j6.i
        public void e(Drawable drawable) {
            this.f36247g = null;
        }

        Bitmap i() {
            return this.f36247g;
        }

        @Override // j6.i
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(Bitmap bitmap, k6.b bVar) {
            this.f36247g = bitmap;
            this.f36244d.sendMessageAtTime(this.f36244d.obtainMessage(1, this), this.f36246f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                g.this.m((a) message.obj);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            g.this.f36229d.m((a) message.obj);
            return false;
        }
    }

    g(com.bumptech.glide.c cVar, q5.a aVar, int i10, int i11, r5.k kVar, Bitmap bitmap) {
        this(cVar.h(), com.bumptech.glide.c.z(cVar.j()), aVar, null, i(com.bumptech.glide.c.z(cVar.j()), i10, i11), kVar, bitmap);
    }

    private static r5.e g() {
        return new l6.d(Double.valueOf(Math.random()));
    }

    private static k i(l lVar, int i10, int i11) {
        return lVar.j().b(((i6.f) ((i6.f) i6.f.p0(t5.a.f53131b).n0(true)).h0(true)).W(i10, i11));
    }

    private void l() {
        if (!this.f36231f || this.f36232g) {
            return;
        }
        if (this.f36233h) {
            m6.k.b(this.f36240o == null, "Pending target must be null when starting from the first frame");
            this.f36226a.f();
            this.f36233h = false;
        }
        a aVar = this.f36240o;
        if (aVar != null) {
            this.f36240o = null;
            m(aVar);
            return;
        }
        this.f36232g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.f36226a.e());
        this.f36226a.b();
        this.f36237l = new a(this.f36227b, this.f36226a.g(), jUptimeMillis);
        this.f36234i.b(i6.f.q0(g())).F0(this.f36226a).x0(this.f36237l);
    }

    private void n() {
        Bitmap bitmap = this.f36238m;
        if (bitmap != null) {
            this.f36230e.d(bitmap);
            this.f36238m = null;
        }
    }

    private void p() {
        if (this.f36231f) {
            return;
        }
        this.f36231f = true;
        this.f36236k = false;
        l();
    }

    private void q() {
        this.f36231f = false;
    }

    void a() {
        this.f36228c.clear();
        n();
        q();
        a aVar = this.f36235j;
        if (aVar != null) {
            this.f36229d.m(aVar);
            this.f36235j = null;
        }
        a aVar2 = this.f36237l;
        if (aVar2 != null) {
            this.f36229d.m(aVar2);
            this.f36237l = null;
        }
        a aVar3 = this.f36240o;
        if (aVar3 != null) {
            this.f36229d.m(aVar3);
            this.f36240o = null;
        }
        this.f36226a.clear();
        this.f36236k = true;
    }

    ByteBuffer b() {
        return this.f36226a.getData().asReadOnlyBuffer();
    }

    Bitmap c() {
        a aVar = this.f36235j;
        return aVar != null ? aVar.i() : this.f36238m;
    }

    int d() {
        a aVar = this.f36235j;
        if (aVar != null) {
            return aVar.f36245e;
        }
        return -1;
    }

    Bitmap e() {
        return this.f36238m;
    }

    int f() {
        return this.f36226a.c();
    }

    int h() {
        return this.f36243r;
    }

    int j() {
        return this.f36226a.h() + this.f36241p;
    }

    int k() {
        return this.f36242q;
    }

    void m(a aVar) {
        this.f36232g = false;
        if (this.f36236k) {
            this.f36227b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f36231f) {
            if (this.f36233h) {
                this.f36227b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f36240o = aVar;
                return;
            }
        }
        if (aVar.i() != null) {
            n();
            a aVar2 = this.f36235j;
            this.f36235j = aVar;
            for (int size = this.f36228c.size() - 1; size >= 0; size--) {
                ((b) this.f36228c.get(size)).a();
            }
            if (aVar2 != null) {
                this.f36227b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        l();
    }

    void o(r5.k kVar, Bitmap bitmap) {
        this.f36239n = (r5.k) m6.k.e(kVar);
        this.f36238m = (Bitmap) m6.k.e(bitmap);
        this.f36234i = this.f36234i.b(new i6.f().l0(kVar));
        this.f36241p = m6.l.h(bitmap);
        this.f36242q = bitmap.getWidth();
        this.f36243r = bitmap.getHeight();
    }

    void r(b bVar) {
        if (this.f36236k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f36228c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f36228c.isEmpty();
        this.f36228c.add(bVar);
        if (zIsEmpty) {
            p();
        }
    }

    void s(b bVar) {
        this.f36228c.remove(bVar);
        if (this.f36228c.isEmpty()) {
            q();
        }
    }

    g(u5.d dVar, l lVar, q5.a aVar, Handler handler, k kVar, r5.k kVar2, Bitmap bitmap) {
        this.f36228c = new ArrayList();
        this.f36229d = lVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f36230e = dVar;
        this.f36227b = handler;
        this.f36234i = kVar;
        this.f36226a = aVar;
        o(kVar2, bitmap);
    }
}
