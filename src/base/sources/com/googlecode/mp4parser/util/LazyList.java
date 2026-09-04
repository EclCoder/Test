package com.googlecode.mp4parser.util;

import f8.Ygx.FuoITeVPeXAj;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class LazyList<E> extends AbstractList<E> {
    private static final Logger LOG = Logger.getLogger(LazyList.class);
    Iterator<E> elementSource;
    List<E> underlying;

    public LazyList(List<E> list, Iterator<E> it) {
        this.underlying = list;
        this.elementSource = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        if (this.underlying.size() > i10) {
            return this.underlying.get(i10);
        }
        if (!this.elementSource.hasNext()) {
            throw new NoSuchElementException();
        }
        this.underlying.add(this.elementSource.next());
        return get(i10);
    }

    public List<E> getUnderlying() {
        return this.underlying;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new Iterator<E>() { // from class: com.googlecode.mp4parser.util.LazyList.1
            int pos = 0;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.pos < LazyList.this.underlying.size() || LazyList.this.elementSource.hasNext();
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.pos >= LazyList.this.underlying.size()) {
                    LazyList lazyList = LazyList.this;
                    lazyList.underlying.add(lazyList.elementSource.next());
                    return (E) next();
                }
                List<E> list = LazyList.this.underlying;
                int i10 = this.pos;
                this.pos = i10 + 1;
                return list.get(i10);
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        LOG.logDebug("potentially expensive size() call");
        blowup();
        return this.underlying.size();
    }

    private void blowup() {
        LOG.logDebug(FuoITeVPeXAj.AFzBVyKwsa);
        while (this.elementSource.hasNext()) {
            this.underlying.add(this.elementSource.next());
        }
    }
}
