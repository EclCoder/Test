package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f35333a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f35334b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f35335c = "api16-access-ttp.tiktokpangle.us";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f35336d = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f35337e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f35338f = "";

    public static String a() {
        return f35333a == 1 ? "VA" : "SG";
    }

    public static String b() {
        return f35338f;
    }

    public static void a(int i10) {
        f35333a = i10;
    }

    public static void b(String str) {
        f35338f = str;
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f35334b = str;
    }

    public static void b(Context context) {
        if (TextUtils.isEmpty(f35334b)) {
            au.a("updateIndex");
            int i10 = f35337e;
            if (i10 < Integer.MAX_VALUE) {
                int i11 = i10 + 1;
                f35337e = i11;
                ax.b(context, "domain_index", i11);
                return;
            }
            f35337e = 0;
        }
    }

    public static String a(Context context) {
        if (!TextUtils.isEmpty(f35334b)) {
            return f35334b;
        }
        try {
            if (f35337e == Integer.MIN_VALUE) {
                f35337e = ax.a(context, "domain_index", 0);
            }
            String[] strArr = f35336d;
            return strArr[f35337e % strArr.length];
        } catch (Throwable unused) {
            return f35335c;
        }
    }
}
