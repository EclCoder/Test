package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f15342a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashSet f15343b = gl.s0.e("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    private p() {
    }

    public static final boolean a(Context context, String packageName) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(packageName, "packageName");
        String brand = Build.BRAND;
        int i10 = context.getApplicationInfo().flags;
        kotlin.jvm.internal.s.g(brand, "brand");
        if (bm.r.N(brand, "generic", false, 2, null) && (i10 & 2) != 0) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                kotlin.jvm.internal.s.g(signatureArr, "packageInfo.signatures");
                if (signatureArr.length != 0) {
                    Signature[] signatureArr2 = packageInfo.signatures;
                    kotlin.jvm.internal.s.g(signatureArr2, "packageInfo.signatures");
                    for (Signature signature : signatureArr2) {
                        HashSet hashSet = f15343b;
                        byte[] byteArray = signature.toByteArray();
                        kotlin.jvm.internal.s.g(byteArray, "it.toByteArray()");
                        if (!gl.r.U(hashSet, e1.H0(byteArray))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
