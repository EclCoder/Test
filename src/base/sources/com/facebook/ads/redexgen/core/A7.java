package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class A7 extends AbstractC2643oQ {
    public int[] A00;
    public int[] A01;

    @Override // com.facebook.ads.redexgen.core.AbstractC2643oQ
    public final C09663i A09(C09663i c09663i) throws C09673j {
        int[] iArr = this.A01;
        if (iArr == null) {
            return C09663i.A05;
        }
        if (c09663i.A02 == 2) {
            int i10 = c09663i.A01 != iArr.length ? 1 : 0;
            int i11 = 0;
            while (i11 < iArr.length) {
                int i12 = iArr[i11];
                if (i12 < c09663i.A01) {
                    i10 |= i12 != i11 ? 1 : 0;
                    i11++;
                } else {
                    throw new C09673j(c09663i);
                }
            }
            if (i10 != 0) {
                return new C09663i(c09663i.A03, iArr.length, 2);
            }
            return C09663i.A05;
        }
        throw new C09673j(c09663i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2643oQ
    public final void A0A() {
        this.A00 = this.A01;
    }

    public final void A0C(int[] iArr) {
        this.A01 = iArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09683k
    public final void AHH(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) AbstractC09823y.A01(this.A00);
        int iPosition = byteBuffer.position();
        int outputSize = byteBuffer.limit();
        int position = outputSize - iPosition;
        ByteBuffer byteBufferA00 = A00(this.A06.A00 * (position / this.A05.A00));
        while (iPosition < outputSize) {
            for (int i10 : iArr) {
                byteBufferA00.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.A05.A00;
        }
        byteBuffer.position(outputSize);
        byteBufferA00.flip();
    }
}
