package com.bytedance.sdk.openadsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Picture;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class sq {
    private static ViewConfiguration aq = null;
    private static final Object bug = new Object();
    private static int dkl = -1;
    private static Boolean dnm = null;
    private static WindowManager dse = null;
    private static int gjv = -1;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static int f14712hn = -1;
    private static float hnj = -1.0f;
    private static int ojm = -1;
    private static boolean orl = true;
    private static float qor = -1.0f;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private static int f14713sk = -1;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private static float f14714ta = -1.0f;

    public static float aq(Context context) {
        hnj(context, true);
        return hnj;
    }

    public static int bug(Context context) {
        return ((Integer) dnm(context).second).intValue();
    }

    public static int dkl(Context context) {
        if (context == null) {
            com.bytedance.sdk.openadsdk.core.oj.hnj();
        }
        if (context == null) {
            return dkl;
        }
        if (context.getResources() != null && context.getResources().getConfiguration() != null) {
            dkl = context.getResources().getConfiguration().smallestScreenWidthDp;
        }
        return dkl;
    }

    public static int dse(Context context) {
        hnj(context);
        return qor(context, f14713sk);
    }

    public static boolean fc(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static int gjv(Context context) {
        hnj(context);
        return qor(context, gjv);
    }

    private static boolean hnj(int i10) {
        return i10 == 0 || i10 == 8 || i10 == 4;
    }

    public static boolean jip(Context context) {
        String str = Build.MODEL;
        return str.equals("IN2010") || str.equals("IN2020") || str.equals("KB2000") || str.startsWith("ONEPLUS");
    }

    public static boolean mjg(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", null).invoke(clsLoadClass, null)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static boolean oj(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static float ojm(Context context) {
        hnj(context);
        return qor;
    }

    public static int orl(Context context) {
        return ((Integer) dnm(context).first).intValue();
    }

    private static boolean qor() {
        return hnj < 0.0f || f14712hn < 0 || qor < 0.0f || gjv < 0 || f14713sk < 0;
    }

    public static int sk(Context context) {
        hnj(context);
        return f14713sk;
    }

    public static int ta(Context context) {
        hnj(context);
        return f14712hn;
    }

    public static boolean uua(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            String string = identifier > 0 ? resources.getString(identifier) : null;
            return (string == null || TextUtils.isEmpty(string)) ? false : true;
        } catch (Exception unused) {
        }
    }

    public static Pair<Integer, Integer> dnm(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.oj.hnj();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService(lkCBSIFlvmyGX.rBDBpVSRswRkOK)).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    public static int hn(Context context, float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return Float.valueOf(hnj(context, f10, true)).intValue();
    }

    public static void hnj(Context context) {
        hnj(context, false);
    }

    public static int qor(Context context, float f10) {
        hnj(context, true);
        float fAq = aq(context);
        if (fAq <= 0.0f) {
            fAq = 1.0f;
        }
        return (int) ((f10 / fAq) + 0.5f);
    }

    public static void dse(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static boolean gjv(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static int[] hn(Context context) {
        if (context == null) {
            return null;
        }
        if (dse == null) {
            dse = (WindowManager) com.bytedance.sdk.openadsdk.core.oj.hnj().getSystemService("window");
        }
        int[] iArr = new int[2];
        WindowManager windowManager = dse;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            try {
                Point point = new Point();
                Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                i10 = point.x;
                i11 = point.y;
            } catch (Exception unused) {
            }
            iArr[0] = i10;
            iArr[1] = i11;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics2.widthPixels;
            iArr[1] = displayMetrics2.heightPixels;
        }
        return iArr;
    }

    public static void hnj(Context context, boolean z10) {
        Context contextHnj = context == null ? com.bytedance.sdk.openadsdk.core.oj.hnj() : context;
        if (contextHnj == null) {
            return;
        }
        dse = (WindowManager) contextHnj.getSystemService("window");
        if (qor() || z10) {
            DisplayMetrics displayMetrics = contextHnj.getResources().getDisplayMetrics();
            hnj = displayMetrics.density;
            f14712hn = displayMetrics.densityDpi;
            qor = displayMetrics.scaledDensity;
            gjv = displayMetrics.widthPixels;
            f14713sk = displayMetrics.heightPixels;
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            return;
        }
        Configuration configuration = context.getResources().getConfiguration();
        if (configuration.orientation == 1) {
            int i10 = gjv;
            int i11 = f14713sk;
            if (i10 > i11) {
                gjv = i11;
                f14713sk = i10;
            }
        } else {
            int i12 = gjv;
            int i13 = f14713sk;
            if (i12 < i13) {
                gjv = i13;
                f14713sk = i12;
            }
        }
        dkl = configuration.smallestScreenWidthDp;
    }

    public static void sk(View view) {
        if (view == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.sq.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    sq.hnj(view2, 8);
                    view2.setAlpha(1.0f);
                }
            }
        });
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.start();
    }

    public static boolean gjv(Activity activity) {
        DisplayCutout displayCutout;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
                if (rootWindowInsets != null) {
                    displayCutout = rootWindowInsets.getDisplayCutout();
                    orl = false;
                } else {
                    displayCutout = null;
                }
                if (displayCutout != null) {
                    return true;
                }
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.apu.qor("UIUtils", e10.getMessage());
            }
        }
        return false;
    }

    public static int qor(Context context) {
        hnj(context);
        return gjv;
    }

    public static int[] qor(View view) {
        if (view != null) {
            return new int[]{view.getWidth(), view.getHeight()};
        }
        return null;
    }

    public static void dkl(View view) {
        if (view == null) {
            return;
        }
        hnj(view, 0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.sq.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }

    public static boolean qor(Activity activity) {
        if (dnm == null) {
            synchronized (bug) {
                try {
                    if (dnm == null) {
                        String strHnj = com.bytedance.sdk.openadsdk.as.sk.hnj("cutout_devices", "");
                        String str = Build.MODEL;
                        if (!TextUtils.isEmpty(strHnj) && !TextUtils.isEmpty(str)) {
                            try {
                                JSONArray jSONArray = new JSONArray(strHnj);
                                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                    if (str.equals(jSONArray.getString(i10))) {
                                        dnm = Boolean.TRUE;
                                        return true;
                                    }
                                }
                            } catch (Exception e10) {
                                com.bytedance.sdk.component.utils.apu.qor("UIUtils", e10.getMessage());
                            }
                        }
                        dnm = Boolean.valueOf(gjv(activity) || hnj("ro.miui.notch", activity) == 1 || mjg(activity) || oj(activity) || fc(activity) || jip(activity) || uua(activity));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return dnm.booleanValue();
    }

    public static int[] hn(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static float hnj(Context context, float f10) {
        hnj(context);
        return f10 * ojm(context);
    }

    public static void hn(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(1792);
            activity.getWindow().clearFlags(1792);
        } catch (Exception unused) {
        }
    }

    public static float hnj(Context context, float f10, boolean z10) {
        hnj(context);
        return (f10 * aq(context)) + (z10 ? 0.5f : 0.0f);
    }

    public static int[] hnj(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static boolean hn() {
        return orl && Build.VERSION.SDK_INT >= 28;
    }

    private static Bitmap hn(com.bytedance.sdk.component.ojm.dkl dklVar) {
        if (dklVar == null) {
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dklVar.getWidth(), dklVar.getHeight(), Bitmap.Config.RGB_565);
            dklVar.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void hnj(View view, int i10) {
        if (view == null || view.getVisibility() == i10 || !hnj(i10)) {
            return;
        }
        view.setVisibility(i10);
    }

    public static void hnj(TextView textView, CharSequence charSequence) {
        if (textView == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void qor(final com.bytedance.sdk.openadsdk.core.model.as asVar, String str, String str2, final Bitmap bitmap, final String str3, final long j10) {
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                    com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), asVar, str, str2, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.utils.sq.4
                        @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                        public JSONObject qor() {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                int iHnj = sq.hnj(bitmap);
                                jSONObject.put("url", str3);
                                long j11 = j10;
                                if (j11 != -1) {
                                    jSONObject.put("page_id", j11);
                                }
                                jSONObject.put("render_type", "h5");
                                jSONObject.put("render_type_2", 0);
                                jSONObject.put("is_blank", iHnj == 100 ? 1 : 0);
                                jSONObject.put("is_playable", com.bytedance.sdk.openadsdk.core.model.hqh.hn(asVar) ? 1 : 0);
                                jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.hnj().hnj(asVar) ? 1 : 0);
                            } catch (JSONException unused) {
                            }
                            return jSONObject;
                        }
                    });
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.apu.qor("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>".concat(String.valueOf(th2)));
            }
        }
    }

    private static ArrayList<Integer> hn(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = width * height;
            int[] iArr = new int[i10];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = iArr[i11];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i12) >> 16, (65280 & i12) >> 8, i12 & 255)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void hnj(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        hnj(view, (ViewGroup.MarginLayoutParams) layoutParams, i10, i11, i12, i13);
    }

    private static void hnj(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13) {
        if (view == null || marginLayoutParams == null) {
            return;
        }
        if (marginLayoutParams.leftMargin == i10 && marginLayoutParams.topMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.bottomMargin == i13) {
            return;
        }
        if (i10 != -3) {
            marginLayoutParams.leftMargin = i10;
        }
        if (i11 != -3) {
            marginLayoutParams.topMargin = i11;
        }
        if (i12 != -3) {
            marginLayoutParams.rightMargin = i12;
        }
        if (i13 != -3) {
            marginLayoutParams.bottomMargin = i13;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    public static void hn(View view, final float f10) {
        if (view != null && f10 > 0.0f) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.utils.sq.5
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f10);
                }
            });
            view.setClipToOutline(true);
        }
    }

    private static Bitmap hnj(WebView webView) {
        Bitmap bitmapCreateBitmap = null;
        try {
            Picture pictureCapturePicture = webView.capturePicture();
            bitmapCreateBitmap = Bitmap.createBitmap(pictureCapturePicture.getWidth(), pictureCapturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            pictureCapturePicture.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("UIUtils", th2.getMessage());
            return bitmapCreateBitmap;
        }
    }

    public static float hnj() {
        float f10 = f14714ta;
        if (f10 > 0.0f) {
            return f10;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.oj.hnj().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0.0f;
        }
        float dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        f14714ta = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static void hnj(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(3846);
            activity.getWindow().addFlags(1792);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.apu.qor("UIUtils", e10.getMessage());
        }
    }

    public static int hnj(String str, Activity activity) {
        if (xyo.dkl()) {
            try {
                Class<?> clsLoadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
                return ((Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, new String(str), 0)).intValue();
            } catch (ClassNotFoundException e10) {
                com.bytedance.sdk.component.utils.apu.qor("UIUtils", e10.getMessage());
            } catch (IllegalAccessException e11) {
                com.bytedance.sdk.component.utils.apu.qor("UIUtils", e11.getMessage());
            } catch (IllegalArgumentException e12) {
                com.bytedance.sdk.component.utils.apu.qor("UIUtils", e12.getMessage());
            } catch (NoSuchMethodException e13) {
                com.bytedance.sdk.component.utils.apu.qor("UIUtils", e13.getMessage());
            } catch (InvocationTargetException e14) {
                com.bytedance.sdk.component.utils.apu.qor("UIUtils", e14.getMessage());
            }
        }
        return 0;
    }

    public static void hnj(View view, View.OnClickListener onClickListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.apu.qor("OnclickListener ", str + " is null , can not set OnClickListener !!!");
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public static void hnj(View view, View.OnTouchListener onTouchListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.apu.qor("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    public static void hnj(View view, float f10) {
        if (view == null) {
            return;
        }
        view.setAlpha(f10);
    }

    public static void hnj(TextView textView, com.bytedance.sdk.openadsdk.core.widget.jip jipVar, com.bytedance.sdk.openadsdk.core.model.as asVar) {
        hnj(textView, jipVar, asVar, 14);
    }

    public static void hnj(TextView textView, com.bytedance.sdk.openadsdk.core.widget.jip jipVar, com.bytedance.sdk.openadsdk.core.model.as asVar, int i10) {
        hnj(textView, jipVar, (asVar == null || asVar.zyh() == null) ? -1.0d : asVar.zyh().gjv(), i10);
    }

    public static void hnj(TextView textView, com.bytedance.sdk.openadsdk.core.widget.jip jipVar, double d10, int i10) {
        if (d10 == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            jipVar.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d10)));
            }
            hnj(jipVar, d10, i10);
        }
    }

    public static void hnj(com.bytedance.sdk.openadsdk.core.widget.jip jipVar, double d10, int i10) {
        if (d10 < 0.0d) {
            jipVar.setVisibility(8);
        } else {
            jipVar.setVisibility(0);
            jipVar.hnj(d10, i10);
        }
    }

    public static Bitmap hnj(com.bytedance.sdk.component.ojm.dkl dklVar) {
        WebView webView = dklVar.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, null);
        Bitmap bitmapHn = hn(dklVar);
        if (bitmapHn == null) {
            bitmapHn = hnj(webView);
        }
        webView.setLayerType(layerType, null);
        if (bitmapHn == null) {
            return null;
        }
        return com.bytedance.sdk.component.utils.gjv.hnj(bitmapHn, bitmapHn.getWidth() / 6, bitmapHn.getHeight() / 6);
    }

    public static void hnj(final com.bytedance.sdk.openadsdk.core.model.as asVar, final String str, final String str2, final Bitmap bitmap, final String str3, final long j10) {
        ua.hn(new com.bytedance.sdk.component.aq.hn.qor("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.sq.3
            @Override // java.lang.Runnable
            public void run() {
                sq.qor(asVar, str, str2, bitmap, str3, j10);
            }
        }, 10);
    }

    public static int hnj(Bitmap bitmap) {
        try {
            ArrayList<Integer> arrayListHn = hn(bitmap);
            if (arrayListHn == null) {
                return -1;
            }
            HashMap map = new HashMap();
            int size = arrayListHn.size();
            int iIntValue = 0;
            int i10 = 0;
            while (i10 < size) {
                Integer num = arrayListHn.get(i10);
                i10++;
                Integer num2 = num;
                if (map.containsKey(num2)) {
                    Integer numValueOf = Integer.valueOf(((Integer) map.get(num2)).intValue() + 1);
                    map.remove(num2);
                    map.put(num2, numValueOf);
                } else {
                    map.put(num2, 1);
                }
            }
            int i11 = 0;
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (i11 < iIntValue2) {
                    iIntValue = ((Integer) entry.getKey()).intValue();
                    i11 = iIntValue2;
                }
            }
            if (iIntValue == 0) {
                return -1;
            }
            return (int) ((i11 / ((bitmap.getWidth() * bitmap.getHeight()) * 1.0f)) * 100.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static boolean hnj(float f10, float f11, Context context) {
        if (f10 != -1.0f && f11 != -1.0f) {
            if (aq == null) {
                aq = ViewConfiguration.get(context);
            }
            if (ojm == -1) {
                ojm = aq.getScaledTouchSlop();
            }
            if (f10 - f11 > ojm) {
                return true;
            }
        }
        return false;
    }

    public static void hnj(boolean z10) {
        dnm = Boolean.valueOf(z10);
    }
}
