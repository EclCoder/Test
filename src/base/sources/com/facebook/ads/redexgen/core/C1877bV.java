package com.facebook.ads.redexgen.core;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1877bV {
    public static long A0F;
    public static byte[] A0G;
    public static String[] A0H = {"R0SbMgWAoC497HVFrz", "HjDMjTQFKfQjEPdjddKMHVEmssyIO6xJ", "qLmiUd82g2mhrwqPXxjSPUm4NIZHyVr2", "b8w5", "5ahVLoWejnV8u5u0zxB2Y4aA1Z0H734m", "82nB4Ww4zktBcOGVc7", "fE0nEfPNcAkneFTlCeTsSM9yzZ1yQJUc", "9xmO"};
    public InterfaceC1448Mr A00;
    public AbstractC1450Mt A01;
    public AbstractC2363jd A02;
    public XS A03;
    public InterfaceC1713Xh A04;
    public InterfaceC1876bU A05;
    public boolean A06;
    public final C1462Ng A07;
    public final C2198gi A08;
    public final VA A09;
    public final Y2 A0A;
    public final InterfaceC1739Yh A0B;
    public final C2143fp A0C;
    public final String A0D;
    public final boolean A0E;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {119, -120, 117, 118, -87, -88, -88, -93, -94, 119, -96, -99, -105, -97, -128, -99, -89, -88, -103, -94, -103, -90, 115, -96, -96, -99, -96, 78, -109, -90, -109, -111, -93, -94, -105, -100, -107, 78, -113, -111, -94, -105, -99, -100, -100, -55, -55, -58, -55, 119, -50, -65, -64, -61, -68, 119, -58, -57, -68, -59, -64, -59, -66, 119, -55, -46, -49, -55, -47, -59, -39, -43, -37, -40, -55, -53};
        String[] strArr = A0H;
        if (strArr[4].charAt(11) == strArr[6].charAt(11)) {
            throw new RuntimeException();
        }
        A0H[5] = "";
        A0G = bArr;
    }

    static {
        A03();
        A0F = 0L;
    }

    public C1877bV(C2198gi c2198gi, String str, C2143fp c2143fp, Y2 y10, VA va2, C1462Ng c1462Ng) {
        this(c2198gi, str, c2143fp, y10, va2, c1462Ng, new C1397Ks());
    }

    public C1877bV(C2198gi c2198gi, String str, C2143fp c2143fp, Y2 y10, VA va2, C1462Ng c1462Ng, InterfaceC1739Yh interfaceC1739Yh) {
        this.A0E = true;
        this.A08 = c2198gi;
        this.A0D = str;
        this.A0C = c2143fp;
        this.A0A = y10;
        this.A09 = va2;
        this.A07 = c1462Ng;
        this.A0B = interfaceC1739Yh;
    }

    public C1877bV(C2198gi c2198gi, String str, C2143fp c2143fp, Y2 y10, VA va2, C1462Ng c1462Ng, InterfaceC1739Yh interfaceC1739Yh, InterfaceC1713Xh interfaceC1713Xh) {
        this.A0E = true;
        this.A08 = c2198gi;
        this.A0D = str;
        this.A0C = c2143fp;
        this.A0A = y10;
        this.A09 = va2;
        this.A07 = c1462Ng;
        this.A0B = interfaceC1739Yh;
        this.A04 = interfaceC1713Xh;
    }

    private EnumC1447Mq A00(String str, String str2, Map<String, String> map) {
        String strA01 = A01(0, 22, 33);
        EnumC1447Mq actionOutcome = EnumC1447Mq.A09;
        try {
            YB.A0c(map, this.A02);
            Uri uriA00 = XB.A00(str2);
            if (this.A01 == null) {
                this.A01 = C1451Mu.A01(this.A08, this.A09, str, uriA00, new C1855b9(map).A03(this.A0C).A02(this.A0A).A05(), true, this.A06, this.A07);
                A02();
            }
            if (this.A01 instanceof AnonymousClass87) {
                ((AnonymousClass87) this.A01).A0N(this.A03);
            }
            if (this.A01 != null) {
                actionOutcome = this.A01.A0G(map.get(A01(64, 12, 83)));
                if (this.A06 && (this.A01 instanceof AnonymousClass85)) {
                    actionOutcome = EnumC1447Mq.A08;
                }
            }
            if (!(((this.A01 instanceof AnonymousClass84) || (this.A01 instanceof AnonymousClass87)) && YB.A0i(this.A08, actionOutcome, map)) && actionOutcome != EnumC1447Mq.A06) {
                if (this.A05 != null) {
                    this.A05.ADY();
                }
                this.A0B.A4j(this.A0D);
            }
        } catch (ActivityNotFoundException e10) {
            Log.e(strA01, A01(44, 20, 68) + str2, e10);
        } catch (Exception e11) {
            Log.e(strA01, A01(22, 22, 27), e11);
        }
        return actionOutcome;
    }

    private void A02() {
        if (this.A01 != null && this.A01.A0E() == null && this.A00 != null) {
            this.A01.A0F(this.A00);
        }
    }

    public static boolean A04(C2198gi c2198gi) {
        boolean zA2w = C1648Up.A2w(c2198gi);
        int iA07 = C1648Up.A07(c2198gi);
        long jCurrentTimeMillis = System.currentTimeMillis() - A0F;
        if (zA2w && A0F > 0 && jCurrentTimeMillis < iA07) {
            return true;
        }
        A0F = System.currentTimeMillis();
        return false;
    }

    public final EnumC1447Mq A05(String str, String str2, Map<String, String> extraData) {
        EnumC1447Mq enumC1447MqA00 = EnumC1447Mq.A09;
        new VI(str, this.A09).A04(VH.A0J, extraData);
        if (this.A0A.A09(this.A08)) {
            this.A09.AB6(str, extraData);
        } else {
            enumC1447MqA00 = A00(str, str2, extraData);
            if (this.A02 != null && this.A02.A29().A0L() != null && this.A04 != null) {
                XI.A07(this.A08.A02(), this.A02.A29().A0L(), this.A04);
            }
        }
        return enumC1447MqA00;
    }

    public final InterfaceC1448Mr A06() {
        if (this.A01 != null) {
            InterfaceC1448Mr interfaceC1448MrA0E = this.A01.A0E();
            String[] strArr = A0H;
            if (strArr[4].charAt(11) == strArr[6].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0H;
            strArr2[4] = "m9EeWSKmUQIcAT4bR8TqW1uNxXCrncrR";
            strArr2[6] = "ZpUrOoewPl5vbi76KZuNJwABiWDkIMaY";
            return interfaceC1448MrA0E;
        }
        return null;
    }

    public final void A07(InterfaceC1448Mr interfaceC1448Mr) {
        this.A00 = interfaceC1448Mr;
        A02();
    }

    public final void A08(AbstractC2363jd abstractC2363jd) {
        this.A02 = abstractC2363jd;
    }

    public final void A09(XS xs) {
        this.A03 = xs;
    }

    public final void A0A(InterfaceC1713Xh interfaceC1713Xh) {
        this.A04 = interfaceC1713Xh;
    }

    public final void A0B(InterfaceC1876bU interfaceC1876bU) {
        this.A05 = interfaceC1876bU;
    }

    public final void A0C(boolean z10) {
        this.A06 = z10;
    }
}
