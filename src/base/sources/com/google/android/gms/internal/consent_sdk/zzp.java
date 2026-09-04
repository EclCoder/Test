package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import rc.a;
import rc.d;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzp {
    private final zzn zza;
    private final Activity zzb;
    private final a zzc;
    private final d zzd;

    /* synthetic */ zzp(zzn zznVar, Activity activity, a aVar, d dVar, zzo zzoVar) {
        this.zza = zznVar;
        this.zzb = activity;
        this.zzc = aVar;
        this.zzd = dVar;
    }

    static /* bridge */ /* synthetic */ zzcl zza(zzp zzpVar) throws zzg {
        Bundle bundle;
        List list;
        List list2;
        PackageInfo packageInfo;
        zzcl zzclVar = new zzcl();
        String strD = zzpVar.zzd.d();
        if (TextUtils.isEmpty(strD)) {
            try {
                zzn zznVar = zzpVar.zza;
                bundle = zznVar.zza.getPackageManager().getApplicationInfo(zznVar.zza.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                strD = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(strD)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        zzclVar.zza = strD;
        a aVar = zzpVar.zzc;
        if (aVar.b()) {
            ArrayList arrayList = new ArrayList();
            int iA = aVar.a();
            if (iA == 1) {
                arrayList.add(zzcg.GEO_OVERRIDE_EEA);
            } else if (iA == 2) {
                arrayList.add(zzcg.GEO_OVERRIDE_NON_EEA);
            } else if (iA == 3) {
                arrayList.add(zzcg.GEO_OVERRIDE_REGULATED_US_STATE);
            } else if (iA == 4) {
                arrayList.add(zzcg.GEO_OVERRIDE_OTHER);
            }
            arrayList.add(zzcg.PREVIEWING_DEBUG_MESSAGES);
            list = arrayList;
        } else {
            list = Collections.EMPTY_LIST;
        }
        zzclVar.zzj = list;
        zzn zznVar2 = zzpVar.zza;
        zzclVar.zzf = zznVar2.zzb.zzc();
        zzclVar.zze = Boolean.valueOf(zzpVar.zzd.c());
        zzclVar.zzd = Locale.getDefault().toLanguageTag();
        zzch zzchVar = new zzch();
        int i10 = Build.VERSION.SDK_INT;
        zzchVar.zzb = Integer.valueOf(i10);
        zzchVar.zza = Build.MODEL;
        zzchVar.zzc = 2;
        zzclVar.zzc = zzchVar;
        Configuration configuration = zznVar2.zza.getResources().getConfiguration();
        zznVar2.zza.getResources().getConfiguration();
        zzcj zzcjVar = new zzcj();
        zzcjVar.zza = Integer.valueOf(configuration.screenWidthDp);
        zzcjVar.zzb = Integer.valueOf(configuration.screenHeightDp);
        zzcjVar.zzc = Double.valueOf(zznVar2.zza.getResources().getDisplayMetrics().density);
        if (i10 < 28) {
            list2 = Collections.EMPTY_LIST;
        } else {
            Activity activity = zzpVar.zzb;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                list2 = Collections.EMPTY_LIST;
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        zzci zzciVar = new zzci();
                        zzciVar.zzb = Integer.valueOf(rect.left);
                        zzciVar.zzc = Integer.valueOf(rect.right);
                        zzciVar.zza = Integer.valueOf(rect.top);
                        zzciVar.zzd = Integer.valueOf(rect.bottom);
                        arrayList2.add(zzciVar);
                    }
                }
                list2 = arrayList2;
            }
        }
        zzcjVar.zzd = list2;
        zzclVar.zzg = zzcjVar;
        Application application = zznVar2.zza;
        try {
            packageInfo = zznVar2.zza.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zzcf zzcfVar = new zzcf();
        zzcfVar.zza = application.getPackageName();
        zzn zznVar3 = zzpVar.zza;
        CharSequence applicationLabel = zznVar3.zza.getPackageManager().getApplicationLabel(zznVar3.zza.getApplicationInfo());
        zzcfVar.zzb = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            zzcfVar.zzc = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        zzclVar.zzh = zzcfVar;
        zzck zzckVar = new zzck();
        zzckVar.zza = "4.0.0";
        zzclVar.zzi = zzckVar;
        zzclVar.zzb = zzpVar.zzd.b();
        return zzclVar;
    }
}
