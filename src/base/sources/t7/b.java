package t7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f53160a = new ConcurrentHashMap();

    public final List a(String appId) {
        s.h(appId, "appId");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f53160a.get(appId);
        if (concurrentHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((a) ((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    public final void b(String appId, List gateKeeperList) {
        s.h(appId, "appId");
        s.h(gateKeeperList, "gateKeeperList");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = gateKeeperList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            concurrentHashMap.put(aVar.a(), aVar);
        }
        this.f53160a.put(appId, concurrentHashMap);
    }
}
