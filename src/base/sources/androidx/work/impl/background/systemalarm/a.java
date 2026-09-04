package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase;
import androidx.work.l;
import b5.i;
import i5.g;
import i5.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f7873a = l.f("Alarms");

    public static void a(Context context, i iVar, String str) {
        h hVarY = iVar.o().y();
        g gVarA = hVarY.a(str);
        if (gVarA != null) {
            b(context, str, gVarA.f41018b);
            l.c().a(f7873a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            hVarY.c(str);
        }
    }

    private static void b(Context context, String str, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        l.c().a(f7873a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i10)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void c(Context context, i iVar, String str, long j10) {
        WorkDatabase workDatabaseO = iVar.o();
        h hVarY = workDatabaseO.y();
        g gVarA = hVarY.a(str);
        if (gVarA != null) {
            b(context, str, gVarA.f41018b);
            d(context, str, gVarA.f41018b, j10);
        } else {
            int iB = new j5.d(workDatabaseO).b();
            hVarY.d(new g(str, iB));
            d(context, str, iB, j10);
        }
    }

    private static void d(Context context, String str, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, str), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j10, service);
        }
    }
}
