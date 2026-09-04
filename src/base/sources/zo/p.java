package zo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class p extends b {
    protected p(uo.b... bVarArr) {
        super(bVarArr);
    }

    protected static String e(uo.f fVar) {
        return fVar.a();
    }

    protected static String f(uo.f fVar) {
        String strB = fVar.b();
        int iLastIndexOf = strB.lastIndexOf(47);
        if (iLastIndexOf < 0) {
            return strB;
        }
        if (iLastIndexOf == 0) {
            iLastIndexOf = 1;
        }
        return strB.substring(0, iLastIndexOf);
    }

    @Override // uo.g
    public void a(uo.c cVar, uo.f fVar) {
        ip.a.h(cVar, "Cookie");
        ip.a.h(fVar, "Cookie origin");
        Iterator it = d().iterator();
        while (it.hasNext()) {
            ((uo.d) it.next()).a(cVar, fVar);
        }
    }

    protected List g(co.e[] eVarArr, uo.f fVar) {
        ArrayList arrayList = new ArrayList(eVarArr.length);
        for (co.e eVar : eVarArr) {
            String name = eVar.getName();
            String value = eVar.getValue();
            if (name != null && !name.isEmpty()) {
                d dVar = new d(name, value);
                dVar.h(f(fVar));
                dVar.e(e(fVar));
                co.u[] parameters = eVar.getParameters();
                for (int length = parameters.length - 1; length >= 0; length--) {
                    co.u uVar = parameters[length];
                    String lowerCase = uVar.getName().toLowerCase(Locale.ROOT);
                    dVar.n(lowerCase, uVar.getValue());
                    uo.d dVarC = c(lowerCase);
                    if (dVarC != null) {
                        dVarC.c(dVar, uVar.getValue());
                    }
                }
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }
}
