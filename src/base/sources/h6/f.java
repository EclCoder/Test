package h6;

import java.util.ArrayList;
import java.util.List;
import r5.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f40255a = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f40256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final j f40257b;

        a(Class cls, j jVar) {
            this.f40256a = cls;
            this.f40257b = jVar;
        }

        boolean a(Class cls) {
            return this.f40256a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, j jVar) {
        this.f40255a.add(new a(cls, jVar));
    }

    public synchronized j b(Class cls) {
        int size = this.f40255a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) this.f40255a.get(i10);
            if (aVar.a(cls)) {
                return aVar.f40257b;
            }
        }
        return null;
    }
}
