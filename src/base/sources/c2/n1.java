package c2;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements w1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final sc.x f9388i = new sc.x() { // from class: c2.m1
        @Override // sc.x
        public final Object get() {
            return n1.m();
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Random f9389j = new Random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t1.a0.c f9390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t1.a0.b f9391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f9392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final sc.x f9393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private w1.a f9394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private t1.a0 f9395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f9396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f9397h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f9399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f9400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.media3.exoplayer.source.r.b f9401d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f9402e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f9403f;

        public a(String str, int i10, androidx.media3.exoplayer.source.r.b bVar) {
            this.f9398a = str;
            this.f9399b = i10;
            this.f9400c = bVar == null ? -1L : bVar.f6058d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f9401d = bVar;
        }

        private int l(t1.a0 a0Var, t1.a0 a0Var2, int i10) {
            if (i10 >= a0Var.p()) {
                if (i10 < a0Var2.p()) {
                    return i10;
                }
                return -1;
            }
            a0Var.n(i10, n1.this.f9390a);
            for (int i11 = n1.this.f9390a.f52549n; i11 <= n1.this.f9390a.f52550o; i11++) {
                int iB = a0Var2.b(a0Var.m(i11));
                if (iB != -1) {
                    return a0Var2.f(iB, n1.this.f9391b).f52521c;
                }
            }
            return -1;
        }

        public boolean i(int i10, androidx.media3.exoplayer.source.r.b bVar) {
            if (bVar == null) {
                return i10 == this.f9399b;
            }
            androidx.media3.exoplayer.source.r.b bVar2 = this.f9401d;
            if (bVar2 == null) {
                return !bVar.b() && bVar.f6058d == this.f9400c;
            }
            return bVar.f6058d == bVar2.f6058d && bVar.f6056b == bVar2.f6056b && bVar.f6057c == bVar2.f6057c;
        }

        public boolean j(b.a aVar) {
            androidx.media3.exoplayer.source.r.b bVar = aVar.f9284d;
            if (bVar == null) {
                return this.f9399b != aVar.f9283c;
            }
            long j10 = this.f9400c;
            if (j10 == -1) {
                return false;
            }
            if (bVar.f6058d > j10) {
                return true;
            }
            if (this.f9401d == null) {
                return false;
            }
            int iB = aVar.f9282b.b(bVar.f6055a);
            int iB2 = aVar.f9282b.b(this.f9401d.f6055a);
            androidx.media3.exoplayer.source.r.b bVar2 = aVar.f9284d;
            if (bVar2.f6058d < this.f9401d.f6058d || iB < iB2) {
                return false;
            }
            if (iB > iB2) {
                return true;
            }
            if (!bVar2.b()) {
                int i10 = aVar.f9284d.f6059e;
                return i10 == -1 || i10 > this.f9401d.f6056b;
            }
            androidx.media3.exoplayer.source.r.b bVar3 = aVar.f9284d;
            int i11 = bVar3.f6056b;
            int i12 = bVar3.f6057c;
            androidx.media3.exoplayer.source.r.b bVar4 = this.f9401d;
            int i13 = bVar4.f6056b;
            return i11 > i13 || (i11 == i13 && i12 > bVar4.f6057c);
        }

        public void k(int i10, androidx.media3.exoplayer.source.r.b bVar) {
            if (this.f9400c != -1 || i10 != this.f9399b || bVar == null || bVar.f6058d < n1.this.n()) {
                return;
            }
            this.f9400c = bVar.f6058d;
        }

        public boolean m(t1.a0 a0Var, t1.a0 a0Var2) {
            int iL = l(a0Var, a0Var2, this.f9399b);
            this.f9399b = iL;
            if (iL == -1) {
                return false;
            }
            androidx.media3.exoplayer.source.r.b bVar = this.f9401d;
            return bVar == null || a0Var2.b(bVar.f6055a) != -1;
        }
    }

    public n1() {
        this(f9388i);
    }

    private void l(a aVar) {
        if (aVar.f9400c != -1) {
            this.f9397h = aVar.f9400c;
        }
        this.f9396g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String m() {
        byte[] bArr = new byte[12];
        f9389j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long n() {
        a aVar = (a) this.f9392c.get(this.f9396g);
        return (aVar == null || aVar.f9400c == -1) ? this.f9397h + 1 : aVar.f9400c;
    }

    private a o(int i10, androidx.media3.exoplayer.source.r.b bVar) {
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : this.f9392c.values()) {
            aVar2.k(i10, bVar);
            if (aVar2.i(i10, bVar)) {
                long j11 = aVar2.f9400c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (j11 == j10 && ((a) w1.c0.h(aVar)).f9401d != null && aVar2.f9401d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = (String) this.f9393d.get();
        a aVar3 = new a(str, i10, bVar);
        this.f9392c.put(str, aVar3);
        return aVar3;
    }

    private void p(b.a aVar) {
        if (aVar.f9282b.q()) {
            String str = this.f9396g;
            if (str != null) {
                l((a) w1.a.e((a) this.f9392c.get(str)));
                return;
            }
            return;
        }
        a aVar2 = (a) this.f9392c.get(this.f9396g);
        a aVarO = o(aVar.f9283c, aVar.f9284d);
        this.f9396g = aVarO.f9398a;
        g(aVar);
        androidx.media3.exoplayer.source.r.b bVar = aVar.f9284d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.f9400c == aVar.f9284d.f6058d && aVar2.f9401d != null && aVar2.f9401d.f6056b == aVar.f9284d.f6056b && aVar2.f9401d.f6057c == aVar.f9284d.f6057c) {
            return;
        }
        androidx.media3.exoplayer.source.r.b bVar2 = aVar.f9284d;
        this.f9394e.l0(aVar, o(aVar.f9283c, new androidx.media3.exoplayer.source.r.b(bVar2.f6055a, bVar2.f6058d)).f9398a, aVarO.f9398a);
    }

    @Override // c2.w1
    public synchronized String a() {
        return this.f9396g;
    }

    @Override // c2.w1
    public synchronized String b(t1.a0 a0Var, androidx.media3.exoplayer.source.r.b bVar) {
        return o(a0Var.h(bVar.f6055a, this.f9391b).f52521c, bVar).f9398a;
    }

    @Override // c2.w1
    public void c(w1.a aVar) {
        this.f9394e = aVar;
    }

    @Override // c2.w1
    public synchronized void d(b.a aVar, int i10) {
        try {
            w1.a.e(this.f9394e);
            boolean z10 = i10 == 0;
            Iterator it = this.f9392c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2.j(aVar)) {
                    it.remove();
                    if (aVar2.f9402e) {
                        boolean zEquals = aVar2.f9398a.equals(this.f9396g);
                        boolean z11 = z10 && zEquals && aVar2.f9403f;
                        if (zEquals) {
                            l(aVar2);
                        }
                        this.f9394e.O(aVar, aVar2.f9398a, z11);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // c2.w1
    public synchronized void e(b.a aVar) {
        w1.a aVar2;
        try {
            String str = this.f9396g;
            if (str != null) {
                l((a) w1.a.e((a) this.f9392c.get(str)));
            }
            Iterator it = this.f9392c.values().iterator();
            while (it.hasNext()) {
                a aVar3 = (a) it.next();
                it.remove();
                if (aVar3.f9402e && (aVar2 = this.f9394e) != null) {
                    aVar2.O(aVar, aVar3.f9398a, false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // c2.w1
    public synchronized void f(b.a aVar) {
        try {
            w1.a.e(this.f9394e);
            t1.a0 a0Var = this.f9395f;
            this.f9395f = aVar.f9282b;
            Iterator it = this.f9392c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (!aVar2.m(a0Var, this.f9395f) || aVar2.j(aVar)) {
                    it.remove();
                    if (aVar2.f9402e) {
                        if (aVar2.f9398a.equals(this.f9396g)) {
                            l(aVar2);
                        }
                        this.f9394e.O(aVar, aVar2.f9398a, false);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // c2.w1
    public synchronized void g(b.a aVar) {
        w1.a.e(this.f9394e);
        if (aVar.f9282b.q()) {
            return;
        }
        androidx.media3.exoplayer.source.r.b bVar = aVar.f9284d;
        if (bVar != null) {
            if (bVar.f6058d < n()) {
                return;
            }
            a aVar2 = (a) this.f9392c.get(this.f9396g);
            if (aVar2 != null && aVar2.f9400c == -1 && aVar2.f9399b != aVar.f9283c) {
                return;
            }
        }
        a aVarO = o(aVar.f9283c, aVar.f9284d);
        if (this.f9396g == null) {
            this.f9396g = aVarO.f9398a;
        }
        androidx.media3.exoplayer.source.r.b bVar2 = aVar.f9284d;
        if (bVar2 != null && bVar2.b()) {
            androidx.media3.exoplayer.source.r.b bVar3 = aVar.f9284d;
            androidx.media3.exoplayer.source.r.b bVar4 = new androidx.media3.exoplayer.source.r.b(bVar3.f6055a, bVar3.f6058d, bVar3.f6056b);
            a aVarO2 = o(aVar.f9283c, bVar4);
            if (!aVarO2.f9402e) {
                aVarO2.f9402e = true;
                aVar.f9282b.h(aVar.f9284d.f6055a, this.f9391b);
                this.f9394e.i0(new b.a(aVar.f9281a, aVar.f9282b, aVar.f9283c, bVar4, Math.max(0L, w1.c0.c1(this.f9391b.f(aVar.f9284d.f6056b)) + this.f9391b.m()), aVar.f9286f, aVar.f9287g, aVar.f9288h, aVar.f9289i, aVar.f9290j), aVarO2.f9398a);
            }
        }
        if (!aVarO.f9402e) {
            aVarO.f9402e = true;
            this.f9394e.i0(aVar, aVarO.f9398a);
        }
        if (aVarO.f9398a.equals(this.f9396g) && !aVarO.f9403f) {
            aVarO.f9403f = true;
            this.f9394e.X(aVar, aVarO.f9398a);
        }
    }

    public n1(sc.x xVar) {
        this.f9393d = xVar;
        this.f9390a = new t1.a0.c();
        this.f9391b = new t1.a0.b();
        this.f9392c = new HashMap();
        this.f9395f = t1.a0.f52510a;
        this.f9397h = -1L;
    }
}
