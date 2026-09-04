package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization("non-final in Fb vs final in Exo since TigonDataSource uses FailoverStreamDryException that extends this exception")
public class AK extends C2684p5 {
    public static byte[] A04;
    public final int A00;
    public final String A01;
    public final Map<String, List<String>> A02;
    public final byte[] A03;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 101);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{16, 39, 49, 50, 45, 44, 49, 39, 98, 33, 45, 38, 39, 120, 98};
    }

    public AK(int i10, String str, IOException iOException, Map<String, List<String>> map, C10185i c10185i, byte[] bArr) {
        super(A01(0, 15, 39) + i10, iOException, c10185i, 2004, 1);
        this.A00 = i10;
        this.A01 = str;
        this.A02 = map;
        this.A03 = bArr;
    }
}
