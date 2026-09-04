package pm;

import fl.g0;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import tm.a2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zl.c f50251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f50252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f50253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rm.f f50254d;

    public b(zl.c serializableClass, d dVar, d[] typeArgumentsSerializers) {
        kotlin.jvm.internal.s.h(serializableClass, "serializableClass");
        kotlin.jvm.internal.s.h(typeArgumentsSerializers, "typeArgumentsSerializers");
        this.f50251a = serializableClass;
        this.f50252b = dVar;
        this.f50253c = gl.j.e(typeArgumentsSerializers);
        this.f50254d = rm.b.c(rm.l.d("kotlinx.serialization.ContextualSerializer", rm.m.a.f51419a, new rm.f[0], new Function1() { // from class: pm.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.b(this.f50250a, (rm.a) obj);
            }
        }), serializableClass);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 b(b bVar, rm.a buildSerialDescriptor) {
        rm.f descriptor;
        kotlin.jvm.internal.s.h(buildSerialDescriptor, "$this$buildSerialDescriptor");
        d dVar = bVar.f50252b;
        List annotations = (dVar == null || (descriptor = dVar.getDescriptor()) == null) ? null : descriptor.getAnnotations();
        if (annotations == null) {
            annotations = gl.r.l();
        }
        buildSerialDescriptor.h(annotations);
        return g0.f38750a;
    }

    private final d c(vm.b bVar) {
        d dVarB = bVar.b(this.f50251a, this.f50253c);
        if (dVarB != null) {
            return dVarB;
        }
        d dVar = this.f50252b;
        if (dVar != null) {
            return dVar;
        }
        a2.f(this.f50251a);
        throw new KotlinNothingValueException();
    }

    @Override // pm.c
    public Object deserialize(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        return decoder.D(c(decoder.a()));
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return this.f50254d;
    }

    @Override // pm.l
    public void serialize(sm.f encoder, Object value) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(value, "value");
        encoder.q(c(encoder.a()), value);
    }
}
