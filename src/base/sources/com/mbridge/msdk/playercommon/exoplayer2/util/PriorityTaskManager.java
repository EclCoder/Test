package com.mbridge.msdk.playercommon.exoplayer2.util;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class PriorityTaskManager {
    private final Object lock = new Object();
    private final PriorityQueue<Integer> queue = new PriorityQueue<>(10, Collections.reverseOrder());
    private int highestPriority = Integer.MIN_VALUE;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i10, int i11) {
            super("Priority too low [priority=" + i10 + ", highest=" + i11 + "]");
        }
    }

    public void add(int i10) {
        synchronized (this.lock) {
            this.queue.add(Integer.valueOf(i10));
            this.highestPriority = Math.max(this.highestPriority, i10);
        }
    }

    public void proceed(int i10) {
        synchronized (this.lock) {
            while (this.highestPriority != i10) {
                try {
                    this.lock.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public boolean proceedNonBlocking(int i10) {
        boolean z10;
        synchronized (this.lock) {
            z10 = this.highestPriority == i10;
        }
        return z10;
    }

    public void proceedOrThrow(int i10) {
        synchronized (this.lock) {
            try {
                if (this.highestPriority != i10) {
                    throw new PriorityTooLowException(i10, this.highestPriority);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void remove(int i10) {
        synchronized (this.lock) {
            this.queue.remove(Integer.valueOf(i10));
            this.highestPriority = this.queue.isEmpty() ? Integer.MIN_VALUE : this.queue.peek().intValue();
            this.lock.notifyAll();
        }
    }
}
