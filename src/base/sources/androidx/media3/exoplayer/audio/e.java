package androidx.media3.exoplayer.audio;

import android.os.Handler;
import t1.o;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface e {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f5022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f5023b;

        public a(Handler handler, e eVar) {
            this.f5022a = eVar != null ? (Handler) w1.a.e(handler) : null;
            this.f5023b = eVar;
        }

        public static /* synthetic */ void d(a aVar, androidx.media3.exoplayer.i iVar) {
            aVar.getClass();
            iVar.c();
            ((e) c0.h(aVar.f5023b)).s(iVar);
        }

        public void m(final Exception exc) {
            Handler handler = this.f5022a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d2.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) c0.h(this.f36119a.f5023b)).g(exc);
                    }
                });
            }
        }

        public void n(final Exception exc) {
            Handler handler = this.f5022a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d2.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) c0.h(this.f36121a.f5023b)).a(exc);
                    }
                });
            }
        }

        public void o(final AudioSink.a aVar) {
            Handler handler = this.f5022a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d2.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) c0.h(this.f36117a.f5023b)).j(aVar);
                    }
                });
            }
        }

        public void p(final AudioSink.a aVar) {
            Handler handler = this.f5022a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d2.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) c0.h(this.f36111a.f5023b)).k(aVar);
                    }
                });
            }
        }

        public void q(final String str, final long j10, final long j11) {
            Handler handler = this.f5022a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d2.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) c0.h(this.f36128a.f5023b)).onAudioDecoderInitialized(str, j10, j11);
                    }
                });
            }
        }

        public void r(final String str) {
            Handler handler = this.f5022a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d2.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) c0.h(this.f36132a.f5023b)).c(str);
                    }
                });
            }
        }

        public void s(final androidx.media3.exoplayer.i iVar) {
            iVar.c();
            Handler handler = this.f5022a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d2.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.audio.e.a.d(this.f36134a, iVar);
                    }
                });
            }
        }

        public void t(final androidx.media3.exoplayer.i iVar) {
            Handler handler = this.f5022a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d2.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) c0.h(this.f36107a.f5023b)).o(iVar);
                    }
                });
            }
        }

        public void u(final o oVar, final androidx.media3.exoplayer.j jVar) {
            Handler handler = this.f5022a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d2.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) c0.h(this.f36123a.f5023b)).r(oVar, jVar);
                    }
                });
            }
        }

        public void v(final long j10) {
            Handler handler = this.f5022a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) c0.h(this.f36109a.f5023b)).d(j10);
                    }
                });
            }
        }

        public void w(final boolean z10) {
            Handler handler = this.f5022a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d2.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) c0.h(this.f36126a.f5023b)).onSkipSilenceEnabledChanged(z10);
                    }
                });
            }
        }

        public void x(final int i10, final long j10, final long j11) {
            Handler handler = this.f5022a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d2.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) c0.h(this.f36113a.f5023b)).h(i10, j10, j11);
                    }
                });
            }
        }
    }

    void a(Exception exc);

    void c(String str);

    void d(long j10);

    void g(Exception exc);

    void h(int i10, long j10, long j11);

    void j(AudioSink.a aVar);

    void k(AudioSink.a aVar);

    void o(androidx.media3.exoplayer.i iVar);

    void onAudioDecoderInitialized(String str, long j10, long j11);

    void onSkipSilenceEnabledChanged(boolean z10);

    void r(o oVar, androidx.media3.exoplayer.j jVar);

    void s(androidx.media3.exoplayer.i iVar);
}
