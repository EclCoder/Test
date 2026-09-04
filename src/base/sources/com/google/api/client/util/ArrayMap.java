package com.google.api.client.util;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class ArrayMap<K, V> extends AbstractMap<K, V> implements Cloneable {
    private Object[] data;
    int size;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class Entry implements Map.Entry<K, V> {
        private int index;

        Entry(int i10) {
            this.index = i10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return Objects.equal(getKey(), entry.getKey()) && Objects.equal(getValue(), entry.getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ArrayMap.this.getKey(this.index);
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return (V) ArrayMap.this.getValue(this.index);
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            Object value = getValue();
            return (key != null ? key.hashCode() : 0) ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            return (V) ArrayMap.this.set(this.index, v10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class EntryIterator implements Iterator<Map.Entry<K, V>> {
        private int nextIndex;
        private boolean removed;

        EntryIterator() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.nextIndex < ArrayMap.this.size;
        }

        @Override // java.util.Iterator
        public void remove() {
            int i10 = this.nextIndex - 1;
            if (this.removed || i10 < 0) {
                throw new IllegalArgumentException();
            }
            ArrayMap.this.remove(i10);
            this.nextIndex--;
            this.removed = true;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            int i10 = this.nextIndex;
            ArrayMap arrayMap = ArrayMap.this;
            if (i10 == arrayMap.size) {
                throw new NoSuchElementException();
            }
            this.nextIndex = i10 + 1;
            this.removed = false;
            return new Entry(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ArrayMap.this.size;
        }
    }

    public static <K, V> ArrayMap<K, V> create() {
        return new ArrayMap<>();
    }

    private int getDataIndexOfKey(Object obj) {
        int i10 = this.size << 1;
        Object[] objArr = this.data;
        for (int i11 = 0; i11 < i10; i11 += 2) {
            Object obj2 = objArr[i11];
            if (obj == null) {
                if (obj2 == null) {
                    return i11;
                }
            } else {
                if (obj.equals(obj2)) {
                    return i11;
                }
            }
        }
        return -2;
    }

    public static <K, V> ArrayMap<K, V> of(Object... objArr) {
        ArrayMap<K, V> arrayMapCreate = create(1);
        int length = objArr.length;
        if (1 == length % 2) {
            throw new IllegalArgumentException("missing value for last key: " + objArr[length - 1]);
        }
        arrayMapCreate.size = objArr.length / 2;
        Object[] objArr2 = new Object[length];
        ((ArrayMap) arrayMapCreate).data = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, length);
        return arrayMapCreate;
    }

    private V removeFromDataIndexOfKey(int i10) {
        int i11 = this.size << 1;
        if (i10 < 0 || i10 >= i11) {
            return null;
        }
        V vValueAtDataIndex = valueAtDataIndex(i10 + 1);
        Object[] objArr = this.data;
        int i12 = (i11 - i10) - 2;
        if (i12 != 0) {
            System.arraycopy(objArr, i10 + 2, objArr, i10, i12);
        }
        this.size--;
        setData(i11 - 2, null, null);
        return vValueAtDataIndex;
    }

    private void setData(int i10, K k10, V v10) {
        Object[] objArr = this.data;
        objArr[i10] = k10;
        objArr[i10 + 1] = v10;
    }

    private void setDataCapacity(int i10) {
        if (i10 == 0) {
            this.data = null;
            return;
        }
        int i11 = this.size;
        Object[] objArr = this.data;
        if (i11 == 0 || i10 != objArr.length) {
            Object[] objArr2 = new Object[i10];
            this.data = objArr2;
            if (i11 != 0) {
                System.arraycopy(objArr, 0, objArr2, 0, i11 << 1);
            }
        }
    }

    private V valueAtDataIndex(int i10) {
        if (i10 < 0) {
            return null;
        }
        return (V) this.data[i10];
    }

    public final void add(K k10, V v10) {
        set(this.size, k10, v10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.size = 0;
        this.data = null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return -2 != getDataIndexOfKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        int i10 = this.size << 1;
        Object[] objArr = this.data;
        for (int i11 = 1; i11 < i10; i11 += 2) {
            Object obj2 = objArr[i11];
            if (obj == null) {
                if (obj2 == null) {
                    return true;
                }
            } else {
                if (obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void ensureCapacity(int i10) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object[] objArr = this.data;
        int i11 = i10 << 1;
        int length = objArr == null ? 0 : objArr.length;
        if (i11 > length) {
            int i12 = (length / 2) * 3;
            int i13 = i12 + 1;
            if (i13 % 2 != 0) {
                i13 = i12 + 2;
            }
            if (i13 >= i11) {
                i11 = i13;
            }
            setDataCapacity(i11);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new EntrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        return valueAtDataIndex(getDataIndexOfKey(obj) + 1);
    }

    public final int getIndexOfKey(K k10) {
        return getDataIndexOfKey(k10) >> 1;
    }

    public final K getKey(int i10) {
        if (i10 < 0 || i10 >= this.size) {
            return null;
        }
        return (K) this.data[i10 << 1];
    }

    public final V getValue(int i10) {
        if (i10 < 0 || i10 >= this.size) {
            return null;
        }
        return valueAtDataIndex((i10 << 1) + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        int indexOfKey = getIndexOfKey(k10);
        if (indexOfKey == -1) {
            indexOfKey = this.size;
        }
        return set(indexOfKey, k10, v10);
    }

    public final V remove(int i10) {
        return removeFromDataIndexOfKey(i10 << 1);
    }

    public final V set(int i10, K k10, V v10) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i11 = i10 + 1;
        ensureCapacity(i11);
        int i12 = i10 << 1;
        V vValueAtDataIndex = valueAtDataIndex(i12 + 1);
        setData(i12, k10, v10);
        if (i11 > this.size) {
            this.size = i11;
        }
        return vValueAtDataIndex;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.size;
    }

    public final void trim() {
        setDataCapacity(this.size << 1);
    }

    public static <K, V> ArrayMap<K, V> create(int i10) {
        ArrayMap<K, V> arrayMapCreate = create();
        arrayMapCreate.ensureCapacity(i10);
        return arrayMapCreate;
    }

    @Override // java.util.AbstractMap
    public ArrayMap<K, V> clone() {
        try {
            ArrayMap<K, V> arrayMap = (ArrayMap) super.clone();
            Object[] objArr = this.data;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                arrayMap.data = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return arrayMap;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        return removeFromDataIndexOfKey(getDataIndexOfKey(obj));
    }

    public final V set(int i10, V v10) {
        int i11 = this.size;
        if (i10 >= 0 && i10 < i11) {
            int i12 = (i10 << 1) + 1;
            V vValueAtDataIndex = valueAtDataIndex(i12);
            this.data[i12] = v10;
            return vValueAtDataIndex;
        }
        throw new IndexOutOfBoundsException();
    }
}
