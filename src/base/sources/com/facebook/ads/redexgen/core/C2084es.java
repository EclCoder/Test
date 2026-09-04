package com.facebook.ads.redexgen.core;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.es, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2084es extends ContentObserver {
    public final EF A00;

    public C2084es(Handler handler, EF ef2) {
        super(handler);
        this.A00 = ef2;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.A00.A0f();
    }
}
