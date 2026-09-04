package b5;

import androidx.lifecycle.p0;
import androidx.work.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class c implements o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p0 f8407c = new p0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c f8408d = androidx.work.impl.utils.futures.c.s();

    public c() {
        a(o.f7999b);
    }

    public void a(o.b bVar) {
        this.f8407c.n(bVar);
        if (bVar instanceof o.b.c) {
            this.f8408d.o((o.b.c) bVar);
        } else if (bVar instanceof o.b.a) {
            this.f8408d.p(((o.b.a) bVar).a());
        }
    }
}
