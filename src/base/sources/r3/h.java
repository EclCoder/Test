package r3;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import l3.k;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f51075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f51076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f51077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f51078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f51079e;

    public h(c cVar, Map map, Map map2, Map map3) {
        this.f51075a = cVar;
        this.f51078d = map2;
        this.f51079e = map3;
        this.f51077c = map != null ? Collections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.f51076b = cVar.j();
    }

    @Override // l3.k
    public List getCues(long j10) {
        return this.f51075a.h(j10, this.f51077c, this.f51078d, this.f51079e);
    }

    @Override // l3.k
    public long getEventTime(int i10) {
        return this.f51076b[i10];
    }

    @Override // l3.k
    public int getEventTimeCount() {
        return this.f51076b.length;
    }

    @Override // l3.k
    public int getNextEventTimeIndex(long j10) {
        int iD = c0.d(this.f51076b, j10, false, false);
        if (iD < this.f51076b.length) {
            return iD;
        }
        return -1;
    }
}
