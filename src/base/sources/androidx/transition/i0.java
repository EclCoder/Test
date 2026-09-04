package androidx.transition;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f7410a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    private static int d(x xVar, int i10) {
        int[] iArr;
        if (xVar == null || (iArr = (int[]) xVar.f7464a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i10];
    }

    @Override // androidx.transition.u
    public void a(x xVar) {
        View view = xVar.f7465b;
        Integer numValueOf = (Integer) xVar.f7464a.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        xVar.f7464a.put("android:visibilityPropagation:visibility", numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iRound + (view.getWidth() / 2);
        int iRound2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iRound2;
        iArr[1] = iRound2 + (view.getHeight() / 2);
        xVar.f7464a.put("android:visibilityPropagation:center", iArr);
    }

    @Override // androidx.transition.u
    public String[] b() {
        return f7410a;
    }

    public int e(x xVar) {
        Integer num;
        if (xVar == null || (num = (Integer) xVar.f7464a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(x xVar) {
        return d(xVar, 0);
    }

    public int g(x xVar) {
        return d(xVar, 1);
    }
}
