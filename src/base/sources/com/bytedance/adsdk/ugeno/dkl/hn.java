package com.bytedance.adsdk.ugeno.dkl;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends hnj<com.bytedance.adsdk.ugeno.hn.qor> {
    private com.bytedance.adsdk.ugeno.gjv gjv;

    public hn(Context context) {
        super(context);
    }

    public void hnj(com.bytedance.adsdk.ugeno.gjv gjvVar) {
        this.gjv = gjvVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.gjv gjvVar = this.gjv;
        if (gjvVar != null) {
            gjvVar.dse();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.gjv gjvVar = this.gjv;
        if (gjvVar != null) {
            gjvVar.aq();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.gjv gjvVar = this.gjv;
        if (gjvVar != null) {
            gjvVar.dkl();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.gjv gjvVar2 = this.gjv;
        if (gjvVar2 != null) {
            gjvVar2.hnj(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        com.bytedance.adsdk.ugeno.gjv gjvVar = this.gjv;
        if (gjvVar != null) {
            int[] iArrHnj = gjvVar.hnj(i10, i11);
            super.onMeasure(iArrHnj[0], iArrHnj[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        com.bytedance.adsdk.ugeno.gjv gjvVar2 = this.gjv;
        if (gjvVar2 != null) {
            gjvVar2.sk();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.gjv gjvVar = this.gjv;
        if (gjvVar != null) {
            gjvVar.hn(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // com.bytedance.adsdk.ugeno.dkl.hnj
    public View ta(int i10) {
        return ((com.bytedance.adsdk.ugeno.hn.qor) this.hnj.get(i10)).dnm();
    }
}
