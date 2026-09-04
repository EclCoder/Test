package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.IBinder;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zzh implements zzk {
    final /* synthetic */ String zza;
    final /* synthetic */ Bundle zzb;

    zzh(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.auth.zzk
    public final /* bridge */ /* synthetic */ Object zza(IBinder iBinder) throws IOException, GoogleAuthException {
        Bundle bundleZzd = com.google.android.gms.internal.auth.zze.zzb(iBinder).zzd(this.zza, this.zzb);
        zzl.zzc(bundleZzd);
        String string = bundleZzd.getString("Error");
        if (bundleZzd.getBoolean("booleanResult")) {
            return null;
        }
        throw new GoogleAuthException(string);
    }
}
