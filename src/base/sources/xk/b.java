package xk;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import ok.g;
import tk.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b extends AtomicReference implements g, rk.b {
    private static final long serialVersionUID = -7251123623727029452L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final c f56876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final c f56877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final tk.a f56878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final c f56879d;

    public b(c cVar, c cVar2, tk.a aVar, c cVar3) {
        this.f56876a = cVar;
        this.f56877b = cVar2;
        this.f56878c = aVar;
        this.f56879d = cVar3;
    }

    @Override // ok.g
    public void b(rk.b bVar) {
        if (uk.b.h(this, bVar)) {
            try {
                this.f56879d.accept(this);
            } catch (Throwable th2) {
                sk.a.b(th2);
                bVar.d();
                onError(th2);
            }
        }
    }

    @Override // rk.b
    public void d() {
        uk.b.a(this);
    }

    public boolean g() {
        return get() == uk.b.DISPOSED;
    }

    @Override // ok.g
    public void onComplete() {
        if (g()) {
            return;
        }
        lazySet(uk.b.DISPOSED);
        try {
            this.f56878c.run();
        } catch (Throwable th2) {
            sk.a.b(th2);
            cl.a.k(th2);
        }
    }

    @Override // ok.g
    public void onError(Throwable th2) {
        if (g()) {
            cl.a.k(th2);
            return;
        }
        lazySet(uk.b.DISPOSED);
        try {
            this.f56877b.accept(th2);
        } catch (Throwable th3) {
            sk.a.b(th3);
            cl.a.k(new CompositeException(th2, th3));
        }
    }

    @Override // ok.g
    public void onNext(Object obj) {
        if (g()) {
            return;
        }
        try {
            this.f56876a.accept(obj);
        } catch (Throwable th2) {
            sk.a.b(th2);
            ((rk.b) get()).d();
            onError(th2);
        }
    }
}
