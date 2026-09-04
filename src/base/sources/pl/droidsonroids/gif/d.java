package pl.droidsonroids.gif;

import androidx.activity.b0;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
final class d extends ScheduledThreadPoolExecutor implements AutoCloseable {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f50230a = new d();
    }

    static d h() {
        return b.f50230a;
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        b0.a(this);
    }

    private d() {
        super(1, new ThreadPoolExecutor.DiscardPolicy());
    }
}
