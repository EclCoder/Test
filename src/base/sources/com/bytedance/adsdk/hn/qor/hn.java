package com.bytedance.adsdk.hn.qor;

import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    public int aq;
    public PointF bug;
    public float dkl;
    public boolean dnm;
    public float dse;
    public hnj gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public String f12048hn;
    public String hnj;
    public int ojm;
    public PointF orl;
    public float qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    public int f12049sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public float f12050ta;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum hnj {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public hn(String str, String str2, float f10, hnj hnjVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        hnj(str, str2, f10, hnjVar, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.hnj.hashCode() * 31) + this.f12048hn.hashCode()) * 31) + this.qor)) * 31) + this.gjv.ordinal()) * 31) + this.f12049sk;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.dkl);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.aq;
    }

    public void hnj(String str, String str2, float f10, hnj hnjVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.hnj = str;
        this.f12048hn = str2;
        this.qor = f10;
        this.gjv = hnjVar;
        this.f12049sk = i10;
        this.dkl = f11;
        this.dse = f12;
        this.aq = i11;
        this.ojm = i12;
        this.f12050ta = f13;
        this.dnm = z10;
        this.bug = pointF;
        this.orl = pointF2;
    }

    public hn() {
    }
}
