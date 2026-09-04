package com.bytedance.sdk.openadsdk.api.nativeAd;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class PAGImageItem {
    private float gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final int f13231hn;
    private final int hnj;
    private final String qor;

    public PAGImageItem(int i10, int i11, String str, float f10) {
        this.hnj = i10;
        this.f13231hn = i11;
        this.qor = str;
        this.gjv = f10;
    }

    public float getDuration() {
        return this.gjv;
    }

    public int getHeight() {
        return this.hnj;
    }

    public String getImageUrl() {
        return this.qor;
    }

    public int getWidth() {
        return this.f13231hn;
    }

    public PAGImageItem(int i10, int i11, String str) {
        this(i10, i11, str, 0.0f);
    }
}
