package com.bytedance.sdk.openadsdk.core.gjv;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.ojm.apu;
import com.bytedance.sdk.openadsdk.core.ojm.xn;
import com.bytedance.sdk.openadsdk.core.ta;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.jbd;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.bytedance.sdk.openadsdk.utils.tgn;
import com.bytedance.sdk.openadsdk.utils.ua;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private final boolean aq;
    private dse bug;
    private final Context dkl;
    private apu dnm;
    private as gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected AdSlot f13748hn;
    protected gjv hnj;
    private boolean mjg;
    private boolean ojm;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private PAGBannerAdWrapperListener f13750sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor f13751ta;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private long f13752xn;
    private String qor = "banner_ad";
    private long dse = 0;
    private final AtomicBoolean orl = new AtomicBoolean(false);

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private final int f13747fc = 1;
    private final int jip = 0;
    private int uua = -1;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f13749oj = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.gjv.hnj.1
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (hnj.this.uua == 0 || hnj.this.ojm) {
                return;
            }
            hnj hnjVar = hnj.this;
            hnjVar.hnj(hnjVar.hnj.getCurView(), hnj.this.gjv);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (hnj.this.mjg) {
                hnj.this.uua = 0;
            } else {
                hnj.this.dkl();
            }
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.gjv.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class C0219hnj extends com.bytedance.sdk.component.aq.hn.qor {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        as f13759hn;
        boolean hnj;
        WeakReference<hnj> qor;

        C0219hnj(boolean z10, as asVar, hnj hnjVar) {
            super("ReportWindowFocusChangedAdShow");
            this.hnj = z10;
            this.f13759hn = asVar;
            this.qor = new WeakReference<>(hnjVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<hnj> weakReference = this.qor;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.qor.get().hn(this.hnj, this.f13759hn);
        }
    }

    public hnj(Context context, as asVar, AdSlot adSlot, dse dseVar, boolean z10) {
        this.mjg = false;
        this.dkl = context;
        this.gjv = asVar;
        this.f13748hn = adSlot;
        this.bug = dseVar;
        this.mjg = z10;
        hnj(context, asVar, adSlot);
        this.aq = false;
        this.ojm = false;
    }

    private void bug() {
        this.gjv.hnj(SystemClock.elapsedRealtime());
        this.hnj.sk();
    }

    private dse.hnj dnm() {
        return new dse.hnj() { // from class: com.bytedance.sdk.openadsdk.core.gjv.hnj.7
            @Override // com.bytedance.sdk.openadsdk.core.gjv.dse.hnj
            public void hnj() {
                int width = hnj.this.dnm.getWidth();
                int height = hnj.this.dnm.getHeight();
                View viewHnj = hnj(((double) height) >= Math.floor((((double) width) * 450.0d) / 600.0d));
                hnj.this.dnm.wu();
                hnj.this.dnm.removeAllViews();
                hnj.this.dnm.addView(viewHnj, new ViewGroup.LayoutParams(width, height));
                hnj.this.dnm.setClickCreativeListener(null);
                hnj.this.dnm.setClickListener(null);
                if (hnj.this.f13750sk != null) {
                    hnj.this.f13750sk.onAdDismissed();
                }
                hnj.this.ojm = true;
            }

            private View hnj(boolean z10) {
                com.bytedance.sdk.openadsdk.core.dkl.qor qorVar = new com.bytedance.sdk.openadsdk.core.dkl.qor(hnj.this.dkl);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                qorVar.setBackgroundColor(-1);
                qorVar.setLayoutParams(layoutParams);
                View view = new View(hnj.this.dkl);
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                view.setAlpha(0.3f);
                view.setBackgroundColor(Color.parseColor("#F3F7F8"));
                qorVar.addView(view, layoutParams2);
                com.bytedance.sdk.openadsdk.core.dkl.qor qorVar2 = new com.bytedance.sdk.openadsdk.core.dkl.qor(hnj.this.dkl);
                ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                if (z10) {
                    qorVar2.setBackground(wu.qor(hnj.this.dkl, "tt_ad_closed_background_300_250"));
                } else {
                    qorVar2.setBackground(wu.qor(hnj.this.dkl, "tt_ad_closed_background_320_50"));
                }
                qorVar.addView(qorVar2, layoutParams3);
                PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(hnj.this.dkl, hnj.this.gjv);
                pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093739);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                if (z10) {
                    int iHn = sq.hn(hnj.this.dkl, 16.0f);
                    layoutParams4.width = sq.hn(hnj.this.dkl, 77.0f);
                    layoutParams4.height = sq.hn(hnj.this.dkl, 14.0f);
                    layoutParams4.leftMargin = iHn;
                    layoutParams4.topMargin = iHn;
                } else {
                    int iHn2 = sq.hn(hnj.this.dkl, 8.0f);
                    layoutParams4.width = sq.hn(hnj.this.dkl, 45.0f);
                    layoutParams4.height = sq.hn(hnj.this.dkl, 8.18f);
                    layoutParams4.leftMargin = iHn2;
                    layoutParams4.topMargin = iHn2;
                }
                qorVar2.addView(pAGLogoViewCreatePAGLogoViewByMaterial, layoutParams4);
                com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(hnj.this.dkl);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 17;
                aqVar.setAlpha(0.5f);
                aqVar.setLines(1);
                aqVar.setText(wu.hnj(hnj.this.dkl, "tt_ad_is_closed"));
                if (z10) {
                    aqVar.setTextSize(18.0f);
                } else {
                    aqVar.setTextSize(12.0f);
                }
                qorVar2.addView(aqVar, layoutParams5);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.gjv.hnj.7.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.hnj(hnj.this.dkl, hnj.this.gjv, hnj.this.qor);
                    }
                };
                pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(onClickListener);
                aqVar.setOnClickListener(onClickListener);
                return qorVar;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ta() {
        bug();
    }

    public void aq() {
        gjv gjvVar = this.hnj;
        if (gjvVar instanceof qor) {
            ((qor) gjvVar).hn();
        }
    }

    public void dkl() {
        this.uua = 1;
        this.hnj.gjv();
    }

    public void dse() {
        if (this.hnj != null) {
            try {
                dkl();
                this.hnj.removeOnAttachStateChangeListener(this.f13749oj);
            } catch (Throwable unused) {
            }
        }
    }

    public void gjv() {
        hn(this.gjv);
        this.dse = 0L;
    }

    public void ojm() {
        gjv gjvVar = this.hnj;
        if (gjvVar instanceof qor) {
            ((qor) gjvVar).hnj();
        }
    }

    public com.bytedance.sdk.openadsdk.xn.qor.hnj qor() {
        gjv gjvVar = this.hnj;
        if (gjvVar instanceof qor) {
            return ((qor) gjvVar).getVideoModel();
        }
        return null;
    }

    public void sk() {
        this.dse = System.currentTimeMillis();
    }

    public boolean hn() {
        return this.hnj instanceof qor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(boolean z10, as asVar) {
        try {
            if (z10) {
                this.dse = System.currentTimeMillis();
            } else {
                if (this.dse <= 0 || this.dnm == null) {
                    return;
                }
                String strValueOf = String.valueOf(System.currentTimeMillis() - this.dse);
                this.dse = 0L;
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(strValueOf, asVar, this.qor, this.dnm.getAdShowTime());
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.apu.qor("PAGBannerAdImpl", e10.getMessage());
        }
    }

    public void hnj(int i10) {
        gjv gjvVar = this.hnj;
        if (gjvVar != null) {
            gjvVar.setCurrentIndex(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(as asVar) {
        if (this.dse <= 0 || asVar == null) {
            return;
        }
        try {
            if (this.dnm != null) {
                String strValueOf = String.valueOf(System.currentTimeMillis() - this.dse);
                this.dse = 0L;
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(strValueOf, asVar, this.qor, this.dnm.getAdShowTime());
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.apu.qor("PAGBannerAdImpl", e10.getMessage());
        }
    }

    public void hnj(PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        aq aqVar = new aq(pAGBannerAdInteractionCallback);
        this.f13750sk = aqVar;
        this.hnj.setExpressInteractionListener(aqVar);
    }

    public void hnj(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        aq aqVar = new aq(pAGBannerAdInteractionListener);
        this.f13750sk = aqVar;
        this.hnj.setExpressInteractionListener(aqVar);
    }

    public View hnj() {
        com.bytedance.sdk.openadsdk.utils.hn.hnj(this.gjv);
        IPBroadcastReceiver.hn(this.dkl, this.gjv);
        return this.hnj;
    }

    private void hnj(Context context, as asVar, AdSlot adSlot) {
        if (asVar.pwt() != null) {
            qor qorVar = new qor(context, asVar, adSlot, this.mjg);
            this.hnj = qorVar;
            qorVar.addOnAttachStateChangeListener(this.f13749oj);
        } else {
            gjv gjvVar = new gjv(context, asVar, adSlot, this.mjg);
            this.hnj = gjvVar;
            gjvVar.addOnAttachStateChangeListener(this.f13749oj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(boolean z10, as asVar) {
        if (z10 && this.gjv.tl() && !this.gjv.xyo()) {
            this.gjv.dse(true);
            as asVar2 = this.gjv;
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar2, this.qor, asVar2.mpa());
        }
        ua.hn(new C0219hnj(z10, asVar, this), 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(View view, apu apuVar, as asVar, String str, dse.hnj hnjVar) {
        ta.hn().hnj(str, hnjVar);
        this.dse = System.currentTimeMillis();
        try {
            JSONObject jSONObject = new JSONObject();
            if (apuVar != null) {
                jSONObject.put("dynamic_show_type", apuVar.getDynamicShowType());
                apuVar.hnj(jSONObject, asVar);
            }
            if (view != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("width", view.getWidth());
                    jSONObject2.put("height", view.getHeight());
                    jSONObject2.put("alpha", view.getAlpha());
                } catch (Throwable unused) {
                }
                jSONObject.put("root_view", jSONObject2.toString());
            }
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, this.qor, jSONObject, (JSONObject) null);
            com.bytedance.sdk.openadsdk.p000do.hnj.qor.hnj(asVar);
        } catch (JSONException unused2) {
            com.bytedance.sdk.component.utils.apu.qor("PAGBannerAdImpl", "onShowFun json error");
        }
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.f13750sk;
        if (pAGBannerAdWrapperListener != null) {
            pAGBannerAdWrapperListener.onAdShow(view, asVar.rg());
        }
        if (asVar.ll()) {
            orp.hnj(asVar, view);
        }
    }

    private com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor hnj(as asVar) {
        if (asVar.rg() == 4) {
            return com.bytedance.sdk.openadsdk.eum.hnj.hnj.gjv.hnj(this.dkl, this.qor);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(final apu apuVar, final as asVar) {
        hnj hnjVar;
        as asVar2;
        final apu apuVar2;
        com.bytedance.sdk.openadsdk.core.aq aqVar;
        if (apuVar == null || asVar == null) {
            return;
        }
        this.gjv = asVar;
        this.f13751ta = hnj(asVar);
        this.dnm = apuVar;
        final String strHnj = tgn.hnj();
        final dse.hnj hnjVarDnm = dnm();
        apuVar.setClosedListenerKey(strHnj);
        apuVar.setBannerClickClosedListener(hnjVarDnm);
        apuVar.setBackupListener(new com.bytedance.sdk.component.adexpress.hn.qor() { // from class: com.bytedance.sdk.openadsdk.core.gjv.hnj.2
            @Override // com.bytedance.sdk.component.adexpress.hn.qor
            public boolean hnj(ViewGroup viewGroup, int i10) {
                try {
                    apuVar.apu();
                    if (!hnj.this.gjv.qs()) {
                        hn hnVar = new hn(apuVar.getContext());
                        hnVar.setClosedListenerKey(strHnj);
                        hnVar.hnj(hnj.this.gjv, apuVar, hnj.this.f13751ta);
                        hnVar.setAdInteractionListener(hnj.this.f13750sk);
                        return true;
                    }
                    ojm ojmVar = new ojm(apuVar.getContext());
                    ojmVar.setClosedListenerKey(strHnj);
                    ojmVar.hnj(hnj.this.gjv, apuVar, hnj.this.f13751ta);
                    ojmVar.setAdInteractionListener(hnj.this.f13750sk);
                    apuVar.setVastVideoHelper(ojmVar);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
        if (!this.aq) {
            com.bytedance.sdk.openadsdk.core.aq aqVarHnj = hnj(apuVar);
            if (aqVarHnj == null) {
                aqVarHnj = new com.bytedance.sdk.openadsdk.core.aq(this.dkl, apuVar, this.bug.hnj());
                apuVar.addView(aqVarHnj);
            }
            aqVarHnj.setAdType(1);
            apuVar2 = apuVar;
            aqVarHnj.setCallback(new com.bytedance.sdk.openadsdk.core.aq.hnj() { // from class: com.bytedance.sdk.openadsdk.core.gjv.hnj.3
                @Override // com.bytedance.sdk.openadsdk.core.aq.hnj
                public void hn() {
                    hnj hnjVar2 = hnj.this;
                    hnjVar2.hn(hnjVar2.gjv);
                }

                @Override // com.bytedance.sdk.openadsdk.core.aq.hnj
                public void hnj(boolean z10) {
                    hnj.this.hnj(z10, asVar);
                }

                @Override // com.bytedance.sdk.openadsdk.core.aq.hnj
                public void hnj() {
                    if (hnj.this.uua != 0) {
                        hnj.this.ta();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.aq.hnj
                public void hnj(View view) {
                    if (hnj.this.orl.compareAndSet(false, true)) {
                        hnj.this.hnj(view, apuVar2, asVar, strHnj, hnjVarDnm);
                    }
                    gjv gjvVar = hnj.this.hnj;
                    if (gjvVar == null || gjvVar.getCurView() == null) {
                        return;
                    }
                    hnj.this.hnj.getCurView().ta();
                    hnj.this.hnj.getCurView().oj();
                    hnj.this.hnj.setIsShow(true);
                }
            });
            aqVar = aqVarHnj;
            hnjVar = this;
            asVar2 = asVar;
        } else {
            boolean zHnj = this.bug.hnj();
            jbd.hn hnVar = new jbd.hn() { // from class: com.bytedance.sdk.openadsdk.core.gjv.hnj.4
                @Override // com.bytedance.sdk.openadsdk.utils.jbd.hn
                public void hn() {
                    hnj hnjVar2 = hnj.this;
                    hnjVar2.hn(hnjVar2.gjv);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.jbd.hn
                public void hnj(boolean z10) {
                    hnj.this.hnj(z10, asVar);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.jbd.hn
                public void hnj() {
                    if (hnj.this.uua != 0) {
                        hnj.this.ta();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.utils.jbd.hn
                public void hnj(View view, boolean z10) {
                    if (!z10) {
                        com.bytedance.sdk.openadsdk.p000do.hnj.qor.hnj(hnj.this.gjv, 8);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.p000do.hnj.qor.hnj(hnj.this.gjv, 4);
                    if (hnj.this.orl.compareAndSet(false, true)) {
                        hnj.this.hnj(view, apuVar, asVar, strHnj, hnjVarDnm);
                    }
                    gjv gjvVar = hnj.this.hnj;
                    if (gjvVar == null || gjvVar.getCurView() == null) {
                        return;
                    }
                    hnj.this.hnj.getCurView().ta();
                    hnj.this.hnj.getCurView().oj();
                    hnj.this.hnj.setIsShow(true);
                }
            };
            hnjVar = this;
            asVar2 = asVar;
            jbd.hnj(apuVar, true, 1, zHnj, hnVar, null);
            apuVar2 = apuVar;
            aqVar = null;
        }
        Context contextHnj = com.bytedance.sdk.component.utils.hn.hnj(apuVar2);
        if (contextHnj == null) {
            contextHnj = hnjVar.dkl;
        }
        com.bytedance.sdk.openadsdk.core.ojm.ojm ojmVar = new com.bytedance.sdk.openadsdk.core.ojm.ojm(contextHnj, asVar2, hnjVar.qor, 2);
        ojmVar.hn(apuVar2);
        ojmVar.hnj(this);
        ojmVar.hnj(hnjVar.f13751ta);
        ojmVar.hnj(new com.bytedance.sdk.openadsdk.core.qor.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.core.gjv.hnj.5
            @Override // com.bytedance.sdk.openadsdk.core.qor.hn.hnj
            public void hnj(View view, int i10) {
                if (hnj.this.f13750sk != null) {
                    hnj.this.f13750sk.onAdClicked();
                }
            }
        });
        apuVar2.setClickListener(ojmVar);
        com.bytedance.sdk.openadsdk.core.ojm.aq aqVar2 = new com.bytedance.sdk.openadsdk.core.ojm.aq(hnjVar.dkl, asVar2, hnjVar.qor, 2);
        aqVar2.hn(apuVar2);
        aqVar2.hnj(this);
        aqVar2.hnj(new com.bytedance.sdk.openadsdk.core.qor.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.core.gjv.hnj.6
            @Override // com.bytedance.sdk.openadsdk.core.qor.hn.hnj
            public void hnj(View view, int i10) {
                if (hnj.this.f13750sk != null) {
                    hnj.this.f13750sk.onAdClicked();
                }
            }
        });
        apu apuVar3 = hnjVar.dnm;
        if (apuVar3 instanceof xn) {
            aqVar2.hnj(((xn) apuVar3).getVideoController());
        }
        aqVar2.hnj(hnjVar.f13751ta);
        apuVar2.setClickCreativeListener(aqVar2);
        if (hnjVar.aq) {
            return;
        }
        aqVar.setNeedCheckingShow(true);
    }

    private com.bytedance.sdk.openadsdk.core.aq hnj(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            try {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof com.bytedance.sdk.openadsdk.core.aq) {
                    return (com.bytedance.sdk.openadsdk.core.aq) childAt;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void hnj(final com.bytedance.sdk.openadsdk.hnj.hnj.hn hnVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f13752xn > 500) {
            this.f13752xn = jCurrentTimeMillis;
            gjv gjvVar = this.hnj;
            if (gjvVar instanceof qor) {
                gjvVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gjv.hnj.8
                    @Override // java.lang.Runnable
                    public void run() {
                        ((qor) hnj.this.hnj).hnj(hnVar);
                    }
                }, 500L);
            }
        }
    }
}
