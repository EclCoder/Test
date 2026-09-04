package com.bytedance.sdk.component.adexpress.sk;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    private WeakReference<hn> hnj;

    public qor(hn hnVar) {
        this.hnj = new WeakReference<>(hnVar);
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<hn> weakReference = this.hnj;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hnj.get();
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<hn> weakReference = this.hnj;
        return (weakReference == null || weakReference.get() == null) ? "" : this.hnj.get().adInfo();
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<hn> weakReference = this.hnj;
        return (weakReference == null || weakReference.get() == null) ? "" : this.hnj.get().appInfo();
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<hn> weakReference = this.hnj;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hnj.get().changeVideoState(str);
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<hn> weakReference = this.hnj;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hnj.get().clickEvent(str);
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<hn> weakReference = this.hnj;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hnj.get().dynamicTrack(str);
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<hn> weakReference = this.hnj;
        return (weakReference == null || weakReference.get() == null) ? "" : this.hnj.get().getCurrentVideoState();
    }

    @JavascriptInterface
    public String getData(String str) {
        WeakReference<hn> weakReference = this.hnj;
        return (weakReference == null || weakReference.get() == null) ? "" : this.hnj.get().getData(str);
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<hn> weakReference = this.hnj;
        return (weakReference == null || weakReference.get() == null) ? "" : this.hnj.get().getTemplateInfo();
    }

    public void hnj(hn hnVar) {
        this.hnj = new WeakReference<>(hnVar);
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<hn> weakReference = this.hnj;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hnj.get().initRenderFinish();
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<hn> weakReference = this.hnj;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hnj.get().muteVideo(str);
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<hn> weakReference = this.hnj;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hnj.get().renderDidFinish(str);
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<hn> weakReference = this.hnj;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hnj.get().hnj(str);
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<hn> weakReference = this.hnj;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hnj.get().skipVideo();
    }

    @JavascriptInterface
    public void videoFrameChanged(String str) {
        WeakReference<hn> weakReference = this.hnj;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hnj.get().videoFrameChanged(str);
    }
}
