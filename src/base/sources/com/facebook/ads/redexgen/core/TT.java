package com.facebook.ads.redexgen.core;

import android.os.Process;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class TT implements Thread.UncaughtExceptionHandler {
    public static byte[] A04;
    public final C2194ge A00;
    public final InterfaceC1607Ta A01;
    public final Thread.UncaughtExceptionHandler A02;
    public final Map<String, String> A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 48);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-79, -51, -102, -74, -64, -64, -74, -69, -76, 109, -112, -68, -69, -63, -78, -59, -63, -102, -90, -92, 101, -99, -104, -102, -100, -103, -90, -90, -94, 101, -104, -101, -86, 2, 17, 0, 18, 7, 7, 9, -10, 8, 13, 4, -7, -20, -18, -37, -19, -14, -23, -34, -40, -36, -24, -35, -34};
    }

    public TT(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C2194ge c2194ge, TS ts) {
        this(uncaughtExceptionHandler, c2194ge, ts, AbstractC1608Tb.A00());
    }

    public TT(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C2194ge c2194ge, TS ts, InterfaceC1607Ta interfaceC1607Ta) {
        this.A02 = uncaughtExceptionHandler;
        if (c2194ge != null) {
            this.A00 = c2194ge;
            this.A03 = ts.A97(c2194ge);
            this.A01 = interfaceC1607Ta;
            return;
        }
        throw new IllegalArgumentException(A00(2, 15, 29));
    }

    public static void A02() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    private void A03(Thread thread, Throwable th2) {
        if (this.A02 != null) {
            this.A02.uncaughtException(thread, th2);
        } else {
            A02();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        try {
            String strA03 = AbstractC1725Xt.A03(this.A00, th2);
            if (!TextUtils.isEmpty(strA03)) {
                String stackTraceString = A00(17, 16, 7);
                if (strA03.contains(stackTraceString)) {
                    Map<String, String> mapA02 = new TR(strA03, this.A03).A02();
                    String strA00 = A00(38, 7, 100);
                    String stackTraceString2 = A00(33, 5, 111);
                    mapA02.put(strA00, stackTraceString2);
                    Throwable thA00 = WP.A00();
                    String strA01 = A00(45, 12, 73);
                    if (thA00 == th2) {
                        String stackTraceString3 = A00(1, 1, 108);
                        mapA02.put(strA01, stackTraceString3);
                    } else {
                        String stackTraceString4 = A00(0, 1, 81);
                        mapA02.put(strA01, stackTraceString4);
                    }
                    this.A01.AL7(new C1614Th(this.A00.A09().A01(), this.A00.A09().A02(), mapA02), this.A00);
                    if (C1648Up.A2A(this.A00)) {
                        C1648Up.A0e(this.A00);
                    }
                }
            }
        } catch (Exception unused) {
        }
        A03(thread, th2);
    }
}
