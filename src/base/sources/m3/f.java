package m3;

import java.util.Collections;
import java.util.List;
import l3.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f45230a;

    public f(List list) {
        this.f45230a = list;
    }

    @Override // l3.k
    public List getCues(long j10) {
        return j10 >= 0 ? this.f45230a : Collections.EMPTY_LIST;
    }

    @Override // l3.k
    public long getEventTime(int i10) {
        w1.a.a(i10 == 0);
        return 0L;
    }

    @Override // l3.k
    public int getEventTimeCount() {
        return 1;
    }

    @Override // l3.k
    public int getNextEventTimeIndex(long j10) {
        return j10 < 0 ? 0 : -1;
    }
}
