package ko;

import co.o;
import co.p;
import com.google.api.client.http.HttpMethods;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection f43560a;

    public g(Collection collection) {
        this.f43560a = collection;
    }

    @Override // co.p
    public void c(o oVar, gp.f fVar) {
        ip.a.h(oVar, "HTTP request");
        if (oVar.getRequestLine().getMethod().equalsIgnoreCase(HttpMethods.CONNECT)) {
            return;
        }
        Collection collection = (Collection) oVar.getParams().getParameter("http.default-headers");
        if (collection == null) {
            collection = this.f43560a;
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                oVar.addHeader((co.d) it.next());
            }
        }
    }

    public g() {
        this(null);
    }
}
