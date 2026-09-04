package k0;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c {
        public abstract void a(int i10);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return e0.j.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, g.a(new Object[]{eVar}), cancellationSignal);
    }

    public static Typeface c(Context context, List list, int i10, boolean z10, int i11, Handler handler, c cVar) {
        k0.a aVar = new k0.a(cVar, j.b(handler));
        if (!z10) {
            return h.d(context, list, i10, null, aVar);
        }
        if (list.size() <= 1) {
            return h.e(context, (e) list.get(0), aVar, i10, i11);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f42808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f42809b;

        public a(int i10, b[] bVarArr) {
            this.f42808a = i10;
            this.f42809b = Collections.singletonList(bVarArr);
        }

        static a a(int i10, List list) {
            return new a(i10, list);
        }

        static a b(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] c() {
            return (b[]) this.f42809b.get(0);
        }

        public List d() {
            return this.f42809b;
        }

        public int e() {
            return this.f42808a;
        }

        boolean f() {
            return this.f42809b.size() > 1;
        }

        a(int i10, List list) {
            this.f42808a = i10;
            this.f42809b = list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f42810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f42811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f42812c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f42813d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f42814e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f42815f;

        public b(Uri uri, int i10, int i11, boolean z10, String str, int i12) {
            this.f42810a = (Uri) m0.g.g(uri);
            this.f42811b = i10;
            this.f42812c = i11;
            this.f42813d = z10;
            this.f42814e = str;
            this.f42815f = i12;
        }

        public int a() {
            return this.f42815f;
        }

        public String b() {
            if (h()) {
                return this.f42810a.getAuthority();
            }
            return null;
        }

        public int c() {
            return this.f42811b;
        }

        public Uri d() {
            return this.f42810a;
        }

        public String e() {
            return this.f42814e;
        }

        public int f() {
            return this.f42812c;
        }

        public boolean g() {
            return this.f42813d;
        }

        public boolean h() {
            return Objects.equals(this.f42810a.getScheme(), "systemfont");
        }

        public b(String str, String str2) {
            this.f42810a = new Uri.Builder().scheme("systemfont").authority(str).build();
            this.f42811b = 0;
            this.f42812c = 400;
            this.f42813d = false;
            this.f42814e = str2;
            this.f42815f = 0;
        }
    }
}
