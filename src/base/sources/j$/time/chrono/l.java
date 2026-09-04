package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public interface l extends Comparable {
    m B(int i10);

    int C(m mVar, int i10);

    b G(j$.time.temporal.n nVar);

    b M();

    b Q(int i10, int i11, int i12);

    b S(Map map, j$.time.format.w wVar);

    ChronoZonedDateTime T(Instant instant, j$.time.y yVar);

    boolean equals(Object obj);

    int hashCode();

    b p(long j10);

    String q();

    String toString();

    String u();

    b v(int i10, int i11);

    j$.time.temporal.v y(j$.time.temporal.a aVar);

    List z();

    static l r(j$.time.temporal.n nVar) {
        Objects.requireNonNull(nVar, "temporal");
        l lVar = (l) nVar.b(j$.time.temporal.s.f41803b);
        s sVar = s.f41655c;
        if (lVar != null) {
            return lVar;
        }
        Objects.requireNonNull(sVar, "defaultObj");
        return sVar;
    }

    static l of(String str) {
        ConcurrentHashMap concurrentHashMap = a.f41611a;
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = a.f41611a;
            l lVar = (l) concurrentHashMap2.get(str);
            if (lVar == null) {
                lVar = (l) a.f41612b.get(str);
            }
            if (lVar != null) {
                return lVar;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                for (l lVar2 : ServiceLoader.load(l.class)) {
                    if (str.equals(lVar2.q()) || str.equals(lVar2.u())) {
                        return lVar2;
                    }
                }
                throw new j$.time.c("Unknown chronology: ".concat(str));
            }
            o oVar = o.f41639l;
            oVar.getClass();
            a.A(oVar, "Hijrah-umalqura");
            v vVar = v.f41658c;
            vVar.getClass();
            a.A(vVar, "Japanese");
            a0 a0Var = a0.f41613c;
            a0Var.getClass();
            a.A(a0Var, "Minguo");
            g0 g0Var = g0.f41624c;
            g0Var.getClass();
            a.A(g0Var, "ThaiBuddhist");
            try {
                for (a aVar : Arrays.asList(new a[0])) {
                    if (!aVar.q().equals("ISO")) {
                        a.A(aVar, aVar.q());
                    }
                }
                s sVar = s.f41655c;
                sVar.getClass();
                a.A(sVar, "ISO");
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        }
    }

    default e H(LocalDateTime localDateTime) {
        try {
            return G(localDateTime).L(j$.time.l.F(localDateTime));
        } catch (j$.time.c e10) {
            throw new j$.time.c("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e10);
        }
    }
}
