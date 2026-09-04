package qk;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import ok.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f50880a = pk.a.d(new CallableC0784a());

    /* JADX INFO: renamed from: qk.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class CallableC0784a implements Callable {
        CallableC0784a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h call() {
            return b.f50881a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final h f50881a = new qk.b(new Handler(Looper.getMainLooper()), false);
    }

    public static h a() {
        return pk.a.e(f50880a);
    }
}
