package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import rc.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzg extends Exception {
    private final int zza;

    public zzg(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage();
    }

    public final e zza() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new e(this.zza, super.getMessage());
    }

    public zzg(int i10, String str, Throwable th2) {
        super(str, th2);
        this.zza = i10;
    }
}
