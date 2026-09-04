package h6;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f40241a = new ArrayList();

    /* JADX INFO: renamed from: h6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0603a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f40242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final r5.d f40243b;

        C0603a(Class cls, r5.d dVar) {
            this.f40242a = cls;
            this.f40243b = dVar;
        }

        boolean a(Class cls) {
            return this.f40242a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, r5.d dVar) {
        this.f40241a.add(new C0603a(cls, dVar));
    }

    public synchronized r5.d b(Class cls) {
        for (C0603a c0603a : this.f40241a) {
            if (c0603a.a(cls)) {
                return c0603a.f40243b;
            }
        }
        return null;
    }
}
