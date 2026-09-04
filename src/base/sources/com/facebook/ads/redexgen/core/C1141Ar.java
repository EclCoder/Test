package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1141Ar implements InterfaceC2814rY {
    public final List<InterfaceC2815rZ> A00 = new ArrayList();

    @Override // com.facebook.ads.redexgen.core.InterfaceC2814rY
    public final InterfaceC2815rZ A6i(int i10) {
        this.A00.get(i10);
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC2815rZ> iterator() {
        return this.A00.iterator();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2814rY
    public final int size() {
        return this.A00.size();
    }
}
