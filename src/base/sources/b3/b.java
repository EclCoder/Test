package b3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import t1.t;
import t1.u;
import w1.c0;
import w1.n;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b implements u.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8314f;

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
        w1.a.a(i11 == -1 || i11 > 0);
        this.f8309a = i10;
        this.f8310b = str;
        this.f8311c = str2;
        this.f8312d = str3;
        this.f8313e = z10;
        this.f8314f = i11;
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
                        n.h("IcyHeaders", "Invalid bitrate: " + str3);
                        z10 = false;
                        i11 = -1;
                    } catch (NumberFormatException unused) {
                        n.h("IcyHeaders", "Invalid bitrate header: " + str3);
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
            zEquals = ((String) list5.get(0)).equals("1");
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
                        n.h("IcyHeaders", "Invalid metadata interval: " + str5);
                        z11 = z10;
                    } catch (NumberFormatException unused3) {
                        i12 = i13;
                        n.h("IcyHeaders", "Invalid metadata interval: " + str5);
                    }
                }
                z10 = z11;
            } catch (NumberFormatException unused4) {
            }
        }
        return z10 ? new b(i10, str4, str, str2, zEquals, i12) : null;
    }

    @Override // t1.u.b
    public void d(t.b bVar) {
        String str = this.f8311c;
        if (str != null) {
            bVar.l0(str);
        }
        String str2 = this.f8310b;
        if (str2 != null) {
            bVar.b0(str2);
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
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f8309a == bVar.f8309a && c0.c(this.f8310b, bVar.f8310b) && c0.c(this.f8311c, bVar.f8311c) && c0.c(this.f8312d, bVar.f8312d) && this.f8313e == bVar.f8313e && this.f8314f == bVar.f8314f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (527 + this.f8309a) * 31;
        String str = this.f8310b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8311c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8312d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f8313e ? 1 : 0)) * 31) + this.f8314f;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f8311c + "\", genre=\"" + this.f8310b + "\", bitrate=" + this.f8309a + ", metadataInterval=" + this.f8314f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f8309a);
        parcel.writeString(this.f8310b);
        parcel.writeString(this.f8311c);
        parcel.writeString(this.f8312d);
        c0.d1(parcel, this.f8313e);
        parcel.writeInt(this.f8314f);
    }

    b(Parcel parcel) {
        this.f8309a = parcel.readInt();
        this.f8310b = parcel.readString();
        this.f8311c = parcel.readString();
        this.f8312d = parcel.readString();
        this.f8313e = c0.L0(parcel);
        this.f8314f = parcel.readInt();
    }
}
