package com.vungle.ads;

import android.os.Build;
import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import re.xQrM.UoyZyZEcGYBpIg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class g {
    private static final int MAX_BATCH_SIZE = 20;
    private static final long REFRESH_TIME_MILLIS = 5000;
    private static final String TAG = "AnalyticsClient";
    private static com.vungle.ads.internal.executor.i executor;
    private static boolean metricsEnabled;
    private static com.vungle.ads.internal.network.k vungleApiClient;
    public static final g INSTANCE = new g();
    private static final BlockingQueue<Sdk$SDKError.a> errors = new LinkedBlockingQueue();
    private static final BlockingQueue<Sdk$SDKMetric.a> metrics = new LinkedBlockingQueue();
    private static final BlockingQueue<Sdk$SDKError.a> pendingErrors = new LinkedBlockingQueue();
    private static final BlockingQueue<Sdk$SDKMetric.a> pendingMetrics = new LinkedBlockingQueue();
    private static a logLevel = a.ERROR_LOG_LEVEL_ERROR;
    private static boolean refreshEnabled = true;
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public enum a {
        ERROR_LOG_LEVEL_OFF(0),
        ERROR_LOG_LEVEL_ERROR(1),
        ERROR_LOG_LEVEL_DEBUG(2);

        public static final C0493a Companion = new C0493a(null);
        private final int level;

        /* JADX INFO: renamed from: com.vungle.ads.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0493a {
            public /* synthetic */ C0493a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a fromValue(int i10) {
                a aVar = a.ERROR_LOG_LEVEL_DEBUG;
                if (i10 == aVar.getLevel()) {
                    return aVar;
                }
                a aVar2 = a.ERROR_LOG_LEVEL_ERROR;
                if (i10 != aVar2.getLevel()) {
                    a aVar3 = a.ERROR_LOG_LEVEL_OFF;
                    if (i10 == aVar3.getLevel()) {
                        return aVar3;
                    }
                }
                return aVar2;
            }

            private C0493a() {
            }
        }

        a(int i10) {
            this.level = i10;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public interface b {
        void onFailure();

        void onSuccess();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class c implements b {
        final /* synthetic */ BlockingQueue<Sdk$SDKError.a> $currentSendingErrors;

        c(BlockingQueue<Sdk$SDKError.a> blockingQueue) {
            this.$currentSendingErrors = blockingQueue;
        }

        @Override // com.vungle.ads.g.b
        public void onFailure() {
            com.vungle.ads.internal.util.q.Companion.d(g.TAG, "Failed to send " + this.$currentSendingErrors.size() + " errors");
            g.INSTANCE.getErrors$vungle_ads_release().addAll(this.$currentSendingErrors);
        }

        @Override // com.vungle.ads.g.b
        public void onSuccess() {
            com.vungle.ads.internal.util.q.Companion.d(g.TAG, "Sent " + this.$currentSendingErrors.size() + " errors");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class d implements b {
        final /* synthetic */ BlockingQueue<Sdk$SDKMetric.a> $currentSendingMetrics;

        d(BlockingQueue<Sdk$SDKMetric.a> blockingQueue) {
            this.$currentSendingMetrics = blockingQueue;
        }

        @Override // com.vungle.ads.g.b
        public void onFailure() {
            com.vungle.ads.internal.util.q.Companion.d(g.TAG, "Failed to send " + this.$currentSendingMetrics.size() + " metrics");
            g.INSTANCE.getMetrics$vungle_ads_release().addAll(this.$currentSendingMetrics);
        }

        @Override // com.vungle.ads.g.b
        public void onSuccess() {
            com.vungle.ads.internal.util.q.Companion.d(g.TAG, "Sent " + this.$currentSendingMetrics.size() + " metrics");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e extends kotlin.jvm.internal.t implements tl.a {
        final /* synthetic */ Sdk$SDKError.a $error;
        final /* synthetic */ String $message;
        final /* synthetic */ Sdk$SDKError.b $reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Sdk$SDKError.b bVar, String str, Sdk$SDKError.a aVar) {
            super(0);
            this.$reason = bVar;
            this.$message = str;
            this.$error = aVar;
        }

        @Override // tl.a
        public final String invoke() {
            return "Logging error: " + this.$reason + UoyZyZEcGYBpIg.tYP + this.$message + ", mediation: " + this.$error.getMediationName();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class f extends kotlin.jvm.internal.t implements tl.a {
        final /* synthetic */ com.vungle.ads.internal.util.p $logEntry;
        final /* synthetic */ Sdk$SDKMetric.a $metric;
        final /* synthetic */ Sdk$SDKMetric.b $metricType;
        final /* synthetic */ long $metricValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Sdk$SDKMetric.b bVar, long j10, com.vungle.ads.internal.util.p pVar, Sdk$SDKMetric.a aVar) {
            super(0);
            this.$metricType = bVar;
            this.$metricValue = j10;
            this.$logEntry = pVar;
            this.$metric = aVar;
        }

        @Override // tl.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Logging Metric ");
            sb2.append(this.$metricType);
            sb2.append(" with value ");
            sb2.append(this.$metricValue);
            sb2.append(" for placement ");
            com.vungle.ads.internal.util.p pVar = this.$logEntry;
            sb2.append(pVar != null ? pVar.getPlacementRefId$vungle_ads_release() : null);
            sb2.append(" mediation:");
            sb2.append(this.$metric.getMediationName());
            return sb2.toString();
        }
    }

    private g() {
    }

    private final void flushMetrics() {
        com.vungle.ads.internal.network.k kVar;
        com.vungle.ads.internal.util.q.a aVar = com.vungle.ads.internal.util.q.Companion;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sending ");
        BlockingQueue<Sdk$SDKMetric.a> blockingQueue = metrics;
        sb2.append(blockingQueue.size());
        sb2.append(" metrics");
        aVar.d(TAG, sb2.toString());
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        blockingQueue.drainTo(linkedBlockingQueue);
        if (linkedBlockingQueue.isEmpty() || (kVar = vungleApiClient) == null) {
            return;
        }
        kVar.reportMetrics(linkedBlockingQueue, new d(linkedBlockingQueue));
    }

    private final Sdk$SDKMetric.a genMetric(Sdk$SDKMetric.b bVar, long j10, com.vungle.ads.internal.util.p pVar, String str) {
        String placementRefId$vungle_ads_release;
        String creativeId$vungle_ads_release;
        String eventId$vungle_ads_release;
        String headerUa;
        String adSource$vungle_ads_release;
        String vmVersion$vungle_ads_release;
        String string;
        String experiments$vungle_ads_release;
        Long adLoadType$vungle_ads_release;
        Boolean adPoddingEnabled$vungle_ads_release;
        Boolean adoEnabled$vungle_ads_release;
        Boolean partialDownloadEnabled$vungle_ads_release;
        String adapterAdFormat$vungle_ads_release;
        com.vungle.ads.internal.a.EnumC0494a adState$vungle_ads_release;
        Sdk$SDKMetric.a value = Sdk$SDKMetric.newBuilder().setType(bVar).setValue(j10);
        String str2 = Build.MANUFACTURER;
        Sdk$SDKMetric.a osVersion = value.setMake(str2).setModel(Build.MODEL).setOs(kotlin.jvm.internal.s.c("Amazon", str2) ? "amazon" : "android").setOsVersion(String.valueOf(Build.VERSION.SDK_INT));
        String str3 = "";
        if (pVar == null || (placementRefId$vungle_ads_release = pVar.getPlacementRefId$vungle_ads_release()) == null) {
            placementRefId$vungle_ads_release = "";
        }
        Sdk$SDKMetric.a placementReferenceId = osVersion.setPlacementReferenceId(placementRefId$vungle_ads_release);
        if (pVar == null || (creativeId$vungle_ads_release = pVar.getCreativeId$vungle_ads_release()) == null) {
            creativeId$vungle_ads_release = "";
        }
        Sdk$SDKMetric.a creativeId = placementReferenceId.setCreativeId(creativeId$vungle_ads_release);
        if (pVar == null || (eventId$vungle_ads_release = pVar.getEventId$vungle_ads_release()) == null) {
            eventId$vungle_ads_release = "";
        }
        Sdk$SDKMetric.a eventId = creativeId.setEventId(eventId$vungle_ads_release);
        if (str == null) {
            str = "";
        }
        Sdk$SDKMetric.a meta = eventId.setMeta(str);
        if (pVar == null || (headerUa = pVar.getMediationName$vungle_ads_release()) == null) {
            headerUa = com.vungle.ads.internal.network.m.INSTANCE.getHeaderUa();
        }
        Sdk$SDKMetric.a mediationName = meta.setMediationName(headerUa);
        if (pVar == null || (adSource$vungle_ads_release = pVar.getAdSource$vungle_ads_release()) == null) {
            adSource$vungle_ads_release = "";
        }
        Sdk$SDKMetric.a adSource = mediationName.setAdSource(adSource$vungle_ads_release);
        if (pVar == null || (vmVersion$vungle_ads_release = pVar.getVmVersion$vungle_ads_release()) == null) {
            vmVersion$vungle_ads_release = "";
        }
        Sdk$SDKMetric.a appState = adSource.setVmVersion(vmVersion$vungle_ads_release).setAppState(com.vungle.ads.internal.util.a.Companion.isForeground() ? 0L : 2L);
        if (pVar == null || (adState$vungle_ads_release = pVar.getAdState$vungle_ads_release()) == null || (string = adState$vungle_ads_release.toString()) == null) {
            string = "";
        }
        Sdk$SDKMetric.a adState = appState.setAdState(string);
        if (pVar == null || (experiments$vungle_ads_release = pVar.getExperiments$vungle_ads_release()) == null) {
            experiments$vungle_ads_release = "";
        }
        Sdk$SDKMetric.a experiments = adState.setExperiments(experiments$vungle_ads_release);
        if (pVar != null && (adapterAdFormat$vungle_ads_release = pVar.getAdapterAdFormat$vungle_ads_release()) != null) {
            str3 = adapterAdFormat$vungle_ads_release;
        }
        Sdk$SDKMetric.a adapterAdFormat = experiments.setAdapterAdFormat(str3);
        if (pVar != null && (partialDownloadEnabled$vungle_ads_release = pVar.getPartialDownloadEnabled$vungle_ads_release()) != null) {
            adapterAdFormat.setIsPartialDownloadEnabled(partialDownloadEnabled$vungle_ads_release.booleanValue());
        }
        if (pVar != null && (adoEnabled$vungle_ads_release = pVar.getAdoEnabled$vungle_ads_release()) != null) {
            adapterAdFormat.setIsAdoEnabled(adoEnabled$vungle_ads_release.booleanValue());
        }
        if (pVar != null && (adPoddingEnabled$vungle_ads_release = pVar.getAdPoddingEnabled$vungle_ads_release()) != null) {
            adapterAdFormat.setIsAdPodding(adPoddingEnabled$vungle_ads_release.booleanValue());
        }
        if (pVar != null && (adLoadType$vungle_ads_release = pVar.getAdLoadType$vungle_ads_release()) != null) {
            adapterAdFormat.setAdLoadType(adLoadType$vungle_ads_release.longValue());
        }
        kotlin.jvm.internal.s.g(adapterAdFormat, "newBuilder()\n           …dType(it) }\n            }");
        return adapterAdFormat;
    }

    static /* synthetic */ Sdk$SDKMetric.a genMetric$default(g gVar, Sdk$SDKMetric.b bVar, long j10, com.vungle.ads.internal.util.p pVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return gVar.genMetric(bVar, j10, (i10 & 4) != 0 ? null : pVar, (i10 & 8) != 0 ? null : str);
    }

    private final Sdk$SDKError.a genSDKError(Sdk$SDKError.b bVar, String str, com.vungle.ads.internal.util.p pVar) {
        String placementRefId$vungle_ads_release;
        String creativeId$vungle_ads_release;
        String eventId$vungle_ads_release;
        String adSource$vungle_ads_release;
        String vmVersion$vungle_ads_release;
        String headerUa;
        String string;
        String experiments$vungle_ads_release;
        Long adLoadType$vungle_ads_release;
        Boolean adPoddingEnabled$vungle_ads_release;
        Boolean adoEnabled$vungle_ads_release;
        Boolean partialDownloadEnabled$vungle_ads_release;
        String adapterAdFormat$vungle_ads_release;
        com.vungle.ads.internal.a.EnumC0494a adState$vungle_ads_release;
        Sdk$SDKError.a aVarNewBuilder = Sdk$SDKError.newBuilder();
        String str2 = Build.MANUFACTURER;
        Sdk$SDKError.a at = aVarNewBuilder.setOs(kotlin.jvm.internal.s.c("Amazon", str2) ? "amazon" : "android").setOsVersion(String.valueOf(Build.VERSION.SDK_INT)).setMake(str2).setModel(Build.MODEL).setReason(bVar).setMessage(str).setAt(System.currentTimeMillis());
        String str3 = "";
        if (pVar == null || (placementRefId$vungle_ads_release = pVar.getPlacementRefId$vungle_ads_release()) == null) {
            placementRefId$vungle_ads_release = "";
        }
        Sdk$SDKError.a placementReferenceId = at.setPlacementReferenceId(placementRefId$vungle_ads_release);
        if (pVar == null || (creativeId$vungle_ads_release = pVar.getCreativeId$vungle_ads_release()) == null) {
            creativeId$vungle_ads_release = "";
        }
        Sdk$SDKError.a creativeId = placementReferenceId.setCreativeId(creativeId$vungle_ads_release);
        if (pVar == null || (eventId$vungle_ads_release = pVar.getEventId$vungle_ads_release()) == null) {
            eventId$vungle_ads_release = "";
        }
        Sdk$SDKError.a eventId = creativeId.setEventId(eventId$vungle_ads_release);
        if (pVar == null || (adSource$vungle_ads_release = pVar.getAdSource$vungle_ads_release()) == null) {
            adSource$vungle_ads_release = "";
        }
        Sdk$SDKError.a adSource = eventId.setAdSource(adSource$vungle_ads_release);
        if (pVar == null || (vmVersion$vungle_ads_release = pVar.getVmVersion$vungle_ads_release()) == null) {
            vmVersion$vungle_ads_release = "";
        }
        Sdk$SDKError.a vmVersion = adSource.setVmVersion(vmVersion$vungle_ads_release);
        if (pVar == null || (headerUa = pVar.getMediationName$vungle_ads_release()) == null) {
            headerUa = com.vungle.ads.internal.network.m.INSTANCE.getHeaderUa();
        }
        Sdk$SDKError.a appState = vmVersion.setMediationName(headerUa).setAppState(com.vungle.ads.internal.util.a.Companion.isForeground() ? 0L : 2L);
        if (pVar == null || (adState$vungle_ads_release = pVar.getAdState$vungle_ads_release()) == null || (string = adState$vungle_ads_release.toString()) == null) {
            string = "";
        }
        Sdk$SDKError.a adState = appState.setAdState(string);
        if (pVar == null || (experiments$vungle_ads_release = pVar.getExperiments$vungle_ads_release()) == null) {
            experiments$vungle_ads_release = "";
        }
        Sdk$SDKError.a experiments = adState.setExperiments(experiments$vungle_ads_release);
        if (pVar != null && (adapterAdFormat$vungle_ads_release = pVar.getAdapterAdFormat$vungle_ads_release()) != null) {
            str3 = adapterAdFormat$vungle_ads_release;
        }
        Sdk$SDKError.a adapterAdFormat = experiments.setAdapterAdFormat(str3);
        if (pVar != null && (partialDownloadEnabled$vungle_ads_release = pVar.getPartialDownloadEnabled$vungle_ads_release()) != null) {
            adapterAdFormat.setIsPartialDownloadEnabled(partialDownloadEnabled$vungle_ads_release.booleanValue());
        }
        if (pVar != null && (adoEnabled$vungle_ads_release = pVar.getAdoEnabled$vungle_ads_release()) != null) {
            adapterAdFormat.setIsAdoEnabled(adoEnabled$vungle_ads_release.booleanValue());
        }
        if (pVar != null && (adPoddingEnabled$vungle_ads_release = pVar.getAdPoddingEnabled$vungle_ads_release()) != null) {
            adapterAdFormat.setIsAdPodding(adPoddingEnabled$vungle_ads_release.booleanValue());
        }
        if (pVar != null && (adLoadType$vungle_ads_release = pVar.getAdLoadType$vungle_ads_release()) != null) {
            adapterAdFormat.setAdLoadType(adLoadType$vungle_ads_release.longValue());
        }
        kotlin.jvm.internal.s.g(adapterAdFormat, "newBuilder()\n           …dType(it) }\n            }");
        return adapterAdFormat;
    }

    static /* synthetic */ Sdk$SDKError.a genSDKError$default(g gVar, Sdk$SDKError.b bVar, String str, com.vungle.ads.internal.util.p pVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            pVar = null;
        }
        return gVar.genSDKError(bVar, str, pVar);
    }

    public static /* synthetic */ void getErrors$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getExecutor$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMetrics$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMetricsEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getPendingErrors$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getPendingMetrics$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getRefreshEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getVungleApiClient$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initOrUpdate$lambda-1, reason: not valid java name */
    public static final void m56initOrUpdate$lambda1(com.vungle.ads.internal.executor.i executor2) {
        kotlin.jvm.internal.s.h(executor2, "$executor");
        executor2.execute(new Runnable() { // from class: com.vungle.ads.d
            @Override // java.lang.Runnable
            public final void run() {
                g.m57initOrUpdate$lambda1$lambda0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initOrUpdate$lambda-1$lambda-0, reason: not valid java name */
    public static final void m57initOrUpdate$lambda1$lambda0() {
        INSTANCE.report();
    }

    public static /* synthetic */ void isInitialized$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: logError$lambda-2, reason: not valid java name */
    public static final void m58logError$lambda2(Sdk$SDKError.b reason, String message, com.vungle.ads.internal.util.p pVar) {
        kotlin.jvm.internal.s.h(reason, "$reason");
        kotlin.jvm.internal.s.h(message, "$message");
        INSTANCE.logErrorInSameThread(reason, message, pVar);
    }

    public static /* synthetic */ void logError$vungle_ads_release$default(g gVar, Sdk$SDKError.b bVar, String str, com.vungle.ads.internal.util.p pVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            pVar = null;
        }
        gVar.logError$vungle_ads_release(bVar, str, pVar);
    }

    private final synchronized void logErrorInSameThread(Sdk$SDKError.b bVar, String str, com.vungle.ads.internal.util.p pVar) {
        if (logLevel == a.ERROR_LOG_LEVEL_OFF) {
            return;
        }
        try {
            Sdk$SDKError.a aVarGenSDKError = genSDKError(bVar, str, pVar);
            BlockingQueue<Sdk$SDKError.a> blockingQueue = errors;
            blockingQueue.put(aVarGenSDKError);
            com.vungle.ads.internal.util.q.Companion.w(TAG, new e(bVar, str, aVarGenSDKError));
            if (blockingQueue.size() >= 20) {
                report();
            }
        } catch (Exception e10) {
            com.vungle.ads.internal.util.q.Companion.e(TAG, "Cannot logError", e10);
        }
    }

    static /* synthetic */ void logErrorInSameThread$default(g gVar, Sdk$SDKError.b bVar, String str, com.vungle.ads.internal.util.p pVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            pVar = null;
        }
        gVar.logErrorInSameThread(bVar, str, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: logMetric$lambda-8, reason: not valid java name */
    public static final void m59logMetric$lambda8(Sdk$SDKMetric.b metricType, long j10, com.vungle.ads.internal.util.p pVar, String str) throws Throwable {
        kotlin.jvm.internal.s.h(metricType, "$metricType");
        INSTANCE.logMetricInSameThread(metricType, j10, pVar, str);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(g gVar, Sdk$SDKMetric.b bVar, long j10, com.vungle.ads.internal.util.p pVar, String str, int i10, Object obj) throws Throwable {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        gVar.logMetric$vungle_ads_release(bVar, j10, (i10 & 4) != 0 ? null : pVar, (i10 & 8) != 0 ? null : str);
    }

    private final synchronized void logMetricInSameThread(Sdk$SDKMetric.b bVar, long j10, com.vungle.ads.internal.util.p pVar, String str) throws Throwable {
        try {
            try {
                if (metricsEnabled) {
                    try {
                        Sdk$SDKMetric.a aVarGenMetric = genMetric(bVar, j10, pVar, str);
                        try {
                            BlockingQueue<Sdk$SDKMetric.a> blockingQueue = metrics;
                            blockingQueue.put(aVarGenMetric);
                            com.vungle.ads.internal.util.q.Companion.w(TAG, new f(bVar, j10, pVar, aVarGenMetric));
                            if (blockingQueue.size() >= 20) {
                                report();
                            }
                        } catch (Exception e10) {
                            e = e10;
                            com.vungle.ads.internal.util.q.Companion.e(TAG, "Cannot logMetrics", e);
                        }
                    } catch (Exception e11) {
                        e = e11;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    static /* synthetic */ void logMetricInSameThread$default(g gVar, Sdk$SDKMetric.b bVar, long j10, com.vungle.ads.internal.util.p pVar, String str, int i10, Object obj) throws Throwable {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        gVar.logMetricInSameThread(bVar, j10, (i10 & 4) != 0 ? null : pVar, (i10 & 8) != 0 ? null : str);
    }

    private final synchronized void report() {
        try {
            if (logLevel != a.ERROR_LOG_LEVEL_OFF && errors.size() > 0) {
                flushErrors();
            }
            if (metricsEnabled && metrics.size() > 0) {
                flushMetrics();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final BlockingQueue<Sdk$SDKError.a> getErrors$vungle_ads_release() {
        return errors;
    }

    public final com.vungle.ads.internal.executor.i getExecutor$vungle_ads_release() {
        return executor;
    }

    public final BlockingQueue<Sdk$SDKMetric.a> getMetrics$vungle_ads_release() {
        return metrics;
    }

    public final boolean getMetricsEnabled$vungle_ads_release() {
        return metricsEnabled;
    }

    public final BlockingQueue<Sdk$SDKError.a> getPendingErrors$vungle_ads_release() {
        return pendingErrors;
    }

    public final BlockingQueue<Sdk$SDKMetric.a> getPendingMetrics$vungle_ads_release() {
        return pendingMetrics;
    }

    public final boolean getRefreshEnabled$vungle_ads_release() {
        return refreshEnabled;
    }

    public final com.vungle.ads.internal.network.k getVungleApiClient$vungle_ads_release() {
        return vungleApiClient;
    }

    public final synchronized void initOrUpdate$vungle_ads_release(com.vungle.ads.internal.network.k vungleApiClient2, final com.vungle.ads.internal.executor.i executor2, int i10, boolean z10) {
        try {
            kotlin.jvm.internal.s.h(vungleApiClient2, "vungleApiClient");
            kotlin.jvm.internal.s.h(executor2, "executor");
            logLevel = a.Companion.fromValue(i10);
            metricsEnabled = z10;
            if (i10 == a.ERROR_LOG_LEVEL_DEBUG.getLevel()) {
                com.vungle.ads.internal.util.q.Companion.enable$vungle_ads_release(true);
            } else if (i10 == a.ERROR_LOG_LEVEL_ERROR.getLevel() || i10 == a.ERROR_LOG_LEVEL_OFF.getLevel()) {
                com.vungle.ads.internal.util.q.Companion.enable$vungle_ads_release(false);
            }
            if (isInitialized.getAndSet(true)) {
                com.vungle.ads.internal.util.q.Companion.d(TAG, "AnalyticsClient already initialized");
                return;
            }
            executor = executor2;
            vungleApiClient = vungleApiClient2;
            try {
                BlockingQueue<Sdk$SDKError.a> blockingQueue = pendingErrors;
                if (!blockingQueue.isEmpty()) {
                    blockingQueue.drainTo(errors);
                }
            } catch (Exception e10) {
                com.vungle.ads.internal.util.q.Companion.e(TAG, "Failed to add pendingErrors to errors queue.", e10);
            }
            try {
                BlockingQueue<Sdk$SDKMetric.a> blockingQueue2 = pendingMetrics;
                if (!blockingQueue2.isEmpty()) {
                    blockingQueue2.drainTo(metrics);
                }
            } catch (Exception e11) {
                com.vungle.ads.internal.util.q.Companion.e(TAG, "Failed to add pendingMetrics to metrics queue.", e11);
            }
            if (refreshEnabled) {
                Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new Runnable() { // from class: com.vungle.ads.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.m56initOrUpdate$lambda1(executor2);
                    }
                }, 5000L, 5000L, TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final AtomicBoolean isInitialized$vungle_ads_release() {
        return isInitialized;
    }

    public final synchronized void logError$vungle_ads_release(final Sdk$SDKError.b reason, final String message, final com.vungle.ads.internal.util.p pVar) {
        kotlin.jvm.internal.s.h(reason, "reason");
        kotlin.jvm.internal.s.h(message, "message");
        try {
            com.vungle.ads.internal.executor.i iVar = executor;
            if (iVar == null) {
                pendingErrors.put(genSDKError(reason, message, pVar));
            } else {
                if (iVar != null) {
                    iVar.execute(new Runnable() { // from class: com.vungle.ads.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            g.m58logError$lambda2(reason, message, pVar);
                        }
                    });
                }
            }
        } catch (Exception e10) {
            com.vungle.ads.internal.util.q.Companion.e(TAG, "Cannot logError " + reason + ", " + message + ", " + pVar, e10);
        }
    }

    public final synchronized void logMetric$vungle_ads_release(Sdk$SDKMetric.b metricType, final long j10, final com.vungle.ads.internal.util.p pVar, final String str) throws Throwable {
        final Sdk$SDKMetric.b bVar;
        try {
            try {
                kotlin.jvm.internal.s.h(metricType, "metricType");
                try {
                    com.vungle.ads.internal.executor.i iVar = executor;
                    try {
                        if (iVar == null) {
                            pendingMetrics.put(genMetric(metricType, j10, pVar, str));
                            return;
                        }
                        bVar = metricType;
                        if (iVar != null) {
                            try {
                                iVar.execute(new Runnable() { // from class: com.vungle.ads.c
                                    @Override // java.lang.Runnable
                                    public final void run() throws Throwable {
                                        g.m59logMetric$lambda8(bVar, j10, pVar, str);
                                    }
                                });
                            } catch (Exception e10) {
                                e = e10;
                                j10 = j10;
                                pVar = pVar;
                                str = str;
                                com.vungle.ads.internal.util.q.Companion.e(TAG, "Cannot logMetric " + bVar + ", " + j10 + ", " + pVar + ", " + str, e);
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                    }
                } catch (Exception e12) {
                    e = e12;
                    bVar = metricType;
                }
                com.vungle.ads.internal.util.q.Companion.e(TAG, "Cannot logMetric " + bVar + ", " + j10 + ", " + pVar + ", " + str, e);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final void setExecutor$vungle_ads_release(com.vungle.ads.internal.executor.i iVar) {
        executor = iVar;
    }

    public final void setMetricsEnabled$vungle_ads_release(boolean z10) {
        metricsEnabled = z10;
    }

    public final void setRefreshEnabled$vungle_ads_release(boolean z10) {
        refreshEnabled = z10;
    }

    public final void setVungleApiClient$vungle_ads_release(com.vungle.ads.internal.network.k kVar) {
        vungleApiClient = kVar;
    }

    private final void flushErrors() {
        com.vungle.ads.internal.network.k kVar;
        com.vungle.ads.internal.util.q.a aVar = com.vungle.ads.internal.util.q.Companion;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sending ");
        BlockingQueue<Sdk$SDKError.a> blockingQueue = errors;
        sb2.append(blockingQueue.size());
        sb2.append(NhHRaDJCHtCTJR.VDbSzjIVaqe);
        aVar.d(TAG, sb2.toString());
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        blockingQueue.drainTo(linkedBlockingQueue);
        if (linkedBlockingQueue.isEmpty() || (kVar = vungleApiClient) == null) {
            return;
        }
        kVar.reportErrors(linkedBlockingQueue, new c(linkedBlockingQueue));
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(g gVar, d0 d0Var, com.vungle.ads.internal.util.p pVar, String str, int i10, Object obj) throws Throwable {
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        if ((i10 & 4) != 0) {
            str = d0Var.getMeta();
        }
        gVar.logMetric$vungle_ads_release(d0Var, pVar, str);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(g gVar, x xVar, com.vungle.ads.internal.util.p pVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        if ((i10 & 4) != 0) {
            str = xVar.getMeta();
        }
        gVar.logMetric$vungle_ads_release(xVar, pVar, str);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(g gVar, e0 e0Var, com.vungle.ads.internal.util.p pVar, String str, int i10, Object obj) throws Throwable {
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        if ((i10 & 4) != 0) {
            str = e0Var.getMeta();
        }
        gVar.logMetric$vungle_ads_release(e0Var, pVar, str);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(g gVar, y yVar, com.vungle.ads.internal.util.p pVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        if ((i10 & 4) != 0) {
            str = yVar.getMeta();
        }
        gVar.logMetric$vungle_ads_release(yVar, pVar, str);
    }

    public final synchronized void logMetric$vungle_ads_release(d0 singleValueMetric, com.vungle.ads.internal.util.p pVar, String str) throws Throwable {
        try {
            try {
                kotlin.jvm.internal.s.h(singleValueMetric, "singleValueMetric");
                logMetric$vungle_ads_release(singleValueMetric.getMetricType(), singleValueMetric.getValue(), pVar, str);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized void logMetric$vungle_ads_release(x oneShotSingleValueMetric, com.vungle.ads.internal.util.p pVar, String str) {
        kotlin.jvm.internal.s.h(oneShotSingleValueMetric, "oneShotSingleValueMetric");
        if (!oneShotSingleValueMetric.isLogged()) {
            logMetric$vungle_ads_release((d0) oneShotSingleValueMetric, pVar, str);
            oneShotSingleValueMetric.markLogged();
        }
    }

    public final synchronized void logMetric$vungle_ads_release(e0 timeIntervalMetric, com.vungle.ads.internal.util.p pVar, String str) throws Throwable {
        try {
            try {
                kotlin.jvm.internal.s.h(timeIntervalMetric, "timeIntervalMetric");
                logMetric$vungle_ads_release(timeIntervalMetric.getMetricType(), timeIntervalMetric.getValue(), pVar, str);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized void logMetric$vungle_ads_release(y oneShotTimeIntervalMetric, com.vungle.ads.internal.util.p pVar, String str) {
        kotlin.jvm.internal.s.h(oneShotTimeIntervalMetric, "oneShotTimeIntervalMetric");
        if (!oneShotTimeIntervalMetric.isLogged()) {
            logMetric$vungle_ads_release((e0) oneShotTimeIntervalMetric, pVar, str);
            oneShotTimeIntervalMetric.markLogged();
        }
    }
}
