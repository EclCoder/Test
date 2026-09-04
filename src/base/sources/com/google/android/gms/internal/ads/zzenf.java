package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzenf implements zzels {
    private final Context zza;
    private final zzdng zzb;
    private final Executor zzc;
    private final zzfke zzd;
    private final zzdzl zze;

    public zzenf(Context context, Executor executor, zzdng zzdngVar, zzfke zzfkeVar, zzdzl zzdzlVar) {
        this.zza = context;
        this.zzb = zzdngVar;
        this.zzc = executor;
        this.zzd = zzfkeVar;
        this.zze = zzdzlVar;
    }

    private static String zze(zzfkf zzfkfVar) {
        try {
            return zzfkfVar.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final boolean zza(zzfkq zzfkqVar, zzfkf zzfkfVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbjr.zza(context) && !TextUtils.isEmpty(zze(zzfkfVar));
    }

    final /* synthetic */ ListenableFuture zzc(Uri uri, zzfkq zzfkqVar, zzfkf zzfkfVar, zzfki zzfkiVar, Object obj) {
        try {
            androidx.browser.customtabs.d dVarA = new androidx.browser.customtabs.d.C0018d().a();
            dVarA.f1834a.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(dVarA.f1834a, null);
            zzcfw zzcfwVar = new zzcfw();
            zzdma zzdmaVarZzd = this.zzb.zzd(new zzcyj(zzfkqVar, zzfkfVar, null), new zzdmd(new zzend(this, zzcfwVar, zzfkfVar), null));
            zzcfwVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zzdmaVarZzd.zzi(), null, new VersionInfoParcel(0, 0, false), null, null, zzfkiVar.zzb));
            this.zzd.zzd();
            return zzhbw.zza(zzdmaVarZzd.zzh());
        } catch (Throwable th2) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in CustomTabsAdRenderer", th2);
            throw th2;
        }
    }

    final /* synthetic */ zzdzl zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final ListenableFuture zzb(final zzfkq zzfkqVar, final zzfkf zzfkfVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoC)).booleanValue()) {
            zzdzk zzdzkVarZza = this.zze.zza();
            zzdzkVarZza.zzc(CIdIVqKnNZ.eqnxR, "cstm_tbs_rndr");
            zzdzkVarZza.zzd();
        }
        String strZze = zze(zzfkfVar);
        final Uri uri = strZze != null ? Uri.parse(strZze) : null;
        final zzfki zzfkiVar = zzfkqVar.zzb.zzb;
        return zzhbw.zzj(zzhbw.zza(null), new zzhbe() { // from class: com.google.android.gms.internal.ads.zzene
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(uri, zzfkqVar, zzfkfVar, zzfkiVar, obj);
            }
        }, this.zzc);
    }
}
