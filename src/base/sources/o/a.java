package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b f47904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f47905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakHashMap f47906c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f47907d = 0;

    /* JADX INFO: renamed from: o.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class C0737a extends d {
        C0737a(b bVar, b bVar2) {
            super(bVar, bVar2);
        }

        @Override // o.a.d
        b b(b bVar) {
            return bVar.f47911d;
        }

        @Override // o.a.d
        b c(b bVar) {
            return bVar.f47910c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f47908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f47909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        b f47910c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        b f47911d;

        b(Object obj, Object obj2) {
            this.f47908a = obj;
            this.f47909b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f47908a.equals(bVar.f47908a) && this.f47909b.equals(bVar.f47909b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f47908a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f47909b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f47908a.hashCode() ^ this.f47909b.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f47908a + "=" + this.f47909b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class c extends e implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f47912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f47913b = true;

        c() {
        }

        @Override // o.a.e
        void a(b bVar) {
            b bVar2 = this.f47912a;
            if (bVar == bVar2) {
                b bVar3 = bVar2.f47911d;
                this.f47912a = bVar3;
                this.f47913b = bVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f47913b) {
                this.f47913b = false;
                this.f47912a = a.this.f47904a;
            } else {
                b bVar = this.f47912a;
                this.f47912a = bVar != null ? bVar.f47910c : null;
            }
            return this.f47912a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f47913b) {
                return a.this.f47904a != null;
            }
            b bVar = this.f47912a;
            return (bVar == null || bVar.f47910c == null) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static abstract class d extends e implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        b f47915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        b f47916b;

        d(b bVar, b bVar2) {
            this.f47915a = bVar2;
            this.f47916b = bVar;
        }

        private b e() {
            b bVar = this.f47916b;
            b bVar2 = this.f47915a;
            if (bVar == bVar2 || bVar2 == null) {
                return null;
            }
            return c(bVar);
        }

        @Override // o.a.e
        public void a(b bVar) {
            if (this.f47915a == bVar && bVar == this.f47916b) {
                this.f47916b = null;
                this.f47915a = null;
            }
            b bVar2 = this.f47915a;
            if (bVar2 == bVar) {
                this.f47915a = b(bVar2);
            }
            if (this.f47916b == bVar) {
                this.f47916b = e();
            }
        }

        abstract b b(b bVar);

        abstract b c(b bVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            b bVar = this.f47916b;
            this.f47916b = e();
            return bVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f47916b != null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class e {
        abstract void a(b bVar);
    }

    protected b a(Object obj) {
        b bVar = this.f47904a;
        while (bVar != null && !bVar.f47908a.equals(obj)) {
            bVar = bVar.f47910c;
        }
        return bVar;
    }

    public c b() {
        c cVar = new c();
        this.f47906c.put(cVar, Boolean.FALSE);
        return cVar;
    }

    b d(Object obj, Object obj2) {
        b bVar = new b(obj, obj2);
        this.f47907d++;
        b bVar2 = this.f47905b;
        if (bVar2 == null) {
            this.f47904a = bVar;
            this.f47905b = bVar;
            return bVar;
        }
        bVar2.f47910c = bVar;
        bVar.f47911d = bVar2;
        this.f47905b = bVar;
        return bVar;
    }

    public Object e(Object obj, Object obj2) {
        b bVarA = a(obj);
        if (bVarA != null) {
            return bVarA.f47909b;
        }
        d(obj, obj2);
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (size() != aVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = aVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public Object f(Object obj) {
        b bVarA = a(obj);
        if (bVarA == null) {
            return null;
        }
        this.f47907d--;
        if (!this.f47906c.isEmpty()) {
            Iterator it = this.f47906c.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(bVarA);
            }
        }
        b bVar = bVarA.f47911d;
        if (bVar != null) {
            bVar.f47910c = bVarA.f47910c;
        } else {
            this.f47904a = bVarA.f47910c;
        }
        b bVar2 = bVarA.f47910c;
        if (bVar2 != null) {
            bVar2.f47911d = bVar;
        } else {
            this.f47905b = bVar;
        }
        bVarA.f47910c = null;
        bVarA.f47911d = null;
        return bVarA.f47909b;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        C0737a c0737a = new C0737a(this.f47904a, this.f47905b);
        this.f47906c.put(c0737a, Boolean.FALSE);
        return c0737a;
    }

    public int size() {
        return this.f47907d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb2.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
