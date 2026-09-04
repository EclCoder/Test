package y3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static final List a(Map map, Function1 isArgumentMissing) {
        kotlin.jvm.internal.s.h(map, "<this>");
        kotlin.jvm.internal.s.h(isArgumentMissing, "isArgumentMissing");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            v vVar = (v) entry.getValue();
            Boolean boolValueOf = vVar != null ? Boolean.valueOf(vVar.d()) : null;
            kotlin.jvm.internal.s.e(boolValueOf);
            if (!boolValueOf.booleanValue() && !vVar.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) isArgumentMissing.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
