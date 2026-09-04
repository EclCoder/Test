package e8;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f37237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private e8.a f37238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private e8.b f37239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f37236j = new b(null);
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            s.h(parcel, "parcel");
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
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
    public c(Parcel parcel) {
        super(parcel);
        s.h(parcel, "parcel");
        this.f37237g = parcel.readString();
        this.f37238h = new e8.a.C0560a().c(parcel).a();
        this.f37239i = new e8.b.a().c(parcel).a();
    }

    public final e8.a j() {
        return this.f37238h;
    }

    public final String l() {
        return this.f37237g;
    }

    public final e8.b n() {
        return this.f37239i;
    }

    @Override // e8.d, android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        s.h(out, "out");
        super.writeToParcel(out, i10);
        out.writeString(this.f37237g);
        out.writeParcelable(this.f37238h, 0);
        out.writeParcelable(this.f37239i, 0);
    }
}
