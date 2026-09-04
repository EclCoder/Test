package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzbue implements zzbua {
    static final /* synthetic */ zzbue zza = new zzbue();

    private /* synthetic */ zzbue() {
    }

    @Override // com.google.android.gms.internal.ads.zzbua
    public final /* synthetic */ Object zza(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
    }
}
