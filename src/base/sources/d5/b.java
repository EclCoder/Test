package d5;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.l;
import androidx.work.u;
import b5.e;
import b5.i;
import i5.g;
import i5.p;
import i5.q;
import j5.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f36198e = l.f("SystemJobScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f36199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JobScheduler f36200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f36201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f36202d;

    public b(Context context, i iVar) {
        this(context, iVar, (JobScheduler) context.getSystemService("jobscheduler"), new a(context));
    }

    public static void b(Context context) {
        List listG;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (listG = g(context, jobScheduler)) == null || listG.isEmpty()) {
            return;
        }
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            d(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    private static void d(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            l.c().b(f36198e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    private static List f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listG = g(context, jobScheduler);
        if (listG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listG) {
            if (str.equals(h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            l.c().b(f36198e, "getAllPendingJobs() is not reliable on this device.", th2);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static String h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, i iVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listG = g(context, jobScheduler);
        List listB = iVar.o().y().b();
        boolean z10 = false;
        HashSet hashSet = new HashSet(listG != null ? listG.size() : 0);
        if (listG != null && !listG.isEmpty()) {
            for (JobInfo jobInfo : listG) {
                String strH = h(jobInfo);
                if (TextUtils.isEmpty(strH)) {
                    d(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(strH);
                }
            }
        }
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains((String) it.next())) {
                l.c().a(f36198e, "Reconciling jobs", new Throwable[0]);
                z10 = true;
                break;
            }
        }
        if (!z10) {
            return z10;
        }
        WorkDatabase workDatabaseO = iVar.o();
        workDatabaseO.c();
        try {
            q qVarB = workDatabaseO.B();
            Iterator it2 = listB.iterator();
            while (it2.hasNext()) {
                qVarB.l((String) it2.next(), -1L);
            }
            workDatabaseO.r();
            return z10;
        } finally {
            workDatabaseO.g();
        }
    }

    @Override // b5.e
    public void a(String str) {
        List listF = f(this.f36199a, this.f36200b, str);
        if (listF == null || listF.isEmpty()) {
            return;
        }
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            d(this.f36200b, ((Integer) it.next()).intValue());
        }
        this.f36201c.o().y().c(str);
    }

    @Override // b5.e
    public boolean c() {
        return true;
    }

    @Override // b5.e
    public void e(p... pVarArr) {
        WorkDatabase workDatabaseO = this.f36201c.o();
        d dVar = new d(workDatabaseO);
        for (p pVar : pVarArr) {
            workDatabaseO.c();
            try {
                p pVarG = workDatabaseO.B().g(pVar.f41040a);
                if (pVarG == null) {
                    l.c().h(f36198e, "Skipping scheduling " + pVar.f41040a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabaseO.r();
                } else if (pVarG.f41041b != u.ENQUEUED) {
                    l.c().h(f36198e, "Skipping scheduling " + pVar.f41040a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabaseO.r();
                } else {
                    g gVarA = workDatabaseO.y().a(pVar.f41040a);
                    int iD = gVarA != null ? gVarA.f41018b : dVar.d(this.f36201c.i().i(), this.f36201c.i().g());
                    if (gVarA == null) {
                        this.f36201c.o().y().d(new g(pVar.f41040a, iD));
                    }
                    j(pVar, iD);
                    workDatabaseO.r();
                }
                workDatabaseO.g();
            } catch (Throwable th2) {
                workDatabaseO.g();
                throw th2;
            }
        }
    }

    public void j(p pVar, int i10) {
        JobInfo jobInfoA = this.f36202d.a(pVar, i10);
        l lVarC = l.c();
        String str = f36198e;
        lVarC.a(str, String.format("Scheduling work ID %s Job ID %s", pVar.f41040a, Integer.valueOf(i10)), new Throwable[0]);
        try {
            if (this.f36200b.schedule(jobInfoA) == 0) {
                l.c().h(str, String.format("Unable to schedule work ID %s", pVar.f41040a), new Throwable[0]);
                if (pVar.f41056q && pVar.f41057r == androidx.work.p.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f41056q = false;
                    l.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", pVar.f41040a), new Throwable[0]);
                    j(pVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            List listG = g(this.f36199a, this.f36200b);
            String str2 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(listG != null ? listG.size() : 0), Integer.valueOf(this.f36201c.o().B().c().size()), Integer.valueOf(this.f36201c.i().h()));
            l.c().b(f36198e, str2, new Throwable[0]);
            throw new IllegalStateException(str2, e10);
        } catch (Throwable th2) {
            l.c().b(f36198e, String.format("Unable to schedule %s", pVar), th2);
        }
    }

    public b(Context context, i iVar, JobScheduler jobScheduler, a aVar) {
        this.f36199a = context;
        this.f36201c = iVar;
        this.f36200b = jobScheduler;
        this.f36202d = aVar;
    }
}
