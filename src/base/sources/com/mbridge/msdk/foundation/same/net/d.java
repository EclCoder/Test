package com.mbridge.msdk.foundation.same.net;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d {
    public static String a(String str) {
        String strB = b(str);
        return TextUtils.isEmpty(strB) ? "" : c1.a(strB);
    }

    public static String b(String str) {
        g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        return com.mbridge.msdk.foundation.same.net.utils.d.h().a(str, TextUtils.isEmpty(str) ? gVarD.t0() : gVarD.C());
    }
}
