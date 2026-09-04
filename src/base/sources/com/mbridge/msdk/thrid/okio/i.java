package com.mbridge.msdk.thrid.okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class i extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private t f33648e;

    public i(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f33648e = tVar;
    }

    public final i a(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f33648e = tVar;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public t b() {
        return this.f33648e.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public long c() {
        return this.f33648e.c();
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public boolean d() {
        return this.f33648e.d();
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public void e() throws InterruptedIOException {
        this.f33648e.e();
    }

    public final t g() {
        return this.f33648e;
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public t a(long j10, TimeUnit timeUnit) {
        return this.f33648e.a(j10, timeUnit);
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public t a(long j10) {
        return this.f33648e.a(j10);
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public t a() {
        return this.f33648e.a();
    }
}
