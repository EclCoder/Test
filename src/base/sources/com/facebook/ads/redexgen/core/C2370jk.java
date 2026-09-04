package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2370jk extends N3 {
    public static byte[] A02;

    @Nullable
    public final C2368ji A00;
    public final VA A01;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{70, 69, 74, 74, 65, 86};
    }

    public C2370jk(C2198gi c2198gi, N4 n10, C2143fp c2143fp, VA va2, C2368ji c2368ji) {
        super(c2198gi, n10, c2143fp);
        this.A01 = va2;
        this.A00 = c2368ji;
    }

    @Override // com.facebook.ads.redexgen.core.N3
    public final void A08(Map<String, String> map) {
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7O())) {
            this.A02.A0F().A3L();
            AbstractC1482Oa.A02(this.A00.A0a(), AbstractC1718Xm.A00(A01(0, 6, 62)));
            this.A01.ABJ(this.A00.A7O(), map);
            if (C1648Up.A1A(this.A02)) {
                String string = AdPlacementType.MEDIUM_RECTANGLE.toString();
                C1694Wl c1694WlA00 = C1694Wl.A00(this.A02);
                String placementType = this.A00.A7O();
                c1694WlA00.A0E(string, placementType);
            }
        }
    }
}
