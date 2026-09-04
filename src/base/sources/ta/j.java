package ta;

import java.util.List;
import o9.j0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface j {
    long b(long j10, j0 j0Var);

    boolean c(long j10, f fVar, List list);

    void e(f fVar);

    void g(long j10, long j11, List list, h hVar);

    int getPreferredQueueSize(long j10, List list);

    boolean h(f fVar, boolean z10, com.google.android.exoplayer2.upstream.c.C0294c c0294c, com.google.android.exoplayer2.upstream.c cVar);

    void maybeThrowError();

    void release();
}
