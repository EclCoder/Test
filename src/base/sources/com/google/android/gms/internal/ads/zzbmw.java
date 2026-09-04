package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbmw {
    private final zzbmv zza;

    public zzbmw(zzbmv zzbmvVar) {
        Context context;
        this.zza = zzbmvVar;
        try {
            context = (Context) ObjectWrapper.unwrap(zzbmvVar.zzm());
        } catch (RemoteException | NullPointerException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
            context = null;
        }
        if (context != null) {
            try {
                this.zza.zzn(ObjectWrapper.wrap(new MediaView(context)));
            } catch (RemoteException e11) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e11);
            }
        }
    }

    public final zzbmv zza() {
        return this.zza;
    }

    public final String zzb() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
            return null;
        }
    }
}
