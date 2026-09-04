package d1;

import gl.r;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Set a(Set set) {
        s.h(set, "set");
        Set setUnmodifiableSet = Collections.unmodifiableSet(r.N0(set));
        s.g(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
        return setUnmodifiableSet;
    }

    public static final Map b(Map map) {
        s.h(map, "map");
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        s.g(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }
}
