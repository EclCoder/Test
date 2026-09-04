package com.bytedance.sdk.openadsdk.core.bug.dkl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.bug;
import com.bytedance.adsdk.ugeno.core.dnm;
import com.bytedance.adsdk.ugeno.core.fc;
import com.bytedance.adsdk.ugeno.core.jip;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.gm;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse extends gjv {

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    private boolean f13585gm;
    private float hqh;
    private boolean nyv;
    private float pty;
    private com.bytedance.adsdk.ugeno.hn.qor tgn;
    private com.bytedance.adsdk.ugeno.hn.qor tu;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    private float f13586ul;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.widget.sk f13587vf;
    private com.bytedance.adsdk.ugeno.hn.qor xyo;

    public dse(Context context, as asVar, boolean z10, hnj hnjVar, ViewGroup viewGroup) {
        super(context, asVar, z10, hnjVar, viewGroup);
        this.nyv = false;
        this.f13585gm = true;
        if (TextUtils.equals(this.wu, "fullscreen_interstitial_ad")) {
            this.hqh = this.f13592sk.kht();
        } else if (TextUtils.equals(this.wu, "rewarded_video")) {
            this.hqh = this.f13592sk.qlh();
        }
    }

    private void bug() {
        com.bytedance.adsdk.ugeno.hn.qor qorVar = this.tu;
        if (qorVar != null) {
            qorVar.qor(8);
        }
        com.bytedance.adsdk.ugeno.hn.qor qorVar2 = this.tgn;
        if (qorVar2 != null) {
            qorVar2.qor(8);
        }
    }

    private void fc() {
        com.bytedance.adsdk.ugeno.hn.qor<View> qorVar = this.qor;
        if (qorVar == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.hn.qor<T> qorVarDkl = qorVar.dkl("RVCountdown");
        this.tu = qorVarDkl;
        if (qorVarDkl == 0) {
            this.tu = this.qor.dkl("FVCountdown");
        }
        if (this.tu == null) {
            this.tu = this.qor.dkl("AOCountdown");
        }
        com.bytedance.adsdk.ugeno.hn.qor<T> qorVarDkl2 = this.qor.dkl("RVSkipView");
        this.tgn = qorVarDkl2;
        if (qorVarDkl2 == 0) {
            this.tgn = this.qor.dkl("FVSkipView");
        }
        if (this.tgn == null) {
            this.tgn = this.qor.dkl("AOSkipView");
        }
    }

    private boolean jip() {
        as asVar = this.f13592sk;
        return asVar != null && asVar.iwu() == 1;
    }

    private int mjg() {
        orl();
        try {
            this.hnj.hnj(this.f35do, this.qor);
            if (this.qor != null) {
                fc();
                bug();
            }
            if (this instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.hnj.dkl) {
                return 0;
            }
            this.dkl.gm().hn();
            this.dkl.gm().qor();
            return 0;
        } catch (NoClassDefFoundError unused) {
            return 140;
        } catch (UnsatisfiedLinkError unused2) {
            return 139;
        } catch (Throwable unused3) {
            return 141;
        }
    }

    private void orl() {
        dnm dnmVar = new dnm();
        HashMap map = new HashMap();
        map.put("image_info", this.dkl.dnm());
        map.put("cache_dir", this.dkl.mjg());
        dnmVar.hnj(map);
        dnmVar.hnj(this.f13590hn);
        dnmVar.hnj(this.gjv);
        dnmVar.hn(this.f35do);
        this.hnj.hnj("ad", dnmVar);
    }

    private void qor(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        com.bytedance.adsdk.ugeno.hn.qor qorVar = this.tgn;
        if (qorVar != null && (qorVar instanceof com.bytedance.sdk.openadsdk.core.bug.hn.dkl)) {
            int i11 = 0;
            if (!z10 && !z11) {
                i11 = 8;
            }
            qorVar.qor(i11);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.dkl.gjv
    protected com.bytedance.adsdk.ugeno.hn.qor aq() {
        com.bytedance.adsdk.ugeno.hn.qor<View> qorVar = this.qor;
        if (qorVar == null) {
            return null;
        }
        return qorVar.dkl("VideoV3");
    }

    public void dnm() {
        bug bugVar = this.hnj;
        if (bugVar != null) {
            bugVar.hnj(this.qor, "show", new Object[0]);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.dkl.gjv
    public com.bytedance.adsdk.ugeno.hn.qor dse() {
        com.bytedance.adsdk.ugeno.hn.qor<View> qorVar = this.qor;
        if (qorVar == null) {
            return null;
        }
        return qorVar.dkl("Playable");
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.dkl.gjv
    protected int gjv() {
        if (!this.dkl.ul()) {
            return ojm();
        }
        apu.hnj("UGenRender", "renderWidget: only update data");
        return mjg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.dkl.gjv
    protected JSONObject hn() {
        return this.dkl.qor();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.dkl.gjv
    protected JSONObject hnj() {
        JSONObject jSONObjectQor = this.dkl.qor();
        if (jSONObjectQor != null) {
            return jSONObjectQor.optJSONObject("xTemplate");
        }
        return null;
    }

    protected int ojm() {
        orl();
        this.hnj.hnj((fc) this);
        this.hnj.hnj((jip) this);
        if (jip()) {
            this.hnj.hnj(new qor());
        }
        gm gmVarVk = this.f13592sk.vk();
        if (gmVarVk == null) {
            try {
                if (com.bytedance.sdk.openadsdk.core.bug.dkl.hnj.dkl.hnj(this.wu)) {
                    this.qor = this.hnj.hnj(this.gjv, this.f35do, hnj(gmVarVk));
                } else {
                    this.qor = this.hnj.hnj(this.gjv, this.f35do, (JSONObject) null);
                }
            } catch (NoClassDefFoundError unused) {
                return 140;
            } catch (UnsatisfiedLinkError unused2) {
                return 139;
            } catch (Throwable unused3) {
                return 141;
            }
        } else {
            this.qor = this.hnj.hnj(this.gjv, this.f35do, hnj(gmVarVk));
        }
        if (this.qor != null) {
            fc();
            this.xyo = this.qor.dkl("ProgressBar");
            bug();
        }
        if (this instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.hnj.dkl) {
            return 0;
        }
        this.dkl.gm().hn();
        this.dkl.gm().qor();
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.dkl.gjv, com.bytedance.sdk.component.adexpress.dynamic.gjv
    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) {
        bug bugVar;
        if (this.qor == null) {
            return;
        }
        boolean z11 = i10 == 1;
        if (TextUtils.equals(this.wu, "open_ad") && (bugVar = this.hnj) != null) {
            bugVar.hnj(this.qor, "countdown", charSequence);
        }
        hn(charSequence, z11, i11, z10);
        hnj(charSequence, z11, i11, z10);
        qor(charSequence, z11, i11, z10);
    }

    public void ta() {
        bug bugVar = this.hnj;
        if (bugVar != null) {
            bugVar.hnj(this.qor, "videoFail", new Object[0]);
        }
    }

    private void hn(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        com.bytedance.adsdk.ugeno.hn.qor qorVar = this.xyo;
        if (qorVar != null && (qorVar instanceof com.bytedance.sdk.openadsdk.core.bug.hn.gjv.qor)) {
            try {
                int i11 = Integer.parseInt((String) charSequence);
                if (this.f13585gm) {
                    this.pty = i10;
                    this.f13585gm = false;
                }
                float f10 = (float) (((double) this.f13586ul) + ((0.5d / ((double) this.pty)) * 100.0d));
                this.f13586ul = f10;
                this.hnj.hnj(this.qor, "ProgressBar://progress", Float.valueOf(f10), Float.valueOf(this.hqh));
                if (!z11 && i11 > 0 && !z10) {
                    ((com.bytedance.sdk.openadsdk.core.bug.hn.gjv.qor) this.xyo).dse(500);
                    ((com.bytedance.sdk.openadsdk.core.bug.hn.gjv.qor) this.xyo).hnj((int) this.f13586ul);
                    return;
                }
                ((com.bytedance.sdk.openadsdk.core.bug.hn.gjv.qor) this.xyo).qor(8);
            } catch (Throwable th2) {
                apu.qor("UGenRender", th2.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.dkl.gjv
    public void hnj(com.bytedance.sdk.openadsdk.core.widget.sk skVar) {
        this.f13587vf = skVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.openadsdk.core.bug.dkl.gjv, com.bytedance.adsdk.ugeno.core.fc
    public void hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar, String str, com.bytedance.adsdk.ugeno.gjv.dkl.hnj hnjVar) {
        if (this.aq == null || hnjVar == null) {
            return;
        }
        String strHn = hnjVar.hn();
        strHn.getClass();
        int i10 = 7;
        int i11 = 6;
        int i12 = -1;
        switch (strHn) {
            case "sendLogExtra":
                new aq().hnj("sendLogExtra", this.f13592sk, this.wu, hnjVar.qor());
                break;
            case "sendAdExtra":
                new aq().hnj("sendAdExtra", this.f13592sk, this.wu, hnjVar.qor());
                break;
            case "openPrivacy":
                this.aq.hnj(qorVar.dnm(), i10, new com.bytedance.sdk.openadsdk.core.model.jip.hnj().gjv(this.mjg).qor(this.f13588fc).hn(this.jip).hnj(this.uua).hn(this.f13591oj).hnj(this.f13597xn).qor(i12).hnj(this.as).hnj(true).hnj(qorVar.ua()).hn(false).hnj());
                break;
            case "pauseVideo":
            case "videoControl":
                i10 = 4;
                this.aq.hnj(qorVar.dnm(), i10, new com.bytedance.sdk.openadsdk.core.model.jip.hnj().gjv(this.mjg).qor(this.f13588fc).hn(this.jip).hnj(this.uua).hn(this.f13591oj).hnj(this.f13597xn).qor(i12).hnj(this.as).hnj(true).hnj(qorVar.ua()).hn(false).hnj());
                break;
            case "skip":
                i10 = i11;
                this.aq.hnj(qorVar.dnm(), i10, new com.bytedance.sdk.openadsdk.core.model.jip.hnj().gjv(this.mjg).qor(this.f13588fc).hn(this.jip).hnj(this.uua).hn(this.f13591oj).hnj(this.f13597xn).qor(i12).hnj(this.as).hnj(true).hnj(qorVar.ua()).hn(false).hnj());
                break;
            case "openPlayable":
                com.bytedance.sdk.openadsdk.core.ojm.fc fcVar = this.ojm;
                if (fcVar != null) {
                    fcVar.hn((JSONObject) null);
                    break;
                }
                break;
            case "convert":
                i10 = 2;
                this.aq.hnj(qorVar.dnm(), i10, new com.bytedance.sdk.openadsdk.core.model.jip.hnj().gjv(this.mjg).qor(this.f13588fc).hn(this.jip).hnj(this.uua).hn(this.f13591oj).hnj(this.f13597xn).qor(i12).hnj(this.as).hnj(true).hnj(qorVar.ua()).hn(false).hnj());
                break;
            case "muteVideo":
                i10 = 5;
                this.aq.hnj(qorVar.dnm(), i10, new com.bytedance.sdk.openadsdk.core.model.jip.hnj().gjv(this.mjg).qor(this.f13588fc).hn(this.jip).hnj(this.uua).hn(this.f13591oj).hnj(this.f13597xn).qor(i12).hnj(this.as).hnj(true).hnj(qorVar.ua()).hn(false).hnj());
                break;
            case "openLinks":
                new dkl().hnj(hnj(qorVar.dnm()), this.f13590hn instanceof Activity, this.f13592sk, this.wu, hnjVar.qor(), this.f13587vf);
                break;
            case "speedVideoOrTimer":
                apu.hn("UGenRender", "onUGenEvent: " + hnjVar.qor());
                i11 = 13;
                if (hnjVar.qor() != null && !hnjVar.qor().isEmpty()) {
                    try {
                        i12 = Integer.parseInt(hnjVar.qor().get("switch"));
                    } catch (Throwable th2) {
                        apu.qor("UGenRender", th2);
                    }
                    break;
                }
                i10 = i11;
                this.aq.hnj(qorVar.dnm(), i10, new com.bytedance.sdk.openadsdk.core.model.jip.hnj().gjv(this.mjg).qor(this.f13588fc).hn(this.jip).hnj(this.uua).hn(this.f13591oj).hnj(this.f13597xn).qor(i12).hnj(this.as).hnj(true).hnj(qorVar.ua()).hn(false).hnj());
                break;
            case "dislike":
                i10 = 3;
                this.aq.hnj(qorVar.dnm(), i10, new com.bytedance.sdk.openadsdk.core.model.jip.hnj().gjv(this.mjg).qor(this.f13588fc).hn(this.jip).hnj(this.uua).hn(this.f13591oj).hnj(this.f13597xn).qor(i12).hnj(this.as).hnj(true).hnj(qorVar.ua()).hn(false).hnj());
                break;
            default:
                i10 = 0;
                this.aq.hnj(qorVar.dnm(), i10, new com.bytedance.sdk.openadsdk.core.model.jip.hnj().gjv(this.mjg).qor(this.f13588fc).hn(this.jip).hnj(this.uua).hn(this.f13591oj).hnj(this.f13597xn).qor(i12).hnj(this.as).hnj(true).hnj(qorVar.ua()).hn(false).hnj());
                break;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.dkl.gjv, com.bytedance.sdk.component.adexpress.dynamic.gjv
    public void setSoundMute(boolean z10) {
    }

    private void hnj(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        int i11;
        com.bytedance.adsdk.ugeno.hn.qor qorVar = this.tu;
        if (qorVar != null && (qorVar instanceof com.bytedance.sdk.openadsdk.core.bug.hn.hn)) {
            try {
                i11 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                apu.qor("UGenRender", "parse duration exception", charSequence);
                i11 = 0;
            }
            if (!z11 && i11 > 0 && !this.nyv) {
                this.tu.qor(0);
                if (!z10 && this.dkl.hnj() && com.bytedance.sdk.component.adexpress.gjv.dkl.hn(this.dkl.gjv())) {
                    ((com.bytedance.sdk.openadsdk.core.bug.hn.hn) this.tu).orl(String.valueOf(i10));
                    return;
                } else if (!"open_ad".equals(this.dkl.gjv()) && this.dkl.hnj()) {
                    this.nyv = true;
                    this.tu.qor(8);
                    return;
                } else {
                    ((com.bytedance.sdk.openadsdk.core.bug.hn.hn) this.tu).orl(String.valueOf(charSequence));
                    return;
                }
            }
            this.tu.qor(8);
        }
    }

    private Context hnj(View view) {
        Activity activityHnj = view != null ? com.bytedance.sdk.component.utils.hn.hnj(view) : null;
        return activityHnj == null ? this.f13590hn : activityHnj;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.dkl.gjv
    public void hnj(long j10, long j11) {
        super.hnj(j10, j11);
        bug bugVar = this.hnj;
        if (bugVar != null) {
            bugVar.hnj(this.qor, "videoProgress", Long.valueOf(j10), Long.valueOf(j11));
        }
    }

    public JSONObject hnj(gm gmVar) {
        if (gmVar != null) {
            return gmVar.sk();
        }
        return null;
    }
}
