package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Gk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24879c;

    public Gk(long j10, long j11, long j12) {
        this.f24877a = j10;
        this.f24878b = j11;
        this.f24879c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gk)) {
            return false;
        }
        Gk gk2 = (Gk) obj;
        return this.f24877a == gk2.f24877a && this.f24878b == gk2.f24878b && this.f24879c == gk2.f24879c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24879c) + ((Long.hashCode(this.f24878b) + (Long.hashCode(this.f24877a) * 31)) * 31);
    }

    public final String toString() {
        return "TimeoutConfig(connectTimeoutInSec=" + this.f24877a + ", readTimeoutInSec=" + this.f24878b + ", callTimeoutInSec=" + this.f24879c + ")";
    }
}
