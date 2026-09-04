package um;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f54721a = z.a(16);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
    }

    public final Object a(rm.f descriptor, a key) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        kotlin.jvm.internal.s.h(key, "key");
        Map map = (Map) this.f54721a.get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final Object b(rm.f descriptor, a key, tl.a defaultValue) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(defaultValue, "defaultValue");
        Object objA = a(descriptor, key);
        if (objA != null) {
            return objA;
        }
        Object objInvoke = defaultValue.invoke();
        c(descriptor, key, objInvoke);
        return objInvoke;
    }

    public final void c(rm.f descriptor, a key, Object value) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(value, "value");
        Map map = this.f54721a;
        Object objA = map.get(descriptor);
        if (objA == null) {
            objA = z.a(2);
            map.put(descriptor, objA);
        }
        ((Map) objA).put(key, value);
    }
}
