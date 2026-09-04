package androidx.media3.exoplayer;

import android.content.Context;
import android.net.wifi.WifiManager;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WifiManager.WifiLock f5695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5697d;

    public o2(Context context) {
        this.f5694a = context.getApplicationContext();
    }

    private void c() {
        WifiManager.WifiLock wifiLock = this.f5695b;
        if (wifiLock == null) {
            return;
        }
        if (this.f5696c && this.f5697d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f5695b == null) {
            WifiManager wifiManager = (WifiManager) this.f5694a.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                w1.n.h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f5695b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.f5696c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f5697d = z10;
        c();
    }
}
