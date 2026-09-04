package c2;

import android.os.Looper;
import androidx.media3.exoplayer.audio.AudioSink;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface a extends t1.x.d, androidx.media3.exoplayer.source.s, l2.d.a, androidx.media3.exoplayer.drm.h {
    void C(t1.x xVar, Looper looper);

    void E(b bVar);

    void a(Exception exc);

    void b(String str);

    void c(String str);

    void d(long j10);

    void e(Exception exc);

    void f(Object obj, long j10);

    void g(Exception exc);

    void h(int i10, long j10, long j11);

    void i(long j10, int i10);

    void j(AudioSink.a aVar);

    void k(AudioSink.a aVar);

    void l(t1.o oVar, androidx.media3.exoplayer.j jVar);

    void m();

    void n(List list, androidx.media3.exoplayer.source.r.b bVar);

    void o(androidx.media3.exoplayer.i iVar);

    void onAudioDecoderInitialized(String str, long j10, long j11);

    void onDroppedFrames(int i10, long j10);

    void onVideoDecoderInitialized(String str, long j10, long j11);

    void p(androidx.media3.exoplayer.i iVar);

    void r(t1.o oVar, androidx.media3.exoplayer.j jVar);

    void release();

    void s(androidx.media3.exoplayer.i iVar);

    void v(androidx.media3.exoplayer.i iVar);
}
