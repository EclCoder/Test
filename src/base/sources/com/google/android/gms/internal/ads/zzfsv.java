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
public final class zzfsv extends zzfub {
    public zzfsv(ClientApi clientApi, Context context, int i10, zzflu zzfluVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzcb zzcbVar, ScheduledExecutorService scheduledExecutorService, zzfoo zzfooVar, zzfsw zzfswVar, Clock clock) {
        super(clientApi, context, i10, zzfluVar, zzfpVar, zzcbVar, scheduledExecutorService, zzfooVar, zzfswVar, clock);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    @Override // com.google.android.gms.internal.ads.zzfub
    protected final ListenableFuture zza(Context context) {
        zzfsv zzfsvVar;
        zzbvc zzbvcVarZzd = this.zzd.zzd();
        if (zzbvcVarZzd == null) {
            return zzhbw.zzc(new zzfso(1, "Failed to create an app open ad manager."));
        }
        zzfgm zzfgmVar = (zzfgm) this.zza.zzm(ObjectWrapper.wrap(context), com.google.android.gms.ads.internal.client.zzr.zzd(), ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza, zzbvcVarZzd, this.zzc);
        if (zzfgmVar == null) {
            return zzhbw.zzc(new zzfso(1, "Failed to create an app open ad manager."));
        }
        zzhcp zzhcpVarZze = zzhcp.zze();
        try {
            zzB(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzc);
            zzfsn zzfsnVar = this.zzf;
            if (zzfsnVar != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzT)).booleanValue()) {
                    zzfsvVar = this;
                    try {
                        zzfgmVar.zzL(new zzfsy(zzfsnVar, this.zzi, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzW)).longValue(), zzfsvVar));
                    } catch (RemoteException e10) {
                        e = e10;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load app open ad.", e);
                        return zzhbw.zzc(new zzfso(1, "remote exception"));
                    }
                } else {
                    zzfsvVar = this;
                }
            } else {
                zzfsvVar = this;
            }
            zzfgmVar.zzJ(new zzfsu(new zzfto(this, zzhcpVarZze), ((com.google.android.gms.ads.internal.client.zzfp) zzfsvVar.zze.get()).zza));
            zzfgmVar.zze(((com.google.android.gms.ads.internal.client.zzfp) zzfsvVar.zze.get()).zzc);
            return zzhcpVarZze;
        } catch (RemoteException e11) {
            e = e11;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfub
    protected final long zzb() {
        return ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzS)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzfub
    protected final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzdx zzc(Object obj) {
        try {
            return ((zzbgj) obj).zzg();
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get response info for the app open ad.", e10);
            return null;
        }
    }

    public zzfsv(String str, ClientApi clientApi, Context context, int i10, zzflu zzfluVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfoo zzfooVar, zzfsw zzfswVar, Clock clock, zzfsn zzfsnVar) {
        super(str, clientApi, context, i10, zzfluVar, zzfpVar, zzceVar, scheduledExecutorService, zzfooVar, zzfswVar, clock, zzfsnVar);
    }
}
