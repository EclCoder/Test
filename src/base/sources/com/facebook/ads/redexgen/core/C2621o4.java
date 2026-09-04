package com.facebook.ads.redexgen.core;

import android.database.Cursor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2621o4 implements InterfaceC1164Bo {
    public final Cursor A00;

    public final /* synthetic */ boolean A01() {
        return AbstractC1163Bn.A00(this);
    }

    public C2621o4(Cursor cursor) {
        this.A00 = cursor;
    }

    public final C1160Bk A00() {
        return C9w.A01(this.A00);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A00.close();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1164Bo
    public final int getPosition() {
        return this.A00.getPosition();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1164Bo
    public final boolean moveToPosition(int i10) {
        return this.A00.moveToPosition(i10);
    }
}
