package nb;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface d {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {

        /* JADX INFO: renamed from: nb.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0725a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList f46966a = new CopyOnWriteArrayList();

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: nb.d$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            static final class C0726a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final Handler f46967a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final a f46968b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f46969c;

                public C0726a(Handler handler, a aVar) {
                    this.f46967a = handler;
                    this.f46968b = aVar;
                }

                public void d() {
                    this.f46969c = true;
                }
            }

            public void b(Handler handler, a aVar) {
                ob.a.e(handler);
                ob.a.e(aVar);
                d(aVar);
                this.f46966a.add(new C0726a(handler, aVar));
            }

            public void c(int i10, long j10, long j11) {
                final int i11;
                final long j12;
                final long j13;
                for (final C0726a c0726a : this.f46966a) {
                    if (c0726a.f46969c) {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                    } else {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                        c0726a.f46967a.post(new Runnable() { // from class: nb.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                c0726a.f46968b.onBandwidthSample(i11, j12, j13);
                            }
                        });
                    }
                    i10 = i11;
                    j10 = j12;
                    j11 = j13;
                }
            }

            public void d(a aVar) {
                for (C0726a c0726a : this.f46966a) {
                    if (c0726a.f46968b == aVar) {
                        c0726a.d();
                        this.f46966a.remove(c0726a);
                    }
                }
            }
        }

        void onBandwidthSample(int i10, long j10, long j11);
    }

    a0 a();

    default long b() {
        return C.TIME_UNSET;
    }

    void d(Handler handler, a aVar);

    void g(a aVar);

    long getBitrateEstimate();
}
