package d7;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum a {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0546a f36255a = new C0546a(null);

    /* JADX INFO: renamed from: d7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0546a {
        public /* synthetic */ C0546a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String rawValue) {
            s.h(rawValue, "rawValue");
            if (s.c(rawValue, "MOBILE_APP_INSTALL")) {
                return a.MOBILE_APP_INSTALL;
            }
            return s.c(rawValue, "CUSTOM_APP_EVENTS") ? a.CUSTOM : a.OTHER;
        }

        private C0546a() {
        }
    }
}
