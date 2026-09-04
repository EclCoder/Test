package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class y implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f43612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43613b;

    public y(Class jClass, String moduleName) {
        s.h(jClass, "jClass");
        s.h(moduleName, "moduleName");
        this.f43612a = jClass;
        this.f43613b = moduleName;
    }

    @Override // kotlin.jvm.internal.h
    public Class b() {
        return this.f43612a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof y) && s.c(b(), ((y) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
