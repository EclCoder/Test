package com.google.api.client.util.store;

import com.google.api.client.util.Preconditions;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractDataStore<V extends Serializable> implements DataStore<V> {
    private final DataStoreFactory dataStoreFactory;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f21570id;

    protected AbstractDataStore(DataStoreFactory dataStoreFactory, String str) {
        this.dataStoreFactory = (DataStoreFactory) Preconditions.checkNotNull(dataStoreFactory);
        this.f21570id = (String) Preconditions.checkNotNull(str);
    }

    @Override // com.google.api.client.util.store.DataStore
    public boolean containsKey(String str) {
        return get(str) != null;
    }

    @Override // com.google.api.client.util.store.DataStore
    public boolean containsValue(V v10) {
        return values().contains(v10);
    }

    @Override // com.google.api.client.util.store.DataStore
    public DataStoreFactory getDataStoreFactory() {
        return this.dataStoreFactory;
    }

    @Override // com.google.api.client.util.store.DataStore
    public final String getId() {
        return this.f21570id;
    }

    @Override // com.google.api.client.util.store.DataStore
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.api.client.util.store.DataStore
    public int size() {
        return keySet().size();
    }
}
