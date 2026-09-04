package com.bytedance.sdk.component.adexpress.dkl;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class as extends FrameLayout {
    private static final int ojm = (com.bytedance.sdk.component.adexpress.dynamic.sk.dnm.hn("", 0.0f, true)[1] / 2) + 1;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private static final int f12463ta = (com.bytedance.sdk.component.adexpress.dynamic.sk.dnm.hn("", 0.0f, true)[1] / 2) + 3;
    private float aq;
    private Drawable dkl;
    private double dse;
    private float gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    LinearLayout f12464hn;
    LinearLayout hnj;
    private float qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private Drawable f12465sk;

    public as(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.hnj = new LinearLayout(getContext());
        this.f12464hn = new LinearLayout(getContext());
        this.hnj.setOrientation(0);
        this.hnj.setGravity(8388611);
        this.f12464hn.setOrientation(0);
        this.f12464hn.setGravity(8388611);
        this.f12465sk = com.bytedance.sdk.component.utils.wu.qor(context, "tt_star_thick");
        this.dkl = com.bytedance.sdk.component.utils.wu.qor(context, "tt_star");
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.qor, (int) this.gjv));
        imageView.setPadding(1, ojm, 1, f12463ta);
        return imageView;
    }

    public Drawable getStarEmptyDrawable() {
        return this.f12465sk;
    }

    public Drawable getStarFillDrawable() {
        return this.dkl;
    }

    public void hnj(double d10, int i10, int i11, int i12) {
        float f10 = i11;
        this.qor = (int) com.bytedance.sdk.component.adexpress.gjv.dse.qor(getContext(), f10);
        this.gjv = (int) com.bytedance.sdk.component.adexpress.gjv.dse.qor(getContext(), f10);
        this.dse = d10;
        this.aq = i12;
        removeAllViews();
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.f12464hn.addView(starImageView);
        }
        for (int i14 = 0; i14 < 5; i14++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.hnj.addView(starImageView2);
        }
        addView(this.hnj);
        addView(this.f12464hn);
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.hnj.measure(i10, i11);
        double d10 = this.dse;
        float f10 = this.qor;
        this.f12464hn.measure(View.MeasureSpec.makeMeasureSpec((int) (((double) ((((int) d10) * f10) + 1.0f)) + (((double) (f10 - 2.0f)) * (d10 - ((double) ((int) d10))))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.hnj.getMeasuredHeight(), 1073741824));
        if (this.aq > 0.0f) {
            LinearLayout linearLayout = this.hnj;
            linearLayout.setPadding(0, ((int) (linearLayout.getMeasuredHeight() - this.aq)) / 2, 0, 0);
            this.f12464hn.setPadding(0, ((int) (this.hnj.getMeasuredHeight() - this.aq)) / 2, 0, 0);
        }
    }
}
