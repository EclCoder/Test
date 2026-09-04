package p9;

import android.os.Looper;
import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.w1;
import com.google.android.exoplayer2.x1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class n1 implements p9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ob.d f49691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h2.b f49692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h2.d f49693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f49694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray f49695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ob.t f49696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private x1 f49697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ob.q f49698h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f49699i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h2.b f49700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.google.common.collect.c0 f49701b = com.google.common.collect.c0.C();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.google.common.collect.e0 f49702c = com.google.common.collect.e0.q();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.google.android.exoplayer2.source.p.b f49703d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.google.android.exoplayer2.source.p.b f49704e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.google.android.exoplayer2.source.p.b f49705f;

        public a(h2.b bVar) {
            this.f49700a = bVar;
        }

        private void b(com.google.common.collect.e0.a aVar, com.google.android.exoplayer2.source.p.b bVar, h2 h2Var) {
            if (bVar == null) {
                return;
            }
            if (h2Var.f(bVar.f51199a) != -1) {
                aVar.g(bVar, h2Var);
                return;
            }
            h2 h2Var2 = (h2) this.f49702c.get(bVar);
            if (h2Var2 != null) {
                aVar.g(bVar, h2Var2);
            }
        }

        private static com.google.android.exoplayer2.source.p.b c(x1 x1Var, com.google.common.collect.c0 c0Var, com.google.android.exoplayer2.source.p.b bVar, h2.b bVar2) {
            h2 currentTimeline = x1Var.getCurrentTimeline();
            int currentPeriodIndex = x1Var.getCurrentPeriodIndex();
            Object objQ = currentTimeline.u() ? null : currentTimeline.q(currentPeriodIndex);
            int iG = (x1Var.isPlayingAd() || currentTimeline.u()) ? -1 : currentTimeline.j(currentPeriodIndex, bVar2).g(ob.r0.H0(x1Var.getCurrentPosition()) - bVar2.q());
            for (int i10 = 0; i10 < c0Var.size(); i10++) {
                com.google.android.exoplayer2.source.p.b bVar3 = (com.google.android.exoplayer2.source.p.b) c0Var.get(i10);
                if (i(bVar3, objQ, x1Var.isPlayingAd(), x1Var.getCurrentAdGroupIndex(), x1Var.getCurrentAdIndexInAdGroup(), iG)) {
                    return bVar3;
                }
            }
            if (c0Var.isEmpty() && bVar != null && i(bVar, objQ, x1Var.isPlayingAd(), x1Var.getCurrentAdGroupIndex(), x1Var.getCurrentAdIndexInAdGroup(), iG)) {
                return bVar;
            }
            return null;
        }

        private static boolean i(com.google.android.exoplayer2.source.p.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (!bVar.f51199a.equals(obj)) {
                return false;
            }
            if (z10 && bVar.f51200b == i10 && bVar.f51201c == i11) {
                return true;
            }
            return !z10 && bVar.f51200b == -1 && bVar.f51203e == i12;
        }

        private void m(h2 h2Var) {
            com.google.common.collect.e0.a aVarG = com.google.common.collect.e0.g();
            if (this.f49701b.isEmpty()) {
                b(aVarG, this.f49704e, h2Var);
                if (!sc.l.a(this.f49705f, this.f49704e)) {
                    b(aVarG, this.f49705f, h2Var);
                }
                if (!sc.l.a(this.f49703d, this.f49704e) && !sc.l.a(this.f49703d, this.f49705f)) {
                    b(aVarG, this.f49703d, h2Var);
                }
            } else {
                for (int i10 = 0; i10 < this.f49701b.size(); i10++) {
                    b(aVarG, (com.google.android.exoplayer2.source.p.b) this.f49701b.get(i10), h2Var);
                }
                if (!this.f49701b.contains(this.f49703d)) {
                    b(aVarG, this.f49703d, h2Var);
                }
            }
            this.f49702c = aVarG.d();
        }

        public com.google.android.exoplayer2.source.p.b d() {
            return this.f49703d;
        }

        public com.google.android.exoplayer2.source.p.b e() {
            if (this.f49701b.isEmpty()) {
                return null;
            }
            return (com.google.android.exoplayer2.source.p.b) com.google.common.collect.i0.d(this.f49701b);
        }

        public h2 f(com.google.android.exoplayer2.source.p.b bVar) {
            return (h2) this.f49702c.get(bVar);
        }

        public com.google.android.exoplayer2.source.p.b g() {
            return this.f49704e;
        }

        public com.google.android.exoplayer2.source.p.b h() {
            return this.f49705f;
        }

        public void j(x1 x1Var) {
            this.f49703d = c(x1Var, this.f49701b, this.f49704e, this.f49700a);
        }

        public void k(List list, com.google.android.exoplayer2.source.p.b bVar, x1 x1Var) {
            this.f49701b = com.google.common.collect.c0.x(list);
            if (!list.isEmpty()) {
                this.f49704e = (com.google.android.exoplayer2.source.p.b) list.get(0);
                this.f49705f = (com.google.android.exoplayer2.source.p.b) ob.a.e(bVar);
            }
            if (this.f49703d == null) {
                this.f49703d = c(x1Var, this.f49701b, this.f49704e, this.f49700a);
            }
            m(x1Var.getCurrentTimeline());
        }

        public void l(x1 x1Var) {
            this.f49703d = c(x1Var, this.f49701b, this.f49704e, this.f49700a);
            m(x1Var.getCurrentTimeline());
        }
    }

    public n1(ob.d dVar) {
        this.f49691a = (ob.d) ob.a.e(dVar);
        this.f49696f = new ob.t(ob.r0.R(), dVar, new ob.t.b() { // from class: p9.z
            @Override // ob.t.b
            public final void a(Object obj, ob.o oVar) {
                n1.d0((b) obj, oVar);
            }
        });
        h2.b bVar = new h2.b();
        this.f49692b = bVar;
        this.f49693c = new h2.d();
        this.f49694d = new a(bVar);
        this.f49695e = new SparseArray();
    }

    public static /* synthetic */ void E0(b.a aVar, boolean z10, b bVar) {
        bVar.V(aVar, z10);
        bVar.w(aVar, z10);
    }

    public static /* synthetic */ void U0(b.a aVar, com.google.android.exoplayer2.v0 v0Var, s9.g gVar, b bVar) {
        bVar.B(aVar, v0Var);
        bVar.g(aVar, v0Var, gVar);
    }

    public static /* synthetic */ void V0(b.a aVar, com.google.android.exoplayer2.v0 v0Var, s9.g gVar, b bVar) {
        bVar.J(aVar, v0Var);
        bVar.E(aVar, v0Var, gVar);
    }

    public static /* synthetic */ void a1(b.a aVar, int i10, x1.e eVar, x1.e eVar2, b bVar) {
        bVar.u(aVar, i10);
        bVar.k0(aVar, eVar, eVar2, i10);
    }

    public static /* synthetic */ void c1(b.a aVar, String str, long j10, long j11, b bVar) {
        bVar.M(aVar, str, j10);
        bVar.d(aVar, str, j11, j10);
    }

    public static /* synthetic */ void d1(b.a aVar, String str, long j10, long j11, b bVar) {
        bVar.P(aVar, str, j10);
        bVar.C(aVar, str, j11, j10);
    }

    private b.a i1(com.google.android.exoplayer2.source.p.b bVar) {
        ob.a.e(this.f49697g);
        h2 h2VarF = bVar == null ? null : this.f49694d.f(bVar);
        if (bVar != null && h2VarF != null) {
            return h1(h2VarF, h2VarF.l(bVar.f51199a, this.f49692b).f17000c, bVar);
        }
        int iL = this.f49697g.l();
        h2 currentTimeline = this.f49697g.getCurrentTimeline();
        if (iL >= currentTimeline.t()) {
            currentTimeline = h2.f16987a;
        }
        return h1(currentTimeline, iL, null);
    }

    private b.a j1() {
        return i1(this.f49694d.e());
    }

    private b.a k1(int i10, com.google.android.exoplayer2.source.p.b bVar) {
        ob.a.e(this.f49697g);
        if (bVar != null) {
            return this.f49694d.f(bVar) != null ? i1(bVar) : h1(h2.f16987a, i10, bVar);
        }
        h2 currentTimeline = this.f49697g.getCurrentTimeline();
        if (i10 >= currentTimeline.t()) {
            currentTimeline = h2.f16987a;
        }
        return h1(currentTimeline, i10, null);
    }

    private b.a l1() {
        return i1(this.f49694d.g());
    }

    private b.a m1() {
        return i1(this.f49694d.h());
    }

    private b.a n1(PlaybackException playbackException) {
        ra.k kVar;
        return (!(playbackException instanceof ExoPlaybackException) || (kVar = ((ExoPlaybackException) playbackException).f16415n) == null) ? g1() : i1(new com.google.android.exoplayer2.source.p.b(kVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o1() {
        final b.a aVarG1 = g1();
        p1(aVarG1, 1028, new ob.t.a() { // from class: p9.d1
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).m(aVarG1);
            }
        });
        this.f49696f.i();
    }

    public static /* synthetic */ void u0(b.a aVar, int i10, b bVar) {
        bVar.N(aVar);
        bVar.i0(aVar, i10);
    }

    public static /* synthetic */ void y0(b.a aVar, pb.z zVar, b bVar) {
        bVar.n(aVar, zVar);
        bVar.X(aVar, zVar.f49997a, zVar.f49998b, zVar.f49999c, zVar.f50000d);
    }

    @Override // com.google.android.exoplayer2.x1.d
    public void A(final com.google.android.exoplayer2.j jVar) {
        final b.a aVarG1 = g1();
        p1(aVarG1, 29, new ob.t.a() { // from class: p9.v0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).v(aVarG1, jVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public void B(final com.google.android.exoplayer2.z0 z0Var) {
        final b.a aVarG1 = g1();
        p1(aVarG1, 14, new ob.t.a() { // from class: p9.f
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).s(aVarG1, z0Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public void C(final lb.y yVar) {
        final b.a aVarG1 = g1();
        p1(aVarG1, 19, new ob.t.a() { // from class: p9.g1
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).q0(aVarG1, yVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public void D(final PlaybackException playbackException) {
        final b.a aVarN1 = n1(playbackException);
        p1(aVarN1, 10, new ob.t.a() { // from class: p9.i0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).n0(aVarN1, playbackException);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.q
    public final void E(int i10, com.google.android.exoplayer2.source.p.b bVar, final ra.i iVar, final ra.j jVar) {
        final b.a aVarK1 = k1(i10, bVar);
        p1(aVarK1, 1000, new ob.t.a() { // from class: p9.j0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).o0(aVarK1, iVar, jVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.q
    public final void F(int i10, com.google.android.exoplayer2.source.p.b bVar, final ra.j jVar) {
        final b.a aVarK1 = k1(i10, bVar);
        p1(aVarK1, 1004, new ob.t.a() { // from class: p9.m
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).z(aVarK1, jVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.q
    public final void G(int i10, com.google.android.exoplayer2.source.p.b bVar, final ra.i iVar, final ra.j jVar, final IOException iOException, final boolean z10) {
        final b.a aVarK1 = k1(i10, bVar);
        p1(aVarK1, BackupConstant.SCENE_CLOSED_WITHOUT_SHOW, new ob.t.a() { // from class: p9.p
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).f(aVarK1, iVar, jVar, iOException, z10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public void H(final i2 i2Var) {
        final b.a aVarG1 = g1();
        p1(aVarG1, 2, new ob.t.a() { // from class: p9.g0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).p(aVarG1, i2Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public final void I(final PlaybackException playbackException) {
        final b.a aVarN1 = n1(playbackException);
        p1(aVarN1, 10, new ob.t.a() { // from class: p9.q
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).y(aVarN1, playbackException);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void J(int i10, com.google.android.exoplayer2.source.p.b bVar, final Exception exc) {
        final b.a aVarK1 = k1(i10, bVar);
        p1(aVarK1, UserVerificationMethods.USER_VERIFY_ALL, new ob.t.a() { // from class: p9.o0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).g0(aVarK1, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.q
    public final void K(int i10, com.google.android.exoplayer2.source.p.b bVar, final ra.j jVar) {
        final b.a aVarK1 = k1(i10, bVar);
        p1(aVarK1, GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, new ob.t.a() { // from class: p9.n0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).c0(aVarK1, jVar);
            }
        });
    }

    @Override // p9.a
    public void M(b bVar) {
        ob.a.e(bVar);
        this.f49696f.c(bVar);
    }

    @Override // com.google.android.exoplayer2.source.q
    public final void N(int i10, com.google.android.exoplayer2.source.p.b bVar, final ra.i iVar, final ra.j jVar) {
        final b.a aVarK1 = k1(i10, bVar);
        p1(aVarK1, 1002, new ob.t.a() { // from class: p9.f1
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).R(aVarK1, iVar, jVar);
            }
        });
    }

    @Override // p9.a
    public final void O(List list, com.google.android.exoplayer2.source.p.b bVar) {
        this.f49694d.k(list, bVar, (x1) ob.a.e(this.f49697g));
    }

    @Override // com.google.android.exoplayer2.x1.d
    public final void P(final com.google.android.exoplayer2.y0 y0Var, final int i10) {
        final b.a aVarG1 = g1();
        p1(aVarG1, 1, new ob.t.a() { // from class: p9.r
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).k(aVarG1, y0Var, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void Q(int i10, com.google.android.exoplayer2.source.p.b bVar) {
        final b.a aVarK1 = k1(i10, bVar);
        p1(aVarK1, 1023, new ob.t.a() { // from class: p9.e1
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).o(aVarK1);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.q
    public final void R(int i10, com.google.android.exoplayer2.source.p.b bVar, final ra.i iVar, final ra.j jVar) {
        final b.a aVarK1 = k1(i10, bVar);
        p1(aVarK1, 1001, new ob.t.a() { // from class: p9.i
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).D(aVarK1, iVar, jVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void S(int i10, com.google.android.exoplayer2.source.p.b bVar, final int i11) {
        final b.a aVarK1 = k1(i10, bVar);
        p1(aVarK1, 1022, new ob.t.a() { // from class: p9.s0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                n1.u0(aVarK1, i11, (b) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void T(int i10, com.google.android.exoplayer2.source.p.b bVar) {
        final b.a aVarK1 = k1(i10, bVar);
        p1(aVarK1, 1027, new ob.t.a() { // from class: p9.e0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).l(aVarK1);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void U(int i10, com.google.android.exoplayer2.source.p.b bVar) {
        final b.a aVarK1 = k1(i10, bVar);
        p1(aVarK1, 1025, new ob.t.a() { // from class: p9.h1
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).K(aVarK1);
            }
        });
    }

    @Override // p9.a
    public final void a(final Exception exc) {
        final b.a aVarM1 = m1();
        p1(aVarM1, 1014, new ob.t.a() { // from class: p9.l0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).b(aVarM1, exc);
            }
        });
    }

    @Override // p9.a
    public final void b(final String str) {
        final b.a aVarM1 = m1();
        p1(aVarM1, 1019, new ob.t.a() { // from class: p9.y0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).d0(aVarM1, str);
            }
        });
    }

    @Override // p9.a
    public final void c(final String str) {
        final b.a aVarM1 = m1();
        p1(aVarM1, TTAdConstant.IMAGE_MODE_1012, new ob.t.a() { // from class: p9.b0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).S(aVarM1, str);
            }
        });
    }

    @Override // p9.a
    public final void d(final long j10) {
        final b.a aVarM1 = m1();
        p1(aVarM1, TTAdConstant.IMAGE_MODE_1010, new ob.t.a() { // from class: p9.d0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).j0(aVarM1, j10);
            }
        });
    }

    @Override // p9.a
    public final void e(final Exception exc) {
        final b.a aVarM1 = m1();
        p1(aVarM1, 1030, new ob.t.a() { // from class: p9.k1
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).s0(aVarM1, exc);
            }
        });
    }

    @Override // p9.a
    public final void f(final Object obj, final long j10) {
        final b.a aVarM1 = m1();
        p1(aVarM1, 26, new ob.t.a() { // from class: p9.b1
            @Override // ob.t.a
            public final void invoke(Object obj2) {
                ((b) obj2).c(aVarM1, obj, j10);
            }
        });
    }

    @Override // p9.a
    public final void g(final Exception exc) {
        final b.a aVarM1 = m1();
        p1(aVarM1, 1029, new ob.t.a() { // from class: p9.l1
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).t(aVarM1, exc);
            }
        });
    }

    protected final b.a g1() {
        return i1(this.f49694d.d());
    }

    @Override // p9.a
    public final void h(final int i10, final long j10, final long j11) {
        final b.a aVarM1 = m1();
        p1(aVarM1, TTAdConstant.IMAGE_MODE_1011, new ob.t.a() { // from class: p9.e
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).j(aVarM1, i10, j10, j11);
            }
        });
    }

    protected final b.a h1(h2 h2Var, int i10, com.google.android.exoplayer2.source.p.b bVar) {
        com.google.android.exoplayer2.source.p.b bVar2 = h2Var.u() ? null : bVar;
        long jElapsedRealtime = this.f49691a.elapsedRealtime();
        boolean z10 = h2Var.equals(this.f49697g.getCurrentTimeline()) && i10 == this.f49697g.l();
        long jD = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z10) {
                jD = this.f49697g.getContentPosition();
            } else if (!h2Var.u()) {
                jD = h2Var.r(i10, this.f49693c).d();
            }
        } else if (z10 && this.f49697g.getCurrentAdGroupIndex() == bVar2.f51200b && this.f49697g.getCurrentAdIndexInAdGroup() == bVar2.f51201c) {
            jD = this.f49697g.getCurrentPosition();
        }
        return new b.a(jElapsedRealtime, h2Var, i10, bVar2, jD, this.f49697g.getCurrentTimeline(), this.f49697g.l(), this.f49694d.d(), this.f49697g.getCurrentPosition(), this.f49697g.c());
    }

    @Override // p9.a
    public final void i(final long j10, final int i10) {
        final b.a aVarL1 = l1();
        p1(aVarL1, 1021, new ob.t.a() { // from class: p9.m0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).W(aVarL1, j10, i10);
            }
        });
    }

    @Override // p9.a
    public final void j(final s9.e eVar) {
        final b.a aVarL1 = l1();
        p1(aVarL1, 1020, new ob.t.a() { // from class: p9.y
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).F(aVarL1, eVar);
            }
        });
    }

    @Override // p9.a
    public final void k(final s9.e eVar) {
        final b.a aVarL1 = l1();
        p1(aVarL1, 1013, new ob.t.a() { // from class: p9.a0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).l0(aVarL1, eVar);
            }
        });
    }

    @Override // p9.a
    public final void l(final s9.e eVar) {
        final b.a aVarM1 = m1();
        p1(aVarM1, 1015, new ob.t.a() { // from class: p9.v
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).b0(aVarM1, eVar);
            }
        });
    }

    @Override // p9.a
    public final void m() {
        if (this.f49699i) {
            return;
        }
        final b.a aVarG1 = g1();
        this.f49699i = true;
        p1(aVarG1, -1, new ob.t.a() { // from class: p9.k
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).T(aVarG1);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public final void n(final w1 w1Var) {
        final b.a aVarG1 = g1();
        p1(aVarG1, 12, new ob.t.a() { // from class: p9.h
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).p0(aVarG1, w1Var);
            }
        });
    }

    @Override // p9.a
    public final void o(final com.google.android.exoplayer2.v0 v0Var, final s9.g gVar) {
        final b.a aVarM1 = m1();
        p1(aVarM1, 1017, new ob.t.a() { // from class: p9.u
            @Override // ob.t.a
            public final void invoke(Object obj) {
                n1.V0(aVarM1, v0Var, gVar, (b) obj);
            }
        });
    }

    @Override // p9.a
    public final void onAudioDecoderInitialized(final String str, final long j10, final long j11) {
        final b.a aVarM1 = m1();
        p1(aVarM1, 1008, new ob.t.a() { // from class: p9.c
            @Override // ob.t.a
            public final void invoke(Object obj) {
                n1.c1(aVarM1, str, j11, j10, (b) obj);
            }
        });
    }

    @Override // nb.d.a
    public final void onBandwidthSample(final int i10, final long j10, final long j11) {
        final b.a aVarJ1 = j1();
        p1(aVarJ1, 1006, new ob.t.a() { // from class: p9.i1
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).q(aVarJ1, i10, j10, j11);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public void onCues(final List list) {
        final b.a aVarG1 = g1();
        p1(aVarG1, 27, new ob.t.a() { // from class: p9.f0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).x(aVarG1, list);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public void onDeviceVolumeChanged(final int i10, final boolean z10) {
        final b.a aVarG1 = g1();
        p1(aVarG1, 30, new ob.t.a() { // from class: p9.w0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).u0(aVarG1, i10, z10);
            }
        });
    }

    @Override // p9.a
    public final void onDroppedFrames(final int i10, final long j10) {
        final b.a aVarL1 = l1();
        p1(aVarL1, 1018, new ob.t.a() { // from class: p9.h0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).e0(aVarL1, i10, j10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public final void onIsLoadingChanged(final boolean z10) {
        final b.a aVarG1 = g1();
        p1(aVarG1, 3, new ob.t.a() { // from class: p9.u0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                n1.E0(aVarG1, z10, (b) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public void onIsPlayingChanged(final boolean z10) {
        final b.a aVarG1 = g1();
        p1(aVarG1, 7, new ob.t.a() { // from class: p9.j1
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).e(aVarG1, z10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public final void onPlayWhenReadyChanged(final boolean z10, final int i10) {
        final b.a aVarG1 = g1();
        p1(aVarG1, 5, new ob.t.a() { // from class: p9.n
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).h0(aVarG1, z10, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public final void onPlaybackStateChanged(final int i10) {
        final b.a aVarG1 = g1();
        p1(aVarG1, 4, new ob.t.a() { // from class: p9.w
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).r0(aVarG1, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public final void onPlaybackSuppressionReasonChanged(final int i10) {
        final b.a aVarG1 = g1();
        p1(aVarG1, 6, new ob.t.a() { // from class: p9.k0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).f0(aVarG1, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public final void onPlayerStateChanged(final boolean z10, final int i10) {
        final b.a aVarG1 = g1();
        p1(aVarG1, -1, new ob.t.a() { // from class: p9.j
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).Q(aVarG1, z10, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public final void onRepeatModeChanged(final int i10) {
        final b.a aVarG1 = g1();
        p1(aVarG1, 8, new ob.t.a() { // from class: p9.c0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).A(aVarG1, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public final void onShuffleModeEnabledChanged(final boolean z10) {
        final b.a aVarG1 = g1();
        p1(aVarG1, 9, new ob.t.a() { // from class: p9.m1
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).L(aVarG1, z10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public final void onSkipSilenceEnabledChanged(final boolean z10) {
        final b.a aVarM1 = m1();
        p1(aVarM1, 23, new ob.t.a() { // from class: p9.c1
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarM1, z10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public final void onSurfaceSizeChanged(final int i10, final int i11) {
        final b.a aVarM1 = m1();
        p1(aVarM1, 24, new ob.t.a() { // from class: p9.o
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).r(aVarM1, i10, i11);
            }
        });
    }

    @Override // p9.a
    public final void onVideoDecoderInitialized(final String str, final long j10, final long j11) {
        final b.a aVarM1 = m1();
        p1(aVarM1, 1016, new ob.t.a() { // from class: p9.x
            @Override // ob.t.a
            public final void invoke(Object obj) {
                n1.d1(aVarM1, str, j11, j10, (b) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public final void onVolumeChanged(final float f10) {
        final b.a aVarM1 = m1();
        p1(aVarM1, 22, new ob.t.a() { // from class: p9.t0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).Z(aVarM1, f10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public final void p(final ha.a aVar) {
        final b.a aVarG1 = g1();
        p1(aVarG1, 28, new ob.t.a() { // from class: p9.x0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).t0(aVarG1, aVar);
            }
        });
    }

    protected final void p1(b.a aVar, int i10, ob.t.a aVar2) {
        this.f49695e.put(i10, aVar);
        this.f49696f.k(i10, aVar2);
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void q(int i10, com.google.android.exoplayer2.source.p.b bVar) {
        final b.a aVarK1 = k1(i10, bVar);
        p1(aVarK1, 1026, new ob.t.a() { // from class: p9.z0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).m0(aVarK1);
            }
        });
    }

    @Override // p9.a
    public final void r(final com.google.android.exoplayer2.v0 v0Var, final s9.g gVar) {
        final b.a aVarM1 = m1();
        p1(aVarM1, 1009, new ob.t.a() { // from class: p9.d
            @Override // ob.t.a
            public final void invoke(Object obj) {
                n1.U0(aVarM1, v0Var, gVar, (b) obj);
            }
        });
    }

    @Override // p9.a
    public void release() {
        ((ob.q) ob.a.i(this.f49698h)).post(new Runnable() { // from class: p9.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f49640a.o1();
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public void s(final bb.f fVar) {
        final b.a aVarG1 = g1();
        p1(aVarG1, 27, new ob.t.a() { // from class: p9.s
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).h(aVarG1, fVar);
            }
        });
    }

    @Override // p9.a
    public void t(final x1 x1Var, Looper looper) {
        ob.a.g(this.f49697g == null || this.f49694d.f49701b.isEmpty());
        this.f49697g = (x1) ob.a.e(x1Var);
        this.f49698h = this.f49691a.createHandler(looper, null);
        this.f49696f = this.f49696f.e(looper, new ob.t.b() { // from class: p9.l
            @Override // ob.t.b
            public final void a(Object obj, ob.o oVar) {
                b bVar = (b) obj;
                bVar.U(x1Var, new b.C0765b(oVar, this.f49673a.f49695e));
            }
        });
    }

    @Override // p9.a
    public final void v(final s9.e eVar) {
        final b.a aVarM1 = m1();
        p1(aVarM1, 1007, new ob.t.a() { // from class: p9.q0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).i(aVarM1, eVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public final void w(final pb.z zVar) {
        final b.a aVarM1 = m1();
        p1(aVarM1, 25, new ob.t.a() { // from class: p9.a1
            @Override // ob.t.a
            public final void invoke(Object obj) {
                n1.y0(aVarM1, zVar, (b) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public final void x(final x1.e eVar, final x1.e eVar2, final int i10) {
        if (i10 == 1) {
            this.f49699i = false;
        }
        this.f49694d.j((x1) ob.a.e(this.f49697g));
        final b.a aVarG1 = g1();
        p1(aVarG1, 11, new ob.t.a() { // from class: p9.p0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                n1.a1(aVarG1, i10, eVar, eVar2, (b) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public void y(final x1.b bVar) {
        final b.a aVarG1 = g1();
        p1(aVarG1, 13, new ob.t.a() { // from class: p9.t
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).Y(aVarG1, bVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public final void z(h2 h2Var, final int i10) {
        this.f49694d.l((x1) ob.a.e(this.f49697g));
        final b.a aVarG1 = g1();
        p1(aVarG1, 0, new ob.t.a() { // from class: p9.r0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((b) obj).O(aVarG1, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1.d
    public void onRenderedFirstFrame() {
    }

    @Override // com.google.android.exoplayer2.x1.d
    public void onLoadingChanged(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.x1.d
    public void onPositionDiscontinuity(int i10) {
    }

    public static /* synthetic */ void d0(b bVar, ob.o oVar) {
    }

    @Override // com.google.android.exoplayer2.x1.d
    public void L(x1 x1Var, x1.c cVar) {
    }
}
