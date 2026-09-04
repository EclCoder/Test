package x1;

import android.os.Parcel;
import android.os.Parcelable;
import t1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b implements u.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f56569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f56570b;

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
            if (this.f56569a == bVar.f56569a && this.f56570b == bVar.f56570b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + com.google.common.primitives.d.a(this.f56569a)) * 31) + com.google.common.primitives.d.a(this.f56570b);
    }

    public String toString() {
        return "xyz: latitude=" + this.f56569a + ", longitude=" + this.f56570b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f56569a);
        parcel.writeFloat(this.f56570b);
    }

    public b(float f10, float f11) {
        w1.a.b(f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f, "Invalid latitude or longitude");
        this.f56569a = f10;
        this.f56570b = f11;
    }

    private b(Parcel parcel) {
        this.f56569a = parcel.readFloat();
        this.f56570b = parcel.readFloat();
    }
}
