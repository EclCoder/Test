package c2;

import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f9281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t1.a0 f9282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.r.b f9284d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f9285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final t1.a0 f9286f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f9287g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.r.b f9288h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f9289i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f9290j;

        public a(long j10, t1.a0 a0Var, int i10, androidx.media3.exoplayer.source.r.b bVar, long j11, t1.a0 a0Var2, int i11, androidx.media3.exoplayer.source.r.b bVar2, long j12, long j13) {
            this.f9281a = j10;
            this.f9282b = a0Var;
            this.f9283c = i10;
            this.f9284d = bVar;
            this.f9285e = j11;
            this.f9286f = a0Var2;
            this.f9287g = i11;
            this.f9288h = bVar2;
            this.f9289i = j12;
            this.f9290j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f9281a == aVar.f9281a && this.f9283c == aVar.f9283c && this.f9285e == aVar.f9285e && this.f9287g == aVar.f9287g && this.f9289i == aVar.f9289i && this.f9290j == aVar.f9290j && sc.l.a(this.f9282b, aVar.f9282b) && sc.l.a(this.f9284d, aVar.f9284d) && sc.l.a(this.f9286f, aVar.f9286f) && sc.l.a(this.f9288h, aVar.f9288h)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return sc.l.b(Long.valueOf(this.f9281a), this.f9282b, Integer.valueOf(this.f9283c), this.f9284d, Long.valueOf(this.f9285e), this.f9286f, Integer.valueOf(this.f9287g), this.f9288h, Long.valueOf(this.f9289i), Long.valueOf(this.f9290j));
        }
    }

    /* JADX INFO: renamed from: c2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0124b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t1.n f9291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray f9292b;

        public C0124b(t1.n nVar, SparseArray sparseArray) {
            this.f9291a = nVar;
            SparseArray sparseArray2 = new SparseArray(nVar.c());
            for (int i10 = 0; i10 < nVar.c(); i10++) {
                int iB = nVar.b(i10);
                sparseArray2.append(iB, (a) w1.a.e((a) sparseArray.get(iB)));
            }
            this.f9292b = sparseArray2;
        }

        public boolean a(int i10) {
            return this.f9291a.a(i10);
        }

        public int b(int i10) {
            return this.f9291a.b(i10);
        }

        public a c(int i10) {
            return (a) w1.a.e((a) this.f9292b.get(i10));
        }

        public int d() {
            return this.f9291a.c();
        }
    }

    void Q(a aVar, PlaybackException playbackException);

    void W(a aVar, t1.g0 g0Var);

    void a0(a aVar, androidx.media3.exoplayer.i iVar);

    void b0(a aVar, i2.j jVar);

    void i(a aVar, int i10, long j10, long j11);

    void j(a aVar, i2.i iVar, i2.j jVar, IOException iOException, boolean z10);

    void m(a aVar, t1.x.e eVar, t1.x.e eVar2, int i10);

    void m0(t1.x xVar, C0124b c0124b);

    default void K(a aVar) {
    }

    default void L(a aVar) {
    }

    default void S(a aVar) {
    }

    default void Y(a aVar) {
    }

    default void e(a aVar) {
    }

    default void f(a aVar) {
    }

    default void o0(a aVar) {
    }

    default void A(a aVar, int i10) {
    }

    default void B(a aVar, Exception exc) {
    }

    default void C(a aVar, androidx.media3.exoplayer.i iVar) {
    }

    default void E(a aVar, t1.x.b bVar) {
    }

    default void F(a aVar, AudioSink.a aVar2) {
    }

    default void G(a aVar, int i10) {
    }

    default void H(a aVar, String str) {
    }

    default void I(a aVar, int i10) {
    }

    default void J(a aVar, Exception exc) {
    }

    default void N(a aVar, String str) {
    }

    default void P(a aVar, androidx.media3.exoplayer.i iVar) {
    }

    default void R(a aVar, float f10) {
    }

    default void U(a aVar, int i10) {
    }

    default void V(a aVar, boolean z10) {
    }

    default void a(a aVar, androidx.media3.exoplayer.i iVar) {
    }

    default void b(a aVar, t1.u uVar) {
    }

    default void c(a aVar, t1.t tVar) {
    }

    default void d(a aVar, boolean z10) {
    }

    default void f0(a aVar, int i10) {
    }

    default void h0(a aVar, boolean z10) {
    }

    default void j0(a aVar, List list) {
    }

    default void k0(a aVar, boolean z10) {
    }

    default void l(a aVar, PlaybackException playbackException) {
    }

    default void o(a aVar, t1.d0 d0Var) {
    }

    default void p0(a aVar, t1.w wVar) {
    }

    default void q(a aVar, v1.b bVar) {
    }

    default void t(a aVar, Exception exc) {
    }

    default void u(a aVar, AudioSink.a aVar2) {
    }

    default void x(a aVar, t1.j jVar) {
    }

    default void y(a aVar, Exception exc) {
    }

    default void z(a aVar, long j10) {
    }

    default void D(a aVar, t1.o oVar, androidx.media3.exoplayer.j jVar) {
    }

    default void M(a aVar, i2.i iVar, i2.j jVar) {
    }

    default void T(a aVar, t1.o oVar, androidx.media3.exoplayer.j jVar) {
    }

    default void Z(a aVar, String str, long j10) {
    }

    default void c0(a aVar, boolean z10, int i10) {
    }

    default void d0(a aVar, t1.r rVar, int i10) {
    }

    default void e0(a aVar, String str, long j10) {
    }

    default void g(a aVar, int i10, int i11) {
    }

    default void g0(a aVar, int i10, long j10) {
    }

    default void k(a aVar, long j10, int i10) {
    }

    default void n(a aVar, i2.i iVar, i2.j jVar) {
    }

    default void p(a aVar, boolean z10, int i10) {
    }

    default void q0(a aVar, Object obj, long j10) {
    }

    default void v(a aVar, i2.i iVar, i2.j jVar) {
    }

    default void w(a aVar, int i10, boolean z10) {
    }

    default void h(a aVar, int i10, long j10, long j11) {
    }

    default void n0(a aVar, String str, long j10, long j11) {
    }

    default void r(a aVar, String str, long j10, long j11) {
    }

    default void s(a aVar, int i10, int i11, int i12, float f10) {
    }
}
