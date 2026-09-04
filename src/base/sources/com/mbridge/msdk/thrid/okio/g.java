package com.mbridge.msdk.thrid.okio;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f33646a;

    public g(r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f33646a = rVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j10) {
        this.f33646a.a(cVar, j10);
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public t b() {
        return this.f33646a.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f33646a.close();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() {
        this.f33646a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f33646a.toString() + ")";
    }
}
