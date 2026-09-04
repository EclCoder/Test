package com.inmobi.media;

import android.content.Context;
import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import com.google.android.gms.appset.AppSetIdInfo;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
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
import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: renamed from: com.inmobi.media.p0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3210p0 extends D9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rk f27154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3158n0 f27155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Gk f27156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3121lf f27157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3348u9 f27158f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3210p0(String str, Rk rk2, C3158n0 metaData, Gk timeoutConfig, C3121lf c3121lf, C3348u9 c3348u9, boolean z10) {
        super(str == null ? AdConfig.DEFAULT_AD_SERVER_URL : str);
        kotlin.jvm.internal.s.h(metaData, "metaData");
        kotlin.jvm.internal.s.h(timeoutConfig, "timeoutConfig");
        this.f27154b = rk2;
        this.f27155c = metaData;
        this.f27156d = timeoutConfig;
        this.f27157e = c3121lf;
        this.f27158f = c3348u9;
    }

    public final Te a() throws JSONException {
        String string;
        Map map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = Xi.f26023c;
        if (str == null) {
            throw new IllegalArgumentException("Account Id cannot be null");
        }
        linkedHashMap.put("account_id", str);
        linkedHashMap.putAll(N5.c());
        String str2 = A1.f24430b;
        if (str2 != null) {
        }
        linkedHashMap.put("client-request-id", this.f27155c.f27016a);
        linkedHashMap.put("sdk-flavor", "row");
        this.f27155c.getClass();
        linkedHashMap.put("format", "unifiedSdkJson");
        String str3 = this.f27155c.f27020e;
        if (str3 != null) {
        }
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        C2998gl c2998glA = AbstractC2972fl.a();
        String str4 = c2998glA.f26633a;
        if (str4 != null) {
        }
        linkedHashMap.put("is-unifid-service-used", String.valueOf(c2998glA.f26634b));
        long j10 = this.f27155c.f27018c;
        if (j10 != Long.MIN_VALUE) {
            linkedHashMap.put("im-plid", String.valueOf(j10));
        }
        D9.d(linkedHashMap);
        linkedHashMap.putAll(P2.a());
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        linkedHashMap.putAll(P2.b());
        linkedHashMap.putAll(P2.c());
        C3121lf c3121lf = this.f27157e;
        if (c3121lf != null && (map = c3121lf.f26945a) != null) {
            linkedHashMap.putAll(map);
        }
        HashMap map2 = new HashMap();
        map2.putAll(AbstractC2852b4.f26244a);
        linkedHashMap.putAll(map2);
        String str5 = this.f27155c.f27022g;
        if (str5 != null) {
        }
        Map map3 = this.f27155c.f27021f;
        if (map3 != null) {
            linkedHashMap.putAll(map3);
        }
        this.f27155c.getClass();
        linkedHashMap.put("int-origin", "im");
        D9.c(linkedHashMap);
        D9.e(linkedHashMap);
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        fl.k kVar = E0.f24685c;
        if (!((CopyOnWriteArrayList) kVar.getValue()).isEmpty()) {
            String string2 = new JSONArray((Collection) kVar.getValue()).toString();
            kotlin.jvm.internal.s.g(string2, "toString(...)");
            linkedHashMap.put("u-r-crid", string2);
        }
        linkedHashMap.put("m10n_context", kotlin.jvm.internal.s.c("others", this.f27155c.f27019d) ? "M10N_CONTEXT_OTHER" : "M10N_CONTEXT_ACTIVITY");
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        B5.f24500a.getClass();
        if (B5.s()) {
            if (N5.f25317e) {
                string = null;
            } else {
                string = N5.f25315c;
                if (string == null) {
                    Context context = Xi.f26021a;
                    if (context == null) {
                        string = null;
                    } else {
                        ConcurrentHashMap concurrentHashMap = La.f25197b;
                        La laA = Ka.a(context, "display_info_store");
                        String key = SVWsZyNSAChGIA.czaJXwIACQ;
                        kotlin.jvm.internal.s.h(key, "key");
                        string = laA.f25198a.getString(key, null);
                    }
                    N5.f25315c = string;
                }
            }
            if (string != null) {
                linkedHashMap.put("d-device-gesture-margins", string);
            }
        }
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(SignalsConfig.class, "clazz");
        JSONObject ext = ((SignalsConfig) AbstractC2878c4.f26300a.a(SignalsConfig.class)).getExt();
        if (ext != null && ext.length() > 0) {
            String string3 = ext.toString();
            kotlin.jvm.internal.s.g(string3, "toString(...)");
            linkedHashMap.put("im-ext", string3);
        }
        Map map4 = this.f27155c.f27017b;
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        if (map4 != null) {
            for (Map.Entry entry : map4.entrySet()) {
                String str6 = (String) entry.getKey();
                String str7 = (String) entry.getValue();
                if (!linkedHashMap.containsKey(str6)) {
                    linkedHashMap.put(str6, str7);
                }
            }
        }
        D9.a(linkedHashMap);
        C3158n0 metaData = this.f27155c;
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        kotlin.jvm.internal.s.h(metaData, "metaData");
        String str8 = metaData.f27020e;
        if (str8 != null && D9.a(str8).length() > 0) {
            String string4 = D9.a(str8).toString();
            kotlin.jvm.internal.s.g(string4, "toString(...)");
            linkedHashMap.put("audioObject", string4);
        }
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        String str9 = AbstractC2942eh.f26496a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str10 = AbstractC2942eh.f26496a;
        if (str10 != null) {
            linkedHashMap2.put("u-nip", str10);
        } else {
            linkedHashMap2 = null;
        }
        if (linkedHashMap2 != null) {
            linkedHashMap.putAll(linkedHashMap2);
        }
        linkedHashMap.putAll(AbstractC2891ch.a());
        AppSetIdInfo appSetIdInfo = B1.f24495a;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        B1.a(linkedHashMap3);
        linkedHashMap.putAll(linkedHashMap3);
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        if (O4.e() && J3.a(O4.d())) {
            linkedHashMap.put("ik", O4.f25398f);
            linkedHashMap.put("c_data", O4.d());
            Context context2 = Xi.f26021a;
            int i10 = 1;
            if (context2 != null) {
                ConcurrentHashMap concurrentHashMap2 = La.f25197b;
                La laA2 = Ka.a(context2, PvZsvNiPV.GpaRNritupJgA);
                kotlin.jvm.internal.s.h("akv", "key");
                i10 = laA2.f25198a.getInt("akv", 1);
            }
            linkedHashMap.put("aKV", String.valueOf(i10));
        }
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        linkedHashMap.put("u-appsecure", String.valueOf((int) A1.f24434f));
        Rk rk2 = this.f27154b;
        HashMap mapA = rk2 != null ? rk2.a() : null;
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        if (mapA != null) {
            for (Map.Entry entry2 : mapA.entrySet()) {
                linkedHashMap.put((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        C3136m4 c3136m5 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(SignalsConfig.class, "clazz");
        if (((SignalsConfig) AbstractC2878c4.f26300a.a(SignalsConfig.class)).getPublisher().getEnableMCO()) {
            kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
            JSONObject jSONObjectE = Xg.f26013a.e();
            if (jSONObjectE.length() > 0) {
                String string5 = jSONObjectE.toString();
                kotlin.jvm.internal.s.g(string5, "toString(...)");
                linkedHashMap.put("extData", string5);
            }
        }
        D9.b(linkedHashMap);
        boolean z10 = this.f27155c.f27023h;
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        linkedHashMap.putAll(A1.f24433e);
        linkedHashMap.putAll(B5.f24500a.a(z10));
        linkedHashMap.putAll(D8.a());
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        JSONObject jSONObjectB = AbstractC2829a7.b();
        if (jSONObjectB != null) {
            String string6 = jSONObjectB.toString();
            kotlin.jvm.internal.s.g(string6, "toString(...)");
            linkedHashMap.put("consentObject", string6);
        }
        this.f27155c.getClass();
        C3348u9 c3348u9 = this.f27158f;
        if (c3348u9 != null) {
            c3348u9.c("AdNetworkRequest", linkedHashMap.toString());
        }
        String str11 = this.f24643a;
        LinkedHashMap mHttpHeaders = new LinkedHashMap();
        kotlin.jvm.internal.s.h(mHttpHeaders, "mHttpHeaders");
        mHttpHeaders.put(Command.HTTP_HEADER_USER_AGENT, Xi.c());
        return new Te(str11, mHttpHeaders, this.f27156d, new C2881c7(linkedHashMap), null, 48);
    }
}
