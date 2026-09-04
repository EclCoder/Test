package com.bytedance.sdk.component.ojm;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class qor implements View.OnTouchListener {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f12937hn = -1;
    private ViewConfiguration hnj;

    abstract void hnj(View.OnTouchListener onTouchListener);

    boolean hnj(float f10, float f11, float f12, float f13, Context context) {
        if (this.hnj == null) {
            this.hnj = ViewConfiguration.get(context);
        }
        if (this.f12937hn == -1) {
            this.f12937hn = this.hnj.getScaledTouchSlop();
        }
        return Math.abs(f10 - f12) <= ((float) this.f12937hn) && Math.abs(f11 - f13) <= ((float) this.f12937hn);
    }
}
