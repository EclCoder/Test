package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class CallableC1603Sw implements Callable<Boolean> {
    public static byte[] A02;
    public final C1602Sv A00;
    public final /* synthetic */ C1604Sx A01;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-35, -31, -43, -37, -39};
    }

    public CallableC1603Sw(C1604Sx c1604Sx, C1602Sv c1602Sv) {
        this.A01 = c1604Sx;
        this.A00 = c1602Sv;
    }

    private final Boolean A00() throws Throwable {
        if (WU.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            LX lx = new LX(this.A00.A08, this.A00.A07, this.A00.A06, A01(0, 5, Sdk$SDKError.b.ASSET_WRITE_ERROR_VALUE), this.A00.A02, this.A00.A03);
            lx.A01 = this.A00.A05;
            lx.A00 = this.A00.A04;
            if (T0.A06(this.A01.A04)) {
                C1604Sx.A0F.put(this.A00.A08, lx);
            }
            boolean precacheResult = false;
            if (this.A01.A08) {
                precacheResult = C1604Sx.A03(this.A01.A04.A02()).AIe(lx, false).A01();
            } else if (this.A01.A03.A0F(this.A00) != null) {
                precacheResult = true;
            }
            T3 t10 = this.A00.A01;
            if (t10 != null && t10.A02()) {
                int iA00 = t10.A00();
                int iA01 = t10.A01();
                if (iA00 <= 0 || iA01 <= 0) {
                    if (this.A01.A08) {
                        A04(this.A00.A08, lx);
                    } else {
                        A03(this.A00.A04, this.A00.A05);
                    }
                } else if (this.A01.A08) {
                    lx.A00 = iA00;
                    lx.A01 = iA01;
                    A04(this.A00.A08, lx);
                } else {
                    A03(iA00, iA01);
                }
            }
            return Boolean.valueOf(precacheResult);
        } catch (Throwable th2) {
            WU.A00(th2, this);
            return null;
        }
    }

    private void A03(int i10, int i11) {
        Bitmap bitmapA0G = this.A01.A03.A0G(this.A01.A04, this.A00.A08, i10, i11, this.A00.A02);
        if (bitmapA0G == null) {
            return;
        }
        this.A01.A07.put(this.A00.A08, bitmapA0G);
    }

    private void A04(String str, LX lx) {
        Bitmap bitmapA00 = C1604Sx.A03(this.A01.A04.A02()).AIe(lx, true).A00();
        if (bitmapA00 == null) {
            return;
        }
        this.A01.A07.put(str, bitmapA00);
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
