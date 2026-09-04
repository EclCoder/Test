package kc;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f43162a = {R.attr.state_pressed};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f43163b = {R.attr.state_focused};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f43164c = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f43165d = {R.attr.state_selected};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f43166e = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f43167f = a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr = f43163b;
        return new ColorStateList(new int[][]{f43165d, iArr, StateSet.NOTHING}, new int[]{c(colorStateList, f43164c), c(colorStateList, iArr), c(colorStateList, f43162a)});
    }

    private static int b(int i10) {
        return e0.a.k(i10, Math.min(Color.alpha(i10) * 2, 255));
    }

    private static int c(ColorStateList colorStateList, int[] iArr) {
        return b(colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0);
    }

    public static ColorStateList d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f43166e, 0)) != 0) {
            Log.w(f43167f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean e(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
