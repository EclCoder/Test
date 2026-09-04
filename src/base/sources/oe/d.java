package oe;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface d {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ ml.a f48532e = ml.b.a(d());
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f48533a;

        public b(String sessionId) {
            s.h(sessionId, "sessionId");
            this.f48533a = sessionId;
        }

        public final String a() {
            return this.f48533a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.c(this.f48533a, ((b) obj).f48533a);
        }

        public int hashCode() {
            return this.f48533a.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.f48533a + ')';
        }
    }

    void a(b bVar);

    boolean b();

    a c();
}
