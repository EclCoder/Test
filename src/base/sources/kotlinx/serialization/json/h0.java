package kotlinx.serialization.json;

import kotlin.jvm.internal.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f43680a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rm.f f43681b = rm.l.e("kotlinx.serialization.json.JsonPrimitive", rm.e.i.f51398a, new rm.f[0], null, 8, null);

    private h0() {
    }

    @Override // pm.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g0 deserialize(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        i iVarF = s.d(decoder).f();
        if (iVarF instanceof g0) {
            return (g0) iVarF;
        }
        throw um.g0.f(-1, "Unexpected JSON element, expected JsonPrimitive, had " + l0.b(iVarF.getClass()), iVarF.toString());
    }

    @Override // pm.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(sm.f encoder, g0 value) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(value, "value");
        s.h(encoder);
        if (value instanceof a0) {
            encoder.q(b0.f43632a, a0.INSTANCE);
        } else {
            encoder.q(x.f43689a, (w) value);
        }
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return f43681b;
    }
}
