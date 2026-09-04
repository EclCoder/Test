package p9;

import android.util.Base64;
import com.google.android.exoplayer2.h2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class p1 implements r1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final sc.x f49720i = new sc.x() { // from class: p9.o1
        @Override // sc.x
        public final Object get() {
            return p1.m();
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Random f49721j = new Random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h2.d f49722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h2.b f49723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f49724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final sc.x f49725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r1.a f49726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h2 f49727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f49728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f49729h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f49730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f49731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f49732c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.google.android.exoplayer2.source.p.b f49733d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f49734e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f49735f;

        public a(String str, int i10, com.google.android.exoplayer2.source.p.b bVar) {
            this.f49730a = str;
            this.f49731b = i10;
            this.f49732c = bVar == null ? -1L : bVar.f51202d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f49733d = bVar;
        }

        private int l(h2 h2Var, h2 h2Var2, int i10) {
            if (i10 >= h2Var.t()) {
                if (i10 < h2Var2.t()) {
                    return i10;
                }
                return -1;
            }
            h2Var.r(i10, p1.this.f49722a);
            for (int i11 = p1.this.f49722a.f17032o; i11 <= p1.this.f49722a.f17033p; i11++) {
                int iF = h2Var2.f(h2Var.q(i11));
                if (iF != -1) {
                    return h2Var2.j(iF, p1.this.f49723b).f17000c;
                }
            }
            return -1;
        }

        public boolean i(int i10, com.google.android.exoplayer2.source.p.b bVar) {
            if (bVar == null) {
                return i10 == this.f49731b;
            }
            com.google.android.exoplayer2.source.p.b bVar2 = this.f49733d;
            if (bVar2 == null) {
                return !bVar.b() && bVar.f51202d == this.f49732c;
            }
            return bVar.f51202d == bVar2.f51202d && bVar.f51200b == bVar2.f51200b && bVar.f51201c == bVar2.f51201c;
        }

        public boolean j(b.a aVar) {
            com.google.android.exoplayer2.source.p.b bVar = aVar.f49599d;
            if (bVar == null) {
                return this.f49731b != aVar.f49598c;
            }
            long j10 = this.f49732c;
            if (j10 == -1) {
                return false;
            }
            if (bVar.f51202d > j10) {
                return true;
            }
            if (this.f49733d == null) {
                return false;
            }
            int iF = aVar.f49597b.f(bVar.f51199a);
            int iF2 = aVar.f49597b.f(this.f49733d.f51199a);
            com.google.android.exoplayer2.source.p.b bVar2 = aVar.f49599d;
            if (bVar2.f51202d < this.f49733d.f51202d || iF < iF2) {
                return false;
            }
            if (iF > iF2) {
                return true;
            }
            if (!bVar2.b()) {
                int i10 = aVar.f49599d.f51203e;
                return i10 == -1 || i10 > this.f49733d.f51200b;
            }
            com.google.android.exoplayer2.source.p.b bVar3 = aVar.f49599d;
            int i11 = bVar3.f51200b;
            int i12 = bVar3.f51201c;
            com.google.android.exoplayer2.source.p.b bVar4 = this.f49733d;
            int i13 = bVar4.f51200b;
            return i11 > i13 || (i11 == i13 && i12 > bVar4.f51201c);
        }

        public void k(int i10, com.google.android.exoplayer2.source.p.b bVar) {
            if (this.f49732c != -1 || i10 != this.f49731b || bVar == null || bVar.f51202d < p1.this.n()) {
                return;
            }
            this.f49732c = bVar.f51202d;
        }

        public boolean m(h2 h2Var, h2 h2Var2) {
            int iL = l(h2Var, h2Var2, this.f49731b);
            this.f49731b = iL;
            if (iL == -1) {
                return false;
            }
            com.google.android.exoplayer2.source.p.b bVar = this.f49733d;
            return bVar == null || h2Var2.f(bVar.f51199a) != -1;
        }
    }

    public p1() {
        this(f49720i);
    }

    private void l(a aVar) {
        if (aVar.f49732c != -1) {
            this.f49729h = aVar.f49732c;
        }
        this.f49728g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String m() {
        byte[] bArr = new byte[12];
        f49721j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long n() {
        a aVar = (a) this.f49724c.get(this.f49728g);
        return (aVar == null || aVar.f49732c == -1) ? this.f49729h + 1 : aVar.f49732c;
    }

    private a o(int i10, com.google.android.exoplayer2.source.p.b bVar) {
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : this.f49724c.values()) {
            aVar2.k(i10, bVar);
            if (aVar2.i(i10, bVar)) {
                long j11 = aVar2.f49732c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (j11 == j10 && ((a) ob.r0.j(aVar)).f49733d != null && aVar2.f49733d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = (String) this.f49725d.get();
        a aVar3 = new a(str, i10, bVar);
        this.f49724c.put(str, aVar3);
        return aVar3;
    }

    private void p(b.a aVar) {
        if (aVar.f49597b.u()) {
            String str = this.f49728g;
            if (str != null) {
                l((a) ob.a.e((a) this.f49724c.get(str)));
                return;
            }
            return;
        }
        a aVar2 = (a) this.f49724c.get(this.f49728g);
        a aVarO = o(aVar.f49598c, aVar.f49599d);
        this.f49728g = aVarO.f49730a;
        e(aVar);
        com.google.android.exoplayer2.source.p.b bVar = aVar.f49599d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.f49732c == aVar.f49599d.f51202d && aVar2.f49733d != null && aVar2.f49733d.f51200b == aVar.f49599d.f51200b && aVar2.f49733d.f51201c == aVar.f49599d.f51201c) {
            return;
        }
        com.google.android.exoplayer2.source.p.b bVar2 = aVar.f49599d;
        this.f49726e.G(aVar, o(aVar.f49598c, new com.google.android.exoplayer2.source.p.b(bVar2.f51199a, bVar2.f51202d)).f49730a, aVarO.f49730a);
    }

    @Override // p9.r1
    public synchronized String a() {
        return this.f49728g;
    }

    @Override // p9.r1
    public void b(r1.a aVar) {
        this.f49726e = aVar;
    }

    @Override // p9.r1
    public synchronized void c(b.a aVar) {
        try {
            ob.a.e(this.f49726e);
            h2 h2Var = this.f49727f;
            this.f49727f = aVar.f49597b;
            Iterator it = this.f49724c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (!aVar2.m(h2Var, this.f49727f) || aVar2.j(aVar)) {
                    it.remove();
                    if (aVar2.f49734e) {
                        if (aVar2.f49730a.equals(this.f49728g)) {
                            l(aVar2);
                        }
                        this.f49726e.a0(aVar, aVar2.f49730a, false);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p9.r1
    public synchronized void d(b.a aVar, int i10) {
        try {
            ob.a.e(this.f49726e);
            boolean z10 = i10 == 0;
            Iterator it = this.f49724c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2.j(aVar)) {
                    it.remove();
                    if (aVar2.f49734e) {
                        boolean zEquals = aVar2.f49730a.equals(this.f49728g);
                        boolean z11 = z10 && zEquals && aVar2.f49735f;
                        if (zEquals) {
                            l(aVar2);
                        }
                        this.f49726e.a0(aVar, aVar2.f49730a, z11);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p9.r1
    public synchronized void e(b.a aVar) {
        ob.a.e(this.f49726e);
        if (aVar.f49597b.u()) {
            return;
        }
        com.google.android.exoplayer2.source.p.b bVar = aVar.f49599d;
        if (bVar != null) {
            if (bVar.f51202d < n()) {
                return;
            }
            a aVar2 = (a) this.f49724c.get(this.f49728g);
            if (aVar2 != null && aVar2.f49732c == -1 && aVar2.f49731b != aVar.f49598c) {
                return;
            }
        }
        a aVarO = o(aVar.f49598c, aVar.f49599d);
        if (this.f49728g == null) {
            this.f49728g = aVarO.f49730a;
        }
        com.google.android.exoplayer2.source.p.b bVar2 = aVar.f49599d;
        if (bVar2 != null && bVar2.b()) {
            com.google.android.exoplayer2.source.p.b bVar3 = aVar.f49599d;
            com.google.android.exoplayer2.source.p.b bVar4 = new com.google.android.exoplayer2.source.p.b(bVar3.f51199a, bVar3.f51202d, bVar3.f51200b);
            a aVarO2 = o(aVar.f49598c, bVar4);
            if (!aVarO2.f49734e) {
                aVarO2.f49734e = true;
                aVar.f49597b.l(aVar.f49599d.f51199a, this.f49723b);
                this.f49726e.I(new b.a(aVar.f49596a, aVar.f49597b, aVar.f49598c, bVar4, Math.max(0L, ob.r0.i1(this.f49723b.i(aVar.f49599d.f51200b)) + this.f49723b.p()), aVar.f49601f, aVar.f49602g, aVar.f49603h, aVar.f49604i, aVar.f49605j), aVarO2.f49730a);
            }
        }
        if (!aVarO.f49734e) {
            aVarO.f49734e = true;
            this.f49726e.I(aVar, aVarO.f49730a);
        }
        if (aVarO.f49730a.equals(this.f49728g) && !aVarO.f49735f) {
            aVarO.f49735f = true;
            this.f49726e.H(aVar, aVarO.f49730a);
        }
    }

    @Override // p9.r1
    public synchronized void f(b.a aVar) {
        r1.a aVar2;
        try {
            String str = this.f49728g;
            if (str != null) {
                l((a) ob.a.e((a) this.f49724c.get(str)));
            }
            Iterator it = this.f49724c.values().iterator();
            while (it.hasNext()) {
                a aVar3 = (a) it.next();
                it.remove();
                if (aVar3.f49734e && (aVar2 = this.f49726e) != null) {
                    aVar2.a0(aVar, aVar3.f49730a, false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p9.r1
    public synchronized String g(h2 h2Var, com.google.android.exoplayer2.source.p.b bVar) {
        return o(h2Var.l(bVar.f51199a, this.f49723b).f17000c, bVar).f49730a;
    }

    public p1(sc.x xVar) {
        this.f49725d = xVar;
        this.f49722a = new h2.d();
        this.f49723b = new h2.b();
        this.f49724c = new HashMap();
        this.f49727f = h2.f16987a;
        this.f49729h = -1L;
    }
}
