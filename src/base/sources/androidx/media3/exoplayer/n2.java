package androidx.media3.exoplayer;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PowerManager.WakeLock f5662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5664d;

    public n2(Context context) {
        this.f5661a = context.getApplicationContext();
    }

    private void c() {
        PowerManager.WakeLock wakeLock = this.f5662b;
        if (wakeLock == null) {
            return;
        }
        if (this.f5663c && this.f5664d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f5662b == null) {
            PowerManager powerManager = (PowerManager) this.f5661a.getSystemService("power");
            if (powerManager == null) {
                w1.n.h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f5662b = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.f5663c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f5664d = z10;
        c();
    }
}
