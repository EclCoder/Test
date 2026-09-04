package com.facebook.ads.redexgen.core;

import android.os.Parcel;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class IX {
    public final int A00;
    public final long A01;
    public final long A02;

    public IX(int i10, long j10, long j11) {
        this.A00 = i10;
        this.A02 = j10;
        this.A01 = j11;
    }

    public /* synthetic */ IX(int i10, long j10, long j11, IW iw) {
        this(i10, j10, j11);
    }

    public static IX A00(Parcel parcel) {
        return new IX(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    public final void A01(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
    }
}
