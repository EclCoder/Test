package com.bytedance.sdk.component.adexpress.dkl;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dnm extends FrameLayout {
    private final RotateAnimation gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final ImageView f12471hn;
    private final TextView hnj;
    private final bug qor;

    public dnm(Context context) {
        super(context);
        addView(com.bytedance.sdk.component.adexpress.qor.hnj.gjv(context));
        this.hnj = (TextView) findViewById(2097610742);
        this.f12471hn = (ImageView) findViewById(2097610745);
        this.qor = (bug) findViewById(2097610744);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 30.0f, 1, 0.65f, 1, 0.9f);
        this.gjv = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable getHaloAnimation() {
        return new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dkl.dnm.1
            @Override // java.lang.Runnable
            public void run() {
                dnm.this.f12471hn.startAnimation(dnm.this.gjv);
                dnm.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dkl.dnm.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        dnm.this.qor.hnj(4);
                    }
                }, 100L);
                dnm.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dkl.dnm.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        dnm.this.qor.hnj(4);
                    }
                }, 300L);
                dnm dnmVar = dnm.this;
                dnmVar.postDelayed(dnmVar.getHaloAnimation(), 1200L);
            }
        };
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView = this.hnj;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void hn() {
        this.gjv.cancel();
    }

    public void hnj() {
        postDelayed(getHaloAnimation(), 300L);
    }
}
