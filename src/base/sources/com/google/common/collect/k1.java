package com.google.common.collect;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface k1 extends r0, i1 {
    @Override // com.google.common.collect.i1
    Comparator comparator();

    k1 d0(Object obj, j jVar);

    @Override // com.google.common.collect.r0
    Set entrySet();

    r0.a firstEntry();

    k1 i(Object obj, j jVar, Object obj2, j jVar2);

    k1 i0(Object obj, j jVar);

    @Override // com.google.common.collect.r0
    NavigableSet l();

    r0.a lastEntry();

    r0.a pollFirstEntry();

    r0.a pollLastEntry();

    k1 t();
}
