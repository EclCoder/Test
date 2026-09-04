package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.48, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass48 {
    public boolean A00;
    public final AnonymousClass45 A01;

    public AnonymousClass48() {
        this(AnonymousClass45.A00);
    }

    public AnonymousClass48(AnonymousClass45 anonymousClass45) {
        this.A01 = anonymousClass45;
    }

    public final synchronized void A00() throws InterruptedException {
        while (!this.A00) {
            wait();
        }
    }

    public final synchronized void A01() {
        boolean z10 = false;
        while (true) {
            boolean wasInterrupted = this.A00;
            if (wasInterrupted) {
                break;
            }
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean A02() {
        boolean z10;
        z10 = this.A00;
        this.A00 = false;
        return z10;
    }

    public final synchronized boolean A03() {
        return this.A00;
    }

    public final synchronized boolean A04() {
        if (this.A00) {
            return false;
        }
        this.A00 = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean A05(long j10) throws InterruptedException {
        try {
            if (j10 <= 0) {
                return this.A00;
            }
            long nowMs = this.A01.A6J();
            long j11 = nowMs + j10;
            if (j11 < nowMs) {
                A00();
            } else {
                while (!this.A00 && nowMs < j11) {
                    long endMs = j11 - nowMs;
                    wait(endMs);
                    nowMs = this.A01.A6J();
                }
            }
            return this.A00;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
