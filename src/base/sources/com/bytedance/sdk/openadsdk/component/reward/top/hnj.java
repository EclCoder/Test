package com.bytedance.sdk.openadsdk.component.reward.top;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.as;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface hnj<T extends View> {
    void clickSkip();

    void clickSound(String str);

    View getCloseButton();

    void setCountDownFor1InN(CharSequence charSequence, int i10);

    void setListener(hn hnVar);

    void setShowDislike(boolean z10);

    void setShowEndCardNextAd(boolean z10, as asVar);

    void setShowPlayableNextAd(boolean z10, as asVar);

    void setShowSkip(boolean z10);

    void setShowSound(boolean z10);

    void setSkipEnable(boolean z10);

    void setSkipInvisiable();

    void setSkipText(CharSequence charSequence);

    void setSoundMute(boolean z10);

    void setTime(CharSequence charSequence, CharSequence charSequence2);

    void showCloseButton();

    void showCountDownText();

    void showSkipButton();
}
