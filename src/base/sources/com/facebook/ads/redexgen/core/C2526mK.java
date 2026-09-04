package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.extractor.mkv.MatroskaExtractor;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2526mK implements InterfaceC1338Ik {
    public final /* synthetic */ MatroskaExtractor A00;

    public C2526mK(MatroskaExtractor matroskaExtractor) {
        this.A00 = matroskaExtractor;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1338Ik
    public final void A4i(int i10, int i11, InterfaceC2549ms interfaceC2549ms) throws IOException {
        this.A00.A0U(i10, i11, interfaceC2549ms);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1338Ik
    public final void A6N(int i10) throws C3K {
        this.A00.A0S(i10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1338Ik
    public final void A6a(int i10, double d10) throws C3K {
        this.A00.A0T(i10, d10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1338Ik
    public final int A7u(int i10) {
        return this.A00.A0R(i10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1338Ik
    public final void AAH(int i10, long j10) throws C3K {
        this.A00.A0V(i10, j10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1338Ik
    public final boolean AAW(int i10) {
        return this.A00.A0Y(i10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1338Ik
    public final void AK9(int i10, long j10, long j11) throws C3K {
        this.A00.A0W(i10, j10, j11);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1338Ik
    public final void AKK(int i10, String str) throws C3K {
        this.A00.A0X(i10, str);
    }
}
