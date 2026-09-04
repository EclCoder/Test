package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.s;
import j$.time.l;
import j$.time.n;
import j$.time.temporal.p;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long[] f41844i = new long[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e[] f41845j = new e[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final LocalDateTime[] f41846k = new LocalDateTime[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b[] f41847l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f41848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset[] f41849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f41850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocalDateTime[] f41851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ZoneOffset[] f41852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e[] f41853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeZone f41854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient ConcurrentMap f41855h = new ConcurrentHashMap();

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.f41830b;
        if (bVar.s()) {
            if (localDateTime.F(localDateTime2)) {
                return bVar.f41831c;
            }
            if (!localDateTime.F(bVar.f41830b.X(bVar.f41832d.f41603b - bVar.f41831c.f41603b))) {
                return bVar.f41832d;
            }
        } else {
            if (!localDateTime.F(localDateTime2)) {
                return bVar.f41832d;
            }
            if (localDateTime.F(bVar.f41830b.X(bVar.f41832d.f41603b - bVar.f41831c.f41603b))) {
                return bVar.f41831c;
            }
        }
        return bVar;
    }

    public f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.f41848a = jArr;
        this.f41849b = zoneOffsetArr;
        this.f41850c = jArr2;
        this.f41852e = zoneOffsetArr2;
        this.f41853f = eVarArr;
        if (jArr2.length == 0) {
            this.f41851d = f41846k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 < jArr2.length) {
                int i11 = i10 + 1;
                b bVar = new b(jArr2[i10], zoneOffsetArr2[i10], zoneOffsetArr2[i11]);
                if (bVar.s()) {
                    arrayList.add(bVar.f41830b);
                    arrayList.add(bVar.f41830b.X(bVar.f41832d.f41603b - bVar.f41831c.f41603b));
                } else {
                    arrayList.add(bVar.f41830b.X(bVar.f41832d.f41603b - bVar.f41831c.f41603b));
                    arrayList.add(bVar.f41830b);
                }
                i10 = i11;
            }
            this.f41851d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f41854g = null;
    }

    public f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f41849b = zoneOffsetArr;
        long[] jArr = f41844i;
        this.f41848a = jArr;
        this.f41850c = jArr;
        this.f41851d = f41846k;
        this.f41852e = zoneOffsetArr;
        this.f41853f = f41845j;
        this.f41854g = null;
    }

    public f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {g(timeZone.getRawOffset())};
        this.f41849b = zoneOffsetArr;
        long[] jArr = f41844i;
        this.f41848a = jArr;
        this.f41850c = jArr;
        this.f41851d = f41846k;
        this.f41852e = zoneOffsetArr;
        this.f41853f = f41845j;
        this.f41854g = timeZone;
    }

    public static ZoneOffset g(int i10) {
        return ZoneOffset.Z(i10 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f41854g != null ? (byte) 100 : (byte) 1, this);
    }

    public static int c(long j10, ZoneOffset zoneOffset) {
        return j$.time.i.c0(Math.floorDiv(j10 + ((long) zoneOffset.f41603b), 86400)).f41751a;
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.f41854g;
        if (timeZone != null) {
            return g(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f41850c;
        if (jArr.length == 0) {
            return this.f41849b[0];
        }
        long j10 = instant.f41590a;
        if (this.f41853f.length > 0 && j10 > jArr[jArr.length - 1]) {
            ZoneOffset[] zoneOffsetArr = this.f41852e;
            b[] bVarArrB = b(c(j10, zoneOffsetArr[zoneOffsetArr.length - 1]));
            b bVar = null;
            for (int i10 = 0; i10 < bVarArrB.length; i10++) {
                bVar = bVarArrB[i10];
                if (j10 < bVar.f41829a) {
                    return bVar.f41831c;
                }
            }
            return bVar.f41832d;
        }
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.f41852e[iBinarySearch + 1];
    }

    public final List f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (!(objE instanceof b)) {
            return Collections.singletonList((ZoneOffset) objE);
        }
        b bVar = (b) objE;
        return bVar.s() ? Collections.EMPTY_LIST : j$.time.b.a(new Object[]{bVar.f41831c, bVar.f41832d});
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r8.s(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (r8.f41595b.d0() <= r0.f41595b.d0()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(j$.time.LocalDateTime r8) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.f.e(j$.time.LocalDateTime):java.lang.Object");
    }

    public final b[] b(int i10) {
        j$.time.i iVarA;
        b[] bVarArr = f41847l;
        Integer numValueOf = Integer.valueOf(i10);
        b[] bVarArr2 = (b[]) ((ConcurrentHashMap) this.f41855h).get(numValueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j10 = 1;
        int i11 = 0;
        int i12 = 1;
        if (this.f41854g != null) {
            if (i10 < 1800) {
                return bVarArr;
            }
            LocalDateTime localDateTime = LocalDateTime.f41592c;
            j$.time.i iVarB0 = j$.time.i.b0(i10 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.X(0);
            long jW = new LocalDateTime(iVarB0, l.f41760h[0]).w(this.f41849b[0]);
            long j11 = 1000;
            int offset = this.f41854g.getOffset(jW * 1000);
            long j12 = 31968000 + jW;
            while (jW < j12) {
                long j13 = jW + 7776000;
                long j14 = j11;
                if (offset != this.f41854g.getOffset(j13 * j14)) {
                    while (j13 - jW > j10) {
                        long jFloorDiv = Math.floorDiv(j13 + jW, 2L);
                        if (this.f41854g.getOffset(jFloorDiv * j14) == offset) {
                            jW = jFloorDiv;
                        } else {
                            j13 = jFloorDiv;
                        }
                        j10 = 1;
                    }
                    if (this.f41854g.getOffset(jW * j14) == offset) {
                        jW = j13;
                    }
                    ZoneOffset zoneOffsetG = g(offset);
                    int offset2 = this.f41854g.getOffset(jW * j14);
                    ZoneOffset zoneOffsetG2 = g(offset2);
                    if (c(jW, zoneOffsetG2) == i10) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(jW, zoneOffsetG, zoneOffsetG2);
                    }
                    offset = offset2;
                } else {
                    jW = j13;
                }
                j11 = j14;
                j10 = 1;
            }
            if (1916 <= i10 && i10 < 2100) {
                ((ConcurrentHashMap) this.f41855h).putIfAbsent(numValueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f41853f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i13 = 0;
        while (i13 < eVarArr.length) {
            e eVar = eVarArr[i13];
            byte b10 = eVar.f41836b;
            if (b10 < 0) {
                n nVar = eVar.f41835a;
                long j15 = i10;
                s.f41655c.getClass();
                int iA = nVar.A(s.X(j15)) + 1 + eVar.f41836b;
                j$.time.i iVar = j$.time.i.f41749d;
                j$.time.temporal.a.YEAR.X(j15);
                j$.time.temporal.a.DAY_OF_MONTH.X(iA);
                iVarA = j$.time.i.A(i10, nVar.getValue(), iA);
                j$.time.e eVar2 = eVar.f41837c;
                if (eVar2 != null) {
                    iVarA = iVarA.k(new p(eVar2.getValue(), i12));
                }
            } else {
                n nVar2 = eVar.f41835a;
                j$.time.i iVar2 = j$.time.i.f41749d;
                j$.time.temporal.a.YEAR.X(i10);
                j$.time.temporal.a.DAY_OF_MONTH.X(b10);
                iVarA = j$.time.i.A(i10, nVar2.getValue(), b10);
                j$.time.e eVar3 = eVar.f41837c;
                if (eVar3 != null) {
                    iVarA = iVarA.k(new p(eVar3.getValue(), i11));
                }
            }
            if (eVar.f41839e) {
                iVarA = iVarA.f0(1L);
            }
            LocalDateTime localDateTimeI = LocalDateTime.I(iVarA, eVar.f41838d);
            d dVar = eVar.f41840f;
            ZoneOffset zoneOffset = eVar.f41841g;
            ZoneOffset zoneOffset2 = eVar.f41842h;
            int i14 = c.f41833a[dVar.ordinal()];
            if (i14 == 1) {
                localDateTimeI = localDateTimeI.X(zoneOffset2.f41603b - ZoneOffset.UTC.f41603b);
            } else if (i14 == 2) {
                localDateTimeI = localDateTimeI.X(zoneOffset2.f41603b - zoneOffset.f41603b);
            }
            bVarArr3[i13] = new b(localDateTimeI, eVar.f41842h, eVar.f41843i);
            i13++;
            i11 = 0;
        }
        if (i10 < 2100) {
            ((ConcurrentHashMap) this.f41855h).putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.f41854g, fVar.f41854g) && Arrays.equals(this.f41848a, fVar.f41848a) && Arrays.equals(this.f41849b, fVar.f41849b) && Arrays.equals(this.f41850c, fVar.f41850c) && Arrays.equals(this.f41852e, fVar.f41852e) && Arrays.equals(this.f41853f, fVar.f41853f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f41854g) ^ Arrays.hashCode(this.f41848a)) ^ Arrays.hashCode(this.f41849b)) ^ Arrays.hashCode(this.f41850c)) ^ Arrays.hashCode(this.f41852e)) ^ Arrays.hashCode(this.f41853f);
    }

    public final String toString() {
        TimeZone timeZone = this.f41854g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        ZoneOffset[] zoneOffsetArr = this.f41849b;
        return "ZoneRules[currentStandardOffset=" + zoneOffsetArr[zoneOffsetArr.length - 1] + "]";
    }
}
