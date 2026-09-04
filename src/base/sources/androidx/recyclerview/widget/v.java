package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class v {
    static int a(RecyclerView.c0 c0Var, s sVar, View view, View view2, RecyclerView.q qVar, boolean z10) {
        if (qVar.getChildCount() == 0 || c0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(qVar.getPosition(view) - qVar.getPosition(view2)) + 1;
        }
        return Math.min(sVar.o(), sVar.d(view2) - sVar.g(view));
    }

    static int b(RecyclerView.c0 c0Var, s sVar, View view, View view2, RecyclerView.q qVar, boolean z10, boolean z11) {
        if (qVar.getChildCount() == 0 || c0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z11 ? Math.max(0, (c0Var.b() - Math.max(qVar.getPosition(view), qVar.getPosition(view2))) - 1) : Math.max(0, Math.min(qVar.getPosition(view), qVar.getPosition(view2)));
        if (z10) {
            return Math.round((iMax * (Math.abs(sVar.d(view2) - sVar.g(view)) / (Math.abs(qVar.getPosition(view) - qVar.getPosition(view2)) + 1))) + (sVar.n() - sVar.g(view)));
        }
        return iMax;
    }

    static int c(RecyclerView.c0 c0Var, s sVar, View view, View view2, RecyclerView.q qVar, boolean z10) {
        if (qVar.getChildCount() == 0 || c0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return c0Var.b();
        }
        return (int) (((sVar.d(view2) - sVar.g(view)) / (Math.abs(qVar.getPosition(view) - qVar.getPosition(view2)) + 1)) * c0Var.b());
    }
}
