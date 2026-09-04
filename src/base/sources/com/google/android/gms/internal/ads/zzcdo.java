package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcdo implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private String zzd = "-1";
    private int zze = -1;

    zzcdo(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = zzgVar;
        this.zza = context;
    }

    private final void zzb(String str, int i10) {
        Context context;
        boolean z10 = true;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzbj)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i10 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z10 = false;
        }
        this.zzc.zzw(z10);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzhh)).booleanValue() && z10 && (context = this.zza) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    private final void zzc() {
        this.zzc.zzw(true);
        com.google.android.gms.ads.internal.util.zzac.zza(this.zza);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzbl)).booleanValue()) {
                if (Objects.equals(str, "gad_has_consent_for_cookies")) {
                    int i10 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzc;
                    if (i10 != zzgVar.zzD()) {
                        zzc();
                    }
                    zzgVar.zzC(i10);
                    return;
                }
                if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, "-1");
                    com.google.android.gms.ads.internal.util.zzg zzgVar2 = this.zzc;
                    if (!Objects.equals(string, zzgVar2.zzB())) {
                        zzc();
                    }
                    zzgVar2.zzA(string);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i11 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String strValueOf = String.valueOf(str);
            int iHashCode = strValueOf.hashCode();
            if (iHashCode == -2004976699) {
                if (!strValueOf.equals("IABTCF_PurposeConsents") || string2.equals("-1") || this.zzd.equals(string2)) {
                    return;
                }
                this.zzd = string2;
                zzb(string2, i11);
                return;
            }
            if (iHashCode == -527267622 && strValueOf.equals("gad_has_consent_for_cookies")) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzbj)).booleanValue() || i11 == -1 || this.zze == i11) {
                    return;
                }
                this.zze = i11;
                zzb(string2, i11);
            }
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "AdMobPlusIdlessListener.onSharedPreferenceChanged");
            com.google.android.gms.ads.internal.util.zze.zzb("onSharedPreferenceChanged, errorMessage = ", th2);
        }
    }

    final void zza() {
        SharedPreferences sharedPreferences = this.zzb;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzbl)).booleanValue()) {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
        } else {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
        }
    }
}
