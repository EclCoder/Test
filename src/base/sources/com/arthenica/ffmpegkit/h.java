package com.arthenica.ffmpegkit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f11091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f11092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11093c;

    public h(long j10, g gVar, String str) {
        this.f11091a = j10;
        this.f11092b = gVar;
        this.f11093c = str;
    }

    public g a() {
        return this.f11092b;
    }

    public String b() {
        return this.f11093c;
    }

    public String toString() {
        return "Log{sessionId=" + this.f11091a + ", level=" + this.f11092b + ", message='" + this.f11093c + "'}";
    }
}
