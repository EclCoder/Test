package d3;

import android.os.Parcel;
import android.os.Parcelable;
import t1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d implements u.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f36175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36176b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    /* synthetic */ d(Parcel parcel, a aVar) {
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
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f36175a == dVar.f36175a && this.f36176b == dVar.f36176b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + com.google.common.primitives.d.a(this.f36175a)) * 31) + this.f36176b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f36175a + ", svcTemporalLayerCount=" + this.f36176b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f36175a);
        parcel.writeInt(this.f36176b);
    }

    public d(float f10, int i10) {
        this.f36175a = f10;
        this.f36176b = i10;
    }

    private d(Parcel parcel) {
        this.f36175a = parcel.readFloat();
        this.f36176b = parcel.readInt();
    }
}
