package com.inmobi.media;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class P implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        J6 j10 = (J6) obj2;
        J6 j11 = (J6) obj;
        return jl.a.a(Integer.valueOf(j10.f25049c * j10.f25050d), Integer.valueOf(j11.f25049c * j11.f25050d));
    }
}
