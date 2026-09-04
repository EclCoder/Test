package com.bytedance.adsdk.ugeno.hnj;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq implements dse {
    private float dkl;
    private float gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private float f12313hn;
    private View hnj;
    private float qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private float f12314sk;

    public aq(View view) {
        this.hnj = view;
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.dse
    public float getRipple() {
        return this.qor;
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.dse
    public float getRubIn() {
        return this.dkl;
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.dse
    public float getShine() {
        return this.gjv;
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.dse
    public float getStretch() {
        return this.f12314sk;
    }

    public void gjv(float f10) {
        this.f12314sk = f10;
        this.hnj.postInvalidate();
    }

    public void hn(float f10) {
        View view = this.hnj;
        if (view == null) {
            return;
        }
        this.qor = f10;
        view.postInvalidate();
    }

    public void hnj(float f10) {
        View view = this.hnj;
        if (view == null) {
            return;
        }
        this.f12313hn = f10;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setCornerRadius(f10);
        }
    }

    public void qor(float f10) {
        View view = this.hnj;
        if (view == null) {
            return;
        }
        this.gjv = f10;
        view.postInvalidate();
    }

    public void sk(float f10) {
        this.dkl = f10;
        this.hnj.postInvalidate();
    }

    public float hnj() {
        return this.f12313hn;
    }

    public void hnj(int i10) {
        View view = this.hnj;
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i10);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background.mutate()).setColor(i10);
        }
    }
}
