package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcsn implements zzcru {
    private final DeviceTierManager zza;

    zzcsn(DeviceTierManager deviceTierManager) {
        this.zza = deviceTierManager;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final void zza(JSONObject jSONObject) {
        DeviceTierManager.AdvertisedMemoryTier advertisedMemoryTierFromValue;
        DeviceTierManager.AvailableProcessorTier availableProcessorTierFromValue;
        DeviceTierManager.AvailableMemoryTier availableMemoryTierFromValue;
        if (jSONObject.has("AvailableMemoryTier") && (availableMemoryTierFromValue = DeviceTierManager.AvailableMemoryTier.fromValue(jSONObject.optInt("AvailableMemoryTier", -1))) != null) {
            this.zza.setAvailableMemoryTier(availableMemoryTierFromValue);
        }
        if (jSONObject.has("AvailableProcessorTier") && (availableProcessorTierFromValue = DeviceTierManager.AvailableProcessorTier.fromValue(jSONObject.optInt("AvailableProcessorTier", -1))) != null) {
            this.zza.setAvailableProcessorTier(availableProcessorTierFromValue);
        }
        if (!jSONObject.has("AdvertisedMemoryTier") || (advertisedMemoryTierFromValue = DeviceTierManager.AdvertisedMemoryTier.fromValue(jSONObject.optInt("AdvertisedMemoryTier", -1))) == null) {
            return;
        }
        this.zza.setAdvertisedMemoryTier(advertisedMemoryTierFromValue);
    }
}
