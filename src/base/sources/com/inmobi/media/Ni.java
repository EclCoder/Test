package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ni {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25357b;

    public Ni(int i10, long j10, int i11) {
        this.f25356a = i10;
        this.f25357b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ni)) {
            return false;
        }
        Ni ni2 = (Ni) obj;
        return this.f25356a == ni2.f25356a && this.f25357b == ni2.f25357b && Double.compare(1.0d, 1.0d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(1.0d) + ((Long.hashCode(this.f25357b) + (Integer.hashCode(this.f25356a) * 31)) * 31);
    }

    public final String toString() {
        return "RetryPolicy(maxRetries=" + this.f25356a + ", retryInterval=" + this.f25357b + ", delayFactor=1.0)";
    }

    public Ni(long j10, int i10) {
        this.f25356a = i10;
        this.f25357b = j10;
    }
}
