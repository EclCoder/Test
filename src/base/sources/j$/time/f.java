package j$.time;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements j$.time.temporal.q, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f41672c = new f(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41674b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        int iCompare = Long.compare(this.f41673a, fVar.f41673a);
        return iCompare != 0 ? iCompare : this.f41674b - fVar.f41674b;
    }

    static {
        BigInteger.valueOf(C.NANOS_PER_SECOND);
    }

    public static f F(long j10) {
        long j11 = j10 / C.NANOS_PER_SECOND;
        int i10 = (int) (j10 % C.NANOS_PER_SECOND);
        if (i10 < 0) {
            i10 = (int) (((long) i10) + C.NANOS_PER_SECOND);
            j11--;
        }
        return A(j11, i10);
    }

    public static f A(long j10, int i10) {
        if ((((long) i10) | j10) == 0) {
            return f41672c;
        }
        return new f(j10, i10);
    }

    public f(long j10, int i10) {
        this.f41673a = j10;
        this.f41674b = i10;
    }

    @Override // j$.time.temporal.q
    public final j$.time.temporal.m s(j$.time.temporal.m mVar) {
        long j10 = this.f41673a;
        if (j10 != 0) {
            mVar = mVar.d(j10, j$.time.temporal.b.SECONDS);
        }
        int i10 = this.f41674b;
        return i10 != 0 ? mVar.d(i10, j$.time.temporal.b.NANOS) : mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f41673a == fVar.f41673a && this.f41674b == fVar.f41674b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f41673a;
        return (this.f41674b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        if (this == f41672c) {
            return "PT0S";
        }
        long j10 = this.f41673a;
        if (j10 < 0 && this.f41674b > 0) {
            j10++;
        }
        long j11 = j10 / 3600;
        int i10 = (int) ((j10 % 3600) / 60);
        int i11 = (int) (j10 % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j11 != 0) {
            sb2.append(j11);
            sb2.append('H');
        }
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        if (i11 == 0 && this.f41674b == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (this.f41673a < 0 && this.f41674b > 0 && i11 == 0) {
            sb2.append("-0");
        } else {
            sb2.append(i11);
        }
        if (this.f41674b > 0) {
            int length = sb2.length();
            if (this.f41673a < 0) {
                sb2.append(2000000000 - ((long) this.f41674b));
            } else {
                sb2.append(((long) this.f41674b) + C.NANOS_PER_SECOND);
            }
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }

    private Object writeReplace() {
        return new t((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
