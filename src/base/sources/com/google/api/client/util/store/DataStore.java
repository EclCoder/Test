package com.google.api.client.util.store;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface DataStore<V extends Serializable> {
    DataStore<V> clear();

    boolean containsKey(String str);

    boolean containsValue(V v10);

    DataStore<V> delete(String str);

    V get(String str);

    DataStoreFactory getDataStoreFactory();

    String getId();

    boolean isEmpty();

    Set<String> keySet();

    DataStore<V> set(String str, V v10);

    int size();

    Collection<V> values();
}
