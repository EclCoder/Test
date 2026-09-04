package ko;

import co.o;
import co.p;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43559a;

    public b(List list) {
        if (list == null || list.isEmpty()) {
            this.f43559a = "gzip,deflate";
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (i10 > 0) {
                sb2.append(",");
            }
            sb2.append((String) list.get(i10));
        }
        this.f43559a = sb2.toString();
    }

    @Override // co.p
    public void c(o oVar, gp.f fVar) {
        go.a aVarS = a.h(fVar).s();
        if (oVar.containsHeader("Accept-Encoding") || !aVarS.r()) {
            return;
        }
        oVar.addHeader("Accept-Encoding", this.f43559a);
    }

    public b() {
        this(null);
    }
}
