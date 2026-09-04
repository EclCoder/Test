package d3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.primitives.i;
import t1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements u.b {
    public static final Parcelable.Creator<a> CREATOR = new C0542a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f36167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f36168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f36169e;

    /* JADX INFO: renamed from: d3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0542a implements Parcelable.Creator {
        C0542a() {
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

    /* synthetic */ a(Parcel parcel, C0542a c0542a) {
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
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f36165a == aVar.f36165a && this.f36166b == aVar.f36166b && this.f36167c == aVar.f36167c && this.f36168d == aVar.f36168d && this.f36169e == aVar.f36169e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + i.b(this.f36165a)) * 31) + i.b(this.f36166b)) * 31) + i.b(this.f36167c)) * 31) + i.b(this.f36168d)) * 31) + i.b(this.f36169e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f36165a + ", photoSize=" + this.f36166b + ", photoPresentationTimestampUs=" + this.f36167c + ", videoStartPosition=" + this.f36168d + ", videoSize=" + this.f36169e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f36165a);
        parcel.writeLong(this.f36166b);
        parcel.writeLong(this.f36167c);
        parcel.writeLong(this.f36168d);
        parcel.writeLong(this.f36169e);
    }

    public a(long j10, long j11, long j12, long j13, long j14) {
        this.f36165a = j10;
        this.f36166b = j11;
        this.f36167c = j12;
        this.f36168d = j13;
        this.f36169e = j14;
    }

    private a(Parcel parcel) {
        this.f36165a = parcel.readLong();
        this.f36166b = parcel.readLong();
        this.f36167c = parcel.readLong();
        this.f36168d = parcel.readLong();
        this.f36169e = parcel.readLong();
    }
}
