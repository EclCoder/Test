package com.bytedance.sdk.openadsdk.gjv.sk.hnj;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.hnj.hnj.hnj.qor.c;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.nyv;
import com.bytedance.sdk.openadsdk.gjv.dse;
import com.bytedance.sdk.openadsdk.gjv.qor;
import com.bytedance.sdk.openadsdk.gjv.sk.hn.aq;
import com.bytedance.sdk.openadsdk.gjv.sk.hn.dkl;
import com.bytedance.sdk.openadsdk.gjv.sk.hn.fc;
import com.bytedance.sdk.openadsdk.gjv.sk.hn.hn;
import com.bytedance.sdk.openadsdk.gjv.sk.hn.mjg;
import com.bytedance.sdk.openadsdk.gjv.sk.hn.orl;
import com.bytedance.sdk.openadsdk.gjv.sk.hn.sk;
import com.bytedance.sdk.openadsdk.jip.gjv;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.tgn;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import y6.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private static final Map<a, fc> hnj = Collections.synchronizedMap(new WeakHashMap());

    public static void gjv(a aVar, fc.hnj hnjVar) {
        fc fcVar;
        if (aVar == null || hnjVar == null || (fcVar = hnj.get(aVar)) == null) {
            return;
        }
        c cVarGjv = fcVar.gjv();
        as asVarSk = fcVar.sk();
        if (cVarGjv == null || asVarSk == null) {
            return;
        }
        long jHn = hnjVar.hn();
        long jGjv = hnjVar.gjv();
        hn hnVar = new hn();
        hnVar.hnj(hnjVar.qor());
        hnVar.hn(jGjv);
        hnVar.hnj(hnjVar.sk());
        hnVar.hn(hnjVar.dkl());
        com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnjVarHnj = hnj(asVarSk, fcVar.hn(), fcVar.qor(), cVarGjv, hnjVar);
        hnjVarHnj.hnj(hnVar);
        hnjVarHnj.hnj(hnjVar.dnm());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jHn);
            jSONObject.put("percent", hnjVar.dse());
            hnj(hnjVarHnj, "endcard_skip", jSONObject);
        } catch (JSONException e10) {
            apu.hnj("TTAD.VideoEventManager", "", e10);
        }
        hnj.remove(aVar);
    }

    public static void qor(a aVar, fc.hnj hnjVar) {
        fc fcVar;
        if (aVar == null || hnjVar == null || (fcVar = hnj.get(aVar)) == null) {
            return;
        }
        c cVarGjv = fcVar.gjv();
        as asVarSk = fcVar.sk();
        if (cVarGjv == null || asVarSk == null) {
            return;
        }
        long jHn = hnjVar.hn();
        long jGjv = hnjVar.gjv();
        mjg mjgVar = new mjg(hnjVar.orl());
        mjgVar.hnj(hnjVar.qor());
        mjgVar.hn(jGjv);
        com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnjVarHnj = hnj(asVarSk, fcVar.hn(), fcVar.qor(), cVarGjv, hnjVar);
        hnjVarHnj.hnj(mjgVar);
        hnjVarHnj.hnj(hnjVar.dnm());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jHn);
            jSONObject.put("percent", hnjVar.dse());
            hnj(hnjVarHnj, "play_error", jSONObject);
        } catch (JSONException e10) {
            apu.hnj("TTAD.VideoEventManager", "", e10);
        }
    }

    public static void sk(a aVar, fc.hnj hnjVar) {
        fc fcVar;
        if (aVar == null || hnjVar == null || hnjVar.ta() <= 0 || (fcVar = hnj.get(aVar)) == null) {
            return;
        }
        c cVarGjv = fcVar.gjv();
        as asVarSk = fcVar.sk();
        if (cVarGjv == null || asVarSk == null) {
            return;
        }
        long jGjv = hnjVar.gjv();
        orl orlVar = new orl();
        orlVar.hnj(hnjVar.qor());
        orlVar.hn(jGjv);
        orlVar.hnj(hnjVar.ta());
        com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnjVarHnj = hnj(asVarSk, fcVar.hn(), fcVar.qor(), cVarGjv, hnjVar);
        hnjVarHnj.hnj(orlVar);
        hnjVarHnj.hnj(hnjVar.dnm());
        hnj(hnjVarHnj, "play_buffer");
    }

    public static void hn(com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnjVar) {
        gjv.hnj("load_video_cancel", hnjVar);
    }

    public static com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnj(as asVar, String str, int i10, c cVar) {
        return hnj(asVar, str, i10, cVar, null);
    }

    public static void hn(a aVar, fc.hnj hnjVar) {
        fc fcVar;
        if (aVar == null || hnjVar == null || (fcVar = hnj.get(aVar)) == null) {
            return;
        }
        c cVarGjv = fcVar.gjv();
        as asVarSk = fcVar.sk();
        if (cVarGjv == null || asVarSk == null) {
            return;
        }
        long jHn = hnjVar.hn();
        long jGjv = hnjVar.gjv();
        if (jGjv <= 0 || jHn <= 0) {
            return;
        }
        sk skVar = new sk();
        skVar.hnj(hnjVar.qor());
        skVar.hn(jGjv);
        com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnjVarHnj = hnj(asVarSk, fcVar.hn(), fcVar.qor(), cVarGjv, hnjVar);
        hnjVarHnj.hnj(skVar);
        hnjVarHnj.hnj(hnjVar.dnm());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jHn);
            jSONObject.put("percent", hnjVar.dse());
            hnj(hnjVarHnj, "feed_continue", jSONObject);
        } catch (JSONException e10) {
            apu.hnj("TTAD.VideoEventManager", "", e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c A[Catch: JSONException -> 0x0012, TryCatch #0 {JSONException -> 0x0012, blocks: (B:4:0x0008, B:8:0x0016, B:10:0x001c, B:11:0x004d, B:13:0x005a, B:15:0x006a, B:16:0x0070, B:18:0x0076, B:19:0x007b), top: B:24:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x005a A[Catch: JSONException -> 0x0012, TryCatch #0 {JSONException -> 0x0012, blocks: (B:4:0x0008, B:8:0x0016, B:10:0x001c, B:11:0x004d, B:13:0x005a, B:15:0x006a, B:16:0x0070, B:18:0x0076, B:19:0x007b), top: B:24:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x006a A[Catch: JSONException -> 0x0012, TryCatch #0 {JSONException -> 0x0012, blocks: (B:4:0x0008, B:8:0x0016, B:10:0x001c, B:11:0x004d, B:13:0x005a, B:15:0x006a, B:16:0x0070, B:18:0x0076, B:19:0x007b), top: B:24:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0076 A[Catch: JSONException -> 0x0012, TryCatch #0 {JSONException -> 0x0012, blocks: (B:4:0x0008, B:8:0x0016, B:10:0x001c, B:11:0x004d, B:13:0x005a, B:15:0x006a, B:16:0x0070, B:18:0x0076, B:19:0x007b), top: B:24:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016 A[Catch: JSONException -> 0x0012, TryCatch #0 {JSONException -> 0x0012, blocks: (B:4:0x0008, B:8:0x0016, B:10:0x001c, B:11:0x004d, B:13:0x005a, B:15:0x006a, B:16:0x0070, B:18:0x0076, B:19:0x007b), top: B:24:0x0008 }] */
    public static com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnj(as asVar, String str, int i10, c cVar, fc.hnj hnjVar) {
        com.bykv.vk.openvk.hnj.hnj.hnj.qor.a aVarPwt;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = null;
        if (i10 > 0) {
            try {
                jSONObject.put("play_type", String.valueOf(i10));
                if (asVar != null) {
                    aVarPwt = asVar.pwt();
                    if (aVarPwt != null) {
                        jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, aVarPwt.A());
                        jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Long.valueOf(aVarPwt.G()));
                        jSONObject.put(CampaignEx.JSON_KEY_VIDEO_URL, aVarPwt.h());
                        jSONObject.put("player_type", cVar.oj());
                        jSONObject.put("video_encode_type", cVar.mjg() ? 1 : 0);
                    }
                    jSONObject.put("play_time", cVar.f11664sk);
                    jSONObject2 = cVar.hnj() ? new JSONObject(cVar.qor().toString()) : null;
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject2.put("session_id", str);
                    }
                    jSONObject.put("dp_creative_type", asVar.vz());
                }
            } catch (JSONException e10) {
                apu.hnj("TTAD.VideoEventManager", "", e10);
            }
        } else if (asVar != null) {
            aVarPwt = asVar.pwt();
            if (aVarPwt != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, aVarPwt.A());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Long.valueOf(aVarPwt.G()));
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_URL, aVarPwt.h());
                jSONObject.put("player_type", cVar.oj());
                jSONObject.put("video_encode_type", cVar.mjg() ? 1 : 0);
            }
            jSONObject.put("play_time", cVar.f11664sk);
            if (cVar.hnj()) {
            }
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("session_id", str);
            }
            jSONObject.put("dp_creative_type", asVar.vz());
        }
        return new com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj(asVar, orp.hnj(asVar), jSONObject, jSONObject2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long qor(c cVar) {
        if (cVar == null) {
            return 0L;
        }
        com.bykv.vk.openvk.hnj.hnj.hnj.qor.a aVarM0do = cVar.mjg() ? cVar.m0do() : cVar.as();
        if (aVarM0do != null) {
            return Double.valueOf(aVarM0do.e() * 1000.0d).longValue();
        }
        return 0L;
    }

    public static void hn(a aVar, fc.hnj hnjVar, dse dseVar) {
        if (aVar == null || hnjVar == null) {
            return;
        }
        sk(aVar, hnjVar);
        fc fcVar = hnj.get(aVar);
        if (fcVar == null) {
            return;
        }
        c cVarGjv = fcVar.gjv();
        as asVarSk = fcVar.sk();
        if (cVarGjv == null || asVarSk == null) {
            return;
        }
        long jHn = hnjVar.hn();
        long jGjv = hnjVar.gjv();
        dkl dklVar = new dkl(cVarGjv);
        dklVar.hn(hnjVar.qor());
        dklVar.hnj(jGjv);
        dklVar.hnj(hnjVar.ojm());
        com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnjVarHnj = hnj(asVarSk, fcVar.hn(), fcVar.qor(), cVarGjv, hnjVar);
        hnjVarHnj.hnj(dklVar);
        JSONObject jSONObjectGjv = hnjVarHnj.gjv();
        hnj(hnjVar, asVarSk, jSONObjectGjv);
        hnjVarHnj.hnj(hnjVar.dnm());
        try {
            jSONObjectGjv.put("surface_texture_updated", hnjVar.fc() ? 1 : 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jHn);
            jSONObject.put("percent", hnjVar.dse());
            hnj(hnjVarHnj, "feed_over", jSONObject, dseVar);
        } catch (JSONException e10) {
            apu.hnj("TTAD.VideoEventManager", "", e10);
        }
        hnj.remove(aVar);
    }

    public static void hnj(com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnjVar) {
        gjv.hnj("load_video_error", hnjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String gjv(c cVar) {
        return new File(cVar.sk(), cVar.uua()).getAbsolutePath();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    public static void hnj(as asVar, a aVar, c cVar) {
        int i10;
        int i11;
        if (asVar == null || aVar == null || cVar == null) {
            return;
        }
        String strHnj = tgn.hnj();
        try {
            if (!cVar.tu()) {
                if (CacheDirFactory.getICacheDir(asVar.gkx()).hnj(cVar)) {
                    i11 = 1;
                } else {
                    i10 = 2;
                }
                hnj.put(aVar, new fc(SystemClock.elapsedRealtime(), strHnj, i11, cVar, asVar));
                com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnjVarHnj = hnj(asVar, strHnj, i11, cVar, null);
                hnjVarHnj.qor().put("is_mute", cVar.dnm() ? 1 : 0);
                hnjVarHnj.hnj(cVar.oj() == -1);
                hnj(hnjVarHnj, "play_start");
            }
            i10 = 3;
            hnjVarHnj.qor().put("is_mute", cVar.dnm() ? 1 : 0);
        } catch (JSONException e10) {
            apu.hnj("TTAD.VideoEventManager", "", e10);
        }
        i11 = i10;
        hnj.put(aVar, new fc(SystemClock.elapsedRealtime(), strHnj, i11, cVar, asVar));
        com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnjVarHnj2 = hnj(asVar, strHnj, i11, cVar, null);
        hnjVarHnj2.hnj(cVar.oj() == -1);
        hnj(hnjVarHnj2, "play_start");
    }

    public static void hnj(Context context, a aVar, fc.hnj hnjVar, dse dseVar) {
        fc fcVar;
        if (context == null || aVar == null || hnjVar == null || (fcVar = hnj.get(aVar)) == null) {
            return;
        }
        c cVarGjv = fcVar.gjv();
        as asVarSk = fcVar.sk();
        if (cVarGjv == null || asVarSk == null) {
            return;
        }
        if (!hnjVar.dnm()) {
            hnj(asVarSk, cVarGjv, hnjVar);
        }
        aq aqVar = new aq(cVarGjv);
        aqVar.hnj(hnjVar.bug() ? 1 : 0);
        aqVar.hn(CacheDirFactory.getICacheDir(asVarSk.gkx()).a(cVarGjv));
        aqVar.hnj(SystemClock.elapsedRealtime() - fcVar.hnj());
        com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnjVarHnj = hnj(asVarSk, fcVar.hn(), fcVar.qor(), cVarGjv, hnjVar);
        hnjVarHnj.hnj(aqVar);
        JSONObject jSONObjectGjv = hnjVarHnj.gjv();
        try {
            jSONObjectGjv.put("is_received_video_not_playing_info", hnjVar.mjg() ? 1 : 0);
            jSONObjectGjv.put("new_media_source", o6.a.a());
        } catch (JSONException e10) {
            apu.hnj("TTAD.VideoEventManager", "", e10);
        }
        hnjVarHnj.hnj(hnjVar.dnm());
        hnj(hnjVarHnj, "feed_play", dseVar);
    }

    public static void hnj(a aVar, fc.hnj hnjVar) {
        fc fcVar;
        if (aVar == null || hnjVar == null || (fcVar = hnj.get(aVar)) == null) {
            return;
        }
        c cVarGjv = fcVar.gjv();
        as asVarSk = fcVar.sk();
        if (cVarGjv == null || asVarSk == null) {
            return;
        }
        long jHn = hnjVar.hn();
        long jGjv = hnjVar.gjv();
        if (jGjv <= 0 || jHn <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.gjv.sk.hn.dse dseVar = new com.bytedance.sdk.openadsdk.gjv.sk.hn.dse();
        dseVar.hnj(hnjVar.qor());
        dseVar.hn(jGjv);
        com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnjVarHnj = hnj(asVarSk, fcVar.hn(), fcVar.qor(), cVarGjv, hnjVar);
        hnjVarHnj.hnj(dseVar);
        hnj(hnjVar, asVarSk, hnjVarHnj.gjv());
        hnjVarHnj.hnj(hnjVar.dnm());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jHn);
            jSONObject.put("percent", hnjVar.dse());
            hnj(hnjVarHnj, "feed_pause", jSONObject);
        } catch (JSONException e10) {
            apu.hnj("TTAD.VideoEventManager", "", e10);
        }
    }

    private static void hnj(fc.hnj hnjVar, as asVar, JSONObject jSONObject) {
        if (asVar != null) {
            try {
                nyv nyvVarLq = asVar.lq();
                if (nyvVarLq != null) {
                    jSONObject.put("speed_type", nyvVarLq.hn());
                    jSONObject.put("speed", nyvVarLq.hnj());
                    jSONObject.put("speed_duration", hnjVar.hnj());
                }
            } catch (Throwable th2) {
                apu.hnj("TTAD.VideoEventManager", "", th2);
            }
        }
    }

    public static void hnj(a aVar, fc.hnj hnjVar, dse dseVar) {
        if (aVar == null || hnjVar == null) {
            return;
        }
        sk(aVar, hnjVar);
        fc fcVar = hnj.get(aVar);
        if (fcVar == null) {
            return;
        }
        c cVarGjv = fcVar.gjv();
        as asVarSk = fcVar.sk();
        if (cVarGjv == null || asVarSk == null) {
            return;
        }
        long jHn = hnjVar.hn();
        long jGjv = hnjVar.gjv();
        com.bytedance.sdk.openadsdk.gjv.sk.hn.gjv gjvVar = new com.bytedance.sdk.openadsdk.gjv.sk.hn.gjv();
        gjvVar.hn(hnjVar.qor());
        gjvVar.hnj(jGjv);
        gjvVar.hnj(hnjVar.aq());
        gjvVar.hn(hnjVar.ojm());
        com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnjVarHnj = hnj(asVarSk, fcVar.hn(), fcVar.qor(), cVarGjv, hnjVar);
        hnjVarHnj.hnj(gjvVar);
        hnj(hnjVar, asVarSk, hnjVarHnj.gjv());
        hnjVarHnj.hnj(hnjVar.dnm());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jHn);
            jSONObject.put("percent", hnjVar.dse());
            hnj(hnjVarHnj, "feed_break", jSONObject, dseVar);
        } catch (JSONException e10) {
            apu.hnj("TTAD.VideoEventManager", "", e10);
        }
    }

    public static void hnj(a aVar, boolean z10, String str) {
        fc fcVar;
        if (aVar == null || (fcVar = hnj.get(aVar)) == null) {
            return;
        }
        c cVarGjv = fcVar.gjv();
        as asVarSk = fcVar.sk();
        if (cVarGjv == null || asVarSk == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnjVarHnj = hnj(asVarSk, fcVar.hn(), fcVar.qor(), cVarGjv, null);
        try {
            hnjVarHnj.qor().put("is_mute", z10 ? 1 : 0);
            hnjVarHnj.gjv().put("from", str);
        } catch (JSONException e10) {
            apu.hnj("TTAD.VideoEventManager", "", e10);
        }
        hnj(hnjVarHnj, "mute_state_change");
    }

    private static void hnj(com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnjVar, String str) {
        hnj(hnjVar, str, (JSONObject) null, (dse) null);
    }

    private static void hnj(com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnjVar, String str, JSONObject jSONObject) {
        hnj(hnjVar, str, jSONObject, (dse) null);
    }

    private static void hnj(com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnjVar, String str, dse dseVar) {
        hnj(hnjVar, str, (JSONObject) null, dseVar);
    }

    private static void hnj(final com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnjVar, String str, final JSONObject jSONObject, final dse dseVar) {
        if (hnjVar == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (hnjVar.dkl() && !TextUtils.isEmpty(hnjVar.hn())) {
            String strHn = hnjVar.hn();
            strHn.getClass();
            if (strHn.equals("stream") || strHn.equals("embeded_ad")) {
                str = "customer_".concat(String.valueOf(str));
            }
        }
        final String str2 = str;
        qor.hnj(System.currentTimeMillis(), hnjVar.hnj(), hnjVar.hn(), str2, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.1
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hn() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hnj() {
                hnjVar.dse();
                return hnjVar.gjv();
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                dse dseVar2;
                try {
                    JSONObject jSONObjectQor = hnjVar.qor();
                    if (hnjVar.sk() != null) {
                        hnjVar.sk().hnj(jSONObjectQor);
                    }
                    if (("feed_play".equals(str2) || "feed_over".equals(str2) || "feed_break".equals(str2)) && (dseVar2 = dseVar) != null) {
                        dseVar2.hnj(jSONObjectQor);
                    }
                    return jSONObjectQor;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    private static void hnj(final as asVar, final c cVar, final fc.hnj hnjVar) {
        gjv.hnj();
        gjv.hnj("pangle_video_play_state", false, new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.2
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("service_duration", hnj.qor(cVar));
                jSONObject.put("player_duration", hnjVar.gjv());
                jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                jSONObject.put("url", cVar.jip());
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, hnj.gjv(cVar));
                jSONObject.put("player_type", cVar.oj());
                com.bytedance.sdk.openadsdk.jip.hnj.gjv gjvVarHnj = com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("pangle_video_play_state");
                as asVar2 = asVar;
                return gjvVarHnj.hnj(asVar2 != null ? asVar2.iz() : 0).hn(jSONObject.toString());
            }
        });
    }
}
