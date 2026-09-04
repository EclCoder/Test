package tm;

import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements pm.d {
    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(sm.c cVar) {
        return sm.c.a.c(cVar, getDescriptor(), 1, pm.i.a(this, cVar, cVar.H(getDescriptor(), 0)), null, 8, null);
    }

    public pm.c c(sm.c decoder, String str) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        return decoder.a().e(e(), str);
    }

    public pm.l d(sm.f encoder, Object value) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(value, "value");
        return encoder.a().f(e(), value);
    }

    @Override // pm.c
    public final Object deserialize(sm.e decoder) {
        Object objB;
        kotlin.jvm.internal.s.h(decoder, "decoder");
        rm.f descriptor = getDescriptor();
        sm.c cVarB = decoder.b(descriptor);
        kotlin.jvm.internal.k0 k0Var = new kotlin.jvm.internal.k0();
        if (cVarB.l()) {
            objB = b(cVarB);
        } else {
            Object objC = null;
            while (true) {
                int iO = cVarB.o(getDescriptor());
                if (iO == -1) {
                    if (objC != null) {
                        kotlin.jvm.internal.s.f(objC, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                        objB = objC;
                        break;
                    }
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) k0Var.f43597a)).toString());
                }
                if (iO == 0) {
                    k0Var.f43597a = cVarB.H(getDescriptor(), iO);
                } else {
                    if (iO != 1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid index in polymorphic deserialization of ");
                        String str = (String) k0Var.f43597a;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb2.append(str);
                        sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb2.append(iO);
                        throw new SerializationException(sb2.toString());
                    }
                    Object obj = k0Var.f43597a;
                    if (obj == null) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                    k0Var.f43597a = obj;
                    objC = sm.c.a.c(cVarB, getDescriptor(), iO, pm.i.a(this, cVarB, (String) obj), null, 8, null);
                }
            }
        }
        cVarB.d(descriptor);
        return objB;
    }

    public abstract zl.c e();

    @Override // pm.l
    public final void serialize(sm.f encoder, Object value) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(value, "value");
        pm.l lVarB = pm.i.b(this, encoder, value);
        rm.f descriptor = getDescriptor();
        sm.d dVarB = encoder.b(descriptor);
        dVarB.F(getDescriptor(), 0, lVarB.getDescriptor().i());
        rm.f descriptor2 = getDescriptor();
        kotlin.jvm.internal.s.f(lVarB, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        dVarB.A(descriptor2, 1, lVarB, value);
        dVarB.d(descriptor);
    }
}
