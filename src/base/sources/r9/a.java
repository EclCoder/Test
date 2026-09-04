package r9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.primitives.i;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements ha.a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0788a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f51173a;

    /* JADX INFO: renamed from: r9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0788a implements Parcelable.Creator {
        C0788a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, C0788a c0788a) {
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
        return (obj instanceof a) && this.f51173a == ((a) obj).f51173a;
    }

    public int hashCode() {
        return i.b(this.f51173a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Creation time: ");
        long j10 = this.f51173a;
        sb2.append(j10 == -2082844800000L ? "unset" : Long.valueOf(j10));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f51173a);
    }

    public a(long j10) {
        this.f51173a = j10;
    }

    private a(Parcel parcel) {
        this.f51173a = parcel.readLong();
    }
}
