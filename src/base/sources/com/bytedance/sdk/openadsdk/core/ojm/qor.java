package com.bytedance.sdk.openadsdk.core.ojm;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.nyv;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    private ScheduledFuture<?> aq;
    private int dkl;
    private int dse;
    private com.bytedance.sdk.component.adexpress.hn.fc gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Context f14069hn;
    com.bytedance.sdk.openadsdk.core.model.as hnj;
    private int ojm;
    private hnj qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private apu f14070sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hn implements Runnable {
        InterfaceC0227qor hnj;

        public hn(InterfaceC0227qor interfaceC0227qor) {
            this.hnj = interfaceC0227qor;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC0227qor interfaceC0227qor = this.hnj;
            if (interfaceC0227qor != null) {
                interfaceC0227qor.hnj(107, 107);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj implements com.bytedance.sdk.component.adexpress.hn.gjv<View>, sk.hn {
        private FrameLayout aq;
        private sk bug;
        private final int dkl;
        private String dnm;
        private final int dse;

        /* JADX INFO: renamed from: fc, reason: collision with root package name */
        private PAGExpressAdWrapperListener f14071fc;
        private String gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private com.bytedance.sdk.openadsdk.qor.qor f14072hn;
        AtomicBoolean hnj = new AtomicBoolean(false);
        private com.bytedance.sdk.component.adexpress.hn.dse mjg;
        private com.bytedance.sdk.openadsdk.core.model.as ojm;
        private int orl;
        private TTDislikeDialogAbstract qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private final Context f14073sk;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        private final int f14074ta;

        public hnj(Context context, com.bytedance.sdk.openadsdk.core.model.as asVar, int i10, int i11, String str, int i12) {
            this.dnm = str;
            if (asVar != null && asVar.ouk()) {
                this.dnm = "fullscreen_interstitial_ad";
            }
            this.f14073sk = context;
            this.dkl = i10;
            this.dse = i11;
            this.ojm = asVar;
            this.f14074ta = sq.hn(context, 3.0f);
            this.orl = i12;
            dkl();
        }

        private sk aq() {
            sk skVarHn = gjv.hnj().hn();
            this.bug = skVarHn;
            if (skVarHn == null) {
                this.bug = new sk(this.f14073sk);
            }
            gjv.hnj().qor(this.bug);
            this.bug.hnj(this.ojm, this, this.dnm);
            this.bug.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this.bug;
        }

        private void dkl() {
            FrameLayout frameLayout = new FrameLayout(this.f14073sk);
            this.aq = frameLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(this.dkl, this.dse);
            }
            layoutParams.width = this.dkl;
            layoutParams.height = this.dse;
            layoutParams.gravity = 17;
            this.aq.setLayoutParams(layoutParams);
            sk skVarAq = aq();
            this.aq.addView(skVarAq);
            View viewDse = dse();
            this.aq.addView(viewDse);
            com.bytedance.sdk.openadsdk.core.model.as asVar = this.ojm;
            if (asVar != null && asVar.ouk()) {
                skVarAq.setBackgroundColor(-16777216);
                skVarAq.hnj(((Activity) this.f14073sk).findViewById(com.bytedance.sdk.openadsdk.utils.jip.qs), FriendlyObstructionPurpose.OTHER);
            }
            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
            skVarAq.hnj(viewDse, friendlyObstructionPurpose);
            Context context = this.f14073sk;
            if (context == null || !(context instanceof Activity)) {
                return;
            }
            View viewFindViewById = ((Activity) context).findViewById(com.bytedance.sdk.openadsdk.utils.jip.sz);
            if (viewFindViewById != null) {
                skVarAq.hnj(viewFindViewById, friendlyObstructionPurpose);
            }
            View viewFindViewById2 = ((Activity) this.f14073sk).findViewById(com.bytedance.sdk.openadsdk.utils.jip.ajq);
            if (viewFindViewById2 != null) {
                skVarAq.hnj(viewFindViewById2, friendlyObstructionPurpose);
            }
        }

        private View dse() {
            PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.f14073sk, this.ojm);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            com.bytedance.sdk.openadsdk.core.model.as asVar = this.ojm;
            if (asVar == null || !asVar.ouk()) {
                int i10 = this.f14074ta;
                layoutParams.topMargin = i10;
                layoutParams.leftMargin = i10;
            } else {
                layoutParams.leftMargin = sq.hn(this.f14073sk, 20.0f);
                layoutParams.bottomMargin = sq.hn(this.f14073sk, 20.0f);
                layoutParams.gravity = 8388691;
            }
            pAGLogoViewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams);
            pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.ojm.qor.hnj.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTWebsiteActivity.hnj(hnj.this.f14073sk, hnj.this.ojm, hnj.this.dnm);
                }
            });
            return pAGLogoViewCreatePAGLogoViewByMaterial;
        }

        @Override // com.bytedance.sdk.component.adexpress.hn.gjv
        public int qor() {
            return 5;
        }

        @Override // com.bytedance.sdk.component.adexpress.hn.gjv
        public View sk() {
            return this.aq;
        }

        public void gjv() {
            this.aq = null;
            this.f14072hn = null;
            this.qor = null;
            this.mjg = null;
            this.ojm = null;
            sk skVar = this.bug;
            if (skVar != null) {
                skVar.jip();
                gjv.hnj().hnj(this.bug);
            }
            this.hnj.set(true);
        }

        @Override // com.bytedance.sdk.openadsdk.core.ojm.sk.hn
        public void hn() {
            if (this.mjg != null) {
                com.bytedance.sdk.component.adexpress.hn.mjg mjgVar = new com.bytedance.sdk.component.adexpress.hn.mjg();
                mjgVar.hnj(true);
                mjgVar.hnj(sq.qor(this.f14073sk, this.dkl));
                mjgVar.hn(sq.qor(this.f14073sk, this.dse));
                this.mjg.hnj(this.aq, mjgVar);
            }
        }

        @Override // com.bytedance.sdk.component.adexpress.hn.gjv
        public void hnj(com.bytedance.sdk.component.adexpress.hn.dse dseVar) {
            com.bytedance.sdk.openadsdk.core.model.as asVar;
            if (this.hnj.get()) {
                return;
            }
            if (this.f14073sk == null || (asVar = this.ojm) == null) {
                dseVar.hnj(106, "material null");
                return;
            }
            this.mjg = dseVar;
            if (TextUtils.isEmpty(asVar.cbn())) {
                dseVar.hnj(106, "dsp data is null");
            } else {
                this.bug.apu();
            }
        }

        public void hnj(nyv nyvVar) {
            if (nyvVar instanceof com.bytedance.sdk.openadsdk.qor.qor) {
                this.f14072hn = (com.bytedance.sdk.openadsdk.qor.qor) nyvVar;
            }
        }

        public void hnj(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
            com.bytedance.sdk.openadsdk.core.model.as asVar;
            if (tTDislikeDialogAbstract != null && (asVar = this.ojm) != null) {
                tTDislikeDialogAbstract.setMaterialMeta(asVar.ldn(), this.ojm.yl());
            }
            this.qor = tTDislikeDialogAbstract;
        }

        public void hnj(String str) {
            this.gjv = str;
        }

        @Override // com.bytedance.sdk.openadsdk.core.ojm.sk.hn
        public View hnj() {
            FrameLayout frameLayout = this.aq;
            if (frameLayout == null) {
                return null;
            }
            return (View) frameLayout.getParent();
        }

        @Override // com.bytedance.sdk.openadsdk.core.ojm.sk.hn
        public void hnj(View view, int i10) {
            PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.f14071fc;
            if (pAGExpressAdWrapperListener != null) {
                pAGExpressAdWrapperListener.onAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.ojm.sk.hn
        public void hnj(int i10, int i11) {
            com.bytedance.sdk.component.adexpress.hn.dse dseVar = this.mjg;
            if (dseVar != null) {
                dseVar.hnj(i10, "render fail");
            }
        }

        public void hnj(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
            this.f14071fc = pAGExpressAdWrapperListener;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ojm.qor$qor, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface InterfaceC0227qor {
        void hn(String str);

        void hnj();

        void hnj(int i10, int i11);

        void hnj(String str);
    }

    public qor(Context context, apu apuVar, com.bytedance.sdk.openadsdk.core.model.as asVar, String str) {
        this.hnj = asVar;
        this.f14069hn = context;
        this.f14070sk = apuVar;
        hnj(apuVar);
        this.qor = new hnj(context, asVar, this.dkl, this.dse, str, this.ojm);
    }

    private void hnj(apu apuVar) {
        com.bytedance.sdk.openadsdk.core.model.as asVar = this.hnj;
        if (asVar != null && asVar.ouk()) {
            this.dkl = -1;
            this.dse = -1;
            return;
        }
        oj ojVarHnj = com.bytedance.sdk.openadsdk.core.gjv.hn.hnj(apuVar.getExpectExpressWidth(), apuVar.getExpectExpressHeight());
        this.ojm = ojVarHnj.hnj;
        if (apuVar.getExpectExpressWidth() <= 0 || apuVar.getExpectExpressHeight() <= 0) {
            int iQor = sq.qor(this.f14069hn);
            this.dkl = iQor;
            this.dse = Float.valueOf(iQor / ojVarHnj.f14065hn).intValue();
        } else {
            this.dkl = sq.hn(this.f14069hn, apuVar.getExpectExpressWidth());
            this.dse = sq.hn(this.f14069hn, apuVar.getExpectExpressHeight());
        }
        int i10 = this.dkl;
        if (i10 <= 0 || i10 <= sq.qor(this.f14069hn)) {
            return;
        }
        float fQor = sq.qor(this.f14069hn) / this.dkl;
        this.dkl = sq.qor(this.f14069hn);
        this.dse = Float.valueOf(this.dse * fQor).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qor() {
        try {
            ScheduledFuture<?> scheduledFuture = this.aq;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.aq.cancel(false);
            this.aq = null;
        } catch (Throwable unused) {
        }
    }

    public void hn() {
        hnj hnjVar = this.qor;
        if (hnjVar != null) {
            hnjVar.gjv();
            this.qor = null;
        }
        qor();
        this.gjv = null;
        this.f14070sk = null;
    }

    public void hnj(com.bytedance.sdk.component.adexpress.hn.fc fcVar) {
        this.gjv = fcVar;
    }

    public void hnj() {
        com.bytedance.sdk.openadsdk.core.model.as asVar = this.hnj;
        if (asVar != null && asVar.ouk()) {
            this.aq = ua.hnj().schedule(new hn(this.qor.bug), com.bytedance.sdk.openadsdk.core.oj.gjv().ua(), TimeUnit.MILLISECONDS);
        }
        hnj hnjVar = this.qor;
        if (hnjVar != null) {
            hnjVar.hnj(new com.bytedance.sdk.component.adexpress.hn.dse() { // from class: com.bytedance.sdk.openadsdk.core.ojm.qor.1
                @Override // com.bytedance.sdk.component.adexpress.hn.dse
                public void hnj(View view, com.bytedance.sdk.component.adexpress.hn.mjg mjgVar) {
                    if (qor.this.f14070sk == null || view == null) {
                        if (qor.this.gjv != null) {
                            qor.this.gjv.a_(106);
                        }
                    } else if (qor.this.gjv != null) {
                        qor.this.gjv.hnj(qor.this.qor, mjgVar);
                    }
                    qor.this.qor();
                }

                @Override // com.bytedance.sdk.component.adexpress.hn.dse
                public void hnj(int i10, String str) {
                    if (qor.this.gjv != null) {
                        qor.this.gjv.a_(106);
                    }
                    qor.this.qor();
                }
            });
            View viewSk = this.qor.sk();
            this.f14070sk.removeView(viewSk);
            if (viewSk.getParent() != null) {
                ((ViewGroup) viewSk.getParent()).removeView(viewSk);
            }
            this.f14070sk.addView(viewSk, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        com.bytedance.sdk.component.adexpress.hn.fc fcVar = this.gjv;
        if (fcVar != null) {
            fcVar.a_(106);
        }
    }

    public void hnj(nyv nyvVar) {
        hnj hnjVar = this.qor;
        if (hnjVar != null) {
            hnjVar.hnj(nyvVar);
        }
    }

    public void hnj(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        hnj hnjVar = this.qor;
        if (hnjVar != null) {
            hnjVar.hnj(tTDislikeDialogAbstract);
        }
    }

    public void hnj(String str) {
        hnj hnjVar = this.qor;
        if (hnjVar != null) {
            hnjVar.hnj(str);
        }
    }

    public void hnj(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        hnj hnjVar = this.qor;
        if (hnjVar != null) {
            hnjVar.hnj(pAGExpressAdWrapperListener);
        }
    }
}
