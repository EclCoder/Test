package com.vungle.ads.internal.task;

import android.os.Bundle;
import android.os.Process;
import com.vungle.ads.internal.util.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class e extends h {
    public static final a Companion = new a(null);
    private static final String TAG = e.class.getSimpleName();
    private final c creator;
    private final f jobRunner;
    private final d jobinfo;
    private final j threadPriorityHelper;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e(d jobinfo, c creator, f jobRunner, j jVar) {
        s.h(jobinfo, "jobinfo");
        s.h(creator, "creator");
        s.h(jobRunner, "jobRunner");
        this.jobinfo = jobinfo;
        this.creator = creator;
        this.jobRunner = jobRunner;
        this.threadPriorityHelper = jVar;
    }

    @Override // com.vungle.ads.internal.task.h
    public int getPriority() {
        return this.jobinfo.getPriority();
    }

    @Override // java.lang.Runnable
    public void run() {
        j jVar = this.threadPriorityHelper;
        if (jVar != null) {
            try {
                int iMakeAndroidThreadPriority = jVar.makeAndroidThreadPriority(this.jobinfo);
                Process.setThreadPriority(iMakeAndroidThreadPriority);
                q.a aVar = q.Companion;
                String TAG2 = TAG;
                s.g(TAG2, "TAG");
                aVar.d(TAG2, "Setting process thread prio = " + iMakeAndroidThreadPriority + " for " + this.jobinfo.getJobTag());
            } catch (Throwable unused) {
                q.a aVar2 = q.Companion;
                String TAG3 = TAG;
                s.g(TAG3, "TAG");
                aVar2.e(TAG3, "Error on setting process thread priority");
            }
        }
        try {
            String jobTag = this.jobinfo.getJobTag();
            Bundle extras = this.jobinfo.getExtras();
            q.a aVar3 = q.Companion;
            String TAG4 = TAG;
            s.g(TAG4, "TAG");
            aVar3.d(TAG4, "Start job " + jobTag + "Thread " + Thread.currentThread().getName());
            int iOnRunJob = this.creator.create(jobTag).onRunJob(extras, this.jobRunner);
            s.g(TAG4, "TAG");
            aVar3.d(TAG4, "On job finished " + jobTag + " with result " + iOnRunJob);
            if (iOnRunJob == 2) {
                long jMakeNextRescedule = this.jobinfo.makeNextRescedule();
                if (jMakeNextRescedule > 0) {
                    this.jobinfo.setDelay(jMakeNextRescedule);
                    this.jobRunner.execute(this.jobinfo);
                    s.g(TAG4, "TAG");
                    aVar3.d(TAG4, "Rescheduling " + jobTag + " in " + jMakeNextRescedule);
                }
            }
        } catch (Exception e10) {
            q.a aVar4 = q.Companion;
            String TAG5 = TAG;
            s.g(TAG5, "TAG");
            aVar4.e(TAG5, "Cannot create job" + e10.getLocalizedMessage());
        }
    }

    public static /* synthetic */ void getPriority$annotations() {
    }
}
