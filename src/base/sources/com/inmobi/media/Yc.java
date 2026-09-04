package com.inmobi.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Yc {
    public static final List a(Zc zc2) {
        ArrayList arrayList;
        kotlin.jvm.internal.s.h(zc2, "<this>");
        Cl cl2 = zc2.f26138a;
        if (cl2 != null) {
            ArrayList arrayList2 = cl2.f24626b;
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                if (kotlin.jvm.internal.s.c(((De) obj).f24653b, CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
                    arrayList3.add(obj);
                }
            }
            arrayList = new ArrayList(gl.r.v(arrayList3, 10));
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                arrayList.add(((De) obj2).f24652a);
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? gl.r.l() : arrayList;
    }
}
