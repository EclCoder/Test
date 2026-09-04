package androidx.databinding;

import android.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static e f3443a = new DataBinderMapperImpl();

    public static p a(View view) {
        return b(view, null);
    }

    public static p b(View view, f fVar) {
        p pVarF = f(view);
        if (pVarF != null) {
            return pVarF;
        }
        Object tag = view.getTag();
        if (!(tag instanceof String)) {
            throw new IllegalArgumentException("View is not a binding layout");
        }
        int iD = f3443a.d((String) tag);
        if (iD != 0) {
            return f3443a.b(fVar, view, iD);
        }
        throw new IllegalArgumentException("View is not a binding layout. Tag: " + tag);
    }

    static p c(f fVar, View view, int i10) {
        return f3443a.b(fVar, view, i10);
    }

    static p d(f fVar, View[] viewArr, int i10) {
        return f3443a.c(fVar, viewArr, i10);
    }

    private static p e(f fVar, ViewGroup viewGroup, int i10, int i11) {
        int childCount = viewGroup.getChildCount();
        int i12 = childCount - i10;
        if (i12 == 1) {
            return c(fVar, viewGroup.getChildAt(childCount - 1), i11);
        }
        View[] viewArr = new View[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            viewArr[i13] = viewGroup.getChildAt(i13 + i10);
        }
        return d(fVar, viewArr, i11);
    }

    public static p f(View view) {
        return p.y(view);
    }

    public static f g() {
        return null;
    }

    public static p h(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, boolean z10) {
        return i(layoutInflater, i10, viewGroup, z10, null);
    }

    public static p i(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, boolean z10, f fVar) {
        boolean z11 = viewGroup != null && z10;
        return z11 ? e(fVar, viewGroup, z11 ? viewGroup.getChildCount() : 0, i10) : c(fVar, layoutInflater.inflate(i10, viewGroup, z10), i10);
    }

    public static p j(Activity activity, int i10) {
        return k(activity, i10, null);
    }

    public static p k(Activity activity, int i10, f fVar) {
        activity.setContentView(i10);
        return e(fVar, (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content), 0, i10);
    }
}
