package com.bytedance.sdk.openadsdk.core.ojm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.bytedance.sdk.openadsdk.utils.ua;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class bug {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static String f14041hn;
    private static final AtomicBoolean hnj = new AtomicBoolean(false);
    private static String qor;

    public static String gjv() {
        Map<String, com.bytedance.sdk.component.adexpress.hnj.qor.hnj> mapHnj;
        com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVar;
        String strQor;
        if (qor == null) {
            qor = com.bytedance.sdk.openadsdk.xn.gjv.hnj.hn("tt_sp", "js_render_v3_ver", "");
        }
        com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVarHn = com.bytedance.sdk.component.adexpress.hnj.hn.aq.hn();
        if (hnjVarHn != null && (mapHnj = hnjVarHn.hnj()) != null && (hnjVar = mapHnj.get("v3")) != null && (strQor = hnjVar.qor()) != null && !strQor.equals(qor)) {
            qor = strQor;
            com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tt_sp", "js_render_v3_ver", strQor);
        }
        return qor;
    }

    public static void hn() {
        if (com.bytedance.sdk.openadsdk.core.ta.hn.hnj().sk() || hnj.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.hnj.hn.hn.hnj();
    }

    public static void hnj() {
        com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().hnj(new com.bytedance.sdk.component.adexpress.hnj.hnj.hn() { // from class: com.bytedance.sdk.openadsdk.core.ojm.bug.1
            @Override // com.bytedance.sdk.component.adexpress.hnj.hnj.hn
            public int hnj(String str, ContentValues contentValues, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.xn.hn.hnj.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj(), str, contentValues, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.hnj.hnj.hn
            public Cursor hnj(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
                return new com.bytedance.sdk.openadsdk.xn.hnj.hnj(com.bytedance.sdk.openadsdk.xn.hn.hnj.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj(), str, strArr, str2, strArr2, str3, str4, str5));
            }

            @Override // com.bytedance.sdk.component.adexpress.hnj.hnj.hn
            public int hnj(String str, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.xn.hn.hnj.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj(), str, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.hnj.hnj.hn
            public void hnj(String str, ContentValues contentValues) {
                com.bytedance.sdk.openadsdk.xn.hn.hnj.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj(), str, contentValues);
            }
        });
        com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().hnj(new com.bytedance.sdk.component.adexpress.hnj.hnj.qor() { // from class: com.bytedance.sdk.openadsdk.core.ojm.bug.2

            /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ojm.bug$2$1, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            class AnonymousClass1 implements Runnable {

                /* JADX INFO: renamed from: hn, reason: collision with root package name */
                final /* synthetic */ int f14042hn;
                final /* synthetic */ MessageQueue[] hnj;
                final /* synthetic */ int qor;

                AnonymousClass1(MessageQueue[] messageQueueArr, int i10, int i11) {
                    this.hnj = messageQueueArr;
                    this.f14042hn = i10;
                    this.qor = i11;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.hnj[0] = Looper.myQueue();
                    hnj(this.hnj[0], this.f14042hn, this.qor);
                }
            }

            @Override // com.bytedance.sdk.component.adexpress.hnj.hnj.qor
            public String aq() {
                return com.bytedance.sdk.openadsdk.core.ta.hn().gjv();
            }

            @Override // com.bytedance.sdk.component.adexpress.hnj.hnj.qor
            public int bug() {
                return 0;
            }

            @Override // com.bytedance.sdk.component.adexpress.hnj.hnj.qor
            public com.bytedance.sdk.component.dse.hn.hnj dkl() {
                com.bytedance.sdk.component.dse.hn.hnj hnjVarGjv = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().gjv();
                hnjVarGjv.hnj(8);
                hnjVarGjv.hn("express_down");
                return hnjVarGjv;
            }

            @Override // com.bytedance.sdk.component.adexpress.hnj.hnj.qor
            public int dnm() {
                return com.bytedance.sdk.openadsdk.core.oj.gjv().dy();
            }

            @Override // com.bytedance.sdk.component.adexpress.hnj.hnj.qor
            public com.bytedance.sdk.component.dse.hn.hn dse() {
                com.bytedance.sdk.component.dse.hn.hn hnVarQor = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().qor();
                hnVarQor.hnj(8);
                hnVarQor.hn("express_get");
                return hnVarQor;
            }

            @Override // com.bytedance.sdk.component.adexpress.hnj.hnj.qor
            public ScheduledExecutorService fc() {
                return ua.hnj();
            }

            @Override // com.bytedance.sdk.component.adexpress.hnj.hnj.qor
            public void gjv() {
                int iGn = com.bytedance.sdk.openadsdk.core.oj.gjv().gn();
                int iDy = com.bytedance.sdk.openadsdk.core.oj.gjv().dy();
                if (iGn == 0 && iDy == 0) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.sk.sk.hnj().hnj(iGn);
                com.bytedance.sdk.component.adexpress.sk.sk.hnj().hn(iDy);
                int iDkl = com.bytedance.sdk.openadsdk.as.sk.dkl();
                int iSk = com.bytedance.sdk.openadsdk.as.sk.sk();
                if (iDkl == 0 && iSk == 0) {
                    return;
                }
                hnj(com.bytedance.sdk.openadsdk.core.fc.qor().getLooper().getQueue(), iSk, iDkl);
            }

            @Override // com.bytedance.sdk.component.adexpress.hnj.hnj.qor
            public int jip() {
                return sq.qor(com.bytedance.sdk.openadsdk.core.oj.hnj());
            }

            @Override // com.bytedance.sdk.component.adexpress.hnj.hnj.qor
            public ExecutorService mjg() {
                return ua.ta();
            }

            @Override // com.bytedance.sdk.component.adexpress.hnj.hnj.qor
            public int oj() {
                return com.bytedance.sdk.openadsdk.as.sk.hnj("gaussian_blur_type", 0);
            }

            @Override // com.bytedance.sdk.component.adexpress.hnj.hnj.qor
            public int ojm() {
                return 1;
            }

            @Override // com.bytedance.sdk.component.adexpress.hnj.hnj.qor
            public ExecutorService orl() {
                return ua.sk();
            }

            @Override // com.bytedance.sdk.component.adexpress.hnj.hnj.qor
            public Handler qor() {
                return com.bytedance.sdk.openadsdk.core.fc.qor();
            }

            @Override // com.bytedance.sdk.component.adexpress.hnj.hnj.qor
            public com.bytedance.sdk.component.adexpress.hnj.qor.hnj sk() {
                return com.bytedance.sdk.openadsdk.core.oj.qor().hnj();
            }

            @Override // com.bytedance.sdk.component.adexpress.hnj.hnj.qor
            public int ta() {
                return com.bytedance.sdk.openadsdk.core.oj.gjv().gn();
            }

            @Override // com.bytedance.sdk.component.adexpress.hnj.hnj.qor
            public int uua() {
                return sq.sk(com.bytedance.sdk.openadsdk.core.oj.hnj());
            }

            @Override // com.bytedance.sdk.component.adexpress.hnj.hnj.qor
            public Context hn() {
                return com.bytedance.sdk.openadsdk.core.oj.hnj();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void hn(final MessageQueue messageQueue, final int i10) {
                if (messageQueue == null || i10 <= 0) {
                    return;
                }
                messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.ojm.bug.2.4
                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        new com.bytedance.sdk.openadsdk.core.widget.hnj.hn(i10, false, messageQueue).hn();
                        return false;
                    }
                });
            }

            @Override // com.bytedance.sdk.component.adexpress.hnj.hnj.qor
            public int hnj() {
                if (com.bytedance.sdk.openadsdk.core.oj.gjv() == null) {
                    return 0;
                }
                return com.bytedance.sdk.openadsdk.core.oj.gjv().sk();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void hnj(final MessageQueue messageQueue, final int i10, final int i11) {
                if (messageQueue != null) {
                    final int iHnj = com.bytedance.sdk.openadsdk.as.sk.hnj("ad_load_and_render_opt", "w_p_delay", 500);
                    Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ojm.bug.2.2
                        @Override // java.lang.Runnable
                        public void run() {
                            hn(messageQueue, i10);
                            hnj(messageQueue, i11);
                        }
                    };
                    if (iHnj > 0) {
                        com.bytedance.sdk.openadsdk.core.fc.qor().postDelayed(runnable, iHnj);
                    } else {
                        runnable.run();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void hnj(final MessageQueue messageQueue, final int i10) {
                if (messageQueue == null || i10 <= 0) {
                    return;
                }
                messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.ojm.bug.2.3
                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        new com.bytedance.sdk.openadsdk.core.widget.hnj.hn(i10, true, messageQueue).hn();
                        return false;
                    }
                });
            }
        });
        com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().hnj(new com.bytedance.sdk.component.adexpress.hnj.hnj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.ojm.bug.3
            @Override // com.bytedance.sdk.component.adexpress.hnj.hnj.gjv
            public void hnj(int i10) {
                com.bytedance.sdk.openadsdk.jip.gjv.hnj().hnj(com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hn(i10).dkl(com.bytedance.sdk.openadsdk.core.ojm.hnj(i10)));
            }
        });
        com.bytedance.sdk.component.ojm.hnj.hnj.hnj().hnj(new com.bytedance.sdk.component.ojm.hnj.hn() { // from class: com.bytedance.sdk.openadsdk.core.ojm.bug.4
            @Override // com.bytedance.sdk.component.ojm.hnj.hn
            public void hnj(String str, String str2, JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.gjv.qor.qor(com.bytedance.sdk.openadsdk.utils.hn.qor(), str, str2, jSONObject);
            }

            @Override // com.bytedance.sdk.component.ojm.hnj.hn
            public void hnj(com.bytedance.sdk.component.ojm.hn.hnj hnjVar, String str, String str2, JSONObject jSONObject, long j10) {
                com.bytedance.sdk.openadsdk.core.model.as asVar = new com.bytedance.sdk.openadsdk.core.model.as();
                asVar.vf(hnjVar.hnj());
                asVar.tgn(hnjVar.hn());
                asVar.as(hnjVar.qor());
                asVar.m33do(hnjVar.gjv());
                com.bytedance.sdk.openadsdk.gjv.qor.hn(asVar, str, str2, jSONObject, j10);
            }

            @Override // com.bytedance.sdk.component.ojm.hnj.hn
            public void hnj(com.bytedance.sdk.component.ojm.hn.hnj hnjVar, String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
                if (hnjVar != null) {
                    com.bytedance.sdk.openadsdk.core.model.as asVar = new com.bytedance.sdk.openadsdk.core.model.as();
                    asVar.vf(hnjVar.hnj());
                    asVar.tgn(hnjVar.hn());
                    asVar.as(hnjVar.qor());
                    asVar.m33do(hnjVar.gjv());
                    com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), asVar, str, str2, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.core.ojm.bug.4.1
                        @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                        public JSONObject hnj() {
                            return jSONObject;
                        }

                        @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                        public JSONObject qor() {
                            return jSONObject2;
                        }
                    });
                }
            }
        });
    }

    public static String qor() {
        String strQor;
        if (f14041hn == null) {
            f14041hn = com.bytedance.sdk.openadsdk.xn.gjv.hnj.hn("tt_sp", "js_render_ver", "");
        }
        com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVarHn = com.bytedance.sdk.component.adexpress.hnj.hn.aq.hn();
        if (hnjVarHn != null && (strQor = hnjVarHn.qor()) != null && !strQor.equals(f14041hn)) {
            f14041hn = strQor;
            com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tt_sp", "js_render_ver", strQor);
        }
        return f14041hn;
    }
}
