package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1152Bc extends AbstractC2610ns {
    public final int A00;

    public C1152Bc(int result) {
        super(null);
        this.A00 = result;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2610ns
    public final int A05() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2610ns
    public final AbstractC2610ns A06(int left, int right) {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2610ns
    public final AbstractC2610ns A07(long left, long right) {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2610ns
    public final <T> AbstractC2610ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2610ns
    public final AbstractC2610ns A09(boolean left, boolean right) {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2610ns
    public final AbstractC2610ns A0A(boolean left, boolean right) {
        return this;
    }
}
