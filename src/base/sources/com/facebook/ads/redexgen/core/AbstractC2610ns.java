package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ns, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2610ns {
    public static final AbstractC2610ns A00 = new C1154Be();
    public static final AbstractC2610ns A02 = new C1152Bc(-1);
    public static final AbstractC2610ns A01 = new C1152Bc(1);

    public abstract int A05();

    public abstract AbstractC2610ns A06(int left, int right);

    public abstract AbstractC2610ns A07(long left, long right);

    public abstract <T> AbstractC2610ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator);

    public abstract AbstractC2610ns A09(boolean left, boolean right);

    public abstract AbstractC2610ns A0A(boolean left, boolean right);

    public AbstractC2610ns() {
    }

    public /* synthetic */ AbstractC2610ns(C1154Be c1154Be) {
        this();
    }

    public static AbstractC2610ns A01() {
        return A00;
    }
}
