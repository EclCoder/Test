package com.google.api.client.util.store;

import com.google.api.client.util.IOUtils;
import com.google.api.client.util.Lists;
import com.google.api.client.util.Maps;
import com.google.api.client.util.Preconditions;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class AbstractMemoryDataStore<V extends Serializable> extends AbstractDataStore<V> {
    protected HashMap<String, byte[]> keyValueMap;
    private final Lock lock;

    protected AbstractMemoryDataStore(DataStoreFactory dataStoreFactory, String str) {
        super(dataStoreFactory, str);
        this.lock = new ReentrantLock();
        this.keyValueMap = Maps.newHashMap();
    }

    @Override // com.google.api.client.util.store.DataStore
    public final DataStore<V> clear() {
        this.lock.lock();
        try {
            this.keyValueMap.clear();
            save();
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // com.google.api.client.util.store.AbstractDataStore, com.google.api.client.util.store.DataStore
    public boolean containsKey(String str) {
        if (str == null) {
            return false;
        }
        this.lock.lock();
        try {
            return this.keyValueMap.containsKey(str);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // com.google.api.client.util.store.AbstractDataStore, com.google.api.client.util.store.DataStore
    public boolean containsValue(V v10) {
        if (v10 == null) {
            return false;
        }
        this.lock.lock();
        try {
            byte[] bArrSerialize = IOUtils.serialize(v10);
            Iterator<byte[]> it = this.keyValueMap.values().iterator();
            while (it.hasNext()) {
                if (Arrays.equals(bArrSerialize, it.next())) {
                    return true;
                }
            }
            return false;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // com.google.api.client.util.store.DataStore
    public DataStore<V> delete(String str) {
        if (str == null) {
            return this;
        }
        this.lock.lock();
        try {
            this.keyValueMap.remove(str);
            save();
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // com.google.api.client.util.store.DataStore
    public final V get(String str) {
        if (str == null) {
            return null;
        }
        this.lock.lock();
        try {
            return (V) IOUtils.deserialize(this.keyValueMap.get(str));
        } finally {
            this.lock.unlock();
        }
    }

    @Override // com.google.api.client.util.store.AbstractDataStore, com.google.api.client.util.store.DataStore
    public boolean isEmpty() {
        this.lock.lock();
        try {
            return this.keyValueMap.isEmpty();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // com.google.api.client.util.store.DataStore
    public final Set<String> keySet() {
        this.lock.lock();
        try {
            return Collections.unmodifiableSet(this.keyValueMap.keySet());
        } finally {
            this.lock.unlock();
        }
    }

    @Override // com.google.api.client.util.store.DataStore
    public final DataStore<V> set(String str, V v10) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(v10);
        this.lock.lock();
        try {
            this.keyValueMap.put(str, IOUtils.serialize(v10));
            save();
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // com.google.api.client.util.store.AbstractDataStore, com.google.api.client.util.store.DataStore
    public int size() {
        this.lock.lock();
        try {
            return this.keyValueMap.size();
        } finally {
            this.lock.unlock();
        }
    }

    public String toString() {
        return DataStoreUtils.toString(this);
    }

    @Override // com.google.api.client.util.store.DataStore
    public final Collection<V> values() {
        this.lock.lock();
        try {
            ArrayList arrayListNewArrayList = Lists.newArrayList();
            Iterator<byte[]> it = this.keyValueMap.values().iterator();
            while (it.hasNext()) {
                arrayListNewArrayList.add(IOUtils.deserialize(it.next()));
            }
            return Collections.unmodifiableList(arrayListNewArrayList);
        } finally {
            this.lock.unlock();
        }
    }

    public void save() {
    }
}
