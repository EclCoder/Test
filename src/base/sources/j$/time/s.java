package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements j$.time.temporal.q, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f41776d = new s(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41779c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        b.a(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    public static s a(int i10, int i11, int i12) {
        if ((i10 | i11 | i12) == 0) {
            return f41776d;
        }
        return new s(i10, i11, i12);
    }

    public s(int i10, int i11, int i12) {
        this.f41777a = i10;
        this.f41778b = i11;
        this.f41779c = i12;
    }

    @Override // j$.time.temporal.q
    public final j$.time.temporal.m s(j$.time.temporal.m mVar) {
        j$.time.chrono.l lVar = (j$.time.chrono.l) mVar.b(j$.time.temporal.s.f41803b);
        if (lVar == null || j$.time.chrono.s.f41655c.equals(lVar)) {
            int i10 = this.f41778b;
            if (i10 != 0) {
                long j10 = (((long) this.f41777a) * 12) + ((long) i10);
                if (j10 != 0) {
                    mVar = mVar.d(j10, j$.time.temporal.b.MONTHS);
                }
            } else {
                int i11 = this.f41777a;
                if (i11 != 0) {
                    mVar = mVar.d(i11, j$.time.temporal.b.YEARS);
                }
            }
            int i12 = this.f41779c;
            return i12 != 0 ? mVar.d(i12, j$.time.temporal.b.DAYS) : mVar;
        }
        throw new c("Chronology mismatch, expected: ISO, actual: " + lVar.q());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f41777a == sVar.f41777a && this.f41778b == sVar.f41778b && this.f41779c == sVar.f41779c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f41779c, 16) + Integer.rotateLeft(this.f41778b, 8) + this.f41777a;
    }

    public final String toString() {
        if (this == f41776d) {
            return "P0D";
        }
        StringBuilder sb2 = new StringBuilder("P");
        int i10 = this.f41777a;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('Y');
        }
        int i11 = this.f41778b;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        int i12 = this.f41779c;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new t((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
