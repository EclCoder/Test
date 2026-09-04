package e8;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends d implements Parcelable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f37289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f37290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final i f37291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final l f37292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f37288k = new b(null);
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            s.h(parcel, "parcel");
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Parcel parcel) {
        super(parcel);
        s.h(parcel, "parcel");
        this.f37289g = parcel.readString();
        this.f37290h = parcel.readString();
        i.a aVarJ = new i.a().j(parcel);
        this.f37291i = (aVarJ.g() == null && aVarJ.e() == null) ? null : aVarJ.d();
        this.f37292j = new l.a().g(parcel).d();
    }

    @Override // e8.d, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String j() {
        return this.f37289g;
    }

    public final String l() {
        return this.f37290h;
    }

    public final i n() {
        return this.f37291i;
    }

    public final l o() {
        return this.f37292j;
    }

    @Override // e8.d, android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        s.h(out, "out");
        super.writeToParcel(out, i10);
        out.writeString(this.f37289g);
        out.writeString(this.f37290h);
        out.writeParcelable(this.f37291i, 0);
        out.writeParcelable(this.f37292j, 0);
    }
}
