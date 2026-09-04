package c3;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame;
import java.util.Arrays;
import t1.t;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i {
    public static final Parcelable.Creator<a> CREATOR = new C0125a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f9501e;

    /* JADX INFO: renamed from: c3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0125a implements Parcelable.Creator {
        C0125a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str, String str2, int i10, byte[] bArr) {
        super(ApicFrame.ID);
        this.f9498b = str;
        this.f9499c = str2;
        this.f9500d = i10;
        this.f9501e = bArr;
    }

    @Override // t1.u.b
    public void d(t.b bVar) {
        bVar.J(this.f9501e, this.f9500d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f9500d == aVar.f9500d && c0.c(this.f9498b, aVar.f9498b) && c0.c(this.f9499c, aVar.f9499c) && Arrays.equals(this.f9501e, aVar.f9501e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (527 + this.f9500d) * 31;
        String str = this.f9498b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9499c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f9501e);
    }

    @Override // c3.i
    public String toString() {
        return this.f9526a + ": mimeType=" + this.f9498b + ", description=" + this.f9499c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9498b);
        parcel.writeString(this.f9499c);
        parcel.writeInt(this.f9500d);
        parcel.writeByteArray(this.f9501e);
    }

    a(Parcel parcel) {
        super(ApicFrame.ID);
        this.f9498b = (String) c0.h(parcel.readString());
        this.f9499c = parcel.readString();
        this.f9500d = parcel.readInt();
        this.f9501e = (byte[]) c0.h(parcel.createByteArray());
    }
}
