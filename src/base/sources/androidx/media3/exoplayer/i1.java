package androidx.media3.exoplayer;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f5396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5397c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f5398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f5399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f5400c;

        public i1 d() {
            return new i1(this);
        }

        public b e(long j10) {
            w1.a.a(j10 >= 0 || j10 == C.TIME_UNSET);
            this.f5400c = j10;
            return this;
        }

        public b f(long j10) {
            this.f5398a = j10;
            return this;
        }

        public b g(float f10) {
            w1.a.a(f10 > 0.0f || f10 == -3.4028235E38f);
            this.f5399b = f10;
            return this;
        }

        public b() {
            this.f5398a = C.TIME_UNSET;
            this.f5399b = -3.4028235E38f;
            this.f5400c = C.TIME_UNSET;
        }

        private b(i1 i1Var) {
            this.f5398a = i1Var.f5395a;
            this.f5399b = i1Var.f5396b;
            this.f5400c = i1Var.f5397c;
        }
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return this.f5395a == i1Var.f5395a && this.f5396b == i1Var.f5396b && this.f5397c == i1Var.f5397c;
    }

    public int hashCode() {
        return sc.l.b(Long.valueOf(this.f5395a), Float.valueOf(this.f5396b), Long.valueOf(this.f5397c));
    }

    private i1(b bVar) {
        this.f5395a = bVar.f5398a;
        this.f5396b = bVar.f5399b;
        this.f5397c = bVar.f5400c;
    }
}
