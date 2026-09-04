package com.google.common.primitives;

import sc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static int a(byte[] bArr, byte[] bArr2) {
        p.p(bArr, "array");
        p.p(bArr2, "target");
        if (bArr2.length == 0) {
            return 0;
        }
        for (int i10 = 0; i10 < (bArr.length - bArr2.length) + 1; i10++) {
            for (int i11 = 0; i11 < bArr2.length; i11++) {
                if (bArr[i10 + i11] != bArr2[i11]) {
                }
            }
            return i10;
        }
        return -1;
    }
}
