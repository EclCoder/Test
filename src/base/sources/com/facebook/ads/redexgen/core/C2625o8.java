package com.facebook.ads.redexgen.core;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.o8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2625o8 implements BY {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 11);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{13, 27, 29, 11, 12, 27, 83, 14, 18, 31, 7, 28, 31, 29, 21, 10, 21, 24, 25, 19, 83, 29, 10, 31};
    }

    public C2625o8() {
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final int A7P() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final MediaCodecInfo A7Q(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final boolean AAR(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final boolean AAS(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 15, Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE).equals(str) && A00(15, 9, Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE).equals(str2);
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final boolean AJ4() {
        return false;
    }
}
