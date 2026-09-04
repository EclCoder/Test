package androidx.media3.exoplayer.video;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import t1.g0;
import w1.p;
import w1.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f6209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f6210b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private g0 f6215g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f6217i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g.a f6211c = new g.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y f6212d = new y();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y f6213e = new y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p f6214f = new p();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private g0 f6216h = g0.f52689e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f6218j = C.TIME_UNSET;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface a {
        void a();

        void b(long j10, long j11, long j12, boolean z10);

        void onVideoSizeChanged(g0 g0Var);
    }

    public h(a aVar, g gVar) {
        this.f6209a = aVar;
        this.f6210b = gVar;
    }

    private void a() {
        w1.a.i(Long.valueOf(this.f6214f.d()));
        this.f6209a.a();
    }

    private static Object c(y yVar) {
        w1.a.a(yVar.k() > 0);
        while (yVar.k() > 1) {
            yVar.h();
        }
        return w1.a.e(yVar.h());
    }

    private boolean f(long j10) {
        Long l10 = (Long) this.f6213e.i(j10);
        if (l10 == null || l10.longValue() == this.f6217i) {
            return false;
        }
        this.f6217i = l10.longValue();
        return true;
    }

    private boolean g(long j10) {
        g0 g0Var = (g0) this.f6212d.i(j10);
        if (g0Var == null || g0Var.equals(g0.f52689e) || g0Var.equals(this.f6216h)) {
            return false;
        }
        this.f6216h = g0Var;
        return true;
    }

    private void i(boolean z10) {
        long jLongValue = ((Long) w1.a.i(Long.valueOf(this.f6214f.d()))).longValue();
        if (g(jLongValue)) {
            this.f6209a.onVideoSizeChanged(this.f6216h);
        }
        this.f6209a.b(z10 ? -1L : this.f6211c.g(), jLongValue, this.f6217i, this.f6210b.i());
    }

    public void b() {
        this.f6214f.a();
        this.f6218j = C.TIME_UNSET;
        if (this.f6213e.k() > 0) {
            Long l10 = (Long) c(this.f6213e);
            l10.longValue();
            this.f6213e.a(0L, l10);
        }
        if (this.f6215g != null) {
            this.f6212d.c();
        } else if (this.f6212d.k() > 0) {
            this.f6215g = (g0) c(this.f6212d);
        }
    }

    public boolean d(long j10) {
        long j11 = this.f6218j;
        return j11 != C.TIME_UNSET && j11 >= j10;
    }

    public boolean e() {
        return this.f6210b.d(true);
    }

    public void h(long j10, long j11) {
        while (!this.f6214f.c()) {
            long jB = this.f6214f.b();
            if (f(jB)) {
                this.f6210b.j();
            }
            int iC = this.f6210b.c(jB, j10, j11, this.f6217i, false, this.f6211c);
            if (iC == 0 || iC == 1) {
                this.f6218j = jB;
                i(iC == 0);
            } else if (iC != 2 && iC != 3 && iC != 4) {
                if (iC != 5) {
                    throw new IllegalStateException(String.valueOf(iC));
                }
                return;
            } else {
                this.f6218j = jB;
                a();
            }
        }
    }

    public void j(float f10) {
        w1.a.a(f10 > 0.0f);
        this.f6210b.r(f10);
    }
}
