package com.vungle.ads.internal.network;

import bm.o;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.internal.util.s;
import fl.g0;
import fl.r;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.l0;
import pm.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class i {
    public static final a Companion = new a(null);
    private static final String FAILED_TPATS = "FAILED_TPATS";
    private static final String TAG = "TpatSender";
    private final Executor jobExecutor;
    private final com.vungle.ads.internal.signals.b signalManager;
    private final com.vungle.ads.internal.persistence.b tpatFilePreferences;
    private final Object tpatLock;
    private final k vungleApiClient;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i(k vungleApiClient, Executor ioExecutor, Executor jobExecutor, s pathProvider, com.vungle.ads.internal.signals.b bVar) {
        kotlin.jvm.internal.s.h(vungleApiClient, "vungleApiClient");
        kotlin.jvm.internal.s.h(ioExecutor, "ioExecutor");
        kotlin.jvm.internal.s.h(jobExecutor, "jobExecutor");
        kotlin.jvm.internal.s.h(pathProvider, "pathProvider");
        this.vungleApiClient = vungleApiClient;
        this.jobExecutor = jobExecutor;
        this.signalManager = bVar;
        this.tpatFilePreferences = com.vungle.ads.internal.persistence.b.Companion.get(ioExecutor, pathProvider, com.vungle.ads.internal.persistence.b.TPAT_FAILED_FILENAME);
        this.tpatLock = new Object();
    }

    private final Map<String, FailedTpat> getStoredTpats() {
        Object objB;
        String string = this.tpatFilePreferences.getString(FAILED_TPATS);
        if (string != null) {
            try {
                r.a aVar = r.f38769b;
                kotlinx.serialization.json.b.a aVar2 = kotlinx.serialization.json.b.f43628d;
                vm.b bVarA = aVar2.a();
                zl.m.a aVar3 = zl.m.f58989c;
                pm.d dVarB = t.b(bVarA, l0.d(l0.m(Map.class, aVar3.a(l0.k(String.class)), aVar3.a(l0.k(FailedTpat.class)))));
                kotlin.jvm.internal.s.f(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                objB = r.b((Map) aVar2.b(dVarB, string));
            } catch (Throwable th2) {
                r.a aVar4 = r.f38769b;
                objB = r.b(fl.s.a(th2));
            }
            Throwable thE = r.e(objB);
            if (thE != null) {
                q.Companion.e(TAG, "Failed to decode stored tpats: " + thE);
            }
            if (r.e(objB) != null) {
                objB = new LinkedHashMap();
            }
            Map<String, FailedTpat> map = (Map) objB;
            if (map != null) {
                return map;
            }
        }
        return new LinkedHashMap();
    }

    private final boolean isPriorityTpat(String str) {
        return kotlin.jvm.internal.s.c(str, com.vungle.ads.internal.f.CHECKPOINT_0) || kotlin.jvm.internal.s.c(str, com.vungle.ads.internal.f.CLICK_URL) || kotlin.jvm.internal.s.c(str, "impression") || kotlin.jvm.internal.s.c(str, com.vungle.ads.internal.f.LOAD_AD);
    }

    private final void logTpatError(g gVar, String str, com.vungle.ads.internal.model.i iVar, Sdk$SDKError.b bVar) {
        String str2 = "tpat key: " + gVar.getTpatKey() + ", error: " + iVar.getDescription() + ", errorIsTerminal: " + iVar.getErrorIsTerminal() + " url: " + str;
        q.Companion.e(TAG, str2);
        new TpatError(bVar, str2).setLogEntry$vungle_ads_release(gVar.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
    }

    private final com.vungle.ads.internal.model.i performPriorityRetry(g gVar, String str) {
        String str2;
        com.vungle.ads.internal.model.i iVarPingTPAT;
        Boolean priorityRetry = gVar.getPriorityRetry();
        boolean zBooleanValue = priorityRetry != null ? priorityRetry.booleanValue() : isPriorityTpat(gVar.getTpatKey());
        int i10 = 0;
        while (true) {
            str2 = str;
            iVarPingTPAT = this.vungleApiClient.pingTPAT(str2, gVar.getHeaders(), gVar.getBody(), gVar.getMethod(), gVar.getLogEntry());
            if (!zBooleanValue || iVarPingTPAT == null || !iVarPingTPAT.isRetryCode() || (i10 = i10 + 1) >= gVar.getPriorityRetryCount()) {
                break;
            }
            str = str2;
        }
        if (iVarPingTPAT != null) {
            logTpatError(gVar, str2, iVarPingTPAT, i10 >= gVar.getPriorityRetryCount() ? Sdk$SDKError.b.TPAT_RETRY_FAILED : Sdk$SDKError.b.TPAT_ERROR);
        }
        return iVarPingTPAT;
    }

    private final void saveStoredTpats(Map<String, FailedTpat> map) {
        Object objB;
        try {
            r.a aVar = r.f38769b;
            com.vungle.ads.internal.persistence.b bVar = this.tpatFilePreferences;
            kotlinx.serialization.json.b.a aVar2 = kotlinx.serialization.json.b.f43628d;
            vm.b bVarA = aVar2.a();
            zl.m.a aVar3 = zl.m.f58989c;
            pm.d dVarB = t.b(bVarA, l0.d(l0.m(Map.class, aVar3.a(l0.k(String.class)), aVar3.a(l0.k(FailedTpat.class)))));
            kotlin.jvm.internal.s.f(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            bVar.put(FAILED_TPATS, aVar2.c(dVarB, map)).apply();
            objB = r.b(g0.f38750a);
        } catch (Throwable th2) {
            r.a aVar4 = r.f38769b;
            objB = r.b(fl.s.a(th2));
        }
        if (r.e(objB) != null) {
            q.Companion.e(TAG, "Failed to encode the about to storing tpats: " + map);
        }
    }

    public static /* synthetic */ void sendTpat$default(i iVar, g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        iVar.sendTpat(gVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendTpat$lambda-1, reason: not valid java name */
    public static final void m108sendTpat$lambda1(i this$0, g request, String urlWithSessionId, boolean z10) {
        FailedTpat failedTpat;
        kotlin.jvm.internal.s.h(this$0, "this$0");
        kotlin.jvm.internal.s.h(request, "$request");
        kotlin.jvm.internal.s.h(urlWithSessionId, "$urlWithSessionId");
        com.vungle.ads.internal.model.i iVarPerformPriorityRetry = this$0.performPriorityRetry(request, urlWithSessionId);
        if (request.getRegularRetry()) {
            if (iVarPerformPriorityRetry == null || !iVarPerformPriorityRetry.getErrorIsTerminal()) {
                if (iVarPerformPriorityRetry != null || z10) {
                    synchronized (this$0.tpatLock) {
                        try {
                            Map<String, FailedTpat> storedTpats = this$0.getStoredTpats();
                            FailedTpat failedTpat2 = storedTpats.get(request.getUrl());
                            int retryAttempt = failedTpat2 != null ? failedTpat2.getRetryAttempt() : 0;
                            if (iVarPerformPriorityRetry == null && retryAttempt > 0) {
                                storedTpats.remove(request.getUrl());
                                this$0.saveStoredTpats(storedTpats);
                            } else if (iVarPerformPriorityRetry != null && retryAttempt >= request.getRegularRetryCount()) {
                                storedTpats.remove(request.getUrl());
                                this$0.saveStoredTpats(storedTpats);
                                this$0.logTpatError(request, urlWithSessionId, iVarPerformPriorityRetry, Sdk$SDKError.b.TPAT_RETRY_FAILED);
                            } else if (iVarPerformPriorityRetry != null) {
                                FailedTpat failedTpat3 = storedTpats.get(request.getUrl());
                                if (failedTpat3 == null || (failedTpat = FailedTpat.copy$default(failedTpat3, null, null, null, retryAttempt + 1, 0, null, 55, null)) == null) {
                                    failedTpat = new FailedTpat(request.getMethod(), request.getHeaders(), request.getBody(), 1, request.getRegularRetryCount(), request.getTpatKey());
                                }
                                storedTpats.put(request.getUrl(), failedTpat);
                                this$0.saveStoredTpats(storedTpats);
                            }
                            g0 g0Var = g0.f38750a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    public final Executor getJobExecutor() {
        return this.jobExecutor;
    }

    public final com.vungle.ads.internal.signals.b getSignalManager() {
        return this.signalManager;
    }

    public final k getVungleApiClient() {
        return this.vungleApiClient;
    }

    public final String injectSessionIdToUrl(String url) {
        kotlin.jvm.internal.s.h(url, "url");
        com.vungle.ads.internal.signals.b bVar = this.signalManager;
        String uuid = bVar != null ? bVar.getUuid() : null;
        if (uuid == null) {
            uuid = "";
        }
        if (uuid.length() <= 0) {
            return url;
        }
        String strQuote = Pattern.quote(com.vungle.ads.internal.f.SESSION_ID);
        kotlin.jvm.internal.s.g(strQuote, "quote(Constants.SESSION_ID)");
        return new o(strQuote).i(url, uuid);
    }

    public final void resendStoredTpats$vungle_ads_release() {
        for (Map.Entry<String, FailedTpat> entry : getStoredTpats().entrySet()) {
            String key = entry.getKey();
            FailedTpat value = entry.getValue();
            sendTpat(new g.a(key).regularRetry(true).priorityRetry(false).headers(value.getHeaders()).body(value.getBody()).regularRetryCount(value.getRetryCount()).method(value.getMethod()).tpatKey(value.getTpatKey()).build(), true);
        }
    }

    public final void sendTpat(final g request, final boolean z10) {
        kotlin.jvm.internal.s.h(request, "request");
        final String strInjectSessionIdToUrl = injectSessionIdToUrl(request.getUrl());
        this.jobExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.network.h
            @Override // java.lang.Runnable
            public final void run() {
                i.m108sendTpat$lambda1(this.f35834a, request, strInjectSessionIdToUrl, z10);
            }
        });
    }

    public /* synthetic */ i(k kVar, Executor executor, Executor executor2, s sVar, com.vungle.ads.internal.signals.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, executor, executor2, sVar, (i10 & 16) != 0 ? null : bVar);
    }
}
