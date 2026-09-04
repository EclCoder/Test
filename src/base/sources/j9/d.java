package j9;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class d implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f42129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k9.d f42130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f42131c;

    public d(Context context, k9.d dVar, f fVar) {
        this.f42129a = context;
        this.f42130b = dVar;
        this.f42131c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i12 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i10) {
                if (i12 >= i11) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // j9.x
    public void a(c9.p pVar, int i10) {
        b(pVar, i10, false);
    }

    @Override // j9.x
    public void b(c9.p pVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f42129a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f42129a.getSystemService("jobscheduler");
        int iC = c(pVar);
        if (!z10 && d(jobScheduler, iC, i10)) {
            g9.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
            return;
        }
        long jT0 = this.f42130b.t0(pVar);
        JobInfo.Builder builderC = this.f42131c.c(new JobInfo.Builder(iC, componentName), pVar.d(), jT0, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", pVar.b());
        persistableBundle.putInt("priority", n9.a.a(pVar.d()));
        if (pVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(pVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        g9.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, Integer.valueOf(iC), Long.valueOf(this.f42131c.g(pVar.d(), jT0, i10)), Long.valueOf(jT0), Integer.valueOf(i10));
        jobScheduler.schedule(builderC.build());
    }

    int c(c9.p pVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f42129a.getPackageName().getBytes(Charset.forName(C.UTF8_NAME)));
        adler32.update(pVar.b().getBytes(Charset.forName(C.UTF8_NAME)));
        adler32.update(ByteBuffer.allocate(4).putInt(n9.a.a(pVar.d())).array());
        if (pVar.c() != null) {
            adler32.update(pVar.c());
        }
        return (int) adler32.getValue();
    }
}
