package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1571Rp {
    public static String[] A00 = {"9O", "28H1kjICyCSP", "QKFmg3qmSW84YfLR5DXewrEtWZ47Hzy", "P", "Em", "YyES7HR0UsWs", "rGxFrAuyTsOha0QpVFZkpdTTHXBTZM0k", "CeAnScf1I32vhT13KQ6XZJy"};

    public static InterfaceC1424Lt A00(Context context, TA ta2) {
        return A01(context, ta2, null);
    }

    public static InterfaceC1424Lt A01(Context context, TA ta2, String str) {
        C2194ge sdkContext = A09(context);
        InterfaceC1428Lx interfaceC1428LxA8C = ta2.A8C(sdkContext);
        if (interfaceC1428LxA8C != null) {
            return str != null ? interfaceC1428LxA8C.ACN(str) : interfaceC1428LxA8C.ACM();
        }
        return new C2418kX();
    }

    public static C2198gi A02(Activity activity) {
        return new C2198gi(activity, (TA) A0A(), A00(activity, A0A()));
    }

    public static C2198gi A03(Context context) {
        return new C2198gi(context, A0A(), new C2418kX());
    }

    public static C2198gi A04(Context context) {
        if (C1648Up.A0w(context)) {
            return new C2198gi(context, A0A(), A00(context, A0A()));
        }
        C2198gi c2198giA03 = A03(context);
        if (A00[2].length() == 11) {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "B";
        strArr[7] = "J1bgC2YpAkuTguvKBul5HQJ";
        return c2198giA03;
    }

    public static C2198gi A05(Context context, String str) {
        InterfaceC1424Lt interfaceC1424LtA01 = A01(context, A0A(), str);
        interfaceC1424LtA01.AJT(1000);
        return new C2198gi(context, A0A(), interfaceC1424LtA01);
    }

    public static C2198gi A06(Context context, String str) {
        return new C2198gi(context, A0A(), A01(context, A0A(), str));
    }

    public static C2198gi A07(Context context, String str) {
        return new C2198gi(context, A0A(), A01(context, A0A(), str));
    }

    public static AnonymousClass76 A08(Context context) {
        return new AnonymousClass76(context, A0A(), A0A().A8C(A09(context)));
    }

    public static C2194ge A09(Context context) {
        return new C2194ge(context, A0A());
    }

    public static synchronized ZR A0A() {
        return ZR.A02();
    }
}
