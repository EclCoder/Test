package ma;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f45400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f45401f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f45397b = i10;
        this.f45398c = i11;
        this.f45399d = i12;
        this.f45400e = iArr;
        this.f45401f = iArr2;
    }

    @Override // ma.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f45397b == kVar.f45397b && this.f45398c == kVar.f45398c && this.f45399d == kVar.f45399d && Arrays.equals(this.f45400e, kVar.f45400e) && Arrays.equals(this.f45401f, kVar.f45401f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f45397b) * 31) + this.f45398c) * 31) + this.f45399d) * 31) + Arrays.hashCode(this.f45400e)) * 31) + Arrays.hashCode(this.f45401f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f45397b);
        parcel.writeInt(this.f45398c);
        parcel.writeInt(this.f45399d);
        parcel.writeIntArray(this.f45400e);
        parcel.writeIntArray(this.f45401f);
    }

    k(Parcel parcel) {
        super("MLLT");
        this.f45397b = parcel.readInt();
        this.f45398c = parcel.readInt();
        this.f45399d = parcel.readInt();
        this.f45400e = (int[]) r0.j(parcel.createIntArray());
        this.f45401f = (int[]) r0.j(parcel.createIntArray());
    }
}
