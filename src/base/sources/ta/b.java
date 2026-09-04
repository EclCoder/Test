package ta;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f53188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f53189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f53190d;

    public b(long j10, long j11) {
        this.f53188b = j10;
        this.f53189c = j11;
        f();
    }

    protected final void c() {
        long j10 = this.f53190d;
        if (j10 < this.f53188b || j10 > this.f53189c) {
            throw new NoSuchElementException();
        }
    }

    protected final long d() {
        return this.f53190d;
    }

    public boolean e() {
        return this.f53190d > this.f53189c;
    }

    public void f() {
        this.f53190d = this.f53188b - 1;
    }

    @Override // ta.o
    public boolean next() {
        this.f53190d++;
        return !e();
    }
}
