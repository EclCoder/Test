package androidx.work;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends j {
    @Override // androidx.work.j
    public e b(List list) {
        e.a aVar = new e.a();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            map.putAll(((e) it.next()).h());
        }
        aVar.d(map);
        return aVar.a();
    }
}
