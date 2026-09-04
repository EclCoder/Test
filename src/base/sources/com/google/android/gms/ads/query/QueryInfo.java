package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbzs;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class QueryInfo {
    private final zzex zza;

    public QueryInfo(zzex zzexVar) {
        this.zza = zzexVar;
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zza(context, adFormat, adRequest, null, queryInfoGenerationCallback);
    }

    private static void zza(final Context context, final AdFormat adFormat, final AdRequest adRequest, final String str, final QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzbiq.zza(context);
        if (((Boolean) zzbko.zzj.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzd(zzbiq.zzmD)).booleanValue()) {
                zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.query.zza
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AdRequest adRequest2 = adRequest;
                        zzeh zzehVarZza = adRequest2 == null ? null : adRequest2.zza();
                        new zzbzs(context, adFormat, zzehVarZza, str).zzb(queryInfoGenerationCallback);
                    }
                });
                return;
            }
        }
        new zzbzs(context, adFormat, adRequest == null ? null : adRequest.zza(), str).zzb(queryInfoGenerationCallback);
    }

    public String getQuery() {
        return this.zza.zza();
    }

    public Bundle getQueryBundle() {
        return this.zza.zzc();
    }

    public String getRequestId() {
        return this.zza.zzb();
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, String str, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        zza(context, adFormat, adRequest, str, queryInfoGenerationCallback);
    }
}
