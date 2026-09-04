package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.android.billingclient.api.BillingClient;
import com.inmobi.media.AbstractC2942eh;
import com.inmobi.media.C2968fh;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.eh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2942eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f26496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C3304sh f26497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f26498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fl.k f26499d = fl.l.b(new tl.a() { // from class: yh.n8
        @Override // tl.a
        public final Object invoke() {
            return Boolean.valueOf(AbstractC2942eh.c());
        }
    });

    public static void a() {
        La laA;
        Context context = Xi.f26021a;
        String string = null;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = La.f25197b;
            laA = Ka.a(context, "purchase_store");
        } else {
            laA = null;
        }
        if (laA != null) {
            kotlin.jvm.internal.s.h("purchase_pref", "key");
            string = laA.f25198a.getString("purchase_pref", null);
        }
        if (string != null) {
            f26496a = string;
        }
    }

    public static void b() {
        try {
            Context context = Xi.f26021a;
            if (context == null) {
                return;
            }
            C3136m4 c3136m4 = AbstractC2878c4.f26300a;
            kotlin.jvm.internal.s.h(SignalsConfig.class, "clazz");
            if (((SignalsConfig) AbstractC2878c4.f26300a.a(SignalsConfig.class)).getPurchases().getInapp()) {
                a();
                if (a(context)) {
                    f26498c = 1;
                    C3304sh c3304sh = new C3304sh();
                    f26497b = c3304sh;
                    c3304sh.a(context, new Function1() { // from class: yh.o8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC2942eh.a((C2968fh) obj);
                        }
                    });
                }
            }
        } catch (Exception e10) {
            fl.k kVar = W9.f25935a;
            W9.a(new M2(e10));
            e10.getMessage();
        }
    }

    public static final boolean c() {
        return true;
    }

    public static final fl.g0 a(C2968fh c2968fh) throws JSONException {
        La laA;
        f26498c = 2;
        if (c2968fh == null) {
            C3304sh c3304sh = f26497b;
            if (c3304sh != null) {
                c3304sh.f27468a = null;
                BillingClient billingClient = c3304sh.f27469b;
                if (billingClient != null) {
                    billingClient.c();
                }
            }
            f26497b = null;
            return fl.g0.f38750a;
        }
        c2968fh.toString();
        JSONObject jSONObject = new JSONObject();
        int i10 = c2968fh.f26560a;
        if (i10 > 0) {
            jSONObject.put(TtmlNode.TAG_P, i10);
        }
        int i11 = c2968fh.f26561b;
        if (i11 > 0) {
            jSONObject.put("s", i11);
        }
        String nipMapJSON = jSONObject.length() == 0 ? null : jSONObject.toString();
        if (nipMapJSON != null) {
            f26496a = nipMapJSON;
            kotlin.jvm.internal.s.h(nipMapJSON, "nipMapJSON");
            kotlin.jvm.internal.s.h(nipMapJSON, "nipMapJSON");
            Context context = Xi.f26021a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                laA = Ka.a(context, "purchase_store");
            } else {
                laA = null;
            }
            if (laA != null) {
                ConcurrentHashMap concurrentHashMap2 = La.f25197b;
                laA.a("purchase_pref", nipMapJSON, false);
            }
        }
        C3304sh c3304sh2 = f26497b;
        if (c3304sh2 != null) {
            c3304sh2.f27468a = null;
            BillingClient billingClient2 = c3304sh2.f27469b;
            if (billingClient2 != null) {
                billingClient2.c();
            }
        }
        f26497b = null;
        return fl.g0.f38750a;
    }

    public static boolean b(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            kotlin.jvm.internal.s.g(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("com.google.android.play.billingclient.version") : null;
            C3136m4 c3136m4 = AbstractC2878c4.f26300a;
            kotlin.jvm.internal.s.h(SignalsConfig.class, "clazz");
            boolean zU = gl.r.U(((SignalsConfig) AbstractC2878c4.f26300a.a(SignalsConfig.class)).getPurchases().getVersionList(), string);
            if (!zU) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (string == null) {
                    string = "";
                }
                linkedHashMap.put("trigger", string);
                C3178nk c3178nk = C3178nk.f27064a;
                C3178nk.b("BillingClientNotCompatible", linkedHashMap, EnumC3281rk.SDK);
            }
            return zU;
        } catch (Exception e10) {
            fl.k kVar = W9.f25935a;
            W9.a(new M2(e10));
            e10.getMessage();
            return false;
        }
    }

    public static boolean a(Context context) {
        short s10;
        kotlin.jvm.internal.s.h(context, "context");
        B5.f24500a.getClass();
        if (!B5.x()) {
            return false;
        }
        if (!((Boolean) f26499d.getValue()).booleanValue()) {
            AbstractC3097kh.a(new C3020hh((short) 2230));
            return false;
        }
        if (!b(context)) {
            return false;
        }
        int i10 = f26498c;
        if (i10 != 1 && i10 != 2) {
            return true;
        }
        if (i10 != 1) {
            s10 = i10 != 2 ? (short) 0 : (short) 2232;
        } else {
            s10 = 2231;
        }
        AbstractC3097kh.a(new C3020hh(s10));
        return false;
    }
}
