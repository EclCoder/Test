package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbly extends NativeAd.AdChoicesInfo {
    private final zzblx zza;
    private final List zzb = new ArrayList();
    private String zzc;

    public zzbly(zzblx zzblxVar) {
        zzbme zzbmcVar;
        this.zza = zzblxVar;
        try {
            this.zzc = zzblxVar.zzb();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
            this.zzc = "";
        }
        try {
            for (Object obj : zzblxVar.zzc()) {
                if (obj instanceof IBinder) {
                    IBinder iBinder = (IBinder) obj;
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbmcVar = iInterfaceQueryLocalInterface instanceof zzbme ? (zzbme) iInterfaceQueryLocalInterface : new zzbmc(iBinder);
                } else {
                    zzbmcVar = null;
                }
                if (zzbmcVar != null) {
                    this.zzb.add(new zzbmf(zzbmcVar));
                }
            }
        } catch (RemoteException e11) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e11);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzc;
    }
}
