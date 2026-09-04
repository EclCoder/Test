package com.bytedance.sdk.component.aq.hn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class qor implements Comparable<qor>, Runnable {
    public static final int EIGHTH_PRIORITY = 8;
    public static final int FIFTH_PRIORITY = 5;
    public static final int FOURTH_PRIORITY = 4;
    public static final int MAX_PRIORITY = 10;
    public static final int MIN_PRIORITY = 1;
    public static final int NINTH_PRIORITY = 9;
    public static final int SECOND_PRIORITY = 2;
    public static final int SEVENTH_PRIORITY = 7;
    public static final int SIXTH_PRIORITY = 6;
    public static final int THIRD_PRIORITY = 3;
    private long dkl;
    private long gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f12745hn;
    private int hnj;
    private Runnable qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private long f12746sk;

    public qor(String str) {
        this.hnj = 5;
        this.f12745hn = str;
    }

    public long getAfterTimestamp() {
        return this.dkl;
    }

    public long getBeforeTimestamp() {
        return this.f12746sk;
    }

    public String getName() {
        return this.f12745hn;
    }

    public int getPriority() {
        return this.hnj;
    }

    public long getRunTime() {
        return this.dkl - this.f12746sk;
    }

    public long getSubmitTimestamp() {
        return this.gjv;
    }

    public Runnable getTarget() {
        return this.qor;
    }

    public long getWaitTime() {
        return this.f12746sk - this.gjv;
    }

    public void setAfterTimestamp(long j10) {
        this.dkl = j10;
    }

    public void setBeforeTimestamp(long j10) {
        this.f12746sk = j10;
    }

    public void setPriority(int i10) {
        this.hnj = i10;
    }

    public void setSubmitTimestamp(long j10) {
        this.gjv = j10;
    }

    public void setTarget(Runnable runnable) {
        this.qor = runnable;
    }

    @Override // java.lang.Comparable
    public int compareTo(qor qorVar) {
        if (getPriority() < qorVar.getPriority()) {
            return 1;
        }
        return getPriority() >= qorVar.getPriority() ? -1 : 0;
    }

    public qor(String str, int i10) {
        this.hnj = i10;
        this.f12745hn = str;
    }

    public qor(int i10, String str, Runnable runnable) {
        this.hnj = i10;
        this.f12745hn = str;
        this.qor = runnable;
    }

    public qor(String str, Runnable runnable) {
        this.hnj = 5;
        this.f12745hn = str;
        this.qor = runnable;
    }
}
