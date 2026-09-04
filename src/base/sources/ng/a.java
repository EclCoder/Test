package ng;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends c implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0732a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uri f47676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f47677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f47678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f47679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f47680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f47681j;

    /* JADX INFO: renamed from: ng.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0732a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            s.h(parcel, "parcel");
            return new a((Uri) parcel.readParcelable(a.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public /* synthetic */ a(Uri uri, String str, String str2, String str3, long j10, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, str, str2, str3, j10, (i10 & 32) != 0 ? false : z10);
    }

    @Override // ng.c
    public String a() {
        return this.f47678g;
    }

    @Override // ng.c
    public Uri b() {
        return this.f47676e;
    }

    public final long c() {
        return this.f47680i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String e() {
        return this.f47679h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.c(this.f47676e, aVar.f47676e) && s.c(this.f47677f, aVar.f47677f) && s.c(this.f47678g, aVar.f47678g) && s.c(this.f47679h, aVar.f47679h) && this.f47680i == aVar.f47680i && this.f47681j == aVar.f47681j;
    }

    public String f() {
        return this.f47677f;
    }

    public final boolean g() {
        return this.f47681j;
    }

    public int hashCode() {
        int iHashCode = ((this.f47676e.hashCode() * 31) + this.f47677f.hashCode()) * 31;
        String str = this.f47678g;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f47679h.hashCode()) * 31) + Long.hashCode(this.f47680i)) * 31) + Boolean.hashCode(this.f47681j);
    }

    public final void i(boolean z10) {
        this.f47681j = z10;
    }

    public String toString() {
        return "AudioItem(uri=" + this.f47676e + ", path=" + this.f47677f + ", bucket=" + this.f47678g + ", name=" + this.f47679h + ", duration=" + this.f47680i + ", isPlaying=" + this.f47681j + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        s.h(dest, "dest");
        dest.writeParcelable(this.f47676e, i10);
        dest.writeString(this.f47677f);
        dest.writeString(this.f47678g);
        dest.writeString(this.f47679h);
        dest.writeLong(this.f47680i);
        dest.writeInt(this.f47681j ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Uri uri, String path, String str, String name, long j10, boolean z10) {
        super(uri, path, str, name);
        s.h(uri, "uri");
        s.h(path, "path");
        s.h(name, "name");
        this.f47676e = uri;
        this.f47677f = path;
        this.f47678g = str;
        this.f47679h = name;
        this.f47680i = j10;
        this.f47681j = z10;
    }
}
