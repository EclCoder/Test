package w2;

import o2.q;
import o2.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class d extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f55880b;

    public d(q qVar, long j10) {
        super(qVar);
        w1.a.a(qVar.getPosition() >= j10);
        this.f55880b = j10;
    }

    @Override // o2.z, o2.q
    public long getLength() {
        return super.getLength() - this.f55880b;
    }

    @Override // o2.z, o2.q
    public long getPeekPosition() {
        return super.getPeekPosition() - this.f55880b;
    }

    @Override // o2.z, o2.q
    public long getPosition() {
        return super.getPosition() - this.f55880b;
    }
}
