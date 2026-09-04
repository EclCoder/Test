package com.mbridge.msdk.videocommon.net;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.setting.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f35170a = "com.mbridge.msdk.videocommon.net.a";

    public void a(Context context, String str, String str2) {
        e eVar = new e();
        eVar.a(MBridgeConstans.APP_ID, str);
        eVar.a("sign", SameMD5.getMD5(str + str2));
        try {
            com.mbridge.msdk.videocommon.setting.a aVarD = com.mbridge.msdk.videocommon.setting.b.b().d();
            if (aVarD == null) {
                eVar.a("vtag", "");
            } else {
                String strJ = aVarD.j();
                if (TextUtils.isEmpty(strJ)) {
                    strJ = "";
                }
                eVar.a("vtag", strJ);
            }
        } catch (Throwable th2) {
            q0.b(f35170a, th2.getMessage());
        }
        new com.mbridge.msdk.videocommon.net.b(context).get(1, d.h().T, eVar, new C0483a(str), "setting", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        a(3, 2, "");
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.net.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0483a extends com.mbridge.msdk.foundation.same.net.wrapper.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35171b;

        C0483a(String str) {
            this.f35171b = str;
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) {
            try {
                if (v0.a(jSONObject)) {
                    com.mbridge.msdk.videocommon.setting.b.b().b(false);
                    if (jSONObject.optInt("vtag_status", 0) == 1) {
                        String strD = com.mbridge.msdk.videocommon.setting.b.b().d(this.f35171b);
                        if (!TextUtils.isEmpty(strD)) {
                            try {
                                jSONObject = h.b().a(new JSONObject(strD), jSONObject);
                            } catch (Exception e10) {
                                q0.b(a.f35170a, e10.getMessage());
                            }
                        }
                    }
                    try {
                        jSONObject.put("current_time", System.currentTimeMillis());
                        com.mbridge.msdk.videocommon.setting.b.b().f(this.f35171b, jSONObject.toString());
                    } catch (JSONException e11) {
                        q0.b(a.f35170a, e11.getMessage());
                    }
                } else {
                    com.mbridge.msdk.videocommon.setting.b.b().f(this.f35171b);
                }
                a.this.a(1, 2, "");
            } catch (Throwable th2) {
                q0.b(a.f35170a, th2.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
            com.mbridge.msdk.videocommon.setting.b.b().b(false);
            q0.b(a.f35170a, str);
            a.this.a(2, 2, str);
        }
    }

    public void a(Context context, String str, String str2, String str3, c cVar) {
        e eVar = new e();
        eVar.a(MBridgeConstans.APP_ID, str);
        eVar.a("sign", SameMD5.getMD5(str + str2));
        eVar.a("unit_ids", "[" + str3 + "]");
        try {
            com.mbridge.msdk.videocommon.setting.c cVarD = com.mbridge.msdk.videocommon.setting.b.b().d(str, str3);
            if (cVarD == null) {
                eVar.a("vtag", "");
            } else {
                String strG = cVarD.G();
                if (TextUtils.isEmpty(strG)) {
                    strG = "";
                }
                eVar.a("vtag", strG);
            }
        } catch (Throwable th2) {
            q0.b(f35170a, th2.getMessage());
        }
        b bVar = new b(str, cVar);
        bVar.setUnitId(str3);
        new com.mbridge.msdk.videocommon.net.b(context).get(1, d.h().T, eVar, bVar, "setting", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        a(3, 3, "");
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends com.mbridge.msdk.foundation.same.net.wrapper.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f35174c;

        /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.net.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class RunnableC0484a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ JSONObject f35176a;

            RunnableC0484a(JSONObject jSONObject) {
                this.f35176a = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.videocommon.setting.b bVarB = com.mbridge.msdk.videocommon.setting.b.b();
                b bVar = b.this;
                bVarB.a(bVar.f35173b, bVar.unitId, this.f35176a.toString());
            }
        }

        b(String str, c cVar) {
            this.f35173b = str;
            this.f35174c = cVar;
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) {
            try {
                try {
                    com.mbridge.msdk.videocommon.setting.b.b().e(this.unitId);
                } catch (Exception e10) {
                    q0.b(a.f35170a, e10.getMessage());
                }
                if (v0.a(jSONObject)) {
                    if (jSONObject.optInt("vtag_status", 0) == 1) {
                        String strB = com.mbridge.msdk.videocommon.setting.b.b().b(this.f35173b, this.unitId);
                        if (!TextUtils.isEmpty(strB)) {
                            try {
                                jSONObject = h.b().a(new JSONObject(strB), jSONObject);
                            } catch (Exception e11) {
                                q0.b(a.f35170a, e11.getMessage());
                            }
                        }
                    }
                    if (com.mbridge.msdk.videocommon.setting.b.c(jSONObject.toString())) {
                        jSONObject.put("current_time", System.currentTimeMillis());
                        RunnableC0484a runnableC0484a = new RunnableC0484a(jSONObject);
                        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(runnableC0484a);
                        } else {
                            runnableC0484a.run();
                        }
                        c cVar = this.f35174c;
                        if (cVar != null) {
                            cVar.a("request success");
                        }
                    } else {
                        c cVar2 = this.f35174c;
                        if (cVar2 != null) {
                            cVar2.onFailed("data error");
                        }
                    }
                } else {
                    com.mbridge.msdk.videocommon.setting.b.b().g(this.f35173b, this.unitId);
                }
                a.this.a(1, 3, "");
            } catch (Throwable th2) {
                q0.b(a.f35170a, th2.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
            try {
                com.mbridge.msdk.videocommon.setting.b.b().e(this.unitId);
            } catch (Exception e10) {
                q0.b(a.f35170a, e10.getMessage());
            }
            if (!TextUtils.isEmpty(str)) {
                c cVar = this.f35174c;
                if (cVar != null) {
                    cVar.onFailed(str);
                }
            } else {
                c cVar2 = this.f35174c;
                if (cVar2 != null) {
                    cVar2.onFailed("request error");
                }
            }
            a.this.a(2, 3, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11, String str) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("key", "2000112");
            eVar.a("st_net", Integer.valueOf(d.h().f30637t));
            eVar.a("result", Integer.valueOf(i10));
            eVar.a("type", Integer.valueOf(i11));
            eVar.a("url", d.h().f30636s ? d.h().U : d.h().T);
            eVar.a("reason", str);
            cVar.a("2000112", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000112", cVar);
        } catch (Throwable th2) {
            q0.b(f35170a, th2.getMessage());
        }
    }
}
