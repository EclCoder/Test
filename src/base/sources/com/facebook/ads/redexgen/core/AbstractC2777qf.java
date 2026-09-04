package com.facebook.ads.redexgen.core;

import java.util.AbstractSet;
import java.util.Collection;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.qf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2777qf<E> extends AbstractSet<E> {
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qf != com.google.common.collect.Sets$ImprovedAbstractSet<E> */
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> c10) {
        return AbstractC2781qj.A0A(this, c10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qf != com.google.common.collect.Sets$ImprovedAbstractSet<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> c10) {
        return super.retainAll((Collection) AbstractC2428ki.A04(c10));
    }
}
