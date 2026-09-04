package com.inmobi.media;

import android.graphics.Color;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class D3 {
    public static final int a(int[] iArr) {
        kotlin.jvm.internal.s.h(iArr, "<this>");
        if (iArr.length != 4) {
            return -16777216;
        }
        return Color.argb(iArr[0], iArr[1], iArr[2], iArr[3]);
    }
}
