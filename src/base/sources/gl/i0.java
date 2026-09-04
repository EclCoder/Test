package gl;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 implements Iterator, ul.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator f39336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39337b;

    public i0(Iterator iterator) {
        kotlin.jvm.internal.s.h(iterator, "iterator");
        this.f39336a = iterator;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g0 next() {
        int i10 = this.f39337b;
        this.f39337b = i10 + 1;
        if (i10 < 0) {
            t.u();
        }
        return new g0(i10, this.f39336a.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39336a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
