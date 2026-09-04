package qa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.g;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements Comparable, Parcelable, g {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f50515d = r0.y0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f50516e = r0.y0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f50517f = r0.y0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50520c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(int i10, int i11, int i12) {
        this.f50518a = i10;
        this.f50519b = i11;
        this.f50520c = i12;
    }

    public static c b(Bundle bundle) {
        return new c(bundle.getInt(f50515d, 0), bundle.getInt(f50516e, 0), bundle.getInt(f50517f, 0));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        int i10 = this.f50518a - cVar.f50518a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f50519b - cVar.f50519b;
        return i11 == 0 ? this.f50520c - cVar.f50520c : i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f50518a == cVar.f50518a && this.f50519b == cVar.f50519b && this.f50520c == cVar.f50520c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f50518a * 31) + this.f50519b) * 31) + this.f50520c;
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i10 = this.f50518a;
        if (i10 != 0) {
            bundle.putInt(f50515d, i10);
        }
        int i11 = this.f50519b;
        if (i11 != 0) {
            bundle.putInt(f50516e, i11);
        }
        int i12 = this.f50520c;
        if (i12 != 0) {
            bundle.putInt(f50517f, i12);
        }
        return bundle;
    }

    public String toString() {
        return this.f50518a + "." + this.f50519b + "." + this.f50520c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f50518a);
        parcel.writeInt(this.f50519b);
        parcel.writeInt(this.f50520c);
    }

    c(Parcel parcel) {
        this.f50518a = parcel.readInt();
        this.f50519b = parcel.readInt();
        this.f50520c = parcel.readInt();
    }
}
