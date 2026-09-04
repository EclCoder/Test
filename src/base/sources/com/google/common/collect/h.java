package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class h extends g implements k1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Comparator f21760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient k1 f21761d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends s {
        a() {
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return h.this.descendingIterator();
        }

        @Override // com.google.common.collect.s
        Iterator n() {
            return h.this.o();
        }

        @Override // com.google.common.collect.s
        k1 o() {
            return h.this;
        }
    }

    h() {
        this(w0.d());
    }

    @Override // com.google.common.collect.k1, com.google.common.collect.i1
    public Comparator comparator() {
        return this.f21760c;
    }

    Iterator descendingIterator() {
        return s0.g(t());
    }

    @Override // com.google.common.collect.k1
    public r0.a firstEntry() {
        Iterator itK = k();
        if (itK.hasNext()) {
            return (r0.a) itK.next();
        }
        return null;
    }

    @Override // com.google.common.collect.k1
    public k1 i(Object obj, j jVar, Object obj2, j jVar2) {
        sc.p.o(jVar);
        sc.p.o(jVar2);
        return i0(obj, jVar).d0(obj2, jVar2);
    }

    @Override // com.google.common.collect.k1
    public r0.a lastEntry() {
        Iterator itO = o();
        if (itO.hasNext()) {
            return (r0.a) itO.next();
        }
        return null;
    }

    k1 m() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.g
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public NavigableSet d() {
        return new l1.b(this);
    }

    abstract Iterator o();

    @Override // com.google.common.collect.k1
    public r0.a pollFirstEntry() {
        Iterator itK = k();
        if (!itK.hasNext()) {
            return null;
        }
        r0.a aVar = (r0.a) itK.next();
        r0.a aVarF = s0.f(aVar.d(), aVar.getCount());
        itK.remove();
        return aVarF;
    }

    @Override // com.google.common.collect.k1
    public r0.a pollLastEntry() {
        Iterator itO = o();
        if (!itO.hasNext()) {
            return null;
        }
        r0.a aVar = (r0.a) itO.next();
        r0.a aVarF = s0.f(aVar.d(), aVar.getCount());
        itO.remove();
        return aVarF;
    }

    @Override // com.google.common.collect.k1
    public k1 t() {
        k1 k1Var = this.f21761d;
        if (k1Var != null) {
            return k1Var;
        }
        k1 k1VarM = m();
        this.f21761d = k1VarM;
        return k1VarM;
    }

    h(Comparator comparator) {
        this.f21760c = (Comparator) sc.p.o(comparator);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.r0
    public NavigableSet l() {
        return (NavigableSet) super.l();
    }
}
