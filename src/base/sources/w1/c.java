package w1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static com.google.common.collect.c0 a(sc.g gVar, List list) {
        com.google.common.collect.c0.a aVarR = com.google.common.collect.c0.r();
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarR.a(gVar.apply((Bundle) a.e((Bundle) list.get(i10))));
        }
        return aVarR.m();
    }

    public static ArrayList b(Collection collection, sc.g gVar) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) gVar.apply(it.next()));
        }
        return arrayList;
    }
}
