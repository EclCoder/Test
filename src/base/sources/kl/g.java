package kl;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface g extends j.b {

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public static final b f43529z2 = b.f43530a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public static j.b a(g gVar, j.c key) {
            j.b bVarB;
            s.h(key, "key");
            if (!(key instanceof kl.b)) {
                if (g.f43529z2 != key) {
                    return null;
                }
                s.f(gVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return gVar;
            }
            kl.b bVar = (kl.b) key;
            if (!bVar.a(gVar.getKey()) || (bVarB = bVar.b(gVar)) == null) {
                return null;
            }
            return bVarB;
        }

        public static j b(g gVar, j.c key) {
            s.h(key, "key");
            if (!(key instanceof kl.b)) {
                return g.f43529z2 == key ? k.f43531a : gVar;
            }
            kl.b bVar = (kl.b) key;
            return (!bVar.a(gVar.getKey()) || bVar.b(gVar) == null) ? gVar : k.f43531a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements j.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f43530a = new b();

        private b() {
        }
    }

    void d0(f fVar);

    f g0(f fVar);
}
