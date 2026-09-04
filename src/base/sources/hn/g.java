package hn;

import gn.a0;
import gn.g0;
import kotlin.jvm.internal.s;
import xn.c0;
import xn.q0;
import xn.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class g extends g0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f40713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f40714b;

    public g(a0 a0Var, long j10) {
        this.f40713a = a0Var;
        this.f40714b = j10;
    }

    @Override // gn.g0
    public long contentLength() {
        return this.f40714b;
    }

    @Override // gn.g0
    public a0 contentType() {
        return this.f40713a;
    }

    @Override // xn.q0
    public long read(xn.e sink, long j10) {
        s.h(sink, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // gn.g0
    public xn.g source() {
        return c0.c(this);
    }

    @Override // xn.q0
    public r0 timeout() {
        return r0.f56980e;
    }

    @Override // gn.g0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
