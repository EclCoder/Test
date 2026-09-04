package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b implements Iterator, ul.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f43581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43582b;

    public b(Object[] array) {
        s.h(array, "array");
        this.f43581a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f43582b < this.f43581a.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f43581a;
            int i10 = this.f43582b;
            this.f43582b = i10 + 1;
            return objArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f43582b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
