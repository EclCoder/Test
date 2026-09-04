package com.bytedance.adsdk.hn;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class fc<K, V> {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    fc<K, V>.hn f11950hn;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class hn implements Set<K> {
        hn() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            fc.this.qor();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return fc.this.hnj(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return fc.hnj(fc.this.hn(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return fc.hnj(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iHnj = fc.this.hnj() - 1; iHnj >= 0; iHnj--) {
                Object objHnj = fc.this.hnj(iHnj, 0);
                iHashCode += objHnj == null ? 0 : objHnj.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return fc.this.hnj() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new hnj(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iHnj = fc.this.hnj(obj);
            if (iHnj < 0) {
                return false;
            }
            fc.this.hnj(iHnj);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return fc.hn(fc.this.hn(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return fc.qor(fc.this.hn(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return fc.this.hnj();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return fc.this.hn(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) fc.this.hnj(tArr, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class hnj<T> implements Iterator<T> {
        boolean gjv = false;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        int f11951hn;
        final int hnj;
        int qor;

        hnj(int i10) {
            this.hnj = i10;
            this.f11951hn = fc.this.hnj();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.qor < this.f11951hn;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t10 = (T) fc.this.hnj(this.qor, this.hnj);
            this.qor++;
            this.gjv = true;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.gjv) {
                throw new IllegalStateException();
            }
            int i10 = this.qor - 1;
            this.qor = i10;
            this.f11951hn--;
            this.gjv = false;
            fc.this.hnj(i10);
        }
    }

    fc() {
    }

    public static <K, V> boolean hn(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean hnj(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean qor(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public Set<K> gjv() {
        if (this.f11950hn == null) {
            this.f11950hn = new hn();
        }
        return this.f11950hn;
    }

    protected abstract Map<K, V> hn();

    protected abstract int hnj();

    protected abstract int hnj(Object obj);

    protected abstract Object hnj(int i10, int i11);

    protected abstract void hnj(int i10);

    protected abstract void qor();

    public <T> T[] hnj(T[] tArr, int i10) {
        int iHnj = hnj();
        if (tArr.length < iHnj) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iHnj));
        }
        for (int i11 = 0; i11 < iHnj; i11++) {
            tArr[i11] = hnj(i11, i10);
        }
        if (tArr.length > iHnj) {
            tArr[iHnj] = null;
        }
        return tArr;
    }

    public Object[] hn(int i10) {
        int iHnj = hnj();
        Object[] objArr = new Object[iHnj];
        for (int i11 = 0; i11 < iHnj; i11++) {
            objArr[i11] = hnj(i11, i10);
        }
        return objArr;
    }

    public static <T> boolean hnj(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
