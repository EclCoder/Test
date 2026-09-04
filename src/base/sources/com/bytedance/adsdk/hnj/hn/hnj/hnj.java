package com.bytedance.adsdk.hnj.hn.hnj;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private Object[] f12161hn;
    private String hnj;

    public Object[] hn() {
        return this.f12161hn;
    }

    public String hnj() {
        return this.hnj;
    }

    public String toString() {
        return "MethodResult{methodName='" + this.hnj + "', args=" + Arrays.toString(this.f12161hn) + '}';
    }

    public void hnj(String str) {
        this.hnj = str;
    }

    public void hnj(Object[] objArr) {
        this.f12161hn = objArr;
    }
}
