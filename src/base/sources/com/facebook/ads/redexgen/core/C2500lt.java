package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2500lt extends AbstractC1354Jb {
    public static byte[] A05;
    public static String[] A06 = {"uV3egKqPt", "vbtXlOI", "gip2ILD7nBGTUOP5yb7zSULibNYEk", "ypzju5tbq0Qdtgd67o3qNaulkzBfCJSX", "gCa1Tkio4U0hXnRqOcWVPONwWAtrpMS5", "m", "OXoEHzgO5FTzqO33f", "i"};
    public int A00;
    public C1309Hh A01;
    public C1311Hj A02;
    public C1355Jc A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C1355Jc A02(C10054v c10054v) throws IOException {
        if (this.A02 == null) {
            this.A02 = AbstractC1312Hk.A06(c10054v);
            return null;
        }
        if (this.A01 == null) {
            this.A01 = AbstractC1312Hk.A04(c10054v);
            return null;
        }
        C1311Hj c1311Hj = this.A02;
        C1309Hh c1309Hh = this.A01;
        byte[] bArr = new byte[c10054v.A0A()];
        System.arraycopy(c10054v.A0l(), 0, bArr, 0, c10054v.A0A());
        C1310Hi[] c1310HiArrA0D = AbstractC1312Hk.A0D(c10054v, c1311Hj.A05);
        return new C1355Jc(c1311Hj, c1309Hh, bArr, c1310HiArrA0D, AbstractC1312Hk.A00(c1310HiArrA0D.length - 1));
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-108, -88, -105, -100, -94, 98, -87, -94, -91, -107, -100, -90};
    }

    static {
        A04();
    }

    public static int A00(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static int A01(byte b10, C1355Jc c1355Jc) {
        if (!c1355Jc.A04[A00(b10, c1355Jc.A00, 1)].A03) {
            int modeNumber = c1355Jc.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = c1355Jc.A02.A04;
        return modeNumber2;
    }

    public static void A05(C10054v c10054v, long j10) {
        if (c10054v.A08() < c10054v.A0A() + 4) {
            c10054v.A0i(Arrays.copyOf(c10054v.A0l(), c10054v.A0A() + 4));
        } else {
            c10054v.A0e(c10054v.A0A() + 4);
        }
        byte[] bArrA0l = c10054v.A0l();
        bArrA0l[c10054v.A0A() - 4] = (byte) (j10 & 255);
        bArrA0l[c10054v.A0A() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrA0l[c10054v.A0A() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrA0l[c10054v.A0A() - 1] = (byte) (255 & (j10 >>> 24));
    }

    public static boolean A06(C10054v c10054v) {
        try {
            return AbstractC1312Hk.A0C(1, c10054v, true);
        } catch (C3K unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1354Jb
    public final long A09(C10054v c10054v) {
        int i10 = 0;
        if ((c10054v.A0l()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = c10054v.A0l()[0];
        if (A06[4].charAt(1) != 'C') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[0] = "17tCp0Qcd";
        strArr[6] = "uqZ30DdcDRhFwj0kQ";
        int samplesInPacket = A01(b10, (C1355Jc) AbstractC09823y.A02(this.A03));
        if (this.A04) {
            int packetBlockSize = this.A00;
            i10 = (packetBlockSize + samplesInPacket) / 4;
        }
        A05(c10054v, i10);
        this.A04 = true;
        this.A00 = samplesInPacket;
        return i10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1354Jb
    public final void A0A(long j10) {
        super.A0A(j10);
        this.A04 = j10 != 0;
        this.A00 = this.A02 != null ? this.A02.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1354Jb
    public final void A0B(boolean z10) {
        super.A0B(z10);
        if (z10) {
            this.A03 = null;
            this.A02 = null;
            this.A01 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1354Jb
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0C(C10054v c10054v, long j10, C1353Ja c1353Ja) throws IOException {
        if (this.A03 != null) {
            AbstractC09823y.A01(c1353Ja.A00);
            return false;
        }
        this.A03 = A02(c10054v);
        if (this.A03 == null) {
            return true;
        }
        C1355Jc c1355Jc = this.A03;
        C1311Hj c1311Hj = c1355Jc.A02;
        ArrayList<byte[]> codecInitializationData = new ArrayList<>();
        codecInitializationData.add(c1311Hj.A09);
        codecInitializationData.add(c1355Jc.A03);
        c1353Ja.A00 = new C09492p().A11(A03(0, 12, 22)).A0a(c1311Hj.A02).A0j(c1311Hj.A00).A0b(c1311Hj.A05).A0m(c1311Hj.A06).A12(codecInitializationData).A0v(AbstractC1312Hk.A02(MetaExoPlayerCustomizedCollections.A02(c1355Jc.A01.A02))).A14();
        return true;
    }
}
