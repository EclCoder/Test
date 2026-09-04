package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class CrashUtils {
    private static final String[] zza = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean addDynamiteErrorToDropBox(Context context, Throwable th2) {
        try {
            Preconditions.checkNotNull(context);
            Preconditions.checkNotNull(th2);
            return false;
        } catch (Exception e10) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
            return false;
        }
    }
}
