package la;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.z0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements ha.a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f44075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44077c;

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
        this.f44075a = bArr;
        this.f44076b = str;
        this.f44077c = str2;
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
        return Arrays.equals(this.f44075a, ((c) obj).f44075a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f44075a);
    }

    @Override // ha.a.b
    public void r(z0.b bVar) {
        String str = this.f44076b;
        if (str != null) {
            bVar.m0(str);
        }
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f44076b, this.f44077c, Integer.valueOf(this.f44075a.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f44075a);
        parcel.writeString(this.f44076b);
        parcel.writeString(this.f44077c);
    }

    c(Parcel parcel) {
        this.f44075a = (byte[]) ob.a.e(parcel.createByteArray());
        this.f44076b = parcel.readString();
        this.f44077c = parcel.readString();
    }
}
