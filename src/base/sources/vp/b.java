package vp;

import sun.misc.Cleaner;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class b extends c {
    private static final long serialVersionUID = -8342458159338079576L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f55699h;

    public b(long j10) {
        this(j10, true);
    }

    @Override // vp.c
    public boolean equals(Object obj) {
        return super.equals(obj) && this.f55699h == ((b) obj).f55699h;
    }

    @Override // vp.c
    public int hashCode() {
        int iHashCode = super.hashCode() * 29;
        float[] fArr = this.f55699h;
        return iHashCode + (fArr != null ? fArr.hashCode() : 0);
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public b clone() {
        if (this.f55704d) {
            return new b(this.f55702b, p(0L));
        }
        b bVar = new b(this.f55702b, false);
        e.a(this, 0L, bVar, 0L, this.f55702b);
        return bVar;
    }

    public final float[] n() {
        return this.f55699h;
    }

    public final double o(long j10) {
        float f10;
        long j11 = this.f55706f;
        if (j11 != 0) {
            f10 = e.f55728a.getFloat(j11 + (this.f55703c * j10));
        } else {
            f10 = this.f55704d ? this.f55699h[0] : this.f55699h[(int) j10];
        }
        return f10;
    }

    public final float p(long j10) {
        long j11 = this.f55706f;
        if (j11 != 0) {
            return e.f55728a.getFloat(j11 + (this.f55703c * j10));
        }
        return this.f55704d ? this.f55699h[0] : this.f55699h[(int) j10];
    }

    public final void q(long j10, double d10) {
        long j11 = this.f55706f;
        if (j11 != 0) {
            e.f55728a.putFloat(j11 + (this.f55703c * j10), (float) d10);
        } else {
            if (this.f55704d) {
                throw new IllegalAccessError("Constant arrays cannot be modified.");
            }
            this.f55699h[(int) j10] = (float) d10;
        }
    }

    public final void r(long j10, float f10) {
        long j11 = this.f55706f;
        if (j11 != 0) {
            e.f55728a.putFloat(j11 + (this.f55703c * j10), f10);
        } else {
            if (this.f55704d) {
                throw new IllegalAccessError("Constant arrays cannot be modified.");
            }
            this.f55699h[(int) j10] = f10;
        }
    }

    public b(long j10, boolean z10) {
        this.f55701a = d.f55721g;
        this.f55703c = 4L;
        if (j10 <= 0) {
            throw new IllegalArgumentException(j10 + " is not a positive long value");
        }
        this.f55702b = j10;
        if (j10 <= c.g()) {
            this.f55699h = new float[(int) j10];
            return;
        }
        this.f55706f = e.f55728a.allocateMemory(this.f55702b * this.f55703c);
        if (z10) {
            l(j10);
        }
        Cleaner.create(this, new c.RunnableC0846c(this.f55706f, this.f55702b, this.f55703c));
        g.b(this.f55702b * this.f55703c);
    }

    public b(long j10, float f10) {
        this.f55701a = d.f55721g;
        this.f55703c = 4L;
        if (j10 > 0) {
            this.f55702b = j10;
            this.f55704d = true;
            this.f55699h = new float[]{f10};
        } else {
            throw new IllegalArgumentException(j10 + " is not a positive long value");
        }
    }

    public b(float[] fArr) {
        this.f55701a = d.f55721g;
        this.f55703c = 4L;
        this.f55702b = fArr.length;
        this.f55699h = fArr;
    }
}
