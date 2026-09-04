package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.auth.zzby;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zzj implements zzk {
    final /* synthetic */ String zza;
    final /* synthetic */ Context zzb;

    zzj(String str, Context context) {
        this.zza = str;
        this.zzb = context;
    }

    @Override // com.google.android.gms.auth.zzk
    public final /* bridge */ /* synthetic */ Object zza(IBinder iBinder) throws IOException, GoogleAuthException {
        Bundle bundleZzg = com.google.android.gms.internal.auth.zze.zzb(iBinder).zzg(this.zza);
        zzl.zzc(bundleZzg);
        String string = bundleZzg.getString("Error");
        Intent intent = (Intent) bundleZzg.getParcelable("userRecoveryIntent");
        PendingIntent pendingIntent = (PendingIntent) bundleZzg.getParcelable("userRecoveryPendingIntent");
        if (zzby.SUCCESS.equals(zzby.zza(string))) {
            return Boolean.TRUE;
        }
        zzl.zzn(this.zzb, "requestGoogleAccountsAccess", string, intent, pendingIntent);
        throw new GoogleAuthException("Invalid state. Shouldn't happen");
    }
}
