package x5;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class y implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f56748b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f56749a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a implements o {
        @Override // x5.o
        public n d(r rVar) {
            return new y(rVar.d(h.class, InputStream.class));
        }
    }

    public y(n nVar) {
        this.f56749a = nVar;
    }

    @Override // x5.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, r5.g gVar) {
        return this.f56749a.b(new h(uri.toString()), i10, i11, gVar);
    }

    @Override // x5.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return f56748b.contains(uri.getScheme());
    }
}
