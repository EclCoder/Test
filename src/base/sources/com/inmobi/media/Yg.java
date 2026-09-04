package com.inmobi.media;

import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;
import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Yg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f26086a = gl.l0.l(fl.w.a("revenue", "getRevenue"), fl.w.a("revenue_precision", "getRevenuePrecision"), fl.w.a("network_name", "getNetworkName"), fl.w.a("dsp_name", "getDspName"), fl.w.a("max_ad_unit_id", "getAdUnitId"), fl.w.a("network_placement", "getNetworkPlacement"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f26087b = gl.l0.l(fl.w.a("BANNER", "ban"), fl.w.a("MREC", "ban"), fl.w.a("LEADER", "ban"), fl.w.a("INTER", "int"), fl.w.a("REWARDED", "rew"), fl.w.a("REWARDED_INTER", "rew"), fl.w.a("NATIVE", "nat"));

    public static final JSONObject a(JSONObject jSONObject, String str, int i10) throws JSONException {
        String prefix = str;
        int i11 = i10;
        kotlin.jvm.internal.s.h(jSONObject, "<this>");
        kotlin.jvm.internal.s.h(prefix, "prefix");
        if (i11 <= 0) {
            return jSONObject;
        }
        String[] strArr = {"ban", "int", "rew", "nat"};
        int i12 = 0;
        while (i12 < 4) {
            String str2 = prefix + strArr[i12];
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str2);
            if (jSONArrayOptJSONArray != null) {
                JSONArray jSONArray = new JSONArray();
                String tsKey = b(prefix);
                long jCurrentTimeMillis = System.currentTimeMillis() - (((long) i11) * 1000);
                int length = jSONArrayOptJSONArray.length();
                for (int i13 = 0; i13 < length; i13++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i13);
                    if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has(tsKey)) {
                        kotlin.jvm.internal.s.h(jSONObjectOptJSONObject, "<this>");
                        kotlin.jvm.internal.s.h(tsKey, "tsKey");
                        if (jSONObjectOptJSONObject.optLong(tsKey, 0L) >= jCurrentTimeMillis) {
                            jSONArray.put(jSONObjectOptJSONObject);
                        }
                    }
                }
                jSONObject.put(str2, jSONArray);
            }
            i12++;
            prefix = str;
            i11 = i10;
        }
        return jSONObject;
    }

    public static final fl.q b(Map map) {
        kotlin.jvm.internal.s.h(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (bm.r.N(str, "obj_", false, 2, null) || bm.r.N(str, "auto_", false, 2, null) || bm.r.N(str, "dir_", false, 2, null)) {
                linkedHashMap2.put(str, value);
            } else {
                linkedHashMap.put(str, value);
            }
        }
        return new fl.q(linkedHashMap, linkedHashMap2);
    }

    public static final LinkedHashMap c(Map map) {
        kotlin.jvm.internal.s.h(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            SignalsConfig.PublisherConfig.KeyData keyData = (SignalsConfig.PublisherConfig.KeyData) ((Map.Entry) it.next()).getValue();
            linkedHashMap.put(keyData.getName(), keyData.getType());
        }
        return linkedHashMap;
    }

    public static final LinkedHashMap d(Map map, SignalsConfig.PublisherConfig config) {
        Object objA;
        kotlin.jvm.internal.s.h(map, "<this>");
        kotlin.jvm.internal.s.h(config, "config");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(map);
        for (Map.Entry<String, String> entry : config.getGeneralKeys().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Object obj = map.get(key);
            if (obj != null && (objA = a(obj, value)) != null) {
                linkedHashMap2.remove(key);
                linkedHashMap.put(key, objA);
            }
        }
        for (Map.Entry<String, String> entry2 : config.getAdSpecificKeys().entrySet()) {
            String key2 = entry2.getKey();
            String value2 = entry2.getValue();
            String str = key2 + "_ban";
            String str2 = key2 + "_int";
            String str3 = key2 + "_rew";
            String str4 = key2 + "_nat";
            Object obj2 = map.get(str);
            Object objA2 = obj2 != null ? a(obj2, value2) : null;
            Object obj3 = map.get(str2);
            Object objA3 = obj3 != null ? a(obj3, value2) : null;
            Object obj4 = map.get(str3);
            Object objA4 = obj4 != null ? a(obj4, value2) : null;
            Object obj5 = map.get(str4);
            Object objA5 = obj5 != null ? a(obj5, value2) : null;
            if (objA2 != null || objA3 != null || objA4 != null || objA5 != null) {
                if (objA2 != null) {
                    linkedHashMap2.remove(str);
                }
                if (objA3 != null) {
                    linkedHashMap2.remove(str2);
                }
                if (objA4 != null) {
                    linkedHashMap2.remove(str3);
                }
                if (objA5 != null) {
                    linkedHashMap2.remove(str4);
                }
                JSONArray jSONArray = new JSONArray();
                if (objA2 == null) {
                    objA2 = a(value2);
                }
                JSONArray jSONArrayPut = jSONArray.put(objA2);
                if (objA3 == null) {
                    objA3 = a(value2);
                }
                JSONArray jSONArrayPut2 = jSONArrayPut.put(objA3);
                if (objA4 == null) {
                    objA4 = a(value2);
                }
                JSONArray jSONArrayPut3 = jSONArrayPut2.put(objA4);
                if (objA5 == null) {
                    objA5 = a(value2);
                }
                linkedHashMap.put(key2, jSONArrayPut3.put(objA5));
            }
        }
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Sb.a((byte) 1, "PubSignalsUtils", "Publisher Signal, " + ((String) entry3.getKey()) + "=" + entry3.getValue() + " Not supported");
        }
        return linkedHashMap;
    }

    public static final fl.v c(Map map, SignalsConfig.PublisherConfig config) {
        kotlin.jvm.internal.s.h(map, "<this>");
        kotlin.jvm.internal.s.h(config, "config");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = map.get("dir_type");
        String str = obj instanceof String ? (String) obj : null;
        Map map2 = f26087b;
        if (str == null) {
            str = "";
        }
        String str2 = (String) map2.get(str);
        if (str2 == null) {
            Sb.a((byte) 1, "PubSignalsUtils", "Missing or invalid dir_type for Publisher signals");
            return new fl.v("", null, "");
        }
        fl.v vVarA = a(map, config.getDirect().getAllowedKeys(), config.getDirect().getPrecision(), config.getDirect().getStrLen());
        JSONObject jSONObject = (JSONObject) vVarA.d();
        List list = (List) vVarA.g();
        List list2 = (List) vVarA.h();
        jSONObject.put(b("dir_"), System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!kotlin.jvm.internal.s.c((String) obj2, "dir_type")) {
                arrayList.add(obj2);
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList.get(i10);
            i10++;
            Sb.a((byte) 1, "PubSignalsUtils", "Publisher signal: " + ((String) obj3) + " not supported");
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Sb.a((byte) 1, "PubSignalsUtils", "Publisher signal: " + ((String) it.next()) + " invalid type");
        }
        String str3 = "dir_" + str2;
        linkedHashMap.put(str3, jSONObject);
        return new fl.v(str3, jSONObject, str2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    public static final fl.v b(Map map, SignalsConfig.PublisherConfig config) {
        String str;
        Object objInvoke;
        String str2;
        boolean zA;
        kotlin.jvm.internal.s.h(map, "<this>");
        kotlin.jvm.internal.s.h(config, "config");
        if (map.containsKey("obj_max")) {
            Object obj = map.get("obj_max");
            boolean z10 = false;
            if (obj != null) {
                kotlin.jvm.internal.s.h(obj, "<this>");
                Class<?> cls = obj.getClass();
                try {
                    ClassLoader classLoader = cls.getClassLoader();
                    if (classLoader == null) {
                        classLoader = ClassLoader.getSystemClassLoader();
                    }
                    Class<?> cls2 = Class.forName("com.applovin.mediation.MaxAd", false, classLoader);
                    zA = (cls2.isInstance(obj) || cls2.isAssignableFrom(cls)) ? true : a(cls);
                } catch (Throwable unused) {
                }
                if (zA) {
                    z10 = true;
                }
            }
            if (z10) {
                Object obj2 = map.get("obj_max");
                kotlin.jvm.internal.s.e(obj2);
                kotlin.jvm.internal.s.h(obj2, "<this>");
                try {
                    Object objInvoke2 = obj2.getClass().getMethod("getFormat", null).invoke(obj2, null);
                    if (objInvoke2 != null) {
                        Object objInvoke3 = objInvoke2.getClass().getMethod("getLabel", null).invoke(objInvoke2, null);
                        if (objInvoke3 instanceof String) {
                            str2 = (String) objInvoke3;
                        } else {
                            str2 = null;
                        }
                    } else {
                        str2 = null;
                    }
                    Map map2 = f26087b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    str = (String) map2.get(str2);
                } catch (Exception unused2) {
                    str = null;
                }
                if (str == null) {
                    Sb.a((byte) 1, "PubSignalsUtils", "Missing or invalid format for MaxAd object: " + obj2);
                    return new fl.v("", null, "");
                }
                kotlin.jvm.internal.s.h(obj2, "<this>");
                kotlin.jvm.internal.s.h(config, "config");
                JSONObject jSONObject = new JSONObject();
                Class<?> cls3 = obj2.getClass();
                for (Map.Entry<String, SignalsConfig.PublisherConfig.KeyData> entry : config.getObj().getAllowedKeysAnd().entrySet()) {
                    String key = entry.getKey();
                    SignalsConfig.PublisherConfig.KeyData value = entry.getValue();
                    String str3 = (String) f26086a.get(key);
                    if (str3 != null) {
                        try {
                            objInvoke = cls3.getMethod(str3, null).invoke(obj2, null);
                        } catch (Exception unused3) {
                            objInvoke = null;
                        }
                        if (objInvoke != null) {
                            String name = value.getName();
                            Object objA = a(objInvoke, value.getType(), config.getObj().getPrecision(), config.getObj().getStrLen());
                            if (objA == null) {
                                objA = a(value.getType());
                            }
                            jSONObject.put(name, objA);
                        } else {
                            jSONObject.put(value.getName(), a(value.getType()));
                        }
                    }
                }
                jSONObject.put(b("obj_"), System.currentTimeMillis());
                return new fl.v("obj_" + str, jSONObject, str);
            }
        }
        Sb.a((byte) 1, "PubSignalsUtils", "Missing or invalid obj_max for obj signal: " + map);
        return new fl.v("", null, "");
    }

    public static final fl.v a(Map map, SignalsConfig.PublisherConfig config) {
        kotlin.jvm.internal.s.h(map, "<this>");
        kotlin.jvm.internal.s.h(config, "config");
        Object obj = map.get("auto_type");
        String str = obj instanceof String ? (String) obj : null;
        Map map2 = f26087b;
        if (str == null) {
            str = "";
        }
        String str2 = (String) map2.get(str);
        if (str2 == null) {
            map.toString();
            return new fl.v("", null, "");
        }
        JSONObject jSONObject = (JSONObject) a(map, c(config.getAuto().getAllowedKeys()), config.getAuto().getPrecision(), config.getAuto().getStrLen()).d();
        jSONObject.put(b("auto_"), System.currentTimeMillis());
        return new fl.v("auto_" + str2, jSONObject, str2);
    }

    public static final boolean a(Class cls) {
        kotlin.jvm.internal.s.h(cls, "<this>");
        kotlin.jvm.internal.s.h("com.applovin.mediation.MaxAd", "targetFqcn");
        Class<?>[] interfaces = cls.getInterfaces();
        kotlin.jvm.internal.s.g(interfaces, "getInterfaces(...)");
        for (Class<?> cls2 : interfaces) {
            if (kotlin.jvm.internal.s.c(cls2.getName(), "com.applovin.mediation.MaxAd")) {
                return true;
            }
            kotlin.jvm.internal.s.e(cls2);
            if (a(cls2)) {
                return true;
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null) {
            return false;
        }
        return a(superclass);
    }

    public static final fl.v a(Map map, Map keys, int i10, int i11) throws JSONException {
        kotlin.jvm.internal.s.h(map, "<this>");
        kotlin.jvm.internal.s.h(keys, "keys");
        JSONObject jSONObject = new JSONObject();
        Map mapV = gl.l0.v(map);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : keys.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Object obj = map.get(str);
            if (obj != null) {
                Object objA = a(obj, str2, i10, i11);
                if (objA != null) {
                    jSONObject.put(str, objA);
                    mapV.remove(str);
                } else {
                    jSONObject.put(str, a(str2));
                    arrayList.add(str);
                }
            }
        }
        return new fl.v(jSONObject, gl.r.I0(mapV.keySet()), arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object a(Object obj, String type, int i10, int i11) {
        kotlin.jvm.internal.s.h(obj, "<this>");
        kotlin.jvm.internal.s.h(type, "type");
        switch (type.hashCode()) {
            case -1881759115:
                if (type.equals("stringf") && (obj instanceof String)) {
                    return (String) obj;
                }
                return null;
            case -1325958191:
                if (type.equals("double")) {
                    Number number = obj instanceof Number ? (Number) obj : null;
                    if (number == null) {
                        return null;
                    }
                    double dDoubleValue = number.doubleValue();
                    if (Math.abs(dDoubleValue) <= Double.MAX_VALUE) {
                        int i12 = yl.g.i(i10, 0, 15);
                        if (i12 == 0) {
                            dDoubleValue = dDoubleValue > 0.0d ? Math.floor(dDoubleValue) : Math.ceil(dDoubleValue);
                        } else {
                            dDoubleValue = BigDecimal.valueOf(dDoubleValue).movePointRight(i12).setScale(0, RoundingMode.DOWN).movePointLeft(i12).doubleValue();
                        }
                    }
                    return Double.valueOf(dDoubleValue);
                }
                return null;
            case -891985903:
                if (type.equals("string")) {
                    String value = obj instanceof String ? (String) obj : null;
                    if (value == null) {
                        return null;
                    }
                    kotlin.jvm.internal.s.h(value, "value");
                    if (value.length() <= i11) {
                        return value;
                    }
                    String strSubstring = value.substring(0, i11);
                    kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
                    return strSubstring;
                }
                return null;
            case 104431:
                if (type.equals("int")) {
                    Number number2 = obj instanceof Number ? (Number) obj : null;
                    if (number2 != null) {
                        return Integer.valueOf(number2.intValue());
                    }
                    return null;
                }
                return null;
            case 3029738:
                if (type.equals("bool") && (obj instanceof Boolean)) {
                    return (Boolean) obj;
                }
                return null;
            case 3327612:
                if (type.equals("long")) {
                    Number number3 = obj instanceof Number ? (Number) obj : null;
                    if (number3 != null) {
                        return Long.valueOf(number3.longValue());
                    }
                    return null;
                }
                return null;
            default:
                return null;
        }
    }

    public static final JSONObject b(JSONObject jSONObject, SignalsConfig.PublisherConfig config) {
        kotlin.jvm.internal.s.h(jSONObject, "<this>");
        kotlin.jvm.internal.s.h(config, "config");
        if (jSONObject.toString().length() <= config.getPayloadSize()) {
            return jSONObject;
        }
        Sb.a((byte) 1, "PubSignalsUtils", "Publisher Signal payload size exceeded.");
        fl.k kVar = W9.f25935a;
        W9.a(new M2(new IllegalStateException("Publisher signals size exceeds the limit")));
        return null;
    }

    public static final String b(String prefix) {
        kotlin.jvm.internal.s.h(prefix, "prefix");
        if (kotlin.jvm.internal.s.c(prefix, "auto_")) {
            return "auto_sts";
        }
        return kotlin.jvm.internal.s.c(prefix, "obj_") ? "obj_ts" : "dir_ts";
    }

    public static final JSONObject a(JSONObject jSONObject, String key, JSONObject newObj, int i10) throws JSONException {
        kotlin.jvm.internal.s.h(jSONObject, "<this>");
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(newObj, "newObj");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(key);
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        jSONArrayOptJSONArray.put(newObj);
        while (true) {
            kotlin.jvm.internal.s.h(jSONArrayOptJSONArray, "<this>");
            if (jSONArrayOptJSONArray.length() > i10) {
                jSONArrayOptJSONArray.remove(0);
            } else {
                jSONObject.put(key, jSONArrayOptJSONArray);
                return jSONObject;
            }
        }
    }

    public static final void a(JSONObject jSONObject, JSONObject cachedJson, String formatKey, String prefix, Set allowedKeys) throws JSONException {
        kotlin.jvm.internal.s.h(jSONObject, "<this>");
        kotlin.jvm.internal.s.h(cachedJson, "cachedJson");
        kotlin.jvm.internal.s.h(formatKey, "formatKey");
        kotlin.jvm.internal.s.h(prefix, "prefix");
        kotlin.jvm.internal.s.h(allowedKeys, "allowedKeys");
        JSONArray jSONArrayOptJSONArray = cachedJson.optJSONArray(prefix + formatKey);
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        Iterator it = allowedKeys.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            JSONArray jSONArray = new JSONArray();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    Object objOpt = jSONObjectOptJSONObject.opt(str);
                    if (objOpt == null) {
                        objOpt = "-1";
                    }
                    jSONArray.put(objOpt);
                }
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(str);
            if (jSONArrayOptJSONArray2 == null) {
                jSONArrayOptJSONArray2 = new JSONArray();
            }
            jSONObject.put(str, jSONArrayOptJSONArray2.put(jSONArray));
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0113 A[PHI: r18
      0x0113: PHI (r18v10 org.json.JSONArray) = (r18v8 org.json.JSONArray), (r18v11 org.json.JSONArray) binds: [B:37:0x0110, B:30:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Map a(Map map, JSONObject jSONObject, String prefix, String format, Map configKeys) {
        JSONArray jSONArray;
        LinkedHashMap linkedHashMap;
        JSONArray jSONArray2;
        kotlin.jvm.internal.s.h(map, "<this>");
        kotlin.jvm.internal.s.h(jSONObject, IAoPeRfJn.TpSIVVgLZyViAVJ);
        kotlin.jvm.internal.s.h(prefix, "prefix");
        kotlin.jvm.internal.s.h(format, "format");
        kotlin.jvm.internal.s.h(configKeys, "configKeys");
        Map mapV = gl.l0.v(configKeys);
        mapV.put(b(prefix), "long");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(prefix + format);
        if (jSONArrayOptJSONArray != null) {
            yl.f fVarM = yl.g.m(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator it = fVarM.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(((gl.j0) it).nextInt());
                if (jSONObjectOptJSONObject != null) {
                    am.g gVarT = gl.r.T(mapV.keySet());
                    linkedHashMap = new LinkedHashMap();
                    for (Object obj : gVarT) {
                        String str = (String) obj;
                        String str2 = (String) configKeys.get(str);
                        Object objValueOf = "-1";
                        if (str2 != null) {
                            switch (str2.hashCode()) {
                                case -1881759115:
                                    jSONArray2 = jSONArrayOptJSONArray;
                                    if (str2.equals("stringf")) {
                                        objValueOf = jSONObjectOptJSONObject.optString(str, "-1");
                                        break;
                                    }
                                    break;
                                case -1325958191:
                                    jSONArray2 = jSONArrayOptJSONArray;
                                    if (str2.equals("double")) {
                                        objValueOf = Double.valueOf(jSONObjectOptJSONObject.optDouble(str, Double.parseDouble("-1")));
                                        break;
                                    }
                                    break;
                                case -891985903:
                                    jSONArray2 = jSONArrayOptJSONArray;
                                    if (str2.equals("string")) {
                                        objValueOf = jSONObjectOptJSONObject.optString(str, "-1");
                                        break;
                                    }
                                    break;
                                case 104431:
                                    jSONArray2 = jSONArrayOptJSONArray;
                                    if (str2.equals("int")) {
                                        objValueOf = Integer.valueOf(jSONObjectOptJSONObject.optInt(str, Integer.parseInt("-1")));
                                        break;
                                    }
                                    break;
                                case 3029738:
                                    jSONArray2 = jSONArrayOptJSONArray;
                                    if (str2.equals("bool")) {
                                        objValueOf = Boolean.valueOf(jSONObjectOptJSONObject.optBoolean(str, Boolean.parseBoolean("-1")));
                                        break;
                                    }
                                    break;
                                case 3327612:
                                    if (str2.equals("long")) {
                                        objValueOf = Long.valueOf(jSONObjectOptJSONObject.optLong(str, Long.parseLong("-1")));
                                        jSONArray2 = jSONArrayOptJSONArray;
                                    } else {
                                        jSONArray2 = jSONArrayOptJSONArray;
                                    }
                                    break;
                                default:
                                    jSONArray2 = jSONArrayOptJSONArray;
                                    break;
                            }
                            linkedHashMap.put(obj, objValueOf);
                            jSONArrayOptJSONArray = jSONArray2;
                        } else {
                            jSONArray2 = jSONArrayOptJSONArray;
                        }
                        Object objOpt = jSONObjectOptJSONObject.opt(str);
                        if (objOpt != null) {
                            objValueOf = objOpt;
                        }
                        linkedHashMap.put(obj, objValueOf);
                        jSONArrayOptJSONArray = jSONArray2;
                    }
                    jSONArray = jSONArrayOptJSONArray;
                } else {
                    jSONArray = jSONArrayOptJSONArray;
                    linkedHashMap = null;
                }
                if (linkedHashMap != null) {
                    arrayList.add(linkedHashMap);
                }
                jSONArrayOptJSONArray = jSONArray;
            }
            if (!arrayList.isEmpty()) {
                map.put(prefix + format, arrayList);
            }
        }
        return map;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        if (r3.equals("string") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0088, code lost:
    
        if (r3.equals("stringf") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008d, code lost:
    
        if ((r2 instanceof java.lang.String) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
    
        return (java.lang.String) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
    
        return null;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.lang.Object r2, java.lang.String r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.s.h(r2, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.s.h(r3, r0)
            int r0 = r3.hashCode()
            r1 = 0
            switch(r0) {
                case -1881759115: goto L82;
                case -1325958191: goto L51;
                case -891985903: goto L48;
                case 104431: goto L37;
                case 3029738: goto L26;
                case 3327612: goto L14;
                default: goto L12;
            }
        L12:
            goto L8a
        L14:
            java.lang.String r0 = "long"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L1e
            goto L8a
        L1e:
            boolean r3 = r2 instanceof java.lang.Long
            if (r3 == 0) goto L25
            java.lang.Long r2 = (java.lang.Long) r2
            return r2
        L25:
            return r1
        L26:
            java.lang.String r0 = "bool"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2f
            goto L8a
        L2f:
            boolean r3 = r2 instanceof java.lang.Boolean
            if (r3 == 0) goto L36
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            return r2
        L36:
            return r1
        L37:
            java.lang.String r0 = "int"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L40
            goto L8a
        L40:
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L47
            java.lang.Integer r2 = (java.lang.Integer) r2
            return r2
        L47:
            return r1
        L48:
            java.lang.String r0 = "string"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L8b
            goto L8a
        L51:
            java.lang.String r0 = "double"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5a
            goto L8a
        L5a:
            boolean r3 = r2 instanceof java.lang.Double
            if (r3 == 0) goto L61
            java.lang.Double r2 = (java.lang.Double) r2
            return r2
        L61:
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L71
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            double r2 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            return r2
        L71:
            boolean r3 = r2 instanceof java.lang.Float
            if (r3 == 0) goto L81
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            double r2 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            return r2
        L81:
            return r1
        L82:
            java.lang.String r0 = "stringf"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L8b
        L8a:
            return r1
        L8b:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L92
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Yg.a(java.lang.Object, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Object a(String type) {
        kotlin.jvm.internal.s.h(type, "type");
        switch (type.hashCode()) {
            case -1881759115:
                type.equals("stringf");
                return "-1";
            case -1325958191:
                if (type.equals("double")) {
                    return Double.valueOf(Double.parseDouble("-1"));
                }
                return "-1";
            case -891985903:
                type.equals("string");
                return "-1";
            case 104431:
                if (type.equals("int")) {
                    return Integer.valueOf(Integer.parseInt("-1"));
                }
                return "-1";
            case 3029738:
                type.equals("bool");
                return "-1";
            case 3327612:
                if (type.equals("long")) {
                    return Long.valueOf(Long.parseLong("-1"));
                }
                return "-1";
            default:
                return "-1";
        }
    }

    public static final JSONObject a(Map map) throws JSONException {
        kotlin.jvm.internal.s.h(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                jSONObject.put(str, value);
            } else if (value instanceof Integer) {
                jSONObject.put(str, ((Number) value).intValue());
            } else if (value instanceof Boolean) {
                jSONObject.put(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Double) {
                jSONObject.put(str, ((Number) value).doubleValue());
            } else if (value instanceof JSONArray) {
                jSONObject.put(str, value);
            } else if (value instanceof List) {
                JSONArray jSONArray = new JSONArray();
                for (Object obj : (Iterable) value) {
                    if (obj instanceof String) {
                        jSONArray.put(obj);
                    } else if (obj instanceof Integer) {
                        jSONArray.put(((Number) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        jSONArray.put(((Boolean) obj).booleanValue());
                    } else if (obj instanceof Double) {
                        jSONArray.put(((Number) obj).doubleValue());
                    } else if (obj instanceof Map) {
                        kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                        jSONArray.put(a((Map) obj));
                    }
                }
                jSONObject.put(str, jSONArray);
            } else {
                fl.g0 g0Var = fl.g0.f38750a;
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final LinkedHashMap a(JSONObject jSONObject, SignalsConfig.PublisherConfig config) {
        Object objValueOf;
        Object objValueOf2;
        JSONObject jSONObject2 = jSONObject;
        kotlin.jvm.internal.s.h(jSONObject2, "<this>");
        kotlin.jvm.internal.s.h(config, "config");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : config.getGeneralKeys().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (jSONObject2.has(key)) {
                switch (value.hashCode()) {
                    case -1325958191:
                        if (value.equals("double")) {
                            objValueOf2 = Double.valueOf(jSONObject2.optDouble(key));
                        }
                        break;
                    case -891985903:
                        if (value.equals("string")) {
                            objValueOf2 = jSONObject2.optString(key);
                        }
                        break;
                    case 104431:
                        if (value.equals("int")) {
                            objValueOf2 = Integer.valueOf(jSONObject2.optInt(key));
                        }
                        break;
                    case 3029738:
                        if (value.equals("bool")) {
                            objValueOf2 = Boolean.valueOf(jSONObject2.optBoolean(key));
                        }
                        break;
                    case 3327612:
                        if (value.equals("long")) {
                            objValueOf2 = Long.valueOf(jSONObject2.optLong(key));
                        }
                        break;
                    default:
                        continue;
                }
                linkedHashMap.put(key, objValueOf2);
            }
        }
        for (Map.Entry<String, String> entry2 : config.getAdSpecificKeys().entrySet()) {
            String key2 = entry2.getKey();
            String value2 = entry2.getValue();
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(key2);
            if (jSONArrayOptJSONArray != null) {
                String[] strArr = {NhHRaDJCHtCTJR.XmDoUfVWiydfR, "int", "rew", "nat"};
                int length = jSONArrayOptJSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String str = key2 + "_" + strArr[i10];
                    switch (value2.hashCode()) {
                        case -1325958191:
                            if (value2.equals("double")) {
                                objValueOf = Double.valueOf(jSONArrayOptJSONArray.optDouble(i10));
                                linkedHashMap.put(str, objValueOf);
                            }
                            break;
                        case -891985903:
                            if (value2.equals("string")) {
                                objValueOf = jSONArrayOptJSONArray.optString(i10);
                                linkedHashMap.put(str, objValueOf);
                            }
                            break;
                        case 104431:
                            if (value2.equals("int")) {
                                objValueOf = Integer.valueOf(jSONArrayOptJSONArray.optInt(i10));
                                linkedHashMap.put(str, objValueOf);
                            }
                            break;
                        case 3029738:
                            if (value2.equals("bool")) {
                                objValueOf = Boolean.valueOf(jSONArrayOptJSONArray.optBoolean(i10));
                                linkedHashMap.put(str, objValueOf);
                            }
                            break;
                        case 3327612:
                            if (value2.equals("long")) {
                                objValueOf = Long.valueOf(jSONArrayOptJSONArray.optLong(i10));
                                linkedHashMap.put(str, objValueOf);
                            }
                            break;
                    }
                }
            }
            jSONObject2 = jSONObject;
        }
        return linkedHashMap;
    }
}
