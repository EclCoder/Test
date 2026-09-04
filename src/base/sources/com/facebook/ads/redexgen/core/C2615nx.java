package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2615nx implements CH {
    public static byte[] A08;
    public static String[] A09 = {"6Pd6msxcVNGBSX02eJXjJuTK1755qRBj", "HohFYYIoFYVFLjySAriRsbI1EyK3MfzH", "CeUiguCmFwn8TW5CDLSIDkbyI8ACimQb", "zlyrIOO0KfkMjpYTb9psfC0NNgHcfA", "hplEZcFLtp2y3xCWfrXOGnyD7Ln2K5MA", "IDL7x3RfZufseciwLxrhiUDjrsxZNied", "XKrD5ajpOT4k5Fxpc35DaF0adCV7zARl", "Sdgzg0MlhPfZZU1TENhiXzUXxxUExQMT"};
    public CG A00;
    public final AbstractC09633d A01;
    public final C10185i A02;
    public final C8B A03;
    public final C1435Me A04;
    public final Executor A05;
    public volatile AbstractRunnableFutureC10084y<Void, IOException> A06;
    public volatile boolean A07;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A09;
            if (strArr[5].charAt(20) == strArr[2].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A09;
            strArr2[1] = "fxMtGUUqqO78zEEYN3IhZEPjI2AJG4xW";
            strArr2[6] = "cS7s2KNWeBHf1m4W4BuqIbsBl519HGHJ";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 68);
            i13++;
        }
    }

    public static void A02() {
        A08 = new byte[]{31, 34, 34, 28, 30, 27, 15, 17, 17, 16, 12, -1, 7, 9, 16, -1};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.CH
    public final void A63(CG cg2) throws InterruptedException, IOException {
        this.A00 = cg2;
        if (0 != 0) {
            throw new NullPointerException(A01(0, 3, Sdk$SDKError.b.INVALID_ADS_ENDPOINT_VALUE));
        }
        boolean z10 = false;
        while (!z10) {
            try {
                if (this.A07) {
                    break;
                }
                this.A06 = new C2616ny(this);
                if (0 != 0) {
                    throw new NullPointerException(A01(3, 7, 104));
                }
                this.A05.execute(this.A06);
                try {
                    this.A06.get();
                    z10 = true;
                } catch (ExecutionException e10) {
                    Throwable th2 = (Throwable) AbstractC09823y.A01(e10.getCause());
                    if (0 == 0) {
                        if (th2 instanceof IOException) {
                            throw ((IOException) th2);
                        }
                        C5C.A11(th2);
                        throw null;
                    }
                }
            } catch (Throwable th3) {
                ((AbstractRunnableFutureC10084y) AbstractC09823y.A01(this.A06)).A02();
                if (0 == 0) {
                    throw th3;
                }
                throw new NullPointerException(A01(10, 6, 86));
            }
        }
        ((AbstractRunnableFutureC10084y) AbstractC09823y.A01(this.A06)).A02();
        if (0 != 0) {
            throw new NullPointerException(A01(10, 6, 86));
        }
    }

    static {
        A02();
    }

    public C2615nx(C2747q7 c2747q7, C2414kT c2414kT, Executor executor) {
        this.A05 = (Executor) AbstractC09823y.A01(executor);
        AbstractC09823y.A01(c2747q7.A03);
        this.A02 = new C10155f().A06(c2747q7.A03.A00).A08(c2747q7.A03.A04).A02(4).A09();
        this.A03 = c2414kT.A07();
        this.A04 = new C1435Me(this.A03, this.A02, null, new InterfaceC1434Md() { // from class: com.facebook.ads.redexgen.X.nz
            @Override // com.facebook.ads.redexgen.core.InterfaceC1434Md
            public final void AFX(long j10, long j11, long j12) {
                this.A00.A03(j10, j11, j12);
            }
        });
        this.A01 = c2414kT.A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(long j10, long j11, long j12) {
        float f10;
        if (this.A00 == null) {
            return;
        }
        if (j10 == -1 || j10 == 0) {
            f10 = -1.0f;
        } else {
            f10 = (j11 * 100.0f) / j10;
        }
        this.A00.AFW(j10, j11, f10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4y != com.facebook.ads.androidx.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException> */
    @Override // com.facebook.ads.redexgen.core.CH
    public final void cancel() {
        this.A07 = true;
        AbstractRunnableFutureC10084y<Void, IOException> abstractRunnableFutureC10084y = this.A06;
        if (abstractRunnableFutureC10084y != null) {
            abstractRunnableFutureC10084y.cancel(true);
        }
    }

    @Override // com.facebook.ads.redexgen.core.CH
    public final void remove() {
        this.A03.A0E().AIU(this.A03.A0F().A4l(this.A02));
    }
}
