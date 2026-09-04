package gl;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n0 extends m0 {
    public static Map b(Map builder) {
        kotlin.jvm.internal.s.h(builder, "builder");
        return ((hl.d) builder).p();
    }

    public static Map c() {
        return new hl.d();
    }

    public static Map d(int i10) {
        return new hl.d(i10);
    }

    public static int e(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map f(fl.q pair) {
        kotlin.jvm.internal.s.h(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.h(), pair.i());
        kotlin.jvm.internal.s.g(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final Map g(Map map) {
        kotlin.jvm.internal.s.h(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.s.g(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
