package com.bytedance.sdk.openadsdk.dse;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.GeckoHubImp;
import com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.LXL.vHmGJpUTWNVV;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.orl;
import com.bytedance.sdk.openadsdk.gjv.qor;
import com.bytedance.sdk.openadsdk.jip.gjv;
import com.bytedance.sdk.openadsdk.utils.ua;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class hn {
    private static final String[] hnj = {"gecko16-normal-useast5.tiktokv.us"};

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.dse.hn$hn, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static class C0240hn {
        private static final hn hnj = new hn();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public interface hnj {
        void hnj();
    }

    private static String gjv() {
        String[] strArrIdl = oj.gjv().idl();
        if (strArrIdl == null) {
            strArrIdl = hnj;
        }
        String str = strArrIdl[new SecureRandom().nextInt(strArrIdl.length)];
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        SecureRandom secureRandom = new SecureRandom();
        String[] strArr = hnj;
        return strArr[secureRandom.nextInt(strArr.length)];
    }

    public static void qor() {
        try {
            GeckoHubImp.setThreadPoolExecutorCallback(new IThreadPoolCallback() { // from class: com.bytedance.sdk.openadsdk.dse.hn.2
                @Override // com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback
                public ExecutorService getThreadPool() {
                    return ua.sk();
                }
            });
        } catch (Throwable th2) {
            apu.hnj("GeckoHub", "setThreadPoolExecutor error", th2);
        }
    }

    public ILoader hn() {
        try {
            return GeckoHubImp.inst(oj.hnj()).getGeckoResLoader();
        } catch (Throwable th2) {
            apu.hnj("GeckoHub", "getGeckoResLoader error", th2);
            return null;
        }
    }

    private hn() {
        try {
            GeckoHubImp.inst(oj.hnj());
        } catch (Throwable th2) {
            apu.hnj("GeckoHub", "GeckoHubImp init error", th2);
        }
    }

    public static hn hnj() {
        return C0240hn.hnj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hn(Map<String, as> map, JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject == null) {
                jSONObject2.put("success", false);
                jSONObject2.put(NotificationCompat.CATEGORY_MESSAGE, str);
                jSONObject2.put("code", 1);
                jSONObject = jSONObject2;
            }
            Iterator<as> it = map.values().iterator();
            while (it.hasNext()) {
                gjv.hnj(it.next(), jSONObject);
            }
        } catch (Throwable th2) {
            apu.hnj("GeckoHub", "upLoadStateEvent error", th2);
        }
    }

    public void hnj(Map<String, as> map) {
        hnj(map, (hnj) null, false);
    }

    public void hnj(final Map<String, as> map, final hnj hnjVar, boolean z10) {
        try {
            String strHnj = orl.hnj(oj.hnj());
            if (TextUtils.isEmpty(strHnj)) {
                return;
            }
            for (as asVar : map.values()) {
                if (asVar != null) {
                    if (!z10 && asVar.aj()) {
                        map.remove(asVar.rx());
                    } else {
                        gjv.hn(asVar);
                    }
                }
            }
            if (map.isEmpty()) {
                return;
            }
            GeckoHubImp.setRandomHost(gjv());
            GeckoHubImp.inst(oj.hnj()).preload(strHnj, new IStatisticMonitor() { // from class: com.bytedance.sdk.openadsdk.dse.hn.1
                @Override // com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor
                public void upload(String str, JSONObject jSONObject) {
                    if ("geckosdk_update_stats".equals(str)) {
                        as asVar2 = (as) map.get(jSONObject.optString("channel"));
                        if (asVar2 != null) {
                            qor.hnj.hnj(str, jSONObject, asVar2);
                            return;
                        }
                        return;
                    }
                    if ("download_gecko_end".equals(str)) {
                        hnj hnjVar2 = hnjVar;
                        if (hnjVar2 != null) {
                            hnjVar2.hnj();
                        }
                        hn.hn(map, jSONObject, "");
                    }
                }
            }, map.keySet(), new com.bytedance.sdk.openadsdk.dse.hnj());
        } catch (Throwable th2) {
            hn(map, null, th2.toString());
            apu.hnj("GeckoHub", "releaseGeckoResLoader error", th2);
        }
    }

    public void hnj(ILoader iLoader) {
        if (iLoader != null) {
            try {
                GeckoHubImp.inst(oj.hnj()).releaseGeckoResLoader(iLoader);
            } catch (Throwable th2) {
                apu.hnj(vHmGJpUTWNVV.CajtKLghKemkOm, "releaseGeckoResLoader error", th2);
            }
        }
    }

    public WebResourceResponseModel hnj(ILoader iLoader, String str, String str2) {
        if (iLoader == null) {
            return null;
        }
        try {
            return GeckoHubImp.inst(oj.hnj()).findResAndMsg(iLoader, str, str2);
        } catch (Throwable th2) {
            apu.hnj("GeckoHub", "findRes error", th2);
            return null;
        }
    }

    public int hnj(ILoader iLoader, String str) {
        try {
            return GeckoHubImp.inst(oj.hnj()).getResCount(iLoader, str);
        } catch (Throwable th2) {
            apu.hnj("GeckoHub", "getResCount error", th2);
            return 0;
        }
    }
}
