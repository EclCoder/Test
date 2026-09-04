package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzduf implements zzblr {
    final /* synthetic */ String zza = NativeCustomFormatAd.ASSET_NAME_VIDEO;
    final /* synthetic */ zzdug zzb;

    zzduf(zzdug zzdugVar, String str) {
        Objects.requireNonNull(zzdugVar);
        this.zzb = zzdugVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zza() {
        zzdug zzdugVar = this.zzb;
        if (zzdugVar.zzc() != null) {
            zzdugVar.zzc().zza(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final JSONObject zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final JSONObject zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zzb(MotionEvent motionEvent) {
    }
}
