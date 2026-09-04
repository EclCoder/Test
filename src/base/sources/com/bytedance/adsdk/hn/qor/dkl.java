package com.bytedance.adsdk.hn.qor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public final float f12044hn;
    public final float hnj;
    private final String qor;

    public dkl(String str, float f10, float f11) {
        this.qor = str;
        this.f12044hn = f11;
        this.hnj = f10;
    }

    public boolean hnj(String str) {
        if (this.qor.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.qor.endsWith("\r")) {
            String str2 = this.qor;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
