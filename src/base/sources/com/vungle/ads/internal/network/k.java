package com.vungle.ads.internal.network;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.URLUtil;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.UserAgentError;
import com.vungle.ads.i0;
import com.vungle.ads.internal.model.AppNode;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.DeviceNode;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.protos.Sdk$MetricBatch;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKErrorBatch;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.p;
import fl.g0;
import fl.o;
import gl.r;
import gn.a0;
import gn.b0;
import gn.d0;
import gn.e0;
import gn.f0;
import gn.z;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import kotlinx.serialization.json.v;
import ud.qoRq.WwUgngZLNA;
import xn.c0;
import xn.q;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class k {
    private static final String TAG = "VungleApiClient";
    private com.vungle.ads.internal.model.c advertisingInfo;
    private VungleApi api;
    private AppNode appBody;
    private final Context applicationContext;
    private DeviceNode baseDeviceInfo;
    private final com.vungle.ads.internal.persistence.b filePreferences;
    private VungleApi gzipApi;
    private Boolean isGooglePlayServicesAvailable;
    private final com.vungle.ads.internal.platform.f platform;
    private z responseInterceptor;
    private Map<String, Long> retryAfterDataMap;
    private final fl.k signalManager$delegate;
    private String uaString;
    public static final b Companion = new b(null);
    private static final String BASE_URL = "https://config.ads.vungle.com/";
    private static final Set<z> networkInterceptors = new HashSet();
    private static final Set<z> logInterceptors = new HashSet();
    private static final kotlinx.serialization.json.b json = v.b(null, a.INSTANCE, 1, null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
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

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getBASE_URL$vungle_ads_release() {
            return k.BASE_URL;
        }

        public final void reset$vungle_ads_release() {
            m.INSTANCE.reset();
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class c implements z {
        private static final String CONTENT_ENCODING = "Content-Encoding";
        public static final a Companion = new a(null);
        private static final String GZIP = "gzip";

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class b extends e0 {
            final /* synthetic */ xn.e $output;
            final /* synthetic */ e0 $requestBody;

            b(e0 e0Var, xn.e eVar) {
                this.$requestBody = e0Var;
                this.$output = eVar;
            }

            @Override // gn.e0
            public long contentLength() {
                return this.$output.size();
            }

            @Override // gn.e0
            public a0 contentType() {
                return this.$requestBody.contentType();
            }

            @Override // gn.e0
            public void writeTo(xn.f sink) {
                s.h(sink, "sink");
                sink.k0(this.$output.a1());
            }
        }

        private final e0 gzip(e0 e0Var) {
            xn.e eVar = new xn.e();
            xn.f fVarB = c0.b(new q(eVar));
            e0Var.writeTo(fVarB);
            fVarB.close();
            return new b(e0Var, eVar);
        }

        @Override // gn.z
        public f0 intercept(z.a chain) {
            s.h(chain, "chain");
            d0 d0VarE = chain.e();
            e0 e0VarA = d0VarE.a();
            return (e0VarA == null || d0VarE.e(CONTENT_ENCODING) != null) ? chain.c(d0VarE) : chain.c(d0VarE.j().n(CONTENT_ENCODING, GZIP).p(d0VarE.i(), gzip(e0VarA)).b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class d extends ProxySelector {
        d() {
        }

        @Override // java.net.ProxySelector
        public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
            try {
                ProxySelector.getDefault().connectFailed(uri, socketAddress, iOException);
            } catch (Exception unused) {
            }
        }

        @Override // java.net.ProxySelector
        public List<Proxy> select(URI uri) {
            try {
                List<Proxy> listSelect = ProxySelector.getDefault().select(uri);
                s.g(listSelect, "{\n                      …ri)\n                    }");
                return listSelect;
            } catch (Exception unused) {
                return r.e(Proxy.NO_PROXY);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class e implements m0.a {
        final /* synthetic */ com.vungle.ads.e0 $uaMetric;

        e(com.vungle.ads.e0 e0Var) {
            this.$uaMetric = e0Var;
        }

        @Override // m0.a
        public void accept(String str) throws Throwable {
            String str2;
            if ((str == null || str.length() == 0) && ((str2 = k.this.uaString) == null || str2.length() == 0)) {
                str = k.this.platform.getUserAgent();
            }
            if (str == null || str.length() == 0) {
                com.vungle.ads.internal.util.q.Companion.e(k.TAG, "All UA sources failed, logging USER_AGENT_ERROR");
                new UserAgentError().logErrorNoReturnValue$vungle_ads_release();
            } else {
                this.$uaMetric.markEnd();
                com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, this.$uaMetric, (p) null, (String) null, 6, (Object) null);
                k.this.uaString = str;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class f implements com.vungle.ads.internal.network.b {
        final /* synthetic */ com.vungle.ads.g.b $requestListener;

        f(com.vungle.ads.g.b bVar) {
            this.$requestListener = bVar;
        }

        @Override // com.vungle.ads.internal.network.b
        public void onFailure(com.vungle.ads.internal.network.a aVar, Throwable th2) {
            this.$requestListener.onFailure();
        }

        @Override // com.vungle.ads.internal.network.b
        public void onResponse(com.vungle.ads.internal.network.a aVar, com.vungle.ads.internal.network.f fVar) {
            this.$requestListener.onSuccess();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class g implements com.vungle.ads.internal.network.b {
        final /* synthetic */ com.vungle.ads.g.b $requestListener;

        g(com.vungle.ads.g.b bVar) {
            this.$requestListener = bVar;
        }

        @Override // com.vungle.ads.internal.network.b
        public void onFailure(com.vungle.ads.internal.network.a aVar, Throwable th2) {
            this.$requestListener.onFailure();
        }

        @Override // com.vungle.ads.internal.network.b
        public void onResponse(com.vungle.ads.internal.network.a aVar, com.vungle.ads.internal.network.f fVar) {
            this.$requestListener.onSuccess();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class i extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.b, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.signals.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.signals.b.class);
        }
    }

    public k(Context applicationContext, com.vungle.ads.internal.platform.f platform, com.vungle.ads.internal.persistence.b filePreferences) {
        s.h(applicationContext, "applicationContext");
        s.h(platform, "platform");
        s.h(filePreferences, "filePreferences");
        this.applicationContext = applicationContext;
        this.platform = platform;
        this.filePreferences = filePreferences;
        this.uaString = System.getProperty("http.agent");
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.signalManager$delegate = fl.l.a(o.SYNCHRONIZED, new i(applicationContext));
        this.retryAfterDataMap = new ConcurrentHashMap();
        this.responseInterceptor = new z() { // from class: com.vungle.ads.internal.network.j
            @Override // gn.z
            public final f0 intercept(z.a aVar) {
                return k.m109responseInterceptor$lambda0(this.f35838a, aVar);
            }
        };
        b0.a aVar = new b0.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b0.a aVarQ = aVar.R(60L, timeUnit).e(60L, timeUnit).a(this.responseInterceptor).Q(new d());
        b0 b0VarC = aVarQ.c();
        b0 b0VarC2 = aVarQ.a(new c()).c();
        this.api = new l(b0VarC);
        this.gzipApi = new l(b0VarC2);
    }

    private final String bodyToString(e0 e0Var) {
        try {
            xn.e eVar = new xn.e();
            if (e0Var != null) {
                e0Var.writeTo(eVar);
                return eVar.X0();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    private final f0 defaultErrorResponse(d0 d0Var) {
        return new f0.a().q(d0Var).f(500).o(gn.c0.HTTP_1_1).l("Server is busy").b(gn.g0.Companion.e("{\"Error\":\"Server is busy\"}", a0.f39423e.b("application/json"))).c();
    }

    public static /* synthetic */ void getAppBody$vungle_ads_release$annotations() {
    }

    private final DeviceNode getBasicDeviceBody(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        s.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        String MANUFACTURER = Build.MANUFACTURER;
        s.g(MANUFACTURER, "MANUFACTURER");
        String MODEL = Build.MODEL;
        s.g(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        s.g(RELEASE, "RELEASE");
        DeviceNode deviceNode = new DeviceNode(MANUFACTURER, MODEL, RELEASE, com.vungle.ads.internal.platform.d.Companion.getCarrierName$vungle_ads_release(context), s.c("Amazon", MANUFACTURER) ? "amazon" : "android", displayMetrics.widthPixels, displayMetrics.heightPixels, this.uaString, (String) null, (Integer) null, (DeviceNode.VungleExt) null, 1792, (DefaultConstructorMarker) null);
        try {
            String userAgent = this.platform.getUserAgent();
            this.uaString = userAgent;
            deviceNode.setUa(userAgent);
            initUserAgentLazy();
            com.vungle.ads.internal.model.c advertisingInfo = this.advertisingInfo;
            if (advertisingInfo == null) {
                advertisingInfo = this.platform.getAdvertisingInfo();
            }
            this.advertisingInfo = advertisingInfo;
            return deviceNode;
        } catch (Exception e10) {
            com.vungle.ads.internal.util.q.Companion.e(TAG, "Cannot Get UserAgent. Setting Default Device UserAgent." + e10.getLocalizedMessage());
            return deviceNode;
        }
    }

    private final String getConnectionType() {
        if (androidx.core.content.a.checkSelfPermission(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.applicationContext.getSystemService("connectivity");
        s.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "NONE";
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            return "MOBILE";
        }
        if (type == 1 || type == 6) {
            return "WIFI";
        }
        if (type != 7) {
            return type != 9 ? "UNKNOWN" : "ETHERNET";
        }
        return "BLUETOOTH";
    }

    private final DeviceNode getDeviceBody() {
        return getDeviceBody$vungle_ads_release(false);
    }

    private final CommonRequestBody.RequestExt getExtBody(boolean z10) {
        String strGenerateSignals;
        String configExtension = com.vungle.ads.internal.e.INSTANCE.getConfigExtension();
        if (configExtension != null && configExtension.length() == 0) {
            configExtension = this.filePreferences.getString("config_extension");
        }
        if (z10) {
            try {
                strGenerateSignals = getSignalManager().generateSignals();
            } catch (Exception e10) {
                com.vungle.ads.internal.util.q.Companion.e(TAG, "Couldn't convert signals for sending. Error: " + e10.getMessage());
                strGenerateSignals = null;
            }
        } else {
            strGenerateSignals = null;
        }
        if ((configExtension == null || configExtension.length() == 0) && (strGenerateSignals == null || strGenerateSignals.length() == 0)) {
            return null;
        }
        return new CommonRequestBody.RequestExt(configExtension, strGenerateSignals, Long.valueOf(com.vungle.ads.internal.e.INSTANCE.configLastValidatedTimestamp()));
    }

    static /* synthetic */ CommonRequestBody.RequestExt getExtBody$default(k kVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return kVar.getExtBody(z10);
    }

    public static /* synthetic */ void getGzipApi$vungle_ads_release$annotations() {
    }

    private final String getPlacementID(e0 e0Var) {
        List<String> placements;
        String str;
        try {
            kotlinx.serialization.json.b bVar = json;
            String strBodyToString = bodyToString(e0Var);
            pm.d dVarB = pm.t.b(bVar.a(), l0.k(CommonRequestBody.class));
            s.f(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            CommonRequestBody.RequestParam request = ((CommonRequestBody) bVar.b(dVarB, strBodyToString)).getRequest();
            return (request == null || (placements = request.getPlacements()) == null || (str = placements.get(0)) == null) ? "" : str;
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void getResponseInterceptor$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getRetryAfterDataMap$vungle_ads_release$annotations() {
    }

    private final com.vungle.ads.internal.signals.b getSignalManager() {
        return (com.vungle.ads.internal.signals.b) this.signalManager$delegate.getValue();
    }

    private final CommonRequestBody.User getUserBody(boolean z10) {
        CommonRequestBody.User user = new CommonRequestBody.User((CommonRequestBody.GDPR) null, (CommonRequestBody.CCPA) null, (CommonRequestBody.COPPA) null, (com.vungle.ads.fpd.c) null, (CommonRequestBody.IAB) null, 31, (DefaultConstructorMarker) null);
        yj.c cVar = yj.c.INSTANCE;
        user.setGdpr(new CommonRequestBody.GDPR(cVar.getConsentStatus(), cVar.getConsentSource(), cVar.getConsentTimestamp(), cVar.getConsentMessageVersion()));
        user.setCcpa(new CommonRequestBody.CCPA(cVar.getCcpaStatus()));
        if (cVar.getCoppaStatus() != yj.a.COPPA_NOTSET) {
            user.setCoppa(new CommonRequestBody.COPPA(cVar.getCoppaStatus().getValue()));
        }
        if (cVar.shouldSendTCFString()) {
            user.setIab(new CommonRequestBody.IAB(cVar.getIABTCFString()));
        }
        if (z10) {
            user.setFpd(com.vungle.ads.g0.firstPartyData);
        }
        return user;
    }

    static /* synthetic */ CommonRequestBody.User getUserBody$default(k kVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return kVar.getUserBody(z10);
    }

    private final void initUserAgentLazy() {
        com.vungle.ads.e0 e0Var = new com.vungle.ads.e0(Sdk$SDKMetric.b.USER_AGENT_LOAD_DURATION_MS);
        e0Var.markStart();
        this.platform.getUserAgentLazy(new e(e0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.vungle.ads.internal.model.i pingTPAT$default(k kVar, String str, Map map, String str2, com.vungle.ads.internal.network.d dVar, p pVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            dVar = com.vungle.ads.internal.network.d.GET;
        }
        if ((i10 & 16) != 0) {
            pVar = null;
        }
        return kVar.pingTPAT(str, map, str2, dVar, pVar);
    }

    public static /* synthetic */ CommonRequestBody requestBody$default(k kVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        return kVar.requestBody(z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: responseInterceptor$lambda-0, reason: not valid java name */
    public static final f0 m109responseInterceptor$lambda0(k this$0, z.a chain) {
        s.h(this$0, "this$0");
        s.h(chain, "chain");
        d0 d0VarE = chain.e();
        try {
            try {
                f0 f0VarC = chain.c(d0VarE);
                String strA = f0VarC.d0().a("Retry-After");
                if (strA != null && strA.length() != 0) {
                    try {
                        long j10 = Long.parseLong(strA);
                        if (j10 > 0) {
                            String strC = d0VarE.m().c();
                            long jCurrentTimeMillis = (j10 * ((long) 1000)) + System.currentTimeMillis();
                            if (bm.r.z(strC, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, false, 2, null)) {
                                String placementID = this$0.getPlacementID(d0VarE.a());
                                if (placementID.length() > 0) {
                                    this$0.retryAfterDataMap.put(placementID, Long.valueOf(jCurrentTimeMillis));
                                }
                            }
                        }
                    } catch (Exception unused) {
                        com.vungle.ads.internal.util.q.Companion.d(TAG, "Retry-After value is not an valid value");
                    }
                }
                return f0VarC;
            } catch (Exception e10) {
                com.vungle.ads.internal.util.q.Companion.e(TAG, "Exception: " + e10.getMessage() + " for " + d0VarE.m());
                return this$0.defaultErrorResponse(d0VarE);
            }
        } catch (OutOfMemoryError unused2) {
            com.vungle.ads.internal.util.q.Companion.e(TAG, "OOM for " + d0VarE.m());
            return this$0.safeErrorResponse(d0VarE);
        }
    }

    private final f0 safeErrorResponse(d0 d0Var) {
        return new f0.a().q(d0Var).f(500).o(gn.c0.HTTP_1_1).l("OOM").b(gn.g0.Companion.h(new byte[0], null)).c();
    }

    public final void addPlaySvcAvailabilityInCookie(boolean z10) {
        this.filePreferences.put("isPlaySvcAvailable", z10).apply();
    }

    public final boolean checkIsRetryAfterActive(String placementID) {
        s.h(placementID, "placementID");
        Long l10 = this.retryAfterDataMap.get(placementID);
        if ((l10 != null ? l10.longValue() : 0L) > System.currentTimeMillis()) {
            return true;
        }
        this.retryAfterDataMap.remove(placementID);
        return false;
    }

    public final com.vungle.ads.internal.network.a config() {
        AppNode appNode = this.appBody;
        if (appNode == null) {
            return null;
        }
        CommonRequestBody commonRequestBody = new CommonRequestBody(getDeviceBody$vungle_ads_release(true), appNode, getUserBody$default(this, false, 1, null), (CommonRequestBody.RequestExt) null, (CommonRequestBody.RequestParam) null, 24, (DefaultConstructorMarker) null);
        CommonRequestBody.RequestExt extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            commonRequestBody.setExt(extBody$default);
        }
        com.vungle.ads.internal.util.j jVar = com.vungle.ads.internal.util.j.INSTANCE;
        String str = BASE_URL;
        if (!jVar.isValidUrl(str)) {
            str = "https://config.ads.vungle.com/";
        }
        if (!bm.r.z(str, "/", false, 2, null)) {
            str = str + '/';
        }
        return this.api.config(m.INSTANCE.getHeaderUa(), str + "config", commonRequestBody);
    }

    public final AppNode getAppBody$vungle_ads_release() {
        return this.appBody;
    }

    public final String getConnectionTypeDetail(int i10) {
        if (i10 == 1) {
            return WwUgngZLNA.aWdOChNwgpyKl;
        }
        if (i10 == 2) {
            return "edge";
        }
        if (i10 == 20) {
            return "5g";
        }
        switch (i10) {
            case 4:
                return "wcdma";
            case 5:
                return "cdma_evdo_0";
            case 6:
                return "cdma_evdo_a";
            case 7:
                return "cdma_1xrtt";
            case 8:
                return "hsdpa";
            case 9:
                return "hsupa";
            default:
                switch (i10) {
                    case 12:
                        return "cdma_evdo_b";
                    case 13:
                        return "lte";
                    case 14:
                        return "hrpd";
                    default:
                        return "unknown";
                }
        }
    }

    public final String getConnectionTypeDetail$vungle_ads_release() {
        if (androidx.core.content.a.checkSelfPermission(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.applicationContext.getSystemService("connectivity");
        s.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null ? getConnectionTypeDetail(activeNetworkInfo.getSubtype()) : "unknown";
    }

    public final synchronized DeviceNode getDeviceBody$vungle_ads_release(boolean z10) {
        DeviceNode deviceNodeCopy$default;
        String str;
        try {
            DeviceNode basicDeviceBody = this.baseDeviceInfo;
            if (basicDeviceBody == null) {
                basicDeviceBody = getBasicDeviceBody(this.applicationContext);
                this.baseDeviceInfo = basicDeviceBody;
            }
            deviceNodeCopy$default = DeviceNode.copy$default(basicDeviceBody, null, null, null, null, null, 0, 0, null, null, null, null, 2047, null);
            DeviceNode.VungleExt vungleExt = new DeviceNode.VungleExt(false, (String) null, (Integer) null, 0.0f, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false, 0, false, (String) null, (String) null, (Long) null, (Long) null, (Long) null, (Long) null, (String) null, 8388607, (DefaultConstructorMarker) null);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Object systemService = this.applicationContext.getSystemService("window");
            s.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            deviceNodeCopy$default.setH(displayMetrics.heightPixels);
            deviceNodeCopy$default.setW(displayMetrics.widthPixels);
            com.vungle.ads.internal.model.c advertisingInfo = this.advertisingInfo;
            if (advertisingInfo == null) {
                advertisingInfo = this.platform.getAdvertisingInfo();
            }
            this.advertisingInfo = advertisingInfo;
            String advertisingId = advertisingInfo != null ? advertisingInfo.getAdvertisingId() : null;
            com.vungle.ads.internal.model.c cVar = this.advertisingInfo;
            Boolean boolValueOf = cVar != null ? Boolean.valueOf(cVar.getLimitAdTracking()) : null;
            yj.c cVar2 = yj.c.INSTANCE;
            if (cVar2.shouldSendAdIds()) {
                if (advertisingId != null) {
                    if (s.c("Amazon", Build.MANUFACTURER)) {
                        vungleExt.setAmazonAdvertisingId(advertisingId);
                    } else {
                        vungleExt.setGaid(advertisingId);
                    }
                    deviceNodeCopy$default.setIfa(advertisingId);
                } else {
                    deviceNodeCopy$default.setIfa("");
                }
            }
            if (z10 || !cVar2.shouldSendAdIds()) {
                deviceNodeCopy$default.setIfa(null);
                vungleExt.setGaid(null);
                vungleExt.setAmazonAdvertisingId(null);
            }
            Boolean bool = Boolean.TRUE;
            boolean zHasSystemFeature = false;
            deviceNodeCopy$default.setLmt(s.c(boolValueOf, bool) ? 1 : 0);
            vungleExt.setGooglePlayServicesAvailable(s.c(bool, isGooglePlayServicesAvailable()));
            if (cVar2.allowDeviceIDFromTCF() != yj.c.a.DISABLE_ID) {
                String appSetId = this.platform.getAppSetId();
                if (appSetId != null) {
                    vungleExt.setAppSetId(appSetId);
                }
                Integer appSetIdScope = this.platform.getAppSetIdScope();
                if (appSetIdScope != null) {
                    vungleExt.setAppSetIdScope(Integer.valueOf(appSetIdScope.intValue()));
                }
            }
            Intent intentRegisterReceiver = this.applicationContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
                int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
                if (intExtra > 0 && intExtra2 > 0) {
                    vungleExt.setBatteryLevel(intExtra / intExtra2);
                }
                int intExtra3 = intentRegisterReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
                if (intExtra3 == -1) {
                    str = "UNKNOWN";
                } else if (intExtra3 == 2 || intExtra3 == 5) {
                    int intExtra4 = intentRegisterReceiver.getIntExtra("plugged", -1);
                    if (intExtra4 == 1) {
                        str = "BATTERY_PLUGGED_AC";
                    } else if (intExtra4 != 2) {
                        str = intExtra4 != 4 ? "BATTERY_PLUGGED_OTHERS" : "BATTERY_PLUGGED_WIRELESS";
                    } else {
                        str = "BATTERY_PLUGGED_USB";
                    }
                } else {
                    str = "NOT_CHARGING";
                }
            } else {
                str = "UNKNOWN";
            }
            vungleExt.setBatteryState(str);
            vungleExt.setBatterySaverEnabled(this.platform.isBatterySaverEnabled() ? 1 : 0);
            String connectionType = getConnectionType();
            if (connectionType != null) {
                vungleExt.setConnectionType(connectionType);
            }
            String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
            if (connectionTypeDetail$vungle_ads_release != null) {
                vungleExt.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
            }
            vungleExt.setLocale(Locale.getDefault().toString());
            vungleExt.setLanguage(Locale.getDefault().getLanguage());
            vungleExt.setTimeZone(TimeZone.getDefault().getID());
            vungleExt.setVolumeLevel(this.platform.getVolumeLevel());
            vungleExt.setSoundEnabled(this.platform.isSoundEnabled() ? 1 : 0);
            if (s.c("Amazon", Build.MANUFACTURER)) {
                zHasSystemFeature = this.applicationContext.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
            } else {
                Object systemService2 = this.applicationContext.getSystemService("uimode");
                s.f(systemService2, "null cannot be cast to non-null type android.app.UiModeManager");
                if (((UiModeManager) systemService2).getCurrentModeType() == 4) {
                    zHasSystemFeature = true;
                }
            }
            vungleExt.setTv(zHasSystemFeature);
            vungleExt.setSideloadEnabled(this.platform.isSideLoaded());
            vungleExt.setSdCardAvailable(this.platform.isSdCardPresent() ? 1 : 0);
            if (com.vungle.ads.internal.e.INSTANCE.otEnabled()) {
                vungleExt.setSit(Long.valueOf(this.platform.getSDKInstallationTime()));
                vungleExt.setOit(Long.valueOf(this.platform.getOSInstallationTime()));
                vungleExt.setOrt(Long.valueOf(this.platform.getLastBootTime()));
                vungleExt.setObt(Long.valueOf(this.platform.getBuildTime()));
            }
            vungleExt.setGpVersion(this.platform.getGPVersion());
            deviceNodeCopy$default.setUa(this.uaString);
            deviceNodeCopy$default.setExt(vungleExt);
        } catch (Throwable th2) {
            throw th2;
        }
        return deviceNodeCopy$default;
    }

    public final VungleApi getGzipApi$vungle_ads_release() {
        return this.gzipApi;
    }

    public final Boolean getPlayServicesAvailabilityFromAPI() {
        Boolean boolValueOf = null;
        try {
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
            s.g(googleApiAvailabilityLight, "getInstance()");
            boolean z10 = googleApiAvailabilityLight.isGooglePlayServicesAvailable(this.applicationContext) == 0;
            boolValueOf = Boolean.valueOf(z10);
            addPlaySvcAvailabilityInCookie(z10);
            return boolValueOf;
        } catch (Exception unused) {
            com.vungle.ads.internal.util.q.Companion.w(TAG, "Unexpected exception from Play services lib.");
            return boolValueOf;
        } catch (NoClassDefFoundError unused2) {
            com.vungle.ads.internal.util.q.Companion.w(TAG, "Play services Not available");
            boolValueOf = Boolean.FALSE;
            try {
                addPlaySvcAvailabilityInCookie(false);
            } catch (Exception unused3) {
                com.vungle.ads.internal.util.q.Companion.w(TAG, "Failure to write GPS availability to DB");
            }
            return boolValueOf;
        }
    }

    public final Boolean getPlayServicesAvailabilityFromCookie() {
        return this.filePreferences.getBoolean("isPlaySvcAvailable");
    }

    public final z getResponseInterceptor$vungle_ads_release() {
        return this.responseInterceptor;
    }

    public final Map<String, Long> getRetryAfterDataMap$vungle_ads_release() {
        return this.retryAfterDataMap;
    }

    public final long getRetryAfterHeaderValue(String placementID) {
        s.h(placementID, "placementID");
        Long l10 = this.retryAfterDataMap.get(placementID);
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    public final synchronized void initialize(String appId) {
        PackageInfo packageInfo;
        try {
            s.h(appId, "appId");
            m.INSTANCE.setAppId(appId);
            String str = "1.0";
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    packageInfo = this.applicationContext.getPackageManager().getPackageInfo(this.applicationContext.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                    s.g(packageInfo, "{\n                    ap…      )\n                }");
                } else {
                    packageInfo = this.applicationContext.getPackageManager().getPackageInfo(this.applicationContext.getPackageName(), 0);
                    s.g(packageInfo, "{\n                    ap…      )\n                }");
                }
                String str2 = packageInfo.versionName;
                s.g(str2, "packageInfo.versionName");
                str = str2;
            } catch (Exception unused) {
            }
            m.INSTANCE.setAppVersion(str);
            this.baseDeviceInfo = getBasicDeviceBody(this.applicationContext);
            String packageName = this.applicationContext.getPackageName();
            s.g(packageName, "applicationContext.packageName");
            this.appBody = new AppNode(packageName, str, appId);
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Boolean isGooglePlayServicesAvailable() {
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromCookie();
        }
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        }
        return this.isGooglePlayServicesAvailable;
    }

    public final com.vungle.ads.internal.model.i pingTPAT(String url, Map<String, String> map, String str, com.vungle.ads.internal.network.d requestType, p pVar) {
        f0 f0VarRaw;
        s.h(url, "url");
        s.h(requestType, "requestType");
        if (!com.vungle.ads.internal.util.j.INSTANCE.isValidUrl(url)) {
            return new com.vungle.ads.internal.model.i("Invalid URL", true, false, 4, null);
        }
        try {
            if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(new URL(url).getHost()) && URLUtil.isHttpUrl(url)) {
                return new com.vungle.ads.internal.model.i("Clear Text Traffic is blocked", false, false, 6, null);
            }
            try {
                String str2 = this.uaString;
                if (str2 == null) {
                    str2 = "";
                }
                com.vungle.ads.internal.network.f fVarExecute = this.api.pingTPAT(str2, url, requestType, map, str != null ? e0.Companion.i(str, a0.f39423e.b("application/json")) : null).execute();
                if (fVarExecute != null && fVarExecute.isSuccessful()) {
                    return null;
                }
                Integer numValueOf = (fVarExecute == null || (f0VarRaw = fVarExecute.raw()) == null) ? null : Integer.valueOf(f0VarRaw.m());
                if (r.U(r.o(301, 302, 307, Integer.valueOf(Sdk$SDKError.b.AD_WIN_NOTIFICATION_ERROR_VALUE)), numValueOf)) {
                    com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, Sdk$SDKMetric.b.NOTIFICATION_REDIRECT, 0L, pVar, url, 2, null);
                    return null;
                }
                boolean z10 = numValueOf != null && new yl.f(500, 599).h(numValueOf.intValue());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unsuccessful response, error code: ");
                sb2.append(numValueOf);
                sb2.append(", message: ");
                sb2.append(fVarExecute != null ? fVarExecute.message() : null);
                return new com.vungle.ads.internal.model.i(sb2.toString(), false, z10, 2, null);
            } catch (Throwable th2) {
                String localizedMessage = th2.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "IOException";
                }
                return new com.vungle.ads.internal.model.i(localizedMessage, false, true, 2, null);
            }
        } catch (MalformedURLException e10) {
            String localizedMessage2 = e10.getLocalizedMessage();
            if (localizedMessage2 == null) {
                localizedMessage2 = "MalformedURLException";
            }
            return new com.vungle.ads.internal.model.i(localizedMessage2, true, false, 4, null);
        }
    }

    public final void reportErrors(BlockingQueue<Sdk$SDKError.a> errors, com.vungle.ads.g.b requestListener) {
        s.h(errors, "errors");
        s.h(requestListener, "requestListener");
        String errorLoggingEndpoint = com.vungle.ads.internal.e.INSTANCE.getErrorLoggingEndpoint();
        if (errorLoggingEndpoint.length() == 0) {
            requestListener.onFailure();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        for (Sdk$SDKError.a aVar : errors) {
            aVar.setSessionId(getSignalManager().getUuid());
            Placement placement = com.vungle.ads.internal.e.INSTANCE.getPlacement(aVar.getPlacementReferenceId());
            if (placement != null) {
                String type = placement.getType();
                if (type == null) {
                    type = "";
                }
                aVar.setPlacementType(type);
            }
            String connectionType = getConnectionType();
            if (connectionType != null) {
                aVar.setConnectionType(connectionType);
            }
            String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
            if (connectionTypeDetail$vungle_ads_release != null) {
                aVar.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
            }
            Sdk$SDKError sdk$SDKError = (Sdk$SDKError) aVar.build();
            com.vungle.ads.internal.util.q.Companion.e(TAG, "Sending Error: " + sdk$SDKError.getReason());
            linkedBlockingQueue.add(sdk$SDKError);
        }
        Sdk$SDKErrorBatch sdk$SDKErrorBatch = (Sdk$SDKErrorBatch) Sdk$SDKErrorBatch.newBuilder().addAllErrors(linkedBlockingQueue).build();
        e0.a aVar2 = e0.Companion;
        byte[] byteArray = sdk$SDKErrorBatch.toByteArray();
        s.g(byteArray, "batch.toByteArray()");
        this.api.sendErrors(m.INSTANCE.getHeaderUa(), errorLoggingEndpoint, aVar2.o(byteArray, a0.f39423e.b("application/x-protobuf"), 0, sdk$SDKErrorBatch.toByteArray().length)).enqueue(new f(requestListener));
    }

    public final void reportMetrics(BlockingQueue<Sdk$SDKMetric.a> metrics, com.vungle.ads.g.b requestListener) {
        s.h(metrics, "metrics");
        s.h(requestListener, "requestListener");
        String metricsEndpoint = com.vungle.ads.internal.e.INSTANCE.getMetricsEndpoint();
        if (metricsEndpoint.length() == 0) {
            requestListener.onFailure();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        for (Sdk$SDKMetric.a aVar : metrics) {
            aVar.setSessionId(getSignalManager().getUuid());
            Placement placement = com.vungle.ads.internal.e.INSTANCE.getPlacement(aVar.getPlacementReferenceId());
            if (placement != null) {
                String type = placement.getType();
                if (type == null) {
                    type = "";
                }
                aVar.setPlacementType(type);
            }
            String connectionType = getConnectionType();
            if (connectionType != null) {
                aVar.setConnectionType(connectionType);
            }
            String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
            if (connectionTypeDetail$vungle_ads_release != null) {
                aVar.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
            }
            Sdk$SDKMetric sdk$SDKMetric = (Sdk$SDKMetric) aVar.build();
            com.vungle.ads.internal.util.q.Companion.e(TAG, "Sending Metric: " + sdk$SDKMetric.getType());
            linkedBlockingQueue.add(sdk$SDKMetric);
        }
        Sdk$MetricBatch sdk$MetricBatch = (Sdk$MetricBatch) Sdk$MetricBatch.newBuilder().addAllMetrics(linkedBlockingQueue).build();
        e0.a aVar2 = e0.Companion;
        a0 a0VarB = a0.f39423e.b("application/x-protobuf");
        byte[] byteArray = sdk$MetricBatch.toByteArray();
        s.g(byteArray, "batch.toByteArray()");
        this.api.sendMetrics(m.INSTANCE.getHeaderUa(), metricsEndpoint, e0.a.p(aVar2, a0VarB, byteArray, 0, 0, 12, null)).enqueue(new g(requestListener));
    }

    public final com.vungle.ads.internal.network.a requestAd(String placement, com.vungle.ads.f0 f0Var) {
        s.h(placement, "placement");
        com.vungle.ads.internal.e eVar = com.vungle.ads.internal.e.INSTANCE;
        String adsEndpoint = eVar.getAdsEndpoint();
        CommonRequestBody commonRequestBodyRequestBody = requestBody(!eVar.signalsDisabled(), eVar.fpdEnabled());
        CommonRequestBody.RequestParam requestParam = new CommonRequestBody.RequestParam(r.e(placement), (CommonRequestBody.AdSizeParam) null, (Long) null, (String) null, (String) null, (String) null, (CommonRequestBody.CSBParam) null, Sdk$SDKError.b.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (DefaultConstructorMarker) null);
        if (f0Var != null) {
            requestParam.setAdSize(new CommonRequestBody.AdSizeParam(f0Var.getWidth(), f0Var.getHeight()));
        }
        commonRequestBodyRequestBody.setRequest(requestParam);
        return this.gzipApi.ads(m.INSTANCE.getHeaderUa(), adsEndpoint, commonRequestBodyRequestBody);
    }

    public final CommonRequestBody requestBody(boolean z10, boolean z11) {
        CommonRequestBody commonRequestBody = new CommonRequestBody(getDeviceBody(), this.appBody, getUserBody(z11), (CommonRequestBody.RequestExt) null, (CommonRequestBody.RequestParam) null, 24, (DefaultConstructorMarker) null);
        CommonRequestBody.RequestExt extBody = getExtBody(z10);
        if (extBody != null) {
            commonRequestBody.setExt(extBody);
        }
        return commonRequestBody;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public final com.vungle.ads.internal.network.a requestCSBAd(String placement, com.vungle.ads.f0 f0Var, i0 i0Var) {
        CommonRequestBody.CSBParam cSBParam;
        kotlinx.serialization.json.d0 d0VarA;
        s.h(placement, "placement");
        com.vungle.ads.internal.e eVar = com.vungle.ads.internal.e.INSTANCE;
        String cSBEndpoint = eVar.getCSBEndpoint();
        CommonRequestBody commonRequestBodyRequestBody = requestBody(!eVar.signalsDisabled(), eVar.fpdEnabled());
        if (i0Var != null) {
            Map<String, String> extras = i0Var.getExtras();
            if (extras == null) {
                d0VarA = null;
            } else {
                if (extras.isEmpty()) {
                    extras = null;
                }
                if (extras != null) {
                    kotlinx.serialization.json.e0 e0Var = new kotlinx.serialization.json.e0();
                    for (Map.Entry<String, String> entry : extras.entrySet()) {
                        e0Var.b(entry.getKey(), kotlinx.serialization.json.k.c(entry.getValue()));
                    }
                    d0VarA = e0Var.a();
                } else {
                    d0VarA = null;
                }
            }
            cSBParam = new CommonRequestBody.CSBParam(i0Var.getBidFloor(), i0Var.getPhase(), i0Var.isVXWinner(), i0Var.getAuctionId(), i0Var.getCreativeId(), i0Var.getAdUnitId(), d0VarA != null ? d0VarA.toString() : null);
        } else {
            cSBParam = null;
        }
        CommonRequestBody.RequestParam requestParam = new CommonRequestBody.RequestParam(r.e(placement), (CommonRequestBody.AdSizeParam) null, (Long) null, (String) null, (String) null, (String) null, cSBParam, 62, (DefaultConstructorMarker) null);
        if (f0Var != null) {
            requestParam.setAdSize(new CommonRequestBody.AdSizeParam(f0Var.getWidth(), f0Var.getHeight()));
        }
        commonRequestBodyRequestBody.setRequest(requestParam);
        return this.gzipApi.ads(m.INSTANCE.getHeaderUa(), cSBEndpoint, commonRequestBodyRequestBody);
    }

    public final com.vungle.ads.internal.network.a ri(CommonRequestBody.RequestParam request) {
        AppNode appNode;
        s.h(request, "request");
        String riEndpoint = com.vungle.ads.internal.e.INSTANCE.getRiEndpoint();
        if (riEndpoint == null || riEndpoint.length() == 0 || (appNode = this.appBody) == null) {
            return null;
        }
        CommonRequestBody commonRequestBody = new CommonRequestBody(getDeviceBody(), appNode, getUserBody$default(this, false, 1, null), (CommonRequestBody.RequestExt) null, (CommonRequestBody.RequestParam) null, 24, (DefaultConstructorMarker) null);
        commonRequestBody.setRequest(request);
        CommonRequestBody.RequestExt extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            commonRequestBody.setExt(extBody$default);
        }
        return this.api.ri(m.INSTANCE.getHeaderUa(), riEndpoint, commonRequestBody);
    }

    public final void sendAdMarkup(String adMarkup, String endpoint) {
        s.h(adMarkup, "adMarkup");
        s.h(endpoint, "endpoint");
        this.api.sendAdMarkup(endpoint, e0.Companion.i(adMarkup, a0.f39423e.b("application/json"))).enqueue(new h());
    }

    public final void setAppBody$vungle_ads_release(AppNode appNode) {
        this.appBody = appNode;
    }

    public final void setGzipApi$vungle_ads_release(VungleApi vungleApi) {
        s.h(vungleApi, "<set-?>");
        this.gzipApi = vungleApi;
    }

    public final void setResponseInterceptor$vungle_ads_release(z zVar) {
        s.h(zVar, "<set-?>");
        this.responseInterceptor = zVar;
    }

    public final void setRetryAfterDataMap$vungle_ads_release(Map<String, Long> map) {
        s.h(map, "<set-?>");
        this.retryAfterDataMap = map;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class h implements com.vungle.ads.internal.network.b {
        h() {
        }

        @Override // com.vungle.ads.internal.network.b
        public void onFailure(com.vungle.ads.internal.network.a aVar, Throwable th2) {
        }

        @Override // com.vungle.ads.internal.network.b
        public void onResponse(com.vungle.ads.internal.network.a aVar, com.vungle.ads.internal.network.f fVar) {
        }
    }
}
