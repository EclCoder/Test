package t1;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g0 f52689e = new g0(0, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f52690f = w1.c0.s0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f52691g = w1.c0.s0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f52692h = w1.c0.s0(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f52693i = w1.c0.s0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f52697d;

    public g0(int i10, int i11) {
        this(i10, i11, 0, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            if (this.f52694a == g0Var.f52694a && this.f52695b == g0Var.f52695b && this.f52696c == g0Var.f52696c && this.f52697d == g0Var.f52697d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE + this.f52694a) * 31) + this.f52695b) * 31) + this.f52696c) * 31) + Float.floatToRawIntBits(this.f52697d);
    }

    public g0(int i10, int i11, int i12, float f10) {
        this.f52694a = i10;
        this.f52695b = i11;
        this.f52696c = i12;
        this.f52697d = f10;
    }
}
