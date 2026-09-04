package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase;
import androidx.work.l;
import androidx.work.u;
import b5.f;
import b5.h;
import b5.i;
import d5.b;
import i5.n;
import i5.p;
import i5.q;
import j0.c;
import j5.g;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f7942d = l.f("ForceStopRunnable");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f7943e = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f7945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7946c = 0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f7947a = l.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            l.c().g(f7947a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, i iVar) {
        this.f7944a = context.getApplicationContext();
        this.f7945b = iVar;
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, c(context), i10);
    }

    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent pendingIntentD = d(context, c.d() ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f7943e;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentD);
        }
    }

    public boolean a() {
        boolean zI = b.i(this.f7944a, this.f7945b);
        WorkDatabase workDatabaseO = this.f7945b.o();
        q qVarB = workDatabaseO.B();
        n nVarA = workDatabaseO.A();
        workDatabaseO.c();
        try {
            List<p> listP = qVarB.p();
            boolean z10 = (listP == null || listP.isEmpty()) ? false : true;
            if (z10) {
                for (p pVar : listP) {
                    qVarB.a(u.ENQUEUED, pVar.f41040a);
                    qVarB.l(pVar.f41040a, -1L);
                }
            }
            nVarA.b();
            workDatabaseO.r();
            workDatabaseO.g();
            return z10 || zI;
        } catch (Throwable th2) {
            workDatabaseO.g();
            throw th2;
        }
    }

    public void b() {
        boolean zA = a();
        if (h()) {
            l.c().a(f7942d, "Rescheduling Workers.", new Throwable[0]);
            this.f7945b.s();
            this.f7945b.l().c(false);
        } else if (e()) {
            l.c().a(f7942d, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f7945b.s();
        } else if (zA) {
            l.c().a(f7942d, "Found unfinished work, scheduling it.", new Throwable[0]);
            f.b(this.f7945b.i(), this.f7945b.o(), this.f7945b.n());
        }
    }

    public boolean e() {
        try {
            PendingIntent pendingIntentD = d(this.f7944a, c.d() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (pendingIntentD != null) {
                    pendingIntentD.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f7944a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i10 = 0; i10 < historicalProcessExitReasons.size(); i10++) {
                        if (j5.c.a(historicalProcessExitReasons.get(i10)).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentD == null) {
                g(this.f7944a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e10) {
            e = e10;
            l.c().h(f7942d, "Ignoring exception", e);
            return true;
        } catch (SecurityException e11) {
            e = e11;
            l.c().h(f7942d, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        androidx.work.b bVarI = this.f7945b.i();
        if (TextUtils.isEmpty(bVarI.c())) {
            l.c().a(f7942d, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zB = g.b(this.f7944a, bVarI);
        l.c().a(f7942d, String.format("Is default app process = %s", Boolean.valueOf(zB)), new Throwable[0]);
        return zB;
    }

    boolean h() {
        return this.f7945b.l().a();
    }

    public void i(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        try {
            if (f()) {
                while (true) {
                    h.e(this.f7944a);
                    l.c().a(f7942d, "Performing cleanup operations.", new Throwable[0]);
                    try {
                        b();
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
                        i10 = this.f7946c + 1;
                        this.f7946c = i10;
                        if (i10 >= 3) {
                            l.c().b(f7942d, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                            this.f7945b.i().d();
                            throw illegalStateException;
                        }
                        l.c().a(f7942d, String.format("Retrying after %s", Long.valueOf(((long) i10) * 300)), e10);
                        i(((long) this.f7946c) * 300);
                    }
                    l.c().a(f7942d, String.format("Retrying after %s", Long.valueOf(((long) i10) * 300)), e10);
                    i(((long) this.f7946c) * 300);
                }
            }
            this.f7945b.r();
        } catch (Throwable th2) {
            this.f7945b.r();
            throw th2;
        }
    }
}
