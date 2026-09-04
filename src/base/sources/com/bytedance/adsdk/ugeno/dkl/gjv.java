package com.bytedance.adsdk.ugeno.dkl;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {
    public static int hnj(boolean z10, int i10, int i11) {
        if (i11 == 0 || !z10) {
            return i10;
        }
        int i12 = i10 - 512;
        int iAbs = Math.abs(i12) % i11;
        return (i12 >= 0 || iAbs == 0) ? iAbs : i11 - iAbs;
    }

    public static boolean hnj(int i10, Collection<?> collection) {
        return i10 >= 0 && i10 < collection.size();
    }
}
