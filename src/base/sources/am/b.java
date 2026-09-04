package am;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements g, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f422b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Iterator, ul.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f424b;

        a(b bVar) {
            this.f423a = bVar.f421a.iterator();
            this.f424b = bVar.f422b;
        }

        private final void a() {
            while (this.f424b > 0 && this.f423a.hasNext()) {
                this.f423a.next();
                this.f424b--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f423a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            return this.f423a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(g sequence, int i10) {
        kotlin.jvm.internal.s.h(sequence, "sequence");
        this.f421a = sequence;
        this.f422b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // am.c
    public g a(int i10) {
        int i11 = this.f422b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f421a, i11);
    }

    @Override // am.g
    public Iterator iterator() {
        return new a(this);
    }
}
