package e3;

import android.os.Parcel;
import android.os.Parcelable;
import c1.pGX.geAgcEazw;
import w1.c0;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0558a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f37061c;

    /* JADX INFO: renamed from: e3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class C0558a implements Parcelable.Creator {
        C0558a() {
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

    /* synthetic */ a(Parcel parcel, C0558a c0558a) {
        this(parcel);
    }

    static a a(u uVar, int i10, long j10) {
        long jI = uVar.I();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        uVar.l(bArr, 0, i11);
        return new a(jI, bArr, j10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f37059a);
        parcel.writeLong(this.f37060b);
        parcel.writeByteArray(this.f37061c);
    }

    private a(long j10, byte[] bArr, long j11) {
        this.f37059a = j11;
        this.f37060b = j10;
        this.f37061c = bArr;
    }

    @Override // e3.b
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f37059a + geAgcEazw.BAXhjUHB + this.f37060b + " }";
    }

    private a(Parcel parcel) {
        this.f37059a = parcel.readLong();
        this.f37060b = parcel.readLong();
        this.f37061c = (byte[]) c0.h(parcel.createByteArray());
    }
}
