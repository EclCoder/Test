package androidx.media3.exoplayer.source;

import android.net.Uri;
import c2.x1;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface w {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        w a(x1 x1Var);
    }

    void a();

    long b();

    int c(o2.i0 i0Var);

    void d(t1.g gVar, Uri uri, Map map, long j10, long j11, o2.r rVar);

    void release();

    void seek(long j10, long j11);
}
