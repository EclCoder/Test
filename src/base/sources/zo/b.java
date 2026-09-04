package zo;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b implements uo.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f59025a;

    protected b(uo.b... bVarArr) {
        this.f59025a = new ConcurrentHashMap(bVarArr.length);
        for (uo.b bVar : bVarArr) {
            this.f59025a.put(bVar.b(), bVar);
        }
    }

    protected uo.d c(String str) {
        return (uo.d) this.f59025a.get(str);
    }

    protected Collection d() {
        return this.f59025a.values();
    }
}
