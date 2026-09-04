package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzdqp implements zzblr {
    final /* synthetic */ zzdrq zza;
    final /* synthetic */ ViewGroup zzb;

    zzdqp(zzdrq zzdrqVar, ViewGroup viewGroup) {
        this.zza = zzdrqVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zza() {
        zzgwm zzgwmVar = zzdqo.zza;
        zzdrq zzdrqVar = this.zza;
        Map mapZzj = zzdrqVar.zzj();
        if (mapZzj == null) {
            return;
        }
        int size = zzgwmVar.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = mapZzj.get((String) zzgwmVar.get(i10));
            i10++;
            if (obj != null) {
                zzdrqVar.onClick(this.zzb);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zzb(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final JSONObject zzc() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final JSONObject zzd() {
        return this.zza.zzp();
    }
}
