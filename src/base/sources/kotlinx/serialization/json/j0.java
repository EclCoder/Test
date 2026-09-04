package kotlinx.serialization.json;

import um.j1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j0 implements pm.d {
    private final pm.d tSerializer;

    public j0(pm.d tSerializer) {
        kotlin.jvm.internal.s.h(tSerializer, "tSerializer");
        this.tSerializer = tSerializer;
    }

    @Override // pm.c
    public final Object deserialize(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        h hVarD = s.d(decoder);
        return hVarD.c().d(this.tSerializer, transformDeserialize(hVarD.f()));
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    @Override // pm.l
    public final void serialize(sm.f encoder, Object value) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(value, "value");
        t tVarE = s.e(encoder);
        tVarE.B(transformSerialize(j1.d(tVarE.c(), value, this.tSerializer)));
    }

    protected abstract i transformDeserialize(i iVar);

    protected i transformSerialize(i element) {
        kotlin.jvm.internal.s.h(element, "element");
        return element;
    }
}
