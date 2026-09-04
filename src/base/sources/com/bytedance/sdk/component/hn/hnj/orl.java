package com.bytedance.sdk.component.hn.hnj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class orl {
    public hnj dkl;
    public String gjv;
    public ojm qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    public byte[] f12881sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum hnj {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public orl() {
    }

    public static orl hnj(ojm ojmVar, String str) {
        return new orl(ojmVar, str, hnj.STRING_TYPE);
    }

    public orl(ojm ojmVar, String str, hnj hnjVar) {
        this.qor = ojmVar;
        this.gjv = str;
        this.dkl = hnjVar;
    }

    public static orl hnj(ojm ojmVar, byte[] bArr) {
        return new orl(ojmVar, bArr, hnj.BYTE_ARRAY_TYPE);
    }

    public orl(ojm ojmVar, byte[] bArr, hnj hnjVar) {
        this.qor = ojmVar;
        this.f12881sk = bArr;
        this.dkl = hnjVar;
    }
}
