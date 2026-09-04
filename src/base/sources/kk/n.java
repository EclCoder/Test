package kk;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final u f43461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f43462f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f43463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f43464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f43465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u f43466d;

    static {
        u uVarB = u.b().b();
        f43461e = uVarB;
        f43462f = new n(r.f43509c, o.f43467b, s.f43512b, uVarB);
    }

    private n(r rVar, o oVar, s sVar, u uVar) {
        this.f43463a = rVar;
        this.f43464b = oVar;
        this.f43465c = sVar;
        this.f43466d = uVar;
    }

    public o a() {
        return this.f43464b;
    }

    public r b() {
        return this.f43463a;
    }

    public s c() {
        return this.f43465c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f43463a.equals(nVar.f43463a) && this.f43464b.equals(nVar.f43464b) && this.f43465c.equals(nVar.f43465c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f43463a, this.f43464b, this.f43465c});
    }

    public String toString() {
        return "SpanContext{traceId=" + this.f43463a + ", spanId=" + this.f43464b + ", traceOptions=" + this.f43465c + "}";
    }
}
