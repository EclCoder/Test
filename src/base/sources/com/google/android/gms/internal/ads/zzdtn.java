package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdtn {
    private final Executor zza;
    private final zzcuq zzb;
    private final zzdks zzc;
    private final zzctj zzd;
    private final zzdbn zze;

    zzdtn(Executor executor, zzcuq zzcuqVar, zzdks zzdksVar, zzctj zzctjVar, zzdbn zzdbnVar) {
        this.zza = executor;
        this.zzc = zzdksVar;
        this.zzb = zzcuqVar;
        this.zzd = zzctjVar;
        this.zze = zzdbnVar;
    }

    public final void zza(final zzcku zzckuVar) {
        if (zzckuVar == null) {
            return;
        }
        zzdks zzdksVar = this.zzc;
        zzdksVar.zza(zzckuVar.zzE());
        zzbeq zzbeqVar = new zzbeq() { // from class: com.google.android.gms.internal.ads.zzdtm
            @Override // com.google.android.gms.internal.ads.zzbeq
            public final /* synthetic */ void zzdj(zzbep zzbepVar) {
                Rect rect = zzbepVar.zzd;
                zzckuVar.zzP().zza(rect.left, rect.top, false);
            }
        };
        Executor executor = this.zza;
        zzdksVar.zzq(zzbeqVar, executor);
        zzdksVar.zzq(new zzbeq() { // from class: com.google.android.gms.internal.ads.zzdtj
            @Override // com.google.android.gms.internal.ads.zzbeq
            public final /* synthetic */ void zzdj(zzbep zzbepVar) {
                HashMap map = new HashMap();
                map.put("isVisible", true != zzbepVar.zzj ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1");
                zzckuVar.zze("onAdVisibilityChanged", map);
            }
        }, executor);
        zzcuq zzcuqVar = this.zzb;
        zzdksVar.zzq(zzcuqVar, executor);
        zzcuqVar.zza(zzckuVar);
        zzcms zzcmsVarZzP = zzckuVar.zzP();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzlB)).booleanValue() && zzcmsVarZzP != null) {
            zzctj zzctjVar = this.zzd;
            zzcmsVarZzP.zzc(zzctjVar);
            zzcmsVarZzP.zze(zzctjVar, null, null);
        }
        zzckuVar.zzab("/trackActiveViewUnit", new zzbpq() { // from class: com.google.android.gms.internal.ads.zzdtk
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzb((zzcku) obj, map);
            }
        });
        zzckuVar.zzab("/untrackActiveViewUnit", new zzbpq() { // from class: com.google.android.gms.internal.ads.zzdtl
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzc((zzcku) obj, map);
            }
        });
        zzckuVar.zzP().zzJ(this.zze);
    }

    final /* synthetic */ void zzb(zzcku zzckuVar, Map map) {
        this.zzb.zzd();
    }

    final /* synthetic */ void zzc(zzcku zzckuVar, Map map) {
        this.zzb.zzb();
    }
}
