package com.pgl.ssdk.ces.out;

import com.pgl.ssdk.aw;
import com.pgl.ssdk.ces.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class PglSupport {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f35388a;

    static {
        aw.b("nms");
    }

    public static String getBootid() {
        String str;
        String str2 = f35388a;
        if (str2 != null) {
            return str2;
        }
        try {
            if (!aw.a("nms") || (str = (String) a.meta(172, null, null)) == null) {
                return "";
            }
            f35388a = str;
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }
}
