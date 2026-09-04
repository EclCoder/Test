package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.s;
import com.mbridge.msdk.thrid.okhttp.y;
import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class i {
    public static String a(y yVar, Proxy.Type type) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(yVar.e());
        sb2.append(' ');
        if (b(yVar, type)) {
            sb2.append(yVar.g());
        } else {
            sb2.append(a(yVar.g()));
        }
        sb2.append(" HTTP/1.1");
        return sb2.toString();
    }

    private static boolean b(y yVar, Proxy.Type type) {
        return !yVar.d() && type == Proxy.Type.HTTP;
    }

    public static String a(s sVar) {
        String strC = sVar.c();
        String strE = sVar.e();
        if (strE == null) {
            return strC;
        }
        return strC + '?' + strE;
    }
}
