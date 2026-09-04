package oa;

import android.os.Parcel;
import android.os.Parcelable;
import ob.d0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0745a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f48306c;

    /* JADX INFO: renamed from: oa.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0745a implements Parcelable.Creator {
        C0745a() {
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

    /* synthetic */ a(Parcel parcel, C0745a c0745a) {
        this(parcel);
    }

    static a a(d0 d0Var, int i10, long j10) {
        long J = d0Var.J();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        d0Var.l(bArr, 0, i11);
        return new a(J, bArr, j10);
    }

    @Override // oa.b
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f48304a + ", identifier= " + this.f48305b + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f48304a);
        parcel.writeLong(this.f48305b);
        parcel.writeByteArray(this.f48306c);
    }

    private a(long j10, byte[] bArr, long j11) {
        this.f48304a = j11;
        this.f48305b = j10;
        this.f48306c = bArr;
    }

    private a(Parcel parcel) {
        this.f48304a = parcel.readLong();
        this.f48305b = parcel.readLong();
        this.f48306c = (byte[]) r0.j(parcel.createByteArray());
    }
}
