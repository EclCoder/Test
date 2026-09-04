package x5;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class v implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f56736a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements o {
        @Override // x5.o
        public n d(r rVar) {
            return new v(rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b implements o {
        @Override // x5.o
        public n d(r rVar) {
            return new v(rVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c implements o {
        @Override // x5.o
        public n d(r rVar) {
            return new v(rVar.d(Uri.class, InputStream.class));
        }
    }

    public v(n nVar) {
        this.f56736a = nVar;
    }

    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? f(str) : uri;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // x5.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(String str, int i10, int i11, r5.g gVar) {
        Uri uriE = e(str);
        if (uriE == null || !this.f56736a.a(uriE)) {
            return null;
        }
        return this.f56736a.b(uriE, i10, i11, gVar);
    }

    @Override // x5.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(String str) {
        return true;
    }
}
