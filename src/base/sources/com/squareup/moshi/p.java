package com.squareup.moshi;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class p extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator f35519i = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator f35520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    g[] f35521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final g f35522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f35523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f35524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f35525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f35526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private e f35527h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g f35528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f35529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f35530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f35531d;

        b() {
        }

        void a(g gVar) {
            gVar.f35543c = null;
            gVar.f35541a = null;
            gVar.f35542b = null;
            gVar.f35549i = 1;
            int i10 = this.f35529b;
            if (i10 > 0) {
                int i11 = this.f35531d;
                if ((i11 & 1) == 0) {
                    this.f35531d = i11 + 1;
                    this.f35529b = i10 - 1;
                    this.f35530c++;
                }
            }
            gVar.f35541a = this.f35528a;
            this.f35528a = gVar;
            int i12 = this.f35531d;
            int i13 = i12 + 1;
            this.f35531d = i13;
            int i14 = this.f35529b;
            if (i14 > 0 && (i13 & 1) == 0) {
                this.f35531d = i12 + 2;
                this.f35529b = i14 - 1;
                this.f35530c++;
            }
            int i15 = 4;
            while (true) {
                int i16 = i15 - 1;
                if ((this.f35531d & i16) != i16) {
                    return;
                }
                int i17 = this.f35530c;
                if (i17 == 0) {
                    g gVar2 = this.f35528a;
                    g gVar3 = gVar2.f35541a;
                    g gVar4 = gVar3.f35541a;
                    gVar3.f35541a = gVar4.f35541a;
                    this.f35528a = gVar3;
                    gVar3.f35542b = gVar4;
                    gVar3.f35543c = gVar2;
                    gVar3.f35549i = gVar2.f35549i + 1;
                    gVar4.f35541a = gVar3;
                    gVar2.f35541a = gVar3;
                } else if (i17 == 1) {
                    g gVar5 = this.f35528a;
                    g gVar6 = gVar5.f35541a;
                    this.f35528a = gVar6;
                    gVar6.f35543c = gVar5;
                    gVar6.f35549i = gVar5.f35549i + 1;
                    gVar5.f35541a = gVar6;
                    this.f35530c = 0;
                } else if (i17 == 2) {
                    this.f35530c = 0;
                }
                i15 *= 2;
            }
        }

        void b(int i10) {
            this.f35529b = ((Integer.highestOneBit(i10) * 2) - 1) - i10;
            this.f35531d = 0;
            this.f35530c = 0;
            this.f35528a = null;
        }

        g c() {
            g gVar = this.f35528a;
            if (gVar.f35541a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g f35532a;

        c() {
        }

        public g a() {
            g gVar = this.f35532a;
            if (gVar == null) {
                return null;
            }
            g gVar2 = gVar.f35541a;
            gVar.f35541a = null;
            g gVar3 = gVar.f35543c;
            while (true) {
                g gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 == null) {
                    this.f35532a = gVar4;
                    return gVar;
                }
                gVar2.f35541a = gVar4;
                gVar3 = gVar2.f35542b;
            }
        }

        void b(g gVar) {
            g gVar2 = null;
            while (gVar != null) {
                gVar.f35541a = gVar2;
                gVar2 = gVar;
                gVar = gVar.f35542b;
            }
            this.f35532a = gVar2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class d extends AbstractSet {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a extends f {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return a();
            }
        }

        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            p.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && p.this.k((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g gVarK;
            if (!(obj instanceof Map.Entry) || (gVarK = p.this.k((Map.Entry) obj)) == null) {
                return false;
            }
            p.this.n(gVarK, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return p.this.f35523d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class e extends AbstractSet {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a extends f {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return a().f35546f;
            }
        }

        e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            p.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return p.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return p.this.o(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return p.this.f35523d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    abstract class f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g f35537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f35538b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f35539c;

        f() {
            this.f35537a = p.this.f35522c.f35544d;
            this.f35539c = p.this.f35524e;
        }

        final g a() {
            g gVar = this.f35537a;
            p pVar = p.this;
            if (gVar == pVar.f35522c) {
                throw new NoSuchElementException();
            }
            if (pVar.f35524e != this.f35539c) {
                throw new ConcurrentModificationException();
            }
            this.f35537a = gVar.f35544d;
            this.f35538b = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f35537a != p.this.f35522c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g gVar = this.f35538b;
            if (gVar == null) {
                throw new IllegalStateException();
            }
            p.this.n(gVar, true);
            this.f35538b = null;
            this.f35539c = p.this.f35524e;
        }
    }

    p() {
        this(null);
    }

    private void g() {
        g[] gVarArrH = h(this.f35521b);
        this.f35521b = gVarArrH;
        this.f35525f = (gVarArrH.length / 2) + (gVarArrH.length / 4);
    }

    static g[] h(g[] gVarArr) {
        int length = gVarArr.length;
        g[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i10 = 0; i10 < length; i10++) {
            g gVar = gVarArr[i10];
            if (gVar != null) {
                cVar.b(gVar);
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    g gVarA = cVar.a();
                    if (gVarA == null) {
                        break;
                    }
                    if ((gVarA.f35547g & length) == 0) {
                        i11++;
                    } else {
                        i12++;
                    }
                }
                bVar.b(i11);
                bVar2.b(i12);
                cVar.b(gVar);
                while (true) {
                    g gVarA2 = cVar.a();
                    if (gVarA2 == null) {
                        break;
                    }
                    if ((gVarA2.f35547g & length) == 0) {
                        bVar.a(gVarA2);
                    } else {
                        bVar2.a(gVarA2);
                    }
                }
                gVarArr2[i10] = i11 > 0 ? bVar.c() : null;
                gVarArr2[i10 + length] = i12 > 0 ? bVar2.c() : null;
            }
        }
        return gVarArr2;
    }

    private boolean i(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private void m(g gVar, boolean z10) {
        while (gVar != null) {
            g gVar2 = gVar.f35542b;
            g gVar3 = gVar.f35543c;
            int i10 = gVar2 != null ? gVar2.f35549i : 0;
            int i11 = gVar3 != null ? gVar3.f35549i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                g gVar4 = gVar3.f35542b;
                g gVar5 = gVar3.f35543c;
                int i13 = (gVar4 != null ? gVar4.f35549i : 0) - (gVar5 != null ? gVar5.f35549i : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    r(gVar3);
                }
                q(gVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                g gVar6 = gVar2.f35542b;
                g gVar7 = gVar2.f35543c;
                int i14 = (gVar6 != null ? gVar6.f35549i : 0) - (gVar7 != null ? gVar7.f35549i : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    q(gVar2);
                }
                r(gVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                gVar.f35549i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                gVar.f35549i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            gVar = gVar.f35541a;
        }
    }

    private void p(g gVar, g gVar2) {
        g gVar3 = gVar.f35541a;
        gVar.f35541a = null;
        if (gVar2 != null) {
            gVar2.f35541a = gVar3;
        }
        if (gVar3 == null) {
            int i10 = gVar.f35547g;
            g[] gVarArr = this.f35521b;
            gVarArr[i10 & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.f35542b == gVar) {
            gVar3.f35542b = gVar2;
        } else {
            gVar3.f35543c = gVar2;
        }
    }

    private void q(g gVar) {
        g gVar2 = gVar.f35542b;
        g gVar3 = gVar.f35543c;
        g gVar4 = gVar3.f35542b;
        g gVar5 = gVar3.f35543c;
        gVar.f35543c = gVar4;
        if (gVar4 != null) {
            gVar4.f35541a = gVar;
        }
        p(gVar, gVar3);
        gVar3.f35542b = gVar;
        gVar.f35541a = gVar3;
        int iMax = Math.max(gVar2 != null ? gVar2.f35549i : 0, gVar4 != null ? gVar4.f35549i : 0) + 1;
        gVar.f35549i = iMax;
        gVar3.f35549i = Math.max(iMax, gVar5 != null ? gVar5.f35549i : 0) + 1;
    }

    private void r(g gVar) {
        g gVar2 = gVar.f35542b;
        g gVar3 = gVar.f35543c;
        g gVar4 = gVar2.f35542b;
        g gVar5 = gVar2.f35543c;
        gVar.f35542b = gVar5;
        if (gVar5 != null) {
            gVar5.f35541a = gVar;
        }
        p(gVar, gVar2);
        gVar2.f35543c = gVar;
        gVar.f35541a = gVar2;
        int iMax = Math.max(gVar3 != null ? gVar3.f35549i : 0, gVar5 != null ? gVar5.f35549i : 0) + 1;
        gVar.f35549i = iMax;
        gVar2.f35549i = Math.max(iMax, gVar4 != null ? gVar4.f35549i : 0) + 1;
    }

    private static int s(int i10) {
        int i11 = i10 ^ ((i10 >>> 20) ^ (i10 >>> 12));
        return (i11 >>> 4) ^ ((i11 >>> 7) ^ i11);
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f35521b, (Object) null);
        this.f35523d = 0;
        this.f35524e++;
        g gVar = this.f35522c;
        g gVar2 = gVar.f35544d;
        while (gVar2 != gVar) {
            g gVar3 = gVar2.f35544d;
            gVar2.f35545e = null;
            gVar2.f35544d = null;
            gVar2 = gVar3;
        }
        gVar.f35545e = gVar;
        gVar.f35544d = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return l(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        d dVar = this.f35526g;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        this.f35526g = dVar2;
        return dVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        g gVarL = l(obj);
        if (gVarL != null) {
            return gVarL.f35548h;
        }
        return null;
    }

    g j(Object obj, boolean z10) {
        int iCompareTo;
        g gVar;
        Comparator comparator = this.f35520a;
        g[] gVarArr = this.f35521b;
        int iS = s(obj.hashCode());
        int length = (gVarArr.length - 1) & iS;
        g gVar2 = gVarArr[length];
        if (gVar2 != null) {
            Comparable comparable = comparator == f35519i ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(gVar2.f35546f) : comparator.compare(obj, gVar2.f35546f);
                if (iCompareTo == 0) {
                    return gVar2;
                }
                g gVar3 = iCompareTo < 0 ? gVar2.f35542b : gVar2.f35543c;
                if (gVar3 == null) {
                    break;
                }
                gVar2 = gVar3;
            }
        } else {
            iCompareTo = 0;
        }
        int i10 = iCompareTo;
        if (!z10) {
            return null;
        }
        g gVar4 = this.f35522c;
        if (gVar2 != null) {
            g gVar5 = gVar2;
            gVar = new g(gVar5, obj, iS, gVar4, gVar4.f35545e);
            if (i10 < 0) {
                gVar5.f35542b = gVar;
            } else {
                gVar5.f35543c = gVar;
            }
            m(gVar5, true);
        } else {
            if (comparator == f35519i && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            gVar = new g(gVar2, obj, iS, gVar4, gVar4.f35545e);
            gVarArr[length] = gVar;
        }
        int i11 = this.f35523d;
        this.f35523d = i11 + 1;
        if (i11 > this.f35525f) {
            g();
        }
        this.f35524e++;
        return gVar;
    }

    g k(Map.Entry entry) {
        g gVarL = l(entry.getKey());
        if (gVarL == null || !i(gVarL.f35548h, entry.getValue())) {
            return null;
        }
        return gVarL;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        e eVar = this.f35527h;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.f35527h = eVar2;
        return eVar2;
    }

    g l(Object obj) {
        if (obj != null) {
            try {
                return j(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    void n(g gVar, boolean z10) {
        int i10;
        if (z10) {
            g gVar2 = gVar.f35545e;
            gVar2.f35544d = gVar.f35544d;
            gVar.f35544d.f35545e = gVar2;
            gVar.f35545e = null;
            gVar.f35544d = null;
        }
        g gVar3 = gVar.f35542b;
        g gVar4 = gVar.f35543c;
        g gVar5 = gVar.f35541a;
        int i11 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                p(gVar, gVar3);
                gVar.f35542b = null;
            } else if (gVar4 != null) {
                p(gVar, gVar4);
                gVar.f35543c = null;
            } else {
                p(gVar, null);
            }
            m(gVar5, false);
            this.f35523d--;
            this.f35524e++;
            return;
        }
        g gVarB = gVar3.f35549i > gVar4.f35549i ? gVar3.b() : gVar4.a();
        n(gVarB, false);
        g gVar6 = gVar.f35542b;
        if (gVar6 != null) {
            i10 = gVar6.f35549i;
            gVarB.f35542b = gVar6;
            gVar6.f35541a = gVarB;
            gVar.f35542b = null;
        } else {
            i10 = 0;
        }
        g gVar7 = gVar.f35543c;
        if (gVar7 != null) {
            i11 = gVar7.f35549i;
            gVarB.f35543c = gVar7;
            gVar7.f35541a = gVarB;
            gVar.f35543c = null;
        }
        gVarB.f35549i = Math.max(i10, i11) + 1;
        p(gVar, gVarB);
    }

    g o(Object obj) {
        g gVarL = l(obj);
        if (gVarL != null) {
            n(gVarL, true);
        }
        return gVarL;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        g gVarJ = j(obj, true);
        Object obj3 = gVarJ.f35548h;
        gVarJ.f35548h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g gVarO = o(obj);
        if (gVarO != null) {
            return gVarO.f35548h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f35523d;
    }

    p(Comparator comparator) {
        this.f35523d = 0;
        this.f35524e = 0;
        this.f35520a = comparator == null ? f35519i : comparator;
        this.f35522c = new g();
        g[] gVarArr = new g[16];
        this.f35521b = gVarArr;
        this.f35525f = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class g implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g f35541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f35542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        g f35543c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        g f35544d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        g f35545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Object f35546f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f35547g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f35548h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f35549i;

        g() {
            this.f35546f = null;
            this.f35547g = -1;
            this.f35545e = this;
            this.f35544d = this;
        }

        public g a() {
            g gVar = this;
            for (g gVar2 = this.f35542b; gVar2 != null; gVar2 = gVar2.f35542b) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g b() {
            g gVar = this;
            for (g gVar2 = this.f35543c; gVar2 != null; gVar2 = gVar2.f35543c) {
                gVar = gVar2;
            }
            return gVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = this.f35546f;
                if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                    Object obj3 = this.f35548h;
                    if (obj3 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (obj3.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f35546f;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f35548h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f35546f;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f35548h;
            return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.f35548h;
            this.f35548h = obj;
            return obj2;
        }

        public String toString() {
            return this.f35546f + "=" + this.f35548h;
        }

        g(g gVar, Object obj, int i10, g gVar2, g gVar3) {
            this.f35541a = gVar;
            this.f35546f = obj;
            this.f35547g = i10;
            this.f35549i = 1;
            this.f35544d = gVar2;
            this.f35545e = gVar3;
            gVar3.f35544d = this;
            gVar2.f35545e = this;
        }
    }
}
