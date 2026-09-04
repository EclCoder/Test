package com.google.android.exoplayer2;

import android.content.Context;
import android.net.wifi.WifiManager;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WifiManager f17161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WifiManager.WifiLock f17162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f17163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f17164d;

    public k2(Context context) {
        this.f17161a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    private void c() {
        WifiManager.WifiLock wifiLock = this.f17162b;
        if (wifiLock == null) {
            return;
        }
        if (this.f17163c && this.f17164d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f17162b == null) {
            WifiManager wifiManager = this.f17161a;
            if (wifiManager == null) {
                ob.u.i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f17162b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.f17163c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f17164d = z10;
        c();
    }
}
