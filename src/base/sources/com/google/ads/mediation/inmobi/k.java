package com.google.ads.mediation.inmobi;

import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.WatermarkData;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InMobiInterstitial f16319a;

    k(InMobiInterstitial inMobiInterstitial) {
        this.f16319a = inMobiInterstitial;
    }

    public Boolean a() {
        return Boolean.valueOf(this.f16319a.isReady());
    }

    public void b() {
        this.f16319a.load();
    }

    public void c(byte[] bArr) {
        this.f16319a.load(bArr);
    }

    public void d(Map map) {
        this.f16319a.setExtras(map);
    }

    public void e(String str) {
        this.f16319a.setKeywords(str);
    }

    public void f(WatermarkData watermarkData) {
        this.f16319a.setWatermarkData(watermarkData);
    }

    public void g() {
        this.f16319a.show();
    }
}
