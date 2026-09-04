package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface r0 extends Collection {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        Object d();

        int getCount();

        String toString();
    }

    @Override // java.util.Collection, com.google.common.collect.r0
    boolean add(Object obj);

    boolean c0(Object obj, int i10, int i11);

    @Override // java.util.Collection, com.google.common.collect.r0
    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection collection);

    Set entrySet();

    @Override // com.google.common.collect.r0
    boolean equals(Object obj);

    int g0(Object obj);

    @Override // com.google.common.collect.r0
    int hashCode();

    Set l();

    int q(Object obj, int i10);

    @Override // java.util.Collection, com.google.common.collect.r0
    boolean remove(Object obj);

    int s(Object obj, int i10);

    @Override // java.util.Collection, com.google.common.collect.r0
    int size();
}
