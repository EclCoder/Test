package kotlinx.serialization.json;

import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f43632a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rm.f f43633b = rm.l.e("kotlinx.serialization.json.JsonNull", rm.m.b.f51420a, new rm.f[0], null, 8, null);

    private b0() {
    }

    @Override // pm.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a0 deserialize(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        s.g(decoder);
        if (decoder.E()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        decoder.j();
        return a0.INSTANCE;
    }

    @Override // pm.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(sm.f encoder, a0 value) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(value, "value");
        s.h(encoder);
        encoder.s();
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return f43633b;
    }
}
