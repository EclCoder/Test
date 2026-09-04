package ma;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.GeobFrame;
import java.util.Arrays;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f45387e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super(GeobFrame.ID);
        this.f45384b = str;
        this.f45385c = str2;
        this.f45386d = str3;
        this.f45387e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (r0.c(this.f45384b, fVar.f45384b) && r0.c(this.f45385c, fVar.f45385c) && r0.c(this.f45386d, fVar.f45386d) && Arrays.equals(this.f45387e, fVar.f45387e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f45384b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f45385c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f45386d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f45387e);
    }

    @Override // ma.i
    public String toString() {
        return this.f45393a + ": mimeType=" + this.f45384b + ", filename=" + this.f45385c + ", description=" + this.f45386d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f45384b);
        parcel.writeString(this.f45385c);
        parcel.writeString(this.f45386d);
        parcel.writeByteArray(this.f45387e);
    }

    f(Parcel parcel) {
        super(GeobFrame.ID);
        this.f45384b = (String) r0.j(parcel.readString());
        this.f45385c = (String) r0.j(parcel.readString());
        this.f45386d = (String) r0.j(parcel.readString());
        this.f45387e = (byte[]) r0.j(parcel.createByteArray());
    }
}
