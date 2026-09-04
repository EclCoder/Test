package d5;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.c;
import androidx.work.d;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.l;
import androidx.work.m;
import i5.p;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f36195b = l.f("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ComponentName f36196a;

    /* JADX INFO: renamed from: d5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class C0544a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36197a;

        static {
            int[] iArr = new int[m.values().length];
            f36197a = iArr;
            try {
                iArr[m.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36197a[m.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36197a[m.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36197a[m.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36197a[m.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    a(Context context) {
        this.f36196a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(d.a aVar) {
        return new JobInfo.TriggerContentUri(aVar.a(), aVar.b() ? 1 : 0);
    }

    static int c(m mVar) {
        int i10 = C0544a.f36197a[mVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5 && Build.VERSION.SDK_INT >= 26) {
            return 4;
        }
        l.c().a(f36195b, String.format("API version too low. Cannot convert network type value %s", mVar), new Throwable[0]);
        return 1;
    }

    static void d(JobInfo.Builder builder, m mVar) {
        if (Build.VERSION.SDK_INT < 30 || mVar != m.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(mVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    JobInfo a(p pVar, int i10) {
        c cVar = pVar.f41049j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.f41040a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.d());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f36196a).setRequiresCharging(cVar.g()).setRequiresDeviceIdle(cVar.h()).setExtras(persistableBundle);
        d(extras, cVar.b());
        if (!cVar.h()) {
            extras.setBackoffCriteria(pVar.f41052m, pVar.f41051l == androidx.work.a.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!pVar.f41056q) {
            extras.setImportantWhileForeground(true);
        }
        if (cVar.e()) {
            Iterator it = cVar.a().b().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b((d.a) it.next()));
            }
            extras.setTriggerContentUpdateDelay(cVar.c());
            extras.setTriggerContentMaxDelay(cVar.d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.f());
            extras.setRequiresStorageNotLow(cVar.i());
        }
        boolean z10 = pVar.f41050k > 0;
        if (j0.c.d() && pVar.f41056q && !z10) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
