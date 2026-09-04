package e8;

import android.os.Parcel;
import android.os.Parcelable;
import gl.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g f37280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f37281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f37282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f37283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f37279k = new b(null);
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            s.h(parcel, "parcel");
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i10) {
            return new k[i10];
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
    public k(Parcel parcel) {
        super(parcel);
        s.h(parcel, "parcel");
        this.f37280g = (g) parcel.readParcelable(g.class.getClassLoader());
        this.f37281h = (i) parcel.readParcelable(i.class.getClassLoader());
        this.f37282i = i(parcel);
        this.f37283j = parcel.readString();
    }

    private final List i(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return r.I0(arrayList);
    }

    @Override // e8.d, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String j() {
        return this.f37283j;
    }

    public final g l() {
        return this.f37280g;
    }

    public final List n() {
        List list = this.f37282i;
        if (list != null) {
            return r.I0(list);
        }
        return null;
    }

    public final i o() {
        return this.f37281h;
    }

    @Override // e8.d, android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        s.h(out, "out");
        super.writeToParcel(out, i10);
        out.writeParcelable(this.f37280g, 0);
        out.writeParcelable(this.f37281h, 0);
        out.writeStringList(n());
        out.writeString(this.f37283j);
    }
}
