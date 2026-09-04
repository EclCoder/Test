package n0;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final WindowInsets f46756a = k1.f46650b.D();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static boolean f46757b = false;

    public static /* synthetic */ WindowInsets a(WindowInsets[] windowInsetsArr, View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
        windowInsetsArr[0] = onApplyWindowInsetsListener != null ? onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets) : view.onApplyWindowInsets(windowInsets);
        return f46756a;
    }

    static WindowInsets b(View view, WindowInsets windowInsets) {
        Object tag = view.getTag(b0.c.M);
        Object tag2 = view.getTag(b0.c.U);
        final View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = tag instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag : tag2 instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag2 : null;
        final WindowInsets[] windowInsetsArr = {f46756a};
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: n0.u0
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets2) {
                return v0.a(windowInsetsArr, onApplyWindowInsetsListener, view2, windowInsets2);
            }
        });
        view.dispatchApplyWindowInsets(windowInsets);
        Object tag3 = view.getTag(b0.c.L);
        if (tag3 instanceof View.OnApplyWindowInsetsListener) {
            onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) tag3;
        }
        view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        WindowInsets windowInsets2 = windowInsetsArr[0];
        if (windowInsets2 != null && !windowInsets2.isConsumed() && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                b(viewGroup.getChildAt(i10), windowInsetsArr[0]);
            }
        }
        WindowInsets windowInsets3 = windowInsetsArr[0];
        return windowInsets3 != null ? windowInsets3 : f46756a;
    }

    public static boolean c(ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }
}
