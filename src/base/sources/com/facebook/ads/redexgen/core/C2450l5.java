package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2450l5 implements L8 {
    public final C10044u A00 = new C10044u(new byte[4]);
    public final /* synthetic */ C2448l3 A01;

    public C2450l5(C2448l3 c2448l3) {
        this.A01 = c2448l3;
    }

    @Override // com.facebook.ads.redexgen.core.L8
    public final void A5A(C10054v c10054v) {
        int tableId = c10054v.A0I();
        if (tableId != 0) {
            return;
        }
        int tableId2 = c10054v.A0I();
        if ((tableId2 & 128) == 0) {
            return;
        }
        c10054v.A0g(6);
        int iA07 = c10054v.A07() / 4;
        for (int i10 = 0; i10 < iA07; i10++) {
            c10054v.A0h(this.A00, 4);
            int programCount = this.A00.A04(16);
            this.A00.A09(3);
            if (programCount == 0) {
                this.A00.A09(13);
            } else {
                int iA04 = this.A00.A04(13);
                if (this.A01.A0B.get(iA04) == null) {
                    this.A01.A0B.put(iA04, new C2454l9(new C2449l4(this.A01, iA04)));
                    C2448l3.A02(this.A01);
                }
            }
        }
        int secondHeaderByte = this.A01.A09;
        if (secondHeaderByte != 2) {
            this.A01.A0B.remove(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.L8
    public final void AAA(AnonymousClass53 anonymousClass53, HA ha2, LG lg2) {
    }
}
