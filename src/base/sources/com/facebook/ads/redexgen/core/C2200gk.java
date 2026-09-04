package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2200gk implements InterfaceC2128fa {
    public static byte[] A04;
    public static String[] A05 = {"5xwnqBcSwQdKZIKpCxhEhIB1ehz5rbXz", "SVnny4sMHrVxDT0mCWgznsGyNwA0K29Q", "WSedDxIDZVsWQqxlis9Ww20KqcWIyEnI", "k4ruqDXMLqmQWww9EukWiXBxmglEjOwQ", "qeuUn3ZO1g9cCLbTYKy8rfCeNqsjP", "lwrAvEwGJvKZaAaN19YZU8UxJCWRUSKU", "KAMWqSOuX5oAD", "9nA6fjXGqk7Q6o3drz3rA7fb0omaCvC"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ CallableC1599Ss A02;
    public final /* synthetic */ C1600St A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 48);
            if (A05[5].charAt(12) == 'F') {
                throw new RuntimeException();
            }
            A05[5] = "k7DX94ZUmS6mjbqg2Uqpnt5MM6ksEeAZ";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        if (A05[5].charAt(12) == 'F') {
            throw new RuntimeException();
        }
        A05[4] = "84A19LE3N5skcLW3UxwckiEcHwoNq";
        A04 = new byte[]{18, 11, 8, 11, 12, 20, 11, -9, -22, -27, -26, -16};
    }

    static {
        A01();
    }

    public C2200gk(CallableC1599Ss callableC1599Ss, C1600St c1600St, long j10, long j11) {
        this.A02 = callableC1599Ss;
        this.A03 = c1600St;
        this.A00 = j10;
        this.A01 = j11;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2128fa
    public final void ADj(boolean z10) {
        if (T0.A06(this.A02.A01.A04)) {
            C1606Sz c1606Sz = new C1606Sz(this.A03.A06, this.A03.A07, A00(7, 5, 81), this.A03.A02, this.A03.A08);
            T0.A04(this.A02.A01.A04, c1606Sz, z10);
            if (!z10) {
                T0.A05(this.A02.A01.A04, this.A03.A06, this.A03.A07, this.A03.A08, A00(7, 5, 81), this.A03.A02, 2112, null, Long.valueOf(this.A00), Long.valueOf(System.currentTimeMillis() - this.A01), null);
            }
            C1604Sx.A0A().put(c1606Sz.A04, c1606Sz);
        }
        try {
            this.A02.A00.put(true);
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2128fa
    public final void ADr(Throwable th2) {
        if (T0.A06(this.A02.A01.A04)) {
            T0.A05(this.A02.A01.A04, this.A03.A06, this.A03.A07, this.A03.A08, A00(7, 5, 81), this.A03.A02, 2119, th2 != null ? th2.toString() : A00(0, 7, 109), null, Long.valueOf(System.currentTimeMillis() - this.A01), null);
        }
        try {
            this.A02.A00.put(false);
        } catch (InterruptedException unused) {
        }
    }
}
