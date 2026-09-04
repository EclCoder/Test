package com.bytedance.sdk.openadsdk.core.ojm;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.bytedance.sdk.openadsdk.utils.ua;
import x6.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class xn extends apu implements c.a, c.d {
    int aq;
    boolean dkl;
    boolean dse;
    boolean gjv;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.hnj.hn.qor f14084gm;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    int f14085hn;
    private jip hnj;
    private com.bytedance.sdk.openadsdk.xn.qor.hnj hqh;
    private long nyv;
    private long pty;
    boolean qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    int f14086sk;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.mjg.hn.dkl f14087ua;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    private boolean f14088ul;

    public xn(Context context, com.bytedance.sdk.openadsdk.core.model.as asVar, AdSlot adSlot, String str, boolean z10) {
        super(context, asVar, adSlot, str, false, true);
        this.f14085hn = 1;
        this.qor = false;
        this.gjv = true;
        this.dkl = true;
        this.dse = true;
        this.aq = -1;
        this.f14088ul = z10;
        mjg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qor(com.bytedance.sdk.component.adexpress.hn.mjg mjgVar) {
        com.bytedance.sdk.openadsdk.core.mjg.hn.qor videoController;
        if (hnj(mjgVar, false)) {
            this.orl.removeAllViews();
            if (this.hnj != null) {
                if ((this.f14036vf instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.gjv) && (mjgVar instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.hn)) {
                    FrameLayout frameLayoutFc = ((com.bytedance.sdk.openadsdk.core.bug.dkl.hn) mjgVar).fc();
                    if (frameLayoutFc != null) {
                        frameLayoutFc.removeAllViews();
                        if (this.aq == 10) {
                            this.hnj.setClickable(false);
                        }
                        frameLayoutFc.addView(this.hnj, new FrameLayout.LayoutParams(-1, -1));
                    }
                    if ((this.f14036vf instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.hnj.dkl) && (videoController = getVideoController()) != null) {
                        videoController.dkl(false);
                    }
                } else if (mjgVar.hnj() == null) {
                    this.orl.addView(this.hnj);
                } else if (this.dse) {
                    mjgVar.hnj().setTag(com.bytedance.sdk.component.adexpress.dynamic.hnj.dkl, 1);
                    ((FrameLayout) mjgVar.hnj()).removeAllViews();
                    ((FrameLayout) mjgVar.hnj()).addView(this.hnj, new FrameLayout.LayoutParams(-1, -1));
                    this.dse = false;
                }
                this.hnj.hnj(0L, true, false);
                gjv(this.f14086sk);
                if (!com.bytedance.sdk.component.utils.oj.gjv(this.ojm) && !this.gjv && this.dkl) {
                    this.hnj.sk();
                }
                if (TextUtils.equals("embeded_ad", this.f14032ta)) {
                    return;
                }
                setShowAdInteractionView(false);
            }
        }
    }

    private void setShowAdInteractionView(boolean z10) {
        jip jipVar = this.hnj;
        if (jipVar != null) {
            jipVar.setShowAdInteractionView(z10);
        }
    }

    private void tu() {
        try {
            this.hqh = new com.bytedance.sdk.openadsdk.xn.qor.hnj();
            jip jipVar = new jip(this.ojm, this.bug, this.f14032ta, this.tu, this.f14088ul);
            this.hnj = jipVar;
            jipVar.setShouldCheckNetChange(false);
            this.hnj.setControllerStatusCallBack(new com.bytedance.sdk.openadsdk.core.mjg.hn.dkl.hn() { // from class: com.bytedance.sdk.openadsdk.core.ojm.xn.2
                @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.dkl.hn
                public void hnj(boolean z10, long j10, long j11, long j12, boolean z11) {
                    xn.this.hqh.hnj = z10;
                    xn.this.hqh.f14813sk = j10;
                    xn.this.hqh.dkl = j11;
                    xn.this.hqh.dse = j12;
                    xn.this.hqh.gjv = z11;
                }
            });
            this.hnj.setVideoAdLoadListener(this);
            this.hnj.setVideoAdInteractionListener(this);
            if ("embeded_ad".equals(this.f14032ta)) {
                this.hnj.setIsAutoPlay(this.qor ? this.dnm.isAutoPlay() : this.gjv);
            } else if ("open_ad".equals(this.f14032ta)) {
                this.hnj.setIsAutoPlay(true);
            } else {
                this.hnj.setIsAutoPlay(this.gjv);
            }
            if ("open_ad".equals(this.f14032ta)) {
                this.hnj.hnj(true, "initVideo");
            } else {
                boolean zQor = com.bytedance.sdk.openadsdk.core.oj.gjv().qor(String.valueOf(this.f14086sk));
                this.wu = zQor;
                this.hnj.hnj(zQor, "initVideo");
            }
            this.hnj.gjv();
        } catch (Exception unused) {
            this.hnj = null;
        }
    }

    public void fc() {
        com.bytedance.sdk.openadsdk.core.mjg.hn.dkl dklVar = this.f14087ua;
        if (dklVar != null) {
            dklVar.orl();
            return;
        }
        jip jipVar = this.hnj;
        if (jipVar != null) {
            jipVar.orl();
        }
    }

    @Override // x6.c.d
    public void g_() {
        this.dkl = false;
        this.f14085hn = 2;
        com.bytedance.sdk.openadsdk.hnj.hn.qor qorVar = this.f14084gm;
        if (qorVar != null) {
            qorVar.hnj(null);
        }
    }

    protected jip getExpressVideoView() {
        return this.hnj;
    }

    public com.bytedance.sdk.openadsdk.hnj.hn.qor getVideoAdListener() {
        return this.f14084gm;
    }

    public com.bytedance.sdk.openadsdk.core.mjg.hn.qor getVideoController() {
        jip jipVar = this.hnj;
        if (jipVar != null) {
            return jipVar.getNativeVideoController();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.xn.qor.hnj getVideoModel() {
        return this.hqh;
    }

    void gjv(int i10) {
        int iHn = com.bytedance.sdk.openadsdk.core.oj.gjv().hn(i10);
        if (3 == iHn) {
            this.qor = false;
            this.gjv = false;
        } else if (4 == iHn) {
            this.qor = true;
        } else {
            int iQor = com.bytedance.sdk.component.utils.oj.qor(com.bytedance.sdk.openadsdk.core.oj.hnj());
            if (1 == iHn) {
                this.qor = false;
                this.gjv = orp.gjv(iQor);
            } else if (2 == iHn) {
                if (orp.sk(iQor) || orp.gjv(iQor) || orp.dkl(iQor)) {
                    this.qor = false;
                    this.gjv = true;
                }
            } else if (5 == iHn && (orp.gjv(iQor) || orp.dkl(iQor))) {
                this.qor = false;
                this.gjv = true;
            }
        }
        if (this.gjv) {
            return;
        }
        this.f14085hn = 3;
    }

    @Override // x6.c.d
    public void h_() {
        this.dkl = false;
        this.mjg = true;
        this.f14085hn = 3;
        com.bytedance.sdk.openadsdk.hnj.hn.qor qorVar = this.f14084gm;
        if (qorVar != null) {
            qorVar.hn(null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hn() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hnj() {
    }

    @Override // x6.c.d
    public void i_() {
        this.dkl = false;
        this.mjg = false;
        this.f14085hn = 2;
    }

    @Override // x6.c.d
    public void j_() {
        this.dkl = false;
        this.f14085hn = 5;
        com.bytedance.sdk.component.adexpress.hn.hn hnVar = this.xyo;
        if (hnVar != null && hnVar.hn() != null) {
            this.xyo.hn().onvideoComplate();
        }
        com.bytedance.sdk.openadsdk.hnj.hn.qor qorVar = this.f14084gm;
        if (qorVar != null) {
            qorVar.qor(null);
        }
        com.bytedance.sdk.component.adexpress.hn.gjv<? extends View> gjvVar = this.f14036vf;
        if (gjvVar instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.gjv) {
            ((com.bytedance.sdk.openadsdk.core.bug.dkl.gjv) gjvVar).onvideoComplate();
        }
    }

    public void jip() {
        com.bytedance.sdk.openadsdk.core.mjg.hn.dkl dklVar = this.f14087ua;
        if (dklVar != null) {
            dklVar.fc();
            return;
        }
        jip jipVar = this.hnj;
        if (jipVar != null) {
            jipVar.fc();
        }
    }

    protected void mjg() {
        this.orl = new FrameLayout(this.ojm);
        com.bytedance.sdk.openadsdk.core.model.as asVar = this.bug;
        int iAtw = asVar != null ? asVar.atw() : 0;
        this.f14086sk = iAtw;
        gjv(iAtw);
        tu();
        addView(this.orl, new FrameLayout.LayoutParams(-1, -1));
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.orl.dse() { // from class: com.bytedance.sdk.openadsdk.core.ojm.xn.1
            @Override // com.bytedance.sdk.openadsdk.orl.dse
            public void hnj(final com.bytedance.sdk.component.adexpress.hn.mjg mjgVar) {
                ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ojm.xn.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        xn.this.hnj(mjgVar, true);
                    }
                });
            }
        });
    }

    public boolean orl() {
        return this.f14088ul;
    }

    public void setBackupVideoView(com.bytedance.sdk.openadsdk.core.mjg.hn.dkl dklVar) {
        this.f14087ua = dklVar;
    }

    public void setVideoAdListener(com.bytedance.sdk.openadsdk.hnj.hn.qor qorVar) {
        this.f14084gm = qorVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public int sk() {
        jip jipVar;
        if (this.f14085hn == 3 && (jipVar = this.hnj) != null) {
            jipVar.gjv();
        }
        jip jipVar2 = this.hnj;
        if (jipVar2 != null && jipVar2.getNativeVideoController().mjg()) {
            this.f14085hn = 1;
        }
        dse(this.f14085hn);
        return this.f14085hn;
    }

    public void uua() {
        com.bytedance.sdk.openadsdk.core.mjg.hn.qor videoController = getVideoController();
        if (videoController != null) {
            videoController.hnj(3, true);
        }
    }

    private void hn(long j10, long j11) {
        int iAbs = (int) Math.abs(((long) this.f14029oj) - j10);
        int i10 = this.f14029oj;
        if (i10 < 0 || iAbs > 500 || i10 > j11 || iAbs >= 500 || this.apu.contains(this.f14037xn)) {
            return;
        }
        if (this.f14029oj > j10) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ojm.xn.4
                @Override // java.lang.Runnable
                public void run() {
                    xn.this.hnj.setCanInterruptVideoPlay(true);
                    xn.this.hnj.performClick();
                    xn xnVar = xn.this;
                    xnVar.hn(xnVar.f14029oj, xnVar.f14037xn);
                }
            }, iAbs);
        } else {
            this.hnj.setCanInterruptVideoPlay(true);
            this.hnj.performClick();
            hn(this.f14029oj, this.f14037xn);
        }
        this.apu.add(this.f14037xn);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.component.adexpress.hn.fc
    public void hnj(com.bytedance.sdk.component.adexpress.hn.gjv<? extends View> gjvVar, com.bytedance.sdk.component.adexpress.hn.mjg mjgVar) {
        this.f14036vf = gjvVar;
        this.aq = gjvVar.qor();
        com.bytedance.sdk.component.adexpress.hn.gjv<? extends View> gjvVar2 = this.f14036vf;
        if ((gjvVar2 instanceof Cdo) && ((Cdo) gjvVar2).jip() != null) {
            ((Cdo) this.f14036vf).jip().hnj((fc) this);
        }
        if (mjgVar != null && mjgVar.hn()) {
            hnj(mjgVar);
        }
        super.hnj(gjvVar, mjgVar);
    }

    private void hnj(final com.bytedance.sdk.component.adexpress.hn.mjg mjgVar) {
        if (mjgVar == null) {
            return;
        }
        ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ojm.xn.3
            @Override // java.lang.Runnable
            public void run() {
                xn.this.qor(mjgVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hnj(com.bytedance.sdk.component.adexpress.hn.mjg mjgVar, boolean z10) {
        int i10;
        double dSk = mjgVar.sk();
        double dDkl = mjgVar.dkl();
        double dDse = mjgVar.dse();
        double dAq = mjgVar.aq();
        if ((dDse == 0.0d || dAq == 0.0d) && (i10 = this.aq) != 7 && i10 != 10 && i10 != 9 && !(this.f14036vf instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.gjv)) {
            return false;
        }
        int iHn = sq.hn(this.ojm, (float) dSk);
        int iHn2 = sq.hn(this.ojm, (float) dDkl);
        int iHn3 = sq.hn(this.ojm, (float) dDse);
        int iHn4 = sq.hn(this.ojm, (float) dAq);
        float fMin = Math.min(Math.min(sq.hn(this.ojm, mjgVar.dnm()), sq.hn(this.ojm, mjgVar.bug())), Math.min(sq.hn(this.ojm, mjgVar.orl()), sq.hn(this.ojm, mjgVar.mjg())));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.orl.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(iHn3, iHn4);
        }
        layoutParams.width = iHn3;
        layoutParams.height = iHn4;
        layoutParams.topMargin = iHn2;
        layoutParams.leftMargin = iHn;
        layoutParams.setMarginStart(iHn);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        this.orl.setLayoutParams(layoutParams);
        sq.hn(this.orl, fMin);
        jip jipVar = this.hnj;
        if (jipVar == null || !z10) {
            return true;
        }
        jipVar.hnj(iHn3, iHn4);
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public long gjv() {
        return this.nyv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public void dkl() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public long qor() {
        return this.nyv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hnj(boolean z10, String str) {
        jip jipVar;
        if (this.bug.az() || (jipVar = this.hnj) == null) {
            return;
        }
        jipVar.hnj(z10, str);
        setSoundMute(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hnj(int i10) {
        jip jipVar = this.hnj;
        if (jipVar == null) {
            return;
        }
        if (i10 == 1) {
            jipVar.hnj(0L, true, false);
            return;
        }
        if (i10 == 2 || i10 == 3) {
            jipVar.setCanInterruptVideoPlay(true);
            this.hnj.performClick();
        } else if (i10 == 4) {
            jipVar.getNativeVideoController().sk();
        } else {
            if (i10 != 5) {
                return;
            }
            jipVar.hnj(0L, true, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.component.adexpress.hn.aq
    public void hnj(View view, int i10, com.bytedance.sdk.component.adexpress.qor qorVar) {
        if (i10 == -1 || qorVar == null) {
            return;
        }
        if (i10 == 11) {
            try {
                jip jipVar = this.hnj;
                if (jipVar != null) {
                    jipVar.setCanInterruptVideoPlay(true);
                    this.hnj.performClick();
                    if (this.mjg) {
                        this.hnj.findViewById(com.bytedance.sdk.openadsdk.utils.jip.tq).setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.hnj(view, i10, qorVar);
    }

    @Override // x6.c.d
    public void hnj(long j10, long j11) {
        this.dkl = false;
        int i10 = this.f14085hn;
        if (i10 != 5 && i10 != 3 && j10 > this.nyv) {
            this.f14085hn = 2;
        }
        this.nyv = j10;
        this.pty = j11;
        com.bytedance.sdk.component.adexpress.hn.hn hnVar = this.xyo;
        if (hnVar != null && hnVar.hn() != null) {
            this.xyo.hn().setTimeUpdate(((int) (j11 - j10)) / 1000);
        }
        com.bytedance.sdk.component.adexpress.hn.gjv<? extends View> gjvVar = this.f14036vf;
        if (gjvVar instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.gjv) {
            ((com.bytedance.sdk.openadsdk.core.bug.dkl.gjv) gjvVar).setTimeUpdate(((int) (j11 - j10)) / 1000);
            ((com.bytedance.sdk.openadsdk.core.bug.dkl.gjv) this.f14036vf).hnj(j10, j11);
        }
        hn(j10, j11);
    }

    @Override // x6.c.a
    public void hnj(int i10, int i11) {
        this.nyv = this.pty;
        this.f14085hn = 4;
        com.bytedance.sdk.openadsdk.hnj.hn.qor qorVar = this.f14084gm;
        if (qorVar != null) {
            qorVar.hnj(i10, i11);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hnj(int i10, String str) {
        this.f14029oj = i10;
        this.f14037xn = str;
    }
}
