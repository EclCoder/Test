package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.InvalidAppId;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SdkNotInitialized;
import com.vungle.ads.SdkVersionTooLow;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.VungleError;
import com.vungle.ads.d0;
import com.vungle.ads.e0;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.y;
import com.vungle.ads.internal.util.z;
import f8.Ygx.FuoITeVPeXAj;
import fl.g0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class p {
    public static final a Companion = new a(null);
    private static final String TAG = "VungleInitializer";
    private AtomicBoolean isInitialized = new AtomicBoolean(false);
    private AtomicBoolean isInitializing = new AtomicBoolean(false);
    private final CopyOnWriteArrayList<com.vungle.ads.p> initializationCallbackArray = new CopyOnWriteArrayList<>();
    private final e0 initDurationMetric = new e0(Sdk$SDKMetric.b.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class b extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
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
    public static final class c extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.task.f, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.task.f invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.task.f.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class d extends t implements Function1 {
        public static final d INSTANCE = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return g0.f38750a;
        }

        public final void invoke(boolean z10) {
            com.vungle.ads.internal.util.q.Companion.d(p.TAG, "Config fetch result: " + z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class e extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
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
    public static final class f extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
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
    static final class g extends t implements tl.a {
        g() {
            super(0);
        }

        @Override // tl.a
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m117invoke();
            return g0.f38750a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m117invoke() throws Throwable {
            p.this.onInitError(new SdkNotInitialized("Network permissions not granted").logError$vungle_ads_release());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class h extends t implements tl.a {
        final /* synthetic */ VungleError $exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(VungleError vungleError) {
            super(0);
            this.$exception = vungleError;
        }

        @Override // tl.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m118invoke();
            return g0.f38750a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m118invoke() {
            com.vungle.ads.internal.util.q.Companion.e(p.TAG, "onError");
            CopyOnWriteArrayList copyOnWriteArrayList = p.this.initializationCallbackArray;
            VungleError vungleError = this.$exception;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((com.vungle.ads.p) it.next()).onError(vungleError);
            }
            p.this.initializationCallbackArray.clear();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class i extends t implements tl.a {
        i() {
            super(0);
        }

        @Override // tl.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m119invoke();
            return g0.f38750a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m119invoke() {
            Iterator it = p.this.initializationCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.vungle.ads.p) it.next()).onSuccess();
            }
            p.this.initializationCallbackArray.clear();
        }
    }

    private final void configure(Context context, String str) {
        Context context2;
        boolean z10;
        try {
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            fl.o oVar = fl.o.SYNCHRONIZED;
            fl.k kVarA = fl.l.a(oVar, new b(context));
            com.vungle.ads.internal.e eVar = com.vungle.ads.internal.e.INSTANCE;
            com.vungle.ads.internal.model.g cachedConfig = eVar.getCachedConfig(m111configure$lambda4(kVarA), str);
            if (cachedConfig != null) {
                context2 = context;
                com.vungle.ads.internal.e.initWithConfig$vungle_ads_release$default(eVar, context2, cachedConfig, true, null, 8, null);
                z10 = true;
            } else {
                context2 = context;
                z10 = false;
            }
            this.isInitialized.set(true);
            onInitSuccess();
            com.vungle.ads.internal.util.q.Companion.d(TAG, "Running cleanup jobs. " + Thread.currentThread().getId());
            m112configure$lambda5(fl.l.a(oVar, new c(context2))).execute(com.vungle.ads.internal.task.a.C0532a.makeJobInfo$default(com.vungle.ads.internal.task.a.Companion, null, 1, null));
            if (z10) {
                return;
            }
            eVar.fetchConfigAsync$vungle_ads_release(context2, d.INSTANCE);
        } catch (Throwable th2) {
            com.vungle.ads.internal.util.q.Companion.e(TAG, "Cannot get config", th2);
        }
    }

    /* JADX INFO: renamed from: configure$lambda-4, reason: not valid java name */
    private static final com.vungle.ads.internal.persistence.b m111configure$lambda4(fl.k kVar) {
        return (com.vungle.ads.internal.persistence.b) kVar.getValue();
    }

    /* JADX INFO: renamed from: configure$lambda-5, reason: not valid java name */
    private static final com.vungle.ads.internal.task.f m112configure$lambda5(fl.k kVar) {
        return (com.vungle.ads.internal.task.f) kVar.getValue();
    }

    private final boolean hasInvalidChar(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '.') {
                return true;
            }
        }
        return false;
    }

    private final boolean hasRequiredNetworkPermissions(Context context) {
        return (androidx.core.content.a.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) && (androidx.core.content.a.checkSelfPermission(context, "android.permission.INTERNET") == 0);
    }

    /* JADX INFO: renamed from: init$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.a m113init$lambda0(fl.k kVar) {
        return (com.vungle.ads.internal.executor.a) kVar.getValue();
    }

    /* JADX INFO: renamed from: init$lambda-1, reason: not valid java name */
    private static final com.vungle.ads.internal.network.k m114init$lambda1(fl.k kVar) {
        return (com.vungle.ads.internal.network.k) kVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-2, reason: not valid java name */
    public static final void m115init$lambda2(p this$0, Context context, String appId, fl.k vungleApiClient$delegate) throws Throwable {
        s.h(this$0, "this$0");
        s.h(context, "$context");
        s.h(appId, "$appId");
        s.h(vungleApiClient$delegate, "$vungleApiClient$delegate");
        if (!this$0.hasRequiredNetworkPermissions(context)) {
            com.vungle.ads.internal.util.q.Companion.e(TAG, "Network permissions not granted");
            y.INSTANCE.runOnUiThread(this$0.new g());
        } else {
            yj.c.INSTANCE.init(context);
            m114init$lambda1(vungleApiClient$delegate).initialize(appId);
            this$0.configure(context, appId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-3, reason: not valid java name */
    public static final void m116init$lambda3(p this$0) throws Throwable {
        s.h(this$0, "this$0");
        this$0.onInitError(new OutOfMemory("Config: Out of Memory").logError$vungle_ads_release());
    }

    private final boolean isAppIdInvalid(String str) {
        return bm.r.h0(str) || hasInvalidChar(str);
    }

    public static /* synthetic */ void isInitialized$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void isInitializing$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInitError(VungleError vungleError) throws Throwable {
        this.isInitializing.set(false);
        String localizedMessage = vungleError.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "Exception code is " + vungleError.getCode();
        }
        this.initDurationMetric.setMetricType(Sdk$SDKMetric.b.INIT_TO_FAIL_CALLBACK_DURATION_MS);
        this.initDurationMetric.markEnd();
        com.vungle.ads.g.INSTANCE.logMetric$vungle_ads_release(this.initDurationMetric, (com.vungle.ads.internal.util.p) null, localizedMessage);
        y.INSTANCE.runOnUiThread(new h(vungleError));
        com.vungle.ads.internal.util.q.Companion.e(TAG, localizedMessage);
    }

    private final void onInitSuccess() throws Throwable {
        this.isInitializing.set(false);
        this.initDurationMetric.setMetricType(Sdk$SDKMetric.b.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);
        this.initDurationMetric.markEnd();
        com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, this.initDurationMetric, (com.vungle.ads.internal.util.p) null, (String) null, 6, (Object) null);
        com.vungle.ads.internal.util.q.Companion.d(TAG, "onSuccess " + Thread.currentThread().getId());
        y.INSTANCE.runOnUiThread(new i());
    }

    public final void deInit$vungle_ads_release() {
        ServiceLocator.Companion.deInit();
        com.vungle.ads.internal.network.k.Companion.reset$vungle_ads_release();
        this.isInitialized.set(false);
        this.isInitializing.set(false);
        this.initializationCallbackArray.clear();
    }

    public final boolean isInitialized() {
        return this.isInitialized.get();
    }

    public final AtomicBoolean isInitialized$vungle_ads_release() {
        return this.isInitialized;
    }

    public final AtomicBoolean isInitializing$vungle_ads_release() {
        return this.isInitializing;
    }

    public final void setInitialized$vungle_ads_release(AtomicBoolean atomicBoolean) {
        s.h(atomicBoolean, "<set-?>");
        this.isInitialized = atomicBoolean;
    }

    public final void setInitializing$vungle_ads_release(AtomicBoolean atomicBoolean) {
        s.h(atomicBoolean, "<set-?>");
        this.isInitializing = atomicBoolean;
    }

    public final void setIntegrationName(String integrationName, String version) {
        String str;
        s.h(integrationName, "integrationName");
        s.h(version, "version");
        if (bm.r.h0(integrationName)) {
            com.vungle.ads.internal.util.q.Companion.e(TAG, "integrationName is empty");
            return;
        }
        com.vungle.ads.internal.network.m mVar = com.vungle.ads.internal.network.m.INSTANCE;
        String headerUa = mVar.getHeaderUa();
        if (bm.r.h0(version)) {
            str = "";
        } else {
            str = '/' + version;
        }
        String str2 = integrationName + str;
        if (bm.r.T(headerUa, str2, false, 2, null)) {
            com.vungle.ads.internal.util.q.Companion.w(TAG, "Wrapper info already set");
            return;
        }
        mVar.setHeaderUa(headerUa + ';' + str2);
        if (isInitialized()) {
            com.vungle.ads.internal.util.q.Companion.w(TAG, "VUNGLE WARNING: SDK already initialized, you should've set wrapper info before");
        }
    }

    public final void init(final String appId, final Context context, com.vungle.ads.p initializationCallback) throws Throwable {
        s.h(appId, "appId");
        s.h(context, "context");
        s.h(initializationCallback, "initializationCallback");
        com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, new d0(Sdk$SDKMetric.b.SDK_INIT_API), (com.vungle.ads.internal.util.p) null, (String) null, 6, (Object) null);
        this.initDurationMetric.markStart();
        this.initializationCallbackArray.add(initializationCallback);
        if (isAppIdInvalid(appId)) {
            onInitError(new InvalidAppId("App id invalid: " + appId + ", package name: " + context.getPackageName()).logError$vungle_ads_release());
            return;
        }
        boolean zIsOSVersionInvalid = z.INSTANCE.isOSVersionInvalid();
        String str = FuoITeVPeXAj.XAc;
        if (zIsOSVersionInvalid) {
            com.vungle.ads.internal.util.q.Companion.e(str, "Init: SDK is supported only for API versions 25 and above.");
            onInitError(new SdkVersionTooLow("Init: SDK is supported only for API versions 25 and above.").logError$vungle_ads_release());
            return;
        }
        com.vungle.ads.internal.e.INSTANCE.setAppId$vungle_ads_release(appId);
        if (this.isInitialized.get()) {
            com.vungle.ads.internal.util.q.Companion.d(str, "init already complete");
            onInitSuccess();
        } else {
            if (this.isInitializing.getAndSet(true)) {
                com.vungle.ads.internal.util.q.Companion.d(str, "init already in progress");
                return;
            }
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            fl.o oVar = fl.o.SYNCHRONIZED;
            fl.k kVarA = fl.l.a(oVar, new e(context));
            final fl.k kVarA2 = fl.l.a(oVar, new f(context));
            m113init$lambda0(kVarA).getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.ads.internal.n
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    p.m115init$lambda2(this.f35830a, context, appId, kVarA2);
                }
            }, new Runnable() { // from class: com.vungle.ads.internal.o
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    p.m116init$lambda3(this.f35839a);
                }
            });
        }
    }
}
