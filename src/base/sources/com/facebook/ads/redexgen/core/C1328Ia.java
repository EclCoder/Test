package com.facebook.ads.redexgen.core;

import android.os.Parcel;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1328Ia {
    public final int A00;
    public final long A01;

    public C1328Ia(int i10, long j10) {
        this.A00 = i10;
        this.A01 = j10;
    }

    public /* synthetic */ C1328Ia(int i10, long j10, IZ iz) {
        this(i10, j10);
    }

    public static C1328Ia A00(Parcel parcel) {
        return new C1328Ia(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
