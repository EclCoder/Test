package com.google.api.client.extensions.android;

import android.os.Build;
import com.google.api.client.util.Preconditions;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class AndroidUtils {
    private AndroidUtils() {
    }

    public static void checkMinimumSdkLevel(int i10) {
        Preconditions.checkArgument(isMinimumSdkLevel(i10), "running on Android SDK level %s but requires minimum %s", Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(i10));
    }

    public static boolean isMinimumSdkLevel(int i10) {
        return Build.VERSION.SDK_INT >= i10;
    }
}
