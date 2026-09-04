package tm;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h2 {
    public static final int a(rm.f fVar, rm.f[] typeParams) {
        kotlin.jvm.internal.s.h(fVar, "<this>");
        kotlin.jvm.internal.s.h(typeParams, "typeParams");
        int iHashCode = (fVar.i().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable iterableA = rm.j.a(fVar);
        Iterator it = iterableA.iterator();
        int iHashCode2 = 1;
        int i10 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i11 = i10 * 31;
            String strI = ((rm.f) it.next()).i();
            if (strI != null) {
                iHashCode3 = strI.hashCode();
            }
            i10 = i11 + iHashCode3;
        }
        Iterator it2 = iterableA.iterator();
        while (it2.hasNext()) {
            int i12 = iHashCode2 * 31;
            rm.m mVarD = ((rm.f) it2.next()).d();
            iHashCode2 = i12 + (mVarD != null ? mVarD.hashCode() : 0);
        }
        return (((iHashCode * 31) + i10) * 31) + iHashCode2;
    }
}
