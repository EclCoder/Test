package com.bytedance.sdk.component.dkl.hnj.hn;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.dkl.hnj.dse;
import com.bytedance.sdk.component.dkl.hnj.hnj.sk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    public static boolean dkl() {
        sk skVarQor = dse.dkl().qor();
        return (skVarQor == null || TextUtils.isEmpty(skVarQor.dkl())) ? false : true;
    }

    public static boolean gjv() {
        sk skVarQor = dse.dkl().qor();
        return (skVarQor == null || TextUtils.isEmpty(skVarQor.sk())) ? false : true;
    }

    private static long hn(int i10, Context context) {
        if (context == null) {
            return i10;
        }
        Runtime runtime = Runtime.getRuntime();
        long jFreeMemory = runtime.freeMemory() / 1048576;
        long jMaxMemory = (runtime.maxMemory() / 1048576) - (runtime.totalMemory() / 1048576);
        if (jMaxMemory <= 0) {
            if (jFreeMemory <= 2) {
                return 1L;
            }
            return jFreeMemory <= 10 ? Math.min(i10, 10) : Math.min((jFreeMemory / 2) * 10, i10);
        }
        long j10 = ((jFreeMemory + jMaxMemory) - 10) / 2;
        if (j10 <= 2) {
            return 1L;
        }
        return j10 <= 10 ? Math.min(i10, 10) : Math.min(j10 * 10, i10);
    }

    public static long hnj(int i10, Context context) {
        return hn(i10, context);
    }

    public static boolean qor() {
        sk skVarQor = dse.dkl().qor();
        return (skVarQor == null || TextUtils.isEmpty(skVarQor.gjv())) ? false : true;
    }

    public static boolean sk() {
        sk skVarQor = dse.dkl().qor();
        return (skVarQor == null || TextUtils.isEmpty(skVarQor.qor())) ? false : true;
    }

    public static boolean hnj() {
        sk skVarQor = dse.dkl().qor();
        return (skVarQor == null || TextUtils.isEmpty(skVarQor.hnj())) ? false : true;
    }

    public static boolean hn() {
        sk skVarQor = dse.dkl().qor();
        return (skVarQor == null || TextUtils.isEmpty(skVarQor.hn())) ? false : true;
    }
}
