package com.facebook.ads.redexgen.core;

import android.content.DialogInterface;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class YQ implements DialogInterface.OnClickListener {
    public final /* synthetic */ C1521Pp A00;

    public YQ(C1521Pp c1521Pp) {
        this.A00 = c1521Pp;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        dialogInterface.cancel();
    }
}
