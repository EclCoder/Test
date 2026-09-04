package com.facebook.ads.redexgen.core;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.i8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2283i8<K, V> extends PC<K, V> {
    public final /* synthetic */ C2282i7 A00;

    public C2283i8(C2282i7 c2282i7) {
        this.A00 = c2282i7;
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final int A04() {
        return ((PF) this.A00).A00;
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final int A05(Object obj) {
        return this.A00.A08(obj);
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final int A06(Object obj) {
        return this.A00.A07(obj);
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final Map<K, V> A07() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final Object A0B(int i10, int i11) {
        return this.A00.A02[(i10 << 1) + i11];
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final V A0C(int i10, V value) {
        return this.A00.A0C(i10, value);
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final void A0D() {
        this.A00.clear();
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final void A0E(int i10) {
        this.A00.A0A(i10);
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final void A0F(K key, V value) {
        this.A00.put(key, value);
    }
}
