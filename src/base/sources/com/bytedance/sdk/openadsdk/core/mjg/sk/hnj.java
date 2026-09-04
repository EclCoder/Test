package com.bytedance.sdk.openadsdk.core.mjg.sk;

import a7.b;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.hnj.hnj.hnj.qor.c;
import com.bytedance.sdk.component.aq.hn.qor;
import com.bytedance.sdk.component.hn.hnj.dse;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.gjv.sk.hn.bug;
import com.bytedance.sdk.openadsdk.gjv.sk.hn.dnm;
import com.bytedance.sdk.openadsdk.gjv.sk.hn.ojm;
import com.bytedance.sdk.openadsdk.gjv.sk.hn.ta;
import com.bytedance.sdk.openadsdk.jip.gjv;
import com.bytedance.sdk.openadsdk.utils.ua;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    public static final b hnj = new s6.b();

    private static void hn(c cVar, as asVar, AdSlot adSlot) {
        if (hnj(cVar)) {
            long jBug = cVar.orl() ? cVar.bug() : cVar.dkl();
            com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnjVarHnj = com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.hnj(asVar, (String) null, -1, cVar);
            hnjVarHnj.hnj(new dnm(cVar.jip(), jBug));
            gjv.hnj("load_video_start", hnjVarHnj);
        }
    }

    private static boolean hnj(c cVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void qor(c cVar, as asVar, AdSlot adSlot) {
        if (hnj(cVar)) {
            com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnjVarHnj = com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.hnj(asVar, (String) null, -1, cVar);
            hnjVarHnj.hnj(new ojm(cVar.jip(), cVar.dkl()));
            com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.hn(hnjVarHnj);
        }
    }

    public static void hnj(final c cVar, final b.a aVar) {
        as asVar;
        AdSlot adSlot;
        if ((cVar.dkl() > 0 || cVar.orl()) && cVar.oj() != -2) {
            if (cVar.oj() != 1) {
                cVar.sk(6000);
                cVar.dkl(6000);
                cVar.dse(6000);
                boolean z10 = cVar.sk("material_meta") != null && (cVar.sk("material_meta") instanceof as);
                boolean z11 = cVar.sk("ad_slot") != null && (cVar.sk("ad_slot") instanceof AdSlot);
                if (z10 && z11) {
                    as asVar2 = (as) cVar.sk("material_meta");
                    AdSlot adSlot2 = (AdSlot) cVar.sk("ad_slot");
                    hn(cVar, asVar2, adSlot2);
                    asVar = asVar2;
                    adSlot = adSlot2;
                } else {
                    asVar = null;
                    adSlot = null;
                }
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                final AdSlot adSlot3 = adSlot;
                final as asVar3 = asVar;
                final b.a aVar2 = new b.a() { // from class: com.bytedance.sdk.openadsdk.core.mjg.sk.hnj.1
                    @Override // a7.b.a
                    public void hn(c cVar2, int i10) {
                        AdSlot adSlot4;
                        b.a aVar3 = aVar;
                        if (aVar3 != null) {
                            aVar3.hnj(cVar2, i10);
                        }
                        as asVar4 = asVar3;
                        if (asVar4 != null && (adSlot4 = adSlot3) != null) {
                            hnj.qor(cVar, asVar4, adSlot4);
                        }
                        cVar.uua();
                    }

                    @Override // a7.b.a
                    public void hnj(c cVar2, int i10) {
                        b.a aVar3 = aVar;
                        if (aVar3 != null) {
                            aVar3.hnj(cVar2, i10);
                        }
                        if (asVar3 == null || adSlot3 == null) {
                            return;
                        }
                        hnj.hn(cVar, asVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime);
                    }

                    @Override // a7.b.a
                    public void hnj(c cVar2, int i10, String str) {
                        b.a aVar3 = aVar;
                        if (aVar3 != null) {
                            aVar3.hnj(cVar2, i10, str);
                        }
                        if (asVar3 == null || adSlot3 == null) {
                            return;
                        }
                        hnj.hn(cVar, asVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime, i10, str);
                    }
                };
                if (!hnj(cVar.jip())) {
                    if (aVar != null) {
                        aVar.hnj(cVar, 404, "unexpected url: " + cVar.jip());
                    }
                    hn(cVar, asVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime, -1, "video url is invalid");
                    return;
                }
                qor qorVar = new qor("VideoPreload") { // from class: com.bytedance.sdk.openadsdk.core.mjg.sk.hnj.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            hnj.hnj.a(oj.hnj(), cVar, aVar2);
                        } catch (Throwable th2) {
                            th2.getMessage();
                        }
                    }
                };
                if (ua.dkl()) {
                    ua.qor((Runnable) qorVar);
                    return;
                } else {
                    qorVar.run();
                    return;
                }
            }
        }
        if (aVar != null) {
            aVar.hnj(cVar, 100);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hn(c cVar, as asVar, AdSlot adSlot, long j10, int i10, String str) {
        if (hnj(cVar)) {
            com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnjVarHnj = com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.hnj(asVar, (String) null, -1, cVar);
            ta taVar = new ta();
            taVar.hnj(cVar.jip());
            taVar.hnj(cVar.dkl());
            taVar.hn(j10);
            taVar.hnj(i10);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            taVar.hn(str);
            taVar.qor("");
            hnjVarHnj.hnj(taVar);
            com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.hnj(hnjVarHnj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hn(c cVar, as asVar, AdSlot adSlot, long j10) {
        if (hnj(cVar)) {
            com.bytedance.sdk.openadsdk.gjv.sk.hn.hnj hnjVarHnj = com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.hnj(asVar, (String) null, -1, cVar);
            bug bugVar = new bug();
            bugVar.hnj(cVar.jip());
            bugVar.hnj(cVar.dkl());
            bugVar.hn(j10);
            if (cVar.wu() == 1) {
                bugVar.qor(1L);
            } else {
                bugVar.qor(0L);
            }
            hnjVarHnj.hnj(bugVar);
            gjv.hnj("load_video_success", hnjVarHnj);
        }
    }

    public static boolean hnj(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str2 = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str2 = "https:" + str.substring(4);
        } else {
            str2 = str;
        }
        return dse.qor(str2) != null;
    }
}
