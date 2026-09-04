package d2;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f36145a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f36145a.post(runnable);
    }
}
