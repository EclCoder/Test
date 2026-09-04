package ma;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame;
import java.util.Arrays;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends i {
    public static final Parcelable.Creator<a> CREATOR = new C0690a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f45368e;

    /* JADX INFO: renamed from: ma.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0690a implements Parcelable.Creator {
        C0690a() {
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
        this.f45365b = str;
        this.f45366c = str2;
        this.f45367d = i10;
        this.f45368e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f45367d == aVar.f45367d && r0.c(this.f45365b, aVar.f45365b) && r0.c(this.f45366c, aVar.f45366c) && Arrays.equals(this.f45368e, aVar.f45368e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (527 + this.f45367d) * 31;
        String str = this.f45365b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f45366c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f45368e);
    }

    @Override // ha.a.b
    public void r(z0.b bVar) {
        bVar.I(this.f45368e, this.f45367d);
    }

    @Override // ma.i
    public String toString() {
        return this.f45393a + ": mimeType=" + this.f45365b + ", description=" + this.f45366c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f45365b);
        parcel.writeString(this.f45366c);
        parcel.writeInt(this.f45367d);
        parcel.writeByteArray(this.f45368e);
    }

    a(Parcel parcel) {
        super(ApicFrame.ID);
        this.f45365b = (String) r0.j(parcel.readString());
        this.f45366c = parcel.readString();
        this.f45367d = parcel.readInt();
        this.f45368e = (byte[]) r0.j(parcel.createByteArray());
    }
}
