package n0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements Iterator, ul.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f46702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f46703b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f46704c;

    public m0(Iterator it, Function1 function1) {
        this.f46702a = function1;
        this.f46704c = it;
    }

    private final void a(Object obj) {
        Iterator it = (Iterator) this.f46702a.invoke(obj);
        if (it != null && it.hasNext()) {
            this.f46703b.add(this.f46704c);
            this.f46704c = it;
        } else {
            while (!this.f46704c.hasNext() && !this.f46703b.isEmpty()) {
                this.f46704c = (Iterator) gl.r.n0(this.f46703b);
                gl.r.H(this.f46703b);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f46704c.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        Object next = this.f46704c.next();
        a(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
