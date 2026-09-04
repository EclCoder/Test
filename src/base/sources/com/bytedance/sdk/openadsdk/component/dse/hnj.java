package com.bytedance.sdk.openadsdk.component.dse;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.dse;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.as.sk;
import com.bytedance.sdk.openadsdk.component.dkl;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ta;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static Boolean f13353hn;
    private static AtomicInteger hnj = new AtomicInteger(0);
    private static Integer qor = null;

    public static int aq() {
        if (sk()) {
            return sk.hnj("aoa_cache_count", 3);
        }
        return 1;
    }

    public static int bug() {
        if (qor == null) {
            int iHnj = sk.hnj("aoa_preload_size", 10);
            qor = Integer.valueOf(iHnj);
            if (iHnj < 0) {
                qor = 10;
            }
        }
        return qor.intValue();
    }

    public static boolean dkl() {
        return oj.gjv().dnm() == 1;
    }

    public static boolean dnm() {
        if (f13353hn == null) {
            boolean z10 = false;
            boolean z11 = sk.hnj("open_ad_ugen_backup_enable", 0) == 1;
            boolean z12 = sk.hnj("express_backup_type", 0) == 1;
            if (z11 && z12) {
                z10 = true;
            }
            f13353hn = Boolean.valueOf(z10);
        }
        return f13353hn.booleanValue();
    }

    public static int dse() {
        return hnj.get() == 0 ? sk.hnj("aoa_cold_load_timeout", 3500) : sk.hnj("aoa_hot_load_timeout", 3500);
    }

    public static int gjv() {
        return fc.f13727hn.get() ? 1 : 2;
    }

    public static File hn(String str) {
        return new File(dkl.hnj(oj.hnj()).hn(), str);
    }

    public static File hnj(String str) {
        return new File(CacheDirFactory.getICacheDir(0).hn() + File.separator + str);
    }

    public static int ojm() {
        int iHnj = sk.hnj("aoa_cache_refresh_time", 72000000);
        if (iHnj < 60000) {
            return 72000000;
        }
        return iHnj;
    }

    public static int qor() {
        return hnj.incrementAndGet();
    }

    public static boolean sk() {
        return sk.hnj("aoa_cache_opt_enable", 0) == 1;
    }

    public static int ta() {
        int iHnj = sk.hnj("aoa_cache_poll_interval", 3600000);
        if (iHnj < 60000) {
            return 3600000;
        }
        return iHnj;
    }

    public static void hnj(File file) {
        if (file == null) {
            return;
        }
        try {
            dse.hn(file);
        } catch (Throwable unused) {
        }
    }

    public static void hnj(Context context) {
        try {
            dkl.hnj(context).hnj();
            if (sk()) {
                com.bytedance.sdk.openadsdk.common.oj.hnj().hn();
            }
        } catch (Throwable unused) {
        }
    }

    public static long hn() {
        return SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime();
    }

    public static String hnj() {
        return dkl.hnj(oj.hnj()).hn().getAbsolutePath();
    }

    public static void hnj(JSONObject jSONObject, int i10, boolean z10) {
        try {
            String strAq = ta.hn().aq();
            int iOjm = ta.hn().ojm();
            JSONObject jSONObject2 = jSONObject.getJSONObject("creative");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("app_name", strAq);
            if (!z10) {
                jSONObject3.put("app_icon_id", "@".concat(String.valueOf(iOjm)));
            } else if (ta.hn().ojm() != 0) {
                jSONObject3.put("app_icon_id", "local://pag_open_icon_id");
            }
            jSONObject2.put("open_app_info", jSONObject3);
            if (jSONObject2.optJSONObject(MimeTypes.BASE_TYPE_VIDEO) == null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("video_duration", oj.gjv().as(String.valueOf(i10)));
                jSONObject2.put(MimeTypes.BASE_TYPE_VIDEO, jSONObject4);
            }
        } catch (Exception e10) {
            apu.qor("TTAppOpenUtils", e10.getMessage());
        }
    }

    public static int hnj(as asVar, int i10) {
        return i10 - asVar.zgl();
    }

    public static void hnj(int i10) {
        Map<String, AdSlot> mapQor;
        if (!sk() || (mapQor = com.bytedance.sdk.openadsdk.common.oj.hnj().qor()) == null || mapQor.size() == 0) {
            return;
        }
        mapQor.size();
        for (AdSlot adSlot : mapQor.values()) {
            if (adSlot != null && TextUtils.isEmpty(adSlot.getBidAdm())) {
                try {
                    adSlot.setCacheScene(i10);
                    dkl.hnj(oj.hnj()).hnj(adSlot);
                } catch (Throwable unused) {
                    adSlot.toString();
                }
            }
        }
    }

    public static boolean hnj(AdSlot adSlot) {
        Map<String, Object> requestExtraMap;
        return (adSlot == null || (requestExtraMap = adSlot.getRequestExtraMap()) == null || requestExtraMap.get("is_from_m") != Boolean.TRUE) ? false : true;
    }
}
