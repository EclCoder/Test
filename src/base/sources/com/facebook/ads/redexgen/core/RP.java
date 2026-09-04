package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class RP {
    public RM A00 = new RM();
    public final RN A01;

    public RP(RN rn2) {
        this.A01 = rn2;
    }

    public final View A00(int i10, int i11, int i12, int i13) {
        int iA8h = this.A01.A8h();
        int next = this.A01.A8g();
        int childEnd = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewA7H = this.A01.A7H(i10);
            int iA7K = this.A01.A7K(viewA7H);
            int i14 = this.A01.A7J(viewA7H);
            this.A00.A03(iA8h, next, iA7K, i14);
            if (i12 != 0) {
                this.A00.A01();
                this.A00.A02(i12);
                if (this.A00.A04()) {
                    return viewA7H;
                }
            }
            if (i13 != 0) {
                this.A00.A01();
                this.A00.A02(i13);
                if (this.A00.A04()) {
                    view = viewA7H;
                }
            }
            i10 += childEnd;
        }
        return view;
    }
}
