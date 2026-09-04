package ka;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.z0;
import java.util.Arrays;
import ob.d0;
import ob.r0;
import sc.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements ha.a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0655a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f43101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f43102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f43103h;

    /* JADX INFO: renamed from: ka.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0655a implements Parcelable.Creator {
        C0655a() {
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
        this.f43096a = i10;
        this.f43097b = str;
        this.f43098c = str2;
        this.f43099d = i11;
        this.f43100e = i12;
        this.f43101f = i13;
        this.f43102g = i14;
        this.f43103h = bArr;
    }

    public static a a(d0 d0Var) {
        int iQ = d0Var.q();
        String strF = d0Var.F(d0Var.q(), e.f52292a);
        String strE = d0Var.E(d0Var.q());
        int iQ2 = d0Var.q();
        int iQ3 = d0Var.q();
        int iQ4 = d0Var.q();
        int iQ5 = d0Var.q();
        int iQ6 = d0Var.q();
        byte[] bArr = new byte[iQ6];
        d0Var.l(bArr, 0, iQ6);
        return new a(iQ, strF, strE, iQ2, iQ3, iQ4, iQ5, bArr);
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
            if (this.f43096a == aVar.f43096a && this.f43097b.equals(aVar.f43097b) && this.f43098c.equals(aVar.f43098c) && this.f43099d == aVar.f43099d && this.f43100e == aVar.f43100e && this.f43101f == aVar.f43101f && this.f43102g == aVar.f43102g && Arrays.equals(this.f43103h, aVar.f43103h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f43096a) * 31) + this.f43097b.hashCode()) * 31) + this.f43098c.hashCode()) * 31) + this.f43099d) * 31) + this.f43100e) * 31) + this.f43101f) * 31) + this.f43102g) * 31) + Arrays.hashCode(this.f43103h);
    }

    @Override // ha.a.b
    public void r(z0.b bVar) {
        bVar.I(this.f43103h, this.f43096a);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f43097b + ", description=" + this.f43098c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f43096a);
        parcel.writeString(this.f43097b);
        parcel.writeString(this.f43098c);
        parcel.writeInt(this.f43099d);
        parcel.writeInt(this.f43100e);
        parcel.writeInt(this.f43101f);
        parcel.writeInt(this.f43102g);
        parcel.writeByteArray(this.f43103h);
    }

    a(Parcel parcel) {
        this.f43096a = parcel.readInt();
        this.f43097b = (String) r0.j(parcel.readString());
        this.f43098c = (String) r0.j(parcel.readString());
        this.f43099d = parcel.readInt();
        this.f43100e = parcel.readInt();
        this.f43101f = parcel.readInt();
        this.f43102g = parcel.readInt();
        this.f43103h = (byte[]) r0.j(parcel.createByteArray());
    }
}
