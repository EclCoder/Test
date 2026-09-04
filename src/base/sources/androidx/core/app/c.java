package androidx.core.app;

import android.app.ActivityOptions;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ActivityOptions f3269a;

        a(ActivityOptions activityOptions) {
            this.f3269a = activityOptions;
        }

        @Override // androidx.core.app.c
        public c b(int i10) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 34) {
                this.f3269a.setPendingIntentBackgroundActivityStartMode(i10);
                return this;
            }
            if (i11 >= 33) {
                this.f3269a.setPendingIntentBackgroundActivityLaunchAllowed(i10 != 2);
            }
            return this;
        }

        @Override // androidx.core.app.c
        public Bundle c() {
            return this.f3269a.toBundle();
        }
    }

    protected c() {
    }

    public static c a() {
        return new a(ActivityOptions.makeBasic());
    }

    public abstract c b(int i10);

    public abstract Bundle c();
}
