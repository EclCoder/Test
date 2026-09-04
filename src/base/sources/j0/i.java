package j0;

import android.os.Handler;
import f8.Ygx.FuoITeVPeXAj;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    private static class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f41886a;

        a(Handler handler) {
            this.f41886a = (Handler) m0.g.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f41886a.post((Runnable) m0.g.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f41886a + FuoITeVPeXAj.vgTrzEstFK);
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
