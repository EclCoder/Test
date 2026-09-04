package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfug extends zzfub {
    public zzfug(ClientApi clientApi, Context context, int i10, zzflu zzfluVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzcb zzcbVar, ScheduledExecutorService scheduledExecutorService, zzfoo zzfooVar, zzfsw zzfswVar, Clock clock) {
        super(clientApi, context, i10, zzfluVar, zzfpVar, zzcbVar, scheduledExecutorService, zzfooVar, zzfswVar, clock);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007e  */
    @Override // com.google.android.gms.internal.ads.zzfub
    protected final ListenableFuture zza(Context context) {
        zzfug zzfugVar;
        zzbvc zzbvcVarZzd = this.zzd.zzd();
        if (zzbvcVarZzd == null) {
            return zzhbw.zzc(new zzfso(1, "Failed to create a rewarded ad."));
        }
        zzfjw zzfjwVar = (zzfjw) this.zza.zzl(ObjectWrapper.wrap(context), ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza, zzbvcVarZzd, this.zzc);
        if (zzfjwVar == null) {
            return zzhbw.zzc(new zzfso(1, "Failed to create a rewarded ad."));
        }
        zzhcp zzhcpVarZze = zzhcp.zze();
        try {
            zzB(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzc);
            zzfsn zzfsnVar = this.zzf;
            if (zzfsnVar != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzT)).booleanValue()) {
                    zzfugVar = this;
                    try {
                        zzfjwVar.zzu(new zzfsy(zzfsnVar, this.zzi, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzV)).longValue(), zzfugVar));
                    } catch (RemoteException unused) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to load rewarded ad.");
                        return zzhbw.zzc(new zzfso(1, "remote exception"));
                    }
                } else {
                    zzfugVar = this;
                }
            } else {
                zzfugVar = this;
            }
            zzfjwVar.zzc(((com.google.android.gms.ads.internal.client.zzfp) zzfugVar.zze.get()).zzc, new zzfuf(zzfjwVar, new zzfto(this, zzhcpVarZze), ((com.google.android.gms.ads.internal.client.zzfp) zzfugVar.zze.get()).zza));
            return zzhcpVarZze;
        } catch (RemoteException unused2) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfub
    protected final long zzb() {
        return ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzR)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzfub
    protected final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzdx zzc(Object obj) {
        try {
            return ((zzcci) obj).zzm();
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get response info for the rewarded ad.", e10);
            return null;
        }
    }

    public zzfug(String str, ClientApi clientApi, Context context, int i10, zzflu zzfluVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfoo zzfooVar, zzfsw zzfswVar, Clock clock, zzfsn zzfsnVar) {
        super(str, clientApi, context, i10, zzfluVar, zzfpVar, zzceVar, scheduledExecutorService, zzfooVar, zzfswVar, clock, zzfsnVar);
    }
}
