package com.mbridge.msdk.mbbid.out;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class AdvancedNativeBidRequestParams extends CommonBidRequestParams {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f31376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f31377e;

    public AdvancedNativeBidRequestParams(String str, String str2, int i10, int i11) {
        super(str, str2);
        this.f31376d = i11;
        this.f31377e = i10;
    }

    public int getHeight() {
        return this.f31376d;
    }

    public int getWidth() {
        return this.f31377e;
    }

    public void setHeight(int i10) {
        this.f31376d = i10;
    }

    public void setWidth(int i10) {
        this.f31377e = i10;
    }

    public AdvancedNativeBidRequestParams(String str, String str2, String str3, int i10, int i11) {
        super(str, str2, str3);
        this.f31376d = i11;
        this.f31377e = i10;
    }
}
