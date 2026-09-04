package ma;

import android.os.Parcel;
import android.os.Parcelable;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45408c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i10) {
            return new n[i10];
        }
    }

    public n(String str, String str2, String str3) {
        super(str);
        this.f45407b = str2;
        this.f45408c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (this.f45393a.equals(nVar.f45393a) && r0.c(this.f45407b, nVar.f45407b) && r0.c(this.f45408c, nVar.f45408c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f45393a.hashCode()) * 31;
        String str = this.f45407b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f45408c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // ma.i
    public String toString() {
        return this.f45393a + ": url=" + this.f45408c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f45393a);
        parcel.writeString(this.f45407b);
        parcel.writeString(this.f45408c);
    }

    n(Parcel parcel) {
        super((String) r0.j(parcel.readString()));
        this.f45407b = parcel.readString();
        this.f45408c = (String) r0.j(parcel.readString());
    }
}
