package l1;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f43767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f43768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f43769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f43770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f43771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f43772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f43773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f43774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f43775i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f43776j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f43777k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f43778l;

    public /* synthetic */ t(long j10, long j11, long j12, c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, cVar);
    }

    private final float a(float f10) {
        if (f10 > e()) {
            return this.f43774h;
        }
        float f11 = this.f43777k;
        if (f10 > f11) {
            return (this.f43774h * (f10 - f11)) / (e() - this.f43777k);
        }
        return 0.0f;
    }

    private final d b(float f10, float f11, long j10, long j11, long j12, long j13, long j14, float f12) {
        long jE = p.e(p.j(j11, j10));
        long jK = p.k(j10, p.l(p.l(jE, f10), 1 + f11));
        long jG = j12;
        long jI = p.i(jG, p.b(p.k(j12, j13), 2.0f), f11);
        long jK2 = p.k(j14, p.l(y.c(p.g(jI) - p.g(j14), p.h(jI) - p.h(j14)), f12));
        androidx.collection.g gVarG = g(j11, jE, jK2, y.m(p.j(jK2, j14)));
        if (gVarG != null) {
            jG = gVarG.g();
        }
        return new d(jK, p.b(p.k(jK, p.l(jG, 2.0f)), 3.0f), jG, jK2, null);
    }

    private final androidx.collection.g g(long j10, long j11, long j12, long j13) {
        long jM = y.m(j13);
        float fD = p.d(j11, jM);
        if (Math.abs(fD) < 1.0E-4f) {
            return null;
        }
        float fD2 = p.d(p.j(j12, j10), jM);
        if (Math.abs(fD) < Math.abs(fD2) * 1.0E-4f) {
            return null;
        }
        return androidx.collection.g.a(p.k(j10, p.l(j11, fD2 / fD)));
    }

    public final long c() {
        return this.f43778l;
    }

    public final List d(float f10, float f11) {
        float fMin = Math.min(f10, f11);
        float f12 = this.f43777k;
        if (f12 < 1.0E-4f || fMin < 1.0E-4f || this.f43773g < 1.0E-4f) {
            long j10 = this.f43768b;
            this.f43778l = j10;
            return gl.r.e(d.f43740b.b(p.g(j10), p.h(this.f43768b), p.g(this.f43768b), p.h(this.f43768b)));
        }
        float fMin2 = Math.min(fMin, f12);
        float fA = a(f10);
        float fA2 = a(f11);
        float f13 = (this.f43773g * fMin2) / this.f43777k;
        this.f43778l = p.k(this.f43768b, p.l(p.e(p.b(p.k(this.f43771e, this.f43772f), 2.0f)), (float) Math.sqrt(y.n(f13) + y.n(fMin2))));
        long jK = p.k(this.f43768b, p.l(this.f43771e, fMin2));
        long jK2 = p.k(this.f43768b, p.l(this.f43772f, fMin2));
        d dVarB = b(fMin2, fA, this.f43768b, this.f43767a, jK, jK2, this.f43778l, f13);
        d dVarL = b(fMin2, fA2, this.f43768b, this.f43769c, jK2, jK, this.f43778l, f13).l();
        return gl.r.o(dVarB, d.f43740b.a(p.g(this.f43778l), p.h(this.f43778l), dVarB.d(), dVarB.e(), dVarL.b(), dVarL.c()), dVarL);
    }

    public final float e() {
        return (1 + this.f43774h) * this.f43777k;
    }

    public final float f() {
        return this.f43777k;
    }

    private t(long j10, long j11, long j12, c cVar) {
        this.f43767a = j10;
        this.f43768b = j11;
        this.f43769c = j12;
        this.f43770d = cVar;
        long jE = p.e(p.j(j10, j11));
        this.f43771e = jE;
        long jE2 = p.e(p.j(j12, j11));
        this.f43772f = jE2;
        float fA = cVar != null ? cVar.a() : 0.0f;
        this.f43773g = fA;
        this.f43774h = cVar != null ? cVar.b() : 0.0f;
        float fD = p.d(jE, jE2);
        this.f43775i = fD;
        float f10 = 1;
        float fSqrt = (float) Math.sqrt(f10 - y.n(fD));
        this.f43776j = fSqrt;
        this.f43777k = ((double) fSqrt) > 0.001d ? (fA * (fD + f10)) / fSqrt : 0.0f;
        this.f43778l = androidx.collection.g.b(0.0f, 0.0f);
    }
}
