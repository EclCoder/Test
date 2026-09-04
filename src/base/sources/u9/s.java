package u9;

import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f54308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f54309b;

    public s(t tVar, long j10) {
        this.f54308a = tVar;
        this.f54309b = j10;
    }

    private a0 b(long j10, long j11) {
        return new a0((j10 * 1000000) / ((long) this.f54308a.f54314e), this.f54309b + j11);
    }

    @Override // u9.z
    public long getDurationUs() {
        return this.f54308a.f();
    }

    @Override // u9.z
    public z.a getSeekPoints(long j10) {
        ob.a.i(this.f54308a.f54320k);
        t tVar = this.f54308a;
        t.a aVar = tVar.f54320k;
        long[] jArr = aVar.f54322a;
        long[] jArr2 = aVar.f54323b;
        int i10 = r0.i(jArr, tVar.i(j10), true, false);
        a0 a0VarB = b(i10 == -1 ? 0L : jArr[i10], i10 != -1 ? jArr2[i10] : 0L);
        if (a0VarB.f54231a == j10 || i10 == jArr.length - 1) {
            return new z.a(a0VarB);
        }
        int i11 = i10 + 1;
        return new z.a(a0VarB, b(jArr[i11], jArr2[i11]));
    }

    @Override // u9.z
    public boolean isSeekable() {
        return true;
    }
}
