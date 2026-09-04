package com.bytedance.sdk.openadsdk.core.gjv;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.jip;
import com.bytedance.sdk.openadsdk.core.ojm.apu;
import com.bytedance.sdk.openadsdk.core.ojm.oj;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.bug;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import x6.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm extends com.bytedance.sdk.openadsdk.core.ojm.hnj implements c.a, c.d {
    private apu bug;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private String f13760fc;
    public boolean hnj;
    private long jip;
    private com.bytedance.sdk.openadsdk.core.mjg.hn.dkl mjg;
    private com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor orl;
    private PAGBannerAdWrapperListener uua;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj {
        public PAGLogoView gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public bug f13761hn;
        public FrameLayout hnj;
        public com.bytedance.sdk.openadsdk.core.dkl.gjv qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        public com.bytedance.sdk.openadsdk.core.dkl.gjv f13762sk;

        private hnj() {
        }
    }

    public ojm(Context context) {
        super(context);
        this.hnj = true;
        this.f14061hn = context;
    }

    private void sk() {
        oj ojVarHnj = hn.hnj(this.bug.getExpectExpressWidth(), this.bug.getExpectExpressHeight());
        if (this.bug.getExpectExpressWidth() <= 0 || this.bug.getExpectExpressHeight() <= 0) {
            int iQor = sq.qor(this.f14061hn);
            this.dse = iQor;
            this.aq = Float.valueOf(iQor / ojVarHnj.f14065hn).intValue();
        } else {
            this.dse = sq.hn(this.f14061hn, this.bug.getExpectExpressWidth());
            this.aq = sq.hn(this.f14061hn, this.bug.getExpectExpressHeight());
        }
        int i10 = this.dse;
        if (i10 > 0 && i10 > sq.qor(this.f14061hn)) {
            float fQor = sq.qor(this.f14061hn) / this.dse;
            this.dse = sq.qor(this.f14061hn);
            this.aq = Float.valueOf(this.aq * fQor).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.dse, this.aq);
        }
        layoutParams.width = this.dse;
        layoutParams.height = this.aq;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        hnj(ojVarHnj);
    }

    public long getVideoProgress() {
        return this.jip;
    }

    @Override // x6.c.a
    public void hnj(int i10, int i11) {
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.uua = pAGBannerAdWrapperListener;
    }

    public void setClosedListenerKey(String str) {
        this.f13760fc = str;
    }

    private hnj hn(oj ojVar) {
        hnj hnjVar = new hnj();
        hnjVar.hnj = new FrameLayout(this.f14061hn);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        layoutParams.width = -1;
        layoutParams.height = -1;
        hnjVar.hnj.setLayoutParams(layoutParams);
        hnjVar.f13761hn = new bug(this.f14061hn);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        hnjVar.f13761hn.setLayoutParams(layoutParams2);
        hnjVar.hnj.addView(hnjVar.f13761hn);
        int iHn = sq.hn(this.f14061hn, 5.0f);
        if (ojVar == null || ojVar.hnj != 1) {
            hnjVar.qor = com.bytedance.sdk.openadsdk.core.widget.dkl.hn(getContext());
        } else {
            hnjVar.qor = com.bytedance.sdk.openadsdk.core.widget.dkl.hnj(getContext());
        }
        hnjVar.qor.setId(520093697);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388613;
        layoutParams3.setMargins(iHn, iHn, iHn, iHn);
        hnjVar.qor.setLayoutParams(layoutParams3);
        hnjVar.hnj.addView(hnjVar.qor);
        hnjVar.gjv = PAGLogoView.createPAGLogoViewByMaterial(this.f14061hn, this.qor);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 8388691;
        layoutParams4.setMargins(iHn, iHn, iHn, iHn);
        hnjVar.gjv.setLayoutParams(layoutParams4);
        hnjVar.hnj.addView(hnjVar.gjv);
        hnjVar.f13762sk = new com.bytedance.sdk.openadsdk.core.dkl.gjv(this.f14061hn);
        int iHn2 = sq.hn(this.f14061hn, 11.0f);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iHn2, iHn2);
        layoutParams5.gravity = 8388693;
        layoutParams5.rightMargin = iHn;
        layoutParams5.bottomMargin = iHn;
        hnjVar.f13762sk.setVisibility(8);
        hnjVar.f13762sk.setScaleType(ImageView.ScaleType.FIT_CENTER);
        hnjVar.f13762sk.setLayoutParams(layoutParams5);
        hnjVar.hnj.addView(hnjVar.f13762sk);
        return hnjVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.hnj
    protected void hnj(View view, int i10, jip jipVar) {
        apu apuVar = this.bug;
        if (apuVar != null) {
            apuVar.hnj(view, i10, jipVar);
            com.bytedance.sdk.openadsdk.core.mjg.hn.dkl dklVar = this.mjg;
            if (dklVar == null || dklVar.getNativeVideoController() == null) {
                return;
            }
            this.mjg.getNativeVideoController().fvt();
        }
    }

    public void hnj(as asVar, apu apuVar, com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor qorVar) {
        setBackgroundColor(-16777216);
        this.qor = asVar;
        this.bug = apuVar;
        this.orl = qorVar;
        this.dkl = "banner_ad";
        apuVar.addView(this, new ViewGroup.LayoutParams(-2, -2));
        sk();
    }

    private void hnj(oj ojVar) {
        View view;
        as asVar = this.qor;
        if (asVar != null) {
            int iQri = asVar.qri();
            hnj hnjVarHn = hn(ojVar);
            if (hnjVarHn == null || (view = hnjVarHn.hnj) == null) {
                return;
            }
            addView(view);
            com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar = hnjVarHn.qor;
            PAGLogoView pAGLogoView = hnjVarHn.gjv;
            com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar2 = hnjVarHn.f13762sk;
            if (gjvVar2 != null && this.qor.as()) {
                sq.hnj((View) gjvVar2, 0);
                com.bytedance.sdk.openadsdk.apu.hn.hn().hnj((int) sq.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj(), 11.0f, true), gjvVar2, this.qor);
            }
            com.bytedance.sdk.openadsdk.core.mjg.hn.dkl videoView = getVideoView();
            if (videoView != null) {
                this.mjg = videoView;
                videoView.setVideoAdLoadListener(this);
                this.mjg.setVideoAdInteractionListener(this);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair(gjvVar, FriendlyObstructionPurpose.CLOSE_AD));
                FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                arrayList.add(new Pair(pAGLogoView, friendlyObstructionPurpose));
                arrayList.add(new Pair(gjvVar2, friendlyObstructionPurpose));
                this.mjg.hnj(arrayList);
                this.mjg.setAdCreativeClickListener(new com.bytedance.sdk.openadsdk.core.mjg.hn.dkl.hnj() { // from class: com.bytedance.sdk.openadsdk.core.gjv.ojm.1
                    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.dkl.hnj
                    public void hnj(View view2, int i10) {
                        if (ojm.this.uua != null) {
                            ojm.this.uua.onAdClicked();
                        }
                    }
                });
            }
            if (pAGLogoView != null) {
                pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.gjv.ojm.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.hnj(((com.bytedance.sdk.openadsdk.core.ojm.hnj) ojm.this).f14061hn, ((com.bytedance.sdk.openadsdk.core.ojm.hnj) ojm.this).qor, ((com.bytedance.sdk.openadsdk.core.ojm.hnj) ojm.this).dkl);
                    }
                });
            }
            if (gjvVar != null) {
                gjvVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.gjv.ojm.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        ojm.this.hnj();
                    }
                });
            }
            bug bugVar = hnjVarHn.f13761hn;
            as asVar2 = this.qor;
            if (asVar2 != null && asVar2.mzt() != null && bugVar != null) {
                int iTa = this.qor.mzt().ta();
                float fDnm = this.qor.mzt().dnm();
                if (iTa > 0 && fDnm > 0.0f) {
                    bugVar.setRatio(iTa / fDnm);
                } else if (iQri == 15) {
                    bugVar.setRatio(0.5625f);
                } else if (iQri == 5) {
                    bugVar.setRatio(1.7777778f);
                } else {
                    bugVar.setRatio(1.0f);
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (videoView != null && bugVar != null) {
                bugVar.addView(videoView, layoutParams);
                videoView.setTag(520093762, Boolean.TRUE);
            }
            hnj((View) videoView, true);
            hnj((View) this, true);
            hnj(bugVar);
        }
    }

    @Override // x6.c.d
    public void g_() {
    }

    @Override // x6.c.d
    public void h_() {
    }

    @Override // x6.c.d
    public void i_() {
    }

    @Override // x6.c.d
    public void j_() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.hnj
    public void hnj() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f14062sk;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.qor.qor qorVar = this.gjv;
        if (qorVar != null) {
            qorVar.hnj();
        } else {
            TTDelegateActivity.hnj(this.qor, this.f13760fc);
        }
    }

    @Override // x6.c.d
    public void hnj(long j10, long j11) {
        this.jip = j10;
    }
}
