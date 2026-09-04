package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.utils.jip;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor extends View implements hnj<qor> {
    private hnj<qor> hnj;

    public qor(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void clickSkip() {
        hnj<qor> hnjVar = this.hnj;
        if (hnjVar != null) {
            hnjVar.clickSkip();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void clickSound(String str) {
        hnj<qor> hnjVar = this.hnj;
        if (hnjVar != null) {
            hnjVar.clickSound(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public View getCloseButton() {
        hnj<qor> hnjVar = this.hnj;
        if (hnjVar != null) {
            return hnjVar.getCloseButton();
        }
        return null;
    }

    public View getITopLayout() {
        Object obj = this.hnj;
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    public qor hnj(as asVar) {
        if (this.hnj == null) {
            TopLayoutDislike2 topLayoutDislike2M24load = new TopLayoutDislike2(getContext()).load(asVar);
            this.hnj = topLayoutDislike2M24load;
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                hnj(topLayoutDislike2M24load, (ViewGroup) parent);
            }
        }
        return this;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setCountDownFor1InN(CharSequence charSequence, int i10) {
        hnj<qor> hnjVar = this.hnj;
        if (hnjVar != null) {
            hnjVar.setCountDownFor1InN(charSequence, i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setListener(hn hnVar) {
        hnj<qor> hnjVar = this.hnj;
        if (hnjVar != null) {
            hnjVar.setListener(hnVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setShowDislike(boolean z10) {
        hnj<qor> hnjVar = this.hnj;
        if (hnjVar != null) {
            hnjVar.setShowDislike(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setShowEndCardNextAd(boolean z10, as asVar) {
        hnj<qor> hnjVar = this.hnj;
        if (hnjVar != null) {
            hnjVar.setShowEndCardNextAd(z10, asVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setShowPlayableNextAd(boolean z10, as asVar) {
        hnj<qor> hnjVar = this.hnj;
        if (hnjVar != null) {
            hnjVar.setShowPlayableNextAd(z10, asVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setShowSkip(boolean z10) {
        hnj<qor> hnjVar = this.hnj;
        if (hnjVar != null) {
            hnjVar.setShowSkip(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setShowSound(boolean z10) {
        hnj<qor> hnjVar = this.hnj;
        if (hnjVar != null) {
            hnjVar.setShowSound(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setSkipEnable(boolean z10) {
        hnj<qor> hnjVar = this.hnj;
        if (hnjVar != null) {
            hnjVar.setSkipEnable(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setSkipInvisiable() {
        hnj<qor> hnjVar = this.hnj;
        if (hnjVar != null) {
            hnjVar.setSkipInvisiable();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setSkipText(CharSequence charSequence) {
        hnj<qor> hnjVar = this.hnj;
        if (hnjVar != null) {
            hnjVar.setSkipText(charSequence);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setSoundMute(boolean z10) {
        hnj<qor> hnjVar = this.hnj;
        if (hnjVar != null) {
            hnjVar.setSoundMute(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        hnj<qor> hnjVar = this.hnj;
        if (hnjVar != null) {
            hnjVar.setTime(charSequence, charSequence2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void showCloseButton() {
        hnj<qor> hnjVar = this.hnj;
        if (hnjVar != null) {
            hnjVar.showCloseButton();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void showCountDownText() {
        hnj<qor> hnjVar = this.hnj;
        if (hnjVar != null) {
            hnjVar.showCountDownText();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void showSkipButton() {
        hnj<qor> hnjVar = this.hnj;
        if (hnjVar != null) {
            hnjVar.showSkipButton();
        }
    }

    public qor(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public qor(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setVisibility(8);
        setWillNotDraw(true);
    }

    private void hnj(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
        if (view != null) {
            view.setId(jip.qs);
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }
}
