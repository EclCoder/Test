package jb;

import bb.i;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f42210b = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f42211a;

    public b(bb.b bVar) {
        this.f42211a = Collections.singletonList(bVar);
    }

    @Override // bb.i
    public List getCues(long j10) {
        return j10 >= 0 ? this.f42211a : Collections.EMPTY_LIST;
    }

    @Override // bb.i
    public long getEventTime(int i10) {
        ob.a.a(i10 == 0);
        return 0L;
    }

    @Override // bb.i
    public int getEventTimeCount() {
        return 1;
    }

    @Override // bb.i
    public int getNextEventTimeIndex(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    private b() {
        this.f42211a = Collections.EMPTY_LIST;
    }
}
