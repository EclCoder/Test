package d8;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends e8.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f36443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f36444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f36445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f36446j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f36447k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f36448l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f36449m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f36442n = new b(null);
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i createFromParcel(Parcel parcel) {
            s.h(parcel, "parcel");
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i[] newArray(int i10) {
            return new i[i10];
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
    public i(Parcel parcel) {
        super(parcel);
        s.h(parcel, "parcel");
        this.f36443g = parcel.readString();
        this.f36444h = parcel.readString();
        this.f36445i = parcel.readString();
        this.f36446j = parcel.readString();
        this.f36447k = parcel.readString();
        this.f36448l = parcel.readString();
        this.f36449m = parcel.readString();
    }

    @Override // e8.d, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String j() {
        return this.f36444h;
    }

    public final String l() {
        return this.f36446j;
    }

    public final String n() {
        return this.f36447k;
    }

    public final String o() {
        return this.f36445i;
    }

    public final String p() {
        return this.f36449m;
    }

    public final String q() {
        return this.f36448l;
    }

    public final String s() {
        return this.f36443g;
    }

    @Override // e8.d, android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        s.h(out, "out");
        super.writeToParcel(out, i10);
        out.writeString(this.f36443g);
        out.writeString(this.f36444h);
        out.writeString(this.f36445i);
        out.writeString(this.f36446j);
        out.writeString(this.f36447k);
        out.writeString(this.f36448l);
        out.writeString(this.f36449m);
    }
}
