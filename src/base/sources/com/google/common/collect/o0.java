package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface o0 {
    void clear();

    Collection d();

    Map g();

    Collection get(Object obj);

    boolean h(Object obj, Object obj2);

    Set keySet();

    boolean put(Object obj, Object obj2);

    boolean remove(Object obj, Object obj2);

    int size();

    Collection values();
}
