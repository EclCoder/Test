package sm;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface e {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public static Object a(e eVar, pm.c deserializer) {
            s.h(deserializer, "deserializer");
            return deserializer.deserialize(eVar);
        }
    }

    String C();

    Object D(pm.c cVar);

    boolean E();

    byte F();

    int G(rm.f fVar);

    vm.b a();

    c b(rm.f fVar);

    int g();

    Void j();

    long k();

    short p();

    float q();

    e r(rm.f fVar);

    double t();

    boolean u();

    char v();
}
