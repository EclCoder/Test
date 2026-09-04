package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzevy implements zzfci {
    final String zza;
    final int zzb;

    public zzevy(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i10;
        String str = this.zza;
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(str) || (i10 = this.zzb) == -1) {
            return;
        }
        Bundle bundleZza = zzfln.zza(bundle, "pii");
        bundle.putBundle("pii", bundleZza);
        bundleZza.putString("pvid", str);
        bundleZza.putInt("pvid_s", i10);
    }
}
