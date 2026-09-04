package mk;

import kk.n;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f46471a = new b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends a {
        @Override // mk.a
        public void a(n nVar, Object obj, c cVar) {
            jk.b.b(nVar, "spanContext");
            jk.b.b(obj, "carrier");
            jk.b.b(cVar, "setter");
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class c {
        public abstract void put(Object obj, String str, String str2);
    }

    public abstract void a(n nVar, Object obj, c cVar);
}
