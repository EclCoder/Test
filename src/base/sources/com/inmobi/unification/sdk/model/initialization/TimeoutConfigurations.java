package com.inmobi.unification.sdk.model.initialization;

import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import com.inmobi.media.AbstractC3098ki;
import com.inmobi.media.Hk;
import com.inmobi.media.Ik;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class TimeoutConfigurations implements Serializable {
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_MUTT_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_MUTT_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_MUTT_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_MUTT_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_RETRY_INTERVAL = 1000;
    private static final int DEFAULT_AB_AUDIO_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_AB_BANNER_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_AB_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_AB_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_MAX_RETRIES = 3;
    private static final int DEFAULT_NONAB_AUDIO_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_AUDIO_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_BANNER_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_BANNER_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_INTERSTITIAL_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_NATIVE_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_NATIVE_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_RETRY_INTERVAL = 1000;
    public static final int DEFAULT_TIMEOUT = 15000;
    public static final Ik Companion = new Ik();
    private static final String DEFAULT_KEY = "default";
    private static final String APPLOVIN_KEY = "c_applovin";
    private static final JSONObject defaultNonABBannerloadTimeout = Hk.a(29500, 9500, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultNonABBannerMuttTimeout = Hk.a(29500, 9500, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultNonABBannerMaxRetries = Hk.a(3, 3, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultNonABBannerRetryInterval = Hk.a(1000, 1000, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultNonABIntloadTimeout = Hk.a(29500, 14500, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultNonABIntMuttTimeout = Hk.a(29500, 14500, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultNonABIntMaxRetries = Hk.a(3, 3, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultNonABIntRetryInterval = Hk.a(1000, 1000, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultNonABNativeloadTimeout = Hk.a(29500, 14500, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultNonABNativeMuttTimeout = Hk.a(29500, 14500, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultNonABNativeMaxRetries = Hk.a(3, 3, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultNonABNativeRetryInterval = Hk.a(1000, 1000, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultNonABAudioloadTimeout = Hk.a(29500, 9500, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultNonABAudioMuttTimeout = Hk.a(29500, 9500, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultNonABAudioMaxRetries = Hk.a(3, 3, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultNonABAudioRetryInterval = Hk.a(1000, 1000, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultABBannerloadTimeout = Hk.a(14500, 9500, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultABBannerMaxRetries = Hk.a(3, 3, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultABBannerRetryInterval = Hk.a(1000, 1000, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultABIntloadTimeout = Hk.a(29500, 29500, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultABIntMaxRetries = Hk.a(3, 3, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultABIntRetryInterval = Hk.a(1000, 1000, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultABNativeloadTimeout = Hk.a(14500, 14500, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultABNativeMaxRetries = Hk.a(3, 3, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultABNativeRetryInterval = Hk.a(1000, 1000, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultABAudioloadTimeout = Hk.a(14500, 9500, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultABAudioMaxRetries = Hk.a(3, 3, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultABAudioRetryInterval = Hk.a(1000, 1000, DEFAULT_KEY, APPLOVIN_KEY);
    private static final JSONObject defaultPreloadBannerPreloadTimeout = AbstractC3098ki.a(DEFAULT_KEY, 29500);
    private static final JSONObject defaultPreloadBannerMuttTimeout = AbstractC3098ki.a(DEFAULT_KEY, 29500);
    private static final JSONObject defaultPreloadBannerLoadTimeout = AbstractC3098ki.a(DEFAULT_KEY, 14500);
    private static final JSONObject defaultPreloadBannerMaxRetries = AbstractC3098ki.a(DEFAULT_KEY, 3);
    private static final JSONObject defaultPreloadBannerRetryInterval = AbstractC3098ki.a(DEFAULT_KEY, 1000);
    private static final JSONObject defaultPreloadIntPreloadTimeout = AbstractC3098ki.a(DEFAULT_KEY, 29500);
    private static final JSONObject defaultPreloadIntMuttTimeout = AbstractC3098ki.a(DEFAULT_KEY, 29500);
    private static final JSONObject defaultPreloadIntloadTimeout = AbstractC3098ki.a(DEFAULT_KEY, 29500);
    private static final JSONObject defaultPreloadIntMaxRetries = AbstractC3098ki.a(DEFAULT_KEY, 3);
    private static final JSONObject defaultPreloadIntRetryInterval = AbstractC3098ki.a(DEFAULT_KEY, 1000);
    private static final JSONObject defaultPreloadNativePreloadTimeout = AbstractC3098ki.a(DEFAULT_KEY, 29500);
    private static final JSONObject defaultPreloadNativeMuttTimeout = AbstractC3098ki.a(DEFAULT_KEY, 29500);
    private static final JSONObject defaultPreloadNativeloadTimeout = AbstractC3098ki.a(DEFAULT_KEY, 14500);
    private static final JSONObject defaultPreloadNativeMaxRetries = AbstractC3098ki.a(DEFAULT_KEY, 3);
    private static final JSONObject defaultPreloadNativeRetryInterval = AbstractC3098ki.a(DEFAULT_KEY, 1000);
    private static final JSONObject defaultPreloadAudioPreloadTimeout = AbstractC3098ki.a(DEFAULT_KEY, 29500);
    private static final JSONObject defaultPreloadAudioMuttTimeout = AbstractC3098ki.a(DEFAULT_KEY, 29500);
    private static final JSONObject defaultPreloadAudioloadTimeout = AbstractC3098ki.a(DEFAULT_KEY, 14500);
    private static final JSONObject defaultPreloadAudioMaxRetries = AbstractC3098ki.a(DEFAULT_KEY, 3);
    private static final JSONObject defaultPreloadAudioRetryInterval = AbstractC3098ki.a(DEFAULT_KEY, 1000);
    private static final o validator = new o() { // from class: ai.a
        @Override // tl.o
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(TimeoutConfigurations.a((JSONObject) obj, ((Integer) obj2).intValue()));
        }
    };
    private int step4s = 15000;
    private MediationConfig mediationConfig = new MediationConfig();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$ABConfig;", "", "<init>", "()V", "banner", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdABConfig;", "int", "native", MimeTypes.BASE_TYPE_AUDIO, "getBanner", "getInterstitial", "getNative", "getAudio", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ABConfig {
        private AdABConfig audio;
        private AdABConfig banner;
        private AdABConfig int;
        private AdABConfig native;

        public ABConfig() {
            TimeoutConfigurations.Companion.getClass();
            this.banner = new AdABConfig(TimeoutConfigurations.defaultABBannerloadTimeout, TimeoutConfigurations.defaultABBannerRetryInterval, TimeoutConfigurations.defaultABBannerMaxRetries);
            this.int = new AdABConfig(TimeoutConfigurations.defaultABIntloadTimeout, TimeoutConfigurations.defaultABIntRetryInterval, TimeoutConfigurations.defaultABIntMaxRetries);
            this.native = new AdABConfig(TimeoutConfigurations.defaultABNativeloadTimeout, TimeoutConfigurations.defaultABNativeRetryInterval, TimeoutConfigurations.defaultABNativeMaxRetries);
            this.audio = new AdABConfig(TimeoutConfigurations.defaultABAudioloadTimeout, TimeoutConfigurations.defaultABAudioRetryInterval, TimeoutConfigurations.defaultABAudioMaxRetries);
        }

        public final AdABConfig getAudio() {
            return this.audio;
        }

        public final AdABConfig getBanner() {
            return this.banner;
        }

        /* JADX INFO: renamed from: getInterstitial, reason: from getter */
        public final AdABConfig getInt() {
            return this.int;
        }

        public final AdABConfig getNative() {
            return this.native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.int.isValid() && this.native.isValid() && this.audio.isValid();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$MediationConfig;", "", "<init>", "()V", "ab", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$ABConfig;", "nonAb", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$NonABConfig;", "preload", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$PreloadConfig;", "getABConfig", "getNonABConfig", "getPreloadConfig", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MediationConfig {
        private ABConfig ab = new ABConfig();
        private NonABConfig nonAb = new NonABConfig();
        private PreloadConfig preload = new PreloadConfig();

        /* JADX INFO: renamed from: getABConfig, reason: from getter */
        public final ABConfig getAb() {
            return this.ab;
        }

        /* JADX INFO: renamed from: getNonABConfig, reason: from getter */
        public final NonABConfig getNonAb() {
            return this.nonAb;
        }

        /* JADX INFO: renamed from: getPreloadConfig, reason: from getter */
        public final PreloadConfig getPreload() {
            return this.preload;
        }

        public final boolean isValid() {
            return this.ab.isValid() && this.nonAb.isValid() && this.preload.isValid();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$NonABConfig;", "", "<init>", "()V", "banner", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdNonABConfig;", "int", "native", MimeTypes.BASE_TYPE_AUDIO, "getBanner", "getInterstitial", "getNative", "getAudio", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NonABConfig {
        private AdNonABConfig audio;
        private AdNonABConfig banner;
        private AdNonABConfig int;
        private AdNonABConfig native;

        public NonABConfig() {
            TimeoutConfigurations.Companion.getClass();
            this.banner = new AdNonABConfig(TimeoutConfigurations.defaultNonABBannerloadTimeout, TimeoutConfigurations.defaultNonABBannerMuttTimeout, TimeoutConfigurations.defaultNonABBannerRetryInterval, TimeoutConfigurations.defaultNonABBannerMaxRetries);
            this.int = new AdNonABConfig(TimeoutConfigurations.defaultNonABIntloadTimeout, TimeoutConfigurations.defaultNonABIntMuttTimeout, TimeoutConfigurations.defaultNonABIntRetryInterval, TimeoutConfigurations.defaultNonABIntMaxRetries);
            this.native = new AdNonABConfig(TimeoutConfigurations.defaultNonABNativeloadTimeout, TimeoutConfigurations.defaultNonABNativeMuttTimeout, TimeoutConfigurations.defaultNonABNativeRetryInterval, TimeoutConfigurations.defaultNonABNativeMaxRetries);
            this.audio = new AdNonABConfig(TimeoutConfigurations.defaultNonABAudioloadTimeout, TimeoutConfigurations.defaultNonABAudioMuttTimeout, TimeoutConfigurations.defaultNonABAudioRetryInterval, TimeoutConfigurations.defaultNonABAudioMaxRetries);
        }

        public final AdNonABConfig getAudio() {
            return this.audio;
        }

        public final AdNonABConfig getBanner() {
            return this.banner;
        }

        /* JADX INFO: renamed from: getInterstitial, reason: from getter */
        public final AdNonABConfig getInt() {
            return this.int;
        }

        public final AdNonABConfig getNative() {
            return this.native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.int.isValid() && this.native.isValid() && this.audio.isValid();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$PreloadConfig;", "", "<init>", "()V", "banner", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdPreloadConfig;", "int", "native", MimeTypes.BASE_TYPE_AUDIO, "getBanner", "getInterstitial", "getNative", "getAudio", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PreloadConfig {
        private AdPreloadConfig audio;
        private AdPreloadConfig banner;
        private AdPreloadConfig int;
        private AdPreloadConfig native;

        public PreloadConfig() {
            TimeoutConfigurations.Companion.getClass();
            this.banner = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadBannerPreloadTimeout, TimeoutConfigurations.defaultPreloadBannerMuttTimeout, TimeoutConfigurations.defaultPreloadBannerLoadTimeout, TimeoutConfigurations.defaultPreloadBannerRetryInterval, TimeoutConfigurations.defaultPreloadBannerMaxRetries);
            this.int = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadIntPreloadTimeout, TimeoutConfigurations.defaultPreloadIntMuttTimeout, TimeoutConfigurations.defaultPreloadIntloadTimeout, TimeoutConfigurations.defaultPreloadIntRetryInterval, TimeoutConfigurations.defaultPreloadIntMaxRetries);
            this.native = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadNativePreloadTimeout, TimeoutConfigurations.defaultPreloadNativeMuttTimeout, TimeoutConfigurations.defaultPreloadNativeloadTimeout, TimeoutConfigurations.defaultPreloadNativeRetryInterval, TimeoutConfigurations.defaultPreloadNativeMaxRetries);
            this.audio = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadAudioPreloadTimeout, TimeoutConfigurations.defaultPreloadAudioMuttTimeout, TimeoutConfigurations.defaultPreloadAudioloadTimeout, TimeoutConfigurations.defaultPreloadAudioRetryInterval, TimeoutConfigurations.defaultPreloadAudioMaxRetries);
        }

        public final AdPreloadConfig getAudio() {
            return this.audio;
        }

        public final AdPreloadConfig getBanner() {
            return this.banner;
        }

        /* JADX INFO: renamed from: getInterstitial, reason: from getter */
        public final AdPreloadConfig getInt() {
            return this.int;
        }

        public final AdPreloadConfig getNative() {
            return this.native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.int.isValid() && this.native.isValid() && this.audio.isValid();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\"\u0010\u0018\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014¨\u0006 "}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$RenderTimeoutByType;", "", "<init>", "()V", "", "adType", "", "defValue", "getTimeoutByType$media_release", "(Ljava/lang/String;I)I", "getTimeoutByType", "timeout", "Lfl/g0;", "setTimeoutByType", "(Ljava/lang/String;I)V", "banner", "I", "getBanner$media_release", "()I", "setBanner$media_release", "(I)V", MimeTypes.BASE_TYPE_AUDIO, "getAudio$media_release", "setAudio$media_release", "int", "getInt$media_release", "setInt$media_release", "native", "getNative$media_release", "setNative$media_release", "Companion", "com/inmobi/unification/sdk/model/initialization/a", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RenderTimeoutByType {
        public static final a Companion = new a();
        private int audio;
        private int banner;
        private int int;
        private int native;

        public /* synthetic */ RenderTimeoutByType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getAudio$media_release, reason: from getter */
        public final int getAudio() {
            return this.audio;
        }

        /* JADX INFO: renamed from: getBanner$media_release, reason: from getter */
        public final int getBanner() {
            return this.banner;
        }

        /* JADX INFO: renamed from: getInt$media_release, reason: from getter */
        public final int getInt() {
            return this.int;
        }

        /* JADX INFO: renamed from: getNative$media_release, reason: from getter */
        public final int getNative() {
            return this.native;
        }

        public final int getTimeoutByType$media_release(String adType, int defValue) {
            int i10;
            int i11;
            int i12;
            int i13;
            s.h(adType, "adType");
            int iHashCode = adType.hashCode();
            if (iHashCode != -1396342996) {
                if (iHashCode != -1052618729) {
                    if (iHashCode != 104431) {
                        if (iHashCode == 93166550 && adType.equals(MimeTypes.BASE_TYPE_AUDIO) && (i13 = this.audio) > 0) {
                            return i13;
                        }
                    } else if (adType.equals("int") && (i12 = this.int) > 0) {
                        return i12;
                    }
                } else if (adType.equals("native") && (i11 = this.native) > 0) {
                    return i11;
                }
            } else if (adType.equals("banner") && (i10 = this.banner) > 0) {
                return i10;
            }
            return defValue;
        }

        public final void setAudio$media_release(int i10) {
            this.audio = i10;
        }

        public final void setBanner$media_release(int i10) {
            this.banner = i10;
        }

        public final void setInt$media_release(int i10) {
            this.int = i10;
        }

        public final void setNative$media_release(int i10) {
            this.native = i10;
        }

        public final void setTimeoutByType(String adType, int timeout) {
            s.h(adType, "adType");
            int iHashCode = adType.hashCode();
            if (iHashCode == -1396342996) {
                if (adType.equals("banner")) {
                    this.banner = timeout;
                }
            } else if (iHashCode == -1052618729) {
                if (adType.equals("native")) {
                    this.native = timeout;
                }
            } else if (iHashCode == 104431) {
                if (adType.equals("int")) {
                    this.int = timeout;
                }
            } else if (iHashCode == 93166550 && adType.equals(MimeTypes.BASE_TYPE_AUDIO)) {
                this.audio = timeout;
            }
        }

        private RenderTimeoutByType() {
        }
    }

    public final MediationConfig X() {
        return this.mediationConfig;
    }

    public final int Y() {
        return this.step4s;
    }

    public final boolean Z() {
        return this.step4s >= 0 && this.mediationConfig.isValid();
    }

    public final void a0() {
        int i10 = this.step4s;
        if (i10 <= 0) {
            i10 = 15000;
        }
        this.step4s = i10;
    }

    public static final boolean a(JSONObject param, int i10) {
        s.h(param, "param");
        Iterator<String> itKeys = param.keys();
        s.g(itKeys, "keys(...)");
        boolean z10 = true;
        while (itKeys.hasNext()) {
            if (param.getInt(itKeys.next()) < i10) {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\bJ\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdABConfig;", "", "<init>", "()V", "loadTimeout", "Lorg/json/JSONObject;", "retryInterval", "maxRetries", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "loadRetryInterval", "maxLoadRetries", "getLoadTimeout", "getRetryInterval", "getMaxRetries", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdABConfig {
        private JSONObject loadRetryInterval;
        private JSONObject loadTimeout;
        private JSONObject maxLoadRetries;

        public AdABConfig() {
            this.loadTimeout = new JSONObject();
            this.loadRetryInterval = new JSONObject();
            this.maxLoadRetries = new JSONObject();
        }

        public final JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        /* JADX INFO: renamed from: getMaxRetries, reason: from getter */
        public final JSONObject getMaxLoadRetries() {
            return this.maxLoadRetries;
        }

        /* JADX INFO: renamed from: getRetryInterval, reason: from getter */
        public final JSONObject getLoadRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isValid() {
            TimeoutConfigurations.Companion.getClass();
            return ((Boolean) TimeoutConfigurations.validator.invoke(this.loadTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.loadRetryInterval, 1)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.maxLoadRetries, 1)).booleanValue();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdABConfig(JSONObject loadTimeout, JSONObject retryInterval, JSONObject maxRetries) {
            this();
            s.h(loadTimeout, "loadTimeout");
            s.h(retryInterval, "retryInterval");
            s.h(maxRetries, "maxRetries");
            this.loadTimeout = loadTimeout;
            this.loadRetryInterval = retryInterval;
            this.maxLoadRetries = maxRetries;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\tJ\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdNonABConfig;", "", "<init>", "()V", "loadTimeout", "Lorg/json/JSONObject;", "muttTimeout", "retryInterval", "maxRetries", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "loadRetryInterval", "maxLoadRetries", "getLoadTimeout", "getMuttTimeout", "getRetryInterval", "getMaxRetries", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdNonABConfig {
        private JSONObject loadRetryInterval;
        private JSONObject loadTimeout;
        private JSONObject maxLoadRetries;
        private JSONObject muttTimeout;

        public AdNonABConfig() {
            this.loadTimeout = new JSONObject();
            this.muttTimeout = new JSONObject();
            this.loadRetryInterval = new JSONObject();
            this.maxLoadRetries = new JSONObject();
        }

        public final JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        /* JADX INFO: renamed from: getMaxRetries, reason: from getter */
        public final JSONObject getMaxLoadRetries() {
            return this.maxLoadRetries;
        }

        public final JSONObject getMuttTimeout() {
            return this.muttTimeout;
        }

        /* JADX INFO: renamed from: getRetryInterval, reason: from getter */
        public final JSONObject getLoadRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isValid() {
            TimeoutConfigurations.Companion.getClass();
            return ((Boolean) TimeoutConfigurations.validator.invoke(this.muttTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.loadTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.loadRetryInterval, 1)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.maxLoadRetries, 1)).booleanValue();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdNonABConfig(JSONObject loadTimeout, JSONObject muttTimeout, JSONObject retryInterval, JSONObject jSONObject) {
            this();
            s.h(loadTimeout, "loadTimeout");
            s.h(muttTimeout, "muttTimeout");
            s.h(retryInterval, "retryInterval");
            s.h(jSONObject, PvZsvNiPV.aWiPgDvuSDrXz);
            this.loadTimeout = loadTimeout;
            this.muttTimeout = muttTimeout;
            this.loadRetryInterval = retryInterval;
            this.maxLoadRetries = jSONObject;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B1\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\nJ\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u0005J\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdPreloadConfig;", "", "<init>", "()V", "preloadTimeout", "Lorg/json/JSONObject;", "muttTimeout", "loadTimeout", "retryInterval", "maxRetries", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "loadRetryInterval", "maxLoadRetries", "getPreloadTimeout", "getMuttTimeout", "getLoadTimeout", "getRetryInterval", "getMaxRetries", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdPreloadConfig {
        private JSONObject loadRetryInterval;
        private JSONObject loadTimeout;
        private JSONObject maxLoadRetries;
        private JSONObject muttTimeout;
        private JSONObject preloadTimeout;

        public AdPreloadConfig() {
            this.preloadTimeout = new JSONObject();
            this.muttTimeout = new JSONObject();
            this.loadTimeout = new JSONObject();
            this.loadRetryInterval = new JSONObject();
            this.maxLoadRetries = new JSONObject();
        }

        public final JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        /* JADX INFO: renamed from: getMaxRetries, reason: from getter */
        public final JSONObject getMaxLoadRetries() {
            return this.maxLoadRetries;
        }

        public final JSONObject getMuttTimeout() {
            return this.muttTimeout;
        }

        public final JSONObject getPreloadTimeout() {
            return this.preloadTimeout;
        }

        /* JADX INFO: renamed from: getRetryInterval, reason: from getter */
        public final JSONObject getLoadRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isValid() {
            TimeoutConfigurations.Companion.getClass();
            return ((Boolean) TimeoutConfigurations.validator.invoke(this.loadTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.loadRetryInterval, 1)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.maxLoadRetries, 1)).booleanValue();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdPreloadConfig(JSONObject preloadTimeout, JSONObject muttTimeout, JSONObject loadTimeout, JSONObject retryInterval, JSONObject maxRetries) {
            this();
            s.h(preloadTimeout, "preloadTimeout");
            s.h(muttTimeout, "muttTimeout");
            s.h(loadTimeout, "loadTimeout");
            s.h(retryInterval, "retryInterval");
            s.h(maxRetries, "maxRetries");
            this.preloadTimeout = preloadTimeout;
            this.muttTimeout = muttTimeout;
            this.loadTimeout = loadTimeout;
            this.loadRetryInterval = retryInterval;
            this.maxLoadRetries = maxRetries;
        }
    }
}
