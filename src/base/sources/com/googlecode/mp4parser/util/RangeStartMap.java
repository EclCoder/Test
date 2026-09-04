package com.googlecode.mp4parser.util;

import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class RangeStartMap<K extends Comparable, V> implements Map<K, V> {
    TreeMap<K, V> base = new TreeMap<>(new Comparator<K>() { // from class: com.googlecode.mp4parser.util.RangeStartMap.1
        @Override // java.util.Comparator
        public int compare(K k10, K k11) {
            return -k10.compareTo(k11);
        }
    });

    public RangeStartMap() {
    }

    @Override // java.util.Map
    public void clear() {
        this.base.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.base.get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return this.base.entrySet();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Comparable comparable = (Comparable) obj;
        if (isEmpty()) {
            return null;
        }
        Iterator<K> it = this.base.keySet().iterator();
        K next = it.next();
        while (true) {
            K k10 = next;
            if (!it.hasNext()) {
                return this.base.get(k10);
            }
            if (comparable.compareTo(k10) >= 0) {
                return this.base.get(k10);
            }
            next = it.next();
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.base.isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.base.keySet();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        this.base.putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Comparable comparable = (Comparable) obj;
        if (isEmpty()) {
            return null;
        }
        Iterator<K> it = this.base.keySet().iterator();
        K next = it.next();
        while (true) {
            K k10 = next;
            if (!it.hasNext()) {
                return this.base.remove(k10);
            }
            if (comparable.compareTo(k10) >= 0) {
                return this.base.remove(k10);
            }
            next = it.next();
        }
    }

    @Override // java.util.Map
    public int size() {
        return this.base.size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.base.values();
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        return this.base.put(k10, v10);
    }

    public RangeStartMap(K k10, V v10) {
        put((Comparable) k10, (Object) v10);
    }
}
