package com.google.android.exoplayer2.audio;

import android.os.Handler;
import com.google.android.exoplayer2.v0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface e {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f16583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f16584b;

        public a(Handler handler, e eVar) {
            this.f16583a = eVar != null ? (Handler) ob.a.e(handler) : null;
            this.f16584b = eVar;
        }

        public static /* synthetic */ void d(a aVar, v0 v0Var, s9.g gVar) {
            ((e) r0.j(aVar.f16584b)).C(v0Var);
            ((e) r0.j(aVar.f16584b)).r(v0Var, gVar);
        }

        public static /* synthetic */ void i(a aVar, s9.e eVar) {
            aVar.getClass();
            eVar.c();
            ((e) r0.j(aVar.f16584b)).k(eVar);
        }

        public void k(final Exception exc) {
            Handler handler = this.f16583a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q9.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.google.android.exoplayer2.audio.e) r0.j(this.f50473a.f16584b)).g(exc);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Handler handler = this.f16583a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q9.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.google.android.exoplayer2.audio.e) r0.j(this.f50484a.f16584b)).a(exc);
                    }
                });
            }
        }

        public void m(final String str, final long j10, final long j11) {
            Handler handler = this.f16583a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q9.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.google.android.exoplayer2.audio.e) r0.j(this.f50469a.f16584b)).onAudioDecoderInitialized(str, j10, j11);
                    }
                });
            }
        }

        public void n(final String str) {
            Handler handler = this.f16583a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q9.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.google.android.exoplayer2.audio.e) r0.j(this.f50461a.f16584b)).c(str);
                    }
                });
            }
        }

        public void o(final s9.e eVar) {
            eVar.c();
            Handler handler = this.f16583a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q9.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.audio.e.a.i(this.f50479a, eVar);
                    }
                });
            }
        }

        public void p(final s9.e eVar) {
            Handler handler = this.f16583a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q9.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.google.android.exoplayer2.audio.e) r0.j(this.f50477a.f16584b)).v(eVar);
                    }
                });
            }
        }

        public void q(final v0 v0Var, final s9.g gVar) {
            Handler handler = this.f16583a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q9.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.audio.e.a.d(this.f50481a, v0Var, gVar);
                    }
                });
            }
        }

        public void r(final long j10) {
            Handler handler = this.f16583a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q9.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.google.android.exoplayer2.audio.e) r0.j(this.f50475a.f16584b)).d(j10);
                    }
                });
            }
        }

        public void s(final boolean z10) {
            Handler handler = this.f16583a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q9.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.google.android.exoplayer2.audio.e) r0.j(this.f50467a.f16584b)).onSkipSilenceEnabledChanged(z10);
                    }
                });
            }
        }

        public void t(final int i10, final long j10, final long j11) {
            Handler handler = this.f16583a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q9.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.google.android.exoplayer2.audio.e) r0.j(this.f50463a.f16584b)).h(i10, j10, j11);
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

    void k(s9.e eVar);

    void onAudioDecoderInitialized(String str, long j10, long j11);

    void onSkipSilenceEnabledChanged(boolean z10);

    void r(v0 v0Var, s9.g gVar);

    void v(s9.e eVar);

    default void C(v0 v0Var) {
    }
}
