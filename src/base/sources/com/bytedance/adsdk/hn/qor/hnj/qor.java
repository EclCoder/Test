package com.bytedance.adsdk.hn.qor.hnj;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor extends mjg<com.bytedance.adsdk.hn.qor.hn.gjv, com.bytedance.adsdk.hn.qor.hn.gjv> {
    public qor(List<com.bytedance.adsdk.hn.dse.hnj<com.bytedance.adsdk.hn.qor.hn.gjv>> list) {
        super(hnj(list));
    }

    private static List<com.bytedance.adsdk.hn.dse.hnj<com.bytedance.adsdk.hn.qor.hn.gjv>> hnj(List<com.bytedance.adsdk.hn.dse.hnj<com.bytedance.adsdk.hn.qor.hn.gjv>> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.set(i10, hnj(list.get(i10)));
        }
        return list;
    }

    @Override // com.bytedance.adsdk.hn.qor.hnj.mjg, com.bytedance.adsdk.hn.qor.hnj.orl
    public /* bridge */ /* synthetic */ boolean hn() {
        return super.hn();
    }

    @Override // com.bytedance.adsdk.hn.qor.hnj.mjg, com.bytedance.adsdk.hn.qor.hnj.orl
    public /* bridge */ /* synthetic */ List qor() {
        return super.qor();
    }

    @Override // com.bytedance.adsdk.hn.qor.hnj.mjg
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    private static com.bytedance.adsdk.hn.dse.hnj<com.bytedance.adsdk.hn.qor.hn.gjv> hnj(com.bytedance.adsdk.hn.dse.hnj<com.bytedance.adsdk.hn.qor.hn.gjv> hnjVar) {
        com.bytedance.adsdk.hn.qor.hn.gjv gjvVar = hnjVar.hnj;
        com.bytedance.adsdk.hn.qor.hn.gjv gjvVar2 = hnjVar.f11946hn;
        if (gjvVar == null || gjvVar2 == null || gjvVar.hnj().length == gjvVar2.hnj().length) {
            return hnjVar;
        }
        float[] fArrHnj = hnj(gjvVar.hnj(), gjvVar2.hnj());
        return hnjVar.hnj(gjvVar.hnj(fArrHnj), gjvVar2.hnj(fArrHnj));
    }

    static float[] hnj(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f10 = Float.NaN;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            float f11 = fArr3[i11];
            if (f11 != f10) {
                fArr3[i10] = f11;
                i10++;
                f10 = fArr3[i11];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i10);
    }

    @Override // com.bytedance.adsdk.hn.qor.hnj.orl
    public com.bytedance.adsdk.hn.hnj.hn.hnj<com.bytedance.adsdk.hn.qor.hn.gjv, com.bytedance.adsdk.hn.qor.hn.gjv> hnj() {
        return new com.bytedance.adsdk.hn.hnj.hn.sk(this.hnj);
    }
}
