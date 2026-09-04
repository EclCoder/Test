package g5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.work.l;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f38936j = l.f("NetworkStateTracker");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConnectivityManager f38937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f38938h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f38939i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            l.c().a(e.f38936j, "Network broadcast received", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            l.c().a(e.f38936j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            l.c().a(e.f38936j, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    public e(Context context, k5.a aVar) {
        super(context, aVar);
        this.f38937g = (ConnectivityManager) this.f38930b.getSystemService("connectivity");
        if (j()) {
            this.f38938h = new b();
        } else {
            this.f38939i = new a();
        }
    }

    private static boolean j() {
        return true;
    }

    @Override // g5.d
    public void e() {
        if (!j()) {
            l.c().a(f38936j, "Registering broadcast receiver", new Throwable[0]);
            this.f38930b.registerReceiver(this.f38939i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            l.c().a(f38936j, "Registering network callback", new Throwable[0]);
            this.f38937g.registerDefaultNetworkCallback(this.f38938h);
        } catch (IllegalArgumentException | SecurityException e10) {
            l.c().b(f38936j, "Received exception while registering network callback", e10);
        }
    }

    @Override // g5.d
    public void f() {
        if (!j()) {
            l.c().a(f38936j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f38930b.unregisterReceiver(this.f38939i);
            return;
        }
        try {
            l.c().a(f38936j, "Unregistering network callback", new Throwable[0]);
            this.f38937g.unregisterNetworkCallback(this.f38938h);
        } catch (IllegalArgumentException | SecurityException e10) {
            l.c().b(f38936j, "Received exception while unregistering network callback", e10);
        }
    }

    e5.b g() {
        NetworkInfo activeNetworkInfo = this.f38937g.getActiveNetworkInfo();
        boolean z10 = false;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zI = i();
        boolean zA = i0.a.a(this.f38937g);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z10 = true;
        }
        return new e5.b(z11, zI, zA, z10);
    }

    @Override // g5.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public e5.b b() {
        return g();
    }

    boolean i() {
        try {
            NetworkCapabilities networkCapabilities = this.f38937g.getNetworkCapabilities(this.f38937g.getActiveNetwork());
            return networkCapabilities != null && networkCapabilities.hasCapability(16);
        } catch (SecurityException e10) {
            l.c().b(f38936j, "Unable to validate active network", e10);
            return false;
        }
    }
}
