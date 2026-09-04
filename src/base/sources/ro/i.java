package ro;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f51432a = new ConcurrentHashMap();

    public final e a(String str) {
        ip.a.h(str, "Scheme name");
        return (e) this.f51432a.get(str);
    }

    public final e b(co.l lVar) {
        ip.a.h(lVar, "Host");
        return c(lVar.k());
    }

    public final e c(String str) {
        e eVarA = a(str);
        if (eVarA != null) {
            return eVarA;
        }
        throw new IllegalStateException("Scheme '" + str + "' not registered.");
    }

    public final e d(e eVar) {
        ip.a.h(eVar, "Scheme");
        return (e) this.f51432a.put(eVar.b(), eVar);
    }
}
