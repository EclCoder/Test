package am;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class t implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f454b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Iterator, ul.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f455a;

        a() {
            this.f455a = t.this.f453a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f455a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return t.this.f454b.invoke(this.f455a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public t(g sequence, Function1 transformer) {
        kotlin.jvm.internal.s.h(sequence, "sequence");
        kotlin.jvm.internal.s.h(transformer, "transformer");
        this.f453a = sequence;
        this.f454b = transformer;
    }

    @Override // am.g
    public Iterator iterator() {
        return new a();
    }
}
