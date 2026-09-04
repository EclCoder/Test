package x1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.primitives.g;
import java.util.Arrays;
import t1.u;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements u.b {
    public static final Parcelable.Creator<a> CREATOR = new C0864a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f56566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f56568d;

    /* JADX INFO: renamed from: x1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0864a implements Parcelable.Creator {
        C0864a() {
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

    /* synthetic */ a(Parcel parcel, C0864a c0864a) {
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
            if (this.f56565a.equals(aVar.f56565a) && Arrays.equals(this.f56566b, aVar.f56566b) && this.f56567c == aVar.f56567c && this.f56568d == aVar.f56568d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f56565a.hashCode()) * 31) + Arrays.hashCode(this.f56566b)) * 31) + this.f56567c) * 31) + this.f56568d;
    }

    public String toString() {
        String strG;
        int i10 = this.f56568d;
        if (i10 == 1) {
            strG = c0.G(this.f56566b);
        } else if (i10 != 23) {
            strG = i10 != 67 ? c0.Y0(this.f56566b) : String.valueOf(g.g(this.f56566b));
        } else {
            strG = String.valueOf(Float.intBitsToFloat(g.g(this.f56566b)));
        }
        return "mdta: key=" + this.f56565a + ", value=" + strG;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f56565a);
        parcel.writeByteArray(this.f56566b);
        parcel.writeInt(this.f56567c);
        parcel.writeInt(this.f56568d);
    }

    public a(String str, byte[] bArr, int i10, int i11) {
        this.f56565a = str;
        this.f56566b = bArr;
        this.f56567c = i10;
        this.f56568d = i11;
    }

    private a(Parcel parcel) {
        this.f56565a = (String) c0.h(parcel.readString());
        this.f56566b = (byte[]) c0.h(parcel.createByteArray());
        this.f56567c = parcel.readInt();
        this.f56568d = parcel.readInt();
    }
}
