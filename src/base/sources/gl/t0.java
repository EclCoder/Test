package gl;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t0 {
    public static Set a(Set builder) {
        kotlin.jvm.internal.s.h(builder, "builder");
        return ((hl.j) builder).g();
    }

    public static Set b(int i10) {
        return new hl.j(i10);
    }

    public static Set c(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        kotlin.jvm.internal.s.g(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
