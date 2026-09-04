package x5;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class t implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f56731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f56732b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f56733a;

        a(Context context) {
            this.f56733a = context;
        }

        @Override // x5.o
        public n d(r rVar) {
            return new t(this.f56733a, rVar.d(Integer.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f56734a;

        b(Context context) {
            this.f56734a = context;
        }

        @Override // x5.o
        public n d(r rVar) {
            return new t(this.f56734a, rVar.d(Integer.class, InputStream.class));
        }
    }

    t(Context context, n nVar) {
        this.f56731a = context.getApplicationContext();
        this.f56732b = nVar;
    }

    public static o e(Context context) {
        return new a(context);
    }

    public static o f(Context context) {
        return new b(context);
    }

    private n.a g(Uri uri, int i10, int i11, r5.g gVar) {
        try {
            int i12 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i12 != 0) {
                return this.f56732b.b(Integer.valueOf(i12), i10, i11, gVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e10) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e10);
            }
            return null;
        }
    }

    private n.a h(Uri uri, int i10, int i11, r5.g gVar) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f56731a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f56731a.getPackageName());
        if (identifier != 0) {
            return this.f56732b.b(Integer.valueOf(identifier), i10, i11, gVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }

    @Override // x5.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, r5.g gVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return g(uri, i10, i11, gVar);
        }
        if (pathSegments.size() == 2) {
            return h(uri, i10, i11, gVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // x5.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f56731a.getPackageName().equals(uri.getAuthority());
    }
}
