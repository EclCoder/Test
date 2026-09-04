package la;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import java.util.List;
import java.util.Map;
import ob.r0;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements ha.a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f44073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f44074f;

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

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        ob.a.a(i11 == -1 || i11 > 0);
        this.f44069a = i10;
        this.f44070b = str;
        this.f44071c = str2;
        this.f44072d = str3;
        this.f44073e = z10;
        this.f44074f = i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f44069a == bVar.f44069a && r0.c(this.f44070b, bVar.f44070b) && r0.c(this.f44071c, bVar.f44071c) && r0.c(this.f44072d, bVar.f44072d) && this.f44073e == bVar.f44073e && this.f44074f == bVar.f44074f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (527 + this.f44069a) * 31;
        String str = this.f44070b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f44071c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f44072d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f44073e ? 1 : 0)) * 31) + this.f44074f;
    }

    @Override // ha.a.b
    public void r(z0.b bVar) {
        String str = this.f44071c;
        if (str != null) {
            bVar.k0(str);
        }
        String str2 = this.f44070b;
        if (str2 != null) {
            bVar.Z(str2);
        }
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f44071c + "\", genre=\"" + this.f44070b + "\", bitrate=" + this.f44069a + ", metadataInterval=" + this.f44074f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f44069a);
        parcel.writeString(this.f44070b);
        parcel.writeString(this.f44071c);
        parcel.writeString(this.f44072d);
        r0.j1(parcel, this.f44073e);
        parcel.writeInt(this.f44074f);
    }

    public static b a(Map map) {
        boolean z10;
        int i10;
        String str;
        String str2;
        boolean zEquals;
        int i11;
        List list = (List) map.get("icy-br");
        boolean z11 = true;
        int i12 = -1;
        if (list != null) {
            String str3 = (String) list.get(0);
            try {
                i11 = Integer.parseInt(str3) * 1000;
                if (i11 > 0) {
                    z10 = true;
                } else {
                    try {
                        u.i("IcyHeaders", "Invalid bitrate: " + str3);
                        z10 = false;
                        i11 = -1;
                    } catch (NumberFormatException unused) {
                        u.i("IcyHeaders", "Invalid bitrate header: " + str3);
                        z10 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i11 = -1;
            }
            i10 = i11;
        } else {
            z10 = false;
            i10 = -1;
        }
        List list2 = (List) map.get("icy-genre");
        String str4 = null;
        if (list2 != null) {
            str4 = (String) list2.get(0);
            z10 = true;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str = (String) list3.get(0);
            z10 = true;
        } else {
            str = str4;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str2 = (String) list4.get(0);
            z10 = true;
        } else {
            str2 = str4;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals(KPtaxpyICj.ykGRKXUliFW);
            z10 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i13 = Integer.parseInt(str5);
                if (i13 > 0) {
                    i12 = i13;
                } else {
                    try {
                        u.i("IcyHeaders", "Invalid metadata interval: " + str5);
                        z11 = z10;
                    } catch (NumberFormatException unused3) {
                        i12 = i13;
                        u.i("IcyHeaders", "Invalid metadata interval: " + str5);
                    }
                }
                z10 = z11;
            } catch (NumberFormatException unused4) {
            }
        }
        return z10 ? new b(i10, str4, str, str2, zEquals, i12) : null;
    }

    b(Parcel parcel) {
        this.f44069a = parcel.readInt();
        this.f44070b = parcel.readString();
        this.f44071c = parcel.readString();
        this.f44072d = parcel.readString();
        this.f44073e = r0.R0(parcel);
        this.f44074f = parcel.readInt();
    }
}
