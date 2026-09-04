package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeub implements zzfci {
    private final boolean zza;

    public zzeub(boolean z10) {
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.zza ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1");
    }
}
