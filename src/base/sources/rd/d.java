package rd;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f51283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f51284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f51285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f51286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f51287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f51288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f51289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f51290h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f51291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f51292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f51293c;

        public a(boolean z10, boolean z11, boolean z12) {
            this.f51291a = z10;
            this.f51292b = z11;
            this.f51293c = z12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f51294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f51295b;

        public b(int i10, int i11) {
            this.f51294a = i10;
            this.f51295b = i11;
        }
    }

    public d(long j10, b bVar, a aVar, int i10, int i11, double d10, double d11, int i12) {
        this.f51285c = j10;
        this.f51283a = bVar;
        this.f51284b = aVar;
        this.f51286d = i10;
        this.f51287e = i11;
        this.f51288f = d10;
        this.f51289g = d11;
        this.f51290h = i12;
    }

    public boolean a(long j10) {
        return this.f51285c < j10;
    }
}
