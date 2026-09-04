package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.m;
import androidx.work.n;
import androidx.work.v;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class WorkManagerUtil extends zzbn {
    private static void zzb(Context context) {
        try {
            v.e(context.getApplicationContext(), new androidx.work.b.C0101b().a());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final boolean zze(IObjectWrapper iObjectWrapper, String str, String str2) {
        return zzg(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final void zzf(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        try {
            v vVarD = v.d(context);
            vVarD.a("offline_ping_sender_work");
            vVarD.b((n) ((n.a) ((n.a) new n.a(OfflinePingSender.class).e(new androidx.work.c.a().b(m.CONNECTED).a())).a("offline_ping_sender_work")).b());
        } catch (IllegalStateException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to instantiate WorkManager.", e10);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final boolean zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws Throwable {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        androidx.work.c cVarA = new androidx.work.c.a().b(m.CONNECTED).a();
        try {
            v.d(context).b((n) ((n.a) ((n.a) ((n.a) new n.a(OfflineNotificationPoster.class).e(cVarA)).f(new androidx.work.e.a().e("uri", zzaVar.zza).e("gws_query_id", zzaVar.zzb).e(CampaignEx.JSON_KEY_IMAGE_URL, zzaVar.zzc).a())).a("offline_notification_work")).b());
            return true;
        } catch (IllegalStateException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to instantiate WorkManager.", e10);
            return false;
        }
    }
}
