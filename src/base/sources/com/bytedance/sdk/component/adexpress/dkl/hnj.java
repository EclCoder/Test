package com.bytedance.sdk.component.adexpress.dkl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.utils.xyo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends TextSwitcher implements ViewSwitcher.ViewFactory, xyo.hnj {
    private int aq;
    private int bug;
    private TextView dkl;
    private int dnm;
    private int dse;
    private final int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private List<String> f12485hn;
    Animation.AnimationListener hnj;
    private Handler mjg;
    private float ojm;
    private int orl;
    private int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private Context f12486sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private int f12487ta;

    public hnj(Context context, int i10, float f10, int i11, int i12) {
        super(context);
        this.f12485hn = new ArrayList();
        this.qor = 0;
        this.gjv = 1;
        this.mjg = new xyo(Looper.getMainLooper(), this);
        this.hnj = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.dkl.hnj.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (hnj.this.dkl != null) {
                    hnj.this.dkl.setText("");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
        this.f12486sk = context;
        this.aq = i10;
        this.ojm = f10;
        this.f12487ta = i11;
        this.orl = i12;
        qor();
    }

    private void qor() {
        setFactory(this);
    }

    public void hn() {
        List<String> list = this.f12485hn;
        if (list == null || list.size() <= 0) {
            return;
        }
        int i10 = this.qor;
        this.qor = i10 + 1;
        this.dnm = i10;
        setText(this.f12485hn.get(i10));
        if (this.qor > this.f12485hn.size() - 1) {
            this.qor = 0;
        }
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        this.dkl = textView;
        textView.setTextColor(this.aq);
        this.dkl.setTextSize(this.ojm);
        this.dkl.setMaxLines(this.f12487ta);
        this.dkl.setTextAlignment(this.orl);
        return this.dkl;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mjg.sendEmptyMessageDelayed(1, this.dse);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mjg.removeMessages(1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(com.bytedance.sdk.component.adexpress.dynamic.sk.dnm.hn(this.f12485hn.get(this.dnm), this.ojm, false)[0], 1073741824), i10);
        } catch (Exception unused) {
            super.onMeasure(i10, i11);
        }
    }

    public void setAnimationDuration(int i10) {
        this.dse = i10;
    }

    public void setAnimationText(List<String> list) {
        this.f12485hn = list;
    }

    public void setAnimationType(int i10) {
        this.bug = i10;
    }

    public void setMaxLines(int i10) {
        this.f12487ta = i10;
    }

    public void setTextColor(int i10) {
        this.aq = i10;
    }

    public void setTextSize(float f10) {
        this.ojm = f10;
    }

    public void hnj() {
        int i10 = this.bug;
        if (i10 == 1) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.wu.ojm(this.f12486sk, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.wu.ojm(this.f12486sk, "tt_text_animation_y_out"));
        } else if (i10 == 0) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.wu.ojm(this.f12486sk, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.wu.ojm(this.f12486sk, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.hnj);
            getOutAnimation().setAnimationListener(this.hnj);
        }
        this.mjg.sendEmptyMessage(1);
    }

    @Override // com.bytedance.sdk.component.utils.xyo.hnj
    public void hnj(Message message) {
        if (message.what != 1) {
            return;
        }
        hn();
        this.mjg.sendEmptyMessageDelayed(1, this.dse);
    }
}
