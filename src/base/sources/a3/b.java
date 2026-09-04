package a3;

import android.os.Parcel;
import android.os.Parcelable;
import sc.c;
import t1.t;
import t1.u;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b implements u.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111b;

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
        this.f110a = c.f(str);
        this.f111b = str2;
    }

    @Override // t1.u.b
    public void d(t.b bVar) {
        String str = this.f110a;
        str.getClass();
        switch (str) {
            case "ALBUM":
                bVar.O(this.f111b);
                break;
            case "TITLE":
                bVar.n0(this.f111b);
                break;
            case "DESCRIPTION":
                bVar.V(this.f111b);
                break;
            case "ALBUMARTIST":
                bVar.N(this.f111b);
                break;
            case "ARTIST":
                bVar.P(this.f111b);
                break;
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
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f110a.equals(bVar.f110a) && this.f111b.equals(bVar.f111b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f110a.hashCode()) * 31) + this.f111b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f110a + "=" + this.f111b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f110a);
        parcel.writeString(this.f111b);
    }

    protected b(Parcel parcel) {
        this.f110a = (String) c0.h(parcel.readString());
        this.f111b = (String) c0.h(parcel.readString());
    }
}
