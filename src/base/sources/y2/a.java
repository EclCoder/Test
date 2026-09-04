package y2;

import android.os.Parcel;
import android.os.Parcelable;
import t1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements u.b {
    public static final Parcelable.Creator<a> CREATOR = new C0876a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57141b;

    /* JADX INFO: renamed from: y2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0876a implements Parcelable.Creator {
        C0876a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel.readInt(), (String) w1.a.e(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, String str) {
        this.f57140a = i10;
        this.f57141b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Ait(controlCode=" + this.f57140a + ",url=" + this.f57141b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f57141b);
        parcel.writeInt(this.f57140a);
    }
}
