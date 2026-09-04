package nh;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.models.Resolution;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public static int a(Context context, int i10) {
        return (int) TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static void b(Activity activity) {
        if (activity.getResources().getConfiguration().smallestScreenWidthDp >= 600) {
            activity.setRequestedOrientation(10);
        } else {
            activity.setRequestedOrientation(1);
        }
    }

    public static Resolution c() {
        Point point = new Point();
        ((WindowManager) AzRecorderApp.e().getSystemService("window")).getDefaultDisplay().getRealSize(point);
        return new Resolution("device", Math.max(point.x, point.y), Math.min(point.x, point.y));
    }

    public static float d(Context context) {
        return f(context).density;
    }

    public static int e(Context context) {
        return f(context).heightPixels;
    }

    public static DisplayMetrics f(Context context) {
        return context.getResources().getDisplayMetrics();
    }

    public static int g(Context context) {
        return f(context).widthPixels;
    }

    public static int h(Context context) {
        return Math.round((g(context) * 1.0f) / d(context));
    }

    public static int i(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int j(Context context) {
        return (int) ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRefreshRate();
    }

    public static Pair k(Context context) {
        int iWidth;
        int iHeight;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            iWidth = bounds.width();
            iHeight = bounds.height();
        } else {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            iWidth = i10;
            iHeight = i11;
        }
        return new Pair(Integer.valueOf(iWidth), Integer.valueOf(iHeight));
    }

    public static int l(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? ((DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation() : ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public static int m(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int n(int i10) {
        int iFloor = (int) Math.floor(i10 * c().c());
        return iFloor % 2 == 1 ? iFloor + 1 : iFloor;
    }

    public static boolean o(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }

    public static boolean p(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f10 = displayMetrics.widthPixels;
        float f11 = displayMetrics.heightPixels;
        if (f10 != 0.0f && f11 != 0.0f) {
            if ((f10 > f11 ? f10 / f11 : f11 / f10) <= 1.2f) {
                return true;
            }
        }
        return false;
    }

    public static boolean q(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        return rotation == 2 || rotation == 3;
    }
}
