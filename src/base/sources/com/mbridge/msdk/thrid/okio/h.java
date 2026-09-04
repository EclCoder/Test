package com.mbridge.msdk.thrid.okio;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class h implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f33647a;

    public h(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f33647a = sVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f33647a.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f33647a.close();
    }

    public final s d() {
        return this.f33647a;
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f33647a.toString() + ")";
    }
}
