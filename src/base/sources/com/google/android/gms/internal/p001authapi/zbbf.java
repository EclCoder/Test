package com.google.android.gms.internal.p001authapi;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class zbbf extends zbbm {
    private final int zba;
    private int zbb;

    zbbf(int i10, int i11) {
        zbbd.zbb(i11, i10, "index");
        this.zba = i10;
        this.zbb = i11;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.zbb < this.zba;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zbb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.zbb;
        this.zbb = i10 + 1;
        return zba(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zbb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.zbb - 1;
        this.zbb = i10;
        return zba(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zbb - 1;
    }

    abstract Object zba(int i10);
}
