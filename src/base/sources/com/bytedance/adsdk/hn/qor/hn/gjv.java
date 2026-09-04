package com.bytedance.adsdk.hn.qor.hn;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final int[] f12065hn;
    private final float[] hnj;

    public gjv(float[] fArr, int[] iArr) {
        this.hnj = fArr;
        this.f12065hn = iArr;
    }

    public int[] hn() {
        return this.f12065hn;
    }

    public float[] hnj() {
        return this.hnj;
    }

    public int qor() {
        return this.f12065hn.length;
    }

    public void hnj(gjv gjvVar, gjv gjvVar2, float f10) {
        if (gjvVar.f12065hn.length == gjvVar2.f12065hn.length) {
            for (int i10 = 0; i10 < gjvVar.f12065hn.length; i10++) {
                this.hnj[i10] = com.bytedance.adsdk.hn.dkl.sk.hnj(gjvVar.hnj[i10], gjvVar2.hnj[i10], f10);
                this.f12065hn[i10] = com.bytedance.adsdk.hn.dkl.hn.hnj(f10, gjvVar.f12065hn[i10], gjvVar2.f12065hn[i10]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + gjvVar.f12065hn.length + " vs " + gjvVar2.f12065hn.length + ")");
    }

    public gjv hnj(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            iArr[i10] = hnj(fArr[i10]);
        }
        return new gjv(fArr, iArr);
    }

    private int hnj(float f10) {
        int iBinarySearch = Arrays.binarySearch(this.hnj, f10);
        if (iBinarySearch >= 0) {
            return this.f12065hn[iBinarySearch];
        }
        int i10 = -(iBinarySearch + 1);
        if (i10 == 0) {
            return this.f12065hn[0];
        }
        int[] iArr = this.f12065hn;
        if (i10 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.hnj;
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        return com.bytedance.adsdk.hn.dkl.hn.hnj((f10 - f11) / (fArr[i10] - f11), iArr[i11], iArr[i10]);
    }
}
