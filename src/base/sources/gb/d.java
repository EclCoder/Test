package gb;

import bb.i;
import java.util.Collections;
import java.util.List;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f39076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f39077b;

    public d(List list, List list2) {
        this.f39076a = list;
        this.f39077b = list2;
    }

    @Override // bb.i
    public List getCues(long j10) {
        int iF = r0.f(this.f39077b, Long.valueOf(j10), true, false);
        return iF == -1 ? Collections.EMPTY_LIST : (List) this.f39076a.get(iF);
    }

    @Override // bb.i
    public long getEventTime(int i10) {
        ob.a.a(i10 >= 0);
        ob.a.a(i10 < this.f39077b.size());
        return ((Long) this.f39077b.get(i10)).longValue();
    }

    @Override // bb.i
    public int getEventTimeCount() {
        return this.f39077b.size();
    }

    @Override // bb.i
    public int getNextEventTimeIndex(long j10) {
        int iD = r0.d(this.f39077b, Long.valueOf(j10), false, false);
        if (iD < this.f39077b.size()) {
            return iD;
        }
        return -1;
    }
}
