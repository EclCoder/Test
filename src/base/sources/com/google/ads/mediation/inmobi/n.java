package com.google.ads.mediation.inmobi;

import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InMobiNative f16326a;

    n(InMobiNative inMobiNative) {
        this.f16326a = inMobiNative;
    }

    public String a() {
        return this.f16326a.getCtaText();
    }

    public String b() {
        return this.f16326a.getAdDescription();
    }

    public String c() {
        InMobiNativeImage adIcon = this.f16326a.getAdIcon();
        if (adIcon == null) {
            return null;
        }
        return adIcon.getUrl();
    }

    public float d() {
        return this.f16326a.getAdRating();
    }

    public String e() {
        return this.f16326a.getAdTitle();
    }

    public String f() {
        return this.f16326a.getAdvertiserName();
    }

    public MediaView g() {
        return this.f16326a.getMediaView();
    }

    public Boolean h() {
        return Boolean.valueOf(this.f16326a.isVideo());
    }

    public void i() {
        this.f16326a.load();
    }

    public void j(byte[] bArr) {
        this.f16326a.load(bArr);
    }

    public void k(InMobiNativeViewData inMobiNativeViewData) {
        this.f16326a.registerViewForTracking(inMobiNativeViewData);
    }

    public void l(Map map) {
        this.f16326a.setExtras(map);
    }

    public void m(String str) {
        this.f16326a.setKeywords(str);
    }

    public void n(VideoEventListener videoEventListener) {
        this.f16326a.setVideoEventListener(videoEventListener);
    }

    public void o() {
        this.f16326a.unTrackViews();
    }
}
