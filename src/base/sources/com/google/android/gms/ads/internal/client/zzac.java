package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzbzy;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zzac extends zzax {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzaw zzb;

    zzac(zzaw zzawVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzawVar);
        this.zzb = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzl(this.zza, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb() {
        Activity activity = this.zza;
        zzbiq.zza(activity);
        if (!((Boolean) zzba.zzc().zzd(zzbiq.zzmd)).booleanValue()) {
            zzaw zzawVar = this.zzb;
            return zzawVar.zzq().zza(this.zza);
        }
        try {
            return zzbza.zzI(((zzbze) com.google.android.gms.ads.internal.util.client.zzs.zza(activity, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", zzab.zza)).zze(ObjectWrapper.wrap(activity)));
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e10) {
            zzaw zzawVar2 = this.zzb;
            zzawVar2.zzs(zzbzy.zza(this.zza.getApplicationContext()));
            zzawVar2.zzr().zzh(e10, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc(zzco zzcoVar) {
        return zzcoVar.zzg(ObjectWrapper.wrap(this.zza));
    }
}
