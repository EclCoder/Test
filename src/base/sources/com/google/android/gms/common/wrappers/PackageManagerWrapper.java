package com.google.android.gms.common.wrappers;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.PlatformVersion;
import m0.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class PackageManagerWrapper {
    protected final Context zza;

    public PackageManagerWrapper(Context context) {
        this.zza = context;
    }

    public int checkCallingOrSelfPermission(String str) {
        return this.zza.checkCallingOrSelfPermission(str);
    }

    public int checkPermission(String str, String str2) {
        return this.zza.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo getApplicationInfo(String str, int i10) {
        return this.zza.getPackageManager().getApplicationInfo(str, i10);
    }

    public CharSequence getApplicationLabel(String str) {
        Context context = this.zza;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public c getApplicationLabelAndIcon(String str) throws PackageManager.NameNotFoundException {
        Context context = this.zza;
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
        return c.a(context.getPackageManager().getApplicationLabel(applicationInfo), context.getPackageManager().getApplicationIcon(applicationInfo));
    }

    public PackageInfo getPackageInfo(String str, int i10) {
        return this.zza.getPackageManager().getPackageInfo(str, i10);
    }

    public String[] getPackagesForUid(int i10) {
        return this.zza.getPackageManager().getPackagesForUid(i10);
    }

    public boolean isCallerInstantApp() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return InstantApps.isInstantApp(this.zza);
        }
        if (!PlatformVersion.isAtLeastO()) {
            return false;
        }
        Context context = this.zza;
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    public final boolean zza(int i10, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.zza.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i10, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
