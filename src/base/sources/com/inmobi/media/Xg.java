package com.inmobi.media;

import android.content.Context;
import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import com.inmobi.media.Xg;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class Xg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Ig f26016d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ zl.k[] f26014b = {kotlin.jvm.internal.l0.g(new kotlin.jvm.internal.c0(Xg.class, "cachedJson", "getCachedJson()Lorg/json/JSONObject;", 0)), kotlin.jvm.internal.l0.g(new kotlin.jvm.internal.c0(Xg.class, "impressionDepth", "getImpressionDepth()Lorg/json/JSONObject;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Xg f26013a = new Xg();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f26015c = gl.r.o("ban", "int", "rew", "nat");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final I1 f26017e = new I1(new JSONObject(), new tl.a() { // from class: yh.k6
        @Override // tl.a
        public final Object invoke() {
            return Xg.a();
        }
    }, true, true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final I1 f26018f = new I1(new JSONObject(), new tl.a() { // from class: yh.l6
        @Override // tl.a
        public final Object invoke() {
            return Xg.f();
        }
    }, true, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final nm.a f26019g = nm.g.b(false, 1, null);

    public static final JSONObject a(Xg xg2) throws JSONException {
        xg2.getClass();
        JSONObject jSONObject = new JSONObject();
        Iterator<String> itKeys = f26013a.b().keys();
        kotlin.jvm.internal.s.g(itKeys, UHbHibBvYxKnPE.TRndPefYxZsSYuh);
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            kotlin.jvm.internal.s.e(next);
            if (bm.r.N(next, "obj_", false, 2, null) || bm.r.N(next, "auto_", false, 2, null) || bm.r.N(next, "dir_", false, 2, null)) {
                jSONObject.put(next, f26013a.b().opt(next));
            }
        }
        return jSONObject;
    }

    public static final Object b(Xg xg2, Map map, SignalsConfig.PublisherConfig publisherConfig, Vg vg2) throws JSONException {
        xg2.getClass();
        if (!publisherConfig.getDirect().getEnabled()) {
            Sb.a((byte) 1, "PubSignals", "Direct signals are disabled by InMobi");
            return fl.g0.f38750a;
        }
        int count = publisherConfig.getDirect().getCount();
        fl.v vVarC = Yg.c(map, publisherConfig);
        String str = (String) vVarC.d();
        JSONObject jSONObject = (JSONObject) vVarC.g();
        String str2 = (String) vVarC.h();
        if (jSONObject == null) {
            return fl.g0.f38750a;
        }
        xg2.a(str2, "d_i_dep");
        Object objA = xg2.a(Yg.a(xg2.b(), str, jSONObject, count), vg2);
        return objA == ll.b.f() ? objA : fl.g0.f38750a;
    }

    public static final Object c(Xg xg2, Map map, SignalsConfig.PublisherConfig publisherConfig, Vg vg2) throws JSONException {
        xg2.getClass();
        if (!publisherConfig.getObj().getEnabled()) {
            Sb.a((byte) 1, "PubSignals", "Object signals are disabled by InMobi");
            return fl.g0.f38750a;
        }
        int count = publisherConfig.getObj().getCount();
        fl.v vVarB = Yg.b(map, publisherConfig);
        String str = (String) vVarB.d();
        JSONObject jSONObject = (JSONObject) vVarB.g();
        String str2 = (String) vVarB.h();
        if (jSONObject == null) {
            return fl.g0.f38750a;
        }
        xg2.a(str2, "o_i_dep");
        Object objA = xg2.a(Yg.a(xg2.b(), str, jSONObject, count), vg2);
        return objA == ll.b.f() ? objA : fl.g0.f38750a;
    }

    public static final JSONObject f() {
        f26013a.getClass();
        Context context = Xi.f26021a;
        JSONObject jSONObject = null;
        if (context != null) {
            if (f26016d == null) {
                f26016d = new Ig(context, "pub_signals_store");
            }
            Ig ig2 = f26016d;
            if (ig2 == null) {
                kotlin.jvm.internal.s.w("prefDao");
                ig2 = null;
            }
            String strA = ig2.a("imp_depth");
            if (strA != null) {
                jSONObject = new JSONObject(strA);
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public final LinkedHashMap d() {
        JSONObject jSONObjectB = b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeysAnd = c().getObj().getAllowedKeysAnd();
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = c().getAuto().getAllowedKeys();
        List<String> list = f26015c;
        SignalsConfig.PublisherConfig publisherConfigC = c();
        for (String str : list) {
            Yg.a(Yg.a(Yg.a(linkedHashMap, jSONObjectB, "obj_", str, Yg.c(allowedKeysAnd)), jSONObjectB, "auto_", str, Yg.c(allowedKeys)), jSONObjectB, "dir_", str, publisherConfigC.getDirect().getAllowedKeys());
        }
        return linkedHashMap;
    }

    public final JSONObject e() {
        JSONObject jSONObjectB = b();
        JSONObject jSONObject = new JSONObject();
        Iterator<String> itKeys = jSONObjectB.keys();
        kotlin.jvm.internal.s.g(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            kotlin.jvm.internal.s.e(next);
            if (!bm.r.N(next, "obj_", false, 2, null) && !bm.r.N(next, "auto_", false, 2, null) && !bm.r.N(next, "dir_", false, 2, null)) {
                jSONObject.put(next, jSONObjectB.opt(next));
            }
        }
        for (String str : f26015c) {
            f26013a.getClass();
            if (c().getObj().getEnabled()) {
                Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeysAnd = c().getObj().getAllowedKeysAnd();
                ArrayList arrayList = new ArrayList(allowedKeysAnd.size());
                Iterator<Map.Entry<String, SignalsConfig.PublisherConfig.KeyData>> it = allowedKeysAnd.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getValue().getName());
                }
                Yg.a(jSONObject, jSONObjectB, str, "obj_", gl.r.N0(arrayList));
            }
            f26013a.getClass();
            if (c().getAuto().getEnabled()) {
                Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = c().getAuto().getAllowedKeys();
                ArrayList arrayList2 = new ArrayList(allowedKeys.size());
                Iterator<Map.Entry<String, SignalsConfig.PublisherConfig.KeyData>> it2 = allowedKeys.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().getValue().getName());
                }
                Yg.a(jSONObject, jSONObjectB, str, "auto_", gl.r.N0(arrayList2));
            }
            f26013a.getClass();
            if (c().getDirect().getEnabled()) {
                Yg.a(jSONObject, jSONObjectB, str, "dir_", c().getDirect().getAllowedKeys().keySet());
            }
        }
        for (fl.q qVar : gl.r.o(fl.w.a(c().getObj(), "o_i_dep"), fl.w.a(c().getDirect(), "d_i_dep"), fl.w.a(c().getAuto(), "a_i_dep"))) {
            SignalsConfig.PublisherConfig.BaseInputData baseInputData = (SignalsConfig.PublisherConfig.BaseInputData) qVar.d();
            String str2 = (String) qVar.g();
            if (baseInputData.getDepth().getEnabled()) {
                Xg xg2 = f26013a;
                xg2.getClass();
                JSONArray jSONArrayOptJSONArray = ((JSONObject) f26018f.getValue(xg2, f26014b[1])).optJSONArray(str2);
                if (jSONArrayOptJSONArray == null) {
                    Map map = Yg.f26086a;
                    jSONArrayOptJSONArray = new JSONArray();
                    jSONArrayOptJSONArray.put(0);
                    jSONArrayOptJSONArray.put(0);
                    jSONArrayOptJSONArray.put(0);
                    jSONArrayOptJSONArray.put(0);
                }
                jSONObject.put(str2, jSONArrayOptJSONArray);
            }
        }
        jSONObject.toString();
        return jSONObject;
    }

    public static final Object a(Xg xg2, Map map, SignalsConfig.PublisherConfig publisherConfig, Vg vg2) throws JSONException {
        xg2.getClass();
        if (!publisherConfig.getAuto().getEnabled()) {
            return fl.g0.f38750a;
        }
        int count = publisherConfig.getAuto().getCount();
        fl.v vVarA = Yg.a(map, publisherConfig);
        String str = (String) vVarA.d();
        JSONObject jSONObject = (JSONObject) vVarA.g();
        String str2 = (String) vVarA.h();
        if (jSONObject == null) {
            return fl.g0.f38750a;
        }
        xg2.a(str2, "a_i_dep");
        Object objA = xg2.a(Yg.a(xg2.b(), str, jSONObject, count), vg2);
        return objA == ll.b.f() ? objA : fl.g0.f38750a;
    }

    public static SignalsConfig.PublisherConfig c() {
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(SignalsConfig.class, "clazz");
        return ((SignalsConfig) AbstractC2878c4.f26300a.a(SignalsConfig.class)).getPublisher();
    }

    public final JSONObject b() {
        return (JSONObject) f26017e.getValue(this, f26014b[0]);
    }

    public static final JSONObject a() {
        f26013a.getClass();
        Context context = Xi.f26021a;
        JSONObject jSONObject = null;
        if (context != null) {
            if (f26016d == null) {
                f26016d = new Ig(context, "pub_signals_store");
            }
            Ig ig2 = f26016d;
            if (ig2 == null) {
                kotlin.jvm.internal.s.w("prefDao");
                ig2 = null;
            }
            String strA = ig2.a("saved_signals");
            if (strA != null) {
                jSONObject = new JSONObject(strA);
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static void a(Map signals) {
        kotlin.jvm.internal.s.h(signals, "signals");
        try {
            SignalsConfig.PublisherConfig publisherConfigC = c();
            Map map = Yg.f26086a;
            kotlin.jvm.internal.s.h(publisherConfigC, "<this>");
            if (!publisherConfigC.getEnableMCO() && !publisherConfigC.getEnableAB()) {
                Sb.a((byte) 1, "PubSignals", "Publisher signals are disabled from InMobi");
                return;
            }
            em.k.d(H9.f24932e, null, null, new Vg(signals, publisherConfigC, null), 3, null);
        } catch (Exception e10) {
            fl.k kVar = W9.f25935a;
            W9.a(new M2(e10));
            Sb.a((byte) 1, "PubSignals", "Publisher signals could not be saved due to an Internal Error.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(JSONObject jSONObject, kotlin.coroutines.jvm.internal.d dVar) {
        Wg wg2;
        JSONObject jSONObject2;
        nm.a aVar;
        if (dVar instanceof Wg) {
            wg2 = (Wg) dVar;
            int i10 = wg2.f25953e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                wg2.f25953e = i10 - Integer.MIN_VALUE;
            } else {
                wg2 = new Wg(this, dVar);
            }
        } else {
            wg2 = new Wg(this, dVar);
        }
        Object obj = wg2.f25951c;
        Object objF = ll.b.f();
        int i11 = wg2.f25953e;
        try {
            if (i11 == 0) {
                fl.s.b(obj);
                Context context = Xi.f26021a;
                if (context != null) {
                    f26013a.getClass();
                    if (f26016d == null) {
                        f26016d = new Ig(context, "pub_signals_store");
                    }
                    nm.a aVar2 = f26019g;
                    wg2.f25949a = jSONObject;
                    wg2.f25950b = aVar2;
                    wg2.f25953e = 1;
                    if (aVar2.e(null, wg2) == objF) {
                        return objF;
                    }
                    jSONObject2 = jSONObject;
                    aVar = aVar2;
                }
                return fl.g0.f38750a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = wg2.f25950b;
            jSONObject2 = wg2.f25949a;
            fl.s.b(obj);
            Ig ig2 = f26016d;
            if (ig2 == null) {
                kotlin.jvm.internal.s.w("prefDao");
                ig2 = null;
            }
            String value = jSONObject2.toString();
            kotlin.jvm.internal.s.g(value, "toString(...)");
            ig2.getClass();
            kotlin.jvm.internal.s.h("saved_signals", "key");
            kotlin.jvm.internal.s.h(value, "value");
            ig2.f25006a.a("saved_signals", value, true);
            fl.g0 g0Var = fl.g0.f38750a;
            aVar.f(null);
            I1 i12 = f26017e;
            i12.f24976c = i12.f24974a.invoke();
            Sb.a((byte) 2, "PubSignals", "Publisher Signals saved successfully.");
            jSONObject2.toString();
            return fl.g0.f38750a;
        } catch (Throwable th2) {
            aVar.f(null);
            throw th2;
        }
    }

    public static void a(JSONObject jSONObject, String key, JSONArray value) throws JSONException {
        kotlin.jvm.internal.s.h(jSONObject, "<this>");
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(value, "value");
        jSONObject.put(key, value);
        Context context = Xi.f26021a;
        if (context != null) {
            f26013a.getClass();
            if (f26016d == null) {
                f26016d = new Ig(context, "pub_signals_store");
            }
            jSONObject.toString();
            Ig ig2 = f26016d;
            if (ig2 == null) {
                kotlin.jvm.internal.s.w("prefDao");
                ig2 = null;
            }
            String value2 = jSONObject.toString();
            kotlin.jvm.internal.s.g(value2, "toString(...)");
            ig2.getClass();
            kotlin.jvm.internal.s.h("imp_depth", "key");
            kotlin.jvm.internal.s.h(value2, "value");
            La la2 = ig2.f25006a;
            ConcurrentHashMap concurrentHashMap = La.f25197b;
            la2.a("imp_depth", value2, false);
            I1 i10 = f26018f;
            i10.f24976c = i10.f24974a.invoke();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    public final void a(String adFormat, String key) throws JSONException {
        int i10;
        kotlin.jvm.internal.s.h(adFormat, "adFormat");
        kotlin.jvm.internal.s.h(key, "key");
        I1 i11 = f26018f;
        i11.f24976c = i11.f24974a.invoke();
        JSONObject jSONObject = (JSONObject) i11.getValue(this, f26014b[1]);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(key);
        if (jSONArrayOptJSONArray == null) {
            Map map = Yg.f26086a;
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(0);
            jSONArrayOptJSONArray.put(0);
            jSONArrayOptJSONArray.put(0);
            jSONArrayOptJSONArray.put(0);
        }
        int iHashCode = adFormat.hashCode();
        if (iHashCode != 97295) {
            if (iHashCode != 104431) {
                if (iHashCode != 108833) {
                    if (iHashCode == 112804 && adFormat.equals("rew")) {
                        i10 = 2;
                    } else {
                        i10 = -1;
                    }
                } else if (adFormat.equals("nat")) {
                    i10 = 3;
                } else {
                    i10 = -1;
                }
            } else if (adFormat.equals("int")) {
                i10 = 1;
            } else {
                i10 = -1;
            }
        } else if (adFormat.equals("ban")) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        if (i10 != -1) {
            jSONArrayOptJSONArray.put(i10, jSONArrayOptJSONArray.optInt(i10, 0) + 1);
            a(jSONObject, key, jSONArrayOptJSONArray);
        }
    }
}
