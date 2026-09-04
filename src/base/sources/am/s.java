package am;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f448b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Iterator, ul.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f450b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f451c;

        a() {
            this.f449a = s.this.f447a.iterator();
        }

        private final void a() {
            if (this.f449a.hasNext()) {
                Object next = this.f449a.next();
                if (((Boolean) s.this.f448b.invoke(next)).booleanValue()) {
                    this.f450b = 1;
                    this.f451c = next;
                    return;
                }
            }
            this.f450b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f450b == -1) {
                a();
            }
            return this.f450b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f450b == -1) {
                a();
            }
            if (this.f450b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f451c;
            this.f451c = null;
            this.f450b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public s(g sequence, Function1 predicate) {
        kotlin.jvm.internal.s.h(sequence, "sequence");
        kotlin.jvm.internal.s.h(predicate, "predicate");
        this.f447a = sequence;
        this.f448b = predicate;
    }

    @Override // am.g
    public Iterator iterator() {
        return new a();
    }
}
