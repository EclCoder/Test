package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbzy;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zzat extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzaw zzb;

    zzat(zzaw zzawVar, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzawVar);
        this.zzb = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzl(this.zza, "mobile_ads_settings");
        return new zzfj();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = this.zza;
        zzbiq.zza(context);
        if (!((Boolean) zzba.zzc().zzd(zzbiq.zzmd)).booleanValue()) {
            return this.zzb.zzo().zza(this.zza);
        }
        try {
            IBinder iBinderZze = ((zzcz) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", zzas.zza)).zze(ObjectWrapper.wrap(context), ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof zzcy ? (zzcy) iInterfaceQueryLocalInterface : new zzcw(iBinderZze);
        } catch (RemoteException e10) {
            e = e10;
            zzaw zzawVar = this.zzb;
            zzawVar.zzs(zzbzy.zza(this.zza));
            zzawVar.zzr().zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e11) {
            e = e11;
            zzaw zzawVar2 = this.zzb;
            zzawVar2.zzs(zzbzy.zza(this.zza));
            zzawVar2.zzr().zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            zzaw zzawVar3 = this.zzb;
            zzawVar3.zzs(zzbzy.zza(this.zza));
            zzawVar3.zzr().zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc(zzco zzcoVar) {
        return zzcoVar.zzi(ObjectWrapper.wrap(this.zza), ModuleDescriptor.MODULE_VERSION);
    }
}
