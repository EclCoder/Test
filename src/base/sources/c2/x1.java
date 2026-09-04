package c2;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x1 f9483d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f9485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f9486c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f9487b = new a(LogSessionId.LOG_SESSION_ID_NONE);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LogSessionId f9488a;

        public a(LogSessionId logSessionId) {
            this.f9488a = logSessionId;
        }
    }

    static {
        f9483d = w1.c0.f55769a < 31 ? new x1("") : new x1(a.f9487b, "");
    }

    public x1(String str) {
        w1.a.g(w1.c0.f55769a < 31);
        this.f9484a = str;
        this.f9485b = null;
        this.f9486c = new Object();
    }

    public LogSessionId a() {
        return ((a) w1.a.e(this.f9485b)).f9488a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return Objects.equals(this.f9484a, x1Var.f9484a) && Objects.equals(this.f9485b, x1Var.f9485b) && Objects.equals(this.f9486c, x1Var.f9486c);
    }

    public int hashCode() {
        return Objects.hash(this.f9484a, this.f9485b, this.f9486c);
    }

    public x1(LogSessionId logSessionId, String str) {
        this(new a(logSessionId), str);
    }

    private x1(a aVar, String str) {
        this.f9485b = aVar;
        this.f9484a = str;
        this.f9486c = new Object();
    }
}
