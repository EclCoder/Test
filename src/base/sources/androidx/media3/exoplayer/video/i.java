package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.exoplayer.j;
import t1.g0;
import t1.o;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface i {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f6219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i f6220b;

        public a(Handler handler, i iVar) {
            this.f6219a = iVar != null ? (Handler) w1.a.e(handler) : null;
            this.f6220b = iVar;
        }

        public static /* synthetic */ void d(a aVar, androidx.media3.exoplayer.i iVar) {
            aVar.getClass();
            iVar.c();
            ((i) c0.h(aVar.f6220b)).v(iVar);
        }

        public void k(final String str, final long j10, final long j11) {
            Handler handler = this.f6219a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m2.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.i) c0.h(this.f45120a.f6220b)).onVideoDecoderInitialized(str, j10, j11);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f6219a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m2.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.i) c0.h(this.f45144a.f6220b)).b(str);
                    }
                });
            }
        }

        public void m(final androidx.media3.exoplayer.i iVar) {
            iVar.c();
            Handler handler = this.f6219a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m2.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.video.i.a.d(this.f45142a, iVar);
                    }
                });
            }
        }

        public void n(final int i10, final long j10) {
            Handler handler = this.f6219a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m2.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.i) c0.h(this.f45126a.f6220b)).onDroppedFrames(i10, j10);
                    }
                });
            }
        }

        public void o(final androidx.media3.exoplayer.i iVar) {
            Handler handler = this.f6219a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m2.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.i) c0.h(this.f45137a.f6220b)).p(iVar);
                    }
                });
            }
        }

        public void p(final o oVar, final j jVar) {
            Handler handler = this.f6219a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m2.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.i) c0.h(this.f45139a.f6220b)).l(oVar, jVar);
                    }
                });
            }
        }

        public void q(final Object obj) {
            if (this.f6219a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f6219a.post(new Runnable() { // from class: m2.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.i) c0.h(this.f45129a.f6220b)).f(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void r(final long j10, final int i10) {
            Handler handler = this.f6219a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m2.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.i) c0.h(this.f45132a.f6220b)).i(j10, i10);
                    }
                });
            }
        }

        public void s(final Exception exc) {
            Handler handler = this.f6219a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m2.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.i) c0.h(this.f45135a.f6220b)).e(exc);
                    }
                });
            }
        }

        public void t(final g0 g0Var) {
            Handler handler = this.f6219a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m2.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.i) c0.h(this.f45124a.f6220b)).onVideoSizeChanged(g0Var);
                    }
                });
            }
        }
    }

    void b(String str);

    void e(Exception exc);

    void f(Object obj, long j10);

    void i(long j10, int i10);

    void l(o oVar, j jVar);

    void onDroppedFrames(int i10, long j10);

    void onVideoDecoderInitialized(String str, long j10, long j11);

    void onVideoSizeChanged(g0 g0Var);

    void p(androidx.media3.exoplayer.i iVar);

    void v(androidx.media3.exoplayer.i iVar);
}
