package com.vungle.ads.internal;

import android.content.Context;
import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vungle.ads.APIFailedStatusCodeError;
import com.vungle.ads.InvalidEndpointError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.d0;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fl.g0;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import kotlinx.serialization.json.v;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class e {
    private static final int CONFIG_ALL_DATA = 2;
    private static final int CONFIG_LAST_VALIDATED_TIMESTAMP_ONLY = 1;
    public static final long CONFIG_LAST_VALIDATE_TS_DEFAULT = -1;
    private static final int CONFIG_NOT_AVAILABLE = 0;
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 900;
    private static final int DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS = 1800;
    public static final String TAG = "ConfigManager";
    private static String applicationId;
    private static com.vungle.ads.internal.model.g config;
    private static String configExt;
    private static com.vungle.ads.internal.model.g.Endpoints endpoints;
    private static List<Placement> placements;
    public static final e INSTANCE = new e();
    private static final fl.k json$delegate = fl.l.a(fl.o.SYNCHRONIZED, f.INSTANCE);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.k, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.network.k invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.k.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class b implements com.vungle.ads.internal.network.b {
        final /* synthetic */ Context $context;
        final /* synthetic */ Function1 $onComplete;

        b(Function1 function1, Context context) {
            this.$onComplete = function1;
            this.$context = context;
        }

        @Override // com.vungle.ads.internal.network.b
        public void onFailure(com.vungle.ads.internal.network.a aVar, Throwable th2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error while fetching config: ");
            sb2.append(th2 != null ? th2.getMessage() : null);
            new NetworkUnreachable(sb2.toString()).logErrorNoReturnValue$vungle_ads_release();
            this.$onComplete.invoke(Boolean.FALSE);
        }

        @Override // com.vungle.ads.internal.network.b
        public void onResponse(com.vungle.ads.internal.network.a aVar, com.vungle.ads.internal.network.f fVar) {
            if (fVar != null && fVar.isSuccessful() && fVar.body() != null) {
                e.INSTANCE.initWithConfig$vungle_ads_release(this.$context, (com.vungle.ads.internal.model.g) fVar.body(), false, new d0(Sdk$SDKMetric.b.CONFIG_LOADED_FROM_INIT));
                this.$onComplete.invoke(Boolean.TRUE);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("config API: ");
            sb2.append(fVar != null ? Integer.valueOf(fVar.code()) : null);
            new APIFailedStatusCodeError(sb2.toString()).logErrorNoReturnValue$vungle_ads_release();
            this.$onComplete.invoke(Boolean.FALSE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class c extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.b, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.persistence.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.persistence.b.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class d extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.k, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.network.k invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.k.class);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class C0506e extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0506e(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.a, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.executor.a invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class f extends t implements tl.a {
        public static final f INSTANCE = new f();

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends t implements Function1 {
            public static final a INSTANCE = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((kotlinx.serialization.json.e) obj);
                return g0.f38750a;
            }

            public final void invoke(kotlinx.serialization.json.e Json) {
                s.h(Json, "$this$Json");
                Json.f(true);
                Json.d(true);
                Json.e(false);
            }
        }

        f() {
            super(0);
        }

        @Override // tl.a
        public final kotlinx.serialization.json.b invoke() {
            return v.b(null, a.INSTANCE, 1, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class g extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.b, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.persistence.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.persistence.b.class);
        }
    }

    private e() {
    }

    /* JADX INFO: renamed from: fetchConfigAsync$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.network.k m84fetchConfigAsync$lambda0(fl.k kVar) {
        return (com.vungle.ads.internal.network.k) kVar.getValue();
    }

    private final kotlinx.serialization.json.b getJson() {
        return (kotlinx.serialization.json.b) json$delegate.getValue();
    }

    /* JADX INFO: renamed from: initWithConfig$lambda-2, reason: not valid java name */
    private static final com.vungle.ads.internal.persistence.b m85initWithConfig$lambda2(fl.k kVar) {
        return (com.vungle.ads.internal.persistence.b) kVar.getValue();
    }

    /* JADX INFO: renamed from: initWithConfig$lambda-4, reason: not valid java name */
    private static final com.vungle.ads.internal.network.k m86initWithConfig$lambda4(fl.k kVar) {
        return (com.vungle.ads.internal.network.k) kVar.getValue();
    }

    /* JADX INFO: renamed from: initWithConfig$lambda-5, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.a m87initWithConfig$lambda5(fl.k kVar) {
        return (com.vungle.ads.internal.executor.a) kVar.getValue();
    }

    public static /* synthetic */ void initWithConfig$vungle_ads_release$default(e eVar, Context context, com.vungle.ads.internal.model.g gVar, boolean z10, d0 d0Var, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            d0Var = null;
        }
        eVar.initWithConfig$vungle_ads_release(context, gVar, z10, d0Var);
    }

    /* JADX INFO: renamed from: updateConfigExtension$lambda-1, reason: not valid java name */
    private static final com.vungle.ads.internal.persistence.b m88updateConfigExtension$lambda1(fl.k kVar) {
        return (com.vungle.ads.internal.persistence.b) kVar.getValue();
    }

    public static /* synthetic */ boolean validateEndpoints$vungle_ads_release$default(e eVar, com.vungle.ads.internal.model.g.Endpoints fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = endpoints;
        }
        return eVar.validateEndpoints$vungle_ads_release(fVar);
    }

    public final long afterClickDuration() {
        com.vungle.ads.internal.model.g.AutoRedirect autoRedirect;
        Long afterClickDuration;
        com.vungle.ads.internal.model.g gVar = config;
        if (gVar == null || (autoRedirect = gVar.getAutoRedirect()) == null || (afterClickDuration = autoRedirect.getAfterClickDuration()) == null) {
            return Long.MAX_VALUE;
        }
        return afterClickDuration.longValue();
    }

    public final boolean allowAutoRedirects() {
        com.vungle.ads.internal.model.g.AutoRedirect autoRedirect;
        Boolean allowAutoRedirect;
        com.vungle.ads.internal.model.g gVar = config;
        if (gVar == null || (autoRedirect = gVar.getAutoRedirect()) == null || (allowAutoRedirect = autoRedirect.getAllowAutoRedirect()) == null) {
            return false;
        }
        return allowAutoRedirect.booleanValue();
    }

    public final int checkConfigPayload$vungle_ads_release(com.vungle.ads.internal.model.g gVar) {
        Long configLastValidatedTimestamp;
        if (gVar == null || gVar.getConfigLastValidatedTimestamp() == null || ((configLastValidatedTimestamp = gVar.getConfigLastValidatedTimestamp()) != null && configLastValidatedTimestamp.longValue() == -1)) {
            return 0;
        }
        return gVar.getEndpoints() == null ? 1 : 2;
    }

    public final void clearConfig$vungle_ads_release() {
        endpoints = null;
        placements = null;
        config = null;
    }

    public final long configLastValidatedTimestamp() {
        Long configLastValidatedTimestamp;
        com.vungle.ads.internal.model.g gVar = config;
        if (gVar == null || (configLastValidatedTimestamp = gVar.getConfigLastValidatedTimestamp()) == null) {
            return -1L;
        }
        return configLastValidatedTimestamp.longValue();
    }

    public final void fetchConfigAsync$vungle_ads_release(Context context, Function1 onComplete) {
        s.h(context, "context");
        s.h(onComplete, "onComplete");
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        try {
            com.vungle.ads.internal.network.a aVarConfig = m84fetchConfigAsync$lambda0(fl.l.a(fl.o.SYNCHRONIZED, new a(context))).config();
            if (aVarConfig != null) {
                aVarConfig.enqueue(new b(onComplete, context));
            }
        } catch (Throwable th2) {
            if (th2 instanceof UnknownHostException ? true : th2 instanceof SecurityException) {
                new NetworkUnreachable("Config unknown: " + th2.getMessage()).logErrorNoReturnValue$vungle_ads_release();
            } else {
                new NetworkUnreachable("Config: " + th2.getMessage()).logErrorNoReturnValue$vungle_ads_release();
            }
            onComplete.invoke(Boolean.FALSE);
        }
    }

    public final boolean fpdEnabled() {
        Boolean fpdEnabled;
        com.vungle.ads.internal.model.g gVar = config;
        if (gVar == null || (fpdEnabled = gVar.getFpdEnabled()) == null) {
            return true;
        }
        return fpdEnabled.booleanValue();
    }

    public final String getAdsEndpoint() {
        com.vungle.ads.internal.model.g.Endpoints fVar = endpoints;
        String str = null;
        String adsEndpoint = fVar != null ? fVar.getAdsEndpoint() : null;
        if (adsEndpoint != null && adsEndpoint.length() != 0) {
            str = adsEndpoint;
        }
        return str == null ? com.vungle.ads.internal.f.DEFAULT_ADS_ENDPOINT : str;
    }

    public final String getCSBEndpoint() {
        com.vungle.ads.internal.model.g.Endpoints fVar = endpoints;
        String str = null;
        String csbEndpoint = fVar != null ? fVar.getCsbEndpoint() : null;
        if (csbEndpoint != null && csbEndpoint.length() != 0) {
            str = csbEndpoint;
        }
        return str == null ? com.vungle.ads.internal.f.DEFAULT_CSB_ENDPOINT : str;
    }

    public final int getCleverCacheDiskPercentage() {
        com.vungle.ads.internal.model.g.CleverCache cleverCache;
        Integer diskPercentage;
        com.vungle.ads.internal.model.g gVar = config;
        if (gVar == null || (cleverCache = gVar.getCleverCache()) == null || (diskPercentage = cleverCache.getDiskPercentage()) == null) {
            return 3;
        }
        return diskPercentage.intValue();
    }

    public final long getCleverCacheDiskSize() {
        com.vungle.ads.internal.model.g.CleverCache cleverCache;
        Long diskSize;
        com.vungle.ads.internal.model.g gVar = config;
        if (gVar == null || (cleverCache = gVar.getCleverCache()) == null || (diskSize = cleverCache.getDiskSize()) == null) {
            return 1048576000L;
        }
        long jLongValue = diskSize.longValue();
        long j10 = UserVerificationMethods.USER_VERIFY_ALL;
        return jLongValue * j10 * j10;
    }

    public final String getConfigExtension() {
        String str = configExt;
        return str == null ? "" : str;
    }

    public final String getErrorLoggingEndpoint() {
        com.vungle.ads.internal.model.g.Endpoints fVar = endpoints;
        String str = null;
        String errorLogsEndpoint = fVar != null ? fVar.getErrorLogsEndpoint() : null;
        if (errorLogsEndpoint != null && errorLogsEndpoint.length() != 0) {
            str = errorLogsEndpoint;
        }
        return str == null ? com.vungle.ads.internal.f.DEFAULT_ERROR_LOGS_ENDPOINT : str;
    }

    public final String getGDPRButtonAccept() {
        com.vungle.ads.internal.model.g.UserPrivacy userPrivacy;
        com.vungle.ads.internal.model.g.GDPRSettings gdpr;
        com.vungle.ads.internal.model.g gVar = config;
        if (gVar == null || (userPrivacy = gVar.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonAccept();
    }

    public final String getGDPRButtonDeny() {
        com.vungle.ads.internal.model.g.UserPrivacy userPrivacy;
        com.vungle.ads.internal.model.g.GDPRSettings gdpr;
        com.vungle.ads.internal.model.g gVar = config;
        if (gVar == null || (userPrivacy = gVar.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonDeny();
    }

    public final String getGDPRConsentMessage() {
        com.vungle.ads.internal.model.g.UserPrivacy userPrivacy;
        com.vungle.ads.internal.model.g.GDPRSettings gdpr;
        com.vungle.ads.internal.model.g gVar = config;
        if (gVar == null || (userPrivacy = gVar.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentMessage();
    }

    public final String getGDPRConsentMessageVersion() {
        com.vungle.ads.internal.model.g.UserPrivacy userPrivacy;
        com.vungle.ads.internal.model.g.GDPRSettings gdpr;
        String consentMessageVersion;
        com.vungle.ads.internal.model.g gVar = config;
        return (gVar == null || (userPrivacy = gVar.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null || (consentMessageVersion = gdpr.getConsentMessageVersion()) == null) ? "" : consentMessageVersion;
    }

    public final String getGDPRConsentTitle() {
        com.vungle.ads.internal.model.g.UserPrivacy userPrivacy;
        com.vungle.ads.internal.model.g.GDPRSettings gdpr;
        com.vungle.ads.internal.model.g gVar = config;
        if (gVar == null || (userPrivacy = gVar.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentTitle();
    }

    public final boolean getGDPRIsCountryDataProtected() {
        com.vungle.ads.internal.model.g.UserPrivacy userPrivacy;
        com.vungle.ads.internal.model.g.GDPRSettings gdpr;
        Boolean boolIsCountryDataProtected;
        com.vungle.ads.internal.model.g gVar = config;
        if (gVar == null || (userPrivacy = gVar.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null || (boolIsCountryDataProtected = gdpr.isCountryDataProtected()) == null) {
            return false;
        }
        return boolIsCountryDataProtected.booleanValue();
    }

    public final int getLogLevel() {
        com.vungle.ads.internal.model.g.LogMetricsSettings logMetricsSettings;
        Integer errorLogLevel;
        com.vungle.ads.internal.model.g gVar = config;
        return (gVar == null || (logMetricsSettings = gVar.getLogMetricsSettings()) == null || (errorLogLevel = logMetricsSettings.getErrorLogLevel()) == null) ? com.vungle.ads.g.a.ERROR_LOG_LEVEL_ERROR.getLevel() : errorLogLevel.intValue();
    }

    public final boolean getMetricsEnabled() {
        com.vungle.ads.internal.model.g.LogMetricsSettings logMetricsSettings;
        Boolean metricsEnabled;
        com.vungle.ads.internal.model.g gVar = config;
        if (gVar == null || (logMetricsSettings = gVar.getLogMetricsSettings()) == null || (metricsEnabled = logMetricsSettings.getMetricsEnabled()) == null) {
            return false;
        }
        return metricsEnabled.booleanValue();
    }

    public final String getMetricsEndpoint() {
        com.vungle.ads.internal.model.g.Endpoints fVar = endpoints;
        String str = null;
        String metricsEndpoint = fVar != null ? fVar.getMetricsEndpoint() : null;
        if (metricsEndpoint != null && metricsEndpoint.length() != 0) {
            str = metricsEndpoint;
        }
        return str == null ? com.vungle.ads.internal.f.DEFAULT_METRICS_ENDPOINT : str;
    }

    public final Placement getPlacement(String str) {
        List<Placement> list = placements;
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (s.c(((Placement) obj2).getReferenceId(), str)) {
                obj = obj2;
                break;
            }
        }
        return (Placement) obj;
    }

    public final String getRiEndpoint() {
        com.vungle.ads.internal.model.g.Endpoints fVar = endpoints;
        if (fVar != null) {
            return fVar.getRiEndpoint();
        }
        return null;
    }

    public final long getSessionTimeout() {
        Integer sessionTimeout;
        com.vungle.ads.internal.model.g gVar = config;
        return ((long) ((gVar == null || (sessionTimeout = gVar.getSessionTimeout()) == null) ? DEFAULT_SESSION_TIMEOUT_SECONDS : sessionTimeout.intValue())) * 1000;
    }

    public final long getSignalsSessionTimeout() {
        Integer signalSessionTimeout;
        com.vungle.ads.internal.model.g gVar = config;
        return ((long) ((gVar == null || (signalSessionTimeout = gVar.getSignalSessionTimeout()) == null) ? DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS : signalSessionTimeout.intValue())) * 1000;
    }

    public final com.vungle.ads.internal.model.g.IABSettings.c getTcfStatus() {
        com.vungle.ads.internal.model.g.UserPrivacy userPrivacy;
        com.vungle.ads.internal.model.g.IABSettings iab;
        com.vungle.ads.internal.model.g.IABSettings.c.a aVar = com.vungle.ads.internal.model.g.IABSettings.c.Companion;
        com.vungle.ads.internal.model.g gVar = config;
        return aVar.fromRawValue((gVar == null || (userPrivacy = gVar.getUserPrivacy()) == null || (iab = userPrivacy.getIab()) == null) ? null : iab.getTcfStatus());
    }

    public final synchronized void initWithConfig$vungle_ads_release(Context context, com.vungle.ads.internal.model.g gVar, boolean z10, d0 d0Var) {
        try {
            s.h(context, "context");
            try {
                ServiceLocator.Companion companion = ServiceLocator.Companion;
                fl.o oVar = fl.o.SYNCHRONIZED;
                fl.k kVarA = fl.l.a(oVar, new c(context));
                int iCheckConfigPayload$vungle_ads_release = checkConfigPayload$vungle_ads_release(gVar);
                if (iCheckConfigPayload$vungle_ads_release == 0) {
                    com.vungle.ads.internal.util.q.Companion.e(TAG, "Config is not available.");
                    return;
                }
                if (iCheckConfigPayload$vungle_ads_release == 1) {
                    if (!z10 && gVar != null) {
                        Long configLastValidatedTimestamp = gVar.getConfigLastValidatedTimestamp();
                        long jLongValue = configLastValidatedTimestamp != null ? configLastValidatedTimestamp.longValue() : -1L;
                        com.vungle.ads.internal.model.g gVar2 = config;
                        if (gVar2 != null) {
                            gVar2.setConfigLastValidatedTimestamp(Long.valueOf(jLongValue));
                        }
                        com.vungle.ads.internal.model.g gVar3 = config;
                        if (gVar3 != null) {
                            INSTANCE.updateCachedConfig(gVar3, m85initWithConfig$lambda2(kVarA));
                        }
                    }
                    return;
                }
                config = gVar;
                endpoints = gVar != null ? gVar.getEndpoints() : null;
                placements = gVar != null ? gVar.getPlacements() : null;
                int logLevel = getLogLevel();
                boolean metricsEnabled = getMetricsEnabled();
                fl.k kVarA2 = fl.l.a(oVar, new d(context));
                fl.k kVarA3 = fl.l.a(oVar, new C0506e(context));
                com.vungle.ads.g gVar4 = com.vungle.ads.g.INSTANCE;
                gVar4.initOrUpdate$vungle_ads_release(m86initWithConfig$lambda4(kVarA2), m87initWithConfig$lambda5(kVarA3).getLoggerExecutor(), logLevel, metricsEnabled);
                if (!z10 && gVar != null) {
                    updateCachedConfig(gVar, m85initWithConfig$lambda2(kVarA));
                    String configExtension = gVar.getConfigExtension();
                    if (configExtension != null) {
                        INSTANCE.updateConfigExtension$vungle_ads_release(context, configExtension);
                    }
                }
                if (d0Var != null) {
                    com.vungle.ads.g.logMetric$vungle_ads_release$default(gVar4, d0Var, (com.vungle.ads.internal.util.p) null, (String) null, 6, (Object) null);
                }
                yj.c.INSTANCE.updateDisableAdId(shouldDisableAdId());
            } catch (Exception e10) {
                com.vungle.ads.internal.util.q.Companion.e(TAG, "Error while validating config: " + e10.getMessage());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean isReportIncentivizedEnabled() {
        Boolean boolIsReportIncentivizedEnabled;
        com.vungle.ads.internal.model.g gVar = config;
        if (gVar == null || (boolIsReportIncentivizedEnabled = gVar.isReportIncentivizedEnabled()) == null) {
            return false;
        }
        return boolIsReportIncentivizedEnabled.booleanValue();
    }

    public final boolean otEnabled() {
        Boolean enableOT;
        com.vungle.ads.internal.model.g gVar = config;
        if (gVar == null || (enableOT = gVar.getEnableOT()) == null) {
            return true;
        }
        return enableOT.booleanValue();
    }

    public final List<Placement> placements() {
        return placements;
    }

    public final boolean rtaDebuggingEnabled() {
        Boolean rtaDebugging;
        com.vungle.ads.internal.model.g gVar = config;
        if (gVar == null || (rtaDebugging = gVar.getRtaDebugging()) == null) {
            return false;
        }
        return rtaDebugging.booleanValue();
    }

    public final void setAppId$vungle_ads_release(String applicationId2) {
        s.h(applicationId2, "applicationId");
        applicationId = applicationId2;
    }

    public final boolean shouldDisableAdId() {
        Boolean disableAdId;
        com.vungle.ads.internal.model.g gVar = config;
        if (gVar == null || (disableAdId = gVar.getDisableAdId()) == null) {
            return true;
        }
        return disableAdId.booleanValue();
    }

    public final boolean signalsDisabled() {
        Boolean signalsDisabled;
        com.vungle.ads.internal.model.g gVar = config;
        if (gVar == null || (signalsDisabled = gVar.getSignalsDisabled()) == null) {
            return false;
        }
        return signalsDisabled.booleanValue();
    }

    public final void updateCachedConfig(com.vungle.ads.internal.model.g config2, com.vungle.ads.internal.persistence.b filePreferences) {
        s.h(config2, "config");
        s.h(filePreferences, "filePreferences");
        try {
            String str = applicationId;
            if (str == null) {
                s.w("applicationId");
                str = null;
            }
            filePreferences.put("config_app_id", str);
            filePreferences.put("config_update_time", System.currentTimeMillis());
            kotlinx.serialization.json.b json = getJson();
            pm.d dVarB = pm.t.b(json.a(), l0.k(com.vungle.ads.internal.model.g.class));
            s.f(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            filePreferences.put("config_response", json.c(dVarB, config2));
            filePreferences.apply();
        } catch (Exception e10) {
            com.vungle.ads.internal.util.q.Companion.e(TAG, "Exception: " + e10.getMessage() + " for updating cached config");
        }
    }

    public final void updateConfigExtension$vungle_ads_release(Context context, String ext) {
        s.h(context, "context");
        s.h(ext, "ext");
        configExt = ext;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        m88updateConfigExtension$lambda1(fl.l.a(fl.o.SYNCHRONIZED, new g(context))).put("config_extension", ext).apply();
    }

    public final boolean validateConfig$vungle_ads_release(com.vungle.ads.internal.model.g gVar) {
        return ((gVar != null ? gVar.getEndpoints() : null) == null || !validateEndpoints$vungle_ads_release(gVar.getEndpoints()) || gVar.getPlacements() == null) ? false : true;
    }

    public final boolean validateEndpoints$vungle_ads_release(com.vungle.ads.internal.model.g.Endpoints fVar) {
        boolean z10;
        String adsEndpoint = fVar != null ? fVar.getAdsEndpoint() : null;
        if (adsEndpoint == null || adsEndpoint.length() == 0) {
            new InvalidEndpointError(Sdk$SDKError.b.INVALID_ADS_ENDPOINT, "The ads endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
            z10 = false;
        } else {
            z10 = true;
        }
        String riEndpoint = fVar != null ? fVar.getRiEndpoint() : null;
        if (riEndpoint == null || riEndpoint.length() == 0) {
            new InvalidEndpointError(Sdk$SDKError.b.INVALID_RI_ENDPOINT, "The ri endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
        }
        String metricsEndpoint = fVar != null ? fVar.getMetricsEndpoint() : null;
        if (metricsEndpoint == null || metricsEndpoint.length() == 0) {
            new InvalidEndpointError(Sdk$SDKError.b.INVALID_METRICS_ENDPOINT, "The metrics endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
        }
        String errorLogsEndpoint = fVar != null ? fVar.getErrorLogsEndpoint() : null;
        if (errorLogsEndpoint != null && errorLogsEndpoint.length() != 0) {
            return z10;
        }
        com.vungle.ads.internal.util.q.Companion.e(TAG, "The error logging endpoint was not provided in the config.");
        return z10;
    }

    public final com.vungle.ads.internal.model.g getCachedConfig(com.vungle.ads.internal.persistence.b filePreferences, String appId) {
        Long refreshTime;
        s.h(filePreferences, "filePreferences");
        s.h(appId, "appId");
        try {
            String string = filePreferences.getString("config_app_id");
            if (string != null && string.length() != 0 && bm.r.A(string, appId, true)) {
                String string2 = filePreferences.getString("config_response");
                if (string2 == null) {
                    return null;
                }
                long j10 = filePreferences.getLong("config_update_time", 0L);
                kotlinx.serialization.json.b json = INSTANCE.getJson();
                pm.d dVarB = pm.t.b(json.a(), l0.k(com.vungle.ads.internal.model.g.class));
                s.f(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                com.vungle.ads.internal.model.g gVar = (com.vungle.ads.internal.model.g) json.b(dVarB, string2);
                com.vungle.ads.internal.model.g.ConfigSettings configSettings = gVar.getConfigSettings();
                if (((configSettings == null || (refreshTime = configSettings.getRefreshTime()) == null) ? -1L : refreshTime.longValue()) + j10 < System.currentTimeMillis()) {
                    com.vungle.ads.internal.util.q.Companion.w(TAG, "cache config expired. re-config");
                    return null;
                }
                com.vungle.ads.internal.util.q.Companion.w(TAG, "use cache config.");
                return gVar;
            }
            com.vungle.ads.internal.util.q.Companion.w(TAG, PvZsvNiPV.KNYCl);
            return null;
        } catch (Exception e10) {
            com.vungle.ads.internal.util.q.Companion.e(TAG, "Error while parsing cached config: " + e10.getMessage());
            return null;
        }
    }
}
