package gl;

import com.bytedance.sdk.component.hn.hnj.yiH.PAFNPq;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import v7.XOSD.qnwOeeQSSWa;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o0 extends n0 {
    public static Object i(Map map, Object obj) {
        kotlin.jvm.internal.s.h(map, "<this>");
        return m0.a(map, obj);
    }

    public static HashMap j(fl.q... pairs) {
        kotlin.jvm.internal.s.h(pairs, "pairs");
        HashMap map = new HashMap(n0.e(pairs.length));
        q(map, pairs);
        return map;
    }

    public static LinkedHashMap k(fl.q... pairs) {
        kotlin.jvm.internal.s.h(pairs, "pairs");
        return (LinkedHashMap) u(pairs, new LinkedHashMap(n0.e(pairs.length)));
    }

    public static Map l(fl.q... pairs) {
        kotlin.jvm.internal.s.h(pairs, "pairs");
        return pairs.length > 0 ? u(pairs, new LinkedHashMap(n0.e(pairs.length))) : h();
    }

    public static Map m(fl.q... pairs) {
        kotlin.jvm.internal.s.h(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(n0.e(pairs.length));
        q(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static Map o(Map map, Map map2) {
        kotlin.jvm.internal.s.h(map, "<this>");
        kotlin.jvm.internal.s.h(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void p(Map map, Iterable pairs) {
        kotlin.jvm.internal.s.h(map, "<this>");
        kotlin.jvm.internal.s.h(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            fl.q qVar = (fl.q) it.next();
            map.put(qVar.d(), qVar.g());
        }
    }

    public static final void q(Map map, fl.q[] pairs) {
        kotlin.jvm.internal.s.h(map, "<this>");
        kotlin.jvm.internal.s.h(pairs, "pairs");
        for (fl.q qVar : pairs) {
            map.put(qVar.d(), qVar.g());
        }
    }

    public static Map r(Iterable iterable) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return n(s(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return h();
        }
        if (size != 1) {
            return s(iterable, new LinkedHashMap(n0.e(collection.size())));
        }
        return n0.f((fl.q) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    public static final Map s(Iterable iterable, Map destination) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        kotlin.jvm.internal.s.h(destination, "destination");
        p(destination, iterable);
        return destination;
    }

    public static Map t(Map map) {
        kotlin.jvm.internal.s.h(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? v(map) : n0.g(map);
        }
        return h();
    }

    public static final Map u(fl.q[] qVarArr, Map destination) {
        kotlin.jvm.internal.s.h(qVarArr, "<this>");
        kotlin.jvm.internal.s.h(destination, "destination");
        q(destination, qVarArr);
        return destination;
    }

    public static Map v(Map map) {
        kotlin.jvm.internal.s.h(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static Map h() {
        e0 e0Var = e0.f39324a;
        kotlin.jvm.internal.s.f(e0Var, qnwOeeQSSWa.zJHZHkzyLF);
        return e0Var;
    }

    public static final Map n(Map map) {
        kotlin.jvm.internal.s.h(map, PAFNPq.mUhKpaQ);
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : n0.g(map);
        }
        return h();
    }
}
