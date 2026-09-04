package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.qC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2752qC implements AnonymousClass24 {
    public final long A00;
    public final long A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public static final C2752qC A06 = new C09552v().A0A();
    public static final AnonymousClass23<AW> A05 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.qD
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return new C09552v().A06(bundle.getLong(C2752qC.A01(0), 0L)).A05(bundle.getLong(C2752qC.A01(1), Long.MIN_VALUE)).A08(bundle.getBoolean(C2752qC.A01(2), false)).A07(bundle.getBoolean(C2752qC.A01(3), false)).A09(bundle.getBoolean(C2752qC.A01(4), false)).A0B();
        }
    };

    public C2752qC(C09552v c09552v) {
        this.A01 = c09552v.A01;
        this.A00 = c09552v.A00;
        this.A03 = c09552v.A03;
        this.A02 = c09552v.A02;
        this.A04 = c09552v.A04;
    }

    public static String A01(int i10) {
        return Integer.toString(i10, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2752qC)) {
            return false;
        }
        C2752qC c2752qC = (C2752qC) obj;
        return this.A01 == c2752qC.A01 && this.A00 == c2752qC.A00 && this.A03 == c2752qC.A03 && this.A02 == c2752qC.A02 && this.A04 == c2752qC.A04;
    }

    public final int hashCode() {
        return (((((((((int) (this.A01 ^ (this.A01 >>> 32))) * 31) + ((int) (this.A00 ^ (this.A00 >>> 32)))) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }
}
