package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2578nM extends AbstractC1232Eh<C2578nM> implements Comparable<C2578nM> {
    public static String[] A0I = {"kuPF6Ds61I7lkNvdz9bcVPsTInik8V3M", "Qk0zKRkYsaxRz9XBLHG1rmY7ne3qL", "U5xl3sY91uvZaW", "4oEkNGaUX02G9U6MTdWApFSB5pjWlUNx", "CFtCC3eFdvC", "EnNVjubCw6rdwWEp5vRTdV2Ipxq1ST06", "834ujo2VifTXBI2K", "5tr2zEJniV6LNy5ijK5ku"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final C11169i A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C2578nM(int i10, C2721pg c2721pg, int i11, C11169i c11169i, int i12, boolean z10, InterfaceC2429kj<C2758qI> interfaceC2429kj) {
        super(i10, c2721pg, i11);
        this.A0A = c11169i;
        this.A0B = C11159h.A0K(super.A02.A0V);
        this.A0F = C11159h.A0S(i12, false);
        int i13 = 0;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < c11169i.A0I.size(); i15++) {
            int iA02 = C11159h.A02(super.A02, c11169i.A0I.get(i15), false);
            if (iA02 > 0) {
                i14 = i15;
                i13 = iA02;
                break;
            }
        }
        this.A04 = i14;
        this.A05 = i13;
        this.A07 = C11159h.A00(super.A02.A0E, ((C2717pc) c11169i).A0B);
        this.A0C = super.A02.A0E == 0 || (super.A02.A0E & 1) != 0;
        this.A0D = (super.A02.A0H & 1) != 0;
        this.A01 = super.A02.A06;
        this.A08 = super.A02.A0G;
        this.A00 = super.A02.A05;
        this.A0E = (super.A02.A05 == -1 || super.A02.A05 <= ((C2717pc) c11169i).A01) && (super.A02.A06 == -1 || super.A02.A06 <= ((C2717pc) c11169i).A02) && interfaceC2429kj.A4C(super.A02);
        String[] strArrA1L = C5C.A1L();
        int i16 = Integer.MAX_VALUE;
        int i17 = 0;
        for (int i18 = 0; i18 < strArrA1L.length; i18++) {
            int iA03 = C11159h.A02(super.A02, strArrA1L[i18], false);
            if (iA03 > 0) {
                i16 = i18;
                i17 = iA03;
                break;
            }
        }
        this.A02 = i16;
        this.A03 = i17;
        int i19 = Integer.MAX_VALUE;
        for (int i20 = 0; i20 < c11169i.A0J.size(); i20++) {
            if (super.A02.A0W != null && super.A02.A0W.equals(c11169i.A0J.get(i20))) {
                i19 = i20;
                break;
            }
        }
        this.A06 = i19;
        this.A0H = AbstractC10707i.A02(i12) == 128;
        this.A0G = AbstractC10707i.A04(i12) == 64;
        this.A09 = A00(i12, z10);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A02(List<C2578nM> list, List<C2578nM> list2) {
        return ((C2578nM) Collections.max(list)).compareTo((C2578nM) Collections.max(list2));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static BP<C2578nM> A03(int i10, C2721pg c2721pg, C11169i c11169i, int[] iArr, boolean z10, InterfaceC2429kj<C2758qI> interfaceC2429kj) {
        C2K c2kA01 = BP.A01();
        for (int i11 = 0; i11 < c2721pg.A01; i11++) {
            c2kA01.A04(new C2578nM(i10, c2721pg, i11, c11169i, iArr[i11], z10, interfaceC2429kj));
        }
        return c2kA01.A05();
    }

    private int A00(int i10, boolean z10) {
        if (!C11159h.A0S(i10, this.A0A.A0B)) {
            return 0;
        }
        if (!this.A0E && !this.A0A.A09) {
            return 0;
        }
        if (C11159h.A0S(i10, false) && this.A0E && super.A02.A05 != -1 && !this.A0A.A0N && !this.A0A.A0O && (this.A0A.A04 || !z10)) {
            return 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<java.lang.Integer> */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2578nM c2578nM) {
        AbstractC2760qK abstractC2760qKA06;
        AbstractC2760qK abstractC2760qKA07 = (this.A0E && this.A0F) ? C11159h.A09 : C11159h.A09.A06();
        AbstractC2610ns abstractC2610nsA08 = AbstractC2610ns.A01().A09(this.A0F, c2578nM.A0F).A08(Integer.valueOf(this.A04), Integer.valueOf(c2578nM.A04), AbstractC2760qK.A03().A06()).A06(this.A05, c2578nM.A05).A06(this.A07, c2578nM.A07).A09(this.A0D, c2578nM.A0D).A09(this.A0C, c2578nM.A0C).A08(Integer.valueOf(this.A02), Integer.valueOf(c2578nM.A02), AbstractC2760qK.A03().A06()).A06(this.A03, c2578nM.A03).A09(this.A0E, c2578nM.A0E).A08(Integer.valueOf(this.A06), Integer.valueOf(c2578nM.A06), AbstractC2760qK.A03().A06());
        Integer numValueOf = Integer.valueOf(this.A00);
        Integer numValueOf2 = Integer.valueOf(c2578nM.A00);
        if (this.A0A.A0O) {
            abstractC2760qKA06 = C11159h.A09.A06();
        } else {
            abstractC2760qKA06 = C11159h.A0A;
        }
        AbstractC2610ns abstractC2610nsA09 = abstractC2610nsA08.A08(numValueOf, numValueOf2, abstractC2760qKA06).A09(this.A0H, c2578nM.A0H).A09(this.A0G, c2578nM.A0G).A08(Integer.valueOf(this.A01), Integer.valueOf(c2578nM.A01), abstractC2760qKA07).A08(Integer.valueOf(this.A08), Integer.valueOf(c2578nM.A08), abstractC2760qKA07);
        Integer numValueOf3 = Integer.valueOf(this.A00);
        Integer numValueOf4 = Integer.valueOf(c2578nM.A00);
        if (!C5C.A1E(this.A0B, c2578nM.A0B)) {
            abstractC2760qKA07 = C11159h.A0A;
        }
        return abstractC2610nsA09.A08(numValueOf3, numValueOf4, abstractC2760qKA07).A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    @Override // com.facebook.ads.redexgen.core.AbstractC1232Eh
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C2578nM c2578nM) {
        if (this.A0A.A00) {
            if ((!this.A0A.A02 || (super.A02.A0W != null && TextUtils.equals(super.A02.A0W, ((AbstractC1232Eh) c2578nM).A02.A0W))) && ((this.A0A.A03 || (super.A02.A0G != -1 && super.A02.A0G == ((AbstractC1232Eh) c2578nM).A02.A0G)) && (this.A0A.A01 || (this.A0H == c2578nM.A0H && this.A0G == c2578nM.A0G)))) {
            }
        } else if (super.A02.A06 != -1) {
            int i10 = super.A02.A06;
            String[] strArr = A0I;
            if (strArr[5].charAt(5) == strArr[0].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[5] = "4j0Ebeo7wJOJZxGoc5hIgJQJaA3nIP6d";
            strArr2[0] = "7JU6hRyIHJ6Xx4Pnq3EsCWmSiYve8JpD";
            if (i10 == ((AbstractC1232Eh) c2578nM).A02.A06) {
                return !this.A0A.A02 ? true : true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1232Eh
    public final int A08() {
        return this.A09;
    }
}
