package na;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements ha.a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0724a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f46945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46947d;

    /* JADX INFO: renamed from: na.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0724a implements Parcelable.Creator {
        C0724a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, C0724a c0724a) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f46944a.equals(aVar.f46944a) && Arrays.equals(this.f46945b, aVar.f46945b) && this.f46946c == aVar.f46946c && this.f46947d == aVar.f46947d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f46944a.hashCode()) * 31) + Arrays.hashCode(this.f46945b)) * 31) + this.f46946c) * 31) + this.f46947d;
    }

    public String toString() {
        String strE;
        int i10 = this.f46947d;
        if (i10 == 1) {
            strE = r0.E(this.f46945b);
        } else if (i10 != 23) {
            strE = i10 != 67 ? r0.e1(this.f46945b) : String.valueOf(r0.f1(this.f46945b));
        } else {
            strE = String.valueOf(r0.d1(this.f46945b));
        }
        return "mdta: key=" + this.f46944a + ", value=" + strE;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46944a);
        parcel.writeByteArray(this.f46945b);
        parcel.writeInt(this.f46946c);
        parcel.writeInt(this.f46947d);
    }

    public a(String str, byte[] bArr, int i10, int i11) {
        this.f46944a = str;
        this.f46945b = bArr;
        this.f46946c = i10;
        this.f46947d = i11;
    }

    private a(Parcel parcel) {
        this.f46944a = (String) r0.j(parcel.readString());
        this.f46945b = (byte[]) r0.j(parcel.createByteArray());
        this.f46946c = parcel.readInt();
        this.f46947d = parcel.readInt();
    }
}
