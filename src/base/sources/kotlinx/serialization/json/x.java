package kotlinx.serialization.json;

import kotlin.jvm.internal.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class x implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f43689a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rm.f f43690b = rm.l.b("kotlinx.serialization.json.JsonLiteral", rm.e.i.f51398a);

    private x() {
    }

    @Override // pm.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public w deserialize(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        i iVarF = s.d(decoder).f();
        if (iVarF instanceof w) {
            return (w) iVarF;
        }
        throw um.g0.f(-1, "Unexpected JSON element, expected JsonLiteral, had " + l0.b(iVarF.getClass()), iVarF.toString());
    }

    @Override // pm.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(sm.f encoder, w value) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(value, "value");
        s.h(encoder);
        if (value.g()) {
            encoder.G(value.a());
            return;
        }
        if (value.f() != null) {
            encoder.m(value.f()).G(value.a());
            return;
        }
        Long lS = bm.r.s(value.a());
        if (lS != null) {
            encoder.o(lS.longValue());
            return;
        }
        fl.b0 b0VarI = bm.l0.i(value.a());
        if (b0VarI != null) {
            encoder.m(qm.a.y(fl.b0.f38735b).getDescriptor()).o(b0VarI.f());
            return;
        }
        Double dO = bm.r.o(value.a());
        if (dO != null) {
            encoder.g(dO.doubleValue());
            return;
        }
        Boolean boolU0 = bm.r.U0(value.a());
        if (boolU0 != null) {
            encoder.u(boolU0.booleanValue());
        } else {
            encoder.G(value.a());
        }
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return f43690b;
    }
}
