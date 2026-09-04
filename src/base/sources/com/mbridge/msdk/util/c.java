package com.mbridge.msdk.util;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.GoogleApiAvailability;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import java.util.ArrayList;
import ud.qoRq.WwUgngZLNA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f33969a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f33970b = "";

    private static String b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pair.create(1, "org.chromium.net.impl.JavaCronetProvider"));
        arrayList.add(Pair.create(2, "org.chromium.net.impl.NativeCronetProvider"));
        arrayList.add(Pair.create(3, "com.google.android.gms.net.PlayServicesCronetProvider"));
        arrayList.add(Pair.create(4, "com.google.android.gms.net.GmsCoreCronetProvider"));
        try {
            StringBuilder sb2 = new StringBuilder();
            ClassLoader classLoader = com.mbridge.msdk.foundation.controller.c.n().d().getClassLoader();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                Pair pair = (Pair) obj;
                try {
                    if (!TextUtils.isEmpty(classLoader.loadClass((String) pair.second).getConstructor(Context.class).newInstance(com.mbridge.msdk.foundation.controller.c.n().d()).getClass().getName())) {
                        if (sb2.length() > 0) {
                            sb2.append(",");
                        }
                        sb2.append(pair.first);
                    }
                } catch (Throwable th2) {
                    q0.b("CronetEnvCheckUtil", th2.getMessage());
                }
            }
            return sb2.toString();
        } catch (Throwable th3) {
            q0.b("CronetEnvCheckUtil", th3.getMessage());
            return "";
        }
    }

    public static boolean c() {
        return s0.a().a("cronet_env_check", false);
    }

    public static void a() {
        String str = WwUgngZLNA.TKDojloYhBx;
        if (c()) {
            try {
                GoogleApiAvailability.getInstance().getApkVersion(com.mbridge.msdk.foundation.controller.c.n().d());
                GoogleApiAvailability.getInstance().verifyGooglePlayServicesIsAvailable(com.mbridge.msdk.foundation.controller.c.n().d(), 11925000);
                try {
                    String strB = b();
                    boolean zIsEmpty = TextUtils.isEmpty(strB);
                    f33969a = !zIsEmpty;
                    if (zIsEmpty) {
                        return;
                    }
                    f33970b = strB;
                } catch (Throwable th2) {
                    q0.b(str, th2.getMessage());
                }
            } catch (Throwable th3) {
                q0.b(str, th3.getMessage());
                f33969a = false;
            }
        }
    }
}
