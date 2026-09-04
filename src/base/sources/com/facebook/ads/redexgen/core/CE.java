package com.facebook.ads.redexgen.core;

import android.util.Log;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class CE implements InterfaceC2248hW {
    public int A00;

    @Override // com.facebook.ads.redexgen.core.InterfaceC2248hW
    public final void A9t(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2248hW
    public final void A9u(String str, String str2, Throwable th2) {
        Log.i(str, str2, th2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2248hW
    public final boolean AAY(int i10) {
        return this.A00 <= i10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2248hW
    public final void AJY(int i10) {
        this.A00 = i10;
    }
}
