package t1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f52796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f52799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f52800e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f f52801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f52802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f52803c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f52804d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f52805e;

        public b(f fVar, int i10, int i11) {
            this.f52801a = fVar;
            this.f52802b = i10;
            this.f52803c = i11;
        }

        public p a() {
            return new p(this.f52801a, this.f52802b, this.f52803c, this.f52804d, this.f52805e);
        }

        public b b(float f10) {
            this.f52804d = f10;
            return this;
        }
    }

    private p(f fVar, int i10, int i11, float f10, long j10) {
        w1.a.b(i10 > 0, "width must be positive, but is: " + i10);
        w1.a.b(i11 > 0, "height must be positive, but is: " + i11);
        this.f52796a = fVar;
        this.f52797b = i10;
        this.f52798c = i11;
        this.f52799d = f10;
        this.f52800e = j10;
    }
}
