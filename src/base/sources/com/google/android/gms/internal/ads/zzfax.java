package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfax implements zzfck {
    private final ApplicationInfo zza;
    private final PackageInfo zzb;
    private final Context zzc;

    zzfax(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0077  */
    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        String strValueOf;
        String installingPackageName;
        String initiatingPackageName;
        String str = this.zza.packageName;
        PackageInfo packageInfo = this.zzb;
        String str2 = null;
        Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        String str3 = packageInfo == null ? null : packageInfo.versionName;
        try {
            Context context = this.zzc;
            zzgam zzgamVar = com.google.android.gms.ads.internal.util.zzs.zza;
            strValueOf = String.valueOf(Wrappers.packageManager(context).getApplicationLabel(str));
        } catch (PackageManager.NameNotFoundException unused) {
            strValueOf = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzol)).booleanValue()) {
                try {
                    InstallSourceInfo installSourceInfo = this.zzc.getPackageManager().getInstallSourceInfo(str);
                    if (installSourceInfo != null) {
                        installingPackageName = installSourceInfo.getInstallingPackageName();
                        try {
                            if (TextUtils.isEmpty(installingPackageName)) {
                                com.google.android.gms.ads.internal.util.zze.zza("No installing package name found");
                                installingPackageName = null;
                            }
                            initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                            try {
                                if (TextUtils.isEmpty(initiatingPackageName)) {
                                    com.google.android.gms.ads.internal.util.zze.zza("No initiating package name found");
                                    initiatingPackageName = str2;
                                }
                            } catch (PackageManager.NameNotFoundException e10) {
                                e = e10;
                                str2 = initiatingPackageName;
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PackageInfoSignalSource.getInstallSourceInfo");
                            }
                        } catch (PackageManager.NameNotFoundException e11) {
                            e = e11;
                        }
                    } else {
                        installingPackageName = null;
                        initiatingPackageName = null;
                    }
                } catch (PackageManager.NameNotFoundException e12) {
                    e = e12;
                    installingPackageName = null;
                }
            } else {
                installingPackageName = null;
                initiatingPackageName = null;
            }
        } else {
            installingPackageName = null;
            initiatingPackageName = null;
        }
        return zzhbw.zza(new zzfay(str, numValueOf, str3, strValueOf, installingPackageName, initiatingPackageName));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 29;
    }
}
