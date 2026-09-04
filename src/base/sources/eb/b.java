package eb;

import bb.i;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f37673a;

    public b(List list) {
        this.f37673a = list;
    }

    @Override // bb.i
    public List getCues(long j10) {
        return this.f37673a;
    }

    @Override // bb.i
    public long getEventTime(int i10) {
        return 0L;
    }

    @Override // bb.i
    public int getEventTimeCount() {
        return 1;
    }

    @Override // bb.i
    public int getNextEventTimeIndex(long j10) {
        return -1;
    }
}
