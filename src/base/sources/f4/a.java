package f4;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f38240a = new a();

    /* JADX INFO: renamed from: f4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0572a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0572a f38241a = new C0572a();

        private C0572a() {
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(31);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f38242a = new b();

        private b() {
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    private a() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return b.f38242a.a();
        }
        return 0;
    }

    public final int b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 31 || i10 == 32) {
            return C0572a.f38241a.a();
        }
        return 0;
    }
}
