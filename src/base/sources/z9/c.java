package z9;

import u9.l;
import u9.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class c extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f58680b;

    public c(l lVar, long j10) {
        super(lVar);
        ob.a.a(lVar.getPosition() >= j10);
        this.f58680b = j10;
    }

    @Override // u9.u, u9.l
    public long getLength() {
        return super.getLength() - this.f58680b;
    }

    @Override // u9.u, u9.l
    public long getPeekPosition() {
        return super.getPeekPosition() - this.f58680b;
    }

    @Override // u9.u, u9.l
    public long getPosition() {
        return super.getPosition() - this.f58680b;
    }
}
