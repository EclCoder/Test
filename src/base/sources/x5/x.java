package x5;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class x implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f56740b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f56741a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements o, c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f56742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f56743b;

        public a(ContentResolver contentResolver, boolean z10) {
            this.f56742a = contentResolver;
            this.f56743b = z10;
        }

        @Override // x5.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f56742a, uri, this.f56743b);
        }

        @Override // x5.o
        public n d(r rVar) {
            return new x(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b implements o, c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f56744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f56745b;

        public b(ContentResolver contentResolver, boolean z10) {
            this.f56744a = contentResolver;
            this.f56745b = z10;
        }

        @Override // x5.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f56744a, uri, this.f56745b);
        }

        @Override // x5.o
        public n d(r rVar) {
            return new x(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        com.bumptech.glide.load.data.d a(Uri uri);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class d implements o, c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f56746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f56747b;

        public d(ContentResolver contentResolver, boolean z10) {
            this.f56746a = contentResolver;
            this.f56747b = z10;
        }

        @Override // x5.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f56746a, uri, this.f56747b);
        }

        @Override // x5.o
        public n d(r rVar) {
            return new x(this);
        }
    }

    public x(c cVar) {
        this.f56741a = cVar;
    }

    @Override // x5.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, r5.g gVar) {
        return new n.a(new l6.d(uri), this.f56741a.a(uri));
    }

    @Override // x5.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return f56740b.contains(uri.getScheme());
    }
}
