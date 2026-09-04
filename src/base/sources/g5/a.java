package g5;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import androidx.work.l;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f38923i = l.f("BatteryChrgTracker");

    public a(Context context, k5.a aVar) {
        super(context, aVar);
    }

    private boolean j(Intent intent) {
        int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // g5.c
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override // g5.c
    public void h(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        byte b10 = 0;
        l.c().a(f38923i, String.format("Received %s", action), new Throwable[0]);
        switch (action.hashCode()) {
            case -1886648615:
                if (!action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    b10 = -1;
                }
                break;
            case -54942926:
                b10 = !action.equals("android.os.action.DISCHARGING") ? (byte) -1 : (byte) 1;
                break;
            case 948344062:
                b10 = !action.equals("android.os.action.CHARGING") ? (byte) -1 : (byte) 2;
                break;
            case 1019184907:
                b10 = !action.equals("android.intent.action.ACTION_POWER_CONNECTED") ? (byte) -1 : (byte) 3;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                d(Boolean.FALSE);
                break;
            case 1:
                d(Boolean.FALSE);
                break;
            case 2:
                d(Boolean.TRUE);
                break;
            case 3:
                d(Boolean.TRUE);
                break;
        }
    }

    @Override // g5.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean b() {
        Intent intentRegisterReceiver = this.f38930b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(j(intentRegisterReceiver));
        }
        l.c().b(f38923i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
