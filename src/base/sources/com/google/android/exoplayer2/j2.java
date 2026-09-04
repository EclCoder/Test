package com.google.android.exoplayer2;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PowerManager f17128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PowerManager.WakeLock f17129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f17130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f17131d;

    public j2(Context context) {
        this.f17128a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    private void c() {
        PowerManager.WakeLock wakeLock = this.f17129b;
        if (wakeLock == null) {
            return;
        }
        if (this.f17130c && this.f17131d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f17129b == null) {
            PowerManager powerManager = this.f17128a;
            if (powerManager == null) {
                ob.u.i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f17129b = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.f17130c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f17131d = z10;
        c();
    }
}
