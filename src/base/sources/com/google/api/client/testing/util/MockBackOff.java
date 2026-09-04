package com.google.api.client.testing.util;

import com.google.api.client.util.BackOff;
import com.google.api.client.util.Preconditions;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class MockBackOff implements BackOff {
    private long backOffMillis;
    private int maxTries = 10;
    private int numTries;

    public final int getMaxTries() {
        return this.maxTries;
    }

    public final int getNumberOfTries() {
        return this.numTries;
    }

    @Override // com.google.api.client.util.BackOff
    public long nextBackOffMillis() {
        int i10 = this.numTries;
        if (i10 < this.maxTries) {
            long j10 = this.backOffMillis;
            if (j10 != -1) {
                this.numTries = i10 + 1;
                return j10;
            }
        }
        return -1L;
    }

    @Override // com.google.api.client.util.BackOff
    public void reset() {
        this.numTries = 0;
    }

    public MockBackOff setBackOffMillis(long j10) {
        Preconditions.checkArgument(j10 == -1 || j10 >= 0);
        this.backOffMillis = j10;
        return this;
    }

    public MockBackOff setMaxTries(int i10) {
        Preconditions.checkArgument(i10 >= 0);
        this.maxTries = i10;
        return this;
    }
}
