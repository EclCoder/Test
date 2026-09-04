package re;

import com.google.firebase.components.ComponentRegistrar;
import dd.d;
import dd.g;
import dd.i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b implements i {
    public static /* synthetic */ Object b(String str, dd.c cVar, d dVar) {
        try {
            c.b(str);
            return cVar.h().a(dVar);
        } finally {
            c.a();
        }
    }

    @Override // dd.i
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final dd.c cVarR : componentRegistrar.getComponents()) {
            final String strI = cVarR.i();
            if (strI != null) {
                cVarR = cVarR.r(new g() { // from class: re.a
                    @Override // dd.g
                    public final Object a(d dVar) {
                        return b.b(strI, cVarR, dVar);
                    }
                });
            }
            arrayList.add(cVarR);
        }
        return arrayList;
    }
}
