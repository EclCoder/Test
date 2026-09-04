package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends com.bytedance.sdk.openadsdk.core.dkl.qor {
    private com.bytedance.sdk.openadsdk.activity.single.aq dkl;
    private boolean dse;
    private float gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final boolean f13554hn;
    private final boolean hnj;
    private com.bytedance.sdk.openadsdk.core.dkl.qor qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private float f13555sk;

    public hn(Context context, boolean z10, boolean z11, final int i10) {
        super(context);
        this.hnj = z10;
        this.f13554hn = z11;
        if (z10) {
            setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.hn.2
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i10);
                }
            });
            setClipToOutline(true);
            return;
        }
        this.qor = new com.bytedance.sdk.openadsdk.core.dkl.qor(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.qor, layoutParams);
        this.qor.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.hn.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i10);
            }
        });
        this.qor.setClipToOutline(true);
    }

    public void hnj(aq aqVar, FrameLayout.LayoutParams layoutParams) {
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar = this.qor;
        if (qorVar != null) {
            qorVar.addView(aqVar, layoutParams);
        } else {
            addView(aqVar, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        com.bytedance.sdk.openadsdk.activity.single.aq aqVar;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVarMo16do;
        super.onAttachedToWindow();
        if (this.dse || (aqVar = this.dkl) == null || (hnjVarMo16do = aqVar.mo16do()) == null) {
            return;
        }
        hnjVarMo16do.tgn.hn(true);
        this.dse = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        com.bytedance.sdk.openadsdk.activity.single.aq aqVar;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVarMo16do;
        super.onDetachedFromWindow();
        if (!this.dse || (aqVar = this.dkl) == null || (hnjVarMo16do = aqVar.mo16do()) == null) {
            return;
        }
        hnjVarMo16do.tgn.hn(false);
        this.dse = false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.dkl.qor, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (this.f13554hn) {
            float f10 = this.gjv;
            if (f10 > 0.0f) {
                int iMax = Math.max(0, (size - ((int) (size2 * f10))) / 2);
                setPadding(iMax, 0, iMax, 0);
            } else {
                float f11 = this.f13555sk;
                if (f11 > 0.0f) {
                    int iMax2 = Math.max(0, (size - ((int) (size * f11))) / 2);
                    setPadding(iMax2, 0, iMax2, 0);
                }
            }
        } else if (this.hnj) {
            float f12 = this.gjv;
            if (f12 > 0.0f) {
                i11 = View.MeasureSpec.makeMeasureSpec((int) (size / f12), 1073741824);
            } else {
                float f13 = this.f13555sk;
                if (f13 > 0.0f) {
                    i11 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f13), 1073741824);
                }
            }
        } else {
            float f14 = this.gjv;
            if (f14 > 0.0f) {
                int iMax3 = Math.max(0, (size - ((int) (size2 * f14))) / 2);
                setPadding(iMax3, 0, iMax3, 0);
            } else {
                float f15 = this.f13555sk;
                if (f15 > 0.0f) {
                    int iMax4 = Math.max(0, (size - ((int) (size * f15))) / 2);
                    setPadding(iMax4, 0, iMax4, 0);
                }
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        com.bytedance.sdk.openadsdk.activity.single.aq aqVar;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVarMo16do;
        super.onWindowFocusChanged(z10);
        if (this.dse == z10 || (aqVar = this.dkl) == null || (hnjVarMo16do = aqVar.mo16do()) == null) {
            return;
        }
        hnjVarMo16do.tgn.hn(z10);
    }

    public void setScene(com.bytedance.sdk.openadsdk.activity.single.aq aqVar) {
        this.dkl = aqVar;
    }

    public void setWidthAndHeightRatio(float f10) {
        this.gjv = f10;
    }

    public void setWidthOrHeightInParentRatio(float f10) {
        this.f13555sk = f10;
    }

    public void hnj() {
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar = this.qor;
        if (qorVar != null) {
            qorVar.removeAllViews();
        } else {
            removeAllViews();
        }
    }
}
