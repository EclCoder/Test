package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzhbt;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zzab implements zzhbt {
    final /* synthetic */ zzap zza;

    zzab(zzap zzapVar) {
        Objects.requireNonNull(zzapVar);
        this.zza = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        Pair pair = new Pair("sgf_reason", th2.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        zzap zzapVar = this.zza;
        zzv.zze(zzapVar.zzA(), null, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(zzapVar.zzO().get())));
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to initialize webview for loading SDKCore. ", th2);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzle)).booleanValue() || zzapVar.zzN().get()) {
            return;
        }
        if (zzapVar.zzO().getAndIncrement() < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzlf)).intValue()) {
            zzapVar.zzx();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Initialized webview successfully for SDKCore.");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzle)).booleanValue()) {
            zzap zzapVar = this.zza;
            zzv.zze(zzapVar.zzA(), null, "sgs", new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(zzapVar.zzO().get())));
            zzapVar.zzN().set(true);
        }
    }
}
