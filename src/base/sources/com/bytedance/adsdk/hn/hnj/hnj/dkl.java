package com.bytedance.adsdk.hn.hnj.hnj;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl implements com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj, dnm, orl {
    private boolean aq;
    private final com.bytedance.adsdk.hn.qor.hn.hn dkl;
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<?, PointF> gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final String f11986hn;
    private final com.bytedance.adsdk.hn.ojm qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<?, PointF> f11987sk;
    private final Path hnj = new Path();
    private final hn dse = new hn();

    public dkl(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar, com.bytedance.adsdk.hn.qor.hn.hn hnVar) {
        this.f11986hn = hnVar.hnj();
        this.qor = ojmVar;
        com.bytedance.adsdk.hn.hnj.hn.hnj<PointF, PointF> hnjVarHnj = hnVar.qor().hnj();
        this.gjv = hnjVarHnj;
        com.bytedance.adsdk.hn.hnj.hn.hnj<PointF, PointF> hnjVarHnj2 = hnVar.hn().hnj();
        this.f11987sk = hnjVarHnj2;
        this.dkl = hnVar;
        hnjVar.hnj(hnjVarHnj);
        hnjVar.hnj(hnjVarHnj2);
        hnjVarHnj.hnj(this);
        hnjVarHnj2.hnj(this);
    }

    private void hn() {
        this.aq = false;
        this.qor.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.orl
    public Path gjv() {
        if (this.aq) {
            return this.hnj;
        }
        this.hnj.reset();
        if (this.dkl.sk()) {
            this.aq = true;
            return this.hnj;
        }
        PointF pointFDse = this.gjv.dse();
        float f10 = pointFDse.x / 2.0f;
        float f11 = pointFDse.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.hnj.reset();
        if (this.dkl.gjv()) {
            float f14 = -f11;
            this.hnj.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.hnj.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            this.hnj.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            this.hnj.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            this.hnj.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            this.hnj.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            this.hnj.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            this.hnj.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            this.hnj.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            this.hnj.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointFDse2 = this.f11987sk.dse();
        this.hnj.offset(pointFDse2.x, pointFDse2.y);
        this.hnj.close();
        this.dse.hnj(this.hnj);
        this.aq = true;
        return this.hnj;
    }

    @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj
    public void hnj() {
        hn();
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.qor
    public void hnj(List<qor> list, List<qor> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            qor qorVar = list.get(i10);
            if (qorVar instanceof eum) {
                eum eumVar = (eum) qorVar;
                if (eumVar.hn() == com.bytedance.adsdk.hn.qor.hn.xn.hnj.SIMULTANEOUSLY) {
                    this.dse.hnj(eumVar);
                    eumVar.hnj(this);
                }
            }
        }
    }
}
