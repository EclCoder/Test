package c3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f9534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f9535f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f9531b = i10;
        this.f9532c = i11;
        this.f9533d = i12;
        this.f9534e = iArr;
        this.f9535f = iArr2;
    }

    @Override // c3.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f9531b == lVar.f9531b && this.f9532c == lVar.f9532c && this.f9533d == lVar.f9533d && Arrays.equals(this.f9534e, lVar.f9534e) && Arrays.equals(this.f9535f, lVar.f9535f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f9531b) * 31) + this.f9532c) * 31) + this.f9533d) * 31) + Arrays.hashCode(this.f9534e)) * 31) + Arrays.hashCode(this.f9535f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f9531b);
        parcel.writeInt(this.f9532c);
        parcel.writeInt(this.f9533d);
        parcel.writeIntArray(this.f9534e);
        parcel.writeIntArray(this.f9535f);
    }

    l(Parcel parcel) {
        super("MLLT");
        this.f9531b = parcel.readInt();
        this.f9532c = parcel.readInt();
        this.f9533d = parcel.readInt();
        this.f9534e = (int[]) c0.h(parcel.createIntArray());
        this.f9535f = (int[]) c0.h(parcel.createIntArray());
    }
}
