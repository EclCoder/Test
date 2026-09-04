package hb;

import bb.i;
import java.util.Collections;
import java.util.List;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bb.b[] f40322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f40323b;

    public b(bb.b[] bVarArr, long[] jArr) {
        this.f40322a = bVarArr;
        this.f40323b = jArr;
    }

    @Override // bb.i
    public List getCues(long j10) {
        bb.b bVar;
        int i10 = r0.i(this.f40323b, j10, true, false);
        return (i10 == -1 || (bVar = this.f40322a[i10]) == bb.b.f8732r) ? Collections.EMPTY_LIST : Collections.singletonList(bVar);
    }

    @Override // bb.i
    public long getEventTime(int i10) {
        ob.a.a(i10 >= 0);
        ob.a.a(i10 < this.f40323b.length);
        return this.f40323b[i10];
    }

    @Override // bb.i
    public int getEventTimeCount() {
        return this.f40323b.length;
    }

    @Override // bb.i
    public int getNextEventTimeIndex(long j10) {
        int iE = r0.e(this.f40323b, j10, false, false);
        if (iE < this.f40323b.length) {
            return iE;
        }
        return -1;
    }
}
