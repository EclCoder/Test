package androidx.media3.exoplayer.video;

import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import t1.g0;
import t1.o;
import w1.v;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface VideoSink {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class VideoSinkException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f6122a;

        public VideoSinkException(Throwable th2, o oVar) {
            super(th2);
            this.f6122a = oVar;
        }
    }

    void a(int i10, o oVar);

    void b();

    long c(long j10, boolean z10);

    void d();

    void e(List list);

    void g(long j10, long j11);

    boolean h();

    void i(boolean z10);

    boolean isEnded();

    boolean isInitialized();

    boolean isReady();

    void j(m2.f fVar);

    Surface k();

    void l();

    void n();

    void o(float f10);

    void p();

    void r(boolean z10);

    void release();

    void render(long j10, long j11);

    void s(Surface surface, v vVar);

    void t(a aVar, Executor executor);

    void u(o oVar);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6123a = new C0064a();

        void a(VideoSink videoSink, g0 g0Var);

        void b(VideoSink videoSink);

        void c(VideoSink videoSink);

        /* JADX INFO: renamed from: androidx.media3.exoplayer.video.VideoSink$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0064a implements a {
            C0064a() {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.a
            public void b(VideoSink videoSink) {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.a
            public void c(VideoSink videoSink) {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.a
            public void a(VideoSink videoSink, g0 g0Var) {
            }
        }
    }
}
