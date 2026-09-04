package jc;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b {
    public static TypedValue a(Context context, int i10) {
        return b(context.getTheme(), i10);
    }

    public static TypedValue b(Resources.Theme theme, int i10) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean c(Context context, int i10, boolean z10) {
        return d(context.getTheme(), i10, z10);
    }

    public static boolean d(Resources.Theme theme, int i10, boolean z10) {
        TypedValue typedValueB = b(theme, i10);
        if (typedValueB == null || typedValueB.type != 18) {
            return z10;
        }
        return typedValueB.data != 0;
    }

    public static float e(Resources.Theme theme, int i10, float f10) {
        TypedValue typedValueB = b(theme, i10);
        return (typedValueB == null || typedValueB.type != 5) ? f10 : typedValueB.getDimension(theme.getResources().getDisplayMetrics());
    }

    public static int f(Context context, int i10, int i11) {
        float fE = e(context.getTheme(), i10, Float.NaN);
        return Float.isNaN(fE) ? (int) context.getResources().getDimension(i11) : (int) fE;
    }

    public static int g(Context context, int i10, int i11) {
        return h(context.getTheme(), i10, i11);
    }

    public static int h(Resources.Theme theme, int i10, int i11) {
        TypedValue typedValueB = b(theme, i10);
        return (typedValueB == null || typedValueB.type != 16) ? i11 : typedValueB.data;
    }

    public static int i(Context context) {
        return f(context, sb.c.J, sb.e.V0);
    }

    public static int j(Context context, int i10, String str) {
        return l(context, i10, str).data;
    }

    public static int k(View view, int i10) {
        return m(view, i10).data;
    }

    public static TypedValue l(Context context, int i10, String str) {
        TypedValue typedValueA = a(context, i10);
        if (typedValueA != null) {
            return typedValueA;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }

    public static TypedValue m(View view, int i10) {
        return l(view.getContext(), i10, view.getClass().getCanonicalName());
    }
}
