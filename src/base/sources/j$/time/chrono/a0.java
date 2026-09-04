package j$.time.chrono;

import j$.time.Instant;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f41613c = new a0();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // j$.time.chrono.l
    public final String q() {
        return "Minguo";
    }

    @Override // j$.time.chrono.l
    public final m B(int i10) {
        if (i10 == 0) {
            return d0.BEFORE_ROC;
        }
        if (i10 == 1) {
            return d0.ROC;
        }
        throw new j$.time.c("Invalid era: " + i10);
    }

    @Override // j$.time.chrono.l
    public final String u() {
        return "roc";
    }

    @Override // j$.time.chrono.l
    public final b Q(int i10, int i11, int i12) {
        return new c0(j$.time.i.b0(i10 + 1911, i11, i12));
    }

    @Override // j$.time.chrono.l
    public final b v(int i10, int i11) {
        return new c0(j$.time.i.d0(i10 + 1911, i11));
    }

    @Override // j$.time.chrono.l
    public final b p(long j10) {
        return new c0(j$.time.i.c0(j10));
    }

    @Override // j$.time.chrono.l
    public final b M() {
        return new c0(j$.time.i.F(j$.time.i.a0(j$.time.b.b())));
    }

    @Override // j$.time.chrono.l
    public final b G(j$.time.temporal.n nVar) {
        if (nVar instanceof c0) {
            return (c0) nVar;
        }
        return new c0(j$.time.i.F(nVar));
    }

    @Override // j$.time.chrono.l
    public final int C(m mVar, int i10) {
        if (mVar instanceof d0) {
            return mVar == d0.ROC ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.l
    public final List z() {
        return j$.time.b.a(d0.values());
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.v y(j$.time.temporal.a aVar) {
        int i10 = z.f41669a[aVar.ordinal()];
        if (i10 == 1) {
            j$.time.temporal.v vVar = j$.time.temporal.a.PROLEPTIC_MONTH.f41784b;
            return j$.time.temporal.v.f(vVar.f41809a - 22932, vVar.f41812d - 22932);
        }
        if (i10 == 2) {
            j$.time.temporal.v vVar2 = j$.time.temporal.a.YEAR.f41784b;
            return j$.time.temporal.v.g(vVar2.f41812d - 1911, (-vVar2.f41809a) + 1912);
        }
        if (i10 != 3) {
            return aVar.f41784b;
        }
        j$.time.temporal.v vVar3 = j$.time.temporal.a.YEAR.f41784b;
        return j$.time.temporal.v.f(vVar3.f41809a - 1911, vVar3.f41812d - 1911);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.l
    public final b S(Map map, j$.time.format.w wVar) {
        return (c0) super.S(map, wVar);
    }

    private a0() {
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
