package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import com.google.api.client.http.HttpStatusCodes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f35275a = 504;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f35276b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f35277c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f35278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f35279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Context f35280f;

    public static void a(Context context, String str) {
        if (f35280f == null) {
            f35280f = context;
        }
        int i10 = f35275a;
        if (i10 == 102 || i10 == 202 || i10 == 200) {
            return;
        }
        f35279e = System.currentTimeMillis();
        f35278d = false;
        f35276b = str;
        f35275a = 102;
        ar.b(new ao(context, 301, null));
    }

    public static void b() {
        Context context = f35280f;
        if (context != null) {
            ar.b(new ao(context, 301, null));
            f35275a = 102;
            com.pgl.ssdk.ces.b bVarE = com.pgl.ssdk.ces.b.e();
            if (bVarE != null) {
                bVarE.a("");
            }
        }
    }

    public static synchronized String a() {
        try {
            if (TextUtils.isEmpty(f35277c)) {
                f35277c = (String) com.pgl.ssdk.ces.a.meta(HttpStatusCodes.STATUS_CODE_SEE_OTHER, f35280f, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f35277c;
    }

    public static synchronized Object a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return com.pgl.ssdk.ces.a.meta(302, f35280f, bArr);
    }
}
