package com.bytedance.sdk.openadsdk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class TTImage {
    private double gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final int f13031hn;
    private final int hnj;
    private final String qor;

    public TTImage(int i10, int i11, String str, double d10) {
        this.hnj = i10;
        this.f13031hn = i11;
        this.qor = str;
        this.gjv = d10;
    }

    public double getDuration() {
        return this.gjv;
    }

    public int getHeight() {
        return this.hnj;
    }

    public String getImageUrl() {
        return this.qor;
    }

    public int getWidth() {
        return this.f13031hn;
    }

    public boolean isValid() {
        String str;
        return this.hnj > 0 && this.f13031hn > 0 && (str = this.qor) != null && str.length() > 0;
    }

    public TTImage(int i10, int i11, String str) {
        this(i10, i11, str, 0.0d);
    }
}
