package com.mbridge.msdk.tracker.network;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f33767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f33768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f33770d;

    public b0() {
        this.f33769c = 0;
        this.f33770d = "";
        this.f33767a = null;
    }

    void a(long j10) {
        this.f33768b = j10;
    }

    public abstract int d();

    public int g() {
        return this.f33769c;
    }

    public void a(int i10) {
        this.f33769c = i10;
    }

    public b0(q qVar) {
        this.f33769c = 0;
        this.f33770d = "";
        this.f33767a = qVar;
    }

    public b0(String str) {
        super(str);
        this.f33769c = 0;
        this.f33770d = "";
        this.f33767a = null;
    }

    public b0(Throwable th2) {
        super(th2);
        this.f33769c = 0;
        this.f33770d = "";
        this.f33767a = null;
    }
}
