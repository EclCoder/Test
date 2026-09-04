package com.bytedance.sdk.openadsdk.hnj.hn;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ojm.apu;
import com.bytedance.sdk.openadsdk.core.ojm.ojm;
import com.bytedance.sdk.openadsdk.core.ojm.xn;
import com.bytedance.sdk.openadsdk.core.settings.dnm;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.sq;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private PAGMediaView aq;
    private com.bytedance.sdk.openadsdk.core.qor.hn bug;
    private hn dkl;
    private com.bytedance.sdk.openadsdk.core.qor.hnj dnm;
    private com.bytedance.sdk.openadsdk.hnj.hn.hnj.qor dse;
    private boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Context f14511hn;
    protected final as hnj;
    private WeakReference<com.bytedance.sdk.openadsdk.core.orl.dkl> mjg;
    private apu ojm;
    private boolean orl = false;
    private final String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private WeakReference<com.bytedance.sdk.openadsdk.core.mjg.hn.dkl> f14512sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private PAGMediaView f14513ta;

    public hnj(Context context, as asVar, String str) {
        this.f14511hn = context;
        this.hnj = asVar;
        this.qor = str;
    }

    private PAGMediaView mjg() {
        if (!as.sk(this.hnj)) {
            com.bytedance.sdk.openadsdk.hnj.hn.hnj.qor qorVar = this.dse;
            if (qorVar == null) {
                return null;
            }
            apu apuVarGjv = qorVar.gjv();
            apuVarGjv.setTag(520093762, Boolean.TRUE);
            if (!this.orl) {
                this.dse.sk();
            }
            this.orl = true;
            return hnj(apuVarGjv);
        }
        com.bytedance.sdk.openadsdk.hnj.hn.hnj.qor qorVar2 = this.dse;
        if (qorVar2 == null || !(qorVar2 instanceof com.bytedance.sdk.openadsdk.hnj.hn.hnj.hn)) {
            return null;
        }
        xn xnVar = (xn) qorVar2.gjv();
        xnVar.setTag(520093762, Boolean.TRUE);
        if (!this.orl) {
            this.dse.sk();
        }
        this.orl = true;
        return hnj(xnVar);
    }

    public PAGMediaView aq() {
        return this.f14513ta;
    }

    public void bug() {
        Context context = this.f14511hn;
        if (context != null) {
            TTWebsiteActivity.hnj(context, this.hnj, this.qor);
        }
    }

    public String dkl() {
        as asVar = this.hnj;
        if (asVar != null) {
            return asVar.cq();
        }
        return null;
    }

    public View dnm() {
        as asVar;
        if (oj.hnj() == null || (asVar = this.hnj) == null || !asVar.qs() || !this.hnj.as()) {
            return null;
        }
        ImageView imageView = new ImageView(oj.hnj());
        com.bytedance.sdk.openadsdk.apu.hn.hn().hnj((int) sq.hnj(oj.hnj(), 14.0f, true), imageView, this.hnj);
        return imageView;
    }

    public PAGMediaView dse() {
        PAGMediaView pAGMediaViewOjm;
        com.bytedance.sdk.openadsdk.utils.hn.hnj(this.hnj);
        if (this.hnj.th() == 2) {
            pAGMediaViewOjm = mjg();
            hnj(pAGMediaViewOjm);
        } else {
            pAGMediaViewOjm = ojm();
        }
        if (pAGMediaViewOjm != null) {
            pAGMediaViewOjm.setMrcTrackerKey(com.bytedance.sdk.openadsdk.p000do.hn.sk.hn(this.hnj));
        } else {
            pAGMediaViewOjm = new PAGMediaView(this.f14511hn) { // from class: com.bytedance.sdk.openadsdk.hnj.hn.hnj.1
                @Override // android.view.ViewGroup, android.view.View
                protected void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    com.bytedance.sdk.openadsdk.utils.gjv.hnj(this, hnj.this.hnj);
                }
            };
        }
        if (pAGMediaViewOjm instanceof PAGVideoMediaView) {
            ((PAGVideoMediaView) pAGMediaViewOjm).setMaterialMeta(this.hnj);
        }
        this.f14513ta = pAGMediaViewOjm;
        return pAGMediaViewOjm;
    }

    public String gjv() {
        as asVar = this.hnj;
        if (asVar != null) {
            return hnj(asVar);
        }
        return null;
    }

    public apu hn() {
        return this.ojm;
    }

    public void hnj(hn hnVar) {
        this.dkl = hnVar;
    }

    public PAGMediaView ojm() {
        if (!as.sk(this.hnj)) {
            List<com.bytedance.sdk.openadsdk.core.model.oj> listLx = this.hnj.lx();
            if (listLx == null || listLx.isEmpty()) {
                ApmHelper.reportCustomError("images empty", "getMediaView return null", new RuntimeException());
                return null;
            }
            ImageView imageView = new ImageView(this.f14511hn);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            com.bytedance.sdk.openadsdk.core.model.oj ojVar = listLx.get(0);
            if (ojVar != null) {
                com.bytedance.sdk.openadsdk.ta.gjv.hnj(ojVar).qor(1).hnj(com.bytedance.sdk.openadsdk.ta.qor.hnj(this.hnj, ojVar.hnj(), imageView));
            }
            PAGMediaView pAGMediaViewHnj = hnj(imageView);
            if (this.dnm == null || !dnm.hn().gjv(String.valueOf(this.hnj.atw()))) {
                pAGMediaViewHnj.setOnClickListener(null);
                pAGMediaViewHnj.setOnTouchListener(null);
            } else {
                pAGMediaViewHnj.setOnClickListener(this.dnm);
                pAGMediaViewHnj.setOnTouchListener(this.dnm);
            }
            pAGMediaViewHnj.setTag(520093762, Boolean.TRUE);
            PAGMediaView pAGMediaView = this.aq;
            if (pAGMediaView != null) {
                pAGMediaView.setOnClickListener(null);
                this.aq.setOnTouchListener(null);
            }
            this.aq = pAGMediaViewHnj;
            return pAGMediaViewHnj;
        }
        hn hnVar = this.dkl;
        if (hnVar == null) {
            ApmHelper.reportCustomError("mPAGFeedVideoAdImpl null", "getMediaView return null", new RuntimeException());
            return null;
        }
        View viewSk = hnVar.sk();
        if (viewSk == null) {
            ApmHelper.reportCustomError("adVideoView null", "getMediaView return null", new RuntimeException());
            return null;
        }
        if (viewSk.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewSk.getParent()).removeView(viewSk);
        }
        PAGMediaView pAGMediaView2 = this.aq;
        if (pAGMediaView2 != null) {
            pAGMediaView2.setOnClickListener(null);
            this.aq.setOnTouchListener(null);
        }
        PAGVideoMediaView pAGVideoMediaView = new PAGVideoMediaView(this.f14511hn, viewSk, this);
        pAGVideoMediaView.setTag(520093762, Boolean.TRUE);
        if (this.dnm == null || !dnm.hn().gjv(String.valueOf(this.hnj.atw()))) {
            com.bytedance.sdk.openadsdk.core.qor.qor qorVar = new com.bytedance.sdk.openadsdk.core.qor.qor() { // from class: com.bytedance.sdk.openadsdk.hnj.hn.hnj.2
                @Override // com.bytedance.sdk.openadsdk.core.qor.qor
                protected void hnj(View view, float f10, float f11, float f12, float f13, SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> sparseArray, boolean z10) {
                    try {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    } catch (Exception unused) {
                    }
                }
            };
            pAGVideoMediaView.setOnClickListener(qorVar);
            pAGVideoMediaView.setOnTouchListener(qorVar);
        } else {
            pAGVideoMediaView.setOnClickListener(this.dnm);
            pAGVideoMediaView.setOnTouchListener(this.dnm);
        }
        this.aq = pAGVideoMediaView;
        pAGVideoMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return pAGVideoMediaView;
    }

    public void orl() {
        com.bytedance.sdk.openadsdk.core.orl.dkl dklVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.orl.dkl> weakReference = this.mjg;
        if (weakReference == null || (dklVar = weakReference.get()) == null) {
            return;
        }
        dklVar.hnj(13);
    }

    public PAGImageItem qor() {
        as asVar = this.hnj;
        if (asVar == null || asVar.mn() == null) {
            return null;
        }
        return new PAGImageItem(this.hnj.mn().qor(), this.hnj.mn().hn(), this.hnj.mn().hnj(), (float) this.hnj.mn().gjv());
    }

    public String sk() {
        as asVar = this.hnj;
        if (asVar != null) {
            return hn(asVar);
        }
        return null;
    }

    public View ta() {
        if (oj.hnj() == null) {
            return null;
        }
        PAGLogoView pAGLogoView = new PAGLogoView(oj.hnj()) { // from class: com.bytedance.sdk.openadsdk.hnj.hn.hnj.4
            int hnj = 0;

            /* JADX INFO: renamed from: hn, reason: collision with root package name */
            int f14516hn = 0;

            @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
                super.onLayout(z10, i10, i11, i12, i13);
                try {
                    Object parent = getParent();
                    if (parent == null || this.hnj == 0 || this.f14516hn == 0) {
                        return;
                    }
                    int width = ((View) parent).getWidth();
                    int height = ((View) parent).getHeight();
                    int i14 = this.hnj;
                    if (width < i14 || height < this.f14516hn) {
                        float fMin = Math.min(height / this.f14516hn, width / i14);
                        int i15 = (width - this.hnj) / 2;
                        if (fMin != 1.0f) {
                            setScaleX(fMin);
                            setScaleY(fMin);
                            setTranslationX(i15);
                        }
                    }
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.PAGLogoView, android.widget.LinearLayout, android.view.View
            protected void onMeasure(int i10, int i11) {
                if (this.hnj == 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), i11);
                    this.hnj = getMeasuredWidth();
                    this.f14516hn = this.containerHeight;
                }
                setMeasuredDimension(this.hnj, this.f14516hn);
            }
        };
        pAGLogoView.initData(this.hnj);
        pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.hnj.hn.hnj.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                hnj.this.bug();
            }
        });
        return pAGLogoView;
    }

    private String hn(as asVar) {
        if (TextUtils.isEmpty(asVar.kby())) {
            return !TextUtils.isEmpty(asVar.br()) ? asVar.br() : "";
        }
        return asVar.kby();
    }

    public void hnj(com.bytedance.sdk.openadsdk.hnj.hn.hnj.qor qorVar) {
        this.dse = qorVar;
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.mjg.hn.dkl dklVar) {
        this.f14512sk = new WeakReference<>(dklVar);
    }

    public void hnj(boolean z10) {
        this.gjv = z10;
    }

    public PAGMediaView hnj() {
        return this.aq;
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar) {
        this.dnm = hnjVar;
    }

    private qor hn(final PAGVideoAdListener pAGVideoAdListener) {
        return new qor() { // from class: com.bytedance.sdk.openadsdk.hnj.hn.hnj.6
            @Override // com.bytedance.sdk.openadsdk.hnj.hn.qor
            public void hn(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.hnj.hn.qor
            public void hnj(int i10, int i11) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.hnj.hn.qor
            public void qor(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.hnj.hn.qor
            public void hnj(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }
        };
    }

    private String hnj(as asVar) {
        if (asVar.zyh() != null && !TextUtils.isEmpty(asVar.zyh().hn())) {
            return asVar.zyh().hn();
        }
        if (!TextUtils.isEmpty(asVar.mw())) {
            return asVar.mw();
        }
        if (!TextUtils.isEmpty(asVar.kby())) {
            return asVar.kby();
        }
        return "";
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.qor.hn hnVar) {
        this.bug = hnVar;
    }

    private void hnj(PAGMediaView pAGMediaView) {
        if (pAGMediaView == null) {
            return;
        }
        try {
            pAGMediaView.setBackgroundColor(-16777216);
        } catch (Exception unused) {
        }
    }

    private PAGMediaView hnj(final View view) {
        int i10;
        if (view == null) {
            return null;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        apu apuVar = this.ojm;
        if (apuVar != null) {
            apuVar.setClickListener(null);
            this.ojm.setClickCreativeListener(null);
        }
        com.bytedance.sdk.openadsdk.core.qor.hn hnVar = this.bug;
        if (hnVar != null && (hnVar instanceof ojm) && (view instanceof apu)) {
            ((apu) view).setClickListener((ojm) hnVar);
        }
        com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar = this.dnm;
        if (hnjVar != null && (hnjVar instanceof com.bytedance.sdk.openadsdk.core.ojm.aq) && (view instanceof apu)) {
            ((apu) view).setClickCreativeListener((com.bytedance.sdk.openadsdk.core.ojm.aq) hnjVar);
        }
        PAGMediaView pAGMediaView = new PAGMediaView(this.f14511hn) { // from class: com.bytedance.sdk.openadsdk.hnj.hn.hnj.3
            private void hnj(boolean z10) {
                Integer num = this.hnj;
                if (num != null) {
                    com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(num), z10 ? 4 : 8);
                }
                as asVar = hnj.this.hnj;
                if (asVar != null) {
                    com.bytedance.sdk.openadsdk.p000do.hnj.qor.hnj(asVar, z10);
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                com.bytedance.sdk.openadsdk.utils.gjv.hnj(this, hnj.this.hnj);
            }

            @Override // android.view.View
            public void onWindowFocusChanged(boolean z10) {
                super.onWindowFocusChanged(z10);
                if (view instanceof apu) {
                    return;
                }
                hnj(z10);
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
            public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
                super.setVideoAdListener(pAGVideoAdListener);
                hnj.this.hnj(pAGVideoAdListener);
            }
        };
        int i11 = -1;
        pAGMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i11 = layoutParams.width;
            i10 = layoutParams.height;
        } else {
            i10 = -1;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i11, i10);
        layoutParams2.gravity = 17;
        pAGMediaView.addView(view, layoutParams2);
        if (view instanceof apu) {
            this.ojm = (apu) view;
        }
        return pAGMediaView;
    }

    public void hnj(PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.hnj.hn.hnj.qor qorVar;
        if (this.hnj.th() == 2 && as.sk(this.hnj) && (qorVar = this.dse) != null && (qorVar instanceof com.bytedance.sdk.openadsdk.hnj.hn.hnj.hn)) {
            xn xnVar = (xn) qorVar.gjv();
            if (xnVar != null) {
                xnVar.setVideoAdListener(hn(pAGVideoAdListener));
                return;
            }
            return;
        }
        hn hnVar = this.dkl;
        if (hnVar != null) {
            hnVar.hnj(hn(pAGVideoAdListener));
        }
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.orl.dkl dklVar) {
        this.mjg = new WeakReference<>(dklVar);
    }
}
