package com.mbridge.msdk.mbbid.common;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.x0;
import com.mbridge.msdk.mbbid.out.BidConstants;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<String, String> f31356a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static JSONArray f31357b;

    public static String a(Context context, String str) {
        HashMap map = new HashMap();
        map.put(BidConstants.BID_FILTER_KEY_UNIT_ID, str);
        return a(context, map);
    }

    public static boolean b(Context context, String str) {
        int i10;
        int i11;
        int i12;
        int i13;
        JSONArray jSONArray = f31357b;
        int i14 = 2;
        if (jSONArray == null || jSONArray.length() == 0) {
            a(str, 2);
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        int i15 = 0;
        while (true) {
            try {
                if (i15 >= f31357b.length()) {
                    i11 = 0;
                    i10 = 0;
                    break;
                }
                JSONObject jSONObjectOptJSONObject = f31357b.optJSONObject(i15);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("key_tpl");
                    String strOptString2 = jSONObjectOptJSONObject.optString(dOIDCKnIR.RAHGiXYGATY);
                    long jLongValue = ((Long) x0.a(context, strOptString2, 0L)).longValue();
                    if (a(strOptString, strOptString2)) {
                        try {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                if (jLongValue <= 0 || jCurrentTimeMillis - jLongValue >= ((long) jSONObjectOptJSONObject.optInt("ttl")) * 1000) {
                                    a(context, strOptString2, jCurrentTimeMillis);
                                    i11 = 0;
                                    i13 = 1;
                                } else {
                                    try {
                                        double dOptDouble = jSONObjectOptJSONObject.optDouble("rate");
                                        i11 = (dOptDouble == 0.0d || dOptDouble * 100.0d < ((double) new Random().nextInt(100))) ? 2 : 1;
                                        i14 = i11;
                                        i13 = 2;
                                    } catch (Exception e10) {
                                        e = e10;
                                        i12 = 2;
                                        i10 = i12;
                                        jSONObject = jSONObjectOptJSONObject;
                                        if (MBridgeConstans.DEBUG) {
                                            q0.b("BidCommon", e.getMessage());
                                        }
                                        i11 = 0;
                                    }
                                }
                                i10 = i13;
                                jSONObject = jSONObjectOptJSONObject;
                                break;
                            } catch (Exception e11) {
                                e = e11;
                                i12 = 1;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            i12 = 0;
                        }
                    }
                }
                i15++;
            } catch (Exception e13) {
                e = e13;
                i10 = 0;
            }
        }
        a(i14, jSONObject, i10, i11);
        a(str, i14);
        return i14 == 1;
    }

    public static String a(Context context, Map<String, String> map) {
        String md5;
        String str;
        f31356a = map;
        try {
            if (com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                com.mbridge.msdk.foundation.controller.c.n().b(context);
            }
            if (com.mbridge.msdk.config.manager.a.c().d()) {
                try {
                    com.mbridge.msdk.config.component.common.util.a aVar = new com.mbridge.msdk.config.component.common.util.a();
                    gi.a aVar2 = new gi.a(aVar);
                    HashMap map2 = new HashMap();
                    if (map != null) {
                        map2.put(MBridgeConstans.PROPERTIES_UNIT_ID, map.get(BidConstants.BID_FILTER_KEY_UNIT_ID));
                        map2.put("buyer_params", map);
                    }
                    HashMap map3 = new HashMap();
                    map3.put("callback", aVar2);
                    map2.put("sdk_context", map3);
                    String strA = com.mbridge.msdk.config.component.common.util.c.a();
                    com.mbridge.msdk.config.manager.a.c().b(strA, "c4", map2);
                    a("buyerIdStart", strA, 0, 0L);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Object objA = aVar.a(com.mbridge.msdk.config.manager.a.f29566j);
                    if (objA instanceof Map) {
                        Object obj = ((Map) objA).get("buyer_id");
                        if (obj instanceof String) {
                            a("buyerIdEnd", strA, 1, System.currentTimeMillis() - jCurrentTimeMillis);
                            return String.valueOf(obj);
                        }
                        a("buyerIdEnd", strA, 2, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                } catch (Throwable th2) {
                    q0.b("BidCommon", th2.getMessage());
                }
            }
            if (f31357b == null) {
                f31357b = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b()).m0();
            }
            md5 = SameMD5.getMD5(v0.d());
            try {
                if (b(context, md5)) {
                    return "";
                }
                Map<String, String> map4 = f31356a;
                if (map4 == null || !map4.containsKey(BidConstants.BID_FILTER_KEY_UNIT_ID)) {
                    str = "";
                } else {
                    str = f31356a.get(BidConstants.BID_FILTER_KEY_UNIT_ID);
                }
                return a(context, str, md5);
            } catch (Exception unused) {
                return a(context, "", md5);
            }
        } catch (Exception unused2) {
            md5 = "";
            return a(context, "", md5);
        }
    }

    public static String a(Context context, String str, String str2) {
        long jA;
        StringBuffer stringBuffer = new StringBuffer();
        if (context != null) {
            try {
                if (com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                    com.mbridge.msdk.foundation.controller.c.n().b(context);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("BidCommon", e10.getMessage());
                }
            }
        }
        g gVarF = h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarF == null) {
            gVarF = h.b().a();
        }
        stringBuffer.append(com.mbridge.msdk.foundation.tools.g.d());
        stringBuffer.append("|");
        stringBuffer.append(a.a(1, gVarF, context));
        stringBuffer.append("|");
        stringBuffer.append(a.a(2, gVarF, context));
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append(m0.t());
        stringBuffer.append("|");
        stringBuffer.append(m0.u());
        stringBuffer.append("|");
        stringBuffer.append(m0.s(context));
        stringBuffer.append("|");
        stringBuffer.append(MBConfiguration.SDK_VERSION);
        stringBuffer.append("|");
        stringBuffer.append(m0.n(context));
        stringBuffer.append("x");
        stringBuffer.append(m0.m(context));
        stringBuffer.append("|");
        stringBuffer.append(m0.i());
        stringBuffer.append("|");
        stringBuffer.append(a.a(3, gVarF, context));
        stringBuffer.append("|");
        stringBuffer.append(v0.b(20));
        stringBuffer.append("|");
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.same.a.f30482d);
        stringBuffer.append("|");
        stringBuffer.append(m0.x());
        stringBuffer.append("|");
        stringBuffer.append(m0.h());
        stringBuffer.append("|");
        stringBuffer.append(a.a(4, gVarF, context));
        stringBuffer.append("|");
        stringBuffer.append(a.a(5, gVarF, context));
        stringBuffer.append("|");
        stringBuffer.append(a.a(6, gVarF, context));
        stringBuffer.append("|");
        stringBuffer.append(t0.c());
        stringBuffer.append("|");
        stringBuffer.append(t0.a());
        stringBuffer.append("|");
        try {
            jA = l0.a();
        } catch (Exception unused) {
            jA = 0;
        }
        if (jA > 0) {
            stringBuffer.append(jA);
            stringBuffer.append("|");
        } else {
            stringBuffer.append("");
            stringBuffer.append("|");
        }
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c"));
        stringBuffer.append("|");
        stringBuffer.append(m0.j());
        String strA = gVarF != null ? gVarF.a() : "";
        stringBuffer.append("|");
        stringBuffer.append(strA);
        stringBuffer.append("|");
        stringBuffer.append(v0.a());
        stringBuffer.append("|");
        String strC = v0.c();
        if (TextUtils.isEmpty(strC)) {
            strC = "";
        }
        stringBuffer.append(strC);
        stringBuffer.append("|");
        stringBuffer.append(v0.c(str));
        stringBuffer.append("|");
        if (gVarF != null && gVarF.w0() == 1 && com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            stringBuffer.append(a.a(7, gVarF, context));
        }
        stringBuffer.append("|");
        stringBuffer.append(m0.G());
        stringBuffer.append("|");
        stringBuffer.append(m0.E(context));
        stringBuffer.append("|");
        stringBuffer.append(m0.D() + "");
        stringBuffer.append("|");
        stringBuffer.append(m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
        stringBuffer.append("|");
        stringBuffer.append(m0.E());
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.controller.authoritycontroller.b.i() ? "1" : MBridgeConstans.API_REUQEST_CATEGORY_APP);
        stringBuffer.append("|");
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            if (com.mbridge.msdk.util.b.b()) {
                stringBuffer.append(m0.F());
            } else {
                stringBuffer.append(a.a(8, gVarF, context));
            }
        }
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append("1");
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c());
        stringBuffer.append("|");
        if (m0.A() != 0) {
            stringBuffer.append(m0.A() + "");
        }
        if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
            stringBuffer.append("|");
            stringBuffer.append(1);
        } else {
            stringBuffer.append("|");
            stringBuffer.append("");
        }
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append(str2);
        stringBuffer.append("|");
        stringBuffer.append(m0.r(context));
        stringBuffer.append("|");
        stringBuffer.append(m0.q(context));
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.tools.g.e());
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.tools.g.a());
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.util.c.f33970b);
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append(g0.a().b());
        stringBuffer.append("|");
        stringBuffer.append(m0.k(context));
        stringBuffer.append("|");
        stringBuffer.append(m0.u(context));
        stringBuffer.append("|");
        stringBuffer.append(m0.o(context));
        stringBuffer.append("|");
        stringBuffer.append(Build.VERSION.RELEASE);
        stringBuffer.append("|");
        stringBuffer.append(Build.VERSION.SDK_INT);
        stringBuffer.append("|");
        stringBuffer.append(m0.v());
        return k0.b(stringBuffer.toString());
    }

    public static void a(Context context, String str, long j10) {
        x0.b(context, str, Long.valueOf(j10));
    }

    public static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        for (String str3 : str.split("-")) {
            if (!TextUtils.isEmpty(str3) && str3.length() > 2 && str3.startsWith("{") && str3.endsWith("}")) {
                String strSubstring = str3.substring(1, str3.length() - 1);
                Map<String, String> map = f31356a;
                if (map != null && map.containsKey(strSubstring)) {
                    String strValueOf = String.valueOf(f31356a.get(strSubstring));
                    if (!TextUtils.isEmpty(strValueOf)) {
                        str = str.replace(str3, strValueOf + "");
                    }
                } else if (BidConstants.BID_FILTER_KEY_NETWORK.equals(str3)) {
                    str = str.replace(str3, m0.s(com.mbridge.msdk.foundation.controller.c.n().d()) + "");
                }
            }
        }
        return str.equals(str2);
    }

    private static void a(int i10, JSONObject jSONObject, int i11, int i12) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("key", "2000122");
                jSONObject2.put("filter", i10);
                jSONObject2.put("network_type", m0.s(contextD));
                jSONObject2.put("timeout", i11);
                if (jSONObject != null && jSONObject.length() > 0) {
                    jSONObject2.put("hitNode", jSONObject);
                }
                jSONObject2.put("hitRate", i12);
                Map<String, String> map = f31356a;
                if (map != null) {
                    if (map.containsKey(BidConstants.BID_FILTER_KEY_UNIT_ID)) {
                        jSONObject2.put(MBridgeConstans.PROPERTIES_UNIT_ID, f31356a.get(BidConstants.BID_FILTER_KEY_UNIT_ID));
                    }
                    if (f31356a.containsKey(BidConstants.BID_FILTER_KEY_PLACEMENT_ID)) {
                        jSONObject2.put("placementId", f31356a.get(BidConstants.BID_FILTER_KEY_PLACEMENT_ID));
                    }
                    if (f31356a.containsKey(BidConstants.BID_FILTER_KEY_AD_TYPE)) {
                        jSONObject2.put("adType", f31356a.get(BidConstants.BID_FILTER_KEY_AD_TYPE));
                    }
                }
                d.b().a(jSONObject2);
            }
        } catch (Throwable th2) {
            q0.b("BidCommon", th2.getMessage());
        }
    }

    private static void a(String str, int i10) {
        e eVar = new e();
        eVar.a("filter", Integer.valueOf(i10));
        eVar.a("lrid", str);
        d.b().b("2000124", eVar);
    }

    private static void a(String str, String str2, int i10, long j10) {
        String str3;
        try {
            if (str.equals("buyerIdStart")) {
                str3 = "m_pipe_buyerid_start";
            } else {
                str3 = "m_pipe_buyerid_end";
            }
            HashMap map = new HashMap();
            map.put("context_id", str2);
            if (str.equals("buyerIdEnd")) {
                map.put("result", Integer.valueOf(i10));
                map.put("duration", Long.valueOf(j10));
            }
            com.mbridge.msdk.config.component.common.metrics.b.a(str3, map);
        } catch (Throwable th2) {
            q0.b("BidCommon", th2.getMessage());
        }
    }
}
