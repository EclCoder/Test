package com.vungle.ads.internal.util;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class t {
    public static final t INSTANCE = new t();

    private t() {
    }

    public static /* synthetic */ boolean isInRange$default(t tVar, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return tVar.isInRange(i10, i11, i12);
    }

    public final boolean isInRange(float f10, float f11, float f12) {
        return f11 <= f10 && f10 <= f12;
    }

    public static /* synthetic */ boolean isInRange$default(t tVar, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f12 = Float.MAX_VALUE;
        }
        return tVar.isInRange(f10, f11, f12);
    }

    public final boolean isInRange(int i10, int i11, int i12) {
        return i11 <= i10 && i10 <= i12;
    }
}
