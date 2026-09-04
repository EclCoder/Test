package q0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f50281a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface c {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f50281a = new a(uri, clipDescription, uri2);
        } else {
            this.f50281a = new b(uri, clipDescription, uri2);
        }
    }

    public static f f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new f(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f50281a.b();
    }

    public ClipDescription b() {
        return this.f50281a.getDescription();
    }

    public Uri c() {
        return this.f50281a.d();
    }

    public void d() {
        this.f50281a.c();
    }

    public Object e() {
        return this.f50281a.a();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final InputContentInfo f50282a;

        a(Object obj) {
            this.f50282a = (InputContentInfo) obj;
        }

        @Override // q0.f.c
        public Object a() {
            return this.f50282a;
        }

        @Override // q0.f.c
        public Uri b() {
            return this.f50282a.getContentUri();
        }

        @Override // q0.f.c
        public void c() {
            this.f50282a.requestPermission();
        }

        @Override // q0.f.c
        public Uri d() {
            return this.f50282a.getLinkUri();
        }

        @Override // q0.f.c
        public ClipDescription getDescription() {
            return this.f50282a.getDescription();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f50282a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private f(c cVar) {
        this.f50281a = cVar;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f50283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ClipDescription f50284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Uri f50285c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f50283a = uri;
            this.f50284b = clipDescription;
            this.f50285c = uri2;
        }

        @Override // q0.f.c
        public Object a() {
            return null;
        }

        @Override // q0.f.c
        public Uri b() {
            return this.f50283a;
        }

        @Override // q0.f.c
        public Uri d() {
            return this.f50285c;
        }

        @Override // q0.f.c
        public ClipDescription getDescription() {
            return this.f50284b;
        }

        @Override // q0.f.c
        public void c() {
        }
    }
}
