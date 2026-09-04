package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class O6 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 76, 80, 73, 72, 121, 126, 100, 117, 98, 99, 100, 121, 100, 121, 113, 124, 101, 114, 96, 118, 101, 115, 114, 115, 72, 97, 126, 115, 114, 120};
    }

    public static void A02(C2198gi c2198gi, C1604Sx c1604Sx, C10737l c10737l) {
        c1604Sx.A0d(new C1602Sv(c10737l.A2C().A01(), C2035e4.A04, C2035e4.A04, c10737l.A1D(), A00(17, 14, Sdk$SDKError.b.ASSET_RESPONSE_DATA_ERROR_VALUE)));
        boolean zA1g = c10737l.A1g();
        String strA00 = A00(17, 14, Sdk$SDKError.b.ASSET_RESPONSE_DATA_ERROR_VALUE);
        if (zA1g) {
            C1600St c1600St = new C1600St(c10737l.A0x(), c10737l.A1D(), strA00);
            c1600St.A04 = true;
            c1600St.A03 = A00(0, 5, 66);
            c1604Sx.A0Y(c1600St);
        }
        boolean zA30 = C1648Up.A30(c2198gi, C2125fX.A03());
        C1600St c1600St2 = new C1600St(c10737l.A29().A0H().A09(), c10737l.A1D(), A00(17, 14, Sdk$SDKError.b.ASSET_RESPONSE_DATA_ERROR_VALUE), c10737l.A29().A0H().A06());
        if (zA1g && !zA30) {
            c1604Sx.A0Y(c1600St2);
        } else {
            c1604Sx.A0b(c1600St2);
        }
        c1604Sx.A0d(new C1602Sv(c10737l.A29().A0H().A08(), O1.A00(c10737l.A29().A0H()), O1.A01(c10737l.A29().A0H()), c10737l.A1D(), A00(17, 14, Sdk$SDKError.b.ASSET_RESPONSE_DATA_ERROR_VALUE)));
        O0.A00(c10737l, c1604Sx, strA00);
        Iterator<String> it = c10737l.A29().A0K().A02().iterator();
        while (isDSL) {
            String url = it.next();
            c1604Sx.A0d(new C1602Sv(url, -1, -1, c10737l.A1D(), A00(17, 14, Sdk$SDKError.b.ASSET_RESPONSE_DATA_ERROR_VALUE)));
        }
    }

    public static void A03(C2198gi c2198gi, C1604Sx c1604Sx, C10737l c10737l) {
        int i10 = 0;
        for (NR nr : c10737l.A2G()) {
            C1602Sv c1602Sv = new C1602Sv(nr.A0H().A08(), O1.A00(nr.A0H()), O1.A01(nr.A0H()), c10737l.A1D(), A00(5, 12, Sdk$SDKError.b.PROTOBUF_SERIALIZATION_ERROR_VALUE));
            if (i10 == 0) {
                c1604Sx.A0c(c1602Sv);
            } else {
                c1604Sx.A0d(c1602Sv);
            }
            O0.A00(c10737l, c1604Sx, A00(17, 14, Sdk$SDKError.b.ASSET_RESPONSE_DATA_ERROR_VALUE));
            Iterator<String> it = nr.A0K().A02().iterator();
            while (it.hasNext()) {
                c1604Sx.A0d(new C1602Sv(it.next(), -1, -1, c10737l.A1D(), A00(5, 12, Sdk$SDKError.b.PROTOBUF_SERIALIZATION_ERROR_VALUE)));
            }
            if (!TextUtils.isEmpty(nr.A0H().A09())) {
                new C1600St(nr.A0H().A09(), c10737l.A1D(), A00(5, 12, Sdk$SDKError.b.PROTOBUF_SERIALIZATION_ERROR_VALUE), nr.A0H().A06()).A04 = false;
            }
            i10++;
        }
    }
}
