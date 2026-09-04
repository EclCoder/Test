package xo;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
abstract class d implements oo.q, gp.f {
    public static c h(co.h hVar) {
        return i(hVar).d();
    }

    private static d i(co.h hVar) {
        if (d.class.isInstance(hVar)) {
            return (d) d.class.cast(hVar);
        }
        throw new IllegalStateException("Unexpected connection proxy class: " + hVar.getClass());
    }

    abstract c d();
}
