package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.h5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2221h5 implements OB {
    public static byte[] A04;
    public static String[] A05 = {"2TNZv5rtJTplZyjTIrSAFwUR6QP", "UjegX20Mk8HUIHIT", "Ti96PrkTuXG6IMzmEs5GDJe0LgUxYJn1", "WKFIsio5", "sT4eIPa9", "0D70Whi8Ioa2N41OWBvmw3gUZoSjgMHO", "iH11Sl", "erLbaj7N4o7d5mJ3hEM6"};

    @Nullable
    public NativeAd.NativeOptions A00;
    public S6 A01;
    public C2198gi A02;
    public final NativeAdBase.MediaCacheFlag A03;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A05[6].length() == 1) {
                throw new RuntimeException();
            }
            A05[0] = "MdmGKNh4C3mG92xgGyorPLR3SXO";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 88);
            i13++;
        }
    }

    public static void A04() {
        A04 = new byte[]{-26, -39, -20, -31, -18, -35, -28, -35, -38, -35, -34, -26, -35};
    }

    static {
        A04();
    }

    public C2221h5(@Nullable S6 s10, C2198gi c2198gi, NativeAdBase.MediaCacheFlag mediaCacheFlag, NativeAd.NativeOptions nativeOptions) {
        this.A00 = nativeOptions;
        this.A01 = s10;
        this.A02 = c2198gi;
        this.A03 = mediaCacheFlag;
    }

    @Override // com.facebook.ads.redexgen.core.OB
    public final void ADp(C1670Vm c1670Vm) {
        WT.A00(new C2224h8(this, c1670Vm));
    }

    @Override // com.facebook.ads.redexgen.core.OB
    public final void AEy(List<C2380ju> list) {
        C1604Sx manager = new C1604Sx(this.A02);
        String firstRequestId = A03(6, 7, 23);
        for (C2380ju c2380ju : list) {
            if (A03(6, 7, 23).equals(firstRequestId)) {
                firstRequestId = c2380ju.A0G();
            }
            if (this.A03.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c2380ju.A0E().A0I() != null) {
                    manager.A0c(new C1602Sv(c2380ju.A0E().A0I().getUrl(), c2380ju.A0E().A0I().getHeight(), c2380ju.A0E().A0I().getWidth(), c2380ju.A0G(), A03(0, 6, 32)));
                }
                if (c2380ju.A0E().A0H() != null) {
                    manager.A0c(new C1602Sv(c2380ju.A0E().A0H().getUrl(), c2380ju.A0E().A0H().getHeight(), c2380ju.A0E().A0H().getWidth(), c2380ju.A0G(), A03(0, 6, 32)));
                }
                if (!TextUtils.isEmpty(c2380ju.A0E().A0e())) {
                    manager.A0b(new C1600St(c2380ju.A0E().A0e(), c2380ju.A0G(), A03(0, 6, 32), c2380ju.A0E().A0D()));
                }
            }
        }
        manager.A0X(new C2222h6(this, list), new C1597Sq(firstRequestId, A03(0, 6, 32)));
    }
}
