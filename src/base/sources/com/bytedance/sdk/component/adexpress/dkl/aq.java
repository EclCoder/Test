package com.bytedance.sdk.component.adexpress.dkl;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq extends eum {
    private AnimatorSet dkl;
    private ImageView gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private ImageView f12461hn;
    private TextView hnj;
    private ImageView qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f12462sk;

    public aq(Context context) {
        super(context);
        this.dkl = new AnimatorSet();
        hn(context);
    }

    private void gjv() {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.setDuration(2000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.start();
    }

    private void hn(Context context) {
        addView(com.bytedance.sdk.component.adexpress.qor.hnj.hn(context));
        this.f12461hn = (ImageView) findViewById(2097610751);
        this.qor = (ImageView) findViewById(2097610750);
        this.gjv = (ImageView) findViewById(2097610749);
        this.hnj = (TextView) findViewById(2097610748);
    }

    public float getAlphaColor() {
        return this.f12462sk;
    }

    @Override // com.bytedance.sdk.component.adexpress.dkl.eum
    protected void hnj(Context context) {
    }

    public void setAlphaColor(int i10) {
        if (i10 < 0 || i10 > 60) {
            return;
        }
        int i11 = i10 + 195;
        ImageView imageView = this.gjv;
        int iRgb = Color.rgb(i11, i11, i11);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(iRgb, mode);
        int i12 = ((i10 + 20) % 60) + 195;
        this.qor.setColorFilter(Color.rgb(i12, i12, i12), mode);
        int i13 = ((i10 + 40) % 60) + 195;
        this.f12461hn.setColorFilter(Color.rgb(i13, i13, i13), mode);
    }

    public void setButtonText(String str) {
        if (this.hnj == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.hnj.setText(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.dkl.eum
    public void hnj() {
        gjv();
    }

    @Override // com.bytedance.sdk.component.adexpress.dkl.eum
    public void hn() {
        this.dkl.cancel();
    }
}
