package com.bytedance.sdk.openadsdk.wu;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk {
    public static int aq = 2;
    public static int bug = 32;
    public static int dkl = 0;
    public static int dnm = 16;
    public static int dse = 1;
    protected static int gjv = 30;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected static String f14804hn = null;
    protected static String hnj = "images";
    public static int ojm = 4;
    protected static int qor = 1;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected static long f14805sk = 15360;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public static int f14806ta = 8;

    public static boolean hn(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    protected static boolean hnj(Context context, String str) {
        return false;
    }

    public static float hn(Context context) {
        if (context == null) {
            return 0.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    protected static Bitmap hnj(String str) {
        byte[] bArrDecode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static boolean hnj(Context context, int i10) {
        boolean zHnj;
        boolean zHnj2;
        if (dkl == 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                zHnj = hnj(context, "android.permission.READ_MEDIA_IMAGES");
                zHnj2 = true;
            } else {
                zHnj = hnj(context, "android.permission.READ_EXTERNAL_STORAGE");
                zHnj2 = hnj(context, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            boolean zHnj3 = hnj(context, "android.permission.CAMERA");
            boolean zHnj4 = hnj(context, "android.permission.RECORD_AUDIO");
            PackageManager packageManager = context.getPackageManager();
            if (zHnj && zHnj2) {
                dkl |= dse;
            }
            if (zHnj3 && packageManager.hasSystemFeature("android.hardware.camera")) {
                dkl |= aq;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                dkl |= ojm;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                dkl |= f14806ta;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                dkl |= dnm;
            }
            if (zHnj4 && packageManager.hasSystemFeature("android.hardware.microphone")) {
                dkl |= bug;
            }
        }
        return (dkl & i10) != 0;
    }

    public static boolean hnj(Context context) {
        boolean z10;
        boolean z11;
        if (Build.VERSION.SDK_INT >= 33) {
            z10 = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        } else {
            z10 = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z11 = false;
            }
            return !z11 && z10;
        }
        z11 = true;
        if (z11) {
        }
    }
}
