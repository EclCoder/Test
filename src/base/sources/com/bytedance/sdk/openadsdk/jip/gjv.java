package com.bytedance.sdk.openadsdk.jip;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.orl;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.coremedia.iso.boxes.UserBox;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class gjv {
    private static volatile gjv hnj;

    private gjv() {
    }

    public static void gjv() {
        hnj("disk_log", false, new hn() { // from class: com.bytedance.sdk.openadsdk.jip.gjv.7
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                File file = new File(CacheDirFactory.getRootDir());
                long j10 = 0;
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        long jHnj = gjv.hnj(file2);
                        j10 += jHnj;
                        jSONObject.put(file2.getName(), jHnj);
                    }
                }
                if (j10 < 524288000) {
                    return null;
                }
                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("disk_log").hn(jSONObject.toString());
            }
        });
    }

    public static void hn(final as asVar) {
        if (orp.hnj(asVar) == null || TextUtils.isEmpty(asVar.rx())) {
            return;
        }
        hnj("download_gecko_start", false, new hn() { // from class: com.bytedance.sdk.openadsdk.jip.gjv.14
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", asVar.xe());
                jSONObject.put("channel_name", asVar.rx());
                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("download_gecko_start").hnj(asVar.xf()).hn(jSONObject.toString());
            }
        });
    }

    public static gjv hnj() {
        if (hnj == null) {
            synchronized (gjv.class) {
                try {
                    if (hnj == null) {
                        hnj = new gjv();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    private boolean qor(com.bytedance.sdk.openadsdk.jip.hnj.gjv gjvVar) {
        return gjvVar == null;
    }

    public void qor() {
        hnj("blind_mode_status", true, new hn() { // from class: com.bytedance.sdk.openadsdk.jip.gjv.5
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() {
                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("blind_mode_status");
            }
        });
    }

    public void hn(final com.bytedance.sdk.openadsdk.jip.hnj.gjv gjvVar) {
        if (qor(gjvVar)) {
            return;
        }
        gjvVar.hnj("show_backup_endcard");
        oj.sk().hnj(new hn() { // from class: com.bytedance.sdk.openadsdk.jip.gjv.17
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() {
                return gjvVar;
            }
        });
    }

    public static void hn() {
        ua.hn(new com.bytedance.sdk.component.aq.hn.qor("showFailLog") { // from class: com.bytedance.sdk.openadsdk.jip.gjv.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    gjv.hnj().hnj("show_fail_log", new JSONObject());
                } catch (Throwable th2) {
                    apu.qor("StatsLogManager", th2.getMessage());
                }
            }
        });
    }

    public static void hnj(final as asVar) {
        if (asVar == null) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        hnj("bidding_receive", false, new hn() { // from class: com.bytedance.sdk.openadsdk.jip.gjv.1
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reveice_ts", jCurrentTimeMillis);
                if (asVar.xf() == 3) {
                    jSONObject.put("is_icon_only", asVar.nyv() ? 1 : 0);
                }
                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj(SVWsZyNSAChGIA.rduBgEDFPICs).hn(jSONObject.toString());
            }
        });
    }

    public static void hnj(as asVar, final long j10) {
        if (asVar == null) {
            return;
        }
        hnj("bidding_load", false, new hn() { // from class: com.bytedance.sdk.openadsdk.jip.gjv.8
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j10);
                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("bidding_load").hn(jSONObject.toString());
            }
        });
    }

    public static void hnj(final String str, final com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnjVar) {
        if (hnjVar == null) {
            return;
        }
        hnj(str, false, new hn() { // from class: com.bytedance.sdk.openadsdk.jip.gjv.13
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                JSONObject jSONObjectQor = hnjVar.qor();
                if (jSONObjectQor == null) {
                    jSONObjectQor = new JSONObject();
                }
                as asVarHnj = hnjVar.hnj();
                jSONObjectQor.put("req_id", asVarHnj.jp());
                com.bytedance.sdk.openadsdk.gjv.sk.hn.qor qorVarSk = hnjVar.sk();
                if (qorVarSk != null) {
                    qorVarSk.hnj(jSONObjectQor);
                }
                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj(str).hnj(asVarHnj.xf()).hn(jSONObjectQor.toString());
            }
        });
    }

    public static void hnj(final as asVar, final JSONObject jSONObject) {
        if (orp.hnj(asVar) == null || TextUtils.isEmpty(asVar.rx())) {
            return;
        }
        hnj("download_gecko_end", false, new hn() { // from class: com.bytedance.sdk.openadsdk.jip.gjv.15
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", asVar.xe());
                jSONObject2.put("channel_name", asVar.rx());
                jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, jSONObject);
                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("download_gecko_end").hnj(asVar.xf()).hn(jSONObject2.toString());
            }
        });
    }

    public void hnj(final com.bytedance.sdk.openadsdk.jip.hnj.gjv gjvVar) {
        if (qor(gjvVar)) {
            return;
        }
        gjvVar.hnj("express_ad_render");
        oj.sk().hnj(new hn() { // from class: com.bytedance.sdk.openadsdk.jip.gjv.16
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() {
                return gjvVar;
            }
        });
    }

    public void hnj(final long j10, final long j11) {
        final long j12 = j11 - j10;
        hnj("general_label", false, new hn() { // from class: com.bytedance.sdk.openadsdk.jip.gjv.2
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() {
                int i10 = !fc.f13727hn.get() ? 1 : 0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j10);
                    jSONObject.put("endtime", j11);
                    jSONObject.put("start_type", i10);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("general_label").aq(String.valueOf(j12)).hn(jSONObject.toString());
            }
        });
    }

    public void hnj(final String str, final JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            return;
        }
        hnj(str, false, new hn() { // from class: com.bytedance.sdk.openadsdk.jip.gjv.4
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() {
                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj(str).hn(jSONObject.toString());
            }
        });
    }

    public void hnj(final JSONObject jSONObject) {
        if (jSONObject == null) {
            apu.hnj("adRevenuePangle", "You must pass adRevenue json to pangle");
            return;
        }
        Object objOpt = jSONObject.opt("device_ad_mediation_platform");
        if (!(objOpt instanceof String) || TextUtils.isEmpty((String) objOpt)) {
            apu.hnj("adRevenuePangle", "You must pass device_ad_mediation_platform to pangle");
        } else {
            apu.hnj("adRevenuePangle", "pangle", "You successfully passed the parameters to pangle. The parameters are:", jSONObject);
            hnj("ad_revenue", true, new hn() { // from class: com.bytedance.sdk.openadsdk.jip.gjv.6
                @Override // com.bytedance.sdk.openadsdk.jip.hn
                public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() {
                    try {
                        jSONObject.put(NotificationCompat.CATEGORY_EVENT, 272);
                        jSONObject.put(UserBox.TYPE, orl.qor(oj.hnj()));
                        String strHnj = "";
                        try {
                            if (orl.hnj(oj.hnj()) != null) {
                                strHnj = orl.hnj(oj.hnj());
                            }
                        } catch (Throwable th2) {
                            th2.getMessage();
                        }
                        jSONObject.put("device_id", strHnj);
                        jSONObject.put("platform", "android");
                        jSONObject.put("partner", "PangleSDK");
                    } catch (Throwable th3) {
                        th3.getMessage();
                    }
                    return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("ad_revenue").hn(jSONObject.toString());
                }
            });
        }
    }

    public static long hnj(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long jHnj = 0;
        for (File file2 : file.listFiles()) {
            jHnj += hnj(file2);
        }
        return jHnj;
    }

    public static void hnj(String str, boolean z10, hn hnVar) {
        hnj(str, z10, -1, hnVar);
    }

    public static void hnj(String str, boolean z10, int i10, hn hnVar) {
        if (!TextUtils.isEmpty(str) && qor.hnj(str, i10)) {
            oj.sk().hnj(hnVar, z10);
        }
    }

    public static void hnj(long j10, long j11, final String str, final int i10) {
        if (j10 == 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        final long j12 = jElapsedRealtime - j10;
        final long j13 = jElapsedRealtime - j11;
        final long j14 = j11 - j10;
        hnj("ad_show_cost_time", false, new hn() { // from class: com.bytedance.sdk.openadsdk.jip.gjv.9
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j12);
                jSONObject.put("renderDuration", j13);
                jSONObject.put("showToRenderDuration", j14);
                jSONObject.put("tag", str);
                jSONObject.put("renderType", i10);
                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("ad_show_cost_time").hn(jSONObject.toString());
            }
        });
    }

    public static void hnj(int i10, String str) {
        hnj(i10, str, 0, (String) null);
    }

    public static void hnj(final int i10, final String str, final int i11, final String str2) {
        hnj(obFGmWgqyy.pFHLrnnEJQmtGSf, false, new hn<com.bytedance.sdk.openadsdk.jip.hnj.qor>() { // from class: com.bytedance.sdk.openadsdk.jip.gjv.10
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                String str3;
                JSONObject jSONObject = new JSONObject();
                int i12 = i10;
                if (i12 == 1) {
                    str3 = "success";
                } else if (i12 == -1) {
                    jSONObject.put("error_code", i11);
                    jSONObject.put("error_msg", str2);
                    str3 = "fail";
                } else {
                    str3 = "start";
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("url", str);
                }
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, str3);
                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("ipv6_req").hn(jSONObject.toString());
            }
        });
    }

    public static void hnj(final String str, final boolean z10) {
        hnj("img_error_param", false, new hn() { // from class: com.bytedance.sdk.openadsdk.jip.gjv.11
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z10 ? 1 : 0);
                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("img_error_param").hn(jSONObject.toString());
            }
        });
    }

    public static void hnj(final boolean z10) {
        hnj("web_container_reuse", false, new hn() { // from class: com.bytedance.sdk.openadsdk.jip.gjv.12
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_hit", z10 ? 1 : 0);
                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("web_container_reuse").hn(jSONObject.toString());
            }
        });
    }
}
