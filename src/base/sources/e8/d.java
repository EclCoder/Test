package e8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f37240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f37241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f37242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f37243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f37244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e f37245f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Uri f37246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f37247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f37248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f37249d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f37250e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private e f37251f;

        public final Uri a() {
            return this.f37246a;
        }

        public final e b() {
            return this.f37251f;
        }

        public final String c() {
            return this.f37249d;
        }

        public final List d() {
            return this.f37247b;
        }

        public final String e() {
            return this.f37248c;
        }

        public final String f() {
            return this.f37250e;
        }

        public a g(d dVar) {
            if (dVar != null) {
                return h(dVar.a()).j(dVar.c()).k(dVar.e()).i(dVar.b()).l(dVar.f()).m(dVar.g());
            }
            s.f(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareContent.Builder");
            return this;
        }

        public final a h(Uri uri) {
            this.f37246a = uri;
            s.f(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareContent.Builder");
            return this;
        }

        public final a i(String str) {
            this.f37249d = str;
            s.f(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareContent.Builder");
            return this;
        }

        public final a j(List list) {
            this.f37247b = list == null ? null : Collections.unmodifiableList(list);
            s.f(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareContent.Builder");
            return this;
        }

        public final a k(String str) {
            this.f37248c = str;
            s.f(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareContent.Builder");
            return this;
        }

        public final a l(String str) {
            this.f37250e = str;
            s.f(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareContent.Builder");
            return this;
        }

        public final a m(e eVar) {
            this.f37251f = eVar;
            s.f(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareContent.Builder");
            return this;
        }
    }

    protected d(a builder) {
        s.h(builder, "builder");
        this.f37240a = builder.a();
        this.f37241b = builder.d();
        this.f37242c = builder.e();
        this.f37243d = builder.c();
        this.f37244e = builder.f();
        this.f37245f = builder.b();
    }

    private final List i(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Uri a() {
        return this.f37240a;
    }

    public final String b() {
        return this.f37243d;
    }

    public final List c() {
        return this.f37241b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f37242c;
    }

    public final String f() {
        return this.f37244e;
    }

    public final e g() {
        return this.f37245f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        s.h(out, "out");
        out.writeParcelable(this.f37240a, 0);
        out.writeStringList(this.f37241b);
        out.writeString(this.f37242c);
        out.writeString(this.f37243d);
        out.writeString(this.f37244e);
        out.writeParcelable(this.f37245f, 0);
    }

    protected d(Parcel parcel) {
        s.h(parcel, "parcel");
        this.f37240a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f37241b = i(parcel);
        this.f37242c = parcel.readString();
        this.f37243d = parcel.readString();
        this.f37244e = parcel.readString();
        this.f37245f = new e.a().d(parcel).a();
    }
}
