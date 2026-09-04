package nf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47619b;

    public q(String code, String displayName) {
        kotlin.jvm.internal.s.h(code, "code");
        kotlin.jvm.internal.s.h(displayName, "displayName");
        this.f47618a = code;
        this.f47619b = displayName;
    }

    public final String a() {
        return this.f47618a;
    }

    public final String b() {
        return this.f47619b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.s.c(this.f47618a, qVar.f47618a) && kotlin.jvm.internal.s.c(this.f47619b, qVar.f47619b);
    }

    public int hashCode() {
        return (this.f47618a.hashCode() * 31) + this.f47619b.hashCode();
    }

    public String toString() {
        return "CaptionLanguage(code=" + this.f47618a + ", displayName=" + this.f47619b + ')';
    }
}
