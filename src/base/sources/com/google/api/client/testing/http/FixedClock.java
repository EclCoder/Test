package com.google.api.client.testing.http;

import com.google.api.client.util.Clock;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class FixedClock implements Clock {
    private AtomicLong currentTime;

    public FixedClock() {
        this(0L);
    }

    @Override // com.google.api.client.util.Clock
    public long currentTimeMillis() {
        return this.currentTime.get();
    }

    public FixedClock setTime(long j10) {
        this.currentTime.set(j10);
        return this;
    }

    public FixedClock(long j10) {
        this.currentTime = new AtomicLong(j10);
    }
}
