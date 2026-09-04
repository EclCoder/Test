package tm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class t implements y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tl.o f53583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f53584b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements tl.a {
        @Override // tl.a
        public final Object invoke() {
            return new x1();
        }
    }

    public t(tl.o compute) {
        kotlin.jvm.internal.s.h(compute, "compute");
        this.f53583a = compute;
        this.f53584b = new u();
    }

    @Override // tm.y1
    public Object a(zl.c key, List types) {
        Object objB;
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(types, "types");
        Object obj = this.f53584b.get(sl.a.a(key));
        kotlin.jvm.internal.s.g(obj, "get(...)");
        k1 k1Var = (k1) obj;
        Object objA = k1Var.f53528a.get();
        if (objA == null) {
            objA = k1Var.a(new a());
        }
        x1 x1Var = (x1) objA;
        List list = types;
        ArrayList arrayList = new ArrayList(gl.r.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new w0((zl.l) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = x1Var.f53609a;
        Object obj2 = concurrentHashMap.get(arrayList);
        if (obj2 == null) {
            try {
                fl.r.a aVar = fl.r.f38769b;
                objB = fl.r.b((pm.d) this.f53583a.invoke(key, types));
            } catch (Throwable th2) {
                fl.r.a aVar2 = fl.r.f38769b;
                objB = fl.r.b(fl.s.a(th2));
            }
            fl.r rVarA = fl.r.a(objB);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, rVarA);
            obj2 = objPutIfAbsent == null ? rVarA : objPutIfAbsent;
        }
        kotlin.jvm.internal.s.g(obj2, "getOrPut(...)");
        return ((fl.r) obj2).k();
    }
}
