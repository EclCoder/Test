package x5;

import android.content.res.AssetManager;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f56641c = 22;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f56642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0866a f56643b;

    /* JADX INFO: renamed from: x5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0866a {
        com.bumptech.glide.load.data.d a(AssetManager assetManager, String str);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b implements o, InterfaceC0866a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AssetManager f56644a;

        public b(AssetManager assetManager) {
            this.f56644a = assetManager;
        }

        @Override // x5.a.InterfaceC0866a
        public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // x5.o
        public n d(r rVar) {
            return new a(this.f56644a, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c implements o, InterfaceC0866a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AssetManager f56645a;

        public c(AssetManager assetManager) {
            this.f56645a = assetManager;
        }

        @Override // x5.a.InterfaceC0866a
        public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // x5.o
        public n d(r rVar) {
            return new a(this.f56645a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0866a interfaceC0866a) {
        this.f56642a = assetManager;
        this.f56643b = interfaceC0866a;
    }

    @Override // x5.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, r5.g gVar) {
        return new n.a(new l6.d(uri), this.f56643b.a(this.f56642a, uri.toString().substring(f56641c)));
    }

    @Override // x5.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
