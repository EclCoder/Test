package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzgta;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzal implements zzgta {
    static final /* synthetic */ zzal zza = new zzal();

    private /* synthetic */ zzal() {
    }

    @Override // com.google.android.gms.internal.ads.zzgta
    public final /* synthetic */ Object apply(Object obj) {
        int i10 = zzap.zze;
        return ((JSONObject) obj).optString("nas");
    }
}
