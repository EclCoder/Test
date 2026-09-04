package n0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f46576a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f46577a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f46577a = new b(clipData, i10);
            } else {
                this.f46577a = new C0718d(clipData, i10);
            }
        }

        public d a() {
            return this.f46577a.build();
        }

        public a b(Bundle bundle) {
            this.f46577a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f46577a.setFlags(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f46577a.a(uri);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentInfo.Builder f46578a;

        b(ClipData clipData, int i10) {
            this.f46578a = n0.e.a(clipData, i10);
        }

        @Override // n0.d.c
        public void a(Uri uri) {
            this.f46578a.setLinkUri(uri);
        }

        @Override // n0.d.c
        public d build() {
            return new d(new e(this.f46578a.build()));
        }

        @Override // n0.d.c
        public void setExtras(Bundle bundle) {
            this.f46578a.setExtras(bundle);
        }

        @Override // n0.d.c
        public void setFlags(int i10) {
            this.f46578a.setFlags(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface c {
        void a(Uri uri);

        d build();

        void setExtras(Bundle bundle);

        void setFlags(int i10);
    }

    /* JADX INFO: renamed from: n0.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0718d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ClipData f46579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f46580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f46581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Uri f46582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Bundle f46583e;

        C0718d(ClipData clipData, int i10) {
            this.f46579a = clipData;
            this.f46580b = i10;
        }

        @Override // n0.d.c
        public void a(Uri uri) {
            this.f46582d = uri;
        }

        @Override // n0.d.c
        public d build() {
            return new d(new g(this));
        }

        @Override // n0.d.c
        public void setExtras(Bundle bundle) {
            this.f46583e = bundle;
        }

        @Override // n0.d.c
        public void setFlags(int i10) {
            this.f46581c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentInfo f46584a;

        e(ContentInfo contentInfo) {
            this.f46584a = n0.c.a(m0.g.g(contentInfo));
        }

        @Override // n0.d.f
        public int a() {
            return this.f46584a.getSource();
        }

        @Override // n0.d.f
        public ContentInfo b() {
            return this.f46584a;
        }

        @Override // n0.d.f
        public ClipData c() {
            return this.f46584a.getClip();
        }

        @Override // n0.d.f
        public int getFlags() {
            return this.f46584a.getFlags();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f46584a + "}";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface f {
        int a();

        ContentInfo b();

        ClipData c();

        int getFlags();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ClipData f46585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f46586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f46587c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f46588d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Bundle f46589e;

        g(C0718d c0718d) {
            this.f46585a = (ClipData) m0.g.g(c0718d.f46579a);
            this.f46586b = m0.g.c(c0718d.f46580b, 0, 5, "source");
            this.f46587c = m0.g.f(c0718d.f46581c, 1);
            this.f46588d = c0718d.f46582d;
            this.f46589e = c0718d.f46583e;
        }

        @Override // n0.d.f
        public int a() {
            return this.f46586b;
        }

        @Override // n0.d.f
        public ContentInfo b() {
            return null;
        }

        @Override // n0.d.f
        public ClipData c() {
            return this.f46585a;
        }

        @Override // n0.d.f
        public int getFlags() {
            return this.f46587c;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f46585a.getDescription());
            sb2.append(", source=");
            sb2.append(d.e(this.f46586b));
            sb2.append(", flags=");
            sb2.append(d.a(this.f46587c));
            if (this.f46588d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f46588d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f46589e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }
    }

    d(f fVar) {
        this.f46576a = fVar;
    }

    static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    static String e(int i10) {
        if (i10 == 0) {
            return "SOURCE_APP";
        }
        if (i10 == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i10 == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i10 == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i10 != 4) {
            return i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT";
        }
        return "SOURCE_AUTOFILL";
    }

    public static d g(ContentInfo contentInfo) {
        return new d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f46576a.c();
    }

    public int c() {
        return this.f46576a.getFlags();
    }

    public int d() {
        return this.f46576a.a();
    }

    public ContentInfo f() {
        ContentInfo contentInfoB = this.f46576a.b();
        Objects.requireNonNull(contentInfoB);
        n0.c.a(contentInfoB);
        return contentInfoB;
    }

    public String toString() {
        return this.f46576a.toString();
    }
}
