package ln;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class l {
    public static final List a(List addresses) {
        kotlin.jvm.internal.s.h(addresses, "addresses");
        if (addresses.size() < 2) {
            return addresses;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : addresses) {
            if (((InetAddress) obj) instanceof Inet6Address) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        fl.q qVar = new fl.q(arrayList, arrayList2);
        List list = (List) qVar.d();
        List list2 = (List) qVar.g();
        return (list.isEmpty() || list2.isEmpty()) ? addresses : hn.m.v(list, list2);
    }
}
