package com.bytedance.sdk.component.adexpress.sk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface hn {
    String adInfo();

    String appInfo();

    void changeVideoState(String str);

    void clickEvent(String str);

    void dynamicTrack(String str);

    String getCurrentVideoState();

    String getData(String str);

    String getTemplateInfo();

    void hnj(String str);

    void initRenderFinish();

    void muteVideo(String str);

    void renderDidFinish(String str);

    void skipVideo();

    void videoFrameChanged(String str);
}
