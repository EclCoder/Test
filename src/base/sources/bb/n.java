package bb;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n extends s9.f implements i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i f8804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f8805e;

    @Override // s9.a
    public void b() {
        super.b();
        this.f8804d = null;
    }

    @Override // bb.i
    public List getCues(long j10) {
        return ((i) ob.a.e(this.f8804d)).getCues(j10 - this.f8805e);
    }

    @Override // bb.i
    public long getEventTime(int i10) {
        return ((i) ob.a.e(this.f8804d)).getEventTime(i10) + this.f8805e;
    }

    @Override // bb.i
    public int getEventTimeCount() {
        return ((i) ob.a.e(this.f8804d)).getEventTimeCount();
    }

    @Override // bb.i
    public int getNextEventTimeIndex(long j10) {
        return ((i) ob.a.e(this.f8804d)).getNextEventTimeIndex(j10 - this.f8805e);
    }

    public void m(long j10, i iVar, long j11) {
        this.f51533b = j10;
        this.f8804d = iVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f8805e = j10;
    }
}
