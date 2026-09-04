package y;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f57099h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    p f57102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    p f57103d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f57105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f57106g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57100a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f57101b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList f57104e = new ArrayList();

    m(p pVar, int i10) {
        this.f57102c = null;
        this.f57103d = null;
        int i11 = f57099h;
        this.f57105f = i11;
        f57099h = i11 + 1;
        this.f57102c = pVar;
        this.f57103d = pVar;
        this.f57106g = i10;
    }

    private long c(f fVar, long j10) {
        p pVar = fVar.f57075d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f57082k.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f57082k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f57075d != pVar) {
                    jMin = Math.min(jMin, c(fVar2, ((long) fVar2.f57077f) + j10));
                }
            }
        }
        if (fVar != pVar.f57132i) {
            return jMin;
        }
        long j11 = j10 - pVar.j();
        return Math.min(Math.min(jMin, c(pVar.f57131h, j11)), j11 - ((long) pVar.f57131h.f57077f));
    }

    private long d(f fVar, long j10) {
        p pVar = fVar.f57075d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f57082k.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f57082k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f57075d != pVar) {
                    jMax = Math.max(jMax, d(fVar2, ((long) fVar2.f57077f) + j10));
                }
            }
        }
        if (fVar != pVar.f57131h) {
            return jMax;
        }
        long j11 = j10 + pVar.j();
        return Math.max(Math.max(jMax, d(pVar.f57132i, j11)), j11 - ((long) pVar.f57132i.f57077f));
    }

    public void a(p pVar) {
        this.f57104e.add(pVar);
        this.f57103d = pVar;
    }

    public long b(x.f fVar, int i10) {
        long j10;
        int i11;
        p pVar = this.f57102c;
        if (pVar instanceof c) {
            if (((c) pVar).f57129f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i10 == 0 ? fVar.f56439e : fVar.f56441f).f57131h;
        f fVar3 = (i10 == 0 ? fVar.f56439e : fVar.f56441f).f57132i;
        boolean zContains = pVar.f57131h.f57083l.contains(fVar2);
        boolean zContains2 = this.f57102c.f57132i.f57083l.contains(fVar3);
        long j11 = this.f57102c.j();
        if (zContains && zContains2) {
            long jD = d(this.f57102c.f57131h, 0L);
            long jC = c(this.f57102c.f57132i, 0L);
            long j12 = jD - j11;
            p pVar2 = this.f57102c;
            int i12 = pVar2.f57132i.f57077f;
            if (j12 >= (-i12)) {
                j12 += (long) i12;
            }
            int i13 = pVar2.f57131h.f57077f;
            long j13 = ((-jC) - j11) - ((long) i13);
            if (j13 >= i13) {
                j13 -= (long) i13;
            }
            float fS = pVar2.f57125b.s(i10);
            float f10 = fS > 0.0f ? (long) ((j13 / fS) + (j12 / (1.0f - fS))) : 0L;
            long j14 = ((long) ((f10 * fS) + 0.5f)) + j11 + ((long) ((f10 * (1.0f - fS)) + 0.5f));
            p pVar3 = this.f57102c;
            j10 = ((long) pVar3.f57131h.f57077f) + j14;
            i11 = pVar3.f57132i.f57077f;
        } else {
            if (zContains) {
                f fVar4 = this.f57102c.f57131h;
                return Math.max(d(fVar4, fVar4.f57077f), ((long) this.f57102c.f57131h.f57077f) + j11);
            }
            if (zContains2) {
                f fVar5 = this.f57102c.f57132i;
                return Math.max(-c(fVar5, fVar5.f57077f), ((long) (-this.f57102c.f57132i.f57077f)) + j11);
            }
            p pVar4 = this.f57102c;
            j10 = ((long) pVar4.f57131h.f57077f) + pVar4.j();
            i11 = this.f57102c.f57132i.f57077f;
        }
        return j10 - ((long) i11);
    }
}
