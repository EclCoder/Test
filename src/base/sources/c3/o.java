package c3;

import android.os.Parcel;
import android.os.Parcelable;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class o extends i {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9542c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public o[] newArray(int i10) {
            return new o[i10];
        }
    }

    public o(String str, String str2, String str3) {
        super(str);
        this.f9541b = str2;
        this.f9542c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f9526a.equals(oVar.f9526a) && c0.c(this.f9541b, oVar.f9541b) && c0.c(this.f9542c, oVar.f9542c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f9526a.hashCode()) * 31;
        String str = this.f9541b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9542c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // c3.i
    public String toString() {
        return this.f9526a + ": url=" + this.f9542c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9526a);
        parcel.writeString(this.f9541b);
        parcel.writeString(this.f9542c);
    }

    o(Parcel parcel) {
        super((String) c0.h(parcel.readString()));
        this.f9541b = parcel.readString();
        this.f9542c = (String) c0.h(parcel.readString());
    }
}
