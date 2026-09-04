package ne;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f47181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q0 f47182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f47183c;

    public j0(j eventType, q0 sessionData, b applicationInfo) {
        kotlin.jvm.internal.s.h(eventType, "eventType");
        kotlin.jvm.internal.s.h(sessionData, "sessionData");
        kotlin.jvm.internal.s.h(applicationInfo, "applicationInfo");
        this.f47181a = eventType;
        this.f47182b = sessionData;
        this.f47183c = applicationInfo;
    }

    public final b a() {
        return this.f47183c;
    }

    public final j b() {
        return this.f47181a;
    }

    public final q0 c() {
        return this.f47182b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f47181a == j0Var.f47181a && kotlin.jvm.internal.s.c(this.f47182b, j0Var.f47182b) && kotlin.jvm.internal.s.c(this.f47183c, j0Var.f47183c);
    }

    public int hashCode() {
        return (((this.f47181a.hashCode() * 31) + this.f47182b.hashCode()) * 31) + this.f47183c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f47181a + ", sessionData=" + this.f47182b + ", applicationInfo=" + this.f47183c + ')';
    }
}
