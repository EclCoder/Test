package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class k implements Iterator, ul.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1919c;

    public k(int i10) {
        this.f1917a = i10;
    }

    protected abstract Object a(int i10);

    protected abstract void b(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1918b < this.f1917a;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a(this.f1918b);
        this.f1918b++;
        this.f1919c = true;
        return objA;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f1919c) {
            s.d.b("Call next() before removing an element.");
        }
        int i10 = this.f1918b - 1;
        this.f1918b = i10;
        b(i10);
        this.f1917a--;
        this.f1919c = false;
    }
}
