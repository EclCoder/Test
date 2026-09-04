package ib;

import bb.i;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f41316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f41317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f41318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f41319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f41320e;

    public h(d dVar, Map map, Map map2, Map map3) {
        this.f41316a = dVar;
        this.f41319d = map2;
        this.f41320e = map3;
        this.f41318c = map != null ? Collections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.f41317b = dVar.j();
    }

    @Override // bb.i
    public List getCues(long j10) {
        return this.f41316a.h(j10, this.f41318c, this.f41319d, this.f41320e);
    }

    @Override // bb.i
    public long getEventTime(int i10) {
        return this.f41317b[i10];
    }

    @Override // bb.i
    public int getEventTimeCount() {
        return this.f41317b.length;
    }

    @Override // bb.i
    public int getNextEventTimeIndex(long j10) {
        int iE = r0.e(this.f41317b, j10, false, false);
        if (iE < this.f41317b.length) {
            return iE;
        }
        return -1;
    }
}
