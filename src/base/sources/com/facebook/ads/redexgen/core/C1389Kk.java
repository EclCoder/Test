package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1389Kk implements Comparable<C1389Kk> {
    public final int A00;
    public final C1380Kb A01;

    public C1389Kk(int i10, C1380Kb c1380Kb) {
        this.A00 = i10;
        this.A01 = c1380Kb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1389Kk c1389Kk) {
        return Integer.compare(this.A00, c1389Kk.A00);
    }
}
