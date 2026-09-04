package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcmt {
    private x4.b zza = null;

    zzcmt() {
    }

    public final void zza(WebView webView) {
        if (this.zza != null) {
            try {
                x4.f.n(webView, "GMA_WEBVIEW_PROFILE");
                com.google.android.gms.ads.internal.util.zze.zza("WebViewCompat Profile is defined");
            } catch (IllegalStateException e10) {
                String strConcat = "WebViewCompat error: ".concat(e10.toString());
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzpy)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "WebViewCompat.setProfile");
                }
            }
        }
    }

    final void zzb(zzcmx zzcmxVar) {
        ProfileStore profileStore;
        if (!x4.g.a("MULTI_PROFILE")) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("WebViewFeature.MULTI_PROFILE is not supported");
            return;
        }
        try {
            profileStore = (ProfileStore) zzgar.zza("androidx.webkit.ProfileStore", "getInstance", new zzgaq[0]);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(strValueOf));
            try {
                profileStore = (ProfileStore) zzgar.zza("androidx.webkit.ProfileStore$-CC", "getInstance", new zzgaq[0]);
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e11) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(String.valueOf(e11.getMessage())));
                profileStore = null;
            }
        }
        if (profileStore != null) {
            this.zza = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzpx)).booleanValue()) {
                long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzcmxVar.zza;
                zzdzk zzdzkVarZza = zzcmxVar.zzb.zzd().zza();
                zzdzkVarZza.zzc("action", "webview_p_l");
                zzdzkVarZza.zzc("webview_p_l", Long.toString(jElapsedRealtime));
                zzdzkVarZza.zzd();
                return;
            }
            return;
        }
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("WebViewCompat failure: No instance");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzpx)).booleanValue()) {
            zzdzk zzdzkVarZza2 = zzcmxVar.zzb.zzd().zza();
            zzdzkVarZza2.zzc("action", "webview_p_f");
            zzdzkVarZza2.zzc("webview_p_f", "No instance");
            zzdzkVarZza2.zzd();
        }
    }
}
