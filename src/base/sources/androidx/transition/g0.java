package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class g0 extends f0 {
    g0() {
    }

    @Override // androidx.transition.c0
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.e0, androidx.transition.c0
    public void d(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // androidx.transition.c0
    public void e(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // androidx.transition.f0, androidx.transition.c0
    public void f(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // androidx.transition.d0, androidx.transition.c0
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.d0, androidx.transition.c0
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
