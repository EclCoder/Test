package to;

import java.net.IDN;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f53633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f53634b;

    public f(b bVar, Collection collection, Collection collection2) {
        ip.a.h(bVar, "Domain type");
        ip.a.h(collection, "Domain suffix rules");
        this.f53633a = new ConcurrentHashMap(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f53633a.put((String) it.next(), bVar);
        }
        this.f53634b = new ConcurrentHashMap();
        if (collection2 != null) {
            Iterator it2 = collection2.iterator();
            while (it2.hasNext()) {
                this.f53634b.put((String) it2.next(), bVar);
            }
        }
    }

    private static b a(Map map, String str) {
        if (map == null) {
            return null;
        }
        return (b) map.get(str);
    }

    private static boolean c(b bVar, b bVar2) {
        if (bVar != null) {
            return bVar2 == null || bVar.equals(bVar2);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a A[RETURN] */
    public String b(String str, b bVar) {
        if (str == null || str.startsWith(".")) {
            return null;
        }
        String strB = a.b(str);
        String str2 = null;
        while (strB != null) {
            String unicode = IDN.toUnicode(strB);
            if (!c(a(this.f53634b, unicode), bVar)) {
                b bVarA = a(this.f53633a, unicode);
                if (!c(bVarA, bVar)) {
                    int iIndexOf = strB.indexOf(46);
                    String strSubstring = iIndexOf != -1 ? strB.substring(iIndexOf + 1) : null;
                    if (strSubstring != null) {
                        b bVarA2 = a(this.f53633a, "*." + IDN.toUnicode(strSubstring));
                        if (c(bVarA2, bVar)) {
                            if (bVarA2 != b.PRIVATE) {
                                return str2;
                            }
                        }
                    }
                    str2 = strB;
                    strB = strSubstring;
                } else if (bVarA != b.PRIVATE) {
                    return str2;
                }
            }
            return strB;
        }
        if (bVar == null || bVar == b.UNKNOWN) {
            return str2;
        }
        return null;
    }

    public f(Collection collection) {
        ip.a.h(collection, "Domain suffix lists");
        this.f53633a = new ConcurrentHashMap();
        this.f53634b = new ConcurrentHashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            b bVarC = dVar.c();
            Iterator it2 = dVar.b().iterator();
            while (it2.hasNext()) {
                this.f53633a.put((String) it2.next(), bVarC);
            }
            List listA = dVar.a();
            if (listA != null) {
                Iterator it3 = listA.iterator();
                while (it3.hasNext()) {
                    this.f53634b.put((String) it3.next(), bVarC);
                }
            }
        }
    }
}
