package l3;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends b2.e implements k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k f43870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f43871f;

    @Override // b2.e, b2.a
    public void b() {
        super.b();
        this.f43870e = null;
    }

    @Override // l3.k
    public List getCues(long j10) {
        return ((k) w1.a.e(this.f43870e)).getCues(j10 - this.f43871f);
    }

    @Override // l3.k
    public long getEventTime(int i10) {
        return ((k) w1.a.e(this.f43870e)).getEventTime(i10) + this.f43871f;
    }

    @Override // l3.k
    public int getEventTimeCount() {
        return ((k) w1.a.e(this.f43870e)).getEventTimeCount();
    }

    @Override // l3.k
    public int getNextEventTimeIndex(long j10) {
        return ((k) w1.a.e(this.f43870e)).getNextEventTimeIndex(j10 - this.f43871f);
    }

    public void k(long j10, k kVar, long j11) {
        this.f8288b = j10;
        this.f43870e = kVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f43871f = j10;
    }
}
