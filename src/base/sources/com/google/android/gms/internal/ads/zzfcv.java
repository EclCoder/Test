package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfcv implements zzfck {
    private final zzhcg zza;
    private final Context zzb;
    private final zzeeb zzc;
    private final String zzd;

    zzfcv(zzhcg zzhcgVar, Context context, zzeeb zzeebVar, String str) {
        this.zza = zzhcgVar;
        this.zzb = context;
        this.zzc = zzeebVar;
        this.zzd = str;
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcu
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 38;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0132 A[PHI: r1
      0x0132: PHI (r1v17 java.lang.String) = (r1v7 java.lang.String), (r1v7 java.lang.String), (r1v7 java.lang.String), (r1v8 java.lang.String) binds: [B:34:0x0130, B:37:0x014e, B:38:0x0150, B:77:0x0132] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01b7  */
    final /* synthetic */ zzfct zzc() {
        ActivityInfo activityInfo;
        boolean z10;
        String string;
        String string2;
        String str;
        boolean zEquals;
        boolean z11;
        Context context = this.zzb;
        PackageManager packageManager = context.getPackageManager();
        Locale locale = Locale.getDefault();
        ResolveInfo resolveInfoZzd = zzd(packageManager, "geo:0,0?q=donuts");
        ResolveInfo resolveInfoZzd2 = zzd(packageManager, "http://www.google.com");
        String country = locale.getCountry();
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.client.zzay.zza();
        boolean zZzy = com.google.android.gms.ads.internal.util.client.zzf.zzy();
        boolean zIsLatchsky = DeviceProperties.isLatchsky(context);
        boolean zIsSidewinder = DeviceProperties.isSidewinder(context);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        LocaleList localeList = LocaleList.getDefault();
        for (int i10 = 0; i10 < localeList.size(); i10++) {
            arrayList.add(localeList.get(i10).getLanguage());
        }
        ResolveInfo resolveInfoZzd3 = zzd(packageManager, "market://details?id=com.google.android.gms.ads");
        if (resolveInfoZzd3 == null || (activityInfo = resolveInfoZzd3.activityInfo) == null) {
            string = null;
            z10 = true;
        } else {
            try {
                z10 = true;
                try {
                    PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(activityInfo.packageName, 0);
                    if (packageInfo != null) {
                        int i11 = packageInfo.versionCode;
                        String str2 = activityInfo.packageName;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 1 + String.valueOf(str2).length());
                        sb2.append(i11);
                        sb2.append(".");
                        sb2.append(str2);
                        string = sb2.toString();
                    } else {
                        string = null;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                z10 = true;
            }
        }
        try {
            PackageInfo packageInfo2 = Wrappers.packageManager(this.zzb).getPackageInfo(qEagQqzJZsd.GnIpGeLxaQh, 128);
            if (packageInfo2 != null) {
                int i12 = packageInfo2.versionCode;
                String str3 = packageInfo2.packageName;
                StringBuilder sb3 = new StringBuilder(String.valueOf(i12).length() + 1 + String.valueOf(str3).length());
                sb3.append(i12);
                sb3.append(".");
                sb3.append(str3);
                string2 = sb3.toString();
            } else {
                string2 = null;
            }
        } catch (Exception unused3) {
        }
        String strZza = null;
        String str4 = Build.FINGERPRINT;
        String language2 = Locale.getDefault().getLanguage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoV)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzq zzqVarZzk = com.google.android.gms.ads.internal.util.zzs.zzk(this.zzb);
            language2 = zzqVarZzk.zzb();
            strZza = zzqVarZzk.zza();
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoU)).booleanValue()) {
            language2 = com.google.android.gms.ads.internal.util.zzs.zzk(this.zzb).zzb();
        }
        String str5 = strZza;
        String str6 = language2;
        Context context2 = this.zzb;
        if (packageManager == null) {
            str = string2;
            zEquals = false;
            break;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (listQueryIntentActivities == null || resolveInfoResolveActivity == null) {
            str = string2;
            zEquals = false;
            break;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= listQueryIntentActivities.size()) {
                str = string2;
                zEquals = false;
                break;
            }
            str = string2;
            if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i13).activityInfo.name)) {
                zEquals = resolveInfoResolveActivity.activityInfo.packageName.equals(zzink.zza(context2));
                break;
            }
            i13++;
            string2 = str;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmM)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzE(context2)) {
                z11 = z10;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        return new zzfct(resolveInfoZzd != null ? z10 : false, resolveInfoZzd2 != null ? z10 : false, country, zZzy, zIsLatchsky, zIsSidewinder, language, arrayList, string, str, str4, zEquals, Build.MODEL, availableBytes, z11, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmQ)).booleanValue() ? ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmS)).booleanValue() ? this.zzd : com.google.android.gms.ads.internal.util.client.zzf.zzf(context2) : "", Build.VERSION.SDK_INT, str6, str5, this.zzc.zza());
    }
}
