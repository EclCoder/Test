package kotlinx.serialization.json;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    public static final i a(e0 e0Var, String key, Boolean bool) {
        kotlin.jvm.internal.s.h(e0Var, "<this>");
        kotlin.jvm.internal.s.h(key, "key");
        return e0Var.b(key, k.a(bool));
    }

    public static final i b(e0 e0Var, String key, Number number) {
        kotlin.jvm.internal.s.h(e0Var, "<this>");
        kotlin.jvm.internal.s.h(key, "key");
        return e0Var.b(key, k.b(number));
    }

    public static final i c(e0 e0Var, String key, String str) {
        kotlin.jvm.internal.s.h(e0Var, "<this>");
        kotlin.jvm.internal.s.h(key, "key");
        return e0Var.b(key, k.c(str));
    }
}
