package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.am, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2844am {
    public static final int a(String str) {
        kotlin.jvm.internal.s.h(str, "<this>");
        try {
            List listF0 = bm.r.F0(str, new String[]{":", "."}, false, 4, 2, null);
            int i10 = Integer.parseInt((String) listF0.get(0));
            int i11 = Integer.parseInt((String) listF0.get(1));
            return (((i11 * 60) + (i10 * 3600) + Integer.parseInt((String) listF0.get(2))) * 1000) + (listF0.size() == 4 ? Integer.parseInt((String) listF0.get(3)) : 0);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final List a(String trackerType, ArrayList arrayList) {
        kotlin.jvm.internal.s.h(trackerType, "trackerType");
        if (arrayList == null) {
            return gl.r.l();
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            if (kotlin.jvm.internal.s.c(((De) obj).f24653b, trackerType)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(gl.r.v(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            arrayList3.add(((De) obj2).f24652a);
        }
        return arrayList3;
    }
}
