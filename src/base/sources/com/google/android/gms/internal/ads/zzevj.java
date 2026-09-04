package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzevj implements zzfck {
    private final Context zza;
    private final zzhcg zzb;

    zzevj(zzhcg zzhcgVar, Context context) {
        this.zzb = zzhcgVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzos)).booleanValue()) {
            return zzhbw.zza(new zzevk(null, false));
        }
        final ContentResolver contentResolver = this.zza.getContentResolver();
        return contentResolver == null ? zzhbw.zza(new zzevk(null, false)) : this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzevi
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                ContentResolver contentResolver2 = contentResolver;
                return new zzevk(Settings.Secure.getString(contentResolver2, "advertising_id"), Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 61;
    }
}
