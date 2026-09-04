package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.yb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3453yb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f27934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f27935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27936f;

    public C3453yb(String fileName, long j10, int i10, long j11, boolean z10, int i11) {
        kotlin.jvm.internal.s.h(fileName, "fileName");
        this.f27931a = fileName;
        this.f27932b = j10;
        this.f27933c = i10;
        this.f27934d = j11;
        this.f27935e = z10;
        this.f27936f = i11;
    }

    public /* synthetic */ C3453yb(String str, long j10, int i10, long j11, boolean z10, int i11, int i12) {
        this(str, j10, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0L : j11, (i12 & 16) != 0 ? false : z10, (i12 & 32) != 0 ? 0 : i11);
    }
}
