package j$.time.format;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.n f41728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTimeFormatter f41729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41730c;

    public r(j$.time.temporal.n nVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.l lVar = dateTimeFormatter.f41680e;
        if (lVar != null) {
            j$.time.chrono.l lVar2 = (j$.time.chrono.l) nVar.b(j$.time.temporal.s.f41803b);
            j$.time.y yVar = (j$.time.y) nVar.b(j$.time.temporal.s.f41802a);
            j$.time.chrono.b bVarG = null;
            lVar = Objects.equals(lVar, lVar2) ? null : lVar;
            if (lVar != null) {
                j$.time.chrono.l lVar3 = lVar != null ? lVar : lVar2;
                if (lVar != null) {
                    if (nVar.h(j$.time.temporal.a.EPOCH_DAY)) {
                        bVarG = lVar3.G(nVar);
                    } else if (lVar != j$.time.chrono.s.f41655c || lVar2 != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.isDateBased() && nVar.h(aVar)) {
                                throw new j$.time.c("Unable to apply override chronology '" + lVar + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + nVar);
                            }
                        }
                    }
                }
                nVar = new q(bVarG, nVar, lVar3, yVar);
            }
        }
        this.f41728a = nVar;
        this.f41729b = dateTimeFormatter;
    }

    public final Long a(j$.time.temporal.r rVar) {
        int i10 = this.f41730c;
        j$.time.temporal.n nVar = this.f41728a;
        if (i10 <= 0 || nVar.h(rVar)) {
            return Long.valueOf(nVar.i(rVar));
        }
        return null;
    }

    public final String toString() {
        return this.f41728a.toString();
    }
}
