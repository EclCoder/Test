package c3;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9530d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(String str, String str2, String str3) {
        super(InternalFrame.ID);
        this.f9528b = str;
        this.f9529c = str2;
        this.f9530d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (c0.c(this.f9529c, kVar.f9529c) && c0.c(this.f9528b, kVar.f9528b) && c0.c(this.f9530d, kVar.f9530d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f9528b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9529c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9530d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // c3.i
    public String toString() {
        return this.f9526a + ": domain=" + this.f9528b + ", description=" + this.f9529c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9526a);
        parcel.writeString(this.f9528b);
        parcel.writeString(this.f9530d);
    }

    k(Parcel parcel) {
        super(InternalFrame.ID);
        this.f9528b = (String) c0.h(parcel.readString());
        this.f9529c = (String) c0.h(parcel.readString());
        this.f9530d = (String) c0.h(parcel.readString());
    }
}
