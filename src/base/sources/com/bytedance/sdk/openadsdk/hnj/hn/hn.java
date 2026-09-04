package com.bytedance.sdk.openadsdk.hnj.hn;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.uua;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.List;
import x6.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends aq implements c.a, c.d, com.bytedance.sdk.openadsdk.xn.qor.hnj.InterfaceC0258hnj {
    private qor aq;
    private AdSlot bug;
    private boolean dnm;
    private final com.bytedance.sdk.openadsdk.xn.qor.hnj ojm;
    private long orl;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private boolean f14510ta;

    public hn(Context context, as asVar, int i10, AdSlot adSlot) {
        super(context, asVar, i10, true);
        this.f14510ta = false;
        this.dnm = true;
        this.f14507sk = i10;
        this.bug = adSlot;
        this.ojm = new com.bytedance.sdk.openadsdk.xn.qor.hnj();
        hnj(this.dkl);
        hnj("embeded_ad");
        this.gjv.hnj(this);
    }

    @Override // com.bytedance.sdk.openadsdk.xn.qor.hnj.InterfaceC0258hnj
    public com.bytedance.sdk.openadsdk.xn.qor.hnj dkl() {
        return this.ojm;
    }

    @Override // x6.c.d
    public void g_() {
        qor qorVar = this.aq;
        if (qorVar != null) {
            qorVar.hnj(this);
        }
    }

    @Override // x6.c.d
    public void h_() {
        qor qorVar = this.aq;
        if (qorVar != null) {
            qorVar.hn(this);
        }
    }

    @Override // x6.c.d
    public void j_() {
        qor qorVar = this.aq;
        if (qorVar != null) {
            qorVar.qor(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.hnj.hn.aq, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
        hnj hnjVar = this.gjv;
        if (hnjVar != null) {
            hnjVar.bug();
        }
    }

    public View sk() {
        com.bytedance.sdk.openadsdk.core.mjg.hn.dkl dklVar;
        as asVar = this.f14506hn;
        if (asVar != null && this.qor != null) {
            if (as.sk(asVar)) {
                try {
                    dklVar = new com.bytedance.sdk.openadsdk.core.mjg.hn.dkl(this.qor, this.f14506hn, this.hnj.hnj());
                    as asVar2 = this.f14506hn;
                    if (asVar2 != null && asVar2.qs()) {
                        com.bytedance.sdk.openadsdk.core.orl.dkl dklVarHnj = dklVar.hnj((List<Pair<View, FriendlyObstructionPurpose>>) null);
                        hnj hnjVar = this.gjv;
                        if (hnjVar != null) {
                            hnjVar.hnj(dklVarHnj);
                        }
                    }
                    this.hnj.hnj(dklVar.getNativeVideoController());
                    hnj hnjVar2 = this.gjv;
                    if (hnjVar2 != null) {
                        hnjVar2.hnj(dklVar);
                    }
                    dklVar.setVideoAdClickListenerTTNativeAd(this);
                    dklVar.setAdCreativeClickListener(new com.bytedance.sdk.openadsdk.core.mjg.hn.dkl.hnj() { // from class: com.bytedance.sdk.openadsdk.hnj.hn.hn.1
                        @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.dkl.hnj
                        public void hnj(View view, int i10) {
                            uua uuaVar = hn.this.hnj;
                            if (uuaVar != null) {
                                uuaVar.hnj(view, i10);
                            }
                        }
                    });
                    dklVar.setControllerStatusCallBack(new com.bytedance.sdk.openadsdk.core.mjg.hn.dkl.hn() { // from class: com.bytedance.sdk.openadsdk.hnj.hn.hn.2
                        @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.dkl.hn
                        public void hnj(boolean z10, long j10, long j11, long j12, boolean z11) {
                            hn.this.ojm.hnj = z10;
                            hn.this.ojm.f14813sk = j10;
                            hn.this.ojm.dkl = j11;
                            hn.this.ojm.dse = j12;
                            hn.this.ojm.gjv = z11;
                        }
                    });
                    dklVar.setVideoAdLoadListener(this);
                    dklVar.setVideoAdInteractionListener(this);
                    if (5 == this.f14507sk) {
                        dklVar.setIsAutoPlay(this.f14510ta ? this.bug.isAutoPlay() : this.dnm);
                    } else {
                        dklVar.setIsAutoPlay(this.dnm);
                    }
                    dklVar.hnj(oj.gjv().qor(String.valueOf(this.dkl)), "feedGetAdView");
                } catch (Exception e10) {
                    ApmHelper.reportCustomError("", "getAdView null", e10);
                    dklVar = null;
                }
            } else {
                dklVar = null;
            }
            if (as.sk(this.f14506hn) && dklVar != null && dklVar.hnj(0L, true, false)) {
                return dklVar;
            }
            ApmHelper.reportCustomError(this.f14506hn.qri() + "," + dklVar, "getAdView null", new RuntimeException());
        }
        return null;
    }

    private void hnj(int i10) {
        int iHn = oj.gjv().hn(i10);
        int iQor = com.bytedance.sdk.component.utils.oj.qor(oj.hnj());
        if (3 == iHn) {
            this.f14510ta = false;
            this.dnm = false;
        } else {
            if (1 == iHn && orp.gjv(iQor)) {
                this.f14510ta = false;
            } else if (2 == iHn) {
                if (orp.sk(iQor) || orp.gjv(iQor) || orp.dkl(iQor)) {
                    this.f14510ta = false;
                }
            } else if (4 == iHn) {
                this.f14510ta = true;
            } else if (5 == iHn && (orp.gjv(iQor) || orp.dkl(iQor))) {
            }
            this.dnm = true;
        }
        hnj hnjVar = this.gjv;
        if (hnjVar != null) {
            hnjVar.hnj(this.f14510ta);
        }
    }

    public hn(Context context, as asVar, int i10, AdSlot adSlot, hnj hnjVar, uua uuaVar) {
        super(context, asVar, i10, false);
        this.f14510ta = false;
        this.dnm = true;
        this.gjv = hnjVar;
        this.hnj = uuaVar;
        this.f14507sk = i10;
        this.bug = adSlot;
        this.ojm = new com.bytedance.sdk.openadsdk.xn.qor.hnj();
        hnj(this.dkl);
        hnj("embeded_ad");
        hnjVar.hnj(this);
    }

    public void hnj(qor qorVar) {
        this.aq = qorVar;
    }

    @Override // x6.c.a
    public void hnj(int i10, int i11) {
        qor qorVar = this.aq;
        if (qorVar != null) {
            qorVar.hnj(i10, i11);
        }
    }

    @Override // x6.c.d
    public void hnj(long j10, long j11) {
        this.orl = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.hnj.hn.aq
    protected void hnj(String str) {
        super.hnj(str);
    }

    @Override // x6.c.d
    public void i_() {
    }
}
