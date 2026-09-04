package com.vungle.ads.internal.signals;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.model.UnclosedAd;
import com.vungle.ads.internal.util.q;
import fl.g0;
import fl.k;
import fl.l;
import fl.o;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import kotlinx.serialization.json.v;
import zl.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static final C0531b Companion = new C0531b(null);
    public static final String SESSION_COUNT_KEY = "vungle_signal_session_count";
    private static final int SESSION_COUNT_NOT_SET = -1;
    public static final String SESSION_TIME_KEY = "vungle_signal_session_creation_time";
    public static final int SIGNAL_VERSION = 2;
    private static final String TAG = "SignalManager";
    public static final long TWENTY_FOUR_HOURS_MILLIS = 86400000;
    private final Context context;
    private SessionData currentSession;
    private long enterBackgroundTime;
    private long enterForegroundTime;
    private final k filePreferences$delegate;
    private final kotlinx.serialization.json.b json;
    private ConcurrentHashMap<String, Long> mapOfLastLoadTimes;
    private int sessionCount;
    private long sessionDuration;
    private long sessionSeriesCreatedTime;
    private com.vungle.ads.internal.session.d unclosedAdDetector;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends t implements tl.a {
        a() {
            super(0);
        }

        @Override // tl.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("unclosedad: ");
            kotlinx.serialization.json.b bVar = b.this.json;
            List<UnclosedAd> unclosedAd = b.this.getCurrentSession$vungle_ads_release().getUnclosedAd();
            pm.d dVarB = pm.t.b(bVar.a(), l0.l(List.class, m.f58989c.a(l0.k(UnclosedAd.class))));
            s.f(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            sb2.append(bVar.c(dVarB, unclosedAd));
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.signals.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0531b {
        public /* synthetic */ C0531b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0531b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends t implements Function1 {
        public static final c INSTANCE = new c();

        c() {
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
    public static final class d extends com.vungle.ads.internal.util.a.b {
        d() {
        }

        @Override // com.vungle.ads.internal.util.a.b
        public void onBackground() {
            q.Companion.d(b.TAG, "SignalManager#onBackground()");
            b.this.setEnterBackgroundTime(System.currentTimeMillis());
            b bVar = b.this;
            bVar.setSessionDuration(bVar.getSessionDuration() + (b.this.getEnterBackgroundTime() - b.this.getEnterForegroundTime()));
        }

        @Override // com.vungle.ads.internal.util.a.b
        public void onForeground() {
            q.Companion.d(b.TAG, "SignalManager#onForeground()");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - b.this.getEnterBackgroundTime() > com.vungle.ads.internal.e.INSTANCE.getSignalsSessionTimeout()) {
                b.this.createNewSessionData();
            }
            b.this.setEnterForegroundTime(jCurrentTimeMillis);
            b.this.setEnterBackgroundTime(0L);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
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
    public static final class f extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
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
    public static final class g extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.s, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.util.s invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.util.s.class);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public b(Context context) {
        s.h(context, "context");
        this.context = context;
        this.json = v.b(null, c.INSTANCE, 1, null);
        this.enterForegroundTime = System.currentTimeMillis();
        this.sessionCount = -1;
        this.mapOfLastLoadTimes = new ConcurrentHashMap<>();
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        o oVar = o.SYNCHRONIZED;
        this.filePreferences$delegate = l.a(oVar, new e(context));
        registerNotifications();
        this.sessionSeriesCreatedTime = getFilePreferences().getLong(SESSION_TIME_KEY, -1L);
        updateSessionCount();
        this.currentSession = new SessionData(this.sessionCount);
        com.vungle.ads.internal.session.d dVar = new com.vungle.ads.internal.session.d(context, this.currentSession.getSessionId(), m144_init_$lambda0(l.a(oVar, new f(context))), m145_init_$lambda1(l.a(oVar, new g(context))));
        this.unclosedAdDetector = dVar;
        this.currentSession.setUnclosedAd(dVar.retrieveUnclosedAd());
        q.Companion.w(TAG, new a());
        try {
            SessionData aVar = this.currentSession;
            com.vungle.ads.internal.platform.e eVar = com.vungle.ads.internal.platform.e.INSTANCE;
            aVar.setDevice(1 ^ (eVar.isEmulator() ? 1 : 0));
            this.currentSession.setVPNConnected(eVar.isVpnConnected(context) ? 1 : 0);
            this.currentSession.setOverlayGranted(eVar.hasSystemAlertWindowPermission(context) ? 1 : 0);
            this.currentSession.setSensorCount(eVar.getSensorCount(context));
            this.currentSession.setHttpProxyEnabled(eVar.isProxyEnabled(context) ? 1 : 0);
        } catch (Exception e10) {
            q.Companion.e(TAG, "Failed to collect device signals: " + e10.getLocalizedMessage());
        }
    }

    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.a m144_init_$lambda0(k kVar) {
        return (com.vungle.ads.internal.executor.a) kVar.getValue();
    }

    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    private static final com.vungle.ads.internal.util.s m145_init_$lambda1(k kVar) {
        return (com.vungle.ads.internal.util.s) kVar.getValue();
    }

    private final void registerNotifications() {
        com.vungle.ads.internal.util.a.Companion.addLifecycleListener(new d());
    }

    private final void updateSessionCount() {
        if (this.sessionCount == -1) {
            this.sessionCount = getFilePreferences().getInt(SESSION_COUNT_KEY, 0);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.sessionSeriesCreatedTime;
        long j11 = jCurrentTimeMillis - j10;
        if (j10 < 0 || j11 >= TWENTY_FOUR_HOURS_MILLIS) {
            this.sessionCount = 1;
            getFilePreferences().put(SESSION_TIME_KEY, jCurrentTimeMillis);
            this.sessionSeriesCreatedTime = jCurrentTimeMillis;
        } else {
            this.sessionCount++;
        }
        getFilePreferences().put(SESSION_COUNT_KEY, this.sessionCount);
        getFilePreferences().apply();
    }

    private final void updateSessionDuration() {
        this.currentSession.setSessionDuration((this.sessionDuration + System.currentTimeMillis()) - this.enterForegroundTime);
    }

    public final void createNewSessionData() {
        updateSessionCount();
        this.currentSession = new SessionData(this.sessionCount);
    }

    public final String generateSignals() {
        updateSessionDuration();
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("2:");
            kotlinx.serialization.json.b bVar = this.json;
            SessionData aVar = this.currentSession;
            pm.d dVarB = pm.t.b(bVar.a(), l0.k(SessionData.class));
            s.f(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            sb2.append(bVar.c(dVarB, aVar));
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final SessionData getCurrentSession$vungle_ads_release() {
        return this.currentSession;
    }

    public final long getEnterBackgroundTime() {
        return this.enterBackgroundTime;
    }

    public final long getEnterForegroundTime() {
        return this.enterForegroundTime;
    }

    public final com.vungle.ads.internal.persistence.b getFilePreferences() {
        return (com.vungle.ads.internal.persistence.b) this.filePreferences$delegate.getValue();
    }

    public final ConcurrentHashMap<String, Long> getMapOfLastLoadTimes() {
        return this.mapOfLastLoadTimes;
    }

    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final long getSessionDuration() {
        return this.sessionDuration;
    }

    public final long getSessionSeriesCreatedTime() {
        return this.sessionSeriesCreatedTime;
    }

    public final synchronized SignaledAd getSignaledAd(String placementId) {
        long jCurrentTimeMillis;
        Long l10;
        try {
            s.h(placementId, "placementId");
            jCurrentTimeMillis = System.currentTimeMillis();
            l10 = this.mapOfLastLoadTimes.containsKey(placementId) ? this.mapOfLastLoadTimes.get(placementId) : null;
            this.mapOfLastLoadTimes.put(placementId, Long.valueOf(jCurrentTimeMillis));
        } catch (Throwable th2) {
            throw th2;
        }
        return new SignaledAd(l10, jCurrentTimeMillis);
    }

    public final String getUuid() {
        return this.currentSession.getSessionId();
    }

    public final synchronized void increaseSessionDepthCounter() {
        SessionData aVar = this.currentSession;
        aVar.setSessionDepthCounter(aVar.getSessionDepthCounter() + 1);
    }

    public final void recordUnclosedAd(UnclosedAd unclosedAd) {
        s.h(unclosedAd, "unclosedAd");
        if (com.vungle.ads.internal.e.INSTANCE.signalsDisabled()) {
            return;
        }
        this.unclosedAdDetector.addUnclosedAd(unclosedAd);
    }

    public final void registerSignaledAd(Context context, SignaledAd signaledAd) {
        s.h(signaledAd, "signaledAd");
        this.currentSession.getSignaledAd().clear();
        this.currentSession.getSignaledAd().add(signaledAd);
        this.currentSession.getSignaledAd().get(0).setScreenOrientation(screenOrientation(context));
    }

    public final void removeUnclosedAd(UnclosedAd unclosedAd) {
        s.h(unclosedAd, "unclosedAd");
        if (com.vungle.ads.internal.e.INSTANCE.signalsDisabled()) {
            return;
        }
        this.unclosedAdDetector.removeUnclosedAd(unclosedAd);
    }

    public final int screenOrientation(Context context) {
        Configuration configuration;
        if (context == null) {
            context = this.context;
        }
        Resources resources = context.getResources();
        Integer numValueOf = (resources == null || (configuration = resources.getConfiguration()) == null) ? null : Integer.valueOf(configuration.orientation);
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return 2;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return 1;
        }
        return (numValueOf != null && numValueOf.intValue() == 0) ? 0 : -1;
    }

    public final void setCurrentSession$vungle_ads_release(SessionData aVar) {
        s.h(aVar, "<set-?>");
        this.currentSession = aVar;
    }

    public final void setEnterBackgroundTime(long j10) {
        this.enterBackgroundTime = j10;
    }

    public final void setEnterForegroundTime(long j10) {
        this.enterForegroundTime = j10;
    }

    public final void setMapOfLastLoadTimes(ConcurrentHashMap<String, Long> concurrentHashMap) {
        s.h(concurrentHashMap, "<set-?>");
        this.mapOfLastLoadTimes = concurrentHashMap;
    }

    public final void setSessionCount(int i10) {
        this.sessionCount = i10;
    }

    public final void setSessionDuration(long j10) {
        this.sessionDuration = j10;
    }

    public final void setSessionSeriesCreatedTime(long j10) {
        this.sessionSeriesCreatedTime = j10;
    }

    public final void updateTemplateSignals(String str) {
        if (str == null || str.length() == 0 || this.currentSession.getSignaledAd().isEmpty()) {
            return;
        }
        this.currentSession.getSignaledAd().get(0).setTemplateSignals(str);
    }

    public static /* synthetic */ void getCurrentSession$vungle_ads_release$annotations() {
    }
}
