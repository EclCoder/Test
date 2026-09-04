package ko;

import co.q;
import co.s;
import java.util.Locale;
import org.apache.http.HttpException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class k implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final no.b f43561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f43562b;

    public k(no.b bVar, boolean z10) {
        this.f43561a = bVar == null ? no.d.b().c("gzip", ho.d.b()).c("x-gzip", ho.d.b()).c("deflate", ho.c.b()).a() : bVar;
        this.f43562b = z10;
    }

    @Override // co.s
    public void b(q qVar, gp.f fVar) throws HttpException {
        co.d contentEncoding;
        co.j entity = qVar.getEntity();
        if (!a.h(fVar).s().r() || entity == null || entity.getContentLength() == 0 || (contentEncoding = entity.getContentEncoding()) == null) {
            return;
        }
        for (co.e eVar : contentEncoding.g()) {
            String lowerCase = eVar.getName().toLowerCase(Locale.ROOT);
            ho.e eVar2 = (ho.e) this.f43561a.a(lowerCase);
            if (eVar2 != null) {
                qVar.setEntity(new ho.a(qVar.getEntity(), eVar2));
                qVar.removeHeaders("Content-Length");
                qVar.removeHeaders("Content-Encoding");
                qVar.removeHeaders("Content-MD5");
            } else if (!"identity".equals(lowerCase) && !this.f43562b) {
                throw new HttpException("Unsupported Content-Encoding: " + eVar.getName());
            }
        }
    }

    public k(no.b bVar) {
        this(bVar, true);
    }

    public k() {
        this(null);
    }
}
