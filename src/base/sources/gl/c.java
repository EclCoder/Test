package gl;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements Iterator, ul.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f39314b;

    private final boolean d() {
        this.f39313a = 3;
        a();
        return this.f39313a == 1;
    }

    protected abstract void a();

    protected final void b() {
        this.f39313a = 2;
    }

    protected final void c(Object obj) {
        this.f39314b = obj;
        this.f39313a = 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.f39313a;
        if (i10 == 0) {
            return d();
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f39313a;
        if (i10 == 1) {
            this.f39313a = 0;
            return this.f39314b;
        }
        if (i10 == 2 || !d()) {
            throw new NoSuchElementException();
        }
        this.f39313a = 0;
        return this.f39314b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
