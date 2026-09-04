package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SharedPreferences f35353a;

    public static String a(Context context, String str) {
        return a(context, str, "");
    }

    public static void b(Context context, String str, String str2) {
        SharedPreferences sharedPreferencesA = a(context);
        if (sharedPreferencesA != null) {
            sharedPreferencesA.edit().putString(str, str2).apply();
        }
    }

    public static String a(Context context, String str, String str2) {
        SharedPreferences sharedPreferencesA = a(context);
        return sharedPreferencesA != null ? sharedPreferencesA.getString(str, str2) : str2;
    }

    public static void b(Context context, String str, int i10) {
        SharedPreferences sharedPreferencesA = a(context);
        if (sharedPreferencesA != null) {
            sharedPreferencesA.edit().putInt(str, i10).apply();
        }
    }

    public static int a(Context context, String str, int i10) {
        SharedPreferences sharedPreferencesA = a(context);
        return sharedPreferencesA != null ? sharedPreferencesA.getInt(str, i10) : i10;
    }

    public static void b(Context context, String str, long j10) {
        SharedPreferences sharedPreferencesA = a(context);
        if (sharedPreferencesA != null) {
            sharedPreferencesA.edit().putLong(str, j10).apply();
        }
    }

    public static long a(Context context, String str, long j10) {
        SharedPreferences sharedPreferencesA = a(context);
        return sharedPreferencesA != null ? sharedPreferencesA.getLong(str, j10) : j10;
    }

    public static SharedPreferences a(Context context) {
        if (f35353a == null) {
            f35353a = context.getSharedPreferences("ss_config", 0);
        }
        return f35353a;
    }
}
