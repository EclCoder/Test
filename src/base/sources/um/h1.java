package um;

import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h1 {
    public static final Object b(kotlinx.serialization.json.b bVar, String discriminator, kotlinx.serialization.json.d0 element, pm.c deserializer) {
        kotlin.jvm.internal.s.h(bVar, "<this>");
        kotlin.jvm.internal.s.h(discriminator, "discriminator");
        kotlin.jvm.internal.s.h(element, "element");
        kotlin.jvm.internal.s.h(deserializer, "deserializer");
        return new o0(bVar, element, discriminator, deserializer.getDescriptor()).D(deserializer);
    }

    public static final Object a(kotlinx.serialization.json.b bVar, kotlinx.serialization.json.i element, pm.c deserializer) {
        sm.e k0Var;
        kotlin.jvm.internal.s.h(bVar, dOIDCKnIR.GVczUHona);
        kotlin.jvm.internal.s.h(element, "element");
        kotlin.jvm.internal.s.h(deserializer, "deserializer");
        if (element instanceof kotlinx.serialization.json.d0) {
            k0Var = new o0(bVar, (kotlinx.serialization.json.d0) element, null, null, 12, null);
        } else if (element instanceof kotlinx.serialization.json.c) {
            k0Var = new q0(bVar, (kotlinx.serialization.json.c) element);
        } else {
            if (!(element instanceof kotlinx.serialization.json.w) && !kotlin.jvm.internal.s.c(element, kotlinx.serialization.json.a0.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            k0Var = new k0(bVar, (kotlinx.serialization.json.g0) element, null, 4, null);
        }
        return k0Var.D(deserializer);
    }
}
