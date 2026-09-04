package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C09984o extends BroadcastReceiver {
    public final /* synthetic */ C09994p A00;

    public C09984o(C09994p c09994p) {
        this.A00 = c09994p;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int iA00 = C09994p.A00(context);
        if (C5C.A02 >= 31 && iA00 == 5) {
            C09964m.A02(context, this.A00);
        } else {
            this.A00.A07(iA00);
        }
    }
}
