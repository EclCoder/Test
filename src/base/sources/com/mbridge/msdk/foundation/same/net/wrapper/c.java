package com.mbridge.msdk.foundation.same.net.wrapper;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.api.client.http.UrlEncodedParser;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.out.CustomInfoManager;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.tracker.network.k;
import com.mbridge.msdk.tracker.network.l;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import r7.pgx.XTkUEXuiK;
import v7.XOSD.qnwOeeQSSWa;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class c {
    private static final String TAG = "c";
    protected Context mContext;

    public c(Context context) {
        if (context == null) {
            this.mContext = com.mbridge.msdk.foundation.controller.c.n().d();
        } else {
            this.mContext = context.getApplicationContext();
        }
    }

    private String asUrlParams(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            StringBuilder sb2 = new StringBuilder();
            try {
                for (String str : map.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = map.get(str);
                        if (TextUtils.isEmpty(str2)) {
                            str2 = "";
                        }
                        sb2.append(qnwOeeQSSWa.nLBqPuezSnzO);
                        sb2.append(str);
                        sb2.append(XTkUEXuiK.zLBokbrY);
                        sb2.append(str2);
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b(TAG, e10.getMessage());
                }
                sb2 = null;
            }
            if (sb2 != null && sb2.length() > 0) {
                return (map.containsKey("rk") && map.containsKey("erk") && "1".equals(map.get("erk"))) ? v0.b(sb2.toString(), "ebmclXzZOhtU2sRlZxGL8A") : sb2.toString();
            }
        }
        return null;
    }

    private static com.mbridge.msdk.tracker.network.h<?> createRequest(int i10, int i11, String str, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        if (i10 == 0) {
            return new k(i11, str, str2, j10, new i(bVar));
        }
        if (i10 != 1) {
            return null;
        }
        return new com.mbridge.msdk.tracker.network.i(i11, str, str2, j10, new i(bVar));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023 A[Catch: Exception -> 0x0009, TryCatch #2 {Exception -> 0x0009, blocks: (B:3:0x0002, B:6:0x000b, B:8:0x000f, B:10:0x0023, B:11:0x002d, B:14:0x003f), top: B:90:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:8:0x000f A[Catch: Exception -> 0x0009, TryCatch #2 {Exception -> 0x0009, blocks: (B:3:0x0002, B:6:0x000b, B:8:0x000f, B:10:0x0023, B:11:0x002d, B:14:0x003f), top: B:90:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    private void post(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z10, boolean z11, String str2, long j10) {
        String str3;
        com.mbridge.msdk.setting.a aVarJ;
        com.mbridge.msdk.tracker.network.h<?> hVarCreateRequest;
        String str4;
        int iC0;
        String strK;
        int iL;
        String str5;
        com.mbridge.msdk.foundation.same.net.e eVarA;
        String key;
        String strIsRKE;
        if (eVar == null) {
            try {
                eVar = new e();
                if (bVar instanceof com.mbridge.msdk.foundation.same.net.c) {
                    key = ((com.mbridge.msdk.foundation.same.net.c) bVar).getKey();
                    strIsRKE = ((com.mbridge.msdk.foundation.same.net.c) bVar).isRKE();
                    if (!TextUtils.isEmpty(key)) {
                        eVar.a("rk", key);
                        eVar.a("erk", strIsRKE);
                    }
                }
                addExtraParams(str, eVar);
                f.k(eVar);
                eVarA = com.mbridge.msdk.foundation.same.net.utils.c.b().a(eVar);
                if (eVarA != null && bVar != null) {
                    bVar.onSuccess(eVarA);
                    return;
                }
            } catch (Exception e10) {
                q0.a(TAG, e10.getMessage());
            }
        } else {
            if (bVar instanceof com.mbridge.msdk.foundation.same.net.c) {
                key = ((com.mbridge.msdk.foundation.same.net.c) bVar).getKey();
                strIsRKE = ((com.mbridge.msdk.foundation.same.net.c) bVar).isRKE();
                if (!TextUtils.isEmpty(key)) {
                    eVar.a("rk", key);
                    eVar.a("erk", strIsRKE);
                }
            }
            addExtraParams(str, eVar);
            f.k(eVar);
            eVarA = com.mbridge.msdk.foundation.same.net.utils.c.b().a(eVar);
            if (eVarA != null) {
                bVar.onSuccess(eVarA);
                return;
            }
        }
        q0.c(TAG, "post url = " + str);
        if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f30618d)) {
            com.mbridge.msdk.setting.g gVarF = com.mbridge.msdk.setting.h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarF != null) {
                iL = gVarF.L();
                try {
                    str5 = eVar.a().get(DataSchemeDataSource.SCHEME_DATA);
                    if (!z11) {
                        try {
                            if (!com.mbridge.msdk.foundation.same.report.b.a(gVarF, str5)) {
                                return;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                    str5 = "";
                }
                strK = gVarF.k();
                iC0 = gVarF.C0();
                eVar.a("a_stid", gVarF.a());
            } else {
                iC0 = 0;
                strK = "UNKNOWN";
                iL = 1;
                str5 = "";
            }
            eVar.a("country_code", strK);
            try {
                if (iL == 2) {
                    if (!TextUtils.isEmpty(str5)) {
                        if (com.mbridge.msdk.foundation.same.report.b.a(gVarF, str5)) {
                            if (iC0 == 1 || iC0 == 3) {
                                com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().f30627j, com.mbridge.msdk.foundation.same.net.utils.d.h().f30631n, eVar.toString(), false, bVar, false);
                            }
                        } else if (z11) {
                            if (iC0 == 1 || iC0 == 3) {
                                com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().f30627j, com.mbridge.msdk.foundation.same.net.utils.d.h().f30631n, eVar.toString(), false, bVar, false);
                            }
                        }
                    }
                    return;
                }
                if (iL == 1) {
                    com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().f30627j, com.mbridge.msdk.foundation.same.net.utils.d.h().f30631n, eVar.toString(), false, bVar, false);
                    return;
                }
            } catch (Exception e13) {
                e13.printStackTrace();
            }
            hVarCreateRequest = createRequest(i10, 1, str3, bVar, str2, j10);
            if (hVarCreateRequest != null) {
                if (eVar != null && eVar.a() != null) {
                    str4 = eVar.a().get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
                    if (TextUtils.isEmpty(str4)) {
                        str4 = "";
                    }
                    hVarCreateRequest.a("local_id", str4);
                    String str6 = eVar.a().get("ad_type");
                    hVarCreateRequest.a("ad_type", TextUtils.isEmpty(str6) ? "" : str6);
                    hVarCreateRequest.a(eVar.a());
                }
                hVarCreateRequest.d(canTrack());
                hVarCreateRequest.b("Content-Type", UrlEncodedParser.CONTENT_TYPE);
                l.a().b().a(hVarCreateRequest);
            }
        }
        if (!str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f30625h)) {
            if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f30619d0)) {
                if (eVar != null) {
                    str = str + "?" + eVar.toString();
                }
                JSONArray jSONArrayB = com.mbridge.msdk.foundation.db.middle.b.a().b();
                if (jSONArrayB != null) {
                    String string = jSONArrayB.toString();
                    e eVar2 = new e();
                    eVar2.a(e.f30654k, string);
                    str3 = str;
                    eVar = eVar2;
                }
            }
            hVarCreateRequest = createRequest(i10, 1, str3, bVar, str2, j10);
            if (hVarCreateRequest != null) {
                if (eVar != null) {
                    str4 = eVar.a().get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
                    if (TextUtils.isEmpty(str4)) {
                        str4 = "";
                    }
                    hVarCreateRequest.a("local_id", str4);
                    String str7 = eVar.a().get("ad_type");
                    hVarCreateRequest.a("ad_type", TextUtils.isEmpty(str7) ? "" : str7);
                    hVarCreateRequest.a(eVar.a());
                }
                hVarCreateRequest.d(canTrack());
                hVarCreateRequest.b("Content-Type", UrlEncodedParser.CONTENT_TYPE);
                l.a().b().a(hVarCreateRequest);
            }
        }
        com.mbridge.msdk.setting.g gVarF2 = com.mbridge.msdk.setting.h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarF2 != null && (aVarJ = gVarF2.j()) != null && aVarJ.h() == 1) {
            com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().f30629l, com.mbridge.msdk.foundation.same.net.utils.d.h().f30633p, eVar.toString(), false, bVar, false);
            return;
        }
        str3 = str;
        hVarCreateRequest = createRequest(i10, 1, str3, bVar, str2, j10);
        if (hVarCreateRequest != null) {
            if (eVar != null) {
                str4 = eVar.a().get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
                if (TextUtils.isEmpty(str4)) {
                    str4 = "";
                }
                hVarCreateRequest.a("local_id", str4);
                String str8 = eVar.a().get("ad_type");
                hVarCreateRequest.a("ad_type", TextUtils.isEmpty(str8) ? "" : str8);
                hVarCreateRequest.a(eVar.a());
            }
            hVarCreateRequest.d(canTrack());
            hVarCreateRequest.b("Content-Type", UrlEncodedParser.CONTENT_TYPE);
            l.a().b().a(hVarCreateRequest);
        }
    }

    public void addExtraParams(String str, e eVar) {
        if (eVar == null) {
            q0.b(TAG, "addExtraParams error, params is null,frame work error");
            return;
        }
        String strA = Aa.a();
        if (strA == null) {
            strA = "";
        }
        eVar.a("channel", strA);
        eVar.a("band_width", com.mbridge.msdk.foundation.same.net.a.b().a() + "");
        eVar.a(com.vungle.ads.internal.presenter.g.OPEN, com.mbridge.msdk.foundation.same.a.S);
        if (com.mbridge.msdk.util.b.a() && !TextUtils.isEmpty(str) && str.contains("setting")) {
            String strB = Aa.b();
            if (!TextUtils.isEmpty(strB)) {
                eVar.a("keyword", strB);
            }
        }
        String str2 = eVar.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
        if (str2 != null) {
            String customInfoByUnitId = CustomInfoManager.getInstance().getCustomInfoByUnitId(str2, str);
            if (!TextUtils.isEmpty(customInfoByUnitId)) {
                eVar.a("ch_info", customInfoByUnitId);
            }
            com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), str2);
            if (lVarE != null && !TextUtils.isEmpty(lVarE.a())) {
                eVar.a("u_stid", lVarE.a());
            }
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            eVar.a("dev_source", MBridgeConstans.API_REUQEST_CATEGORY_APP);
        }
        if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
            eVar.a("re_domain", "1");
        }
    }

    protected boolean canTrack() {
        return true;
    }

    public void choiceV3OrV5BySetting(int i10, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str, long j10) {
        e eVar2;
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        int iT0 = TextUtils.isEmpty(str) ? gVarD.t0() : gVarD.C();
        String strA = com.mbridge.msdk.foundation.same.net.utils.d.h().a(str, iT0);
        if (iT0 < 2) {
            postV5(i10, strA, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
            return;
        }
        if (iT0 % 2 == 0) {
            if (eVar == null) {
                eVar = new e();
            }
            eVar2 = eVar;
            JSONArray jSONArrayB = com.mbridge.msdk.foundation.db.middle.b.a().b();
            if (jSONArrayB != null) {
                String string = jSONArrayB.toString();
                int i11 = com.mbridge.msdk.foundation.same.net.utils.d.h().i();
                if (i11 > 0 && string.length() > i11) {
                    post(i10, strA, eVar2, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
                    return;
                }
                eVar2.a(e.f30654k, string);
            }
        } else {
            eVar2 = eVar;
        }
        getLoadOrSetting(i10, strA, eVar2, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
    }

    public void get(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        get(i10, str, eVar, bVar, false, false, str2, j10);
    }

    public void getCampaign(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, long j10) {
        e eVar2;
        try {
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            int iT0 = TextUtils.isEmpty(str) ? gVarD.t0() : gVarD.C();
            String strA = com.mbridge.msdk.foundation.same.net.utils.d.h().a(str, iT0);
            if (iT0 < 2) {
                postV5(i10, strA, eVar, bVar, true, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
                return;
            }
            if (iT0 % 2 == 0) {
                if (eVar == null) {
                    eVar = new e();
                }
                eVar2 = eVar;
                JSONArray jSONArrayB = com.mbridge.msdk.foundation.db.middle.b.a().b();
                if (jSONArrayB != null) {
                    String string = jSONArrayB.toString();
                    int i11 = com.mbridge.msdk.foundation.same.net.utils.d.h().i();
                    if (i11 > 0 && string.length() > i11) {
                        post(i10, strA, eVar2, bVar, true, false, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
                        return;
                    }
                    eVar2.a(e.f30654k, string);
                }
            } else {
                eVar2 = eVar;
            }
            get(i10, strA, eVar2, bVar, true, true, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, e10.getMessage());
            }
        }
    }

    public void getLoadOrSetting(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        getLoadOrSetting(i10, str, eVar, bVar, true, str2, j10);
    }

    public void postFocusReport(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        post(i10, str, eVar, bVar, false, true, str2, j10);
    }

    public void postV5(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        String str3 = eVar.a().get("sign");
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        eVar.a(CampaignEx.JSON_KEY_ST_TS, jCurrentTimeMillis + "");
        eVar.a("st", SameMD5.getMD5(jCurrentTimeMillis + str3));
        post(i10, str, eVar, bVar, false, false, str2, j10);
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0148  */
    /* JADX WARN: Code duplicated, block: B:55:0x0160  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:76:0x0220  */
    /* JADX WARN: Code duplicated, block: B:81:0x023a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0253  */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x01a1, please report this as an issue */
    public void get(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z10, boolean z11, String str2, long j10) {
        e eVar2;
        e eVar3;
        String str3;
        com.mbridge.msdk.setting.g gVarD;
        com.mbridge.msdk.tracker.network.h<?> hVarCreateRequest;
        String str4;
        boolean z12;
        if (eVar == null) {
            try {
                eVar2 = new e();
            } catch (Exception e10) {
                e = e10;
                eVar2 = eVar;
                q0.a(TAG, e.getMessage());
                eVar3 = eVar2;
                if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f30626i)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("uri", com.mbridge.msdk.foundation.same.net.utils.d.h().f30630m + Uri.parse(str).getPath());
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, eVar3.b());
                        } catch (Throwable th2) {
                            q0.b(TAG, th2.getMessage());
                        }
                        com.mbridge.msdk.foundation.same.net.f fVarB = com.mbridge.msdk.foundation.same.net.f.b();
                        String str5 = com.mbridge.msdk.foundation.same.net.utils.d.h().f30630m;
                        int i11 = com.mbridge.msdk.foundation.same.net.utils.d.h().f30634q;
                        String string = jSONObject.toString();
                        if (eVar3 == null) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        fVarB.a(str5, i11, string, true, bVar, z12);
                        return;
                    } catch (Throwable th3) {
                        q0.b(TAG, th3.getMessage());
                    }
                }
                if (eVar3 != null) {
                    str3 = str;
                } else if (TextUtils.isEmpty(eVar3.c().optString("rk"))) {
                    str3 = str + "?" + eVar3.toString();
                } else {
                    str3 = str + "?" + eVar3.toString();
                }
                gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                if (str3.length() < gVarD.q0()) {
                }
                if (str3.length() < gVarD.M()) {
                }
                hVarCreateRequest = createRequest(i10, 0, str, bVar, str2, j10);
                if (hVarCreateRequest != null) {
                    if (eVar3 != null) {
                        str4 = eVar3.a().get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
                        if (TextUtils.isEmpty(str4)) {
                            str4 = "";
                        }
                        hVarCreateRequest.a("local_id", str4);
                        String str6 = eVar3.a().get("ad_type");
                        hVarCreateRequest.a("ad_type", TextUtils.isEmpty(str6) ? "" : str6);
                        hVarCreateRequest.a(eVar3.a());
                    }
                    hVarCreateRequest.d(canTrack());
                    l.a().b().a(hVarCreateRequest);
                }
            }
        } else {
            eVar2 = eVar;
        }
        try {
            if (bVar instanceof com.mbridge.msdk.foundation.same.net.c) {
                String key = ((com.mbridge.msdk.foundation.same.net.c) bVar).getKey();
                String strIsRKE = ((com.mbridge.msdk.foundation.same.net.c) bVar).isRKE();
                if (!TextUtils.isEmpty(key)) {
                    eVar2.a("rk", key);
                    eVar2.a("erk", strIsRKE);
                }
            }
            addExtraParams(str, eVar2);
            f.k(eVar2);
            String str7 = eVar2.a().get("sign");
            if (TextUtils.isEmpty(str7)) {
                str7 = "";
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            eVar2.a(CampaignEx.JSON_KEY_ST_TS, jCurrentTimeMillis + "");
            if (com.mbridge.msdk.util.b.a()) {
                eVar2.a("st", SameMD5.getMD5(str7 + jCurrentTimeMillis));
            } else {
                eVar2.a("st", SameMD5.getMD5(jCurrentTimeMillis + str7));
            }
            com.mbridge.msdk.foundation.same.net.e eVarA = com.mbridge.msdk.foundation.same.net.utils.c.b().a(eVar2);
            if (eVarA != null && bVar != null) {
                bVar.onSuccess(eVarA);
                return;
            }
        } catch (Exception e11) {
            e = e11;
            q0.a(TAG, e.getMessage());
        }
        eVar3 = eVar2;
        if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f30626i) && com.mbridge.msdk.foundation.same.net.utils.d.h().f30636s) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("uri", com.mbridge.msdk.foundation.same.net.utils.d.h().f30630m + Uri.parse(str).getPath());
            jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, eVar3.b());
            com.mbridge.msdk.foundation.same.net.f fVarB2 = com.mbridge.msdk.foundation.same.net.f.b();
            String str8 = com.mbridge.msdk.foundation.same.net.utils.d.h().f30630m;
            int i12 = com.mbridge.msdk.foundation.same.net.utils.d.h().f30634q;
            String string2 = jSONObject2.toString();
            if (eVar3 == null && !TextUtils.isEmpty(eVar3.c().optString("rk")) && eVar3.c().optString("erk").equals("1")) {
                z12 = true;
            } else {
                z12 = false;
            }
            fVarB2.a(str8, i12, string2, true, bVar, z12);
            return;
        }
        if (eVar3 != null) {
            str3 = str;
        } else if (TextUtils.isEmpty(eVar3.c().optString("rk")) || !eVar3.c().optString("erk").equals("1")) {
            str3 = str + "?" + eVar3.toString();
        } else {
            try {
                str3 = str + "?p=" + URLEncoder.encode(v0.b(eVar3.toString(), "ebmclXzZOhtU2sRlZxGL8A"), C.UTF8_NAME);
            } catch (Exception unused) {
                str3 = str;
            }
        }
        gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (str3.length() < gVarD.q0() && str3.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f30626i)) {
            post(i10, str, eVar3, bVar, z11, false, str2, j10);
            return;
        }
        if (str3.length() < gVarD.M() && z10) {
            post(i10, str, eVar3, bVar, z11, false, str2, j10);
            return;
        }
        hVarCreateRequest = createRequest(i10, 0, str, bVar, str2, j10);
        if (hVarCreateRequest != null) {
            if (eVar3 != null && eVar3.a() != null) {
                str4 = eVar3.a().get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
                if (TextUtils.isEmpty(str4)) {
                    str4 = "";
                }
                hVarCreateRequest.a("local_id", str4);
                String str9 = eVar3.a().get("ad_type");
                hVarCreateRequest.a("ad_type", TextUtils.isEmpty(str9) ? "" : str9);
                hVarCreateRequest.a(eVar3.a());
            }
            hVarCreateRequest.d(canTrack());
            l.a().b().a(hVarCreateRequest);
        }
    }

    public void getLoadOrSetting(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z10, String str2, long j10) {
        get(i10, str, eVar, bVar, z10, false, str2, j10);
    }

    public void postV5(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z10, String str2, long j10) {
        String str3 = eVar.a().get("sign");
        if (str3 == null) {
            str3 = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        eVar.a(CampaignEx.JSON_KEY_ST_TS, jCurrentTimeMillis + "");
        eVar.a("st", SameMD5.getMD5(jCurrentTimeMillis + str3));
        post(i10, str, eVar, bVar, z10, false, str2, j10);
    }

    public void get(int i10, String str, Map<String, String> map, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(MBridgeConstans.APP_ID, com.mbridge.msdk.foundation.controller.c.n().b());
        map.put("sdk_version", MBConfiguration.SDK_VERSION);
        map.put("platform", "1");
        String strAsUrlParams = asUrlParams(map);
        if (!TextUtils.isEmpty(strAsUrlParams)) {
            str = str + "?" + strAsUrlParams;
        }
        String str3 = str;
        if (MBridgeConstans.DEBUG) {
            q0.a("AppletsModel", "get wx scheme url = " + str3);
        }
        com.mbridge.msdk.tracker.network.h<?> hVarCreateRequest = createRequest(i10, 0, str3, bVar, str2, j10);
        if (hVarCreateRequest != null) {
            String str4 = map.get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
            if (TextUtils.isEmpty(str4)) {
                str4 = "";
            }
            hVarCreateRequest.a("local_id", str4);
            String str5 = map.get("ad_type");
            hVarCreateRequest.a("ad_type", TextUtils.isEmpty(str5) ? "" : str5);
            hVarCreateRequest.a(map);
            hVarCreateRequest.d(canTrack());
            l.a().b().a(hVarCreateRequest);
        }
    }

    public void post(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        post(i10, str, eVar, bVar, false, false, str2, j10);
    }
}
