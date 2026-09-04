package c2;

import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class l1 implements c2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1.d f9362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t1.a0.b f9363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t1.a0.c f9364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f9365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray f9366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private w1.m f9367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private t1.x f9368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private w1.j f9369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f9370i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t1.a0.b f9371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.google.common.collect.c0 f9372b = com.google.common.collect.c0.C();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.google.common.collect.e0 f9373c = com.google.common.collect.e0.q();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.media3.exoplayer.source.r.b f9374d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.media3.exoplayer.source.r.b f9375e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private androidx.media3.exoplayer.source.r.b f9376f;

        public a(t1.a0.b bVar) {
            this.f9371a = bVar;
        }

        private void b(com.google.common.collect.e0.a aVar, androidx.media3.exoplayer.source.r.b bVar, t1.a0 a0Var) {
            if (bVar == null) {
                return;
            }
            if (a0Var.b(bVar.f6055a) != -1) {
                aVar.g(bVar, a0Var);
                return;
            }
            t1.a0 a0Var2 = (t1.a0) this.f9373c.get(bVar);
            if (a0Var2 != null) {
                aVar.g(bVar, a0Var2);
            }
        }

        private static androidx.media3.exoplayer.source.r.b c(t1.x xVar, com.google.common.collect.c0 c0Var, androidx.media3.exoplayer.source.r.b bVar, t1.a0.b bVar2) {
            t1.a0 currentTimeline = xVar.getCurrentTimeline();
            int currentPeriodIndex = xVar.getCurrentPeriodIndex();
            Object objM = currentTimeline.q() ? null : currentTimeline.m(currentPeriodIndex);
            int iD = (xVar.isPlayingAd() || currentTimeline.q()) ? -1 : currentTimeline.f(currentPeriodIndex, bVar2).d(w1.c0.E0(xVar.getCurrentPosition()) - bVar2.n());
            for (int i10 = 0; i10 < c0Var.size(); i10++) {
                androidx.media3.exoplayer.source.r.b bVar3 = (androidx.media3.exoplayer.source.r.b) c0Var.get(i10);
                if (i(bVar3, objM, xVar.isPlayingAd(), xVar.getCurrentAdGroupIndex(), xVar.getCurrentAdIndexInAdGroup(), iD)) {
                    return bVar3;
                }
            }
            if (c0Var.isEmpty() && bVar != null && i(bVar, objM, xVar.isPlayingAd(), xVar.getCurrentAdGroupIndex(), xVar.getCurrentAdIndexInAdGroup(), iD)) {
                return bVar;
            }
            return null;
        }

        private static boolean i(androidx.media3.exoplayer.source.r.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (!bVar.f6055a.equals(obj)) {
                return false;
            }
            if (z10 && bVar.f6056b == i10 && bVar.f6057c == i11) {
                return true;
            }
            return !z10 && bVar.f6056b == -1 && bVar.f6059e == i12;
        }

        private void m(t1.a0 a0Var) {
            com.google.common.collect.e0.a aVarG = com.google.common.collect.e0.g();
            if (this.f9372b.isEmpty()) {
                b(aVarG, this.f9375e, a0Var);
                if (!sc.l.a(this.f9376f, this.f9375e)) {
                    b(aVarG, this.f9376f, a0Var);
                }
                if (!sc.l.a(this.f9374d, this.f9375e) && !sc.l.a(this.f9374d, this.f9376f)) {
                    b(aVarG, this.f9374d, a0Var);
                }
            } else {
                for (int i10 = 0; i10 < this.f9372b.size(); i10++) {
                    b(aVarG, (androidx.media3.exoplayer.source.r.b) this.f9372b.get(i10), a0Var);
                }
                if (!this.f9372b.contains(this.f9374d)) {
                    b(aVarG, this.f9374d, a0Var);
                }
            }
            this.f9373c = aVarG.d();
        }

        public androidx.media3.exoplayer.source.r.b d() {
            return this.f9374d;
        }

        public androidx.media3.exoplayer.source.r.b e() {
            if (this.f9372b.isEmpty()) {
                return null;
            }
            return (androidx.media3.exoplayer.source.r.b) com.google.common.collect.i0.d(this.f9372b);
        }

        public t1.a0 f(androidx.media3.exoplayer.source.r.b bVar) {
            return (t1.a0) this.f9373c.get(bVar);
        }

        public androidx.media3.exoplayer.source.r.b g() {
            return this.f9375e;
        }

        public androidx.media3.exoplayer.source.r.b h() {
            return this.f9376f;
        }

        public void j(t1.x xVar) {
            this.f9374d = c(xVar, this.f9372b, this.f9375e, this.f9371a);
        }

        public void k(List list, androidx.media3.exoplayer.source.r.b bVar, t1.x xVar) {
            this.f9372b = com.google.common.collect.c0.x(list);
            if (!list.isEmpty()) {
                this.f9375e = (androidx.media3.exoplayer.source.r.b) list.get(0);
                this.f9376f = (androidx.media3.exoplayer.source.r.b) w1.a.e(bVar);
            }
            if (this.f9374d == null) {
                this.f9374d = c(xVar, this.f9372b, this.f9375e, this.f9371a);
            }
            m(xVar.getCurrentTimeline());
        }

        public void l(t1.x xVar) {
            this.f9374d = c(xVar, this.f9372b, this.f9375e, this.f9371a);
            m(xVar.getCurrentTimeline());
        }
    }

    public l1(w1.d dVar) {
        this.f9362a = (w1.d) w1.a.e(dVar);
        this.f9367f = new w1.m(w1.c0.R(), dVar, new w1.m.b() { // from class: c2.v
            @Override // w1.m.b
            public final void a(Object obj, t1.n nVar) {
                l1.L0((b) obj, nVar);
            }
        });
        t1.a0.b bVar = new t1.a0.b();
        this.f9363b = bVar;
        this.f9364c = new t1.a0.c();
        this.f9365d = new a(bVar);
        this.f9366e = new SparseArray();
    }

    public static /* synthetic */ void K(b.a aVar, t1.g0 g0Var, b bVar) {
        bVar.W(aVar, g0Var);
        bVar.s(aVar, g0Var.f52694a, g0Var.f52695b, g0Var.f52696c, g0Var.f52697d);
    }

    public static /* synthetic */ void K0(b.a aVar, int i10, b bVar) {
        bVar.S(aVar);
        bVar.G(aVar, i10);
    }

    public static /* synthetic */ void L(b.a aVar, String str, long j10, long j11, b bVar) {
        bVar.Z(aVar, str, j10);
        bVar.r(aVar, str, j11, j10);
    }

    public static /* synthetic */ void M(b.a aVar, int i10, t1.x.e eVar, t1.x.e eVar2, b bVar) {
        bVar.U(aVar, i10);
        bVar.m(aVar, eVar, eVar2, i10);
    }

    private b.a R0(androidx.media3.exoplayer.source.r.b bVar) {
        w1.a.e(this.f9368g);
        t1.a0 a0VarF = bVar == null ? null : this.f9365d.f(bVar);
        if (bVar != null && a0VarF != null) {
            return S0(a0VarF, a0VarF.h(bVar.f6055a, this.f9363b).f52521c, bVar);
        }
        int iL = this.f9368g.l();
        t1.a0 currentTimeline = this.f9368g.getCurrentTimeline();
        if (iL >= currentTimeline.p()) {
            currentTimeline = t1.a0.f52510a;
        }
        return S0(currentTimeline, iL, null);
    }

    private b.a T0() {
        return R0(this.f9365d.e());
    }

    private b.a U0(int i10, androidx.media3.exoplayer.source.r.b bVar) {
        w1.a.e(this.f9368g);
        if (bVar != null) {
            return this.f9365d.f(bVar) != null ? R0(bVar) : S0(t1.a0.f52510a, i10, bVar);
        }
        t1.a0 currentTimeline = this.f9368g.getCurrentTimeline();
        if (i10 >= currentTimeline.p()) {
            currentTimeline = t1.a0.f52510a;
        }
        return S0(currentTimeline, i10, null);
    }

    private b.a V0() {
        return R0(this.f9365d.g());
    }

    private b.a W0() {
        return R0(this.f9365d.h());
    }

    private b.a X0(PlaybackException playbackException) {
        androidx.media3.exoplayer.source.r.b bVar;
        return (!(playbackException instanceof ExoPlaybackException) || (bVar = ((ExoPlaybackException) playbackException).f4883o) == null) ? Q0() : R0(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y0() {
        final b.a aVarQ0 = Q0();
        Z0(aVarQ0, 1028, new w1.m.a() { // from class: c2.p0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).e(aVarQ0);
            }
        });
        this.f9367f.i();
    }

    public static /* synthetic */ void k0(b.a aVar, boolean z10, b bVar) {
        bVar.d(aVar, z10);
        bVar.V(aVar, z10);
    }

    public static /* synthetic */ void z0(b.a aVar, String str, long j10, long j11, b bVar) {
        bVar.e0(aVar, str, j10);
        bVar.n0(aVar, str, j11, j10);
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void A(int i10, androidx.media3.exoplayer.source.r.b bVar, final i2.i iVar, final i2.j jVar) {
        final b.a aVarU0 = U0(i10, bVar);
        Z0(aVarU0, 1000, new w1.m.a() { // from class: c2.q0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).v(aVarU0, iVar, jVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void B(int i10, androidx.media3.exoplayer.source.r.b bVar) {
        final b.a aVarU0 = U0(i10, bVar);
        Z0(aVarU0, 1025, new w1.m.a() { // from class: c2.d1
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).K(aVarU0);
            }
        });
    }

    @Override // c2.a
    public void C(final t1.x xVar, Looper looper) {
        w1.a.g(this.f9368g == null || this.f9365d.f9372b.isEmpty());
        this.f9368g = (t1.x) w1.a.e(xVar);
        this.f9369h = this.f9362a.createHandler(looper, null);
        this.f9367f = this.f9367f.e(looper, new w1.m.b() { // from class: c2.h
            @Override // w1.m.b
            public final void a(Object obj, t1.n nVar) {
                b bVar = (b) obj;
                bVar.m0(xVar, new b.C0124b(nVar, this.f9332a.f9366e));
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void D(int i10, androidx.media3.exoplayer.source.r.b bVar, final i2.i iVar, final i2.j jVar) {
        final b.a aVarU0 = U0(i10, bVar);
        Z0(aVarU0, 1002, new w1.m.a() { // from class: c2.t0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).M(aVarU0, iVar, jVar);
            }
        });
    }

    @Override // c2.a
    public void E(b bVar) {
        w1.a.e(bVar);
        this.f9367f.c(bVar);
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void F(int i10, androidx.media3.exoplayer.source.r.b bVar, final i2.j jVar) {
        final b.a aVarU0 = U0(i10, bVar);
        Z0(aVarU0, 1004, new w1.m.a() { // from class: c2.o0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).b0(aVarU0, jVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void G(int i10, androidx.media3.exoplayer.source.r.b bVar) {
        final b.a aVarU0 = U0(i10, bVar);
        Z0(aVarU0, 1027, new w1.m.a() { // from class: c2.a1
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).L(aVarU0);
            }
        });
    }

    protected final b.a Q0() {
        return R0(this.f9365d.d());
    }

    protected final b.a S0(t1.a0 a0Var, int i10, androidx.media3.exoplayer.source.r.b bVar) {
        androidx.media3.exoplayer.source.r.b bVar2 = a0Var.q() ? null : bVar;
        long jElapsedRealtime = this.f9362a.elapsedRealtime();
        boolean z10 = a0Var.equals(this.f9368g.getCurrentTimeline()) && i10 == this.f9368g.l();
        long jB = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z10) {
                jB = this.f9368g.getContentPosition();
            } else if (!a0Var.q()) {
                jB = a0Var.n(i10, this.f9364c).b();
            }
        } else if (z10 && this.f9368g.getCurrentAdGroupIndex() == bVar2.f6056b && this.f9368g.getCurrentAdIndexInAdGroup() == bVar2.f6057c) {
            jB = this.f9368g.getCurrentPosition();
        }
        return new b.a(jElapsedRealtime, a0Var, i10, bVar2, jB, this.f9368g.getCurrentTimeline(), this.f9368g.l(), this.f9365d.d(), this.f9368g.getCurrentPosition(), this.f9368g.c());
    }

    protected final void Z0(b.a aVar, int i10, w1.m.a aVar2) {
        this.f9366e.put(i10, aVar);
        this.f9367f.k(i10, aVar2);
    }

    @Override // c2.a
    public final void a(final Exception exc) {
        final b.a aVarW0 = W0();
        Z0(aVarW0, 1014, new w1.m.a() { // from class: c2.m0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).B(aVarW0, exc);
            }
        });
    }

    @Override // c2.a
    public final void b(final String str) {
        final b.a aVarW0 = W0();
        Z0(aVarW0, 1019, new w1.m.a() { // from class: c2.p
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).N(aVarW0, str);
            }
        });
    }

    @Override // c2.a
    public final void c(final String str) {
        final b.a aVarW0 = W0();
        Z0(aVarW0, TTAdConstant.IMAGE_MODE_1012, new w1.m.a() { // from class: c2.i1
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).H(aVarW0, str);
            }
        });
    }

    @Override // c2.a
    public final void d(final long j10) {
        final b.a aVarW0 = W0();
        Z0(aVarW0, TTAdConstant.IMAGE_MODE_1010, new w1.m.a() { // from class: c2.k
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).z(aVarW0, j10);
            }
        });
    }

    @Override // c2.a
    public final void e(final Exception exc) {
        final b.a aVarW0 = W0();
        Z0(aVarW0, 1030, new w1.m.a() { // from class: c2.f
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).y(aVarW0, exc);
            }
        });
    }

    @Override // c2.a
    public final void f(final Object obj, final long j10) {
        final b.a aVarW0 = W0();
        Z0(aVarW0, 26, new w1.m.a() { // from class: c2.z0
            @Override // w1.m.a
            public final void invoke(Object obj2) {
                ((b) obj2).q0(aVarW0, obj, j10);
            }
        });
    }

    @Override // c2.a
    public final void g(final Exception exc) {
        final b.a aVarW0 = W0();
        Z0(aVarW0, 1029, new w1.m.a() { // from class: c2.k0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).t(aVarW0, exc);
            }
        });
    }

    @Override // c2.a
    public final void h(final int i10, final long j10, final long j11) {
        final b.a aVarW0 = W0();
        Z0(aVarW0, TTAdConstant.IMAGE_MODE_1011, new w1.m.a() { // from class: c2.g
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).h(aVarW0, i10, j10, j11);
            }
        });
    }

    @Override // c2.a
    public final void i(final long j10, final int i10) {
        final b.a aVarV0 = V0();
        Z0(aVarV0, 1021, new w1.m.a() { // from class: c2.w
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).k(aVarV0, j10, i10);
            }
        });
    }

    @Override // c2.a
    public void j(final AudioSink.a aVar) {
        final b.a aVarW0 = W0();
        Z0(aVarW0, 1031, new w1.m.a() { // from class: c2.d0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).F(aVarW0, aVar);
            }
        });
    }

    @Override // c2.a
    public void k(final AudioSink.a aVar) {
        final b.a aVarW0 = W0();
        Z0(aVarW0, 1032, new w1.m.a() { // from class: c2.g1
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).u(aVarW0, aVar);
            }
        });
    }

    @Override // c2.a
    public final void l(final t1.o oVar, final androidx.media3.exoplayer.j jVar) {
        final b.a aVarW0 = W0();
        Z0(aVarW0, 1017, new w1.m.a() { // from class: c2.c0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).T(aVarW0, oVar, jVar);
            }
        });
    }

    @Override // c2.a
    public final void m() {
        if (this.f9370i) {
            return;
        }
        final b.a aVarQ0 = Q0();
        this.f9370i = true;
        Z0(aVarQ0, -1, new w1.m.a() { // from class: c2.e0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).o0(aVarQ0);
            }
        });
    }

    @Override // c2.a
    public final void n(List list, androidx.media3.exoplayer.source.r.b bVar) {
        this.f9365d.k(list, bVar, (t1.x) w1.a.e(this.f9368g));
    }

    @Override // c2.a
    public final void o(final androidx.media3.exoplayer.i iVar) {
        final b.a aVarW0 = W0();
        Z0(aVarW0, 1007, new w1.m.a() { // from class: c2.f1
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarW0, iVar);
            }
        });
    }

    @Override // c2.a
    public final void onAudioDecoderInitialized(final String str, final long j10, final long j11) {
        final b.a aVarW0 = W0();
        Z0(aVarW0, 1008, new w1.m.a() { // from class: c2.m
            @Override // w1.m.a
            public final void invoke(Object obj) {
                l1.z0(aVarW0, str, j11, j10, (b) obj);
            }
        });
    }

    @Override // t1.x.d
    public void onAvailableCommandsChanged(final t1.x.b bVar) {
        final b.a aVarQ0 = Q0();
        Z0(aVarQ0, 13, new w1.m.a() { // from class: c2.j1
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).E(aVarQ0, bVar);
            }
        });
    }

    @Override // l2.d.a
    public final void onBandwidthSample(final int i10, final long j10, final long j11) {
        final b.a aVarT0 = T0();
        Z0(aVarT0, 1006, new w1.m.a() { // from class: c2.b1
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).i(aVarT0, i10, j10, j11);
            }
        });
    }

    @Override // t1.x.d
    public void onCues(final List list) {
        final b.a aVarQ0 = Q0();
        Z0(aVarQ0, 27, new w1.m.a() { // from class: c2.u
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).j0(aVarQ0, list);
            }
        });
    }

    @Override // t1.x.d
    public void onDeviceInfoChanged(final t1.j jVar) {
        final b.a aVarQ0 = Q0();
        Z0(aVarQ0, 29, new w1.m.a() { // from class: c2.b0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).x(aVarQ0, jVar);
            }
        });
    }

    @Override // t1.x.d
    public void onDeviceVolumeChanged(final int i10, final boolean z10) {
        final b.a aVarQ0 = Q0();
        Z0(aVarQ0, 30, new w1.m.a() { // from class: c2.s
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).w(aVarQ0, i10, z10);
            }
        });
    }

    @Override // c2.a
    public final void onDroppedFrames(final int i10, final long j10) {
        final b.a aVarV0 = V0();
        Z0(aVarV0, 1018, new w1.m.a() { // from class: c2.q
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).g0(aVarV0, i10, j10);
            }
        });
    }

    @Override // t1.x.d
    public final void onIsLoadingChanged(final boolean z10) {
        final b.a aVarQ0 = Q0();
        Z0(aVarQ0, 3, new w1.m.a() { // from class: c2.h1
            @Override // w1.m.a
            public final void invoke(Object obj) {
                l1.k0(aVarQ0, z10, (b) obj);
            }
        });
    }

    @Override // t1.x.d
    public void onIsPlayingChanged(final boolean z10) {
        final b.a aVarQ0 = Q0();
        Z0(aVarQ0, 7, new w1.m.a() { // from class: c2.l
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).h0(aVarQ0, z10);
            }
        });
    }

    @Override // t1.x.d
    public final void onMediaItemTransition(final t1.r rVar, final int i10) {
        final b.a aVarQ0 = Q0();
        Z0(aVarQ0, 1, new w1.m.a() { // from class: c2.d
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).d0(aVarQ0, rVar, i10);
            }
        });
    }

    @Override // t1.x.d
    public void onMediaMetadataChanged(final t1.t tVar) {
        final b.a aVarQ0 = Q0();
        Z0(aVarQ0, 14, new w1.m.a() { // from class: c2.u0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).c(aVarQ0, tVar);
            }
        });
    }

    @Override // t1.x.d
    public final void onMetadata(final t1.u uVar) {
        final b.a aVarQ0 = Q0();
        Z0(aVarQ0, 28, new w1.m.a() { // from class: c2.j
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).b(aVarQ0, uVar);
            }
        });
    }

    @Override // t1.x.d
    public final void onPlayWhenReadyChanged(final boolean z10, final int i10) {
        final b.a aVarQ0 = Q0();
        Z0(aVarQ0, 5, new w1.m.a() { // from class: c2.t
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).p(aVarQ0, z10, i10);
            }
        });
    }

    @Override // t1.x.d
    public final void onPlaybackParametersChanged(final t1.w wVar) {
        final b.a aVarQ0 = Q0();
        Z0(aVarQ0, 12, new w1.m.a() { // from class: c2.c
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).p0(aVarQ0, wVar);
            }
        });
    }

    @Override // t1.x.d
    public final void onPlaybackStateChanged(final int i10) {
        final b.a aVarQ0 = Q0();
        Z0(aVarQ0, 4, new w1.m.a() { // from class: c2.a0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).A(aVarQ0, i10);
            }
        });
    }

    @Override // t1.x.d
    public final void onPlaybackSuppressionReasonChanged(final int i10) {
        final b.a aVarQ0 = Q0();
        Z0(aVarQ0, 6, new w1.m.a() { // from class: c2.o
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).I(aVarQ0, i10);
            }
        });
    }

    @Override // t1.x.d
    public final void onPlayerError(final PlaybackException playbackException) {
        final b.a aVarX0 = X0(playbackException);
        Z0(aVarX0, 10, new w1.m.a() { // from class: c2.x
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).Q(aVarX0, playbackException);
            }
        });
    }

    @Override // t1.x.d
    public void onPlayerErrorChanged(final PlaybackException playbackException) {
        final b.a aVarX0 = X0(playbackException);
        Z0(aVarX0, 10, new w1.m.a() { // from class: c2.r
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).l(aVarX0, playbackException);
            }
        });
    }

    @Override // t1.x.d
    public final void onPlayerStateChanged(final boolean z10, final int i10) {
        final b.a aVarQ0 = Q0();
        Z0(aVarQ0, -1, new w1.m.a() { // from class: c2.i
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).c0(aVarQ0, z10, i10);
            }
        });
    }

    @Override // t1.x.d
    public void onPositionDiscontinuity(int i10) {
    }

    @Override // t1.x.d
    public final void onSkipSilenceEnabledChanged(final boolean z10) {
        final b.a aVarW0 = W0();
        Z0(aVarW0, 23, new w1.m.a() { // from class: c2.r0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).k0(aVarW0, z10);
            }
        });
    }

    @Override // t1.x.d
    public final void onSurfaceSizeChanged(final int i10, final int i11) {
        final b.a aVarW0 = W0();
        Z0(aVarW0, 24, new w1.m.a() { // from class: c2.n0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).g(aVarW0, i10, i11);
            }
        });
    }

    @Override // t1.x.d
    public final void onTimelineChanged(t1.a0 a0Var, final int i10) {
        this.f9365d.l((t1.x) w1.a.e(this.f9368g));
        final b.a aVarQ0 = Q0();
        Z0(aVarQ0, 0, new w1.m.a() { // from class: c2.k1
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).f0(aVarQ0, i10);
            }
        });
    }

    @Override // t1.x.d
    public void onTracksChanged(final t1.d0 d0Var) {
        final b.a aVarQ0 = Q0();
        Z0(aVarQ0, 2, new w1.m.a() { // from class: c2.n
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).o(aVarQ0, d0Var);
            }
        });
    }

    @Override // c2.a
    public final void onVideoDecoderInitialized(final String str, final long j10, final long j11) {
        final b.a aVarW0 = W0();
        Z0(aVarW0, 1016, new w1.m.a() { // from class: c2.l0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                l1.L(aVarW0, str, j11, j10, (b) obj);
            }
        });
    }

    @Override // t1.x.d
    public final void onVideoSizeChanged(final t1.g0 g0Var) {
        final b.a aVarW0 = W0();
        Z0(aVarW0, 25, new w1.m.a() { // from class: c2.y0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                l1.K(aVarW0, g0Var, (b) obj);
            }
        });
    }

    @Override // t1.x.d
    public final void onVolumeChanged(final float f10) {
        final b.a aVarW0 = W0();
        Z0(aVarW0, 22, new w1.m.a() { // from class: c2.e
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).R(aVarW0, f10);
            }
        });
    }

    @Override // c2.a
    public final void p(final androidx.media3.exoplayer.i iVar) {
        final b.a aVarW0 = W0();
        Z0(aVarW0, 1015, new w1.m.a() { // from class: c2.h0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).C(aVarW0, iVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void q(int i10, androidx.media3.exoplayer.source.r.b bVar, final i2.i iVar, final i2.j jVar, final IOException iOException, final boolean z10) {
        final b.a aVarU0 = U0(i10, bVar);
        Z0(aVarU0, BackupConstant.SCENE_CLOSED_WITHOUT_SHOW, new w1.m.a() { // from class: c2.s0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).j(aVarU0, iVar, jVar, iOException, z10);
            }
        });
    }

    @Override // c2.a
    public final void r(final t1.o oVar, final androidx.media3.exoplayer.j jVar) {
        final b.a aVarW0 = W0();
        Z0(aVarW0, 1009, new w1.m.a() { // from class: c2.f0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).D(aVarW0, oVar, jVar);
            }
        });
    }

    @Override // c2.a
    public void release() {
        ((w1.j) w1.a.i(this.f9369h)).post(new Runnable() { // from class: c2.i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9341a.Y0();
            }
        });
    }

    @Override // c2.a
    public final void s(final androidx.media3.exoplayer.i iVar) {
        final b.a aVarV0 = V0();
        Z0(aVarV0, 1013, new w1.m.a() { // from class: c2.z
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).P(aVarV0, iVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void t(int i10, androidx.media3.exoplayer.source.r.b bVar) {
        final b.a aVarU0 = U0(i10, bVar);
        Z0(aVarU0, 1023, new w1.m.a() { // from class: c2.e1
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).f(aVarU0);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void u(int i10, androidx.media3.exoplayer.source.r.b bVar, final i2.i iVar, final i2.j jVar) {
        final b.a aVarU0 = U0(i10, bVar);
        Z0(aVarU0, 1001, new w1.m.a() { // from class: c2.x0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).n(aVarU0, iVar, jVar);
            }
        });
    }

    @Override // c2.a
    public final void v(final androidx.media3.exoplayer.i iVar) {
        final b.a aVarV0 = V0();
        Z0(aVarV0, 1020, new w1.m.a() { // from class: c2.y
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).a0(aVarV0, iVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void w(int i10, androidx.media3.exoplayer.source.r.b bVar, final int i11) {
        final b.a aVarU0 = U0(i10, bVar);
        Z0(aVarU0, 1022, new w1.m.a() { // from class: c2.v0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                l1.K0(aVarU0, i11, (b) obj);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void y(int i10, androidx.media3.exoplayer.source.r.b bVar) {
        final b.a aVarU0 = U0(i10, bVar);
        Z0(aVarU0, 1026, new w1.m.a() { // from class: c2.c1
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).Y(aVarU0);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void z(int i10, androidx.media3.exoplayer.source.r.b bVar, final Exception exc) {
        final b.a aVarU0 = U0(i10, bVar);
        Z0(aVarU0, UserVerificationMethods.USER_VERIFY_ALL, new w1.m.a() { // from class: c2.w0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).J(aVarU0, exc);
            }
        });
    }

    @Override // t1.x.d
    public final void onPositionDiscontinuity(final t1.x.e eVar, final t1.x.e eVar2, final int i10) {
        if (i10 == 1) {
            this.f9370i = false;
        }
        this.f9365d.j((t1.x) w1.a.e(this.f9368g));
        final b.a aVarQ0 = Q0();
        Z0(aVarQ0, 11, new w1.m.a() { // from class: c2.g0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                l1.M(aVarQ0, i10, eVar, eVar2, (b) obj);
            }
        });
    }

    @Override // t1.x.d
    public void onCues(final v1.b bVar) {
        final b.a aVarQ0 = Q0();
        Z0(aVarQ0, 27, new w1.m.a() { // from class: c2.j0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((b) obj).q(aVarQ0, bVar);
            }
        });
    }

    @Override // t1.x.d
    public void onRenderedFirstFrame() {
    }

    @Override // t1.x.d
    public void onLoadingChanged(boolean z10) {
    }

    public static /* synthetic */ void L0(b bVar, t1.n nVar) {
    }

    @Override // t1.x.d
    public void onEvents(t1.x xVar, t1.x.c cVar) {
    }
}
