package androidx.transition;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class f0 extends e0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f7386g = true;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {
        static void a(View view, int i10) {
            view.setTransitionVisibility(i10);
        }
    }

    f0() {
    }

    @Override // androidx.transition.c0
    public void f(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i10);
        } else if (f7386g) {
            try {
                a.a(view, i10);
            } catch (NoSuchMethodError unused) {
                f7386g = false;
            }
        }
    }
}
