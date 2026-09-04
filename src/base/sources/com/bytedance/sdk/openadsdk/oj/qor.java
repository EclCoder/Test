package com.bytedance.sdk.openadsdk.oj;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.aq;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.oj;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    private static volatile Handler gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static Boolean f14582hn;
    private static volatile hnj hnj;
    private static volatile HandlerThread qor = aq.hnj("pag__bus_monitor", 0);

    public static void hn(gjv gjvVar) {
        hnj().hnj(new sk(gjvVar, 0, 1, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Handler sk() {
        if (qor == null || !qor.isAlive()) {
            synchronized (fc.class) {
                try {
                    if (qor == null || !qor.isAlive()) {
                        qor = aq.hnj("pag_init_handle", -1);
                        gjv = new Handler(qor.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (gjv == null) {
            synchronized (fc.class) {
                try {
                    if (gjv == null) {
                        gjv = new Handler(qor.getLooper());
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return gjv;
    }

    public static void hn() {
        hnj().hnj(true);
    }

    public static hnj hnj() {
        if (hnj == null) {
            synchronized (qor.class) {
                try {
                    if (hnj == null) {
                        hnj = hnj.hnj(new hn() { // from class: com.bytedance.sdk.openadsdk.oj.qor.1
                            @Override // com.bytedance.sdk.openadsdk.oj.hn
                            public Context getContext() {
                                return oj.hnj();
                            }

                            @Override // com.bytedance.sdk.openadsdk.oj.hn
                            public Handler getHandler() {
                                return qor.sk();
                            }

                            @Override // com.bytedance.sdk.openadsdk.oj.hn
                            public int getOnceLogCount() {
                                int iHnj = com.bytedance.sdk.openadsdk.as.sk.hnj("bus_monitor_config", "once_count", 10);
                                if (iHnj > 100 || iHnj < 5) {
                                    return 10;
                                }
                                return iHnj;
                            }

                            @Override // com.bytedance.sdk.openadsdk.oj.hn
                            public int getOnceLogInterval() {
                                int iHnj = com.bytedance.sdk.openadsdk.as.sk.hnj("bus_monitor_config", "once_interval", 10000);
                                if (iHnj < 10000) {
                                    return 10000;
                                }
                                return iHnj;
                            }

                            @Override // com.bytedance.sdk.openadsdk.oj.hn
                            public HandlerThread getSafeHandlerThread(String str, int i10) {
                                return aq.hnj(str, i10);
                            }

                            @Override // com.bytedance.sdk.openadsdk.oj.hn
                            public int getUploadIntervalTime() {
                                int iHnj = com.bytedance.sdk.openadsdk.as.sk.hnj("bus_monitor_config", "interval", 86400000);
                                if (iHnj < 3600000) {
                                    return 86400000;
                                }
                                return iHnj;
                            }

                            @Override // com.bytedance.sdk.openadsdk.oj.hn
                            public boolean isMonitorOpen() {
                                if (qor.f14582hn != null) {
                                    return qor.f14582hn.booleanValue();
                                }
                                Boolean unused = qor.f14582hn = Boolean.valueOf(com.bytedance.sdk.openadsdk.as.sk.hnj("bus_monitor_config", "enable", 1) == 1);
                                return qor.f14582hn.booleanValue();
                            }

                            @Override // com.bytedance.sdk.openadsdk.oj.hn
                            public void onMonitorUpload(List<com.bytedance.sdk.openadsdk.oj.hn.hnj> list) {
                                if (list == null || list.isEmpty()) {
                                    return;
                                }
                                for (final com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar : list) {
                                    com.bytedance.sdk.openadsdk.jip.gjv.hnj("bus_monitor", false, new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.oj.qor.1.1
                                        @Override // com.bytedance.sdk.openadsdk.jip.hn
                                        public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() {
                                            JSONObject jSONObject = new JSONObject();
                                            try {
                                                jSONObject.put("sdk_version", hnjVar.hn());
                                                jSONObject.put("scene", hnjVar.qor());
                                                jSONObject.put("start_count", hnjVar.gjv());
                                                jSONObject.put("success_count", hnjVar.sk());
                                                jSONObject.put("fail_count", hnjVar.dkl());
                                                jSONObject.put("rit", hnjVar.dse());
                                                jSONObject.put("tag", hnjVar.aq());
                                                jSONObject.put("label", hnjVar.ojm());
                                                jSONObject.put("mediation", hnjVar.dnm());
                                                jSONObject.put("is_init", hnjVar.bug());
                                                jSONObject.put("extra", hnjVar.orl());
                                                jSONObject.put("date_device", hnjVar.ta());
                                                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("bus_monitor").hn(jSONObject.toString());
                                            } catch (Exception e10) {
                                                apu.hnj("BusMonitorUtils", "onMonitorUpload: ", e10);
                                                return null;
                                            }
                                        }
                                    });
                                }
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    public static void qor(gjv gjvVar) {
        hnj().hnj(new sk(gjvVar, 0, 0, 1));
    }

    public static void hnj(gjv gjvVar) {
        hnj().hnj(new sk(gjvVar, 1, 0, 0));
    }
}
