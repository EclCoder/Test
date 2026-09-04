package e6;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f37163a = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Class f37164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class f37165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final e f37166c;

        a(Class cls, Class cls2, e eVar) {
            this.f37164a = cls;
            this.f37165b = cls2;
            this.f37166c = eVar;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f37164a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f37165b);
        }
    }

    public synchronized e a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a aVar : this.f37163a) {
            if (aVar.a(cls, cls2)) {
                return aVar.f37166c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f37163a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f37165b)) {
                arrayList.add(aVar.f37165b);
            }
        }
        return arrayList;
    }

    public synchronized void c(Class cls, Class cls2, e eVar) {
        this.f37163a.add(new a(cls, cls2, eVar));
    }
}
