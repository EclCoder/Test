package em;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r1 {
    public static final k0 a(Executor executor) {
        return new q1(executor);
    }

    public static final p1 b(ExecutorService executorService) {
        return new q1(executorService);
    }
}
