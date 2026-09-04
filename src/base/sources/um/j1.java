package um;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(rm.f fVar) {
        return (fVar.d() instanceof rm.e) || fVar.d() == rm.m.b.f51420a;
    }

    public static final kotlinx.serialization.json.i d(kotlinx.serialization.json.b json, Object obj, pm.l serializer) {
        kotlin.jvm.internal.s.h(json, "json");
        kotlin.jvm.internal.s.h(serializer, "serializer");
        final kotlin.jvm.internal.k0 k0Var = new kotlin.jvm.internal.k0();
        new p0(json, new Function1() { // from class: um.i1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return j1.e(k0Var, (kotlinx.serialization.json.i) obj2);
            }
        }).q(serializer, obj);
        Object obj2 = k0Var.f43597a;
        if (obj2 != null) {
            return (kotlinx.serialization.json.i) obj2;
        }
        kotlin.jvm.internal.s.w("result");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 e(kotlin.jvm.internal.k0 k0Var, kotlinx.serialization.json.i it) {
        kotlin.jvm.internal.s.h(it, "it");
        k0Var.f43597a = it;
        return fl.g0.f38750a;
    }
}
