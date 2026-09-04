package com.google.ads.mediation.inmobi;

import android.view.ViewGroup;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InMobiBanner f16311a;

    e(InMobiBanner inMobiBanner) {
        this.f16311a = inMobiBanner;
    }

    public InMobiBanner a() {
        return this.f16311a;
    }

    public void b() {
        this.f16311a.load();
    }

    public void c(byte[] bArr) {
        this.f16311a.load(bArr);
    }

    public void d(InMobiBanner.AnimationType animationType) {
        this.f16311a.setAnimationType(animationType);
    }

    public void e(Boolean bool) {
        this.f16311a.setEnableAutoRefresh(bool.booleanValue());
    }

    public void f(Map map) {
        this.f16311a.setExtras(map);
    }

    public void g(String str) {
        this.f16311a.setKeywords(str);
    }

    public void h(ViewGroup.LayoutParams layoutParams) {
        this.f16311a.setLayoutParams(layoutParams);
    }

    public void i(BannerAdEventListener bannerAdEventListener) {
        this.f16311a.setListener(bannerAdEventListener);
    }

    public void j(WatermarkData watermarkData) {
        this.f16311a.setWatermarkData(watermarkData);
    }
}
