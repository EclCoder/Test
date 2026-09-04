package jd;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Float f42267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f42268b;

    private e(Float f10, boolean z10) {
        this.f42268b = z10;
        this.f42267a = f10;
    }

    public static e a(Context context) {
        boolean zE = false;
        Float fD = null;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                zE = e(intentRegisterReceiver);
                fD = d(intentRegisterReceiver);
            }
        } catch (IllegalStateException e10) {
            gd.g.f().e("An error occurred getting battery state.", e10);
        }
        return new e(fD, zE);
    }

    private static Float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    private static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.f42267a;
    }

    public int c() {
        Float f10;
        if (!this.f42268b || (f10 = this.f42267a) == null) {
            return 1;
        }
        return ((double) f10.floatValue()) < 0.99d ? 2 : 3;
    }
}
