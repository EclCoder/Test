package fg;

import android.media.MediaMuxer;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaMuxer f38649a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f38649a.stop();
    }
}
