package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class f1 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f3517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f3518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile f f3520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f3521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile c f3522f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends f1 {
        a() {
            super(null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.u((Comparable) obj, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public void s() {
            if (!r()) {
                if (n() > 0) {
                    android.support.v4.media.session.b.a(m(0).getKey());
                    throw null;
                }
                Iterator it = p().iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.s();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class c extends f {
        private c() {
            super(f1.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.f1.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(f1.this, null);
        }

        /* synthetic */ c(f1 f1Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class d implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Comparable f3527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f3528b;

        d(f1 f1Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean b(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return getKey().compareTo(dVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f3527a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f3527a, entry.getKey()) && b(this.f3528b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f3528b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f3527a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f3528b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            f1.this.j();
            Object obj2 = this.f3528b;
            this.f3528b = obj;
            return obj2;
        }

        public String toString() {
            return this.f3527a + "=" + this.f3528b;
        }

        d(Comparable comparable, Object obj) {
            this.f3527a = comparable;
            this.f3528b = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class f extends AbstractSet {
        private f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            f1.this.u((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            f1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = f1.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new e(f1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            f1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f1.this.size();
        }

        /* synthetic */ f(f1 f1Var, a aVar) {
            this();
        }
    }

    /* synthetic */ f1(a aVar) {
        this();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    private int i(Comparable comparable) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f3517a.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = comparable.compareTo(((d) this.f3517a.get(i12)).getKey());
                if (iCompareTo < 0) {
                    i13 = i12 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i12;
                    }
                    i10 = i12 + 1;
                }
            }
            i11 = i10 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((d) this.f3517a.get(i13)).getKey());
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = comparable.compareTo(((d) this.f3517a.get(i12)).getKey());
                    if (iCompareTo < 0) {
                        i13 = i12 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i12;
                        }
                        i10 = i12 + 1;
                    }
                }
                i11 = i10 + 1;
            }
        }
        return -i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f3519c) {
            throw new UnsupportedOperationException();
        }
    }

    private void l() {
        j();
        if (!this.f3517a.isEmpty() || (this.f3517a instanceof ArrayList)) {
            return;
        }
        this.f3517a = new ArrayList(16);
    }

    private SortedMap q() {
        j();
        if (this.f3518b.isEmpty() && !(this.f3518b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f3518b = treeMap;
            this.f3521e = treeMap.descendingMap();
        }
        return (SortedMap) this.f3518b;
    }

    static f1 t() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object v(int i10) {
        j();
        Object value = ((d) this.f3517a.remove(i10)).getValue();
        if (!this.f3518b.isEmpty()) {
            Iterator it = q().entrySet().iterator();
            this.f3517a.add(new d(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        j();
        if (!this.f3517a.isEmpty()) {
            this.f3517a.clear();
        }
        if (this.f3518b.isEmpty()) {
            return;
        }
        this.f3518b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return i(comparable) >= 0 || this.f3518b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f3520d == null) {
            this.f3520d = new f(this, null);
        }
        return this.f3520d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return super.equals(obj);
        }
        f1 f1Var = (f1) obj;
        int size = size();
        if (size != f1Var.size()) {
            return false;
        }
        int iN = n();
        if (iN != f1Var.n()) {
            return entrySet().equals(f1Var.entrySet());
        }
        for (int i10 = 0; i10 < iN; i10++) {
            if (!m(i10).equals(f1Var.m(i10))) {
                return false;
            }
        }
        if (iN != size) {
            return this.f3518b.equals(f1Var.f3518b);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int i10 = i(comparable);
        return i10 >= 0 ? ((d) this.f3517a.get(i10)).getValue() : this.f3518b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iN = n();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iN; i10++) {
            iHashCode += ((d) this.f3517a.get(i10)).hashCode();
        }
        return o() > 0 ? iHashCode + this.f3518b.hashCode() : iHashCode;
    }

    Set k() {
        if (this.f3522f == null) {
            this.f3522f = new c(this, null);
        }
        return this.f3522f;
    }

    public Map.Entry m(int i10) {
        return (Map.Entry) this.f3517a.get(i10);
    }

    public int n() {
        return this.f3517a.size();
    }

    public int o() {
        return this.f3518b.size();
    }

    public Iterable p() {
        return this.f3518b.isEmpty() ? Collections.EMPTY_SET : this.f3518b.entrySet();
    }

    public boolean r() {
        return this.f3519c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        j();
        Comparable comparable = (Comparable) obj;
        int i10 = i(comparable);
        if (i10 >= 0) {
            return v(i10);
        }
        if (this.f3518b.isEmpty()) {
            return null;
        }
        return this.f3518b.remove(comparable);
    }

    public void s() {
        if (this.f3519c) {
            return;
        }
        this.f3518b = this.f3518b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f3518b);
        this.f3521e = this.f3521e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f3521e);
        this.f3519c = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f3517a.size() + this.f3518b.size();
    }

    public Object u(Comparable comparable, Object obj) {
        j();
        int i10 = i(comparable);
        if (i10 >= 0) {
            return ((d) this.f3517a.get(i10)).setValue(obj);
        }
        l();
        int i11 = -(i10 + 1);
        if (i11 >= 16) {
            return q().put(comparable, obj);
        }
        if (this.f3517a.size() == 16) {
            d dVar = (d) this.f3517a.remove(15);
            q().put(dVar.getKey(), dVar.getValue());
        }
        this.f3517a.add(i11, new d(comparable, obj));
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator f3524b;

        private b() {
            this.f3523a = f1.this.f3517a.size();
        }

        private Iterator a() {
            if (this.f3524b == null) {
                this.f3524b = f1.this.f3521e.entrySet().iterator();
            }
            return this.f3524b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List list = f1.this.f3517a;
            int i10 = this.f3523a - 1;
            this.f3523a = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f3523a;
            return (i10 > 0 && i10 <= f1.this.f3517a.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(f1 f1Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class e implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f3531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator f3532c;

        private e() {
            this.f3530a = -1;
        }

        private Iterator a() {
            if (this.f3532c == null) {
                this.f3532c = f1.this.f3518b.entrySet().iterator();
            }
            return this.f3532c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f3531b = true;
            int i10 = this.f3530a + 1;
            this.f3530a = i10;
            return i10 < f1.this.f3517a.size() ? (Map.Entry) f1.this.f3517a.get(this.f3530a) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3530a + 1 < f1.this.f3517a.size() || (!f1.this.f3518b.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f3531b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f3531b = false;
            f1.this.j();
            if (this.f3530a >= f1.this.f3517a.size()) {
                a().remove();
                return;
            }
            f1 f1Var = f1.this;
            int i10 = this.f3530a;
            this.f3530a = i10 - 1;
            f1Var.v(i10);
        }

        /* synthetic */ e(f1 f1Var, a aVar) {
            this();
        }
    }

    private f1() {
        this.f3517a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f3518b = map;
        this.f3521e = map;
    }
}
