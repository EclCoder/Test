package com.bytedance.adsdk.hn.qor;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    private final float gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final String f12096hn;
    private final String hnj;
    private final String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private Typeface f12097sk;

    public qor(String str, String str2, String str3, float f10) {
        this.hnj = str;
        this.f12096hn = str2;
        this.qor = str3;
        this.gjv = f10;
    }

    public Typeface gjv() {
        return this.f12097sk;
    }

    public String hn() {
        return this.f12096hn;
    }

    public String hnj() {
        return this.hnj;
    }

    public String qor() {
        return this.qor;
    }

    public void hnj(Typeface typeface) {
        this.f12097sk = typeface;
    }
}
