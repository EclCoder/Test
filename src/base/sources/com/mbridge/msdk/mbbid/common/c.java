package com.mbridge.msdk.mbbid.common;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31360c;

    public c(String str, String str2) {
        this.f31358a = str;
        this.f31359b = str2;
    }

    public String getmFloorPrice() {
        return this.f31360c;
    }

    public String getmPlacementId() {
        return this.f31358a;
    }

    public String getmUnitId() {
        return this.f31359b;
    }

    public void setmFloorPrice(String str) {
        this.f31360c = str;
    }

    public void setmPlacementId(String str) {
        this.f31358a = str;
    }

    public void setmUnitId(String str) {
        this.f31359b = str;
    }

    public c(String str, String str2, String str3) {
        this.f31358a = str;
        this.f31359b = str2;
        this.f31360c = str3;
    }
}
