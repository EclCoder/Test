package b5;

import android.os.Handler;
import android.os.Looper;
import androidx.work.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f8406a = j0.j.a(Looper.getMainLooper());

    @Override // androidx.work.s
    public void a(Runnable runnable) {
        this.f8406a.removeCallbacks(runnable);
    }

    @Override // androidx.work.s
    public void b(long j10, Runnable runnable) {
        this.f8406a.postDelayed(runnable, j10);
    }
}
