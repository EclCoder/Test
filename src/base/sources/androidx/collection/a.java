package androidx.collection;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a extends u implements Map {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    C0019a f1887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    c f1888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    e f1889f;

    /* JADX INFO: renamed from: androidx.collection.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class C0019a extends AbstractSet {
        C0019a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return a.this.new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a.this.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class b extends k {
        b() {
            super(a.this.size());
        }

        @Override // androidx.collection.k
        protected Object a(int i10) {
            return a.this.i(i10);
        }

        @Override // androidx.collection.k
        protected void b(int i10) {
            a.this.k(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class d implements Iterator, Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1894b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f1895c;

        d() {
            this.f1893a = a.this.size() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f1894b++;
            this.f1895c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f1895c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return s.a.c(entry.getKey(), a.this.i(this.f1894b)) && s.a.c(entry.getValue(), a.this.m(this.f1894b));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f1895c) {
                return a.this.i(this.f1894b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f1895c) {
                return a.this.m(this.f1894b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1894b < this.f1893a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f1895c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objI = a.this.i(this.f1894b);
            Object objM = a.this.m(this.f1894b);
            return (objI == null ? 0 : objI.hashCode()) ^ (objM != null ? objM.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f1895c) {
                throw new IllegalStateException();
            }
            a.this.k(this.f1894b);
            this.f1894b--;
            this.f1893a--;
            this.f1895c = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f1895c) {
                return a.this.l(this.f1894b, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class f extends k {
        f() {
            super(a.this.size());
        }

        @Override // androidx.collection.k
        protected Object a(int i10) {
            return a.this.m(i10);
        }

        @Override // androidx.collection.k
        protected void b(int i10) {
            a.this.k(i10);
        }
    }

    public a() {
    }

    static boolean o(Set set, Object obj) {
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

    @Override // androidx.collection.u, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // androidx.collection.u, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        C0019a c0019a = this.f1887d;
        if (c0019a != null) {
            return c0019a;
        }
        C0019a c0019a2 = new C0019a();
        this.f1887d = c0019a2;
        return c0019a2;
    }

    @Override // androidx.collection.u, java.util.Map
    public Object get(Object obj) {
        return super.get(obj);
    }

    @Override // java.util.Map
    public Set keySet() {
        c cVar = this.f1888e;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f1888e = cVar2;
        return cVar2;
    }

    public boolean n(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean p(Collection collection) {
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        c(size() + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean q(Collection collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(i(size2))) {
                k(size2);
            }
        }
        return size != size();
    }

    @Override // androidx.collection.u, java.util.Map
    public Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map
    public Collection values() {
        e eVar = this.f1889f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.f1889f = eVar2;
        return eVar2;
    }

    public a(int i10) {
        super(i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class c implements Set {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return a.this.n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return a.o(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int size = a.this.size() - 1; size >= 0; size--) {
                Object objI = a.this.i(size);
                iHashCode += objI == null ? 0 : objI.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return a.this.new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iG = a.this.g(obj);
            if (iG < 0) {
                return false;
            }
            a.this.k(iG);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return a.this.p(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return a.this.q(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return a.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int size = a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = a.this.i(i10);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = a.this.i(i10);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class e implements Collection {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return a.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return a.this.new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iA = a.this.a(obj);
            if (iA < 0) {
                return false;
            }
            a.this.k(iA);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int size = a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (collection.contains(a.this.m(i10))) {
                    a.this.k(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int size = a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (!collection.contains(a.this.m(i10))) {
                    a.this.k(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public int size() {
            return a.this.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int size = a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = a.this.m(i10);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = a.this.m(i10);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    public a(u uVar) {
        super(uVar);
    }
}
