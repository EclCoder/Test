package com.inmobi.media;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.firebase.installations.ktx.gUsI.dmHT;
import com.inmobi.media.Kk;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import com.mbridge.msdk.foundation.download.Command;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Kk {
    public static String a(Map map, String str) throws JSONException {
        Map map2;
        String string;
        C3348u9 c3348u9A = Sh.a("getToken", "AB");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (map != null) {
            String str2 = (String) map.get("tp");
            if (!TextUtils.isEmpty(str2)) {
                Yi.f26090b = str2;
            }
            String str3 = (String) map.get("tp-v");
            if (!TextUtils.isEmpty(str3)) {
                Yi.f26089a = str3;
            }
        }
        a();
        if (!Xi.d()) {
            if (c3348u9A != null) {
                kotlin.jvm.internal.s.g("com.inmobi.media.Kk", "LOG_TAG");
                c3348u9A.b("com.inmobi.media.Kk", "InMobi SDK is not initialised. Cannot fetch a token.");
            }
            a(90, jCurrentTimeMillis, c3348u9A);
            return null;
        }
        Context context = Xi.f26021a;
        C3173nf c3173nf = context != null ? new C3173nf(context, c3348u9A) : null;
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(RootConfig.class, "clazz");
        C3136m4 c3136m5 = AbstractC2878c4.f26300a;
        if (((RootConfig) c3136m5.a(RootConfig.class)).getMonetizationDisabled()) {
            a(2012, jCurrentTimeMillis, c3348u9A);
            if (c3348u9A != null) {
                kotlin.jvm.internal.s.g("com.inmobi.media.Kk", "LOG_TAG");
                c3348u9A.b("com.inmobi.media.Kk", "Monetization disabled. cannot provide token");
            }
            return null;
        }
        kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
        Rk uidMap = new Rk(((AdConfig) c3136m5.a(AdConfig.class)).getIncludeIds());
        Lk metaData = new Lk(str, map);
        C3121lf c3121lfA = c3173nf != null ? c3173nf.a() : null;
        kotlin.jvm.internal.s.h(uidMap, "uidMap");
        kotlin.jvm.internal.s.h(metaData, "metaData");
        kotlin.jvm.internal.s.h("https://www.123.com", "url");
        kotlin.jvm.internal.s.h("https://www.123.com", "url");
        kotlin.jvm.internal.s.h(SignalsConfig.class, "clazz");
        SignalsConfig signalsConfig = (SignalsConfig) c3136m5.a(SignalsConfig.class);
        LinkedHashMap payload = new LinkedHashMap();
        String strA = B8.a();
        if (strA != null) {
        }
        kotlin.jvm.internal.s.h(payload, "<this>");
        C2998gl c2998glA = AbstractC2972fl.a();
        String str4 = c2998glA.f26633a;
        if (str4 != null) {
        }
        payload.put("is-unifid-service-used", String.valueOf(c2998glA.f26634b));
        D9.d(payload);
        payload.put("d-media-volume", String.valueOf(B5.f24500a.a(Xi.f26021a, false)));
        payload.putAll(uidMap.a());
        String str5 = metaData.f25221a;
        if (str5 != null) {
        }
        HashMap map3 = new HashMap();
        map3.putAll(AbstractC2852b4.f26244a);
        payload.putAll(map3);
        Map map4 = metaData.f25222b;
        kotlin.jvm.internal.s.h(payload, "<this>");
        if (map4 != null) {
            for (Map.Entry entry : map4.entrySet()) {
                String str6 = (String) entry.getKey();
                String str7 = (String) entry.getValue();
                if (!payload.containsKey(str6)) {
                    payload.put(str6, str7);
                }
            }
        }
        kotlin.jvm.internal.s.h(payload, "<this>");
        C3136m4 c3136m6 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(SignalsConfig.class, "clazz");
        JSONObject ext = ((SignalsConfig) AbstractC2878c4.f26300a.a(SignalsConfig.class)).getExt();
        if (ext != null && ext.length() > 0) {
            String string2 = ext.toString();
            kotlin.jvm.internal.s.g(string2, "toString(...)");
            payload.put(KPtaxpyICj.VcyzZtEdNRGtyO, string2);
        }
        kotlin.jvm.internal.s.h(payload, "<this>");
        B5 b10 = B5.f24500a;
        b10.getClass();
        if (B5.s()) {
            if (N5.f25317e) {
                string = null;
            } else {
                string = N5.f25315c;
                if (string == null) {
                    Context context2 = Xi.f26021a;
                    if (context2 == null) {
                        string = null;
                    } else {
                        ConcurrentHashMap concurrentHashMap = La.f25197b;
                        La laA = Ka.a(context2, "display_info_store");
                        kotlin.jvm.internal.s.h("gesture_margin", "key");
                        string = laA.f25198a.getString("gesture_margin", null);
                    }
                    N5.f25315c = string;
                }
            }
            if (string != null) {
                payload.put("d-device-gesture-margins", string);
            }
        }
        D9.c(payload);
        D9.e(payload);
        D9.a(payload);
        D9.b(payload);
        payload.put("h-user-agent", Xi.c());
        kotlin.jvm.internal.s.h(payload, "<this>");
        String str8 = AbstractC2942eh.f26496a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str9 = AbstractC2942eh.f26496a;
        if (str9 != null) {
            linkedHashMap.put("u-nip", str9);
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap != null) {
            payload.putAll(linkedHashMap);
        }
        payload.putAll(AbstractC2891ch.a());
        payload.putAll(N5.c());
        payload.putAll(P2.a());
        if (c3121lfA != null && (map2 = c3121lfA.f26945a) != null) {
            payload.putAll(map2);
        }
        kotlin.jvm.internal.s.h(payload, "<this>");
        fl.k kVar = E0.f24685c;
        if (!((CopyOnWriteArrayList) kVar.getValue()).isEmpty()) {
            String string3 = new JSONArray((Collection) kVar.getValue()).toString();
            kotlin.jvm.internal.s.g(string3, "toString(...)");
            payload.put("u-r-crid", string3);
        }
        JSONObject jSONObjectA = C2883c9.f26313c.a();
        if (jSONObjectA.length() > 0) {
            String string4 = jSONObjectA.toString();
            kotlin.jvm.internal.s.g(string4, "toString(...)");
            payload.put("audioObject", string4);
        }
        AppSetIdInfo appSetIdInfo = B1.f24495a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        B1.a(linkedHashMap2);
        payload.putAll(linkedHashMap2);
        if (signalsConfig.getPublisher().getEnableAB()) {
            kotlin.jvm.internal.s.h(payload, "<this>");
            JSONObject jSONObjectE = Xg.f26013a.e();
            if (jSONObjectE.length() > 0) {
                String string5 = jSONObjectE.toString();
                kotlin.jvm.internal.s.g(string5, "toString(...)");
                payload.put("extData", string5);
            }
        }
        kotlin.jvm.internal.s.h(payload, "<this>");
        payload.put("u-appsecure", String.valueOf((int) A1.f24434f));
        kotlin.jvm.internal.s.h(payload, "<this>");
        if (O4.e() && J3.a(O4.d())) {
            payload.put(dmHT.YvB, O4.f25398f);
            payload.put("c_data", O4.d());
            Context context3 = Xi.f26021a;
            int i10 = 1;
            if (context3 != null) {
                ConcurrentHashMap concurrentHashMap2 = La.f25197b;
                La laA2 = Ka.a(context3, "c_data_store");
                kotlin.jvm.internal.s.h("akv", "key");
                i10 = laA2.f25198a.getInt("akv", 1);
            }
            payload.put("aKV", String.valueOf(i10));
        }
        kotlin.jvm.internal.s.h(payload, "<this>");
        JSONObject jSONObjectB = AbstractC2829a7.b();
        if (jSONObjectB != null) {
            String string6 = jSONObjectB.toString();
            kotlin.jvm.internal.s.g(string6, "toString(...)");
            payload.put("consentObject", string6);
        }
        kotlin.jvm.internal.s.h(payload, "<this>");
        payload.putAll(A1.f24433e);
        payload.putAll(b10.a(false));
        payload.putAll(D8.a());
        kotlin.jvm.internal.s.h(payload, "mHttpHeaders");
        payload.put(Command.HTTP_HEADER_USER_AGENT, Xi.c());
        kotlin.jvm.internal.s.h(payload, "payload");
        if (!AbstractC2829a7.a()) {
            if (c3348u9A != null) {
                kotlin.jvm.internal.s.g("com.inmobi.media.Kk", "LOG_TAG");
                c3348u9A.b("com.inmobi.media.Kk", "get Signals failed - GDPR Compliance");
            }
            a(2141, jCurrentTimeMillis, c3348u9A);
            return null;
        }
        a(jCurrentTimeMillis, c3348u9A);
        if (c3348u9A != null) {
            kotlin.jvm.internal.s.g("com.inmobi.media.Kk", "LOG_TAG");
            c3348u9A.a("com.inmobi.media.Kk", "get signals success");
        }
        byte[] bArrEncode = Base64.encode(new xn.e().N(J3.a(payload)).l0(), 8);
        kotlin.jvm.internal.s.g(bArrEncode, "encode(...)");
        return new String(bArrEncode, bm.d.f9079b);
    }

    public static final void b() {
        HashMap mapJ = gl.l0.j(fl.w.a("networkType", B5.o()), fl.w.a("plType", "AB"));
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b("AdGetSignalsCalled", mapJ, EnumC3281rk.SDK);
    }

    public static void a(final int i10, final long j10, C3348u9 c3348u9) {
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("com.inmobi.media.Kk", "LOG_TAG");
            c3348u9.c("com.inmobi.media.Kk", "submitAdGetSignalsFailed - errorCode - " + i10 + ", startTime - " + j10);
        }
        Runnable runnable = new Runnable() { // from class: yh.a2
            @Override // java.lang.Runnable
            public final void run() {
                Kk.a(j10, i10);
            }
        };
        Context context = Xi.f26021a;
        kotlin.jvm.internal.s.h(runnable, "runnable");
        Xi.f26027g.submit(runnable);
        if (c3348u9 != null) {
            c3348u9.a();
        }
    }

    public static final void a(long j10, int i10) {
        HashMap mapJ = gl.l0.j(fl.w.a("latency", Long.valueOf(System.currentTimeMillis() - j10)), fl.w.a("networkType", B5.o()), fl.w.a("errorCode", Integer.valueOf(i10)), fl.w.a("plType", "AB"));
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b("AdGetSignalsFailed", mapJ, EnumC3281rk.SDK);
    }

    public static void a(final long j10, C3348u9 c3348u9) {
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("com.inmobi.media.Kk", "LOG_TAG");
            c3348u9.c("com.inmobi.media.Kk", "submitAdGetSignalsSucceeded - startTime - " + j10);
        }
        Runnable runnable = new Runnable() { // from class: yh.b2
            @Override // java.lang.Runnable
            public final void run() {
                Kk.a(j10);
            }
        };
        Context context = Xi.f26021a;
        kotlin.jvm.internal.s.h(runnable, "runnable");
        Xi.f26027g.submit(runnable);
        if (c3348u9 != null) {
            c3348u9.a();
        }
    }

    public static final void a(long j10) {
        HashMap mapJ = gl.l0.j(fl.w.a("latency", Long.valueOf(System.currentTimeMillis() - j10)), fl.w.a("networkType", B5.o()), fl.w.a("plType", "AB"));
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b("AdGetSignalsSucceeded", mapJ, EnumC3281rk.SDK);
    }

    public static void a() {
        Runnable runnable = new Runnable() { // from class: yh.z1
            @Override // java.lang.Runnable
            public final void run() {
                Kk.b();
            }
        };
        Context context = Xi.f26021a;
        kotlin.jvm.internal.s.h(runnable, "runnable");
        Xi.f26027g.submit(runnable);
    }
}
