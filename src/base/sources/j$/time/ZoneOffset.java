package j$.time;

import com.mbridge.msdk.MBridgeConstans;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ZoneOffset extends y implements j$.time.temporal.n, j$.time.temporal.o, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient String f41604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentMap f41599d = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentMap f41600e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = Z(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ZoneOffset f41601f = Z(-64800);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ZoneOffset f41602g = Z(64800);

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f41603b - this.f41603b;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    public static ZoneOffset X(String str) {
        int iA0;
        int iA1;
        int iA2;
        char cCharAt;
        Objects.requireNonNull(str, "offsetId");
        ZoneOffset zoneOffset = (ZoneOffset) ((ConcurrentHashMap) f41600e).get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + MBridgeConstans.ENDCARD_URL_TYPE_PL + str.charAt(1);
        } else {
            if (length != 3) {
                if (length == 5) {
                    iA0 = a0(str, 1, false);
                    iA1 = a0(str, 3, false);
                } else if (length == 6) {
                    iA0 = a0(str, 1, false);
                    iA1 = a0(str, 4, true);
                } else if (length == 7) {
                    iA0 = a0(str, 1, false);
                    iA1 = a0(str, 3, false);
                    iA2 = a0(str, 5, false);
                } else if (length == 9) {
                    iA0 = a0(str, 1, false);
                    iA1 = a0(str, 4, true);
                    iA2 = a0(str, 7, true);
                } else {
                    throw new c("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                }
                iA2 = 0;
            }
            cCharAt = str.charAt(0);
            if (cCharAt == '+' && cCharAt != '-') {
                throw new c("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
            }
            if (cCharAt == '-') {
                return Y(-iA0, -iA1, -iA2);
            }
            return Y(iA0, iA1, iA2);
        }
        iA0 = a0(str, 1, false);
        iA1 = 0;
        iA2 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt == '+') {
        }
        if (cCharAt == '-') {
            return Y(-iA0, -iA1, -iA2);
        }
        return Y(iA0, iA1, iA2);
    }

    @Override // j$.time.y
    public final j$.time.zone.f A() {
        return new j$.time.zone.f(this);
    }

    public static int a0(CharSequence charSequence, int i10, boolean z10) {
        if (z10) {
            String str = (String) charSequence;
            if (str.charAt(i10 - 1) != ':') {
                throw new c("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
            }
        }
        String str2 = (String) charSequence;
        char cCharAt = str2.charAt(i10);
        char cCharAt2 = str2.charAt(i10 + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new c("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str2));
    }

    public static ZoneOffset Y(int i10, int i11, int i12) {
        if (i10 < -18 || i10 > 18) {
            throw new c("Zone offset hours not in valid range: value " + i10 + " is not in the range -18 to 18");
        }
        if (i10 > 0) {
            if (i11 < 0 || i12 < 0) {
                throw new c("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i10 < 0) {
            if (i11 > 0 || i12 > 0) {
                throw new c("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i11 > 0 && i12 < 0) || (i11 < 0 && i12 > 0)) {
            throw new c("Zone offset minutes and seconds must have the same sign");
        }
        if (i11 < -59 || i11 > 59) {
            throw new c("Zone offset minutes not in valid range: value " + i11 + " is not in the range -59 to 59");
        }
        if (i12 < -59 || i12 > 59) {
            throw new c("Zone offset seconds not in valid range: value " + i12 + " is not in the range -59 to 59");
        }
        if (Math.abs(i10) == 18 && (i11 | i12) != 0) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
        return Z((i11 * 60) + (i10 * 3600) + i12);
    }

    public static ZoneOffset Z(int i10) {
        if (i10 < -64800 || i10 > 64800) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i10 % 900 == 0) {
            Integer numValueOf = Integer.valueOf(i10);
            ConcurrentMap concurrentMap = f41599d;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentMap.get(numValueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentMap.putIfAbsent(numValueOf, new ZoneOffset(i10));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentMap.get(numValueOf);
            f41600e.putIfAbsent(zoneOffset2.f41604c, zoneOffset2);
            return zoneOffset2;
        }
        return new ZoneOffset(i10);
    }

    public ZoneOffset(int i10) {
        String string;
        this.f41603b = i10;
        if (i10 == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i10);
            StringBuilder sb2 = new StringBuilder();
            int i11 = iAbs / 3600;
            int i12 = (iAbs / 60) % 60;
            sb2.append(i10 < 0 ? "-" : "+");
            sb2.append(i11 < 10 ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "");
            sb2.append(i11);
            sb2.append(i12 < 10 ? ":0" : ":");
            sb2.append(i12);
            int i13 = iAbs % 60;
            if (i13 != 0) {
                sb2.append(i13 < 10 ? ":0" : ":");
                sb2.append(i13);
            }
            string = sb2.toString();
        }
        this.f41604c = string;
    }

    @Override // j$.time.y
    public final String q() {
        return this.f41604c;
    }

    @Override // j$.time.temporal.n
    public final boolean h(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return rVar == j$.time.temporal.a.OFFSET_SECONDS;
        }
        return rVar != null && rVar.s(this);
    }

    @Override // j$.time.temporal.n
    public final int g(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f41603b;
        }
        if (rVar == null) {
            return super.l(rVar).a(i(rVar), rVar);
        }
        throw new j$.time.temporal.u(d.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.n
    public final long i(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f41603b;
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.u(d.a("Unsupported field: ", rVar));
        }
        return rVar.P(this);
    }

    @Override // j$.time.temporal.n
    public final Object b(a0 a0Var) {
        return (a0Var == j$.time.temporal.s.f41805d || a0Var == j$.time.temporal.s.f41806e) ? this : super.b(a0Var);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m e(j$.time.temporal.m mVar) {
        return mVar.c(this.f41603b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.y
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZoneOffset) && this.f41603b == ((ZoneOffset) obj).f41603b;
    }

    @Override // j$.time.y
    public final int hashCode() {
        return this.f41603b;
    }

    @Override // j$.time.y
    public final String toString() {
        return this.f41604c;
    }

    private Object writeReplace() {
        return new t((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.y
    public final void V(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        c0(dataOutput);
    }

    public final void c0(DataOutput dataOutput) throws IOException {
        int i10 = this.f41603b;
        int i11 = i10 % 900 == 0 ? i10 / 900 : 127;
        dataOutput.writeByte(i11);
        if (i11 == 127) {
            dataOutput.writeInt(i10);
        }
    }

    public static ZoneOffset b0(DataInput dataInput) throws IOException {
        byte b10 = dataInput.readByte();
        return b10 == 127 ? Z(dataInput.readInt()) : Z(b10 * 900);
    }
}
