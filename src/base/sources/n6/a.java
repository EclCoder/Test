package n6;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f46859a = new C0723a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements d {
        b() {
        }

        @Override // n6.a.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements g {
        c() {
        }

        @Override // n6.a.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List list) {
            list.clear();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        Object a();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class e implements m0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f46860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f46861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final m0.d f46862c;

        e(m0.d dVar, d dVar2, g gVar) {
            this.f46862c = dVar;
            this.f46860a = dVar2;
            this.f46861b = gVar;
        }

        @Override // m0.d
        public boolean a(Object obj) {
            if (obj instanceof f) {
                ((f) obj).d().b(true);
            }
            this.f46861b.a(obj);
            return this.f46862c.a(obj);
        }

        @Override // m0.d
        public Object b() {
            Object objB = this.f46862c.b();
            if (objB == null) {
                objB = this.f46860a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + objB.getClass());
                }
            }
            if (objB instanceof f) {
                ((f) objB).d().b(false);
            }
            return objB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface f {
        n6.c d();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface g {
        void a(Object obj);
    }

    private static m0.d a(m0.d dVar, d dVar2) {
        return b(dVar, dVar2, c());
    }

    private static m0.d b(m0.d dVar, d dVar2, g gVar) {
        return new e(dVar, dVar2, gVar);
    }

    private static g c() {
        return f46859a;
    }

    public static m0.d d(int i10, d dVar) {
        return a(new m0.f(i10), dVar);
    }

    public static m0.d e() {
        return f(20);
    }

    public static m0.d f(int i10) {
        return b(new m0.f(i10), new b(), new c());
    }

    /* JADX INFO: renamed from: n6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0723a implements g {
        C0723a() {
        }

        @Override // n6.a.g
        public void a(Object obj) {
        }
    }
}
