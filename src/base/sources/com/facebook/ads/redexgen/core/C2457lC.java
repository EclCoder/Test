package com.facebook.ads.redexgen.core;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2457lC extends H2 {
    public C2457lC(AnonymousClass53 anonymousClass53, long j10, long j11) {
        super(new C2555mz(), new C2458lD(anonymousClass53), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    public static int A00(byte[] bArr, int i10) {
        return ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }
}
