package kotlinx.serialization.json;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f43658a = new LinkedHashMap();

    public final d0 a() {
        return new d0(this.f43658a);
    }

    public final i b(String key, i element) {
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(element, "element");
        return (i) this.f43658a.put(key, element);
    }
}
