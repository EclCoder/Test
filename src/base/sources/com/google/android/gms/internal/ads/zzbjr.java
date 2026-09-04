package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbjr {
    private androidx.browser.customtabs.i zza;
    private androidx.browser.customtabs.c zzb;
    private androidx.browser.customtabs.e zzc;
    private zzbjq zzd;

    public static boolean zza(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i10 = 0; i10 < listQueryIntentActivities.size(); i10++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i10).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(zzink.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final void zzb(Activity activity) {
        androidx.browser.customtabs.e eVar = this.zzc;
        if (eVar == null) {
            return;
        }
        activity.unbindService(eVar);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }

    public final androidx.browser.customtabs.i zzc() {
        androidx.browser.customtabs.c cVar = this.zzb;
        if (cVar == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = cVar.f(null);
        }
        return this.zza;
    }

    public final void zzd(zzbjq zzbjqVar) {
        this.zzd = zzbjqVar;
    }

    public final void zze(Activity activity) {
        String strZza;
        if (this.zzb == null && (strZza = zzink.zza(activity)) != null) {
            zzinl zzinlVar = new zzinl(this);
            this.zzc = zzinlVar;
            androidx.browser.customtabs.c.a(activity, strZza, zzinlVar);
        }
    }

    public final void zzf(androidx.browser.customtabs.c cVar) {
        this.zzb = cVar;
        cVar.h(0L);
        zzbjq zzbjqVar = this.zzd;
        if (zzbjqVar != null) {
            zzbjqVar.zza();
        }
    }

    public final void zzg() {
        this.zzb = null;
        this.zza = null;
    }
}
