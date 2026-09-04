package na;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.primitives.i;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements ha.a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f46951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f46952e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, null);
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
            if (this.f46948a == bVar.f46948a && this.f46949b == bVar.f46949b && this.f46950c == bVar.f46950c && this.f46951d == bVar.f46951d && this.f46952e == bVar.f46952e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + i.b(this.f46948a)) * 31) + i.b(this.f46949b)) * 31) + i.b(this.f46950c)) * 31) + i.b(this.f46951d)) * 31) + i.b(this.f46952e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f46948a + ", photoSize=" + this.f46949b + ", photoPresentationTimestampUs=" + this.f46950c + ", videoStartPosition=" + this.f46951d + ", videoSize=" + this.f46952e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f46948a);
        parcel.writeLong(this.f46949b);
        parcel.writeLong(this.f46950c);
        parcel.writeLong(this.f46951d);
        parcel.writeLong(this.f46952e);
    }

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f46948a = j10;
        this.f46949b = j11;
        this.f46950c = j12;
        this.f46951d = j13;
        this.f46952e = j14;
    }

    private b(Parcel parcel) {
        this.f46948a = parcel.readLong();
        this.f46949b = parcel.readLong();
        this.f46950c = parcel.readLong();
        this.f46951d = parcel.readLong();
        this.f46952e = parcel.readLong();
    }
}
