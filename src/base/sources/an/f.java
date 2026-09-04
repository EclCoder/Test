package an;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f492f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f497e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public f(boolean z10, float f10, float f11, float f12, float f13) {
        this.f493a = z10;
        this.f494b = f10;
        this.f495c = f11;
        this.f496d = f12;
        this.f497e = f13;
    }

    public final boolean a() {
        return this.f493a;
    }

    public final float b() {
        return this.f496d;
    }

    public final float c() {
        return this.f497e;
    }

    public final float d() {
        return this.f494b;
    }

    public final float e() {
        return this.f495c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f493a == fVar.f493a && Float.compare(this.f494b, fVar.f494b) == 0 && Float.compare(this.f495c, fVar.f495c) == 0 && Float.compare(this.f496d, fVar.f496d) == 0 && Float.compare(this.f497e, fVar.f497e) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z10 = this.f493a;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return (((((((r10 * 31) + Float.hashCode(this.f494b)) * 31) + Float.hashCode(this.f495c)) * 31) + Float.hashCode(this.f496d)) * 31) + Float.hashCode(this.f497e);
    }

    public String toString() {
        return "Rotation(enabled=" + this.f493a + ", speed=" + this.f494b + ", variance=" + this.f495c + ", multiplier2D=" + this.f496d + ", multiplier3D=" + this.f497e + ")";
    }

    public /* synthetic */ f(boolean z10, float f10, float f11, float f12, float f13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? 1.0f : f10, (i10 & 4) != 0 ? 0.5f : f11, (i10 & 8) != 0 ? 8.0f : f12, (i10 & 16) != 0 ? 1.5f : f13);
    }
}
