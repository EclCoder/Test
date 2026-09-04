package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f11548a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f11549b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f11550c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f11551d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f11552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f11553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f11554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r5.f f11555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final boolean f11556i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a extends l {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public float b(int i10, int i11, int i12, int i13) {
            int iMin = Math.min(i11 / i13, i10 / i12);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b extends l {
        b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public g a(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public float b(int i10, int i11, int i12, int i13) {
            int iCeil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return 1.0f / (iMax << (iMax >= iCeil ? 0 : 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c extends l {
        c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public g a(int i10, int i11, int i12, int i13) {
            return b(i10, i11, i12, i13) == 1.0f ? g.QUALITY : l.f11550c.a(i10, i11, i12, i13);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, l.f11550c.b(i10, i11, i12, i13));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class d extends l {
        d() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public float b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class e extends l {
        e() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public g a(int i10, int i11, int i12, int i13) {
            return l.f11556i ? g.QUALITY : g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public float b(int i10, int i11, int i12, int i13) {
            if (l.f11556i) {
                return Math.min(i12 / i10, i13 / i11);
            }
            int iMax = Math.max(i11 / i13, i10 / i12);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class f extends l {
        f() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f11552e = dVar;
        f11553f = new f();
        f11554g = dVar;
        f11555h = r5.f.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f11556i = true;
    }

    public abstract g a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}
