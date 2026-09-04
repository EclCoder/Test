package t1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f53027d = new w(1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f53028e = w1.c0.s0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f53029f = w1.c0.s0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f53030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f53031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f53032c;

    public w(float f10) {
        this(f10, 1.0f);
    }

    public long a(long j10) {
        return j10 * ((long) this.f53032c);
    }

    public w b(float f10) {
        return new w(f10, this.f53031b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (this.f53030a == wVar.f53030a && this.f53031b == wVar.f53031b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f53030a)) * 31) + Float.floatToRawIntBits(this.f53031b);
    }

    public String toString() {
        return w1.c0.F("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f53030a), Float.valueOf(this.f53031b));
    }

    public w(float f10, float f11) {
        w1.a.a(f10 > 0.0f);
        w1.a.a(f11 > 0.0f);
        this.f53030a = f10;
        this.f53031b = f11;
        this.f53032c = Math.round(f10 * 1000.0f);
    }
}
