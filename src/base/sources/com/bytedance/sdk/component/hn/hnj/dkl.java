package com.bytedance.sdk.component.hn.hnj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class dkl {
    private final String[] hnj;

    public dkl(String[] strArr) {
        this.hnj = strArr;
    }

    public String hn(int i10) {
        return this.hnj[(i10 * 2) + 1];
    }

    public int hnj() {
        return this.hnj.length / 2;
    }

    public String hnj(int i10) {
        return this.hnj[i10 * 2];
    }
}
