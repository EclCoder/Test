package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ViewGroup.MarginLayoutParams f7650b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayoutManager f7651a;

    /* JADX INFO: renamed from: androidx.viewpager2.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0098a implements Comparator {
        C0098a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f7650b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    a(LinearLayoutManager linearLayoutManager) {
        this.f7651a = linearLayoutManager;
    }

    private boolean a() {
        int top;
        int i10;
        int bottom;
        int i11;
        int childCount = this.f7651a.getChildCount();
        if (childCount == 0) {
            return true;
        }
        boolean z10 = this.f7651a.getOrientation() == 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, childCount, 2);
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = this.f7651a.getChildAt(i12);
            if (childAt == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f7650b;
            int[] iArr2 = iArr[i12];
            if (z10) {
                top = childAt.getLeft();
                i10 = marginLayoutParams.leftMargin;
            } else {
                top = childAt.getTop();
                i10 = marginLayoutParams.topMargin;
            }
            iArr2[0] = top - i10;
            int[] iArr3 = iArr[i12];
            if (z10) {
                bottom = childAt.getRight();
                i11 = marginLayoutParams.rightMargin;
            } else {
                bottom = childAt.getBottom();
                i11 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i11;
        }
        Arrays.sort(iArr, new C0098a());
        for (int i13 = 1; i13 < childCount; i13++) {
            if (iArr[i13 - 1][1] != iArr[i13][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i14 = iArr4[1];
        int i15 = iArr4[0];
        return i15 <= 0 && iArr[childCount - 1][1] >= i14 - i15;
    }

    private boolean b() {
        int childCount = this.f7651a.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (c(this.f7651a.getChildAt(i10))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (c(viewGroup.getChildAt(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean d() {
        return (!a() || this.f7651a.getChildCount() <= 1) && b();
    }
}
