package ao;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static Object[] a(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj instanceof Object[]) {
                    for (Object obj2 : a((Object[]) obj)) {
                        arrayList.add(obj2);
                    }
                } else {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList.toArray();
    }
}
