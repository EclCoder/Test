package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class d0 extends c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f7367d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f7368e = true;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {
        static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    d0() {
    }

    @Override // androidx.transition.c0
    public void g(View view, Matrix matrix) {
        if (f7367d) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f7367d = false;
            }
        }
    }

    @Override // androidx.transition.c0
    public void h(View view, Matrix matrix) {
        if (f7368e) {
            try {
                a.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f7368e = false;
            }
        }
    }
}
