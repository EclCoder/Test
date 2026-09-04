package g5;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import androidx.work.l;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f38924i = l.f("BatteryNotLowTracker");

    public b(Context context, k5.a aVar) {
        super(context, aVar);
    }

    @Override // g5.c
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // g5.c
    public void h(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        l.c().a(f38924i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            d(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            d(Boolean.FALSE);
        }
    }

    @Override // g5.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean b() {
        Intent intentRegisterReceiver = this.f38930b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        l.c().b(f38924i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
