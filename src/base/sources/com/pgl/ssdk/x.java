package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraManager;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f35424a = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(Context context) {
        int i10 = f35424a;
        if (i10 != -1) {
            return i10;
        }
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        if (cameraManager != null) {
            try {
                f35424a = cameraManager.getCameraIdList().length;
            } catch (Throwable unused) {
                f35424a = -1;
            }
        } else {
            f35424a = -2;
        }
        return f35424a;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x.f35424a = x.b(z.a());
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putInt(CIdIVqKnNZ.rzXoOjeXAY, x.f35424a).apply();
            }
        }
    }

    public static int a() {
        int i10;
        int i11 = f35424a;
        if (i11 != -1) {
            return i11;
        }
        SharedPreferences sharedPreferencesA = ax.a(z.a());
        if (sharedPreferencesA == null || (i10 = sharedPreferencesA.getInt("camera_count", -1)) == -1) {
            ar.b(new a());
            return -1;
        }
        f35424a = i10;
        return i10;
    }
}
