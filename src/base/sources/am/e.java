package am;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f428c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Iterator, ul.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f430b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f431c;

        a() {
            this.f429a = e.this.f426a.iterator();
        }

        private final void a() {
            while (this.f429a.hasNext()) {
                Object next = this.f429a.next();
                if (((Boolean) e.this.f428c.invoke(next)).booleanValue() == e.this.f427b) {
                    this.f431c = next;
                    this.f430b = 1;
                    return;
                }
            }
            this.f430b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f430b == -1) {
                a();
            }
            return this.f430b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f430b == -1) {
                a();
            }
            if (this.f430b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f431c;
            this.f431c = null;
            this.f430b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(g sequence, boolean z10, Function1 predicate) {
        kotlin.jvm.internal.s.h(sequence, "sequence");
        kotlin.jvm.internal.s.h(predicate, "predicate");
        this.f426a = sequence;
        this.f427b = z10;
        this.f428c = predicate;
    }

    @Override // am.g
    public Iterator iterator() {
        return new a();
    }
}
