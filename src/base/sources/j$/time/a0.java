package j$.time;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a0 implements j$.time.temporal.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41609a;

    public /* synthetic */ a0(int i10) {
        this.f41609a = i10;
    }

    @Override // j$.time.temporal.o
    public j$.time.temporal.m e(j$.time.temporal.m mVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return mVar.c(mVar.l(aVar).f41812d, aVar);
    }

    public Object k(j$.time.temporal.n nVar) {
        switch (this.f41609a) {
            case 0:
                if (nVar instanceof ZonedDateTime) {
                    return (ZonedDateTime) nVar;
                }
                try {
                    y yVarS = y.s(nVar);
                    j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
                    if (!nVar.h(aVar)) {
                        nVar = ZonedDateTime.A(LocalDateTime.I(i.F(nVar), l.F(nVar)), yVarS, null);
                    } else {
                        nVar = ZonedDateTime.s(nVar.i(aVar), nVar.g(j$.time.temporal.a.NANO_OF_SECOND), yVarS);
                    }
                    return nVar;
                } catch (c e10) {
                    throw new c("Unable to obtain ZonedDateTime from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName(), e10);
                }
            case 1:
                y yVar = (y) nVar.b(j$.time.temporal.s.f41802a);
                if (yVar == null || (yVar instanceof ZoneOffset)) {
                    return null;
                }
                return yVar;
            case 2:
            default:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_DAY;
                if (nVar.h(aVar2)) {
                    return l.V(nVar.i(aVar2));
                }
                return null;
            case 3:
                return (y) nVar.b(j$.time.temporal.s.f41802a);
            case 4:
                return (j$.time.chrono.l) nVar.b(j$.time.temporal.s.f41803b);
            case 5:
                return (j$.time.temporal.t) nVar.b(j$.time.temporal.s.f41804c);
            case 6:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.OFFSET_SECONDS;
                if (nVar.h(aVar3)) {
                    return ZoneOffset.Z(nVar.g(aVar3));
                }
                return null;
            case 7:
                y yVar2 = (y) nVar.b(j$.time.temporal.s.f41802a);
                return yVar2 != null ? yVar2 : (y) nVar.b(j$.time.temporal.s.f41805d);
            case 8:
                j$.time.temporal.a aVar4 = j$.time.temporal.a.EPOCH_DAY;
                if (nVar.h(aVar4)) {
                    return i.c0(nVar.i(aVar4));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f41609a) {
            case 3:
                return "ZoneId";
            case 4:
                return "Chronology";
            case 5:
                return "Precision";
            case 6:
                return "ZoneOffset";
            case 7:
                return "Zone";
            case 8:
                return "LocalDate";
            case 9:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
