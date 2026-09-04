package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2477lW implements InterfaceC1400Kv {
    public static byte[] A0C;
    public static String[] A0D = {"zgZfEJGGgdHtew2g1FfNkkcnB", "zHXWmVVfspRqZTFEHweYGYwJXvEszQMx", "7abqffqd10TBp3FWdGN7VvMrN7O1UkYM", "p0MVW5l5", "JyEkXe6y14TztCHpc8kpfDGRXJv0nuKA", "euIGF7oBB7KZa", "ak0CBs2Ex4lMz9dSuXO", "PviIixxcvW6ZcpMh0sztGl9"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public C2758qI A05;
    public InterfaceC1305Hd A06;
    public String A07;
    public boolean A08;
    public final C10044u A09;
    public final C10054v A0A;
    public final String A0B;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{40, 60, 45, 32, 38, 102, 40, 42, 122};
    }

    static {
        A02();
    }

    public C2477lW() {
        this(null);
    }

    public C2477lW(String str) {
        this.A09 = new C10044u(new byte[128]);
        this.A0A = new C10054v(this.A09.A00);
        this.A02 = 0;
        this.A04 = C.TIME_UNSET;
        this.A0B = str;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006a  */
    /* JADX WARN: Code duplicated, block: B:16:0x00a4  */
    @RequiresNonNull({"output"})
    private void A01() {
        C09492p c09492pA0j;
        this.A09.A08(0);
        C1292Gq c1292GqA09 = AbstractC1293Gr.A09(this.A09);
        if (this.A05 != null) {
            int i10 = c1292GqA09.A01;
            int i11 = this.A05.A06;
            String[] strArr = A0D;
            if (strArr[2].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[0] = "s5ZnNr7Ga7MlLfd70p6uFHM8x";
            strArr2[5] = "utwzV9oXgtTkd";
            if (i10 == i11) {
                int i12 = c1292GqA09.A04;
                String[] strArr3 = A0D;
                if (strArr3[4].charAt(13) == strArr3[1].charAt(13)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0D;
                strArr4[2] = "MPTvnFyqCCYkwFwXTKwYW3O2KaIbPHbI";
                strArr4[6] = "dVnQ4greYxNN5pQgdCf";
                if (i12 != this.A05.A0G || !C5C.A1E(c1292GqA09.A06, this.A05.A0W)) {
                    c09492pA0j = new C09492p().A0y(this.A07).A11(c1292GqA09.A06).A0b(c1292GqA09.A01).A0m(c1292GqA09.A04).A10(this.A0B).A0j(c1292GqA09.A00);
                    if (A00(0, 9, 31).equals(c1292GqA09.A06)) {
                        c09492pA0j.A0a(c1292GqA09.A00);
                    }
                    this.A05 = c09492pA0j.A14();
                    this.A06.A6e(this.A05);
                }
            } else {
                c09492pA0j = new C09492p().A0y(this.A07).A11(c1292GqA09.A06).A0b(c1292GqA09.A01).A0m(c1292GqA09.A04).A10(this.A0B).A0j(c1292GqA09.A00);
                if (A00(0, 9, 31).equals(c1292GqA09.A06)) {
                    c09492pA0j.A0a(c1292GqA09.A00);
                }
                this.A05 = c09492pA0j.A14();
                this.A06.A6e(this.A05);
            }
        } else {
            c09492pA0j = new C09492p().A0y(this.A07).A11(c1292GqA09.A06).A0b(c1292GqA09.A01).A0m(c1292GqA09.A04).A10(this.A0B).A0j(c1292GqA09.A00);
            if (A00(0, 9, 31).equals(c1292GqA09.A06)) {
                c09492pA0j.A0a(c1292GqA09.A00);
            }
            this.A05 = c09492pA0j.A14();
            this.A06.A6e(this.A05);
        }
        this.A01 = c1292GqA09.A02;
        this.A03 = (((long) c1292GqA09.A03) * 1000000) / ((long) this.A05.A0G);
    }

    private boolean A03(C10054v c10054v) {
        while (true) {
            if (c10054v.A07() <= 0) {
                return false;
            }
            boolean z10 = this.A08;
            if (A0D[3].length() != 8) {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[4] = "9XFIg7618hJvvA4xETZzayJ4sl88kXfd";
            strArr[1] = "F6kFQyxnROPq81yNs7RnOkiGPjgAvEmB";
            if (!z10) {
                this.A08 = c10054v.A0I() == 11;
            } else {
                int iA0I = c10054v.A0I();
                if (iA0I == 119) {
                    this.A08 = false;
                    return true;
                }
                this.A08 = iA0I == 11;
            }
        }
    }

    private boolean A04(C10054v c10054v, byte[] bArr, int i10) {
        int iMin = Math.min(c10054v.A07(), i10 - this.A00);
        int bytesToRead = this.A00;
        c10054v.A0k(bArr, bytesToRead, iMin);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + iMin;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1400Kv
    public final void A5A(C10054v c10054v) {
        AbstractC09823y.A02(this.A06);
        while (c10054v.A07() > 0) {
            int i10 = this.A02;
            String[] strArr = A0D;
            if (strArr[0].length() != strArr[5].length()) {
                String[] strArr2 = A0D;
                strArr2[0] = "xuhMWsLm7IhyfpFjlZpQdmw9F";
                strArr2[5] = "BOgMYXTSIypYk";
                switch (i10) {
                    case 0:
                        if (A03(c10054v)) {
                            this.A02 = 1;
                            this.A0A.A0l()[0] = 11;
                            this.A0A.A0l()[1] = 119;
                            this.A00 = 2;
                        }
                        break;
                    case 1:
                        if (A04(c10054v, this.A0A.A0l(), 128)) {
                            A01();
                            this.A0A.A0f(0);
                            this.A06.AIr(this.A0A, 128);
                            this.A02 = 2;
                        }
                        break;
                    case 2:
                        int iMin = Math.min(c10054v.A07(), this.A01 - this.A00);
                        this.A06.AIr(c10054v, iMin);
                        this.A00 += iMin;
                        if (this.A00 == this.A01) {
                            if (this.A04 != C.TIME_UNSET) {
                                this.A06.AIu(this.A04, 1, this.A01, 0, null);
                                this.A04 += this.A03;
                            }
                            this.A02 = 0;
                        }
                        break;
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1400Kv
    public final void A5c(HA ha2, LG lg2) {
        lg2.A05();
        this.A07 = lg2.A04();
        this.A06 = ha2.AKS(lg2.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1400Kv
    public final void AGp() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1400Kv
    public final void AGq(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.A04 = j10;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1400Kv
    public final void AJ5() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
        this.A04 = C.TIME_UNSET;
    }
}
