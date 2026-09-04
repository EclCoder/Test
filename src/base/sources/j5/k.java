package j5;

import android.content.Context;
import android.os.PowerManager;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f42033a = androidx.work.l.f("WakeLocks");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f42034b = new WeakHashMap();

    public static void a() {
        HashMap map = new HashMap();
        WeakHashMap weakHashMap = f42034b;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                androidx.work.l.c().h(f42033a, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
    }

    public static PowerManager.WakeLock b(Context context, String str) {
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str2);
        WeakHashMap weakHashMap = f42034b;
        synchronized (weakHashMap) {
            weakHashMap.put(wakeLockNewWakeLock, str2);
        }
        return wakeLockNewWakeLock;
    }
}
