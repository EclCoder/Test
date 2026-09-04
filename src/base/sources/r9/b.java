package r9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.primitives.d;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements ha.a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f51174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f51175b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* synthetic */ b(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f51174a == bVar.f51174a && this.f51175b == bVar.f51175b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + d.a(this.f51174a)) * 31) + d.a(this.f51175b);
    }

    public String toString() {
        return "xyz: latitude=" + this.f51174a + ", longitude=" + this.f51175b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f51174a);
        parcel.writeFloat(this.f51175b);
    }

    public b(float f10, float f11) {
        ob.a.b(f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f, "Invalid latitude or longitude");
        this.f51174a = f10;
        this.f51175b = f11;
    }

    private b(Parcel parcel) {
        this.f51174a = parcel.readFloat();
        this.f51175b = parcel.readFloat();
    }
}
