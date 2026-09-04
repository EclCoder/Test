package com.mbridge.msdk.config.component.status;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ConnectivityManager f29109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    b f29110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f29111d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<com.mbridge.msdk.config.component.status.a> f29108a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConnectivityManager.NetworkCallback f29112e = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            super.onCapabilitiesChanged(network, networkCapabilities);
            boolean zHasTransport = networkCapabilities.hasTransport(1);
            boolean zHasTransport2 = networkCapabilities.hasTransport(0);
            int iC = zHasTransport ? 9 : -1;
            if (zHasTransport2) {
                iC = c.this.c();
            }
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("916002");
            HashMap map = new HashMap();
            map.put(com.mbridge.msdk.config.component.common.util.c.c("networkType"), String.valueOf(iC));
            bVar.a(map);
            c.this.a(bVar);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            super.onLost(network);
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("916002");
            HashMap map = new HashMap();
            map.put(com.mbridge.msdk.config.component.common.util.c.c("networkType"), String.valueOf(c.this.c()));
            bVar.a(map);
            c.this.a(bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                int iC = c.this.c();
                com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
                bVar.b("916002");
                HashMap map = new HashMap();
                map.put(com.mbridge.msdk.config.component.common.util.c.c("networkType"), String.valueOf(iC));
                bVar.a(map);
                c.this.a(bVar);
            } catch (Throwable th2) {
                q0.b("MBNetworkEventPublisher", th2.getMessage());
            }
        }

        /* synthetic */ b(c cVar, a aVar) {
            this();
        }
    }

    public c() {
        a(com.mbridge.msdk.foundation.controller.c.n().d());
        a();
    }

    public void b(com.mbridge.msdk.config.component.status.a aVar) {
        this.f29108a.remove(aVar);
    }

    public int c() {
        NetworkInfo activeNetworkInfo;
        if (this.f29111d) {
            TelephonyManager telephonyManager = (TelephonyManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("phone");
            return m0.c(telephonyManager != null ? telephonyManager.getDataNetworkType() : 0);
        }
        ConnectivityManager connectivityManager = this.f29109b;
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return 0;
        }
        return m0.c(activeNetworkInfo.getSubtype());
    }

    public void d() {
        if (this.f29108a.isEmpty()) {
            b();
        }
    }

    private void a() {
        int iCheckSelfPermission = androidx.core.content.a.checkSelfPermission(com.mbridge.msdk.foundation.controller.c.n().d(), "android.permission.READ_PHONE_STATE");
        boolean z10 = true;
        if (Build.VERSION.SDK_INT < 33) {
            this.f29111d = iCheckSelfPermission == 0;
            return;
        }
        int iCheckSelfPermission2 = androidx.core.content.a.checkSelfPermission(com.mbridge.msdk.foundation.controller.c.n().d(), "android.permission.READ_BASIC_PHONE_STATE");
        if (iCheckSelfPermission != 0 && iCheckSelfPermission2 != 0) {
            z10 = false;
        }
        this.f29111d = z10;
    }

    public void b() {
        if (this.f29109b == null) {
            this.f29109b = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("connectivity");
        }
        this.f29109b.unregisterNetworkCallback(this.f29112e);
        this.f29109b = null;
    }

    public void a(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar == null || this.f29108a.contains(aVar)) {
            return;
        }
        this.f29108a.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.config.component.base.b bVar) {
        try {
            Iterator<com.mbridge.msdk.config.component.status.a> it = this.f29108a.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        } catch (Throwable th2) {
            q0.b("MBNetworkEventPublisher", th2.getMessage());
        }
    }

    private void a(Context context) {
        this.f29109b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f29109b.registerNetworkCallback(new NetworkRequest.Builder().addCapability(11).addCapability(12).build(), this.f29112e);
    }
}
