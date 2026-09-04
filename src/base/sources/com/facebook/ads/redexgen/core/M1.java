package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class M1 extends AbstractC1546Qq<C1266Fq> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC1739Yh A03;
    public C2143fp A04;
    public String A05;
    public List<C2036e5> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC2363jd A08;
    public final C1604Sx A09;
    public final C2198gi A0A;
    public final VA A0B;
    public final UK A0C;
    public final Y2 A0D;
    public final C6X A0E;
    public final DZ A0F;

    public M1(C2198gi c2198gi, List<C2036e5> list, AbstractC2363jd abstractC2363jd, VA va2, UK uk2, InterfaceC1739Yh interfaceC1739Yh, String str, C6X c6x, DZ dz) {
        this.A0A = c2198gi;
        this.A0B = va2;
        this.A0C = uk2;
        this.A09 = uk2.A14();
        this.A04 = uk2.A1G();
        this.A0D = uk2.A1E();
        this.A03 = interfaceC1739Yh;
        this.A08 = abstractC2363jd;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c6x;
        this.A0F = dz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1546Qq
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C1266Fq A0F(ViewGroup viewGroup, int i10) {
        return new C1266Fq(AbstractC1878bW.A00(new C1914c6(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0R(this.A0F).A0N(this.A0C).A0U(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1546Qq
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(C1266Fq c1266Fq, int i10) {
        C2036e5 c2036e5 = this.A06.get(i10);
        c1266Fq.A0q(this.A04);
        c1266Fq.A0p(c2036e5, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1546Qq
    public final int A0B() {
        return this.A06.size();
    }

    public final void A0O(int i10, int i11, int i12) {
        boolean needsUpdate = i10 != this.A00;
        this.A00 = i10;
        this.A02 = i11;
        this.A01 = i12;
        if (needsUpdate) {
            A0G();
        }
    }

    public final void A0P(C2143fp c2143fp) {
        this.A04 = c2143fp;
    }
}
