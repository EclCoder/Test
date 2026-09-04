package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f41731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f41732b;

    public t(Map map) {
        this.f41731a = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l10 = (Long) entry2.getKey();
                s sVar = a.f41681b;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l10));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, a.f41681b);
            map2.put((y) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, a.f41681b);
        this.f41732b = map2;
    }

    public final String a(long j10, y yVar) {
        Map map = (Map) this.f41731a.get(yVar);
        if (map != null) {
            return (String) map.get(Long.valueOf(j10));
        }
        return null;
    }
}
