package androidx.media3.exoplayer.video;

import android.content.Context;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f6195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m2.g f6196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f6197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6198d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f6201g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f6204j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6199e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f6200f = C.TIME_UNSET;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f6202h = C.TIME_UNSET;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f6203i = C.TIME_UNSET;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f6205k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private w1.d f6206l = w1.d.f55786a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f6207a = C.TIME_UNSET;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f6208b = C.TIME_UNSET;

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            this.f6207a = C.TIME_UNSET;
            this.f6208b = C.TIME_UNSET;
        }

        public long f() {
            return this.f6207a;
        }

        public long g() {
            return this.f6208b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        boolean s(long j10, long j11);

        boolean u(long j10, long j11, long j12, boolean z10, boolean z11);

        boolean z(long j10, long j11, boolean z10);
    }

    public g(Context context, b bVar, long j10) {
        this.f6195a = bVar;
        this.f6197c = j10;
        this.f6196b = new m2.g(context);
    }

    private long b(long j10, long j11, long j12) {
        long j13 = (long) ((j12 - j10) / ((double) this.f6205k));
        return this.f6198d ? j13 - (c0.E0(this.f6206l.elapsedRealtime()) - j11) : j13;
    }

    private void f(int i10) {
        this.f6199e = Math.min(this.f6199e, i10);
    }

    private boolean s(long j10, long j11, long j12) {
        if (this.f6203i != C.TIME_UNSET && !this.f6204j) {
            return false;
        }
        int i10 = this.f6199e;
        if (i10 == 0) {
            return this.f6198d;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return j10 >= j12;
        }
        if (i10 == 3) {
            return this.f6198d && this.f6195a.s(j11, c0.E0(this.f6206l.elapsedRealtime()) - this.f6201g);
        }
        throw new IllegalStateException();
    }

    public void a() {
        if (this.f6199e == 0) {
            this.f6199e = 1;
        }
    }

    public int c(long j10, long j11, long j12, long j13, boolean z10, a aVar) {
        aVar.h();
        if (this.f6200f == C.TIME_UNSET) {
            this.f6200f = j11;
        }
        if (this.f6202h != j10) {
            this.f6196b.h(j10);
            this.f6202h = j10;
        }
        aVar.f6207a = b(j11, j12, j10);
        if (s(j11, aVar.f6207a, j13)) {
            return 0;
        }
        if (!this.f6198d || j11 == this.f6200f) {
            return 5;
        }
        long jNanoTime = this.f6206l.nanoTime();
        aVar.f6208b = this.f6196b.b((aVar.f6207a * 1000) + jNanoTime);
        aVar.f6207a = (aVar.f6208b - jNanoTime) / 1000;
        boolean z11 = (this.f6203i == C.TIME_UNSET || this.f6204j) ? false : true;
        if (this.f6195a.u(aVar.f6207a, j11, j12, z10, z11)) {
            return 4;
        }
        if (this.f6195a.z(aVar.f6207a, j12, z10)) {
            return z11 ? 3 : 2;
        }
        return aVar.f6207a > 50000 ? 5 : 1;
    }

    public boolean d(boolean z10) {
        if (z10 && this.f6199e == 3) {
            this.f6203i = C.TIME_UNSET;
            return true;
        }
        if (this.f6203i == C.TIME_UNSET) {
            return false;
        }
        if (this.f6206l.elapsedRealtime() < this.f6203i) {
            return true;
        }
        this.f6203i = C.TIME_UNSET;
        return false;
    }

    public void e(boolean z10) {
        this.f6204j = z10;
        this.f6203i = this.f6197c > 0 ? this.f6206l.elapsedRealtime() + this.f6197c : C.TIME_UNSET;
    }

    public void g() {
        f(0);
    }

    public void h(boolean z10) {
        this.f6199e = z10 ? 1 : 0;
    }

    public boolean i() {
        boolean z10 = this.f6199e != 3;
        this.f6199e = 3;
        this.f6201g = c0.E0(this.f6206l.elapsedRealtime());
        return z10;
    }

    public void j() {
        f(2);
    }

    public void k() {
        this.f6198d = true;
        this.f6201g = c0.E0(this.f6206l.elapsedRealtime());
        this.f6196b.k();
    }

    public void l() {
        this.f6198d = false;
        this.f6203i = C.TIME_UNSET;
        this.f6196b.l();
    }

    public void m() {
        this.f6196b.j();
        this.f6202h = C.TIME_UNSET;
        this.f6200f = C.TIME_UNSET;
        f(1);
        this.f6203i = C.TIME_UNSET;
    }

    public void n(int i10) {
        this.f6196b.o(i10);
    }

    public void o(w1.d dVar) {
        this.f6206l = dVar;
    }

    public void p(float f10) {
        this.f6196b.g(f10);
    }

    public void q(Surface surface) {
        this.f6196b.m(surface);
        f(1);
    }

    public void r(float f10) {
        if (f10 == this.f6205k) {
            return;
        }
        this.f6205k = f10;
        this.f6196b.i(f10);
    }
}
