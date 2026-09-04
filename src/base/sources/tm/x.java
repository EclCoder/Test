package tm;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class x implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f53605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f53606b;

    public x(Function1 compute) {
        kotlin.jvm.internal.s.h(compute, "compute");
        this.f53605a = compute;
        this.f53606b = new ConcurrentHashMap();
    }

    @Override // tm.r2
    public pm.d a(zl.c key) {
        Object objPutIfAbsent;
        kotlin.jvm.internal.s.h(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f53606b;
        Class clsA = sl.a.a(key);
        Object mVar = concurrentHashMap.get(clsA);
        if (mVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsA, (mVar = new m((pm.d) this.f53605a.invoke(key))))) != null) {
            mVar = objPutIfAbsent;
        }
        return ((m) mVar).f53536a;
    }
}
