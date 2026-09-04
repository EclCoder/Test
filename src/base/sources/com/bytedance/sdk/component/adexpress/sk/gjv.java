package com.bytedance.sdk.component.adexpress.sk;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.hnj.apu;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {
    private WeakReference<apu> hnj;

    public gjv(apu apuVar) {
        this.hnj = new WeakReference<>(apuVar);
    }

    public void hnj(apu apuVar) {
        this.hnj = new WeakReference<>(apuVar);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<apu> weakReference = this.hnj;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hnj.get().invokeMethod(str);
    }
}
