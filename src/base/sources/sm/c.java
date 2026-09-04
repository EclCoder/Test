package sm;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface c {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public static int a(c cVar, rm.f descriptor) {
            s.h(descriptor, "descriptor");
            return -1;
        }

        public static boolean b(c cVar) {
            return false;
        }

        public static /* synthetic */ Object c(c cVar, rm.f fVar, int i10, pm.c cVar2, Object obj, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if ((i11 & 8) != 0) {
                obj = null;
            }
            return cVar.n(fVar, i10, cVar2, obj);
        }
    }

    float A(rm.f fVar, int i10);

    char B(rm.f fVar, int i10);

    String H(rm.f fVar, int i10);

    vm.b a();

    void d(rm.f fVar);

    Object e(rm.f fVar, int i10, pm.c cVar, Object obj);

    short h(rm.f fVar, int i10);

    double i(rm.f fVar, int i10);

    boolean l();

    int m(rm.f fVar);

    Object n(rm.f fVar, int i10, pm.c cVar, Object obj);

    int o(rm.f fVar);

    int s(rm.f fVar, int i10);

    byte w(rm.f fVar, int i10);

    boolean x(rm.f fVar, int i10);

    e y(rm.f fVar, int i10);

    long z(rm.f fVar, int i10);
}
