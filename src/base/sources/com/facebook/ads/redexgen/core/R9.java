package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class R9 {
    public SparseArray<R8> A00 = new SparseArray<>();
    public int A01 = 0;

    private final long A00(long j10, long j11) {
        if (j10 == 0) {
            return j11;
        }
        return ((j10 / 4) * 3) + (j11 / 4);
    }

    private R8 A01(int i10) {
        R8 r10 = this.A00.get(i10);
        if (r10 == null) {
            R8 r11 = new R8();
            this.A00.put(i10, r11);
            return r11;
        }
        return r10;
    }

    private final void A02() {
        for (int i10 = 0; i10 < i; i10++) {
            this.A00.valueAt(i10).A03.clear();
        }
    }

    public final RK A03(int i10) {
        R8 r10 = this.A00.get(i10);
        if (r10 != null && !r10.A03.isEmpty()) {
            ArrayList<RK> arrayList = r10.A03;
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i10, long j10) {
        R8 r8A01 = A01(i10);
        r8A01.A01 = A00(r8A01.A01, j10);
    }

    public final void A06(int i10, long j10) {
        R8 r8A01 = A01(i10);
        r8A01.A02 = A00(r8A01.A02, j10);
    }

    public final void A07(AbstractC1546Qq abstractC1546Qq) {
        this.A01++;
    }

    public final void A08(AbstractC1546Qq abstractC1546Qq, AbstractC1546Qq abstractC1546Qq2, boolean z10) {
        if (abstractC1546Qq != null) {
            A04();
        }
        if (!z10 && this.A01 == 0) {
            A02();
        }
        if (abstractC1546Qq2 != null) {
            A07(abstractC1546Qq2);
        }
    }

    public final void A09(RK rk2) {
        int iA0N = rk2.A0N();
        ArrayList<RK> arrayList = A01(iA0N).A03;
        int i10 = this.A00.get(iA0N).A00;
        int viewType = arrayList.size();
        if (i10 <= viewType) {
            return;
        }
        rk2.A0W();
        arrayList.add(rk2);
    }

    public final boolean A0A(int i10, long j10, long j11) {
        long j12 = A01(i10).A01;
        return j12 == 0 || j10 + j12 < j11;
    }

    public final boolean A0B(int i10, long j10, long j11) {
        long j12 = A01(i10).A02;
        return j12 == 0 || j10 + j12 < j11;
    }
}
