package com.bytedance.sdk.openadsdk.component.reward.hnj;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class orl {
    private volatile long aq;
    private volatile long dkl;
    private volatile long dse;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final hnj f13500hn;
    final as hnj;
    private com.bytedance.adsdk.ugeno.hn.qor mjg;
    private String ojm;
    private com.bytedance.adsdk.ugeno.hn.qor orl;
    private FrameLayout qor;
    private boolean uua;
    private final AtomicBoolean gjv = new AtomicBoolean(false);

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final AtomicBoolean f13501sk = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final AtomicBoolean f13502ta = new AtomicBoolean(false);
    private long dnm = 0;
    private long bug = 0;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private String f13499fc = null;
    private boolean jip = false;

    public orl(hnj hnjVar) {
        this.f13500hn = hnjVar;
        this.hnj = hnjVar.f13456hn;
        this.ojm = hnjVar.f13461sk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mjg() {
        com.bytedance.sdk.openadsdk.core.bug.aq.hnj hnjVarOrp;
        as asVar = this.hnj;
        if (asVar == null || (hnjVarOrp = asVar.orp()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.bug.gjv.hn hnVar = new com.bytedance.sdk.openadsdk.core.bug.gjv.hn(this.f13500hn.orp, this.hnj, hnjVarOrp, this.ojm, new com.bytedance.sdk.openadsdk.core.bug.dse.hn() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.orl.3
            @Override // com.bytedance.sdk.openadsdk.core.bug.dse.qor
            public void hn(String str) {
                orl orlVar = orl.this;
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(orlVar.hnj, true, orlVar.ojm, "success", SystemClock.elapsedRealtime() - orl.this.bug, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.bug.dse.hn
            public void hnj() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.bug.dse.qor
            public void hnj(String str) {
                orl.this.bug = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.bug.dse.qor
            public void hnj(int i10, String str, String str2) {
                orl.this.f13501sk.set(false);
                orl orlVar = orl.this;
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(orlVar.hnj, true, orlVar.ojm, "fail", SystemClock.elapsedRealtime() - orl.this.bug, str2, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.bug.dse.hn
            public void hnj(int i10, String str) {
                orl.this.f13501sk.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.bug.dse.hn
            public void hnj(com.bytedance.adsdk.ugeno.hn.qor<View> qorVar) {
                orl.this.mjg = qorVar;
                orl.this.f13501sk.set(true);
            }
        });
        hnVar.hnj(new com.bytedance.sdk.openadsdk.core.bug.dse.hnj() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.orl.4
            @Override // com.bytedance.sdk.openadsdk.core.bug.dse.hnj
            public void hn() {
                orl.this.jip = true;
                orl.this.f13500hn.f13464ua.ta().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.bug.dse.hnj
            public String hnj() {
                return "overlay";
            }
        });
        hnVar.hnj();
        hnVar.hnj(this.f13500hn.f13464ua.ta());
    }

    public boolean bug() {
        return this.gjv.get();
    }

    public void dnm() {
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(SystemClock.elapsedRealtime() - this.aq, this.hnj, this.ojm);
    }

    public boolean orl() {
        return this.f13501sk.get();
    }

    public void ta() {
        com.bytedance.sdk.openadsdk.gjv.qor.qor(this.hnj, this.ojm);
    }

    public void aq() {
        com.bytedance.adsdk.ugeno.hn.qor qorVar = this.mjg;
        if (qorVar != null) {
            this.qor.addView(qorVar.dnm(), new FrameLayout.LayoutParams(this.mjg.fvt(), this.mjg.orp()));
        }
    }

    public void dkl() {
        this.aq = SystemClock.elapsedRealtime();
    }

    public void dse() {
        ta();
        ojm();
        com.bytedance.adsdk.ugeno.hn.qor qorVar = this.orl;
        if (qorVar != null) {
            this.qor.addView(qorVar.dnm(), new FrameLayout.LayoutParams(this.orl.fvt(), this.orl.orp()));
        }
    }

    public boolean gjv() {
        return this.jip;
    }

    public void ojm() {
        if (this.aq <= 0 || this.dse <= 0 || this.f13502ta.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hn(this.dse - this.aq, this.hnj, this.ojm, this.f13499fc);
    }

    public void sk() {
        this.dkl = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(this.hnj, this.ojm);
    }

    public void qor() {
        com.bytedance.sdk.openadsdk.core.bug.aq.hnj hnjVarFvt;
        as asVar = this.hnj;
        if (asVar == null || (hnjVarFvt = asVar.fvt()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.bug.gjv.hn hnVar = new com.bytedance.sdk.openadsdk.core.bug.gjv.hn(this.f13500hn.orp, this.hnj, hnjVarFvt, this.ojm, new com.bytedance.sdk.openadsdk.core.bug.dse.hn() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.orl.1
            @Override // com.bytedance.sdk.openadsdk.core.bug.dse.qor
            public void hn(String str) {
                orl.this.f13499fc = str;
                orl orlVar = orl.this;
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(orlVar.hnj, false, orlVar.ojm, "success", SystemClock.elapsedRealtime() - orl.this.dnm, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.bug.dse.qor
            public void hnj(String str) {
                orl.this.dnm = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.bug.dse.qor
            public void hnj(int i10, String str, String str2) {
                orl.this.f13499fc = str2;
                orl.this.gjv.set(false);
                orl orlVar = orl.this;
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(orlVar.hnj, false, orlVar.ojm, "fail", SystemClock.elapsedRealtime() - orl.this.dnm, str2, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.bug.dse.hn
            public void hnj() {
                orl.this.sk();
            }

            @Override // com.bytedance.sdk.openadsdk.core.bug.dse.hn
            public void hnj(int i10, String str) {
                orl.this.gjv.set(false);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                orl orlVar = orl.this;
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(orlVar.hnj, orlVar.ojm, jElapsedRealtime - orl.this.dkl, i10, str, (String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.bug.dse.hn
            public void hnj(com.bytedance.adsdk.ugeno.hn.qor<View> qorVar) {
                orl.this.orl = qorVar;
                orl.this.gjv.set(true);
                orl.this.dse = SystemClock.elapsedRealtime();
                if (orl.this.f13500hn.nyv.apu()) {
                    View viewTa = orl.this.f13500hn.f13464ua.ta();
                    if (viewTa instanceof com.bytedance.sdk.openadsdk.core.dkl.gjv) {
                        ((com.bytedance.sdk.openadsdk.core.dkl.gjv) viewTa).setImageResource(wu.gjv(orl.this.f13500hn.jbd, "tt_skip_btn"));
                    }
                }
                orl.this.mjg();
                orl.this.ojm();
                orl orlVar = orl.this;
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(orlVar.hnj, orlVar.ojm, orl.this.dse - orl.this.dkl);
            }
        });
        if (this.hnj.orp() != null) {
            hnVar.hnj(new com.bytedance.sdk.openadsdk.core.bug.dse.hnj() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.orl.2
                @Override // com.bytedance.sdk.openadsdk.core.bug.dse.hnj
                public String hnj() {
                    return "normal";
                }

                @Override // com.bytedance.sdk.openadsdk.core.bug.dse.hnj
                public void hn() {
                }
            });
        }
        hnVar.hnj();
        hnVar.hnj(this.f13500hn.f13464ua.ta());
    }

    void hn() {
        this.qor = (FrameLayout) this.f13500hn.fvt.findViewById(com.bytedance.sdk.openadsdk.utils.jip.uua);
    }

    public void hnj() {
        if (this.uua) {
            return;
        }
        this.uua = true;
        hn();
    }

    public void hnj(int i10) {
        sq.hnj((View) this.qor, i10);
    }
}
