package gl;

import com.mbridge.msdk.playercommon.PHx.jyeoXJ;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class r0 extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f39339b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements ListIterator, ul.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ListIterator f39340a;

        a(int i10) {
            this.f39340a = r0.this.f39339b.listIterator(z.R(r0.this, i10));
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f39340a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f39340a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f39340a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return z.Q(r0.this, this.f39340a.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f39340a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return z.Q(r0.this, this.f39340a.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException(jyeoXJ.vQzIQsNGgy);
        }
    }

    public r0(List delegate) {
        kotlin.jvm.internal.s.h(delegate, "delegate");
        this.f39339b = delegate;
    }

    @Override // gl.b
    public int d() {
        return this.f39339b.size();
    }

    @Override // gl.d, java.util.List
    public Object get(int i10) {
        return this.f39339b.get(z.P(this, i10));
    }

    @Override // gl.d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // gl.d, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // gl.d, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }
}
