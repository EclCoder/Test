package com.bytedance.sdk.component.aq.hnj;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.xyo;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends xyo implements qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final HandlerThread f12749hn;

    hn(HandlerThread handlerThread, xyo.hnj hnjVar) {
        super(handlerThread.getLooper(), hnjVar);
        this.f12749hn = handlerThread;
    }

    public void hn() {
        HandlerThread handlerThread = this.f12749hn;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    @Override // com.bytedance.sdk.component.aq.hnj.qor
    public void hnj() {
        removeCallbacksAndMessages(null);
        WeakReference<xyo.hnj> weakReference = this.hnj;
        if (weakReference != null) {
            weakReference.clear();
            this.hnj = null;
        }
    }

    public void hnj(xyo.hnj hnjVar) {
        this.hnj = new WeakReference<>(hnjVar);
    }
}
