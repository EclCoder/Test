package h3;

import o2.f0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class a extends o2.h implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f40172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f40173i;

    public a(long j10, long j11, f0.a aVar, boolean z10) {
        this(j10, j11, aVar.f48054f, aVar.f48051c, z10);
    }

    @Override // h3.g
    public long a() {
        return this.f40173i;
    }

    @Override // h3.g
    public int g() {
        return this.f40172h;
    }

    @Override // h3.g
    public long getTimeUs(long j10) {
        return c(j10);
    }

    public a(long j10, long j11, int i10, int i11, boolean z10) {
        super(j10, j11, i10, i11, z10);
        long j12 = j10;
        this.f40172h = i10;
        this.f40173i = j12 == -1 ? -1L : j12;
    }
}
