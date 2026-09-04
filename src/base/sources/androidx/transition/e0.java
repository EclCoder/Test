package androidx.transition;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class e0 extends d0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f7385f = true;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {
        static void a(View view, int i10, int i11, int i12, int i13) {
            view.setLeftTopRightBottom(i10, i11, i12, i13);
        }
    }

    e0() {
    }

    @Override // androidx.transition.c0
    public void d(View view, int i10, int i11, int i12, int i13) {
        if (f7385f) {
            try {
                a.a(view, i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f7385f = false;
            }
        }
    }
}
