package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdks extends zzdip implements zzbeq {
    private final Map zzb;
    private final Context zzc;
    private final zzfkf zzd;

    public zzdks(Context context, Set set, zzfkf zzfkfVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfkfVar;
    }

    public final synchronized void zza(View view) {
        try {
            Map map = this.zzb;
            zzbes zzbesVar = (zzbes) map.get(view);
            if (zzbesVar == null) {
                zzbes zzbesVar2 = new zzbes(this.zzc, view);
                zzbesVar2.zza(this);
                map.put(view, zzbesVar2);
                zzbesVar = zzbesVar2;
            }
            if (this.zzd.zzX) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzca)).booleanValue()) {
                    zzbesVar.zzd(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzbZ)).longValue());
                    return;
                }
            }
            zzbesVar.zze();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzb(View view) {
        Map map = this.zzb;
        if (map.containsKey(view)) {
            ((zzbes) map.get(view)).zzb(this);
            map.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final synchronized void zzdj(final zzbep zzbepVar) {
        zzs(new zzdio() { // from class: com.google.android.gms.internal.ads.zzdkr
            @Override // com.google.android.gms.internal.ads.zzdio
            public final /* synthetic */ void zza(Object obj) {
                ((zzbeq) obj).zzdj(zzbepVar);
            }
        });
    }
}
