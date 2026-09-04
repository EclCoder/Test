package k5;

import j5.h;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface a {
    Executor a();

    void b(Runnable runnable);

    h getBackgroundExecutor();
}
