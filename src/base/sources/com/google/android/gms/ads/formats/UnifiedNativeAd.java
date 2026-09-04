package com.google.android.gms.ads.formats;

import android.os.Bundle;
import com.google.android.gms.ads.VideoController;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class UnifiedNativeAd {
    public abstract void performClick(Bundle bundle);

    public abstract boolean recordImpression(Bundle bundle);

    public abstract void reportTouchEvent(Bundle bundle);

    public abstract String zza();

    public abstract List zzb();

    public abstract String zzc();

    public abstract NativeAd.Image zzd();

    public abstract String zze();

    public abstract String zzf();

    public abstract Double zzg();

    public abstract String zzh();

    public abstract String zzi();

    @Deprecated
    public abstract VideoController zzj();

    public abstract Object zzk();
}
