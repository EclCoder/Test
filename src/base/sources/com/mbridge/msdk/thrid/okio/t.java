package com.mbridge.msdk.thrid.okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f33682d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f33683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f33684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f33685c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a extends t {
        a() {
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j10) {
            return this;
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j10, TimeUnit timeUnit) {
            return this;
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public void e() {
        }
    }

    public t a(long j10, TimeUnit timeUnit) {
        if (j10 >= 0) {
            if (timeUnit == null) {
                throw new IllegalArgumentException("unit == null");
            }
            this.f33685c = timeUnit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException("timeout < 0: " + j10);
    }

    public t b() {
        this.f33685c = 0L;
        return this;
    }

    public long c() {
        if (this.f33683a) {
            return this.f33684b;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean d() {
        return this.f33683a;
    }

    public void e() throws InterruptedIOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f33683a && this.f33684b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long f() {
        return this.f33685c;
    }

    public t a(long j10) {
        this.f33683a = true;
        this.f33684b = j10;
        return this;
    }

    public t a() {
        this.f33683a = false;
        return this;
    }
}
