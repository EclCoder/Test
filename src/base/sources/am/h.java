package am;

import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import fl.g0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class h extends i implements Iterator, kl.f, ul.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private kl.f f441d;

    private final Object f() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // am.i
    public Object a(Object obj, kl.f fVar) {
        this.f439b = obj;
        this.f438a = 3;
        this.f441d = fVar;
        Object objF = ll.b.f();
        if (objF == ll.b.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objF == ll.b.f() ? objF : g0.f38750a;
    }

    @Override // am.i
    public Object c(Iterator it, kl.f fVar) {
        if (!it.hasNext()) {
            return g0.f38750a;
        }
        this.f440c = it;
        this.f438a = 2;
        this.f441d = fVar;
        Object objF = ll.b.f();
        if (objF == ll.b.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objF == ll.b.f() ? objF : g0.f38750a;
    }

    public final void g(kl.f fVar) {
        this.f441d = fVar;
    }

    @Override // kl.f
    public kl.j getContext() {
        return kl.k.f43531a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i10 = this.f438a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw d();
                }
                Iterator it = this.f440c;
                kotlin.jvm.internal.s.e(it);
                if (it.hasNext()) {
                    this.f438a = 2;
                    return true;
                }
                this.f440c = null;
            }
            this.f438a = 5;
            kl.f fVar = this.f441d;
            kotlin.jvm.internal.s.e(fVar);
            this.f441d = null;
            fVar.resumeWith(fl.r.b(g0.f38750a));
        }
    }

    @Override // java.util.Iterator
    public Object next() throws Throwable {
        int i10 = this.f438a;
        if (i10 == 0 || i10 == 1) {
            return f();
        }
        if (i10 == 2) {
            this.f438a = 1;
            Iterator it = this.f440c;
            kotlin.jvm.internal.s.e(it);
            return it.next();
        }
        if (i10 != 3) {
            throw d();
        }
        this.f438a = 0;
        Object obj = this.f439b;
        this.f439b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kl.f
    public void resumeWith(Object obj) {
        fl.s.b(obj);
        this.f438a = 4;
    }

    private final Throwable d() {
        int i10 = this.f438a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException(obFGmWgqyy.AwypJLJUZAySha);
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f438a);
    }
}
