package h9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static Object a(int i10, Object obj, a aVar, c cVar) {
        Object objApply;
        if (i10 < 1) {
            return aVar.apply(obj);
        }
        do {
            objApply = aVar.apply(obj);
            obj = cVar.a(obj, objApply);
            if (obj == null) {
                break;
            }
            i10--;
        } while (i10 >= 1);
        return objApply;
    }
}
