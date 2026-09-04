package l1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f43765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f43766b;

    public s(float f10, g feature) {
        kotlin.jvm.internal.s.h(feature, "feature");
        this.f43765a = f10;
        this.f43766b = feature;
    }

    public final g a() {
        return this.f43766b;
    }

    public final float b() {
        return this.f43765a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f43765a, sVar.f43765a) == 0 && kotlin.jvm.internal.s.c(this.f43766b, sVar.f43766b);
    }

    public int hashCode() {
        return (Float.hashCode(this.f43765a) * 31) + this.f43766b.hashCode();
    }

    public String toString() {
        return "ProgressableFeature(progress=" + this.f43765a + ", feature=" + this.f43766b + ')';
    }
}
