package tm;

import kotlin.jvm.functions.Function1;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b3 implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pm.d f53444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pm.d f53445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pm.d f53446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rm.f f53447d;

    public b3(pm.d aSerializer, pm.d bSerializer, pm.d cSerializer) {
        kotlin.jvm.internal.s.h(aSerializer, "aSerializer");
        kotlin.jvm.internal.s.h(bSerializer, "bSerializer");
        kotlin.jvm.internal.s.h(cSerializer, "cSerializer");
        this.f53444a = aSerializer;
        this.f53445b = bSerializer;
        this.f53446c = cSerializer;
        this.f53447d = rm.l.c("kotlin.Triple", new rm.f[0], new Function1() { // from class: tm.a3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b3.d(this.f53440a, (rm.a) obj);
            }
        });
    }

    private final fl.v b(sm.c cVar) {
        Object objC = sm.c.a.c(cVar, getDescriptor(), 0, this.f53444a, null, 8, null);
        Object objC2 = sm.c.a.c(cVar, getDescriptor(), 1, this.f53445b, null, 8, null);
        Object objC3 = sm.c.a.c(cVar, getDescriptor(), 2, this.f53446c, null, 8, null);
        cVar.d(getDescriptor());
        return new fl.v(objC, objC2, objC3);
    }

    private final fl.v c(sm.c cVar) {
        Object objC = c3.f53453a;
        Object objC2 = c3.f53453a;
        Object objC3 = c3.f53453a;
        while (true) {
            int iO = cVar.o(getDescriptor());
            if (iO == -1) {
                cVar.d(getDescriptor());
                if (objC == c3.f53453a) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objC2 == c3.f53453a) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objC3 != c3.f53453a) {
                    return new fl.v(objC, objC2, objC3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iO == 0) {
                objC = sm.c.a.c(cVar, getDescriptor(), 0, this.f53444a, null, 8, null);
            } else if (iO == 1) {
                objC2 = sm.c.a.c(cVar, getDescriptor(), 1, this.f53445b, null, 8, null);
            } else {
                if (iO != 2) {
                    throw new SerializationException("Unexpected index " + iO);
                }
                objC3 = sm.c.a.c(cVar, getDescriptor(), 2, this.f53446c, null, 8, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 d(b3 b3Var, rm.a buildClassSerialDescriptor) {
        kotlin.jvm.internal.s.h(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        rm.a.b(buildClassSerialDescriptor, "first", b3Var.f53444a.getDescriptor(), null, false, 12, null);
        rm.a.b(buildClassSerialDescriptor, "second", b3Var.f53445b.getDescriptor(), null, false, 12, null);
        rm.a.b(buildClassSerialDescriptor, "third", b3Var.f53446c.getDescriptor(), null, false, 12, null);
        return fl.g0.f38750a;
    }

    @Override // pm.c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public fl.v deserialize(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        sm.c cVarB = decoder.b(getDescriptor());
        return cVarB.l() ? b(cVarB) : c(cVarB);
    }

    @Override // pm.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void serialize(sm.f encoder, fl.v value) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(value, "value");
        sm.d dVarB = encoder.b(getDescriptor());
        dVarB.A(getDescriptor(), 0, this.f53444a, value.i());
        dVarB.A(getDescriptor(), 1, this.f53445b, value.j());
        dVarB.A(getDescriptor(), 2, this.f53446c, value.k());
        dVarB.d(getDescriptor());
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return this.f53447d;
    }
}
