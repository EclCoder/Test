package androidx.lifecycle;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f4402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f4403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f4404c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f0 f4405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s.a f4406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f4407c;

        public a(f0 registry, s.a event) {
            kotlin.jvm.internal.s.h(registry, "registry");
            kotlin.jvm.internal.s.h(event, "event");
            this.f4405a = registry;
            this.f4406b = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4407c) {
                return;
            }
            this.f4405a.m(this.f4406b);
            this.f4407c = true;
        }
    }

    public j1(b0 provider) {
        kotlin.jvm.internal.s.h(provider, "provider");
        this.f4402a = new f0(provider);
        this.f4403b = new Handler(Looper.getMainLooper());
    }

    private final void f(s.a aVar) {
        a aVar2 = this.f4404c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f4402a, aVar);
        this.f4404c = aVar3;
        this.f4403b.postAtFrontOfQueue(aVar3);
    }

    public s a() {
        return this.f4402a;
    }

    public void b() {
        f(s.a.ON_START);
    }

    public void c() {
        f(s.a.ON_CREATE);
    }

    public void d() {
        f(s.a.ON_STOP);
        f(s.a.ON_DESTROY);
    }

    public void e() {
        f(s.a.ON_START);
    }
}
