package ua;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import va.i;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u9.c f54344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f54345b;

    public g(u9.c cVar, long j10) {
        this.f54344a = cVar;
        this.f54345b = j10;
    }

    @Override // ua.e
    public long a(long j10, long j11) {
        return this.f54344a.f54240d[(int) j10];
    }

    @Override // ua.e
    public long b(long j10, long j11) {
        return 0L;
    }

    @Override // ua.e
    public long c(long j10, long j11) {
        return C.TIME_UNSET;
    }

    @Override // ua.e
    public i d(long j10) {
        u9.c cVar = this.f54344a;
        int i10 = (int) j10;
        return new i(null, cVar.f54239c[i10], cVar.f54238b[i10]);
    }

    @Override // ua.e
    public long e(long j10, long j11) {
        return this.f54344a.b(j10 + this.f54345b);
    }

    @Override // ua.e
    public long f(long j10) {
        return this.f54344a.f54237a;
    }

    @Override // ua.e
    public boolean g() {
        return true;
    }

    @Override // ua.e
    public long getTimeUs(long j10) {
        return this.f54344a.f54241e[(int) j10] - this.f54345b;
    }

    @Override // ua.e
    public long h() {
        return 0L;
    }

    @Override // ua.e
    public long i(long j10, long j11) {
        return this.f54344a.f54237a;
    }
}
