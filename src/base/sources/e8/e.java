package e8;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f37252b = new c(null);
    public static final Parcelable.Creator<e> CREATOR = new b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f37254a;

        public e a() {
            return new e(this, null);
        }

        public final String b() {
            return this.f37254a;
        }

        public a c(e eVar) {
            return eVar == null ? this : e(eVar.a());
        }

        public final a d(Parcel parcel) {
            s.h(parcel, "parcel");
            return c((e) parcel.readParcelable(e.class.getClassLoader()));
        }

        public final a e(String str) {
            this.f37254a = str;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel source) {
            s.h(source, "source");
            return new e(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
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

    public /* synthetic */ e(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public final String a() {
        return this.f37253a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        s.h(dest, "dest");
        dest.writeString(this.f37253a);
    }

    private e(a aVar) {
        this.f37253a = aVar.b();
    }

    public e(Parcel parcel) {
        s.h(parcel, "parcel");
        this.f37253a = parcel.readString();
    }
}
