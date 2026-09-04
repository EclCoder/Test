package com.mbridge.msdk.foundation.cache;

import android.text.TextUtils;
import com.bytedance.sdk.component.hn.hnj.yiH.PAFNPq;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.j;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f30106e = "BaseCandidateCache";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f30107f = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.foundation.db.c f30108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONArray f30109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f30110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f30111d;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.cache.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class C0387a implements Comparator<b> {
        C0387a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return Double.compare(bVar.f30114b, bVar2.f30114b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.foundation.cache.b f30113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f30114b;

        public b(double d10, com.mbridge.msdk.foundation.cache.b bVar) {
            this.f30114b = d10;
            this.f30113a = bVar;
        }

        public com.mbridge.msdk.foundation.cache.b a() {
            return this.f30113a;
        }
    }

    public void a(int i10) {
        com.mbridge.msdk.foundation.db.c cVar = this.f30108a;
        if (cVar != null) {
            cVar.a(this.f30111d, i10);
            a(f30107f, 1, null, true, "", "", i10, this.f30111d);
        }
    }

    public double b(String str) {
        c cVarA = a(str);
        if (cVarA != null && cVarA.g() != c.f30127k && cVarA.g() != c.f30125i) {
            try {
                String[] strArrSplit = k0.a(str.split("_")[3]).split("\\|");
                if (strArrSplit.length > 0) {
                    return Double.parseDouble(strArrSplit[0]);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return -1.0d;
    }

    public JSONObject c(String str) {
        JSONArray jSONArray = this.f30109b;
        if (jSONArray == null) {
            return null;
        }
        if (jSONArray.length() <= 1) {
            return this.f30109b.optJSONObject(0);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (int i10 = 0; i10 < this.f30109b.length(); i10++) {
            try {
                JSONObject jSONObjectOptJSONObject = this.f30109b.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null && str.equals(jSONObjectOptJSONObject.getString("g"))) {
                    this.f30110c = jSONObjectOptJSONObject;
                    return jSONObjectOptJSONObject;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public String d(String str) {
        c cVarA = a(str);
        if (cVarA != null && cVarA.g() != c.f30127k && cVarA.g() != c.f30125i) {
            String[] strArrSplit = k0.a(str.split("_")[3]).split("\\|");
            if (strArrSplit.length > 1) {
                return strArrSplit[1];
            }
        }
        return "";
    }

    public void e(String str) {
        this.f30111d = str;
    }

    public c a(String str) {
        c cVar = new c();
        if (!TextUtils.isEmpty(str) && str.split("_").length > 3 && !TextUtils.isEmpty(str.split("_")[3])) {
            JSONArray jSONArray = this.f30109b;
            if (jSONArray != null && jSONArray.length() != 0) {
                String strA = k0.a(str.split("_")[3]);
                if (TextUtils.isEmpty(strA)) {
                    cVar.d("bid token exception:decode error");
                    cVar.a(c.f30125i);
                    return cVar;
                }
                String[] strArrSplit = strA.split("\\|");
                if (strArrSplit.length == 0) {
                    cVar.d("bid token can not get bid price");
                    cVar.a(c.f30125i);
                    return cVar;
                }
                if (strArrSplit.length > 0) {
                    try {
                        Double.parseDouble(strArrSplit[0]);
                    } catch (Exception unused) {
                        cVar.d("bid token can not cast bid price");
                        cVar.a(c.f30125i);
                        return cVar;
                    }
                }
                if (TextUtils.isEmpty(this.f30111d)) {
                    cVar.d("unitId is empty");
                    cVar.a(c.f30127k);
                }
                return cVar;
            }
            cVar.d("config is empty");
            cVar.a(c.f30125i);
            return cVar;
        }
        cVar.d("bid token exception");
        cVar.a(c.f30125i);
        return cVar;
    }

    private List<Map<Integer, String>> b(List<Map<Integer, String>> list, int i10, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            Map<Integer, String> map = list.get(i11);
            if (map != null && map.size() > 0) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    map.put(entry.getKey(), a(entry.getValue(), i10, str, str2));
                }
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    public void a(JSONArray jSONArray) {
        this.f30109b = jSONArray;
    }

    public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str, int i10, String str2, int i11, double d10) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        CampaignEx campaignEx = list.get(i12);
                        campaignEx.setReadyState(0);
                        if (cVar != null) {
                            campaignEx.setNLRid(cVar.t());
                        }
                        campaignEx.setNRid(str);
                        campaignEx.setReasond(str2);
                        campaignEx.setTyped(i10);
                        String strB = k0.b(d10 + "");
                        campaignEx.setNoticeUrl(a(campaignEx.getNoticeUrl(), i11, str, strB));
                        campaignEx.setClickURL(a(campaignEx.getClickURL(), i11, str, strB));
                        campaignEx.setImpressionURL(a(campaignEx.getImpressionURL(), i11, str, strB));
                        campaignEx.setOnlyImpressionURL(a(campaignEx.getOnlyImpressionURL(), i11, str, strB));
                        campaignEx.setAdvImp(a(campaignEx.getAdvImpList(), i11, str, strB));
                        j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                        if (nativeVideoTracking != null) {
                            nativeVideoTracking.d(a(nativeVideoTracking.i(), i11, str, strB));
                            nativeVideoTracking.c(a(nativeVideoTracking.h(), i11, str, strB));
                            nativeVideoTracking.k(a(nativeVideoTracking.p(), i11, str, strB));
                            nativeVideoTracking.s(a(nativeVideoTracking.y(), i11, str, strB));
                            nativeVideoTracking.a(a(nativeVideoTracking.d(), i11, str, strB));
                            nativeVideoTracking.b(a(nativeVideoTracking.g(), i11, str, strB));
                            nativeVideoTracking.e(a(nativeVideoTracking.j(), i11, str, strB));
                            nativeVideoTracking.t(a(nativeVideoTracking.z(), i11, str, strB));
                            nativeVideoTracking.u(a(nativeVideoTracking.z(), i11, str, strB));
                            nativeVideoTracking.v(a(nativeVideoTracking.B(), i11, str, strB));
                            nativeVideoTracking.f(a(nativeVideoTracking.k(), i11, str, strB));
                            nativeVideoTracking.g(a(nativeVideoTracking.l(), i11, str, strB));
                            nativeVideoTracking.h(a(nativeVideoTracking.m(), i11, str, strB));
                            nativeVideoTracking.i(a(nativeVideoTracking.n(), i11, str, strB));
                            nativeVideoTracking.j(a(nativeVideoTracking.o(), i11, str, strB));
                            nativeVideoTracking.l(a(nativeVideoTracking.q(), i11, str, strB));
                            nativeVideoTracking.q(a(nativeVideoTracking.w(), i11, str, strB));
                            nativeVideoTracking.m(a(nativeVideoTracking.r(), i11, str, strB));
                            nativeVideoTracking.r(a(nativeVideoTracking.x(), i11, str, strB));
                            nativeVideoTracking.n(a(nativeVideoTracking.s(), i11, str, strB));
                            nativeVideoTracking.a(b(nativeVideoTracking.t(), i11, str, strB));
                            nativeVideoTracking.p(a(nativeVideoTracking.v(), i11, str, strB));
                            nativeVideoTracking.o(a(nativeVideoTracking.u(), i11, str, strB));
                            campaignEx.setNativeVideoTracking(nativeVideoTracking);
                            campaignEx.setNativeVideoTrackingString(CampaignEx.object2TrackingStr(nativeVideoTracking));
                        }
                        campaignEx.setPv_urls(a(campaignEx.getPv_urls(), i11, str, strB));
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public c a() {
        c cVar = new c();
        try {
            JSONArray jSONArray = this.f30109b;
            if (jSONArray != null && jSONArray.length() != 0) {
                if (this.f30108a == null) {
                    cVar.d("db error");
                    cVar.a(c.f30127k);
                }
                return cVar;
            }
            cVar.d("setting config is null");
            cVar.a(c.f30125i);
            return cVar;
        } catch (Exception unused) {
            cVar.d(PAFNPq.kPZnkzchrIz);
            cVar.a(c.f30127k);
            return cVar;
        }
    }

    public List<com.mbridge.msdk.foundation.cache.b> a(int i10, long j10) {
        if (i10 >= 0) {
            a(i10);
        }
        com.mbridge.msdk.foundation.db.c cVar = this.f30108a;
        if (cVar != null) {
            return cVar.a(this.f30111d, j10);
        }
        return null;
    }

    public void a(List<b> list, int i10) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    Collections.sort(list, new C0387a());
                    int size = list.size() - i10;
                    if (size > 0) {
                        List<b> listSubList = list.subList(0, size);
                        if (this.f30108a == null || listSubList.size() <= 0) {
                            return;
                        }
                        for (int i11 = 0; i11 < listSubList.size(); i11++) {
                            com.mbridge.msdk.foundation.cache.b bVar = listSubList.get(i11).f30113a;
                            this.f30108a.a(this.f30111d, bVar.e(), bVar.d());
                            a(f30107f, 1, null, true, bVar.e(), bVar.d(), -1, this.f30111d);
                        }
                    }
                }
            } catch (Exception e10) {
                q0.a(f30106e, e10);
            }
        }
    }

    private String a(String str, int i10, String str2, String str3) {
        if (TextUtils.isEmpty(str) || str.contains("ca_sce") || str.contains("real_rid") || str.contains("real_bp")) {
            return str;
        }
        if (c1.c(str) > 0) {
            return str + "&ca_sce=" + i10 + "&real_rid=" + str2 + "&real_bp=" + str3;
        }
        return str + "?ca_sce=" + i10 + "&real_rid=" + str2 + "&real_bp=" + str3;
    }

    private String a(Map<Integer, String> map, int i10, String str, String str2) {
        if (map == null || map.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                String value = entry.getValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(CampaignEx.JSON_AD_IMP_KEY, entry.getKey());
                jSONObject.put("url", a(value, i10, str, str2));
                jSONArray.put(jSONObject);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray.toString();
    }

    private String[] a(String[] strArr, int i10, String str, String str2) {
        if (strArr == null || strArr.length == 0) {
            return strArr;
        }
        String[] strArr2 = new String[strArr.length];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            strArr2[i11] = a(strArr[i11], i10, str, str2);
        }
        return strArr2;
    }

    private List<String> a(List<String> list, int i10, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            arrayList.add(a(list.get(i11), i10, str, str2));
        }
        return arrayList;
    }

    public long a(List<CampaignEx> list, String str) {
        if (list == null || list.size() == 0) {
            return 0L;
        }
        String ecppv = list.get(0).getEcppv();
        if (TextUtils.isEmpty(ecppv)) {
            return 0L;
        }
        String strA = k0.a(ecppv);
        if (TextUtils.isEmpty(strA)) {
            return 0L;
        }
        try {
            if (Double.parseDouble(strA) <= 0.0d) {
                return 0L;
            }
            JSONObject jSONObjectC = c(d(str));
            int iOptInt = jSONObjectC != null ? jSONObjectC.optInt("max_cache_num", 20) : 20;
            com.mbridge.msdk.foundation.db.c cVar = this.f30108a;
            if (cVar == null || iOptInt <= 0) {
                return -1L;
            }
            return cVar.a(list, this.f30111d);
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1L;
        }
    }

    public void a(String str, String str2, int i10, String str3) {
        try {
            if (this.f30108a != null && !TextUtils.isEmpty(str3)) {
                if (i10 == 1) {
                    this.f30108a.a(str2, str, this.f30111d, i10);
                    a(f30107f, 3, null, true, str2, str, -1, this.f30111d);
                } else if (i10 == 2) {
                    this.f30108a.a(this.f30111d, str2, str);
                    a(f30107f, 1, null, true, str2, str, -1, this.f30111d);
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    this.f30108a.b(str2, str, this.f30111d);
                    a(f30107f, 4, null, true, str2, str, -1, this.f30111d);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(int i10, int i11, List<CampaignEx> list, boolean z10, String str, String str2, int i12, String str3) {
        String currentLocalRid;
        com.mbridge.msdk.foundation.db.c cVar;
        JSONArray jSONArray;
        e eVar = new e();
        try {
            eVar.a("type", i11 + "");
            eVar.a("result", z10 ? "1" : MBridgeConstans.API_REUQEST_CATEGORY_APP);
            eVar.a("max_usage_limit", i12 + "");
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str3 + "");
            eVar.a("scene", "db");
            JSONObject jSONObject = this.f30110c;
            if (jSONObject != null) {
                eVar.a("config", jSONObject.toString());
            }
            if (i11 == 1 && TextUtils.isEmpty(str2) && (cVar = this.f30108a) != null) {
                try {
                    List<com.mbridge.msdk.foundation.cache.b> listA = cVar.a(str3, -1, -1L);
                    JSONArray jSONArray2 = new JSONArray();
                    if (listA != null && listA.size() > 0) {
                        int i13 = 0;
                        while (i13 < listA.size()) {
                            com.mbridge.msdk.foundation.cache.b bVar = listA.get(i13);
                            if (bVar != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("rid", bVar.e());
                                jSONObject2.put(CampaignEx.JSON_KEY_ST_TS, bVar.h());
                                jSONObject2.put("lrid", bVar.d());
                                jSONObject2.put("ecppv", k0.b(bVar.b() + ""));
                                jSONObject2.put("state", bVar.g());
                                jSONObject2.put("showCount", bVar.f());
                                jSONObject2.put("interval_ts", bVar.c());
                                jSONArray = jSONArray2;
                                jSONArray.put(jSONObject2);
                            } else {
                                jSONArray = jSONArray2;
                            }
                            i13++;
                            jSONArray2 = jSONArray;
                        }
                    }
                    eVar.a("cache", jSONArray2.toString());
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = null;
            if (list == null || list.size() <= 0) {
                currentLocalRid = str2;
            } else {
                try {
                    JSONArray jSONArray3 = new JSONArray();
                    CampaignEx campaignEx = list.get(0);
                    if (campaignEx != null) {
                        currentLocalRid = campaignEx.getCurrentLocalRid();
                        try {
                            cVar2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(currentLocalRid);
                        } catch (JSONException e11) {
                            e = e11;
                            e.printStackTrace();
                        }
                    } else {
                        currentLocalRid = str2;
                    }
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        CampaignEx campaignEx2 = list.get(i14);
                        if (campaignEx2 != null) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("rid", campaignEx2.getRequestId());
                            jSONObject3.put("rid_n", campaignEx2.getRequestIdNotice());
                            jSONArray3.put(jSONObject3);
                        }
                    }
                    eVar.a("c_info", jSONArray3.toString());
                } catch (JSONException e12) {
                    e = e12;
                    currentLocalRid = str2;
                }
            }
            eVar.a("rid", str);
            eVar.a("lrid", currentLocalRid);
            if (cVar2 == null) {
                cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            cVar2.n(str3);
            cVar2.a("m_candidate_db", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_candidate_db", cVar2);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }
}
