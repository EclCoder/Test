package ob;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static HashMap a(Bundle bundle) {
        HashMap map = new HashMap();
        if (bundle != Bundle.EMPTY) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    map.put(str, string);
                }
            }
        }
        return map;
    }

    public static com.google.common.collect.e0 b(Bundle bundle) {
        return bundle == Bundle.EMPTY ? com.google.common.collect.e0.q() : com.google.common.collect.e0.j(a(bundle));
    }

    public static void c(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) r0.j(c.class.getClassLoader()));
        }
    }

    public static com.google.common.collect.c0 d(com.google.android.exoplayer2.g.a aVar, List list) {
        com.google.common.collect.c0.a aVarR = com.google.common.collect.c0.r();
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarR.a(aVar.a((Bundle) a.e((Bundle) list.get(i10))));
        }
        return aVarR.m();
    }

    public static SparseArray e(com.google.android.exoplayer2.g.a aVar, SparseArray sparseArray) {
        SparseArray sparseArray2 = new SparseArray(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), aVar.a((Bundle) sparseArray.valueAt(i10)));
        }
        return sparseArray2;
    }

    public static Bundle f(Bundle bundle, String str, Bundle bundle2) {
        Bundle bundle3 = bundle.getBundle(str);
        return bundle3 != null ? bundle3 : bundle2;
    }

    public static ArrayList g(Bundle bundle, String str, ArrayList arrayList) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        return integerArrayList != null ? integerArrayList : arrayList;
    }

    public static Bundle h(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }

    public static ArrayList i(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.google.android.exoplayer2.g) it.next()).toBundle());
        }
        return arrayList;
    }

    public static SparseArray j(SparseArray sparseArray) {
        SparseArray sparseArray2 = new SparseArray(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), ((com.google.android.exoplayer2.g) sparseArray.valueAt(i10)).toBundle());
        }
        return sparseArray2;
    }
}
