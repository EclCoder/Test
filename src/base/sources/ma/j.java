package ma;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends i {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45396d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i10) {
            return new j[i10];
        }
    }

    public j(String str, String str2, String str3) {
        super(InternalFrame.ID);
        this.f45394b = str;
        this.f45395c = str2;
        this.f45396d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (r0.c(this.f45395c, jVar.f45395c) && r0.c(this.f45394b, jVar.f45394b) && r0.c(this.f45396d, jVar.f45396d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f45394b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f45395c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f45396d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // ma.i
    public String toString() {
        return this.f45393a + ": domain=" + this.f45394b + ", description=" + this.f45395c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f45393a);
        parcel.writeString(this.f45394b);
        parcel.writeString(this.f45396d);
    }

    j(Parcel parcel) {
        super(InternalFrame.ID);
        this.f45394b = (String) r0.j(parcel.readString());
        this.f45395c = (String) r0.j(parcel.readString());
        this.f45396d = (String) r0.j(parcel.readString());
    }
}
