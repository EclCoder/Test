package q1;

import androidx.lifecycle.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import r1.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f50290a = new LinkedHashMap();

    public final void a(zl.c clazz, Function1 initializer) {
        s.h(clazz, "clazz");
        s.h(initializer, "initializer");
        if (!this.f50290a.containsKey(clazz)) {
            this.f50290a.put(clazz, new f(clazz, initializer));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + r1.a.a(clazz) + ".").toString());
    }

    public final s1.c b() {
        return j.f51008a.a(this.f50290a.values());
    }
}
