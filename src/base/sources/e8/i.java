package e8;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import tn.xQIL.Saucuwx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bitmap f37266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f37267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f37268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f37269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g.b f37270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f37265g = new c(null);
    public static final Parcelable.Creator<i> CREATOR = new b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends g.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final C0563a f37271g = new C0563a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap f37272c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Uri f37273d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f37274e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f37275f;

        /* JADX INFO: renamed from: e8.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0563a {
            public /* synthetic */ C0563a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final List a(Parcel parcel) {
                s.h(parcel, "parcel");
                List listA = g.a.f37258b.a(parcel);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listA) {
                    if (obj instanceof i) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }

            private C0563a() {
            }

            public final void b(Parcel out, int i10, List list) {
                s.h(out, "out");
                s.h(list, Saucuwx.jbcfQzlcEmrIdg);
                out.writeParcelableArray((i[]) list.toArray(new i[0]), i10);
            }
        }

        public i d() {
            return new i(this, null);
        }

        public final Bitmap e() {
            return this.f37272c;
        }

        public final String f() {
            return this.f37275f;
        }

        public final Uri g() {
            return this.f37273d;
        }

        public final boolean h() {
            return this.f37274e;
        }

        public a i(i iVar) {
            return iVar == null ? this : ((a) super.b(iVar)).k(iVar.c()).m(iVar.f()).n(iVar.g()).l(iVar.e());
        }

        public final a j(Parcel parcel) {
            s.h(parcel, "parcel");
            return i((i) parcel.readParcelable(i.class.getClassLoader()));
        }

        public final a k(Bitmap bitmap) {
            this.f37272c = bitmap;
            return this;
        }

        public final a l(String str) {
            this.f37275f = str;
            return this;
        }

        public final a m(Uri uri) {
            this.f37273d = uri;
            return this;
        }

        public final a n(boolean z10) {
            this.f37274e = z10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i createFromParcel(Parcel source) {
            s.h(source, "source");
            return new i(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i[] newArray(int i10) {
            return new i[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ i(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Override // e8.g
    public g.b b() {
        return this.f37270f;
    }

    public final Bitmap c() {
        return this.f37266b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f37269e;
    }

    public final Uri f() {
        return this.f37267c;
    }

    public final boolean g() {
        return this.f37268d;
    }

    @Override // e8.g, android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        s.h(out, "out");
        super.writeToParcel(out, i10);
        out.writeParcelable(this.f37266b, 0);
        out.writeParcelable(this.f37267c, 0);
        out.writeByte(this.f37268d ? (byte) 1 : (byte) 0);
        out.writeString(this.f37269e);
    }

    private i(a aVar) {
        super(aVar);
        this.f37270f = g.b.PHOTO;
        this.f37266b = aVar.e();
        this.f37267c = aVar.g();
        this.f37268d = aVar.h();
        this.f37269e = aVar.f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Parcel parcel) {
        super(parcel);
        s.h(parcel, "parcel");
        this.f37270f = g.b.PHOTO;
        this.f37266b = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f37267c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f37268d = parcel.readByte() != 0;
        this.f37269e = parcel.readString();
    }
}
