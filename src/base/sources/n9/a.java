package n9;

import a9.e;
import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SparseArray f46942a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap f46943b;

    static {
        HashMap map = new HashMap();
        f46943b = map;
        map.put(e.DEFAULT, 0);
        f46943b.put(e.VERY_LOW, 1);
        f46943b.put(e.HIGHEST, 2);
        for (e eVar : f46943b.keySet()) {
            f46942a.append(((Integer) f46943b.get(eVar)).intValue(), eVar);
        }
    }

    public static int a(e eVar) {
        Integer num = (Integer) f46943b.get(eVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + eVar);
    }

    public static e b(int i10) {
        e eVar = (e) f46942a.get(i10);
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
