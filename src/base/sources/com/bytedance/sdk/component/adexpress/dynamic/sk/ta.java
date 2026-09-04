package com.bytedance.sdk.component.adexpress.dynamic.sk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta {
    public static float hnj(float f10) {
        return (float) Math.ceil((f10 * 16.0f) / 16.0f);
    }

    public static List<hn.hnj> hnj(float f10, List<hn.hnj> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<hn.hnj> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((hn.hnj) it.next().clone());
        }
        int size = arrayList.size();
        boolean z10 = true;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            hn.hnj hnjVar = (hn.hnj) obj;
            if (hnjVar.f12672hn) {
                i10 = (int) (i10 + hnjVar.hnj);
            } else {
                i11 = (int) (i11 + hnjVar.hnj);
                z10 = false;
            }
        }
        if (!z10 || f10 <= i10) {
            float f11 = i10;
            float f12 = f10 < f11 ? f10 / f11 : 1.0f;
            float f13 = f10 > f11 ? (f10 - f11) / i11 : 0.0f;
            if (f13 > 1.0f) {
                ArrayList arrayList2 = new ArrayList();
                int size2 = arrayList.size();
                boolean z11 = false;
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList.get(i13);
                    i13++;
                    hn.hnj hnjVar2 = (hn.hnj) obj2;
                    if (!hnjVar2.f12672hn) {
                        float f14 = hnjVar2.qor;
                        if (f14 != 0.0f && hnjVar2.hnj * f13 > f14) {
                            hnjVar2.hnj = f14;
                            hnjVar2.f12672hn = true;
                            z11 = true;
                        }
                    }
                    arrayList2.add(hnjVar2);
                }
                if (z11) {
                    return hnj(f10, arrayList2);
                }
            }
            int size3 = arrayList.size();
            int i14 = 0;
            int i15 = 0;
            while (i15 < size3) {
                Object obj3 = arrayList.get(i15);
                i15++;
                hn.hnj hnjVar3 = (hn.hnj) obj3;
                if (hnjVar3.f12672hn) {
                    hnjVar3.hnj = hnj(hnjVar3.hnj * f12);
                } else {
                    hnjVar3.hnj = hnj(hnjVar3.hnj * f13);
                }
                i14 = (int) (i14 + hnjVar3.hnj);
            }
            float f15 = i14;
            if (f15 < f10) {
                float f16 = f10 - f15;
                for (int size4 = 0; size4 < arrayList.size() && f16 > 0.0f; size4 = (size4 + 1) % arrayList.size()) {
                    hn.hnj hnjVar4 = (hn.hnj) arrayList.get(size4);
                    if ((f10 < f11 && hnjVar4.f12672hn) || (f10 > f11 && !hnjVar4.f12672hn)) {
                        hnjVar4.hnj += 0.0625f;
                        f16 -= 0.0625f;
                    }
                }
            }
        }
        return arrayList;
    }
}
