package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import androidx.work.l;
import b5.b;
import b5.i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f7909c = l.f("SystemJobService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i f7910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f7911b = new HashMap();

    private static String a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // b5.b
    public void d(String str, boolean z10) {
        JobParameters jobParameters;
        l.c().a(f7909c, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f7911b) {
            jobParameters = (JobParameters) this.f7911b.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            i iVarK = i.k(getApplicationContext());
            this.f7910a = iVarK;
            iVarK.m().c(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            l.c().h(f7909c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        i iVar = this.f7910a;
        if (iVar != null) {
            iVar.m().i(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f7910a == null) {
            l.c().a(f7909c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String strA = a(jobParameters);
        if (TextUtils.isEmpty(strA)) {
            l.c().b(f7909c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f7911b) {
            try {
                if (this.f7911b.containsKey(strA)) {
                    l.c().a(f7909c, String.format("Job is already being executed by SystemJobService: %s", strA), new Throwable[0]);
                    return false;
                }
                l.c().a(f7909c, String.format("onStartJob for %s", strA), new Throwable[0]);
                this.f7911b.put(strA, jobParameters);
                int i10 = Build.VERSION.SDK_INT;
                WorkerParameters.a aVar = new WorkerParameters.a();
                if (jobParameters.getTriggeredContentUris() != null) {
                    aVar.f7783b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    aVar.f7782a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i10 >= 28) {
                    aVar.f7784c = jobParameters.getNetwork();
                }
                this.f7910a.v(strA, aVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f7910a == null) {
            l.c().a(f7909c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String strA = a(jobParameters);
        if (TextUtils.isEmpty(strA)) {
            l.c().b(f7909c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        l.c().a(f7909c, String.format("onStopJob for %s", strA), new Throwable[0]);
        synchronized (this.f7911b) {
            this.f7911b.remove(strA);
        }
        this.f7910a.x(strA);
        return !this.f7910a.m().f(strA);
    }
}
