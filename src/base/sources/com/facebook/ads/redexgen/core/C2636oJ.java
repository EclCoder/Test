package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2636oJ implements InterfaceC09683k {
    public long A03;
    public long A04;
    public C9Y A09;
    public boolean A0D;
    public boolean A0E;
    public float A01 = 1.0f;
    public float A00 = 1.0f;
    public C09663i A07 = C09663i.A05;
    public C09663i A08 = C09663i.A05;
    public C09663i A05 = C09663i.A05;
    public C09663i A06 = C09663i.A05;
    public ByteBuffer A0A = InterfaceC09683k.A00;
    public ShortBuffer A0C = this.A0A.asShortBuffer();
    public ByteBuffer A0B = InterfaceC09683k.A00;
    public int A02 = -1;

    public final long A00(long j10) {
        if (this.A04 >= 1024) {
            long jA0I = this.A03 - ((long) ((C9Y) AbstractC09823y.A01(this.A09)).A0I());
            if (this.A06.A03 == this.A05.A03) {
                long processedInputBytes = C5C.A0U(j10, jA0I, this.A04);
                return processedInputBytes;
            }
            long processedInputBytes2 = this.A06.A03;
            long j11 = jA0I * processedInputBytes2;
            long j12 = this.A04;
            long processedInputBytes3 = this.A05.A03;
            return C5C.A0U(j10, j11, j12 * processedInputBytes3);
        }
        return (long) (((double) this.A01) * j10);
    }

    public final void A01(float f10) {
        if (this.A00 != f10) {
            this.A00 = f10;
            this.A0E = true;
        }
    }

    public final void A02(float f10) {
        if (this.A01 != f10) {
            this.A01 = f10;
            this.A0E = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09683k
    public final C09663i A57(C09663i c09663i) throws C09673j {
        int i10;
        if (c09663i.A02 == 2) {
            if (this.A02 == -1) {
                i10 = c09663i.A03;
            } else {
                i10 = this.A02;
            }
            this.A07 = c09663i;
            this.A08 = new C09663i(i10, c09663i.A01, 2);
            this.A0E = true;
            return this.A08;
        }
        throw new C09673j(c09663i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09683k
    public final ByteBuffer A8d() {
        int iA0H;
        C9Y c9y = this.A09;
        if (c9y != null && (iA0H = c9y.A0H()) > 0) {
            if (this.A0A.capacity() < iA0H) {
                this.A0A = ByteBuffer.allocateDirect(iA0H).order(ByteOrder.nativeOrder());
                this.A0C = this.A0A.asShortBuffer();
            } else {
                this.A0A.clear();
                this.A0C.clear();
            }
            c9y.A0L(this.A0C);
            this.A04 += (long) iA0H;
            this.A0A.limit(iA0H);
            this.A0B = this.A0A;
        }
        ByteBuffer outputBuffer = this.A0B;
        this.A0B = InterfaceC09683k.A00;
        return outputBuffer;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09683k
    public final boolean AAL() {
        return this.A08.A03 != -1 && (Math.abs(this.A01 - 1.0f) >= 1.0E-4f || Math.abs(this.A00 - 1.0f) >= 1.0E-4f || this.A08.A03 != this.A07.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09683k
    public final boolean AAP() {
        return this.A0D && (this.A09 == null || this.A09.A0H() == 0);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09683k
    public final void AHG() {
        if (this.A09 != null) {
            this.A09.A0K();
        }
        this.A0D = true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09683k
    public final void AHH(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        C9Y c9y = (C9Y) AbstractC09823y.A01(this.A09);
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        int iRemaining = byteBuffer.remaining();
        this.A03 += (long) iRemaining;
        c9y.A0M(shortBufferAsShortBuffer);
        byteBuffer.position(byteBuffer.position() + iRemaining);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09683k
    public final void flush() {
        if (AAL()) {
            this.A05 = this.A07;
            this.A06 = this.A08;
            if (this.A0E) {
                this.A09 = new C9Y(this.A05.A03, this.A05.A01, this.A01, this.A00, this.A06.A03);
            } else if (this.A09 != null) {
                this.A09.A0J();
            }
        }
        this.A0B = InterfaceC09683k.A00;
        this.A03 = 0L;
        this.A04 = 0L;
        this.A0D = false;
    }
}
