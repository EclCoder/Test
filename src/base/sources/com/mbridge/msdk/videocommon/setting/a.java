package com.mbridge.msdk.videocommon.setting;

import android.text.TextUtils;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f35178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.videocommon.entity.c> f35179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f35180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f35181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f35182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f35183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f35184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f35185h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f35187j;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f35186i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f35188k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f35189l = "";

    public String a() {
        return this.f35187j;
    }

    public void b(String str) {
        this.f35187j = str;
    }

    public void c(String str) {
        this.f35189l = str;
    }

    public void d(String str) {
        this.f35188k = str;
    }

    public void e(long j10) {
        this.f35181d = j10;
    }

    public String f() {
        return this.f35189l;
    }

    public Map<String, com.mbridge.msdk.videocommon.entity.c> g() {
        return this.f35179b;
    }

    public long h() {
        return this.f35181d * 1000;
    }

    public long i() {
        return this.f35184g;
    }

    public String j() {
        return this.f35188k;
    }

    public void a(long j10) {
        this.f35185h = j10;
    }

    public void b(long j10) {
        this.f35183f = j10;
    }

    public void c(long j10) {
        this.f35180c = j10;
    }

    public long d() {
        return this.f35180c * 1000;
    }

    public long e() {
        return this.f35182e * 1000;
    }

    public void f(long j10) {
        this.f35184g = j10;
    }

    public JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, Integer> map = this.f35178a;
            if (map != null && map.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Integer> entry : this.f35178a.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject.put("caplist", jSONObject2);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            Map<String, com.mbridge.msdk.videocommon.entity.c> map2 = this.f35179b;
            if (map2 != null && map2.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, com.mbridge.msdk.videocommon.entity.c> entry2 : this.f35179b.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        String key = entry2.getKey();
                        com.mbridge.msdk.videocommon.entity.c value = entry2.getValue();
                        if (value != null) {
                            jSONObject3.put("name", value.c());
                            jSONObject3.put(RewardPlus.AMOUNT, value.a());
                            jSONObject3.put("id", key);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject.put(mTFeqtajA.jOvKdCxmSOXWTf, jSONArray);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.f35180c);
            jSONObject.put("ruct", this.f35181d);
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, this.f35182e);
            jSONObject.put("dlct", this.f35183f);
            jSONObject.put("vcct", this.f35184g);
            jSONObject.put("current_time", this.f35185h);
            jSONObject.put("vtag", this.f35188k);
            jSONObject.put("isDefault", this.f35186i);
            return jSONObject;
        } catch (Exception e12) {
            e12.printStackTrace();
            return jSONObject;
        }
    }

    public void a(Map<String, Integer> map) {
        this.f35178a = map;
    }

    public long b() {
        return this.f35185h;
    }

    public long c() {
        return this.f35183f;
    }

    public void d(long j10) {
        this.f35182e = j10;
    }

    public void a(int i10) {
        this.f35186i = i10;
    }

    public void b(Map<String, com.mbridge.msdk.videocommon.entity.c> map) {
        this.f35179b = map;
    }

    public static a a(String str) {
        a aVar = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                a aVar2 = new a();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("caplist");
                    aVar2.b(jSONObject.optString("ab_id", ""));
                    aVar2.c(jSONObject.optString("rid", ""));
                    if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                        HashMap map = new HashMap();
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys != null && itKeys.hasNext()) {
                            String next = itKeys.next();
                            int iOptInt = jSONObjectOptJSONObject.optInt(next, 1000);
                            if (!TextUtils.isEmpty(next)) {
                                if (!TextUtils.isEmpty(next) && iOptInt == 0) {
                                    map.put(next, 1000);
                                } else {
                                    map.put(next, Integer.valueOf(iOptInt));
                                }
                            }
                        }
                        aVar2.a(map);
                    }
                    aVar2.b(com.mbridge.msdk.videocommon.entity.c.a(jSONObject.optJSONArray("reward")));
                    aVar2.c(jSONObject.optLong("getpf", 43200L));
                    aVar2.e(jSONObject.optLong("ruct", 5400L));
                    aVar2.d(jSONObject.optLong(CampaignEx.JSON_KEY_PLCT, 3600L));
                    aVar2.b(jSONObject.optLong("dlct", 3600L));
                    aVar2.f(jSONObject.optLong("vcct", 5L));
                    aVar2.a(jSONObject.optLong("current_time"));
                    aVar2.d(jSONObject.optString("vtag", ""));
                    return aVar2;
                } catch (Exception e10) {
                    e = e10;
                    aVar = aVar2;
                    e.printStackTrace();
                    return aVar;
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        return aVar;
    }
}
