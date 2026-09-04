package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgpt implements zzgpe {
    private final List zza = new ArrayList();

    zzgpt() {
    }

    public final synchronized void zza(List list) {
        List list2 = this.zza;
        list2.clear();
        list2.addAll(list);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final synchronized void zzc(Map map, Context context, View view) {
        List list = this.zza;
        map.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, new ArrayList(list));
        list.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzb(Map map) {
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzd(Map map) {
    }
}
