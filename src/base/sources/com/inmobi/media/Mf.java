package com.inmobi.media;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Mf {
    public static final Lf a(byte b10) {
        if (b10 == 1) {
            return Lf.PORTRAIT;
        }
        if (b10 == 2) {
            return Lf.REVERSE_PORTRAIT;
        }
        if (b10 == 3) {
            return Lf.LANDSCAPE;
        }
        return b10 == 4 ? Lf.REVERSE_LANDSCAPE : Lf.PORTRAIT;
    }

    public static final boolean b(Lf lf2) {
        kotlin.jvm.internal.s.h(lf2, "<this>");
        return lf2 == Lf.LANDSCAPE || lf2 == Lf.REVERSE_LANDSCAPE;
    }

    public static final int a(Lf lf2) {
        kotlin.jvm.internal.s.h(lf2, "<this>");
        int iOrdinal = lf2.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 90;
        }
        if (iOrdinal == 2) {
            return 180;
        }
        if (iOrdinal == 3) {
            return 270;
        }
        throw new NoWhenBranchMatchedException();
    }
}
