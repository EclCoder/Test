package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzhbt;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zzz implements zzhbt {
    final /* synthetic */ zzbzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzap zzc;

    zzz(zzap zzapVar, zzbzq zzbzqVar, boolean z10) {
        this.zza = zzbzqVar;
        this.zzb = z10;
        Objects.requireNonNull(zzapVar);
        this.zzc = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
        try {
            zzbzq zzbzqVar = this.zza;
            String message = th2.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 16);
            sb2.append("Internal error: ");
            sb2.append(message);
            zzbzqVar.zzf(sb2.toString());
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.zza.zze(arrayList);
            zzap zzapVar = this.zzc;
            if (!zzapVar.zzC() && !this.zzb) {
                return;
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                Uri uri = (Uri) obj2;
                if (zzapVar.zzc(uri)) {
                    zzapVar.zzB().zzb(zzap.zzZ(uri, zzapVar.zzM(), "1").toString(), null, null, null);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zziw)).booleanValue()) {
                        zzapVar.zzB().zzb(uri.toString(), null, null, null);
                    }
                }
            }
        } catch (RemoteException e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
    }
}
