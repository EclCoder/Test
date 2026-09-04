package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class RootTelemetryConfigManager {
    private static RootTelemetryConfigManager zza;
    private static final RootTelemetryConfiguration zzb = new RootTelemetryConfiguration(0, false, false, 0, 0);
    private RootTelemetryConfiguration zzc;

    private RootTelemetryConfigManager() {
    }

    public static synchronized RootTelemetryConfigManager getInstance() {
        try {
            if (zza == null) {
                zza = new RootTelemetryConfigManager();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }

    public RootTelemetryConfiguration getConfig() {
        return this.zzc;
    }

    public final synchronized void zza(RootTelemetryConfiguration rootTelemetryConfiguration) {
        try {
            if (rootTelemetryConfiguration == null) {
                this.zzc = zzb;
                return;
            }
            RootTelemetryConfiguration rootTelemetryConfiguration2 = this.zzc;
            if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.getVersion() < rootTelemetryConfiguration.getVersion()) {
                this.zzc = rootTelemetryConfiguration;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
