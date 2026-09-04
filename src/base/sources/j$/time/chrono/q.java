package j$.time.chrono;

import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends d {
    private static final long serialVersionUID = -5207853542612002020L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient o f41650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient int f41651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f41652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f41653d;

    @Override // j$.time.chrono.b
    public final e L(j$.time.l lVar) {
        return new g(this, lVar);
    }

    public q(o oVar, int i10, int i11, int i12) {
        oVar.Z(i10, i11, i12);
        this.f41650a = oVar;
        this.f41651b = i10;
        this.f41652c = i11;
        this.f41653d = i12;
    }

    public q(o oVar, long j10) {
        int i10 = (int) j10;
        oVar.X();
        if (i10 < oVar.f41642e || i10 >= oVar.f41643f) {
            throw new j$.time.c("Hijrah date out of range");
        }
        int iBinarySearch = Arrays.binarySearch(oVar.f41641d, i10);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int i11 = oVar.f41644g;
        int[] iArr = {(iBinarySearch + i11) / 12, ((i11 + iBinarySearch) % 12) + 1, (i10 - oVar.f41641d[iBinarySearch]) + 1};
        this.f41650a = oVar;
        this.f41651b = iArr[0];
        this.f41652c = iArr[1];
        this.f41653d = iArr[2];
    }

    @Override // j$.time.chrono.b
    public final l f() {
        return this.f41650a;
    }

    @Override // j$.time.chrono.b
    public final m N() {
        return r.AH;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.A(this);
        }
        if (!h(rVar)) {
            throw new j$.time.temporal.u(j$.time.d.a("Unsupported field: ", rVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i10 = p.f41649a[aVar.ordinal()];
        if (i10 == 1) {
            return j$.time.temporal.v.f(1L, this.f41650a.a0(this.f41651b, this.f41652c));
        }
        if (i10 != 2) {
            return i10 != 3 ? this.f41650a.y(aVar) : j$.time.temporal.v.f(1L, 5L);
        }
        return j$.time.temporal.v.f(1L, this.f41650a.c0(this.f41651b, 12));
    }

    @Override // j$.time.temporal.n
    public final long i(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.P(this);
        }
        switch (p.f41649a[((j$.time.temporal.a) rVar).ordinal()]) {
            case 1:
                return this.f41653d;
            case 2:
                return P();
            case 3:
                return ((this.f41653d - 1) / 7) + 1;
            case 4:
                return ((int) Math.floorMod(K() + 3, 7)) + 1;
            case 5:
                return ((this.f41653d - 1) % 7) + 1;
            case 6:
                return ((P() - 1) % 7) + 1;
            case 7:
                return K();
            case 8:
                return ((P() - 1) / 7) + 1;
            case 9:
                return this.f41652c;
            case 10:
                return ((((long) this.f41651b) * 12) + ((long) this.f41652c)) - 1;
            case 11:
                return this.f41651b;
            case 12:
                return this.f41651b;
            case 13:
                return this.f41651b <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.u(j$.time.d.a("Unsupported field: ", rVar));
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final q c(long j10, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (q) super.c(j10, rVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        this.f41650a.y(aVar).b(j10, aVar);
        int i10 = (int) j10;
        switch (p.f41649a[aVar.ordinal()]) {
            case 1:
                return Y(this.f41651b, this.f41652c, i10);
            case 2:
                return A(Math.min(i10, this.f41650a.c0(this.f41651b, 12)) - P());
            case 3:
                return A((j10 - i(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return A(j10 - ((long) (((int) Math.floorMod(K() + 3, 7)) + 1)));
            case 5:
                return A(j10 - i(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return A(j10 - i(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new q(this.f41650a, j10);
            case 8:
                return A((j10 - i(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return Y(this.f41651b, i10, this.f41653d);
            case 10:
                return F(j10 - (((((long) this.f41651b) * 12) + ((long) this.f41652c)) - 1));
            case 11:
                if (this.f41651b < 1) {
                    i10 = 1 - i10;
                }
                return Y(i10, this.f41652c, this.f41653d);
            case 12:
                return Y(i10, this.f41652c, this.f41653d);
            case 13:
                return Y(1 - this.f41651b, this.f41652c, this.f41653d);
            default:
                throw new j$.time.temporal.u(j$.time.d.a("Unsupported field: ", rVar));
        }
    }

    public final q Y(int i10, int i11, int i12) {
        int iA0 = this.f41650a.a0(i10, i11);
        if (i12 > iA0) {
            i12 = iA0;
        }
        return new q(this.f41650a, i10, i11, i12);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.m m(j$.time.i iVar) {
        return (q) super.m(iVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b m(j$.time.temporal.o oVar) {
        return (q) super.m(oVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b R(j$.time.temporal.q qVar) {
        return (q) super.R(qVar);
    }

    @Override // j$.time.chrono.b
    public final long K() {
        return this.f41650a.Z(this.f41651b, this.f41652c, this.f41653d);
    }

    public final int P() {
        return this.f41650a.c0(this.f41651b, this.f41652c - 1) + this.f41653d;
    }

    @Override // j$.time.chrono.d
    public final b I(long j10) {
        return j10 == 0 ? this : Y(Math.addExact(this.f41651b, (int) j10), this.f41652c, this.f41653d);
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final q F(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (((long) this.f41651b) * 12) + ((long) (this.f41652c - 1)) + j10;
        o oVar = this.f41650a;
        long jFloorDiv = Math.floorDiv(j11, 12L);
        int i10 = oVar.f41644g;
        if (jFloorDiv >= i10 / 12 && jFloorDiv <= (((oVar.f41641d.length - 1) + i10) / 12) - 1) {
            return Y((int) jFloorDiv, ((int) Math.floorMod(j11, 12L)) + 1, this.f41653d);
        }
        throw new j$.time.c("Invalid Hijrah year: " + jFloorDiv);
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final q A(long j10) {
        return new q(this.f41650a, K() + j10);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b d(long j10, j$.time.temporal.t tVar) {
        return (q) super.d(j10, tVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m d(long j10, j$.time.temporal.t tVar) {
        return (q) super.d(j10, tVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b a(long j10, j$.time.temporal.t tVar) {
        return (q) super.a(j10, tVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final j$.time.temporal.m a(long j10, j$.time.temporal.t tVar) {
        return (q) super.a(j10, tVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f41651b == qVar.f41651b && this.f41652c == qVar.f41652c && this.f41653d == qVar.f41653d && this.f41650a.equals(qVar.f41650a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        int i10 = this.f41651b;
        int i11 = this.f41652c;
        int i12 = this.f41653d;
        this.f41650a.getClass();
        return (((i10 << 11) + (i11 << 6)) + i12) ^ ((i10 & BackupConstant.CLOSE_NOT_SHOW_CODE) ^ 2100100019);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 6, this);
    }
}
