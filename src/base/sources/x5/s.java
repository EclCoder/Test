package x5;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class s implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f56726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f56727b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f56728a;

        public a(Resources resources) {
            this.f56728a = resources;
        }

        @Override // x5.o
        public n d(r rVar) {
            return new s(this.f56728a, rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f56729a;

        public b(Resources resources) {
            this.f56729a = resources;
        }

        @Override // x5.o
        public n d(r rVar) {
            return new s(this.f56729a, rVar.d(Uri.class, InputStream.class));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f56730a;

        public c(Resources resources) {
            this.f56730a = resources;
        }

        @Override // x5.o
        public n d(r rVar) {
            return new s(this.f56730a, w.c());
        }
    }

    public s(Resources resources, n nVar) {
        this.f56727b = resources;
        this.f56726a = nVar;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f56727b.getResourcePackageName(num.intValue()) + '/' + num);
        } catch (Resources.NotFoundException e10) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
            return null;
        }
    }

    @Override // x5.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Integer num, int i10, int i11, r5.g gVar) {
        Uri uriD = d(num);
        if (uriD == null) {
            return null;
        }
        return this.f56726a.b(uriD, i10, i11, gVar);
    }

    @Override // x5.n
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean a(Integer num) {
        return true;
    }
}
