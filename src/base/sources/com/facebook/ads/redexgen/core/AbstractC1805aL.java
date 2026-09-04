package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1805aL {
    public static String[] A00 = {"JDSePW2HSG4YeS6gtlV", "82T2GFaLeV3aTbLMJos0KxEKOb8V", "eQCDfbwHDs1I63LCwtRfVvk7aOq68Yi1", "mKAtiPzaErPw2g5AsekgNJUywNJKgzbn", "W6CrCk7jl5WmpSSnHELA9a4ylCy3ZwGN", "yC8I8b2mmbmFe3RpkHIpYdmwx30s8PcH", "t7vLS6XVWI7z", "7V80TKFhnzYK6cwmq9Eavbn4uXT7"};

    public static EnumC1809aP A00(AbstractC2363jd abstractC2363jd) {
        if (abstractC2363jd.A2U()) {
            EnumC1809aP enumC1809aP = EnumC1809aP.A02;
            if (A00[3].charAt(31) != 'n') {
                throw new RuntimeException();
            }
            A00[0] = "myUXVCGo2IYKrTscb4wiG";
            return enumC1809aP;
        }
        return EnumC1809aP.A03;
    }

    public static void A01(C2198gi c2198gi, EnumC1806aM enumC1806aM) {
        c2198gi.A0F().AAz(enumC1806aM.name().toLowerCase(Locale.US));
    }

    public static void A02(C2198gi c2198gi, EnumC1806aM enumC1806aM) {
        c2198gi.A0F().AB9(enumC1806aM.name().toLowerCase(Locale.US));
    }

    public static void A03(C2198gi c2198gi, EnumC1806aM enumC1806aM) {
        c2198gi.A0F().AC7(enumC1806aM.name().toLowerCase(Locale.US));
    }

    public static void A04(C2198gi c2198gi, EnumC1806aM enumC1806aM) {
        A01(c2198gi, enumC1806aM);
    }

    public static void A05(C2198gi c2198gi, EnumC1806aM enumC1806aM) {
        A02(c2198gi, enumC1806aM);
    }

    public static void A06(C2198gi c2198gi, EnumC1806aM enumC1806aM) {
        A03(c2198gi, enumC1806aM);
    }

    public static void A07(VI vi2, C2198gi c2198gi, InterfaceC1739Yh interfaceC1739Yh, AbstractC2363jd abstractC2363jd, EnumC1806aM enumC1806aM) {
        if (vi2 != null) {
            vi2.A04(VH.A0A, null);
        }
        if (abstractC2363jd.A2Q()) {
            c2198gi.A0F().AB8(enumC1806aM.name().toLowerCase(Locale.US));
        }
        if (abstractC2363jd.A2U()) {
            c2198gi.A0F().AAy(enumC1806aM.name().toLowerCase(Locale.US));
        }
        C1488Og c1488OgA00 = AbstractC1489Oh.A00(c2198gi.A02());
        C2194ge c2194geA02 = c2198gi.A02();
        if (A00[6].length() != 12) {
            throw new RuntimeException();
        }
        A00[0] = "Fh7";
        if (c1488OgA00.A0O(c2194geA02, true)) {
            if (interfaceC1739Yh != null) {
                interfaceC1739Yh.AAo(abstractC2363jd.A2E(), abstractC2363jd.A2C());
            }
        } else {
            if (TextUtils.isEmpty(abstractC2363jd.A2C().A00())) {
                return;
            }
            X6.A0O(new X6(), c2198gi, XB.A00(abstractC2363jd.A2C().A00()), abstractC2363jd.A2E());
        }
    }
}
