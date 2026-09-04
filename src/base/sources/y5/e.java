package y5;

import java.io.InputStream;
import java.net.URL;
import r5.g;
import x5.h;
import x5.n;
import x5.o;
import x5.r;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f57444a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a implements o {
        @Override // x5.o
        public n d(r rVar) {
            return new e(rVar.d(h.class, InputStream.class));
        }
    }

    public e(n nVar) {
        this.f57444a = nVar;
    }

    @Override // x5.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(URL url, int i10, int i11, g gVar) {
        return this.f57444a.b(new h(url), i10, i11, gVar);
    }

    @Override // x5.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(URL url) {
        return true;
    }
}
