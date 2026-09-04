package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.l;
import b5.i;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f7864a = l.f("ConstrntProxyUpdtRecvr");

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f7865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f7866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f7867c;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f7865a = intent;
            this.f7866b = context;
            this.f7867c = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f7865a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f7865a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f7865a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f7865a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                l.c().a(ConstraintProxyUpdateReceiver.f7864a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                j5.e.a(this.f7866b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                j5.e.a(this.f7866b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                j5.e.a(this.f7866b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                j5.e.a(this.f7866b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f7867c.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            i.k(context).p().b(new a(intent, context, goAsync()));
        } else {
            l.c().a(f7864a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        }
    }
}
