package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9t, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class C9t extends Timeline {
    public final Timeline A00;

    public C9t(Timeline timeline) {
        this.A00 = timeline;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A06() {
        return this.A00.A06();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A07() {
        return this.A00.A07();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public int A08(int i10, int i11, boolean z10) {
        return this.A00.A08(i10, i11, z10);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public int A0A(Object obj) {
        return this.A00.A0A(obj);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0B(boolean z10) {
        return this.A00.A0B(z10);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0C(boolean z10) {
        return this.A00.A0C(z10);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public C2725pl A0I(int i10, C2725pl c2725pl, boolean z10) {
        return this.A00.A0I(i10, c2725pl, z10);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public C2723pj A0L(int i10, C2723pj c2723pj, long j10) {
        return this.A00.A0L(i10, c2723pj, j10);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public Object A0M(int i10) {
        return this.A00.A0M(i10);
    }
}
