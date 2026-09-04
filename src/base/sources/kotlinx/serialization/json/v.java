package kotlinx.serialization.json;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v {
    public static final b a(b from, Function1 builderAction) {
        kotlin.jvm.internal.s.h(from, "from");
        kotlin.jvm.internal.s.h(builderAction, "builderAction");
        e eVar = new e(from);
        builderAction.invoke(eVar);
        return new u(eVar.a(), eVar.b());
    }

    public static /* synthetic */ b b(b bVar, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = b.f43628d;
        }
        return a(bVar, function1);
    }
}
