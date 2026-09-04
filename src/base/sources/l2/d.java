package l2;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import z1.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface d {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {

        /* JADX INFO: renamed from: l2.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0665a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList f43795a = new CopyOnWriteArrayList();

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: l2.d$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            static final class C0666a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final Handler f43796a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final a f43797b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f43798c;

                public C0666a(Handler handler, a aVar) {
                    this.f43796a = handler;
                    this.f43797b = aVar;
                }

                public void d() {
                    this.f43798c = true;
                }
            }

            public void b(Handler handler, a aVar) {
                w1.a.e(handler);
                w1.a.e(aVar);
                d(aVar);
                this.f43795a.add(new C0666a(handler, aVar));
            }

            public void c(int i10, long j10, long j11) {
                final int i11;
                final long j12;
                final long j13;
                for (final C0666a c0666a : this.f43795a) {
                    if (c0666a.f43798c) {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                    } else {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                        c0666a.f43796a.post(new Runnable() { // from class: l2.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                c0666a.f43797b.onBandwidthSample(i11, j12, j13);
                            }
                        });
                    }
                    i10 = i11;
                    j10 = j12;
                    j11 = j13;
                }
            }

            public void d(a aVar) {
                for (C0666a c0666a : this.f43795a) {
                    if (c0666a.f43797b == aVar) {
                        c0666a.d();
                        this.f43795a.remove(c0666a);
                    }
                }
            }
        }

        void onBandwidthSample(int i10, long j10, long j11);
    }

    m a();

    void c(Handler handler, a aVar);

    void d(a aVar);
}
