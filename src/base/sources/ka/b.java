package ka;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.google.android.exoplayer2.z0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b implements ha.a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43105b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(String str, String str2) {
        this.f43104a = str;
        this.f43105b = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f43104a.equals(bVar.f43104a) && this.f43105b.equals(bVar.f43105b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f43104a.hashCode()) * 31) + this.f43105b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f43104a + "=" + this.f43105b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f43104a);
        parcel.writeString(this.f43105b);
    }

    @Override // ha.a.b
    public void r(z0.b bVar) {
        String str = this.f43104a;
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    b10 = 0;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b10 = 1;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b10 = 2;
                }
                break;
            case 1746739798:
                if (str.equals(obFGmWgqyy.ZcuXJBWAWxoNhB)) {
                    b10 = 3;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b10 = 4;
                }
                break;
        }
        switch (b10) {
            case 0:
                bVar.N(this.f43105b);
                break;
            case 1:
                bVar.m0(this.f43105b);
                break;
            case 2:
                bVar.U(this.f43105b);
                break;
            case 3:
                bVar.M(this.f43105b);
                break;
            case 4:
                bVar.O(this.f43105b);
                break;
        }
    }

    protected b(Parcel parcel) {
        this.f43104a = (String) r0.j(parcel.readString());
        this.f43105b = (String) r0.j(parcel.readString());
    }
}
