package cn;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d f10146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d f10147f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f10150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f10151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f10145d = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final d f10148g = new d(10, 6.0f, 0.0f, 4, null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return d.f10148g;
        }

        public final d b() {
            return d.f10147f;
        }

        public final d c() {
            return d.f10146e;
        }

        private a() {
        }
    }

    static {
        float f10 = 0.0f;
        f10146e = new d(6, 4.0f, f10, 4, null);
        f10147f = new d(8, f10, 0.0f, 6, null);
    }

    public d(int i10, float f10, float f11) {
        this.f10149a = i10;
        this.f10150b = f10;
        this.f10151c = f11;
        if (f10 == 0.0f) {
            throw new IllegalArgumentException(("mass=" + f10 + " must be != 0").toString());
        }
    }

    public final float d() {
        return this.f10150b;
    }

    public final float e() {
        return this.f10151c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f10149a == dVar.f10149a && Float.compare(this.f10150b, dVar.f10150b) == 0 && Float.compare(this.f10151c, dVar.f10151c) == 0;
    }

    public final int f() {
        return this.f10149a;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f10149a) * 31) + Float.hashCode(this.f10150b)) * 31) + Float.hashCode(this.f10151c);
    }

    public String toString() {
        return "Size(sizeInDp=" + this.f10149a + ", mass=" + this.f10150b + ", massVariance=" + this.f10151c + ")";
    }

    public /* synthetic */ d(int i10, float f10, float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? 5.0f : f10, (i11 & 4) != 0 ? 0.2f : f11);
    }
}
