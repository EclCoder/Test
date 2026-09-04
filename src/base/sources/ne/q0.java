package ne;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f47226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f47227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f47228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f47229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f47230g;

    public q0(String sessionId, String firstSessionId, int i10, long j10, e dataCollectionStatus, String firebaseInstallationId, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.s.h(sessionId, "sessionId");
        kotlin.jvm.internal.s.h(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.s.h(dataCollectionStatus, "dataCollectionStatus");
        kotlin.jvm.internal.s.h(firebaseInstallationId, "firebaseInstallationId");
        kotlin.jvm.internal.s.h(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f47224a = sessionId;
        this.f47225b = firstSessionId;
        this.f47226c = i10;
        this.f47227d = j10;
        this.f47228e = dataCollectionStatus;
        this.f47229f = firebaseInstallationId;
        this.f47230g = firebaseAuthenticationToken;
    }

    public final e a() {
        return this.f47228e;
    }

    public final long b() {
        return this.f47227d;
    }

    public final String c() {
        return this.f47230g;
    }

    public final String d() {
        return this.f47229f;
    }

    public final String e() {
        return this.f47225b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return kotlin.jvm.internal.s.c(this.f47224a, q0Var.f47224a) && kotlin.jvm.internal.s.c(this.f47225b, q0Var.f47225b) && this.f47226c == q0Var.f47226c && this.f47227d == q0Var.f47227d && kotlin.jvm.internal.s.c(this.f47228e, q0Var.f47228e) && kotlin.jvm.internal.s.c(this.f47229f, q0Var.f47229f) && kotlin.jvm.internal.s.c(this.f47230g, q0Var.f47230g);
    }

    public final String f() {
        return this.f47224a;
    }

    public final int g() {
        return this.f47226c;
    }

    public int hashCode() {
        return (((((((((((this.f47224a.hashCode() * 31) + this.f47225b.hashCode()) * 31) + Integer.hashCode(this.f47226c)) * 31) + Long.hashCode(this.f47227d)) * 31) + this.f47228e.hashCode()) * 31) + this.f47229f.hashCode()) * 31) + this.f47230g.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f47224a + ", firstSessionId=" + this.f47225b + ", sessionIndex=" + this.f47226c + ", eventTimestampUs=" + this.f47227d + ", dataCollectionStatus=" + this.f47228e + ", firebaseInstallationId=" + this.f47229f + ", firebaseAuthenticationToken=" + this.f47230g + ')';
    }
}
