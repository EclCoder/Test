package na;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements ha.a.b {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f46958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46959b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    /* synthetic */ e(Parcel parcel, a aVar) {
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
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f46958a == eVar.f46958a && this.f46959b == eVar.f46959b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + com.google.common.primitives.d.a(this.f46958a)) * 31) + this.f46959b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f46958a + ", svcTemporalLayerCount=" + this.f46959b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f46958a);
        parcel.writeInt(this.f46959b);
    }

    public e(float f10, int i10) {
        this.f46958a = f10;
        this.f46959b = i10;
    }

    private e(Parcel parcel) {
        this.f46958a = parcel.readFloat();
        this.f46959b = parcel.readInt();
    }
}
