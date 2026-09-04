package jm;

import em.i2;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f42687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i2 f42688b;

    static {
        s sVar = new s();
        f42687a = sVar;
        e0.f("kotlinx.coroutines.fast.service.loader", true);
        f42688b = sVar.a();
    }

    private s() {
    }

    private final i2 a() {
        Object next;
        i2 i2VarE;
        try {
            List listB = am.j.B(am.j.e(ServiceLoader.load(r.class, r.class.getClassLoader()).iterator()));
            Iterator it = listB.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((r) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((r) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            r rVar = (r) next;
            if (rVar != null && (i2VarE = t.e(rVar, listB)) != null) {
                return i2VarE;
            }
            t.b(null, null, 3, null);
            return null;
        } catch (Throwable th2) {
            t.b(th2, null, 2, null);
            return null;
        }
    }
}
