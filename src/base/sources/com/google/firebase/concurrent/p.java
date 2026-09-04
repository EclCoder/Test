package com.google.firebase.concurrent;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class p extends androidx.concurrent.futures.a implements ScheduledFuture {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ScheduledFuture f22152h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements b {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th2) {
            p.this.o(th2);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(Object obj) {
            p.this.n(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface b {
        void a(Throwable th2);

        void set(Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface c {
        ScheduledFuture a(b bVar);
    }

    p(c cVar) {
        this.f22152h = cVar.a(new a());
    }

    @Override // androidx.concurrent.futures.a
    protected void b() {
        this.f22152h.cancel(q());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f22152h.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f22152h.compareTo(delayed);
    }
}
