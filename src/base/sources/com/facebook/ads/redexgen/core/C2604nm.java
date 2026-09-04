package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2604nm implements DT, DU {
    public final int A00;
    public final /* synthetic */ C11219p A01;

    public C2604nm(C11219p c11219p, int i10) {
        this.A01 = c11219p;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.core.DU
    @MetaExoPlayerCustomization("Added in D21840558 for FBVP")
    public final long A89() {
        return this.A01.A0L[this.A00].A0S();
    }

    @Override // com.facebook.ads.redexgen.core.DT
    public final boolean AAe() {
        return this.A01.A0f(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.DT
    public final void ACR() throws IOException {
        this.A01.A0d(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.DT
    public final int AHP(C10616z c10616z, C2679p0 c2679p0, int i10) {
        return this.A01.A0Y(this.A00, c10616z, c2679p0, i10);
    }

    @Override // com.facebook.ads.redexgen.core.DT
    public final int AK2(long j10) {
        return this.A01.A0X(this.A00, j10);
    }
}
