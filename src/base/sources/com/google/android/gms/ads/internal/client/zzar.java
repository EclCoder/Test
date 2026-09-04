package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbvc;
import com.google.android.gms.internal.ads.zzbzy;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zzar extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvc zzb;
    final /* synthetic */ zzaw zzc;

    zzar(zzaw zzawVar, Context context, zzbvc zzbvcVar) {
        this.zza = context;
        this.zzb = zzbvcVar;
        Objects.requireNonNull(zzawVar);
        this.zzc = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzl(this.zza, "ads_preloader");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zzb() {
        zzch zzcfVar;
        Context context = this.zza;
        IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(context);
        zzbiq.zza(context);
        if (!((Boolean) zzba.zzc().zzd(zzbiq.zzmd)).booleanValue()) {
            return this.zzc.zzt().zza(this.zza, this.zzb);
        }
        try {
            zzci zzciVar = (zzci) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", zzaq.zza);
            zzbvc zzbvcVar = this.zzb;
            IBinder iBinderZze = zzciVar.zze(iObjectWrapperWrap, zzbvcVar, ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                zzcfVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                zzcfVar = iInterfaceQueryLocalInterface instanceof zzch ? (zzch) iInterfaceQueryLocalInterface : new zzcf(iBinderZze);
            }
            zzcfVar.zzl(zzbvcVar);
            return zzcfVar;
        } catch (RemoteException e10) {
            e = e10;
            zzaw zzawVar = this.zzc;
            zzawVar.zzs(zzbzy.zza(this.zza));
            zzawVar.zzr().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e11) {
            e = e11;
            zzaw zzawVar2 = this.zzc;
            zzawVar2.zzs(zzbzy.zza(this.zza));
            zzawVar2.zzr().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            zzaw zzawVar3 = this.zzc;
            zzawVar3.zzs(zzbzy.zza(this.zza));
            zzawVar3.zzr().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc(zzco zzcoVar) {
        return zzcoVar.zzh(ObjectWrapper.wrap(this.zza), this.zzb, ModuleDescriptor.MODULE_VERSION);
    }
}
