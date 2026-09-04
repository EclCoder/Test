package com.facebook.ads.redexgen.core;

import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2572nG extends AbstractC1232Eh<C2572nG> implements Comparable<C2572nG> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(List<C2572nG> list, List<C2572nG> list2) {
        return list.get(0).compareTo(list2.get(0));
    }

    public C2572nG(int i10, C2721pg c2721pg, int i11, C11169i c11169i, int i12, String str) {
        List<String> listA03;
        super(i10, c2721pg, i11);
        int i13 = 0;
        this.A08 = C11159h.A0S(i12, false);
        int i14 = super.A02.A0H & (~((C2717pc) c11169i).A00);
        this.A06 = (i14 & 1) != 0;
        this.A07 = (i14 & 2) != 0;
        int i15 = Integer.MAX_VALUE;
        int bestLanguageScore = 0;
        if (c11169i.A0K.isEmpty()) {
            listA03 = MetaExoPlayerCustomizedCollections.A03("");
        } else {
            listA03 = c11169i.A0K;
        }
        for (int bestLanguageIndex = 0; bestLanguageIndex < listA03.size(); bestLanguageIndex++) {
            int iA02 = C11159h.A02(super.A02, listA03.get(bestLanguageIndex), c11169i.A0P);
            if (iA02 > 0) {
                i15 = bestLanguageIndex;
                bestLanguageScore = iA02;
                break;
            }
        }
        this.A00 = i15;
        this.A01 = bestLanguageScore;
        this.A02 = C11159h.A00(super.A02.A0E, ((C2717pc) c11169i).A0C);
        this.A05 = (super.A02.A0E & 1088) != 0;
        this.A03 = C11159h.A02(super.A02, str, C11159h.A0K(str) == null);
        boolean z10 = this.A01 > 0 || (c11169i.A0K.isEmpty() && this.A02 > 0) || this.A06 || (this.A07 && this.A03 > 0);
        if (C11159h.A0S(i12, c11169i.A0B) && z10) {
            i13 = 1;
        }
        this.A04 = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2572nG c2572nG) {
        AbstractC2610ns abstractC2610nsA06 = AbstractC2610ns.A01().A09(this.A08, c2572nG.A08).A08(Integer.valueOf(this.A00), Integer.valueOf(c2572nG.A00), AbstractC2760qK.A03().A06()).A06(this.A01, c2572nG.A01).A06(this.A02, c2572nG.A02).A09(this.A06, c2572nG.A06).A08(Boolean.valueOf(this.A07), Boolean.valueOf(c2572nG.A07), this.A01 == 0 ? AbstractC2760qK.A03() : AbstractC2760qK.A03().A06()).A06(this.A03, c2572nG.A03);
        if (this.A02 == 0) {
            abstractC2610nsA06 = abstractC2610nsA06.A0A(this.A05, c2572nG.A05);
        }
        return abstractC2610nsA06.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TextTrackInfo> */
    public static BP<C2572nG> A02(int i10, C2721pg c2721pg, C11169i c11169i, int[] iArr, String str) {
        C2K c2kA01 = BP.A01();
        for (int i11 = 0; i11 < c2721pg.A01; i11++) {
            c2kA01.A04(new C2572nG(i10, c2721pg, i11, c11169i, iArr[i11], str));
        }
        return c2kA01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1232Eh
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C2572nG c2572nG) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1232Eh
    public final int A08() {
        return this.A04;
    }
}
