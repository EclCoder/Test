package com.facebook.ads.redexgen.core;

import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Iq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1344Iq {
    public static byte[] A03;
    public static String[] A04 = {"HAKRynb8Q9v8wV", "SuVhDSJQ2bNZpX8wX0KLsmsmTr4DPxxi", "R4UQPZj2Q3kbph", "e9pWJk1Ybkx6CP9fcYJC0x", "eiipULpIaD7vlRs8Jy7kUpOIExEcCgDN", "YpNetcItpMoyU0YUx2skn5ODY6DUrezi", "ou3Ne9sakumlTqc9WPghqVzc9J2dmBuy", "DIJExoJGQDv48UOT"};
    public static final long[] A05;
    public int A00;
    public int A01;
    public final byte[] A02 = new byte[8];

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{79, 110, 33, 119, 96, 109, 104, 101, 33, 119, 96, 115, 104, 111, 117, 33, 109, 100, 111, 102, 117, 105, 33, 108, 96, 114, 106, 33, 103, 110, 116, 111, 101};
    }

    static {
        A03();
        A05 = new long[]{128, 64, 32, 16, 8, 4, 2, 1};
    }

    public static int A00(int i10) {
        for (int i11 = 0; i11 < varIntLength; i11++) {
            if ((A05[i11] & ((long) i10)) != 0) {
                return i11 + 1;
            }
        }
        return -1;
    }

    public static long A01(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            long varint = A05[i10 - 1];
            long j11 = ~varint;
            if (A04[3].length() != 22) {
                throw new RuntimeException();
            }
            A04[1] = "UrbVUTUxAL9DS6258RCx02QNXCAhkfZP";
            j10 &= j11;
        }
        for (int i11 = 1; i11 < i10; i11++) {
            long varint2 = bArr[i11];
            j10 = (j10 << 8) | (varint2 & 255);
        }
        return j10;
    }

    public final int A04() {
        return this.A00;
    }

    public final long A05(InterfaceC2549ms interfaceC2549ms, boolean z10, boolean z11, int i10) throws IOException {
        if (this.A01 == 0) {
            if (!interfaceC2549ms.AHR(this.A02, 0, 1, z10)) {
                return -1L;
            }
            int firstByte = this.A02[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            this.A00 = A00(firstByte);
            if (this.A00 != -1) {
                this.A01 = 1;
            } else {
                throw new IllegalStateException(A02(0, 33, Sdk$SDKError.b.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            }
        }
        int firstByte2 = this.A00;
        if (firstByte2 > i10) {
            this.A01 = 0;
            return -2L;
        }
        if (this.A00 != 1) {
            interfaceC2549ms.readFully(this.A02, 1, this.A00 - 1);
        }
        this.A01 = 0;
        return A01(this.A02, this.A00, z11);
    }

    public final void A06() {
        this.A01 = 0;
        this.A00 = 0;
    }
}
