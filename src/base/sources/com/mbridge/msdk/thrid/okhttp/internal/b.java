package com.mbridge.msdk.thrid.okhttp.internal;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f33106a;

    public b(String str, Object... objArr) {
        this.f33106a = c.a(str, objArr);
    }

    protected abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f33106a);
        try {
            b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
