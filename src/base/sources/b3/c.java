package b3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t1.t;
import t1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c implements u.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f8315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8317c;

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

    public c(byte[] bArr, String str, String str2) {
        this.f8315a = bArr;
        this.f8316b = str;
        this.f8317c = str2;
    }

    @Override // t1.u.b
    public void d(t.b bVar) {
        String str = this.f8316b;
        if (str != null) {
            bVar.n0(str);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8315a, ((c) obj).f8315a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f8315a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f8316b, this.f8317c, Integer.valueOf(this.f8315a.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f8315a);
        parcel.writeString(this.f8316b);
        parcel.writeString(this.f8317c);
    }

    c(Parcel parcel) {
        this.f8315a = (byte[]) w1.a.e(parcel.createByteArray());
        this.f8316b = parcel.readString();
        this.f8317c = parcel.readString();
    }
}
