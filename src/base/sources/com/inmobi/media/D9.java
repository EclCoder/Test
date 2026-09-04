package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.location.Location;
import androidx.core.app.NotificationCompat;
import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class D9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24643a;

    public D9(String url) {
        kotlin.jvm.internal.s.h(url, "url");
        kotlin.jvm.internal.s.h(url, "url");
        this.f24643a = url;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    public static void a(LinkedHashMap linkedHashMap) {
        boolean z10;
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        if (AbstractC3085k5.a(Xi.f26021a) != null) {
            C3136m4 c3136m4 = AbstractC2878c4.f26300a;
            kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
            if (((AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class)).getCctEnabled()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        linkedHashMap.put("cct-enabled", String.valueOf(z10));
    }

    public static void c(LinkedHashMap linkedHashMap) {
        SharedPreferences sharedPreferencesA;
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        String strValueOf = "";
        if (Xi.f26021a != null && (sharedPreferencesA = AbstractC3047ij.a()) != null && sharedPreferencesA.contains("IABGPP_HDR_GppString")) {
            strValueOf = String.valueOf(sharedPreferencesA.getString("IABGPP_HDR_GppString", ""));
        }
        if (J3.a(strValueOf)) {
            linkedHashMap.put("gpp", strValueOf);
        }
    }

    public static void d(LinkedHashMap linkedHashMap) {
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        C3350ub c3350ub = C3350ub.f27616a;
        HashMap map = new HashMap();
        C3484zh c3484zh = AbstractC3229pj.f27269a;
        Location locationA = (Xi.b() == null || AbstractC3229pj.a().getLocationEnabled()) ? C3350ub.a() : null;
        HashMap mapA = locationA != null ? C3350ub.a(locationA, true, Sf.a(Xi.f26021a, "android.permission.ACCESS_FINE_LOCATION") ? C3350ub.a(1, 3) : null) : C3350ub.a(AbstractC2891ch.b(), false, null);
        for (Map.Entry entry : mapA.entrySet()) {
            map.put((String) entry.getKey(), entry.getValue().toString());
        }
        linkedHashMap.putAll(map);
        C3350ub c3350ub2 = C3350ub.f27616a;
        HashMap map2 = new HashMap();
        String str = "DENIED";
        if (C3350ub.d() && C3350ub.e()) {
            str = "AUTHORISED";
        }
        Locale ENGLISH = Locale.ENGLISH;
        kotlin.jvm.internal.s.g(ENGLISH, "ENGLISH");
        String lowerCase = str.toLowerCase(ENGLISH);
        kotlin.jvm.internal.s.g(lowerCase, "toLowerCase(...)");
        map2.put("loc-consent-status", lowerCase);
        linkedHashMap.putAll(map2);
    }

    public static void e(LinkedHashMap linkedHashMap) {
        JSONObject jSONObject;
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        C2944ej c2944ej = C2944ej.f26502a;
        c2944ej.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (C2944ej.a(0)) {
            linkedHashMap2.put("st", Long.valueOf(C2944ej.f26507f));
        }
        if (C2944ej.a(5)) {
            I1 i10 = C2944ej.f26511j;
            zl.k[] kVarArr = C2944ej.f26503b;
            if (((Number) i10.getValue(c2944ej, kVarArr[0])).intValue() != -1) {
                linkedHashMap2.put("cnt", Integer.valueOf(((Number) i10.getValue(c2944ej, kVarArr[0])).intValue()));
            }
        }
        if (C2944ej.a(6)) {
            I1 i11 = C2944ej.f26512k;
            zl.k[] kVarArr2 = C2944ej.f26503b;
            if (((Number) i11.getValue(c2944ej, kVarArr2[1])).intValue() != -1) {
                linkedHashMap2.put("u-ret", Integer.valueOf(((Number) i11.getValue(c2944ej, kVarArr2[1])).intValue()));
            }
        }
        List listL0 = gl.r.L0(C2944ej.f26508g);
        if (!C2944ej.a(1)) {
            listL0.set(0, -1);
        }
        if (!C2944ej.a(2)) {
            listL0.set(1, -1);
        }
        if (!C2944ej.a(3)) {
            listL0.set(2, -1);
        }
        if (!C2944ej.a(4)) {
            listL0.set(3, -1);
        }
        if (!(listL0 instanceof Collection) || !listL0.isEmpty()) {
            Iterator it = listL0.iterator();
            while (it.hasNext()) {
                if (((Number) it.next()).intValue() != -1) {
                    linkedHashMap2.put("dep", listL0);
                    break;
                }
            }
        }
        try {
            jSONObject = new JSONObject(linkedHashMap2);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        if (jSONObject.length() > 0) {
            String string = jSONObject.toString();
            kotlin.jvm.internal.s.g(string, "toString(...)");
            linkedHashMap.put("sData", string);
        }
    }

    public static void b(LinkedHashMap linkedHashMap) {
        fl.q qVar;
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        B5.f24500a.getClass();
        fl.q qVarK = B5.k();
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        if (qVarK != null) {
            linkedHashMap.put(qVarK.h(), qVarK.i());
        }
        fl.q qVarM = B5.m();
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        if (qVarM != null) {
            linkedHashMap.put(qVarM.h(), qVarM.i());
        }
        fl.q qVar2 = B5.f24509j;
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        if (qVar2 != null) {
            linkedHashMap.put(qVar2.h(), qVar2.i());
        }
        Context context = Xi.f26021a;
        fl.q qVar3 = null;
        if (context == null) {
            qVar = null;
        } else {
            Intent intentA = J3.a(context, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            qVar = new fl.q("d-bat-chrg", (intentA != null ? intentA.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1) : -1) == 2 ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
        }
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        if (qVar != null) {
            linkedHashMap.put(qVar.h(), qVar.i());
        }
        fl.q qVarQ = B5.q();
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        if (qVarQ != null) {
            linkedHashMap.put(qVarQ.h(), qVarQ.i());
        }
        fl.q qVarH = B5.h();
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        if (qVarH != null) {
            linkedHashMap.put(qVarH.h(), qVarH.i());
        }
        Context context2 = Xi.f26021a;
        if (context2 != null) {
            Intent intentA2 = J3.a(context2, (BroadcastReceiver) null, new IntentFilter(obFGmWgqyy.zddDNfEEesimFyz));
            qVar3 = (intentA2 == null || intentA2.getIntExtra("state", 0) != 1) ? new fl.q("d-w-h", MBridgeConstans.ENDCARD_URL_TYPE_PL) : new fl.q("d-w-h", "1");
        }
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        if (qVar3 != null) {
            linkedHashMap.put(qVar3.h(), qVar3.i());
        }
        fl.q qVarI = B5.i();
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        if (qVarI != null) {
            linkedHashMap.put(qVarI.h(), qVarI.i());
        }
        fl.q qVarJ = B5.j();
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        if (qVarJ != null) {
            linkedHashMap.put(qVarJ.h(), qVarJ.i());
        }
        fl.q qVarF = B5.f();
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        if (qVarF != null) {
            linkedHashMap.put(qVarF.h(), qVarF.i());
        }
        fl.q qVarL = B5.l();
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        if (qVarL != null) {
            linkedHashMap.put(qVarL.h(), qVarL.i());
        }
    }

    public static JSONObject a(String str) throws JSONException {
        if (kotlin.jvm.internal.s.c(str, "banner")) {
            return C2883c9.f26313c.a();
        }
        if (kotlin.jvm.internal.s.c(MimeTypes.BASE_TYPE_AUDIO, str)) {
            Z8 z10 = Z8.f26132c;
            JSONObject jSONObject = new JSONObject();
            long j10 = z10.f26525a / 1000;
            if (j10 != 0) {
                jSONObject.put("a-lastAudioPlayedTs", String.valueOf(j10));
            }
            int i10 = z10.f26526b;
            if (i10 > 0) {
                jSONObject.put("a-audioFreq", String.valueOf(i10));
            }
            Context context = Xi.f26021a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                La laA = Ka.a(context, "audio_pref_file");
                kotlin.jvm.internal.s.h("user_mute_count", "key");
                int i11 = laA.f25198a.getInt("user_mute_count", -1);
                if (i11 > 0) {
                    jSONObject.put("a-umc", String.valueOf(i11));
                }
            }
            return jSONObject;
        }
        return new JSONObject();
    }
}
