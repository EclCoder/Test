package com.bytedance.sdk.component.qor.hnj;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    long aq;
    long dkl;
    long dse;
    long gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    long f12942hn;
    long hnj = SystemClock.elapsedRealtime();
    long qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    long f12943sk;

    public long aq() {
        return this.gjv;
    }

    public long bug() {
        return this.aq;
    }

    public long dkl() {
        return this.dkl;
    }

    public void dnm() {
        this.dse = SystemClock.elapsedRealtime();
    }

    public long dse() {
        return this.qor;
    }

    public void fc() {
        this.f12942hn = SystemClock.elapsedRealtime();
    }

    public long gjv() {
        return this.hnj;
    }

    public void hn() {
        this.gjv = SystemClock.elapsedRealtime();
    }

    public void hnj() {
        this.qor = SystemClock.elapsedRealtime();
    }

    public long mjg() {
        return this.f12942hn;
    }

    public long ojm() {
        return this.f12943sk;
    }

    public void orl() {
        this.aq = SystemClock.elapsedRealtime();
    }

    public void qor() {
        this.f12943sk = SystemClock.elapsedRealtime();
    }

    public void sk() {
        this.dkl = SystemClock.elapsedRealtime();
    }

    public long ta() {
        return this.dse;
    }

    public String toString() {
        return "RequestHttpTime{requestBuildTs=" + this.hnj + ", asyncCallExecTs=" + this.f12942hn + ", requestStartExecTs=" + this.qor + ", requestConnectStartTs=" + this.gjv + ", requestConnectFinishTs=" + this.f12943sk + ", reqCallServerStartTs=" + this.dse + ", reqCallServerFinishTs=" + this.aq + '}';
    }
}
