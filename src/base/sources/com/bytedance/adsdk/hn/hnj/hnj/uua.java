package com.bytedance.adsdk.hn.hnj.hnj;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class uua implements com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj, xn {
    private com.bytedance.adsdk.hn.qor.hn.mjg gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final String f12015hn;
    private final com.bytedance.adsdk.hn.ojm hnj;
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> qor;

    public uua(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar, com.bytedance.adsdk.hn.qor.hn.orl orlVar) {
        this.hnj = ojmVar;
        this.f12015hn = orlVar.hnj();
        com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVarHnj = orlVar.hn().hnj();
        this.qor = hnjVarHnj;
        hnjVar.hnj(hnjVarHnj);
        hnjVarHnj.hnj(this);
    }

    public com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hn() {
        return this.qor;
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.qor
    public void hnj(List<qor> list, List<qor> list2) {
    }

    private com.bytedance.adsdk.hn.qor.hn.mjg hn(com.bytedance.adsdk.hn.qor.hn.mjg mjgVar) {
        List<com.bytedance.adsdk.hn.qor.hnj> listQor = mjgVar.qor();
        boolean zHn = mjgVar.hn();
        int size = listQor.size() - 1;
        int i10 = 0;
        while (size >= 0) {
            com.bytedance.adsdk.hn.qor.hnj hnjVar = listQor.get(size);
            com.bytedance.adsdk.hn.qor.hnj hnjVar2 = listQor.get(hnj(size - 1, listQor.size()));
            PointF pointFQor = (size != 0 || zHn) ? hnjVar2.qor() : mjgVar.hnj();
            i10 = (((size != 0 || zHn) ? hnjVar2.hn() : pointFQor).equals(pointFQor) && hnjVar.hnj().equals(pointFQor) && !(!mjgVar.hn() && size == 0 && size == listQor.size() - 1)) ? i10 + 2 : i10 + 1;
            size--;
        }
        com.bytedance.adsdk.hn.qor.hn.mjg mjgVar2 = this.gjv;
        if (mjgVar2 == null || mjgVar2.qor().size() != i10) {
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new com.bytedance.adsdk.hn.qor.hnj());
            }
            this.gjv = new com.bytedance.adsdk.hn.qor.hn.mjg(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.gjv.hnj(zHn);
        return this.gjv;
    }

    @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj
    public void hnj() {
        this.hnj.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a1  */
    @Override // com.bytedance.adsdk.hn.hnj.hnj.xn
    public com.bytedance.adsdk.hn.qor.hn.mjg hnj(com.bytedance.adsdk.hn.qor.hn.mjg mjgVar) {
        boolean z10;
        List<com.bytedance.adsdk.hn.qor.hnj> listQor = mjgVar.qor();
        if (listQor.size() > 2) {
            float fFloatValue = this.qor.dse().floatValue();
            if (fFloatValue != 0.0f) {
                com.bytedance.adsdk.hn.qor.hn.mjg mjgVarHn = hn(mjgVar);
                mjgVarHn.hnj(mjgVar.hnj().x, mjgVar.hnj().y);
                List<com.bytedance.adsdk.hn.qor.hnj> listQor2 = mjgVarHn.qor();
                boolean zHn = mjgVar.hn();
                int i10 = 0;
                int i11 = 0;
                while (i10 < listQor.size()) {
                    com.bytedance.adsdk.hn.qor.hnj hnjVar = listQor.get(i10);
                    com.bytedance.adsdk.hn.qor.hnj hnjVar2 = listQor.get(hnj(i10 - 1, listQor.size()));
                    com.bytedance.adsdk.hn.qor.hnj hnjVar3 = listQor.get(hnj(i10 - 2, listQor.size()));
                    PointF pointFQor = (i10 != 0 || zHn) ? hnjVar2.qor() : mjgVar.hnj();
                    PointF pointFHn = (i10 != 0 || zHn) ? hnjVar2.hn() : pointFQor;
                    PointF pointFHnj = hnjVar.hnj();
                    PointF pointFQor2 = hnjVar3.qor();
                    PointF pointFQor3 = hnjVar.qor();
                    if (!mjgVar.hn() && i10 == 0) {
                        z10 = i10 == listQor.size() + (-1);
                    }
                    if (pointFHn.equals(pointFQor) && pointFHnj.equals(pointFQor) && !z10) {
                        float f10 = pointFQor.x;
                        float f11 = f10 - pointFQor2.x;
                        float f12 = pointFQor.y;
                        float f13 = f12 - pointFQor2.y;
                        float f14 = pointFQor3.x - f10;
                        float f15 = pointFQor3.y - f12;
                        float fHypot = (float) Math.hypot(f11, f13);
                        float fHypot2 = (float) Math.hypot(f14, f15);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f16 = pointFQor.x;
                        float f17 = ((pointFQor2.x - f16) * fMin) + f16;
                        float f18 = pointFQor.y;
                        float f19 = ((pointFQor2.y - f18) * fMin) + f18;
                        float f20 = ((pointFQor3.x - f16) * fMin2) + f16;
                        float f21 = ((pointFQor3.y - f18) * fMin2) + f18;
                        float f22 = f17 - ((f17 - f16) * 0.5519f);
                        float f23 = f19 - ((f19 - f18) * 0.5519f);
                        float f24 = f20 - ((f20 - f16) * 0.5519f);
                        float f25 = f21 - ((f21 - f18) * 0.5519f);
                        com.bytedance.adsdk.hn.qor.hnj hnjVar4 = listQor2.get(hnj(i11 - 1, listQor2.size()));
                        com.bytedance.adsdk.hn.qor.hnj hnjVar5 = listQor2.get(i11);
                        hnjVar4.hn(f17, f19);
                        hnjVar4.qor(f17, f19);
                        if (i10 == 0) {
                            mjgVarHn.hnj(f17, f19);
                        }
                        hnjVar5.hnj(f22, f23);
                        com.bytedance.adsdk.hn.qor.hnj hnjVar6 = listQor2.get(i11 + 1);
                        hnjVar5.hn(f24, f25);
                        hnjVar5.qor(f20, f21);
                        hnjVar6.hnj(f20, f21);
                        i11 += 2;
                    } else {
                        com.bytedance.adsdk.hn.qor.hnj hnjVar7 = listQor2.get(hnj(i11 - 1, listQor2.size()));
                        com.bytedance.adsdk.hn.qor.hnj hnjVar8 = listQor2.get(i11);
                        hnjVar7.hn(hnjVar2.hn().x, hnjVar2.hn().y);
                        hnjVar7.qor(hnjVar2.qor().x, hnjVar2.qor().y);
                        hnjVar8.hnj(hnjVar.hnj().x, hnjVar.hnj().y);
                        i11++;
                    }
                    i10++;
                    listQor = listQor;
                }
                return mjgVarHn;
            }
        }
        return mjgVar;
    }

    private static int hn(int i10, int i11) {
        int i12 = i10 / i11;
        return ((i10 ^ i11) >= 0 || i11 * i12 == i10) ? i12 : i12 - 1;
    }

    private static int hnj(int i10, int i11) {
        return i10 - (hn(i10, i11) * i11);
    }
}
