package com.bytedance.adsdk.hn.qor.hn;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class mjg {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private PointF f12069hn;
    private final List<com.bytedance.adsdk.hn.qor.hnj> hnj;
    private boolean qor;

    public mjg(PointF pointF, boolean z10, List<com.bytedance.adsdk.hn.qor.hnj> list) {
        this.f12069hn = pointF;
        this.qor = z10;
        this.hnj = new ArrayList(list);
    }

    public boolean hn() {
        return this.qor;
    }

    public void hnj(float f10, float f11) {
        if (this.f12069hn == null) {
            this.f12069hn = new PointF();
        }
        this.f12069hn.set(f10, f11);
    }

    public List<com.bytedance.adsdk.hn.qor.hnj> qor() {
        return this.hnj;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.hnj.size() + "closed=" + this.qor + '}';
    }

    public PointF hnj() {
        return this.f12069hn;
    }

    public mjg() {
        this.hnj = new ArrayList();
    }

    public void hnj(boolean z10) {
        this.qor = z10;
    }

    public void hnj(mjg mjgVar, mjg mjgVar2, float f10) {
        if (this.f12069hn == null) {
            this.f12069hn = new PointF();
        }
        this.qor = mjgVar.hn() || mjgVar2.hn();
        if (mjgVar.qor().size() != mjgVar2.qor().size()) {
            mjgVar.qor().size();
            mjgVar2.qor().size();
        }
        int iMin = Math.min(mjgVar.qor().size(), mjgVar2.qor().size());
        if (this.hnj.size() < iMin) {
            for (int size = this.hnj.size(); size < iMin; size++) {
                this.hnj.add(new com.bytedance.adsdk.hn.qor.hnj());
            }
        } else if (this.hnj.size() > iMin) {
            for (int size2 = this.hnj.size() - 1; size2 >= iMin; size2--) {
                List<com.bytedance.adsdk.hn.qor.hnj> list = this.hnj;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFHnj = mjgVar.hnj();
        PointF pointFHnj2 = mjgVar2.hnj();
        hnj(com.bytedance.adsdk.hn.dkl.sk.hnj(pointFHnj.x, pointFHnj2.x, f10), com.bytedance.adsdk.hn.dkl.sk.hnj(pointFHnj.y, pointFHnj2.y, f10));
        for (int size3 = this.hnj.size() - 1; size3 >= 0; size3--) {
            com.bytedance.adsdk.hn.qor.hnj hnjVar = mjgVar.qor().get(size3);
            com.bytedance.adsdk.hn.qor.hnj hnjVar2 = mjgVar2.qor().get(size3);
            PointF pointFHnj3 = hnjVar.hnj();
            PointF pointFHn = hnjVar.hn();
            PointF pointFQor = hnjVar.qor();
            PointF pointFHnj4 = hnjVar2.hnj();
            PointF pointFHn2 = hnjVar2.hn();
            PointF pointFQor2 = hnjVar2.qor();
            this.hnj.get(size3).hnj(com.bytedance.adsdk.hn.dkl.sk.hnj(pointFHnj3.x, pointFHnj4.x, f10), com.bytedance.adsdk.hn.dkl.sk.hnj(pointFHnj3.y, pointFHnj4.y, f10));
            this.hnj.get(size3).hn(com.bytedance.adsdk.hn.dkl.sk.hnj(pointFHn.x, pointFHn2.x, f10), com.bytedance.adsdk.hn.dkl.sk.hnj(pointFHn.y, pointFHn2.y, f10));
            this.hnj.get(size3).qor(com.bytedance.adsdk.hn.dkl.sk.hnj(pointFQor.x, pointFQor2.x, f10), com.bytedance.adsdk.hn.dkl.sk.hnj(pointFQor.y, pointFQor2.y, f10));
        }
    }
}
