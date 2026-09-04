package androidx.window.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface j extends e {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0099a f7707b = new C0099a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f7708c = new a("VERTICAL");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f7709d = new a("HORIZONTAL");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7710a;

        /* JADX INFO: renamed from: androidx.window.layout.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0099a {
            public /* synthetic */ C0099a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0099a() {
            }
        }

        private a(String str) {
            this.f7710a = str;
        }

        public String toString() {
            return this.f7710a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f7711b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f7712c = new b("FLAT");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f7713d = new b("HALF_OPENED");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7714a;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        private b(String str) {
            this.f7714a = str;
        }

        public String toString() {
            return this.f7714a;
        }
    }

    boolean a();

    a b();
}
