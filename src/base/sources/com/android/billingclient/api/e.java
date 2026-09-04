package com.android.billingclient.api;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzc;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10265b;

    public e(int i10, String str) {
        this.f10264a = 0;
        this.f10265b = null;
    }

    static e b(Bundle bundle) {
        return bundle == null ? new e(0, null) : new e(zzc.zza(bundle, "InAppMessageResult"), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"), bundle.getString("IN_APP_MESSAGE_PURCHASE_ID"));
    }

    public int a() {
        return this.f10264a;
    }

    private e(int i10, String str, String str2) {
        this.f10264a = i10;
        this.f10265b = str;
    }
}
