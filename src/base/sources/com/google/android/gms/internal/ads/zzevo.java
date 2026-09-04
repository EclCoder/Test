package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzevo implements zzfci {
    private final com.google.android.gms.ads.internal.client.zzx zza;
    private final boolean zzb;

    public zzevo(com.google.android.gms.ads.internal.client.zzx zzxVar, boolean z10) {
        this.zza = zzxVar;
        this.zzb = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgu)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzb);
        }
        com.google.android.gms.ads.internal.client.zzx zzxVar = this.zza;
        if (zzxVar != null) {
            int i10 = zzxVar.zza;
            if (i10 == 1) {
                bundle.putString("avo", TtmlNode.TAG_P);
            } else if (i10 == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
