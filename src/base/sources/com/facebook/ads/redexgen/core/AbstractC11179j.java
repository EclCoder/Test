package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC11179j implements InterfaceC2570nE {
    public int A00;

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1742")
    public boolean A01;
    public final int A02;
    public final long[] A03;
    public final C2758qI[] A04;
    public final int A05;
    public final C2721pg A06;
    public final int[] A07;

    public AbstractC11179j(C2721pg c2721pg, int[] iArr, int i10) {
        AbstractC09823y.A08(iArr.length > 0);
        this.A02 = i10;
        this.A06 = (C2721pg) AbstractC09823y.A01(c2721pg);
        this.A05 = iArr.length;
        this.A04 = new C2758qI[this.A05];
        for (int i11 = 0; i11 < i; i11++) {
            C2758qI[] c2758qIArr = this.A04;
            int i12 = iArr[i11];
            c2758qIArr[i11] = c2721pg.A08(i12);
        }
        Arrays.sort(this.A04, new Comparator() { // from class: com.facebook.ads.redexgen.X.EV
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC11179j.A07((C2758qI) obj, (C2758qI) obj2);
            }
        });
        this.A07 = new int[this.A05];
        for (int i13 = 0; i13 < i; i13++) {
            int[] iArr2 = this.A07;
            int i14 = c2721pg.A07(this.A04[i13]);
            iArr2[i13] = i14;
        }
        int i15 = this.A05;
        this.A03 = new long[i15];
        this.A01 = false;
    }

    public static /* synthetic */ int A07(C2758qI c2758qI, C2758qI c2758qI2) {
        return c2758qI2.A05 - c2758qI.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2570nE
    public void A5x() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2570nE
    public void A6K() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1241Eq
    public final C2758qI A8B(int i10) {
        return this.A04[i10];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1241Eq
    public final int A8H(int i10) {
        return this.A07[i10];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2570nE
    public final C2758qI A92() {
        return this.A04[A93()];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1241Eq
    public final C2721pg A9L() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1241Eq
    public final int AA6(int i10) {
        for (int i11 = 0; i11 < i; i11++) {
            int i12 = this.A07[i11];
            if (i12 == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2570nE
    public void AFJ(float f10) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC11179j abstractC11179j = (AbstractC11179j) obj;
        return this.A06 == abstractC11179j.A06 && Arrays.equals(this.A07, abstractC11179j.A07);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (System.identityHashCode(this.A06) * 31) + Arrays.hashCode(this.A07);
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1241Eq
    public final int length() {
        return this.A07.length;
    }
}
