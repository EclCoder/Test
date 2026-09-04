package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhk {
    final zzic zza;

    zzhk(zzpg zzpgVar) {
        this.zza = zzpgVar.zzah();
    }

    final boolean zza() {
        try {
            zzic zzicVar = this.zza;
            PackageManagerWrapper packageManagerWrapperPackageManager = Wrappers.packageManager(zzicVar.zzaZ());
            if (packageManagerWrapperPackageManager != null) {
                return packageManagerWrapperPackageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            zzicVar.zzaW().zzk().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.zza.zzaW().zzk().zzb("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
