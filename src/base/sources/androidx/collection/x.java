package androidx.collection;

import gl.j0;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f1943b;

        a(v vVar) {
            this.f1943b = vVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1942a < this.f1943b.o();
        }

        @Override // gl.j0
        public int nextInt() {
            v vVar = this.f1943b;
            int i10 = this.f1942a;
            this.f1942a = i10 + 1;
            return vVar.k(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements Iterator, ul.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f1945b;

        b(v vVar) {
            this.f1945b = vVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1944a < this.f1945b.o();
        }

        @Override // java.util.Iterator
        public Object next() {
            v vVar = this.f1945b;
            int i10 = this.f1944a;
            this.f1944a = i10 + 1;
            return vVar.p(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final j0 a(v vVar) {
        kotlin.jvm.internal.s.h(vVar, "<this>");
        return new a(vVar);
    }

    public static final Iterator b(v vVar) {
        kotlin.jvm.internal.s.h(vVar, "<this>");
        return new b(vVar);
    }
}
