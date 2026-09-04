package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class a extends InstallReferrerClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10474a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f10475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private rb.a f10476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ServiceConnection f10477d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    private final class b implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InstallReferrerStateListener f10478a;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            m5.a.a("InstallReferrerClient", "Install Referrer service connected.");
            a.this.f10476c = rb.a.AbstractBinderC0789a.B(iBinder);
            a.this.f10474a = 2;
            this.f10478a.a(0);
        }

        private b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f10478a = installReferrerStateListener;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            m5.a.b("InstallReferrerClient", obFGmWgqyy.kxnVjb);
            a.this.f10476c = null;
            a.this.f10474a = 0;
            this.f10478a.b();
        }
    }

    public a(Context context) {
        this.f10475b = context.getApplicationContext();
    }

    private boolean g() {
        try {
            return this.f10475b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void a() {
        this.f10474a = 3;
        if (this.f10477d != null) {
            m5.a.a("InstallReferrerClient", "Unbinding from service.");
            this.f10475b.unbindService(this.f10477d);
            this.f10477d = null;
        }
        this.f10476c = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public ReferrerDetails b() throws RemoteException {
        if (!h()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString(CampaignEx.JSON_KEY_PACKAGE_NAME, this.f10475b.getPackageName());
        try {
            return new ReferrerDetails(this.f10476c.g(bundle));
        } catch (RemoteException e10) {
            m5.a.b("InstallReferrerClient", "RemoteException getting install referrer information");
            this.f10474a = 0;
            throw e10;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void d(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (h()) {
            m5.a.a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.a(0);
            return;
        }
        int i10 = this.f10474a;
        if (i10 == 1) {
            m5.a.b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.a(3);
            return;
        }
        if (i10 == 3) {
            m5.a.b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.a(3);
            return;
        }
        m5.a.a("InstallReferrerClient", "Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> listQueryIntentServices = this.f10475b.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            this.f10474a = 0;
            m5.a.a("InstallReferrerClient", "Install Referrer service unavailable on device.");
            installReferrerStateListener.a(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if (!"com.android.vending".equals(str) || str2 == null || !g()) {
            m5.a.b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.f10474a = 0;
            installReferrerStateListener.a(2);
            return;
        }
        Intent intent2 = new Intent(intent);
        b bVar = new b(installReferrerStateListener);
        this.f10477d = bVar;
        try {
            if (this.f10475b.bindService(intent2, bVar, 1)) {
                m5.a.a("InstallReferrerClient", "Service was bonded successfully.");
                return;
            }
            m5.a.b("InstallReferrerClient", "Connection to service is blocked.");
            this.f10474a = 0;
            installReferrerStateListener.a(1);
        } catch (SecurityException unused) {
            m5.a.b("InstallReferrerClient", "No permission to connect to service.");
            this.f10474a = 0;
            installReferrerStateListener.a(4);
        }
    }

    public boolean h() {
        return (this.f10474a != 2 || this.f10476c == null || this.f10477d == null) ? false : true;
    }
}
