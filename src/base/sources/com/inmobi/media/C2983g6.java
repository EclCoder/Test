package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.g6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2983g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f26589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f26590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f26591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f26592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f26593k;

    public C2983g6(int i10, long j10, long j11, long j12, int i11, int i12, int i13, int i14, long j13, long j14) {
        this.f26583a = i10;
        this.f26584b = j10;
        this.f26585c = j11;
        this.f26586d = j12;
        this.f26587e = i11;
        this.f26588f = i12;
        this.f26589g = i13;
        this.f26590h = i14;
        this.f26591i = j13;
        this.f26592j = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2983g6)) {
            return false;
        }
        C2983g6 c2983g6 = (C2983g6) obj;
        return this.f26583a == c2983g6.f26583a && this.f26584b == c2983g6.f26584b && this.f26585c == c2983g6.f26585c && this.f26586d == c2983g6.f26586d && this.f26587e == c2983g6.f26587e && this.f26588f == c2983g6.f26588f && this.f26589g == c2983g6.f26589g && this.f26590h == c2983g6.f26590h && this.f26591i == c2983g6.f26591i && this.f26592j == c2983g6.f26592j;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26592j) + ((Long.hashCode(this.f26591i) + AbstractC3305si.a(this.f26590h, AbstractC3305si.a(this.f26589g, AbstractC3305si.a(this.f26588f, AbstractC3305si.a(this.f26587e, (Long.hashCode(this.f26586d) + ((Long.hashCode(this.f26585c) + ((Long.hashCode(this.f26584b) + (Integer.hashCode(this.f26583a) * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "EventConfig(maxRetryCount=" + this.f26583a + ", timeToLiveInSec=" + this.f26584b + ", processingInterval=" + this.f26585c + ", ingestionLatencyInSec=" + this.f26586d + ", minBatchSizeWifi=" + this.f26587e + ", maxBatchSizeWifi=" + this.f26588f + ", minBatchSizeMobile=" + this.f26589g + ", maxBatchSizeMobile=" + this.f26590h + ", retryIntervalWifi=" + this.f26591i + ", retryIntervalMobile=" + this.f26592j + ")";
    }
}
