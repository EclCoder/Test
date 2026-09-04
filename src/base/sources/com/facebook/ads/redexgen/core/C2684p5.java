package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2684p5 extends C10115b {
    public static byte[] A02;
    public final int A00;
    public final C10185i A01;

    static {
        A06();
    }

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A02 = new byte[]{-39, -30, -37, -41, -24, -22, -37, -18, -22, -92, -96, -28, -27, -22, -106, -26, -37, -24, -29, -33, -22, -22, -37, -38, -92, -96};
    }

    public C2684p5(C10185i c10185i, int i10, int i11) {
        super(A03(i10, i11));
        this.A01 = c10185i;
        this.A00 = i11;
    }

    public C2684p5(IOException iOException, C10185i c10185i, int i10, int i11) {
        super(iOException, A03(i10, i11));
        this.A01 = c10185i;
        this.A00 = i11;
    }

    public C2684p5(String str, C10185i c10185i, int i10, int i11) {
        super(str, A03(i10, i11));
        this.A01 = c10185i;
        this.A00 = i11;
    }

    public C2684p5(String str, IOException iOException, C10185i c10185i, int i10, int i11) {
        super(str, iOException, A03(i10, i11));
        this.A01 = c10185i;
        this.A00 = i11;
    }

    public static int A03(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    public static C2684p5 A04(IOException iOException, C10185i c10185i, int i10) {
        int errorCode;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            errorCode = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            errorCode = 1004;
        } else if (message != null) {
            String strA01 = AbstractC2393k7.A01(message);
            String message2 = A05(0, 26, 62);
            if (strA01.matches(message2)) {
                errorCode = 2007;
            } else {
                errorCode = 2001;
            }
        } else {
            errorCode = 2001;
        }
        if (errorCode == 2007) {
            return new AM(iOException, c10185i);
        }
        return new C2684p5(iOException, c10185i, errorCode, i10);
    }
}
