package e8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f37285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g.b f37286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f37284d = new c(null);
    public static final Parcelable.Creator<l> CREATOR = new b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends g.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Uri f37287c;

        public l d() {
            return new l(this, null);
        }

        public final Uri e() {
            return this.f37287c;
        }

        public a f(l lVar) {
            return lVar == null ? this : h(lVar.c());
        }

        public final a g(Parcel parcel) {
            s.h(parcel, "parcel");
            return f((l) parcel.readParcelable(l.class.getClassLoader()));
        }

        public final a h(Uri uri) {
            this.f37287c = uri;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel source) {
            s.h(source, "source");
            return new l(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i10) {
            return new l[i10];
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

    public /* synthetic */ l(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Override // e8.g
    public g.b b() {
        return this.f37286c;
    }

    public final Uri c() {
        return this.f37285b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // e8.g, android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        s.h(out, "out");
        super.writeToParcel(out, i10);
        out.writeParcelable(this.f37285b, 0);
    }

    private l(a aVar) {
        super(aVar);
        this.f37286c = g.b.VIDEO;
        this.f37285b = aVar.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Parcel parcel) {
        super(parcel);
        s.h(parcel, "parcel");
        this.f37286c = g.b.VIDEO;
        this.f37285b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
