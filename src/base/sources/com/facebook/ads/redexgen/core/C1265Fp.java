package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1265Fp extends AbstractC1546Qq<FY> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC1733Yb A04;
    public InterfaceC1739Yh A05;
    public String A06;
    public List<C2036e5> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC2363jd A0A;
    public final C1604Sx A0B;
    public final C2198gi A0C;
    public final VA A0D;
    public final Y2 A0E;
    public final C1274Fy A0F;
    public final C2143fp A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C1265Fp(C2198gi c2198gi, List<C2036e5> list, AbstractC2363jd abstractC2363jd, VA va2, C1604Sx c1604Sx, C2143fp c2143fp, Y2 y10, InterfaceC1739Yh interfaceC1739Yh, String str, int i10, int i11, int i12, int i13, C1274Fy c1274Fy, AbstractC1733Yb abstractC1733Yb) {
        this.A0C = c2198gi;
        this.A0D = va2;
        this.A0B = c1604Sx;
        this.A0G = c2143fp;
        this.A0E = y10;
        this.A05 = interfaceC1739Yh;
        this.A0A = abstractC2363jd;
        this.A07 = list;
        this.A00 = i10;
        this.A03 = i13;
        this.A06 = str;
        this.A01 = i12;
        this.A02 = i11;
        this.A0F = c1274Fy;
        this.A04 = abstractC1733Yb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1546Qq
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final FY A0F(ViewGroup viewGroup, int i10) {
        return new FY(AbstractC1968cy.A00(new C1914c6(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0P(this.A04).A0U(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1546Qq
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(FY fy, int i10) {
        fy.A0q(this.A07.get(i10), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i10 == 0) {
            fy.AJF();
            this.A08 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1546Qq
    public final int A0B() {
        return this.A07.size();
    }
}
