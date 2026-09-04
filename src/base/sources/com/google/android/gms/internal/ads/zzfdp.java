package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfdp implements zzfck {
    private final Executor zza;
    private final String zzb;

    public zzfdp(zzcev zzcevVar, Executor executor, String str, PackageInfo packageInfo, int i10) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        ListenableFuture listenableFutureZza = zzhbw.zza(this.zzb);
        zzfdo zzfdoVar = zzfdo.zza;
        Executor executor = this.zza;
        return zzhbw.zzh(zzhbw.zzk(listenableFutureZza, zzfdoVar, executor), Throwable.class, new zzhbe() { // from class: com.google.android.gms.internal.ads.zzfdn
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 41;
    }

    final /* synthetic */ ListenableFuture zzc(Throwable th2) {
        return zzhbw.zza(new zzfdq(this.zzb));
    }
}
