package p9;

import android.util.SparseArray;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.w1;
import com.google.android.exoplayer2.x1;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface b {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f49596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h2 f49597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f49598c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.p.b f49599d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f49600e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final h2 f49601f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f49602g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.p.b f49603h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f49604i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f49605j;

        public a(long j10, h2 h2Var, int i10, com.google.android.exoplayer2.source.p.b bVar, long j11, h2 h2Var2, int i11, com.google.android.exoplayer2.source.p.b bVar2, long j12, long j13) {
            this.f49596a = j10;
            this.f49597b = h2Var;
            this.f49598c = i10;
            this.f49599d = bVar;
            this.f49600e = j11;
            this.f49601f = h2Var2;
            this.f49602g = i11;
            this.f49603h = bVar2;
            this.f49604i = j12;
            this.f49605j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f49596a == aVar.f49596a && this.f49598c == aVar.f49598c && this.f49600e == aVar.f49600e && this.f49602g == aVar.f49602g && this.f49604i == aVar.f49604i && this.f49605j == aVar.f49605j && sc.l.a(this.f49597b, aVar.f49597b) && sc.l.a(this.f49599d, aVar.f49599d) && sc.l.a(this.f49601f, aVar.f49601f) && sc.l.a(this.f49603h, aVar.f49603h)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return sc.l.b(Long.valueOf(this.f49596a), this.f49597b, Integer.valueOf(this.f49598c), this.f49599d, Long.valueOf(this.f49600e), this.f49601f, Integer.valueOf(this.f49602g), this.f49603h, Long.valueOf(this.f49604i), Long.valueOf(this.f49605j));
        }
    }

    /* JADX INFO: renamed from: p9.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0765b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ob.o f49606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray f49607b;

        public C0765b(ob.o oVar, SparseArray sparseArray) {
            this.f49606a = oVar;
            SparseArray sparseArray2 = new SparseArray(oVar.d());
            for (int i10 = 0; i10 < oVar.d(); i10++) {
                int iC = oVar.c(i10);
                sparseArray2.append(iC, (a) ob.a.e((a) sparseArray.get(iC)));
            }
            this.f49607b = sparseArray2;
        }

        public boolean a(int i10) {
            return this.f49606a.a(i10);
        }

        public int b(int i10) {
            return this.f49606a.c(i10);
        }

        public a c(int i10) {
            return (a) ob.a.e((a) this.f49607b.get(i10));
        }

        public int d() {
            return this.f49606a.d();
        }
    }

    void F(a aVar, s9.e eVar);

    void U(x1 x1Var, C0765b c0765b);

    void f(a aVar, ra.i iVar, ra.j jVar, IOException iOException, boolean z10);

    void k0(a aVar, x1.e eVar, x1.e eVar2, int i10);

    void n(a aVar, pb.z zVar);

    void q(a aVar, int i10, long j10, long j11);

    void y(a aVar, PlaybackException playbackException);

    void z(a aVar, ra.j jVar);

    default void K(a aVar) {
    }

    default void N(a aVar) {
    }

    default void T(a aVar) {
    }

    default void l(a aVar) {
    }

    default void m(a aVar) {
    }

    default void m0(a aVar) {
    }

    default void o(a aVar) {
    }

    default void A(a aVar, int i10) {
    }

    default void B(a aVar, com.google.android.exoplayer2.v0 v0Var) {
    }

    default void J(a aVar, com.google.android.exoplayer2.v0 v0Var) {
    }

    default void L(a aVar, boolean z10) {
    }

    default void O(a aVar, int i10) {
    }

    default void S(a aVar, String str) {
    }

    default void V(a aVar, boolean z10) {
    }

    default void Y(a aVar, x1.b bVar) {
    }

    default void Z(a aVar, float f10) {
    }

    default void a(a aVar, boolean z10) {
    }

    default void b(a aVar, Exception exc) {
    }

    default void b0(a aVar, s9.e eVar) {
    }

    default void c0(a aVar, ra.j jVar) {
    }

    default void d0(a aVar, String str) {
    }

    default void e(a aVar, boolean z10) {
    }

    default void f0(a aVar, int i10) {
    }

    default void g0(a aVar, Exception exc) {
    }

    default void h(a aVar, bb.f fVar) {
    }

    default void i(a aVar, s9.e eVar) {
    }

    default void i0(a aVar, int i10) {
    }

    default void j0(a aVar, long j10) {
    }

    default void l0(a aVar, s9.e eVar) {
    }

    default void n0(a aVar, PlaybackException playbackException) {
    }

    default void p(a aVar, i2 i2Var) {
    }

    default void p0(a aVar, w1 w1Var) {
    }

    default void q0(a aVar, lb.y yVar) {
    }

    default void r0(a aVar, int i10) {
    }

    default void s(a aVar, com.google.android.exoplayer2.z0 z0Var) {
    }

    default void s0(a aVar, Exception exc) {
    }

    default void t(a aVar, Exception exc) {
    }

    default void t0(a aVar, ha.a aVar2) {
    }

    default void u(a aVar, int i10) {
    }

    default void v(a aVar, com.google.android.exoplayer2.j jVar) {
    }

    default void w(a aVar, boolean z10) {
    }

    default void x(a aVar, List list) {
    }

    default void D(a aVar, ra.i iVar, ra.j jVar) {
    }

    default void E(a aVar, com.google.android.exoplayer2.v0 v0Var, s9.g gVar) {
    }

    default void M(a aVar, String str, long j10) {
    }

    default void P(a aVar, String str, long j10) {
    }

    default void Q(a aVar, boolean z10, int i10) {
    }

    default void R(a aVar, ra.i iVar, ra.j jVar) {
    }

    default void W(a aVar, long j10, int i10) {
    }

    default void c(a aVar, Object obj, long j10) {
    }

    default void e0(a aVar, int i10, long j10) {
    }

    default void g(a aVar, com.google.android.exoplayer2.v0 v0Var, s9.g gVar) {
    }

    default void h0(a aVar, boolean z10, int i10) {
    }

    default void k(a aVar, com.google.android.exoplayer2.y0 y0Var, int i10) {
    }

    default void o0(a aVar, ra.i iVar, ra.j jVar) {
    }

    default void r(a aVar, int i10, int i11) {
    }

    default void u0(a aVar, int i10, boolean z10) {
    }

    default void C(a aVar, String str, long j10, long j11) {
    }

    default void d(a aVar, String str, long j10, long j11) {
    }

    default void j(a aVar, int i10, long j10, long j11) {
    }

    default void X(a aVar, int i10, int i11, int i12, float f10) {
    }
}
