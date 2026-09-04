package sm;

import kotlin.jvm.internal.s;
import pm.l;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface f {
    void D(int i10);

    void E(rm.f fVar, int i10);

    void G(String str);

    vm.b a();

    d b(rm.f fVar);

    void g(double d10);

    void h(byte b10);

    f m(rm.f fVar);

    void o(long j10);

    void q(l lVar, Object obj);

    d r(rm.f fVar, int i10);

    void s();

    void t(short s10);

    void u(boolean z10);

    void x(float f10);

    void y(char c10);

    void z();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public static d a(f fVar, rm.f descriptor, int i10) {
            s.h(descriptor, "descriptor");
            return fVar.b(descriptor);
        }

        public static void c(f fVar, l serializer, Object obj) {
            s.h(serializer, "serializer");
            if (serializer.getDescriptor().b()) {
                fVar.q(serializer, obj);
            } else if (obj == null) {
                fVar.s();
            } else {
                fVar.z();
                fVar.q(serializer, obj);
            }
        }

        public static void d(f fVar, l serializer, Object obj) {
            s.h(serializer, "serializer");
            serializer.serialize(fVar, obj);
        }

        public static void b(f fVar) {
        }
    }
}
