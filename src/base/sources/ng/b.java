package ng;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends c implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f47682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f47683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f47684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f47685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f47686i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f47687j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f47688k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            s.h(parcel, "parcel");
            return new b(parcel.readString(), (Uri) parcel.readParcelable(b.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public /* synthetic */ b(String str, Uri uri, String str2, String str3, String str4, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? sh.b.l() : str, uri, str2, str3, str4, (i11 & 32) != 0 ? -1 : i10, z10);
    }

    @Override // ng.c
    public String a() {
        return this.f47685h;
    }

    @Override // ng.c
    public Uri b() {
        return this.f47683f;
    }

    public final String c() {
        return this.f47682e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String e() {
        return this.f47686i;
    }

    public String f() {
        return this.f47684g;
    }

    public final int g() {
        return this.f47687j;
    }

    public final boolean i() {
        return this.f47688k;
    }

    public final void j(int i10) {
        this.f47687j = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        s.h(dest, "dest");
        dest.writeString(this.f47682e);
        dest.writeParcelable(this.f47683f, i10);
        dest.writeString(this.f47684g);
        dest.writeString(this.f47685h);
        dest.writeString(this.f47686i);
        dest.writeInt(this.f47687j);
        dest.writeInt(this.f47688k ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String id2, Uri uri, String path, String str, String name, int i10, boolean z10) {
        super(uri, path, str, name);
        s.h(id2, "id");
        s.h(uri, "uri");
        s.h(path, "path");
        s.h(name, "name");
        this.f47682e = id2;
        this.f47683f = uri;
        this.f47684g = path;
        this.f47685h = str;
        this.f47686i = name;
        this.f47687j = i10;
        this.f47688k = z10;
    }
}
