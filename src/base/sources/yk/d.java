package yk;

import java.util.concurrent.atomic.AtomicReference;
import ok.f;
import ok.g;
import ok.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d extends yk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final h f58072b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends AtomicReference implements g, rk.b {
        private static final long serialVersionUID = 8094547886072529208L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final g f58073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference f58074b = new AtomicReference();

        a(g gVar) {
            this.f58073a = gVar;
        }

        void a(rk.b bVar) {
            uk.b.h(this, bVar);
        }

        @Override // ok.g
        public void b(rk.b bVar) {
            uk.b.h(this.f58074b, bVar);
        }

        @Override // rk.b
        public void d() {
            uk.b.a(this.f58074b);
            uk.b.a(this);
        }

        @Override // ok.g
        public void onComplete() {
            this.f58073a.onComplete();
        }

        @Override // ok.g
        public void onError(Throwable th2) {
            this.f58073a.onError(th2);
        }

        @Override // ok.g
        public void onNext(Object obj) {
            this.f58073a.onNext(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f58075a;

        b(a aVar) {
            this.f58075a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f58055a.a(this.f58075a);
        }
    }

    public d(f fVar, h hVar) {
        super(fVar);
        this.f58072b = hVar;
    }

    @Override // ok.c
    public void h(g gVar) {
        a aVar = new a(gVar);
        gVar.b(aVar);
        aVar.a(this.f58072b.b(new b(aVar)));
    }
}
