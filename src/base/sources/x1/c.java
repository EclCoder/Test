package x1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.primitives.i;
import t1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c implements u.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f56571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f56572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f56573c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* synthetic */ c(Parcel parcel, a aVar) {
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
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f56571a == cVar.f56571a && this.f56572b == cVar.f56572b && this.f56573c == cVar.f56573c;
    }

    public int hashCode() {
        return ((((527 + i.b(this.f56571a)) * 31) + i.b(this.f56572b)) * 31) + i.b(this.f56573c);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.f56571a + ", modification time=" + this.f56572b + ", timescale=" + this.f56573c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f56571a);
        parcel.writeLong(this.f56572b);
        parcel.writeLong(this.f56573c);
    }

    public c(long j10, long j11, long j12) {
        this.f56571a = j10;
        this.f56572b = j11;
        this.f56573c = j12;
    }

    private c(Parcel parcel) {
        this.f56571a = parcel.readLong();
        this.f56572b = parcel.readLong();
        this.f56573c = parcel.readLong();
    }
}
