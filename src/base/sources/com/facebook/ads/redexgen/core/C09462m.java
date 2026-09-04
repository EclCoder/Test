package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C09462m {
    public static String[] A02 = {"GJxubYlXsZiu90nLIAtZt0ZPoHJfDn5s", "BS8EJfUuntSU9isaC3nv1ANhy", "Gs0aOb6gQMfpDwhZyZjPrCKqfhvLXKwh", "iN3iHRJ6T765oBofKZIxuh5bzIdVCLFB", "wNf5fiO3vn7igkhJYRlF92Iu10jGyY95", "PRW1z97xqqsLulYYbCVWRoDib", "FY0aCr3Onb0", "4J82hMkwk7B8La5ZKR1JgNOMoJvqL0p2"};
    public boolean A00;
    public final SparseBooleanArray A01 = new SparseBooleanArray();

    public final C09462m A00(int i10) {
        AbstractC09823y.A08(!this.A00);
        this.A01.append(i10, true);
        return this;
    }

    public final C09462m A01(int i10, boolean z10) {
        if (z10) {
            C09462m c09462mA00 = A00(i10);
            if (A02[6].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "oVNjkypXGUiIrzEYrZV4GsKas1KVyN3y";
            strArr[3] = "tIVTdGxG4MXYUs0uHZXzBbuDNAp7p6hg";
            return c09462mA00;
        }
        return this;
    }

    public final C09462m A02(C09472n c09472n) {
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = c09472n.A01(i10);
            A00(i11);
        }
        return this;
    }

    public final C09462m A03(int... iArr) {
        for (int i10 : iArr) {
            A00(i10);
        }
        return this;
    }

    public final C09472n A04() {
        AbstractC09823y.A08(!this.A00);
        this.A00 = true;
        return new C09472n(this.A01);
    }
}
