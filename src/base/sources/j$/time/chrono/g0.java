package j$.time.chrono;

import j$.time.Instant;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f41624c = new g0();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // j$.time.chrono.l
    public final m B(int i10) {
        if (i10 == 0) {
            return j0.BEFORE_BE;
        }
        if (i10 == 1) {
            return j0.BE;
        }
        throw new j$.time.c("Invalid era: " + i10);
    }

    @Override // j$.time.chrono.l
    public final String q() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.l
    public final String u() {
        return "buddhist";
    }

    @Override // j$.time.chrono.l
    public final b Q(int i10, int i11, int i12) {
        return new i0(j$.time.i.b0(i10 - 543, i11, i12));
    }

    @Override // j$.time.chrono.l
    public final b v(int i10, int i11) {
        return new i0(j$.time.i.d0(i10 - 543, i11));
    }

    @Override // j$.time.chrono.l
    public final b p(long j10) {
        return new i0(j$.time.i.c0(j10));
    }

    @Override // j$.time.chrono.l
    public final b M() {
        return new i0(j$.time.i.F(j$.time.i.a0(j$.time.b.b())));
    }

    @Override // j$.time.chrono.l
    public final b G(j$.time.temporal.n nVar) {
        if (nVar instanceof i0) {
            return (i0) nVar;
        }
        return new i0(j$.time.i.F(nVar));
    }

    @Override // j$.time.chrono.l
    public final int C(m mVar, int i10) {
        if (mVar instanceof j0) {
            return mVar == j0.BE ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    private g0() {
    }

    @Override // j$.time.chrono.l
    public final List z() {
        return j$.time.b.a(j0.values());
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.v y(j$.time.temporal.a aVar) {
        int i10 = f0.f41621a[aVar.ordinal()];
        if (i10 == 1) {
            j$.time.temporal.v vVar = j$.time.temporal.a.PROLEPTIC_MONTH.f41784b;
            return j$.time.temporal.v.f(vVar.f41809a + 6516, vVar.f41812d + 6516);
        }
        if (i10 == 2) {
            j$.time.temporal.v vVar2 = j$.time.temporal.a.YEAR.f41784b;
            return j$.time.temporal.v.g((-(vVar2.f41809a + 543)) + 1, vVar2.f41812d + 543);
        }
        if (i10 != 3) {
            return aVar.f41784b;
        }
        j$.time.temporal.v vVar3 = j$.time.temporal.a.YEAR.f41784b;
        return j$.time.temporal.v.f(vVar3.f41809a + 543, vVar3.f41812d + 543);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.l
    public final b S(Map map, j$.time.format.w wVar) {
        return (i0) super.S(map, wVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.l
    public final ChronoZonedDateTime T(Instant instant, j$.time.y yVar) {
        return k.F(this, instant, yVar);
    }

    public Object writeReplace() {
        return new e0((byte) 1, this);
    }
}
