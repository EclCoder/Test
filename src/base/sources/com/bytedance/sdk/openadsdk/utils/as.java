package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class as {
    /* JADX INFO: Access modifiers changed from: private */
    public static com.bytedance.sdk.openadsdk.jip.hnj.hn hn(String str, int i10, com.bytedance.sdk.openadsdk.core.model.as asVar) {
        com.bytedance.sdk.openadsdk.jip.hnj.hn hnVar = new com.bytedance.sdk.openadsdk.jip.hnj.hn();
        hnVar.hnj(str);
        hnVar.hnj(asVar);
        hnVar.hn(orp.hnj(asVar));
        hnVar.hnj(i10);
        hnVar.hnj(false);
        hnVar.hn(asVar.rg());
        return hnVar;
    }

    public static boolean hnj(Context context, String str, com.bytedance.sdk.openadsdk.core.model.as asVar, String str2, boolean z10) {
        if (!(context instanceof Activity)) {
            Activity activityHn = com.bytedance.sdk.openadsdk.core.jip.hnj().sk().hn();
            if (activityHn != null && hnj(activityHn)) {
                context = activityHn;
            }
        } else if (!hnj((Activity) context)) {
            context = null;
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.oj.hnj();
        }
        if (context == null) {
            return false;
        }
        orp.hnj(asVar);
        if (!com.bytedance.sdk.component.utils.oj.hnj(str)) {
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(hn(str2, 5, asVar));
            return false;
        }
        String strHn = com.bytedance.sdk.openadsdk.core.model.as.hn(context, asVar);
        if (TextUtils.isEmpty(strHn)) {
            return hn(context, str, asVar, str2, z10);
        }
        try {
            d.C0018d c0018d = new d.C0018d();
            c0018d.p(false);
            c0018d.n(2);
            try {
                d dVarA = c0018d.a();
                if (!(context instanceof Activity)) {
                    dVarA.f1834a.addFlags(268435456);
                }
                com.bytedance.sdk.openadsdk.core.hnj.hnj.hnj(context, strHn, dVarA, Uri.parse(str));
                if (context instanceof TTBaseActivity) {
                    ((TTBaseActivity) context).qor(true);
                }
                com.bytedance.sdk.openadsdk.jip.hnj.hn hnVarHn = hn(str2, 100, asVar);
                hnVarHn.hnj(true);
                hnVarHn.hn(8);
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(hnVarHn);
            } catch (Throwable th2) {
                String message = th2.getMessage();
                com.bytedance.sdk.component.utils.apu.qor("OpenUtils", message);
                com.bytedance.sdk.openadsdk.jip.hnj.hn hnVarHn2 = hn(str2, 13, asVar);
                hnVarHn2.qor(message);
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(hnVarHn2);
                hn(context, str, asVar, str2, true);
            }
            return true;
        } catch (Throwable th3) {
            String message2 = th3.getMessage();
            com.bytedance.sdk.component.utils.apu.qor("OpenUtils", message2);
            com.bytedance.sdk.openadsdk.jip.hnj.hn hnVarHn3 = hn(str2, 12, asVar);
            hnVarHn3.qor(message2);
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(hnVarHn3);
            return hn(context, str, asVar, str2, z10);
        }
    }

    private static boolean hn(Context context, String str, final com.bytedance.sdk.openadsdk.core.model.as asVar, final String str2, boolean z10) {
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            intent.setData(Uri.parse(str));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return com.bytedance.sdk.component.utils.hn.hnj(context, intent, new com.bytedance.sdk.component.utils.hn.InterfaceC0195hn() { // from class: com.bytedance.sdk.openadsdk.utils.as.1
                @Override // com.bytedance.sdk.component.utils.hn.InterfaceC0195hn
                public void hnj() {
                    com.bytedance.sdk.openadsdk.jip.hnj.hn hnVarHn = as.hn(str2, 100, asVar);
                    hnVarHn.hnj(true);
                    hnVarHn.hn(2);
                    com.bytedance.sdk.openadsdk.gjv.qor.hnj(hnVarHn);
                }

                @Override // com.bytedance.sdk.component.utils.hn.InterfaceC0195hn
                public void hnj(Throwable th2) {
                    String message = th2.getMessage();
                    com.bytedance.sdk.openadsdk.jip.hnj.hn hnVarHn = as.hn(str2, 7, asVar);
                    hnVarHn.qor(message);
                    hnVarHn.hn(2);
                    com.bytedance.sdk.openadsdk.gjv.qor.hnj(hnVarHn);
                }
            }, z10);
        } catch (Throwable th2) {
            String message = th2.getMessage();
            com.bytedance.sdk.openadsdk.jip.hnj.hn hnVarHn = hn(str2, 6, asVar);
            hnVarHn.qor(message);
            hnVarHn.hn(2);
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(hnVarHn);
            return false;
        }
    }

    public static boolean hnj(Context context, String str, com.bytedance.sdk.openadsdk.core.model.as asVar, String str2) {
        if (context instanceof Activity) {
            if (!hnj((Activity) context)) {
                context = null;
            }
        } else {
            Activity activityHn = com.bytedance.sdk.openadsdk.core.jip.hnj().sk().hn();
            if (activityHn != null && hnj(activityHn)) {
                context = activityHn;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.oj.hnj();
        }
        Context context2 = context;
        if (context2 == null || !hnj(str)) {
            return false;
        }
        new Intent("android.intent.action.VIEW").setData(Uri.parse(str));
        HashMap map = new HashMap();
        map.put("deeplink_url", str);
        map.put("jsb_deeplink", 1);
        return com.bytedance.sdk.openadsdk.eum.hnj.hnj.hnj.hnj(context2, str, asVar, orp.hn(asVar), map, true);
    }

    public static boolean hnj(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static boolean hnj(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }
}
