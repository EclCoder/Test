package com.mbridge.msdk.playercommon.exoplayer2.util;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class ConditionVariable {
    private boolean isOpen;

    public synchronized void block() {
        while (!this.isOpen) {
            wait();
        }
    }

    public synchronized boolean close() {
        boolean z10;
        z10 = this.isOpen;
        this.isOpen = false;
        return z10;
    }

    public synchronized boolean open() {
        if (this.isOpen) {
            return false;
        }
        this.isOpen = true;
        notifyAll();
        return true;
    }

    public synchronized boolean block(long j10) {
        boolean z10;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j11 = j10 + jElapsedRealtime;
        while (true) {
            z10 = this.isOpen;
            if (z10 || jElapsedRealtime >= j11) {
                break;
            }
            wait(j11 - jElapsedRealtime);
            jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        }
        return z10;
    }
}
