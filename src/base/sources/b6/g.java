package b6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import m6.k;
import r5.i;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class g implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r5.f f8492b = r5.f.e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8493a;

    public g(Context context) {
        this.f8493a = context.getApplicationContext();
    }

    private Context d(Uri uri, String str) {
        if (str.equals(this.f8493a.getPackageName())) {
            return this.f8493a;
        }
        try {
            return this.f8493a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (str.contains(this.f8493a.getPackageName())) {
                return this.f8493a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
        }
    }

    private int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e10);
        }
    }

    private int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    private int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // r5.i
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public t5.c a(Uri uri, int i10, int i11, r5.g gVar) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context contextD = d(uri, authority);
            int iG = g(contextD, uri);
            Resources.Theme theme = ((String) k.e(authority)).equals(this.f8493a.getPackageName()) ? (Resources.Theme) gVar.c(f8492b) : null;
            return f.d(theme == null ? d.b(this.f8493a, contextD, iG) : d.a(this.f8493a, iG, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    @Override // r5.i
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri, r5.g gVar) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
