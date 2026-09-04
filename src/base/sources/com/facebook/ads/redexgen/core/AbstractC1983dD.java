package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1983dD {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C1982dC>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C1982dC>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C1982dC A01(C2198gi c2198gi, AbstractC2363jd abstractC2363jd, int i10, InterfaceC1980dA interfaceC1980dA) {
        C1982dC c1982dC = new C1982dC(c2198gi, abstractC2363jd, c2198gi.A02().A0A(), i10);
        c1982dC.A0b(interfaceC1980dA);
        c1982dC.A0X();
        A01.put(abstractC2363jd.A1D(), new WeakReference<>(c1982dC));
        return c1982dC;
    }

    public static C1982dC A02(String str) {
        WeakReference<C1982dC> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC2363jd abstractC2363jd, C1982dC c1982dC) {
        A01.put(abstractC2363jd.A1D(), new WeakReference<>(c1982dC));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
