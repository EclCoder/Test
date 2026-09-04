package tm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class y implements y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tl.o f53613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f53614b;

    public y(tl.o compute) {
        kotlin.jvm.internal.s.h(compute, "compute");
        this.f53613a = compute;
        this.f53614b = new ConcurrentHashMap();
    }

    @Override // tm.y1
    public Object a(zl.c key, List types) {
        Object objB;
        Object objPutIfAbsent;
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(types, "types");
        ConcurrentHashMap concurrentHashMap = this.f53614b;
        Class clsA = sl.a.a(key);
        Object x1Var = concurrentHashMap.get(clsA);
        if (x1Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsA, (x1Var = new x1()))) != null) {
            x1Var = objPutIfAbsent;
        }
        x1 x1Var2 = (x1) x1Var;
        List list = types;
        ArrayList arrayList = new ArrayList(gl.r.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new w0((zl.l) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = x1Var2.f53609a;
        Object obj = concurrentHashMap2.get(arrayList);
        if (obj == null) {
            try {
                fl.r.a aVar = fl.r.f38769b;
                objB = fl.r.b((pm.d) this.f53613a.invoke(key, types));
            } catch (Throwable th2) {
                fl.r.a aVar2 = fl.r.f38769b;
                objB = fl.r.b(fl.s.a(th2));
            }
            fl.r rVarA = fl.r.a(objB);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList, rVarA);
            obj = objPutIfAbsent2 == null ? rVarA : objPutIfAbsent2;
        }
        kotlin.jvm.internal.s.g(obj, "getOrPut(...)");
        return ((fl.r) obj).k();
    }
}
