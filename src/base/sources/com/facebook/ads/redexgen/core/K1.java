package com.facebook.ads.redexgen.core;

import android.util.SparseArray;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class K1 {
    public C1374Jv A00;
    public C1376Jx A01;
    public final int A02;
    public final int A03;
    public final SparseArray<C1378Jz> A08 = new SparseArray<>();
    public final SparseArray<C1373Ju> A06 = new SparseArray<>();
    public final SparseArray<C1375Jw> A07 = new SparseArray<>();
    public final SparseArray<C1373Ju> A04 = new SparseArray<>();
    public final SparseArray<C1375Jw> A05 = new SparseArray<>();

    public K1(int i10, int i11) {
        this.A03 = i10;
        this.A02 = i11;
    }

    public final void A00() {
        this.A08.clear();
        this.A06.clear();
        this.A07.clear();
        this.A04.clear();
        this.A05.clear();
        this.A00 = null;
        this.A01 = null;
    }
}
