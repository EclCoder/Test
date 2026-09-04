package gk;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class d extends b.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f39309a = Logger.getLogger(d.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final ThreadLocal f39310b = new ThreadLocal();

    d() {
    }

    @Override // gk.b.f
    public b a() {
        b bVar = (b) f39310b.get();
        return bVar == null ? b.f39293f : bVar;
    }

    @Override // gk.b.f
    public void b(b bVar, b bVar2) {
        if (a() != bVar) {
            f39309a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (bVar2 != b.f39293f) {
            f39310b.set(bVar2);
        } else {
            f39310b.set(null);
        }
    }

    @Override // gk.b.f
    public b c(b bVar) {
        b bVarA = a();
        f39310b.set(bVar);
        return bVarA;
    }
}
