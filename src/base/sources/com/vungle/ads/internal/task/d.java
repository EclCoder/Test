package com.vungle.ads.internal.task;

import android.os.Bundle;
import com.vungle.ads.internal.util.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements Cloneable {
    public static final a Companion = new a(null);
    private static final String TAG = "JobInfo";
    private long delay;
    private Bundle extras;
    private final String jobTag;
    private long nextRescheduleTimeout;
    private int priority;
    private int requiredNetworkType;
    private int reschedulePolicy;
    private long rescheduleTimeout;
    private boolean updateCurrent;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(String jobTag) {
        s.h(jobTag, "jobTag");
        this.jobTag = jobTag;
        this.extras = new Bundle();
        this.reschedulePolicy = 1;
        this.priority = 2;
    }

    public Object clone() {
        return super.clone();
    }

    public final d copy() {
        try {
            Object objClone = super.clone();
            s.f(objClone, "null cannot be cast to non-null type com.vungle.ads.internal.task.JobInfo");
            return (d) objClone;
        } catch (CloneNotSupportedException e10) {
            q.Companion.e(TAG, "Cannot copy JobInfo " + this, e10);
            return null;
        }
    }

    public final long getDelay() {
        return this.delay;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final String getJobTag() {
        return this.jobTag;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    public final boolean getUpdateCurrent() {
        return this.updateCurrent;
    }

    public final long makeNextRescedule() {
        long j10 = this.rescheduleTimeout;
        if (j10 == 0) {
            return 0L;
        }
        long j11 = this.nextRescheduleTimeout;
        if (j11 == 0) {
            this.nextRescheduleTimeout = j10;
        } else if (this.reschedulePolicy == 1) {
            this.nextRescheduleTimeout = j11 * ((long) 2);
        }
        return this.nextRescheduleTimeout;
    }

    public final d setDelay(long j10) {
        this.delay = j10;
        return this;
    }

    public final d setExtras(Bundle extras) {
        s.h(extras, "extras");
        this.extras = extras;
        return this;
    }

    public final d setPriority(int i10) {
        this.priority = i10;
        return this;
    }

    public final d setRequiredNetworkType(int i10) {
        this.requiredNetworkType = i10;
        return this;
    }

    public final d setReschedulePolicy(long j10, int i10) {
        this.rescheduleTimeout = j10;
        this.reschedulePolicy = i10;
        return this;
    }

    public final d setUpdateCurrent(boolean z10) {
        this.updateCurrent = z10;
        return this;
    }

    public static /* synthetic */ void getPriority$annotations() {
    }

    public static /* synthetic */ void getRequiredNetworkType$annotations() {
    }

    private static /* synthetic */ void getReschedulePolicy$annotations() {
    }
}
