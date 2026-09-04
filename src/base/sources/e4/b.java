package e4;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f37097f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f37099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f37100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f37101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f37102e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(int i10, float f10, float f11, float f12, long j10) {
        this.f37098a = i10;
        this.f37099b = f10;
        this.f37100c = f11;
        this.f37101d = f12;
        this.f37102e = j10;
    }

    public final long a() {
        return this.f37102e;
    }

    public final float b() {
        return this.f37099b;
    }

    public final int c() {
        return this.f37098a;
    }

    public final float d() {
        return this.f37100c;
    }

    public final float e() {
        return this.f37101d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f37100c == bVar.f37100c && this.f37101d == bVar.f37101d && this.f37099b == bVar.f37099b && this.f37098a == bVar.f37098a && this.f37102e == bVar.f37102e;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Float.hashCode(this.f37100c) * 31) + Float.hashCode(this.f37101d)) * 31) + Float.hashCode(this.f37099b)) * 31) + Integer.hashCode(this.f37098a)) * 31) + Long.hashCode(this.f37102e);
    }

    public String toString() {
        return "NavigationEvent(touchX=" + this.f37100c + ", touchY=" + this.f37101d + ", progress=" + this.f37099b + ", swipeEdge=" + this.f37098a + ", frameTimeMillis=" + this.f37102e + ')';
    }
}
