package p9;

import android.os.Looper;
import com.google.android.exoplayer2.x1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface a extends x1.d, com.google.android.exoplayer2.source.q, nb.d.a, com.google.android.exoplayer2.drm.i {
    void M(b bVar);

    void O(List list, com.google.android.exoplayer2.source.p.b bVar);

    void a(Exception exc);

    void b(String str);

    void c(String str);

    void d(long j10);

    void e(Exception exc);

    void f(Object obj, long j10);

    void g(Exception exc);

    void h(int i10, long j10, long j11);

    void i(long j10, int i10);

    void j(s9.e eVar);

    void k(s9.e eVar);

    void l(s9.e eVar);

    void m();

    void o(com.google.android.exoplayer2.v0 v0Var, s9.g gVar);

    void onAudioDecoderInitialized(String str, long j10, long j11);

    void onDroppedFrames(int i10, long j10);

    void onVideoDecoderInitialized(String str, long j10, long j11);

    void r(com.google.android.exoplayer2.v0 v0Var, s9.g gVar);

    void release();

    void t(x1 x1Var, Looper looper);

    void v(s9.e eVar);
}
