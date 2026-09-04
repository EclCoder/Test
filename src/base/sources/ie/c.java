package ie;

import dd.q;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f41328b;

    c(Set set, d dVar) {
        this.f41327a = c(set);
        this.f41328b = dVar;
    }

    public static /* synthetic */ i a(dd.d dVar) {
        return new c(dVar.b(f.class), d.a());
    }

    public static dd.c b() {
        return dd.c.e(i.class).b(q.m(f.class)).e(new dd.g() { // from class: ie.b
            @Override // dd.g
            public final Object a(dd.d dVar) {
                return c.a(dVar);
            }
        }).c();
    }

    private static String c(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            sb2.append(fVar.b());
            sb2.append('/');
            sb2.append(fVar.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // ie.i
    public String getUserAgent() {
        if (this.f41328b.b().isEmpty()) {
            return this.f41327a;
        }
        return this.f41327a + ' ' + c(this.f41328b.b());
    }
}
