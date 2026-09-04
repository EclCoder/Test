package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class a extends q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21647b;

    protected a(int i10, int i11) {
        sc.p.s(i11, i10);
        this.f21646a = i10;
        this.f21647b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f21647b < this.f21646a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f21647b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f21647b;
        this.f21647b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f21647b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f21647b - 1;
        this.f21647b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f21647b - 1;
    }
}
