package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class m1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f21796a;

    m1(Iterator it) {
        this.f21796a = (Iterator) sc.p.o(it);
    }

    abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21796a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f21796a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f21796a.remove();
    }
}
