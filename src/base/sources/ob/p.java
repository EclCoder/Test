package ob;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f48417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f48418d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f48419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f48420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f48421c = 1.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f48422d;

        public b(int i10, int i11) {
            this.f48419a = i10;
            this.f48420b = i11;
        }

        public p a() {
            return new p(this.f48419a, this.f48420b, this.f48421c, this.f48422d);
        }

        public b b(float f10) {
            this.f48421c = f10;
            return this;
        }
    }

    private p(int i10, int i11, float f10, long j10) {
        ob.a.b(i10 > 0, "width must be positive, but is: " + i10);
        ob.a.b(i11 > 0, "height must be positive, but is: " + i11);
        this.f48415a = i10;
        this.f48416b = i11;
        this.f48417c = f10;
        this.f48418d = j10;
    }
}
