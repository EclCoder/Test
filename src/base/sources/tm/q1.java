package tm;

import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class q1 implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q1 f53564a = new q1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rm.f f53565b = p1.f53554a;

    private q1() {
    }

    @Override // pm.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void deserialize(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // pm.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(sm.f encoder, Void value) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(value, "value");
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return f53565b;
    }
}
