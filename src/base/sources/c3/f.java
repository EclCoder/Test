package c3;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.GeobFrame;
import java.util.Arrays;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f9520e;

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
        this.f9517b = str;
        this.f9518c = str2;
        this.f9519d = str3;
        this.f9520e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (c0.c(this.f9517b, fVar.f9517b) && c0.c(this.f9518c, fVar.f9518c) && c0.c(this.f9519d, fVar.f9519d) && Arrays.equals(this.f9520e, fVar.f9520e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f9517b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9518c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9519d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f9520e);
    }

    @Override // c3.i
    public String toString() {
        return this.f9526a + ": mimeType=" + this.f9517b + ", filename=" + this.f9518c + ", description=" + this.f9519d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9517b);
        parcel.writeString(this.f9518c);
        parcel.writeString(this.f9519d);
        parcel.writeByteArray(this.f9520e);
    }

    f(Parcel parcel) {
        super(GeobFrame.ID);
        this.f9517b = (String) c0.h(parcel.readString());
        this.f9518c = (String) c0.h(parcel.readString());
        this.f9519d = (String) c0.h(parcel.readString());
        this.f9520e = (byte[]) c0.h(parcel.createByteArray());
    }
}
