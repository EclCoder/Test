package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class z implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f7766a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f7767b;

    static {
        String simpleName = z.class.getSimpleName();
        kotlin.jvm.internal.s.g(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f7767b = simpleName;
    }

    private z() {
    }

    private final DisplayCutout e(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (x.a(obj)) {
                return y.a(obj);
            }
        } catch (ClassNotFoundException e10) {
            Log.w(f7767b, e10);
        } catch (IllegalAccessException e11) {
            Log.w(f7767b, e11);
        } catch (InstantiationException e12) {
            Log.w(f7767b, e12);
        } catch (NoSuchFieldException e13) {
            Log.w(f7767b, e13);
        } catch (NoSuchMethodException e14) {
            Log.w(f7767b, e14);
        } catch (InvocationTargetException e15) {
            Log.w(f7767b, e15);
        }
        return null;
    }

    private final int f(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final void h(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    public v a(Activity activity) {
        Rect rectC;
        kotlin.jvm.internal.s.h(activity, "activity");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            rectC = b.f7694a.a(activity);
        } else if (i10 >= 29) {
            rectC = d(activity);
        } else {
            rectC = i10 >= 28 ? c(activity) : b(activity);
        }
        return new v(rectC);
    }

    public final Rect b(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!a.f7693a.a(activity)) {
            kotlin.jvm.internal.s.g(defaultDisplay, "defaultDisplay");
            Point pointG = g(defaultDisplay);
            int iF = f(activity);
            int i10 = rect.bottom;
            if (i10 + iF == pointG.y) {
                rect.bottom = i10 + iF;
                return rect;
            }
            int i11 = rect.right;
            if (i11 + iF == pointG.x) {
                rect.right = i11 + iF;
            }
        }
        return rect;
    }

    public final Rect c(Activity activity) {
        DisplayCutout displayCutoutE;
        kotlin.jvm.internal.s.h(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (a.f7693a.a(activity)) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException e10) {
            Log.w(f7767b, e10);
            h(activity, rect);
        } catch (NoSuchFieldException e11) {
            Log.w(f7767b, e11);
            h(activity, rect);
        } catch (NoSuchMethodException e12) {
            Log.w(f7767b, e12);
            h(activity, rect);
        } catch (InvocationTargetException e13) {
            Log.w(f7767b, e13);
            h(activity, rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        c cVar = c.f7695a;
        kotlin.jvm.internal.s.g(currentDisplay, "currentDisplay");
        cVar.a(currentDisplay, point);
        a aVar = a.f7693a;
        if (!aVar.a(activity)) {
            int iF = f(activity);
            int i10 = rect.bottom;
            if (i10 + iF == point.y) {
                rect.bottom = i10 + iF;
            } else {
                int i11 = rect.right;
                if (i11 + iF == point.x) {
                    rect.right = i11 + iF;
                } else if (rect.left == iF) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !aVar.a(activity) && (displayCutoutE = e(currentDisplay)) != null) {
            int i12 = rect.left;
            d dVar = d.f7696a;
            if (i12 == dVar.b(displayCutoutE)) {
                rect.left = 0;
            }
            if (point.x - rect.right == dVar.c(displayCutoutE)) {
                rect.right += dVar.c(displayCutoutE);
            }
            if (rect.top == dVar.d(displayCutoutE)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == dVar.a(displayCutoutE)) {
                rect.bottom += dVar.a(displayCutoutE);
            }
        }
        return rect;
    }

    public final Rect d(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            if (objInvoke != null) {
                return new Rect((Rect) objInvoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException e10) {
            Log.w(f7767b, e10);
            return c(activity);
        } catch (NoSuchFieldException e11) {
            Log.w(f7767b, e11);
            return c(activity);
        } catch (NoSuchMethodException e12) {
            Log.w(f7767b, e12);
            return c(activity);
        } catch (InvocationTargetException e13) {
            Log.w(f7767b, e13);
            return c(activity);
        }
    }

    public final Point g(Display display) {
        kotlin.jvm.internal.s.h(display, "display");
        Point point = new Point();
        c.f7695a.a(display, point);
        return point;
    }
}
