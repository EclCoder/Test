package com.bytedance.adsdk.ugeno.ojm.sk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.dse.aq;
import com.bytedance.adsdk.ugeno.gjv;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends FrameLayout {
    private gjv aq;
    private LinearLayout dkl;
    private Context dse;
    private float gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private float f12383hn;
    private float hnj;
    private double qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private LinearLayout f12384sk;

    public hnj(Context context) {
        super(context);
        this.dse = context;
        this.f12384sk = new LinearLayout(context);
        this.dkl = new LinearLayout(context);
        this.f12384sk.setOrientation(0);
        this.f12384sk.setGravity(8388611);
        this.dkl.setOrientation(0);
        this.dkl.setGravity(8388611);
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.hnj, (int) this.f12383hn);
        float f10 = this.gjv;
        layoutParams.leftMargin = (int) f10;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = (int) f10;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    public void hnj(double d10, int i10, int i11, float f10, int i12) {
        removeAllViews();
        this.f12384sk.removeAllViews();
        this.dkl.removeAllViews();
        this.hnj = (int) aq.hnj(this.dse, f10);
        this.f12383hn = (int) aq.hnj(this.dse, f10);
        this.qor = d10;
        this.gjv = i12;
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setImageResource(com.bytedance.adsdk.ugeno.dse.gjv.hn(this.dse, "tt_ugen_rating_star"));
            starImageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            this.dkl.addView(starImageView);
        }
        for (int i14 = 0; i14 < 5; i14++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageResource(com.bytedance.adsdk.ugeno.dse.gjv.hn(this.dse, "tt_ugen_rating_star"));
            starImageView2.setColorFilter(i11);
            this.f12384sk.addView(starImageView2);
        }
        addView(this.f12384sk);
        addView(this.dkl);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        gjv gjvVar = this.aq;
        if (gjvVar != null) {
            gjvVar.dse();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gjv gjvVar = this.aq;
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
        gjv gjvVar = this.aq;
        if (gjvVar != null) {
            gjvVar.hnj(i10, i11, i12, i13);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        gjv gjvVar = this.aq;
        if (gjvVar != null) {
            gjvVar.hnj(i10, i11);
        }
        super.onMeasure(i10, i11);
        this.f12384sk.measure(i10, i11);
        double dFloor = Math.floor(this.qor);
        float f10 = this.gjv;
        float f11 = this.hnj;
        this.dkl.measure(View.MeasureSpec.makeMeasureSpec((int) ((((double) (f10 + f10 + f11)) * dFloor) + ((double) f10) + ((this.qor - dFloor) * ((double) f11))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f12384sk.getMeasuredHeight(), 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        gjv gjvVar = this.aq;
        if (gjvVar != null) {
            gjvVar.hn(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public void hnj(gjv gjvVar) {
        this.aq = gjvVar;
    }
}
