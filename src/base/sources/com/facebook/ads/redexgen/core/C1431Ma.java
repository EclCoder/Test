package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1431Ma implements InterfaceC2047eG {
    public static byte[] A01;
    public static String[] A02 = {"eg4OuzmozbdBw8OpfnEQ9S5WXV0sj4Z8", "rcCmLv", "J9fwVwM4lsi34p", "AlJIDEMCKinwW9CsIljPKEg77fEpV28V", "eGLouwRxqegMv8vZbxB0WI", "SMn3POGOAwCpVf", "x8sqAERQ", "K7z6bhBLHSjzf8oEEyEGbL"};
    public final /* synthetic */ MW A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-22, -24, -38, -25, -40, -31, -34, -40, -32};
    }

    static {
        A01();
    }

    public C1431Ma(MW mw) {
        this.A00 = mw;
    }

    public /* synthetic */ C1431Ma(MW mw, C1443Mm c1443Mm) {
        this(mw);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2047eG
    public final void ADX() {
        this.A00.A0V(true, A00(0, 9, 3));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2047eG
    public final void AEA() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2047eG
    public final void AEh() {
        if (!this.A00.A0H.A0b()) {
            this.A00.A0N();
            return;
        }
        MW mw = this.A00;
        String[] strArr = A02;
        if (strArr[3].charAt(22) == strArr[0].charAt(22)) {
            throw new RuntimeException();
        }
        A02[1] = "uysARHPfhmw6aS";
        mw.A0S.set(true);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2047eG
    public final void AFQ() {
        this.A00.AFA(false);
        this.A00.A0Q.A0E(8);
        this.A00.A0J.A0F().AFH();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2047eG
    public final void AGg() {
        this.A00.A0O.ADJ(15);
    }
}
