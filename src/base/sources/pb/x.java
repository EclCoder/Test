package pb;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.v0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface x {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f49989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x f49990b;

        public a(Handler handler, x xVar) {
            this.f49989a = xVar != null ? (Handler) ob.a.e(handler) : null;
            this.f49990b = xVar;
        }

        public static /* synthetic */ void c(a aVar, s9.e eVar) {
            aVar.getClass();
            eVar.c();
            ((x) r0.j(aVar.f49990b)).j(eVar);
        }

        public static /* synthetic */ void i(a aVar, v0 v0Var, s9.g gVar) {
            ((x) r0.j(aVar.f49990b)).z(v0Var);
            ((x) r0.j(aVar.f49990b)).o(v0Var, gVar);
        }

        public void k(final String str, final long j10, final long j11) {
            Handler handler = this.f49989a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: pb.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((x) r0.j(this.f49977a.f49990b)).onVideoDecoderInitialized(str, j10, j11);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f49989a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: pb.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((x) r0.j(this.f49971a.f49990b)).b(str);
                    }
                });
            }
        }

        public void m(final s9.e eVar) {
            eVar.c();
            Handler handler = this.f49989a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: pb.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.c(this.f49973a, eVar);
                    }
                });
            }
        }

        public void n(final int i10, final long j10) {
            Handler handler = this.f49989a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: pb.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((x) r0.j(this.f49965a.f49990b)).onDroppedFrames(i10, j10);
                    }
                });
            }
        }

        public void o(final s9.e eVar) {
            Handler handler = this.f49989a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: pb.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((x) r0.j(this.f49981a.f49990b)).l(eVar);
                    }
                });
            }
        }

        public void p(final v0 v0Var, final s9.g gVar) {
            Handler handler = this.f49989a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: pb.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.i(this.f49983a, v0Var, gVar);
                    }
                });
            }
        }

        public void q(final Object obj) {
            if (this.f49989a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f49989a.post(new Runnable() { // from class: pb.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((x) r0.j(this.f49968a.f49990b)).f(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void r(final long j10, final int i10) {
            Handler handler = this.f49989a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: pb.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((x) r0.j(this.f49986a.f49990b)).i(j10, i10);
                    }
                });
            }
        }

        public void s(final Exception exc) {
            Handler handler = this.f49989a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: pb.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((x) r0.j(this.f49975a.f49990b)).e(exc);
                    }
                });
            }
        }

        public void t(final z zVar) {
            Handler handler = this.f49989a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: pb.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((x) r0.j(this.f49963a.f49990b)).w(zVar);
                    }
                });
            }
        }
    }

    void b(String str);

    void e(Exception exc);

    void f(Object obj, long j10);

    void i(long j10, int i10);

    void j(s9.e eVar);

    void l(s9.e eVar);

    void o(v0 v0Var, s9.g gVar);

    void onDroppedFrames(int i10, long j10);

    void onVideoDecoderInitialized(String str, long j10, long j11);

    void w(z zVar);

    default void z(v0 v0Var) {
    }
}
