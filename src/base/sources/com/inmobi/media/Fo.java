package com.inmobi.media;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import java.util.Map;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Fo {
    public static boolean a(WebView view, RenderProcessGoneDetail renderProcessGoneDetail, String str) {
        kotlin.jvm.internal.s.h(view, "view");
        String str2 = CIdIVqKnNZ.kVSTCle;
        kotlin.jvm.internal.s.h(str, str2);
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Map mapM = gl.l0.m(fl.w.a(str2, str), fl.w.a("isCrashed", Boolean.valueOf(renderProcessGoneDetail != null ? renderProcessGoneDetail.didCrash() : false)));
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b("WebViewRenderProcessGoneEvent", mapM, EnumC3281rk.SDK);
        view.destroy();
        return true;
    }
}
