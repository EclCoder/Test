package androidx.work;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b.c f7998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b.C0106b f7999b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class b {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f8000a;

            public a(Throwable th2) {
                this.f8000a = th2;
            }

            public Throwable a() {
                return this.f8000a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f8000a.getMessage());
            }
        }

        /* JADX INFO: renamed from: androidx.work.o$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0106b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0106b() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }

    static {
        f7998a = new b.c();
        f7999b = new b.C0106b();
    }
}
