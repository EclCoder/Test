package com.bytedance.sdk.openadsdk.wu;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import java.lang.ref.WeakReference;
import v7.XOSD.qnwOeeQSSWa;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class ta {
    public static WeakReference<hnj> hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected static final float[] f14807hn = new float[3];
    protected static final float[] qor = new float[3];
    protected static final float[] gjv = new float[9];

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected static final float[] f14808sk = new float[3];

    public static void gjv(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<hnj> weakReference = hnj;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            dse.hnj("SensorHub", "startListenRotationVector err", th2);
        }
    }

    public static void hn(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<hnj> weakReference = hnj;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            dse.hnj("SensorHub", "startListenGyroscope error", th2);
        }
    }

    public static void hnj(Context context, SensorEventListener sensorEventListener) {
    }

    public static void qor(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<hnj> weakReference = hnj;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            dse.hnj("SensorHub", "startListenLinearAcceleration error", th2);
        }
    }

    public static void hnj(hnj hnjVar) {
        hnj = new WeakReference<>(hnjVar);
    }

    public static void hnj(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<hnj> weakReference = hnj;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            dse.hnj("SensorHub", qnwOeeQSSWa.avKGz, th2);
        }
    }

    public static void hnj(Context context, long j10) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(j10);
    }
}
