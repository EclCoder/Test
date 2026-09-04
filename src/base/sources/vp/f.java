package vp;

import sun.misc.Cleaner;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class f extends c {
    private static final long serialVersionUID = -2579271120060523901L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long[] f55741h;

    public f(long j10) {
        this(j10, true);
    }

    @Override // vp.c
    public boolean equals(Object obj) {
        return super.equals(obj) && this.f55741h == ((f) obj).f55741h;
    }

    @Override // vp.c
    public int hashCode() {
        int iHashCode = super.hashCode() * 29;
        long[] jArr = this.f55741h;
        return iHashCode + (jArr != null ? jArr.hashCode() : 0);
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public f clone() {
        if (this.f55704d) {
            return new f(this.f55702b, n(0L));
        }
        f fVar = new f(this.f55702b, false);
        e.b(this, 0L, fVar, 0L, this.f55702b);
        return fVar;
    }

    public final long n(long j10) {
        long j11 = this.f55706f;
        if (j11 != 0) {
            return e.f55728a.getLong(j11 + (this.f55703c * j10));
        }
        return this.f55704d ? this.f55741h[0] : this.f55741h[(int) j10];
    }

    public final void o(long j10, long j11) {
        long j12 = this.f55706f;
        if (j12 != 0) {
            e.f55728a.putLong(j12 + (this.f55703c * j10), j11);
        } else {
            if (this.f55704d) {
                throw new IllegalAccessError("Constant arrays cannot be modified.");
            }
            this.f55741h[(int) j10] = j11;
        }
    }

    public f(long j10, boolean z10) {
        this.f55701a = d.f55720f;
        this.f55703c = 8L;
        if (j10 <= 0) {
            throw new IllegalArgumentException(j10 + " is not a positive long value");
        }
        this.f55702b = j10;
        if (j10 <= c.g()) {
            this.f55741h = new long[(int) j10];
            return;
        }
        this.f55706f = e.f55728a.allocateMemory(this.f55702b * this.f55703c);
        if (z10) {
            l(j10);
        }
        Cleaner.create(this, new c.RunnableC0846c(this.f55706f, this.f55702b, this.f55703c));
        g.b(this.f55702b * this.f55703c);
    }

    public f(long j10, long j11) {
        this.f55701a = d.f55722h;
        this.f55703c = 8L;
        if (j10 > 0) {
            this.f55702b = j10;
            this.f55704d = true;
            this.f55741h = new long[]{j11};
        } else {
            throw new IllegalArgumentException(j10 + " is not a positive long value");
        }
    }
}
