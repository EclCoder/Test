package xn;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class p extends r0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r0 f56968f;

    public p(r0 delegate) {
        kotlin.jvm.internal.s.h(delegate, "delegate");
        this.f56968f = delegate;
    }

    @Override // xn.r0
    public r0 a() {
        return this.f56968f.a();
    }

    @Override // xn.r0
    public r0 b() {
        return this.f56968f.b();
    }

    @Override // xn.r0
    public long c() {
        return this.f56968f.c();
    }

    @Override // xn.r0
    public r0 d(long j10) {
        return this.f56968f.d(j10);
    }

    @Override // xn.r0
    public boolean e() {
        return this.f56968f.e();
    }

    @Override // xn.r0
    public void f() throws InterruptedIOException {
        this.f56968f.f();
    }

    @Override // xn.r0
    public r0 g(long j10, TimeUnit unit) {
        kotlin.jvm.internal.s.h(unit, "unit");
        return this.f56968f.g(j10, unit);
    }

    public final r0 i() {
        return this.f56968f;
    }

    public final p j(r0 delegate) {
        kotlin.jvm.internal.s.h(delegate, "delegate");
        this.f56968f = delegate;
        return this;
    }
}
