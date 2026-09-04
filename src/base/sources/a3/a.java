package a3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import sc.e;
import t1.t;
import t1.u;
import t1.v;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements u.b {
    public static final Parcelable.Creator<a> CREATOR = new C0000a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f109h;

    /* JADX INFO: renamed from: a3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0000a implements Parcelable.Creator {
        C0000a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f102a = i10;
        this.f103b = str;
        this.f104c = str2;
        this.f105d = i11;
        this.f106e = i12;
        this.f107f = i13;
        this.f108g = i14;
        this.f109h = bArr;
    }

    public static a a(w1.u uVar) {
        int iP = uVar.p();
        String strL = v.l(uVar.E(uVar.p(), e.f52292a));
        String strD = uVar.D(uVar.p());
        int iP2 = uVar.p();
        int iP3 = uVar.p();
        int iP4 = uVar.p();
        int iP5 = uVar.p();
        int iP6 = uVar.p();
        byte[] bArr = new byte[iP6];
        uVar.l(bArr, 0, iP6);
        return new a(iP, strL, strD, iP2, iP3, iP4, iP5, bArr);
    }

    @Override // t1.u.b
    public void d(t.b bVar) {
        bVar.J(this.f109h, this.f102a);
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
            if (this.f102a == aVar.f102a && this.f103b.equals(aVar.f103b) && this.f104c.equals(aVar.f104c) && this.f105d == aVar.f105d && this.f106e == aVar.f106e && this.f107f == aVar.f107f && this.f108g == aVar.f108g && Arrays.equals(this.f109h, aVar.f109h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f102a) * 31) + this.f103b.hashCode()) * 31) + this.f104c.hashCode()) * 31) + this.f105d) * 31) + this.f106e) * 31) + this.f107f) * 31) + this.f108g) * 31) + Arrays.hashCode(this.f109h);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f103b + ", description=" + this.f104c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f102a);
        parcel.writeString(this.f103b);
        parcel.writeString(this.f104c);
        parcel.writeInt(this.f105d);
        parcel.writeInt(this.f106e);
        parcel.writeInt(this.f107f);
        parcel.writeInt(this.f108g);
        parcel.writeByteArray(this.f109h);
    }

    a(Parcel parcel) {
        this.f102a = parcel.readInt();
        this.f103b = (String) c0.h(parcel.readString());
        this.f104c = (String) c0.h(parcel.readString());
        this.f105d = parcel.readInt();
        this.f106e = parcel.readInt();
        this.f107f = parcel.readInt();
        this.f108g = parcel.readInt();
        this.f109h = (byte[]) c0.h(parcel.createByteArray());
    }
}
