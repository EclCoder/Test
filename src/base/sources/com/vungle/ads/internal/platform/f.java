package com.vungle.ads.internal.platform;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface f {
    public static final a Companion = a.$$INSTANCE;
    public static final String MANUFACTURER_AMAZON = "Amazon";

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        static final /* synthetic */ a $$INSTANCE = new a();
        public static final String MANUFACTURER_AMAZON = "Amazon";

        private a() {
        }
    }

    com.vungle.ads.internal.model.c getAdvertisingInfo();

    String getAppSetId();

    Integer getAppSetIdScope();

    long getBuildTime();

    String getCarrierName();

    String getGPVersion();

    long getLastBootTime();

    long getOSInstallationTime();

    long getSDKInstallationTime();

    String getUserAgent();

    void getUserAgentLazy(m0.a aVar);

    float getVolumeLevel();

    boolean isBatterySaverEnabled();

    boolean isProblematicMaliDevice();

    boolean isSdCardPresent();

    boolean isSideLoaded();

    boolean isSilentModeEnabled();

    boolean isSoundEnabled();
}
