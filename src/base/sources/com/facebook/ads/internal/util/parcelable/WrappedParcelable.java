package com.facebook.ads.internal.util.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class WrappedParcelable implements Parcelable {
    public static final Parcelable.Creator<WrappedParcelable> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f14903a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WrappedParcelable createFromParcel(Parcel parcel) {
            return new WrappedParcelable(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WrappedParcelable[] newArray(int i10) {
            return new WrappedParcelable[i10];
        }
    }

    protected WrappedParcelable(Parcel parcel) {
        this.f14903a = parcel.createByteArray();
    }

    public static byte[] marshallParcelable(Parcelable parcelable) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeParcelable(parcelable, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Parcelable unwrap(ClassLoader classLoader) {
        Parcel parcelObtain = Parcel.obtain();
        byte[] bArr = this.f14903a;
        if (bArr == null) {
            return null;
        }
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Parcelable parcelable = parcelObtain.readParcelable(classLoader);
        parcelObtain.recycle();
        return parcelable;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f14903a);
    }

    public WrappedParcelable(Parcelable parcelable) {
        this.f14903a = marshallParcelable(parcelable);
    }

    public WrappedParcelable(byte[] bArr) {
        this.f14903a = bArr;
    }
}
