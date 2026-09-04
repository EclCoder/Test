package am;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tl.a f433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f434b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Iterator, ul.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f436b = -2;

        a() {
        }

        private final void a() {
            Object objInvoke;
            if (this.f436b == -2) {
                objInvoke = f.this.f433a.invoke();
            } else {
                Function1 function1 = f.this.f434b;
                Object obj = this.f435a;
                kotlin.jvm.internal.s.e(obj);
                objInvoke = function1.invoke(obj);
            }
            this.f435a = objInvoke;
            this.f436b = objInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f436b < 0) {
                a();
            }
            return this.f436b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f436b < 0) {
                a();
            }
            if (this.f436b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f435a;
            kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f436b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(tl.a getInitialValue, Function1 getNextValue) {
        kotlin.jvm.internal.s.h(getInitialValue, "getInitialValue");
        kotlin.jvm.internal.s.h(getNextValue, "getNextValue");
        this.f433a = getInitialValue;
        this.f434b = getNextValue;
    }

    @Override // am.g
    public Iterator iterator() {
        return new a();
    }
}
