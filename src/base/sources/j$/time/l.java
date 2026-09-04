package j$.time;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f41757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f41758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f41759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l[] f41760h = new l[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f41761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f41762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f41763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f41764d;

    static {
        int i10 = 0;
        while (true) {
            l[] lVarArr = f41760h;
            if (i10 < lVarArr.length) {
                lVarArr[i10] = new l(i10, 0, 0, 0);
                i10++;
            } else {
                l lVar = lVarArr[0];
                f41759g = lVar;
                l lVar2 = lVarArr[12];
                f41757e = lVar;
                f41758f = new l(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static l P(int i10, int i11, int i12, int i13) {
        j$.time.temporal.a.HOUR_OF_DAY.X(i10);
        j$.time.temporal.a.MINUTE_OF_HOUR.X(i11);
        j$.time.temporal.a.SECOND_OF_MINUTE.X(i12);
        j$.time.temporal.a.NANO_OF_SECOND.X(i13);
        return A(i10, i11, i12, i13);
    }

    public static l V(long j10) {
        j$.time.temporal.a.NANO_OF_DAY.X(j10);
        int i10 = (int) (j10 / 3600000000000L);
        long j11 = j10 - (((long) i10) * 3600000000000L);
        int i11 = (int) (j11 / 60000000000L);
        long j12 = j11 - (((long) i11) * 60000000000L);
        int i12 = (int) (j12 / C.NANOS_PER_SECOND);
        return A(i10, i11, i12, (int) (j12 - (((long) i12) * C.NANOS_PER_SECOND)));
    }

    public static l F(j$.time.temporal.n nVar) {
        Objects.requireNonNull(nVar, "temporal");
        l lVar = (l) nVar.b(j$.time.temporal.s.f41808g);
        if (lVar != null) {
            return lVar;
        }
        throw new c("Unable to obtain LocalTime from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName());
    }

    public static l A(int i10, int i11, int i12, int i13) {
        if ((i11 | i12 | i13) == 0) {
            return f41760h[i10];
        }
        return new l(i10, i11, i12, i13);
    }

    public l(int i10, int i11, int i12, int i13) {
        this.f41761a = (byte) i10;
        this.f41762b = (byte) i11;
        this.f41763c = (byte) i12;
        this.f41764d = i13;
    }

    @Override // j$.time.temporal.n
    public final boolean h(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).Y();
        }
        return rVar != null && rVar.s(this);
    }

    @Override // j$.time.temporal.n
    public final int g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return I(rVar);
        }
        return super.g(rVar);
    }

    @Override // j$.time.temporal.n
    public final long i(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.NANO_OF_DAY) {
                return d0();
            }
            if (rVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return d0() / 1000;
            }
            return I(rVar);
        }
        return rVar.P(this);
    }

    public final int I(j$.time.temporal.r rVar) {
        switch (k.f41755a[((j$.time.temporal.a) rVar).ordinal()]) {
            case 1:
                return this.f41764d;
            case 2:
                throw new j$.time.temporal.u("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f41764d / 1000;
            case 4:
                throw new j$.time.temporal.u("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f41764d / 1000000;
            case 6:
                return (int) (d0() / 1000000);
            case 7:
                return this.f41763c;
            case 8:
                return e0();
            case 9:
                return this.f41762b;
            case 10:
                return (this.f41761a * 60) + this.f41762b;
            case 11:
                return this.f41761a % 12;
            case 12:
                int i10 = this.f41761a % 12;
                if (i10 % 12 == 0) {
                    return 12;
                }
                return i10;
            case 13:
                return this.f41761a;
            case 14:
                byte b10 = this.f41761a;
                if (b10 == 0) {
                    return 24;
                }
                return b10;
            case 15:
                return this.f41761a / 12;
            default:
                throw new j$.time.temporal.u(d.a("Unsupported field: ", rVar));
        }
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.m m(i iVar) {
        return (l) iVar.e(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final l c(long j10, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (l) rVar.V(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.X(j10);
        switch (k.f41755a[aVar.ordinal()]) {
            case 1:
                return g0((int) j10);
            case 2:
                return V(j10);
            case 3:
                return g0(((int) j10) * 1000);
            case 4:
                return V(j10 * 1000);
            case 5:
                return g0(((int) j10) * 1000000);
            case 6:
                return V(j10 * 1000000);
            case 7:
                int i10 = (int) j10;
                if (this.f41763c != i10) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.X(i10);
                    return A(this.f41761a, this.f41762b, i10, this.f41764d);
                }
                return this;
            case 8:
                return b0(j10 - ((long) e0()));
            case 9:
                int i11 = (int) j10;
                if (this.f41762b != i11) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.X(i11);
                    return A(this.f41761a, i11, this.f41763c, this.f41764d);
                }
                return this;
            case 10:
                return Z(j10 - ((long) ((this.f41761a * 60) + this.f41762b)));
            case 11:
                return Y(j10 - ((long) (this.f41761a % 12)));
            case 12:
                if (j10 == 12) {
                    j10 = 0;
                }
                return Y(j10 - ((long) (this.f41761a % 12)));
            case 13:
                int i12 = (int) j10;
                if (this.f41761a != i12) {
                    j$.time.temporal.a.HOUR_OF_DAY.X(i12);
                    return A(i12, this.f41762b, this.f41763c, this.f41764d);
                }
                return this;
            case 14:
                if (j10 == 24) {
                    j10 = 0;
                }
                int i13 = (int) j10;
                if (this.f41761a != i13) {
                    j$.time.temporal.a.HOUR_OF_DAY.X(i13);
                    return A(i13, this.f41762b, this.f41763c, this.f41764d);
                }
                return this;
            case 15:
                return Y((j10 - ((long) (this.f41761a / 12))) * 12);
            default:
                throw new j$.time.temporal.u(d.a("Unsupported field: ", rVar));
        }
    }

    public final l g0(int i10) {
        if (this.f41764d == i10) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.X(i10);
        return A(this.f41761a, this.f41762b, this.f41763c, i10);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final l d(long j10, j$.time.temporal.t tVar) {
        if (tVar instanceof j$.time.temporal.b) {
            switch (k.f41756b[((j$.time.temporal.b) tVar).ordinal()]) {
                case 1:
                    return a0(j10);
                case 2:
                    return a0((j10 % 86400000000L) * 1000);
                case 3:
                    return a0((j10 % com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS) * 1000000);
                case 4:
                    return b0(j10);
                case 5:
                    return Z(j10);
                case 6:
                    return Y(j10);
                case 7:
                    return Y((j10 % 2) * 12);
                default:
                    throw new j$.time.temporal.u("Unsupported unit: " + tVar);
            }
        }
        return (l) tVar.s(this, j10);
    }

    public final l Y(long j10) {
        return j10 == 0 ? this : A(((((int) (j10 % 24)) + this.f41761a) + 24) % 24, this.f41762b, this.f41763c, this.f41764d);
    }

    public final l Z(long j10) {
        if (j10 != 0) {
            int i10 = (this.f41761a * 60) + this.f41762b;
            int i11 = ((((int) (j10 % 1440)) + i10) + 1440) % 1440;
            if (i10 != i11) {
                return A(i11 / 60, i11 % 60, this.f41763c, this.f41764d);
            }
        }
        return this;
    }

    public final l b0(long j10) {
        if (j10 != 0) {
            int i10 = (this.f41762b * 60) + (this.f41761a * 3600) + this.f41763c;
            int i11 = ((((int) (j10 % 86400)) + i10) + 86400) % 86400;
            if (i10 != i11) {
                return A(i11 / 3600, (i11 / 60) % 60, i11 % 60, this.f41764d);
            }
        }
        return this;
    }

    public final l a0(long j10) {
        if (j10 != 0) {
            long jD0 = d0();
            long j11 = (((j10 % 86400000000000L) + jD0) + 86400000000000L) % 86400000000000L;
            if (jD0 != j11) {
                return A((int) (j11 / 3600000000000L), (int) ((j11 / 60000000000L) % 60), (int) ((j11 / C.NANOS_PER_SECOND) % 60), (int) (j11 % C.NANOS_PER_SECOND));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j10, j$.time.temporal.t tVar) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, tVar).d(1L, tVar) : d(-j10, tVar);
    }

    @Override // j$.time.temporal.n
    public final Object b(a0 a0Var) {
        if (a0Var == j$.time.temporal.s.f41803b || a0Var == j$.time.temporal.s.f41802a || a0Var == j$.time.temporal.s.f41806e || a0Var == j$.time.temporal.s.f41805d) {
            return null;
        }
        if (a0Var == j$.time.temporal.s.f41808g) {
            return this;
        }
        if (a0Var == j$.time.temporal.s.f41807f) {
            return null;
        }
        if (a0Var == j$.time.temporal.s.f41804c) {
            return j$.time.temporal.b.NANOS;
        }
        return a0Var.k(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m e(j$.time.temporal.m mVar) {
        return mVar.c(d0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int e0() {
        return (this.f41762b * 60) + (this.f41761a * 3600) + this.f41763c;
    }

    public final long d0() {
        return (((long) this.f41763c) * C.NANOS_PER_SECOND) + (((long) this.f41762b) * 60000000000L) + (((long) this.f41761a) * 3600000000000L) + ((long) this.f41764d);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final int compareTo(l lVar) {
        int iCompare = Integer.compare(this.f41761a, lVar.f41761a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.f41762b, lVar.f41762b)) == 0 && (iCompare = Integer.compare(this.f41763c, lVar.f41763c)) == 0) ? Integer.compare(this.f41764d, lVar.f41764d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f41761a == lVar.f41761a && this.f41762b == lVar.f41762b && this.f41763c == lVar.f41763c && this.f41764d == lVar.f41764d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jD0 = d0();
        return (int) (jD0 ^ (jD0 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(18);
        byte b10 = this.f41761a;
        byte b11 = this.f41762b;
        byte b12 = this.f41763c;
        int i10 = this.f41764d;
        sb2.append(b10 < 10 ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "");
        sb2.append((int) b10);
        sb2.append(b11 < 10 ? ":0" : ":");
        sb2.append((int) b11);
        if (b12 > 0 || i10 > 0) {
            sb2.append(b12 < 10 ? ":0" : ":");
            sb2.append((int) b12);
            if (i10 > 0) {
                sb2.append('.');
                if (i10 % 1000000 == 0) {
                    sb2.append(Integer.toString((i10 / 1000000) + 1000).substring(1));
                } else if (i10 % 1000 == 0) {
                    sb2.append(Integer.toString((i10 / 1000) + 1000000).substring(1));
                } else {
                    sb2.append(Integer.toString(i10 + 1000000000).substring(1));
                }
            }
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new t((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final void h0(DataOutput dataOutput) {
        if (this.f41764d == 0) {
            if (this.f41763c == 0) {
                if (this.f41762b == 0) {
                    dataOutput.writeByte(~this.f41761a);
                    return;
                } else {
                    dataOutput.writeByte(this.f41761a);
                    dataOutput.writeByte(~this.f41762b);
                    return;
                }
            }
            dataOutput.writeByte(this.f41761a);
            dataOutput.writeByte(this.f41762b);
            dataOutput.writeByte(~this.f41763c);
            return;
        }
        dataOutput.writeByte(this.f41761a);
        dataOutput.writeByte(this.f41762b);
        dataOutput.writeByte(this.f41763c);
        dataOutput.writeInt(this.f41764d);
    }

    public static l c0(DataInput dataInput) throws IOException {
        int i10;
        int i11;
        int i12 = dataInput.readByte();
        int i13 = 0;
        if (i12 < 0) {
            i12 = ~i12;
            i11 = 0;
            i10 = 0;
        } else {
            byte b10 = dataInput.readByte();
            if (b10 < 0) {
                int i14 = ~b10;
                i10 = 0;
                i13 = i14;
                i11 = 0;
            } else {
                byte b11 = dataInput.readByte();
                if (b11 < 0) {
                    i11 = ~b11;
                    i10 = 0;
                    i13 = b10;
                } else {
                    i10 = dataInput.readInt();
                    i13 = b10;
                    i11 = b11;
                }
            }
        }
        return P(i12, i13, i11, i10);
    }
}
