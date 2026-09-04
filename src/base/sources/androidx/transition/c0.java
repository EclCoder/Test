package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f7361a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f7362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f7363c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {
        static float a(View view) {
            return view.getTransitionAlpha();
        }

        static void b(View view, float f10) {
            view.setTransitionAlpha(f10);
        }
    }

    c0() {
    }

    public float b(View view) {
        if (f7361a) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                f7361a = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void d(View view, int i10, int i11, int i12, int i13);

    public void e(View view, float f10) {
        if (f7361a) {
            try {
                a.b(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                f7361a = false;
            }
        }
        view.setAlpha(f10);
    }

    public void f(View view, int i10) {
        if (!f7363c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f7362b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f7363c = true;
        }
        Field field = f7362b;
        if (field != null) {
            try {
                f7362b.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void g(View view, Matrix matrix);

    public abstract void h(View view, Matrix matrix);

    public void a(View view) {
    }

    public void c(View view) {
    }
}
