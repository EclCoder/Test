package y5;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.resource.bitmap.j0;
import r5.g;
import x5.n;
import x5.o;
import x5.r;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f57425a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f57426a;

        public a(Context context) {
            this.f57426a = context;
        }

        @Override // x5.o
        public n d(r rVar) {
            return new c(this.f57426a);
        }
    }

    public c(Context context) {
        this.f57425a = context.getApplicationContext();
    }

    private boolean e(g gVar) {
        Long l10 = (Long) gVar.c(j0.f11536d);
        return l10 != null && l10.longValue() == -1;
    }

    @Override // x5.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, g gVar) {
        if (s5.b.f(i10, i11) && e(gVar)) {
            return new n.a(new l6.d(uri), s5.c.g(this.f57425a, uri));
        }
        return null;
    }

    @Override // x5.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return s5.b.e(uri);
    }
}
