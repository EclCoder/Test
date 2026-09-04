package com.facebook.ads.redexgen.core;

import android.net.TrafficStats;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Su, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class CallableC1601Su implements Callable<Boolean> {
    public static byte[] A02;
    public final C1600St A00;
    public final /* synthetic */ C1604Sx A01;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-34, -46, -29, -36, -26, -31, -25, -38, -43, -42, -32};
    }

    public CallableC1601Su(C1604Sx c1604Sx, C1600St c1600St) {
        this.A01 = c1604Sx;
        this.A00 = c1600St;
    }

    private final Boolean A00() throws Throwable {
        String strA01;
        if (WU.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            if (this.A00.A04) {
                strA01 = A01(0, 6, 72);
            } else {
                strA01 = A01(6, 5, 72);
            }
            String str = this.A00.A08;
            String creativeType = this.A00.A07;
            LX lx = new LX(str, creativeType, this.A00.A06, strA01, this.A00.A02, this.A00.A05);
            lx.A04 = this.A00.A03;
            lx.A02 = this.A00.A01;
            lx.A05 = this.A00.A04;
            if (T0.A06(this.A01.A04)) {
                C1604Sx.A0F.put(this.A00.A08, lx);
            }
            return Boolean.valueOf(C1604Sx.A03(this.A01.A04.A02()).AIg(lx) != null);
        } catch (Throwable th2) {
            WU.A00(th2, this);
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        if (WU.A02(this)) {
            return null;
        }
        try {
            return A00();
        } catch (Throwable th2) {
            WU.A00(th2, this);
            return null;
        }
    }
}
