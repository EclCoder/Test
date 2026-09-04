package xo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
class b extends fp.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final AtomicLong f57007o = new AtomicLong();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f57008m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TimeUnit f57009n;

    public b(fp.b bVar, int i10, int i11, long j10, TimeUnit timeUnit) {
        super(bVar, i10, i11);
        zn.h.k(b.class);
        this.f57008m = j10;
        this.f57009n = timeUnit;
    }
}
