package com.mbridge.msdk.setting;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import org.json.JSONArray;
import org.json.JSONObject;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f32504b = "j";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32505a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a extends com.mbridge.msdk.foundation.same.net.wrapper.d {
        a() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) {
            if (jSONObject == null || !jSONObject.has(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I)) {
                return;
            }
            try {
                g0.a().a(jSONObject.getString(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I));
            } catch (Exception e10) {
                q0.b(j.f32504b, e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class c extends com.mbridge.msdk.foundation.same.net.handler.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f32511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f32512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f32513d;

        c(Context context, String str, String str2) {
            this.f32511b = context;
            this.f32512c = str;
            this.f32513d = str2;
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void a(String str) {
            com.mbridge.msdk.foundation.same.net.utils.d.h().f30635r = false;
            q0.a(j.f32504b, "fetch CNDSettingHost failed, errorCode = " + str);
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void b(String str) {
            q0.a(j.f32504b, "fetch CNDSettingHost success, content = " + str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host_ts", System.currentTimeMillis());
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host", str);
            for (String str2 : str.split("\n")) {
                if (!TextUtils.isEmpty(str2.trim()) && !com.mbridge.msdk.foundation.same.net.utils.d.h().f30638u.contains(str2.trim())) {
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f30638u.add(str2.trim());
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f30641x.add(str2.trim());
                }
            }
            j.this.a(this.f32511b, this.f32512c, this.f32513d);
        }
    }

    private String b() {
        String str = com.mbridge.msdk.foundation.same.net.utils.d.h().f30636s ? com.mbridge.msdk.foundation.same.net.utils.d.h().R : com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
        try {
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().f30636s && com.mbridge.msdk.foundation.same.net.utils.d.h().f30635r && com.mbridge.msdk.foundation.same.net.utils.d.h().f30640w < com.mbridge.msdk.foundation.same.net.utils.d.h().f30641x.size()) {
                String str2 = com.mbridge.msdk.foundation.same.net.utils.d.h().f30641x.get(com.mbridge.msdk.foundation.same.net.utils.d.h().f30640w);
                if (!TextUtils.isEmpty(str2)) {
                    if (!str2.startsWith("http")) {
                        if (str2.startsWith("https")) {
                        }
                    }
                    return str2 + "/setting";
                }
            }
        } catch (Throwable th2) {
            q0.b(f32504b, th2.getMessage());
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.n().d()).a();
        } catch (Throwable th2) {
            q0.b(f32504b, th2.getMessage());
        }
    }

    public void d(Context context, String str, String str2) {
        try {
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().f30635r) {
                return;
            }
            com.mbridge.msdk.foundation.same.net.utils.d.h().f30635r = true;
            if (System.currentTimeMillis() >= com.mbridge.msdk.foundation.buffer.sharedperference.a.b().b("mkey_spare_host_ts").longValue() + com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS) {
                String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host");
                if (!TextUtils.isEmpty(strA)) {
                    for (String str3 : strA.split("\n")) {
                        if (!TextUtils.isEmpty(str3.trim()) && !com.mbridge.msdk.foundation.same.net.utils.d.h().f30638u.contains(str3.trim())) {
                            com.mbridge.msdk.foundation.same.net.utils.d.h().f30638u.add(str3.trim());
                            com.mbridge.msdk.foundation.same.net.utils.d.h().f30641x.add(str3.trim());
                        }
                    }
                    a(context, str, str2);
                    return;
                }
            }
            new com.mbridge.msdk.foundation.same.net.wrapper.c(context.getApplicationContext()).get(0, com.mbridge.msdk.foundation.same.net.utils.d.h().f30616c, new com.mbridge.msdk.foundation.same.net.wrapper.e(), new c(context, str, str2), "setting", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        } catch (Throwable th2) {
            com.mbridge.msdk.foundation.same.net.utils.d.h().f30635r = false;
            q0.b(f32504b, th2.getMessage());
        }
    }

    public void c(Context context, String str, String str2) {
        a(context, str, str2, "1", new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2) {
        if (!com.mbridge.msdk.foundation.same.net.utils.d.h().g()) {
            d(context, str, str2);
        } else {
            b(context, str, str2);
        }
    }

    public void a(Context context, String str, String str2, String str3, com.mbridge.msdk.foundation.same.net.wrapper.d dVar) {
        if (context == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.a.W++;
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
        eVar.a(MBridgeConstans.APP_ID, str);
        eVar.a("sign", SameMD5.getMD5(str + str2));
        try {
            g gVarD = h.b().d(str);
            String strZ0 = gVarD.z0();
            if (TextUtils.isEmpty(strZ0)) {
                strZ0 = "";
            }
            eVar.a("vtag", strZ0);
            eVar.a("current_pipeline_id", String.valueOf(gVarD.a0()));
            eVar.a("p_p_c_id", String.valueOf(gVarD.e0()));
            eVar.a("c_m_l_id", String.valueOf(gVarD.o()));
            eVar.a("csi", com.mbridge.msdk.foundation.same.report.metrics.d.b().d());
            eVar.a("ind", String.valueOf(com.mbridge.msdk.foundation.same.a.W));
            eVar.a("fir", String.valueOf(com.mbridge.msdk.foundation.same.a.X));
            eVar.a("fir_t", String.valueOf(com.mbridge.msdk.foundation.same.a.Y));
            String strA = gVarD.a();
            this.f32505a = strA;
            eVar.a("a_stid", TextUtils.isEmpty(strA) ? "" : this.f32505a);
        } catch (Throwable th2) {
            q0.b(f32504b, th2.getMessage());
        }
        if (com.mbridge.msdk.foundation.same.net.utils.d.h().f30635r) {
            eVar.a("st_net", com.mbridge.msdk.foundation.same.net.utils.d.h().f30637t + "");
        }
        eVar.a("only_p_info", str3);
        com.mbridge.msdk.setting.net.c cVar = new com.mbridge.msdk.setting.net.c(context);
        String str4 = com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
        try {
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().f30636s && com.mbridge.msdk.foundation.same.net.utils.d.h().f30635r && com.mbridge.msdk.foundation.same.net.utils.d.h().f30640w < com.mbridge.msdk.foundation.same.net.utils.d.h().f30641x.size()) {
                String str5 = com.mbridge.msdk.foundation.same.net.utils.d.h().f30641x.get(com.mbridge.msdk.foundation.same.net.utils.d.h().f30640w);
                if (!TextUtils.isEmpty(str5) && (str5.startsWith("http") || str5.startsWith("https"))) {
                    str4 = str5 + "/setting";
                }
            }
        } catch (Throwable th3) {
            q0.b(f32504b, th3.getMessage());
        }
        cVar.get(1, str4, eVar, dVar, "setting", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    }

    public void b(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        a(context, str, str2, MBridgeConstans.ENDCARD_URL_TYPE_PL, new b(SameMD5.getMD5(v0.d()), h.b().h(str), str, context, str2));
        a(3, 0, "");
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends com.mbridge.msdk.foundation.same.net.wrapper.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f32515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f32516c;

        d(String str, String str2) {
            this.f32515b = str;
            this.f32516c = str2;
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) {
            try {
                boolean zA = v0.a(jSONObject);
                String str = CIdIVqKnNZ.EKCtRsgL;
                if (zA) {
                    String strOptString = jSONObject.optString("vtag", str);
                    String strOptString2 = jSONObject.optString("rid", str);
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("unitSetting");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
                        if (jSONObject.optInt("vtag_status", 0) == 1) {
                            String strF = h.b().f(this.f32515b, this.f32516c);
                            if (!TextUtils.isEmpty(strF)) {
                                try {
                                    jSONObjectOptJSONObject = h.b().a(new JSONObject(strF), jSONObjectOptJSONObject);
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                            }
                        }
                        jSONObjectOptJSONObject.put("current_time", System.currentTimeMillis());
                        jSONObjectOptJSONObject.put("vtag", strOptString);
                        jSONObjectOptJSONObject.put("rid", strOptString2);
                        h.b().a(this.f32515b, this.f32516c, jSONObjectOptJSONObject.toString());
                    }
                } else {
                    h.b().j(this.f32515b, this.f32516c);
                }
                j.this.a(1, 1, str);
            } catch (Exception e11) {
                q0.b(j.f32504b, e11.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
            j.this.a(2, 1, "");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class b extends com.mbridge.msdk.foundation.same.net.wrapper.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f32507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f32508c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f32509d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, String str3, Context context, String str4) {
            super(str, str2);
            this.f32507b = str3;
            this.f32508c = context;
            this.f32509d = str4;
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) {
            try {
                if (v0.a(jSONObject)) {
                    if (jSONObject.optInt("vtag_status", 0) == 1) {
                        String strG = h.b().g(this.f32507b);
                        if (!TextUtils.isEmpty(strG)) {
                            try {
                                jSONObject = h.b().a(new JSONObject(strG), jSONObject);
                            } catch (Exception e10) {
                                q0.b(j.f32504b, e10.getMessage());
                            }
                        }
                    }
                    k.a(jSONObject);
                    jSONObject.put("current_time", System.currentTimeMillis());
                    if (com.mbridge.msdk.foundation.same.net.utils.d.h().f30636s) {
                        if (TextUtils.isEmpty(jSONObject.optString("hst_st_t"))) {
                            jSONObject.put("hst_st_t", com.mbridge.msdk.foundation.same.net.utils.d.h().f30630m);
                        }
                    } else if (TextUtils.isEmpty(jSONObject.optString("hst_st"))) {
                        jSONObject.put("hst_st", com.mbridge.msdk.foundation.same.net.utils.d.h().f30626i);
                    }
                    h.b().h(this.f32507b, jSONObject.toString());
                    com.mbridge.msdk.foundation.same.net.utils.d.h().j();
                    k.a();
                    try {
                        if (!TextUtils.isEmpty(jSONObject.optString("mraid_js"))) {
                            com.mbridge.msdk.setting.util.a.a().a(this.f32508c, jSONObject.optString("mraid_js"));
                        }
                    } catch (Exception e11) {
                        q0.b(j.f32504b, e11.getMessage());
                    }
                    if (!TextUtils.isEmpty(jSONObject.optString("web_env_url"))) {
                        com.mbridge.msdk.setting.util.b.c().a(this.f32508c, jSONObject.optString("web_env_url"));
                    }
                    j.this.a(this.f32508c, this.f32507b);
                } else {
                    h.b().l(this.f32507b);
                }
                j.this.c();
            } catch (Exception e12) {
                q0.b(j.f32504b, e12.getMessage());
            }
            try {
                j.this.a(1, 0, "");
            } catch (Throwable th2) {
                q0.b(j.f32504b, th2.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
            try {
                j.this.a(2, 0, str);
            } catch (Throwable th2) {
                q0.b(j.f32504b, th2.getMessage());
            }
            if (!com.mbridge.msdk.foundation.same.net.utils.d.h().f30636s) {
                com.mbridge.msdk.foundation.same.net.utils.d.h().f30639v++;
            } else {
                com.mbridge.msdk.foundation.same.net.utils.d.h().f30640w++;
            }
            j.this.a(this.f32508c, this.f32507b, this.f32509d);
            j.this.c();
            q0.b(j.f32504b, "get app setting error" + str);
        }
    }

    public void a(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str = com.mbridge.msdk.foundation.controller.c.n().b();
            str2 = com.mbridge.msdk.foundation.controller.c.n().c();
        }
        if (h.b().g(str3, str) && h.b().a(str, 2, str3)) {
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
            String str4 = "[" + str3 + "]";
            eVar.a("unit_ids", str4);
            eVar.a(MBridgeConstans.APP_ID, str);
            eVar.a(QGbBllacZSmHKn.rRIgUMNJUjcWfD, SameMD5.getMD5(str + str2));
            try {
                String strJ = h.b().d(str, str4).J();
                if (TextUtils.isEmpty(strJ)) {
                    strJ = "";
                }
                eVar.a("vtag", strJ);
            } catch (Throwable th2) {
                q0.b(f32504b, th2.getMessage());
            }
            d dVar = new d(str, str3);
            dVar.setUnitId(str3);
            new com.mbridge.msdk.setting.net.c(context).get(1, com.mbridge.msdk.foundation.same.net.utils.d.h().Q, eVar, dVar, "setting", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            a(3, 1, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str) {
        g gVarF;
        h hVarB = h.b();
        if (hVarB != null && (gVarF = hVarB.f(str)) != null) {
            MBridgeConstans.OMID_JS_SERVICE_URL = gVarF.V();
            MBridgeConstans.OMID_JS_H5_URL = gVarF.U();
        }
        com.mbridge.msdk.omsdk.b.b(context);
        com.mbridge.msdk.omsdk.b.c(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11, String str) {
        String strB;
        g gVarF;
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("key", "2000112");
            eVar.a("st_net", Integer.valueOf(com.mbridge.msdk.foundation.same.net.utils.d.h().f30637t));
            eVar.a("result", Integer.valueOf(i10));
            eVar.a("type", Integer.valueOf(i11));
            if (i11 == 0) {
                strB = b();
                eVar.a("ind", String.valueOf(com.mbridge.msdk.foundation.same.a.W));
                eVar.a("fir", String.valueOf(com.mbridge.msdk.foundation.same.a.X));
                eVar.a("fir_t", String.valueOf(com.mbridge.msdk.foundation.same.a.Y));
                String str2 = "";
                eVar.a("a_stid", TextUtils.isEmpty(this.f32505a) ? "" : this.f32505a);
                if (i10 == 2 && (gVarF = h.b().f(com.mbridge.msdk.foundation.controller.c.n().b())) != null) {
                    String strA = gVarF.a();
                    if (!TextUtils.isEmpty(strA)) {
                        str2 = strA;
                    }
                    eVar.a("a_stid_n", str2);
                }
            } else {
                strB = com.mbridge.msdk.foundation.same.net.utils.d.h().f30636s ? com.mbridge.msdk.foundation.same.net.utils.d.h().R : com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
            }
            eVar.a("url", strB);
            eVar.a("reason", str);
            cVar.a("2000112", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000112", cVar);
        } catch (Throwable th2) {
            q0.b(f32504b, th2.getMessage());
        }
    }
}
