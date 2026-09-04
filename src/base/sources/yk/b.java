package yk;

import java.util.concurrent.atomic.AtomicReference;
import ok.e;
import ok.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ok.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final e f58056a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends AtomicReference implements ok.d, rk.b {
        private static final long serialVersionUID = -3434801548987643227L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final g f58057a;

        a(g gVar) {
            this.f58057a = gVar;
        }

        @Override // rk.b
        public void d() {
            uk.b.a(this);
        }

        public boolean g() {
            return uk.b.b((rk.b) get());
        }

        public void h(Throwable th2) {
            if (i(th2)) {
                return;
            }
            cl.a.k(th2);
        }

        public boolean i(Throwable th2) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (g()) {
                return false;
            }
            try {
                this.f58057a.onError(th2);
                return true;
            } finally {
                d();
            }
        }

        @Override // ok.a
        public void onNext(Object obj) {
            if (obj == null) {
                h(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                if (g()) {
                    return;
                }
                this.f58057a.onNext(obj);
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }

    public b(e eVar) {
        this.f58056a = eVar;
    }

    @Override // ok.c
    protected void h(g gVar) {
        a aVar = new a(gVar);
        gVar.b(aVar);
        try {
            this.f58056a.a(aVar);
        } catch (Throwable th2) {
            sk.a.b(th2);
            aVar.h(th2);
        }
    }
}
