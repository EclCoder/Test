package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class PAGMediaView extends FrameLayout {
    protected Integer hnj;

    public PAGMediaView(Context context) {
        super(context);
    }

    public void setMrcTrackerKey(Integer num) {
        this.hnj = num;
    }

    public PAGMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PAGMediaView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public PAGMediaView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public void close() {
    }

    public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
    }
}
