package com.vungle.ads.internal.ui;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.AdCantPlayWithoutWebView;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.ConcurrentPlaybackUnsupported;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.VungleError;
import com.vungle.ads.d0;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.model.UnclosedAd;
import com.vungle.ads.internal.presenter.l;
import com.vungle.ads.internal.presenter.n;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.u;
import fl.g0;
import fl.o;
import fl.q;
import fl.r;
import fl.w;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import n0.b0;
import n0.e1;
import n0.k1;
import n0.o1;
import n0.q0;
import re.xQrM.UoyZyZEcGYBpIg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends Activity {
    public static final String AD_INVISIBLE_LOGGED_KEY = "ad_invisible_logged";
    public static final a Companion = new a(null);
    public static final String REQUEST_KEY_EVENT_ID_EXTRA = "request_eventId";
    public static final String REQUEST_KEY_EXTRA = "request";
    private static final String TAG = "AdActivity";
    private static volatile com.vungle.ads.internal.presenter.a eventListener;
    private static volatile com.vungle.ads.internal.g.b pendingData;
    private p logEntry;
    private com.vungle.ads.internal.ui.view.j mraidAdWidget;
    private com.vungle.ads.internal.presenter.g mraidPresenter;
    private UnclosedAd unclosedAd;
    private final u ringerModeReceiver = new u();
    private final C0533b lifeCycleCallback = new C0533b();
    private final AtomicBoolean willPresentInlineInstall = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getEventId(Intent intent) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return extras.getString(b.REQUEST_KEY_EVENT_ID_EXTRA);
                }
            } catch (Exception unused) {
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getPlacement(Intent intent) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return extras.getString(b.REQUEST_KEY_EXTRA);
                }
            } catch (Exception unused) {
            }
            return null;
        }

        public final Intent createIntent(Context context, String placement, String str) {
            s.h(placement, "placement");
            Intent intent = new Intent(context, (Class<?>) VungleActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            Bundle bundle = new Bundle();
            bundle.putString(b.REQUEST_KEY_EXTRA, placement);
            bundle.putString(b.REQUEST_KEY_EVENT_ID_EXTRA, str);
            intent.putExtras(bundle);
            return intent;
        }

        public final com.vungle.ads.internal.presenter.a getEventListener$vungle_ads_release() {
            return b.eventListener;
        }

        public final com.vungle.ads.internal.g.b getPendingData$vungle_ads_release() {
            return b.pendingData;
        }

        public final void setEventListener$vungle_ads_release(com.vungle.ads.internal.presenter.a aVar) {
            b.eventListener = aVar;
        }

        public final void setPendingData$vungle_ads_release(com.vungle.ads.internal.g.b bVar) {
            b.pendingData = bVar;
        }

        private a() {
        }

        public static /* synthetic */ void getREQUEST_KEY_EVENT_ID_EXTRA$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getREQUEST_KEY_EXTRA$vungle_ads_release$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class c extends t implements tl.a {
        final /* synthetic */ Intent $data;
        final /* synthetic */ int $requestCode;
        final /* synthetic */ int $resultCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, int i11, Intent intent) {
            super(0);
            this.$requestCode = i10;
            this.$resultCode = i11;
            this.$data = intent;
        }

        @Override // tl.a
        public final String invoke() {
            return "onActivityResult: " + this.$requestCode + ", " + this.$resultCode + ", " + this.$data;
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

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.b, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.signals.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.signals.b.class);
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

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.f, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.platform.f invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.platform.f.class);
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

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.d$b, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.omsdk.d.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.omsdk.d.b.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class h implements com.vungle.ads.internal.ui.view.j.a {
        final /* synthetic */ fl.k $signalManager$delegate;

        h(fl.k kVar) {
            this.$signalManager$delegate = kVar;
        }

        @Override // com.vungle.ads.internal.ui.view.j.a
        public void close() throws Throwable {
            com.vungle.ads.internal.presenter.g mraidPresenter$vungle_ads_release = b.this.getMraidPresenter$vungle_ads_release();
            Long viewStatus = mraidPresenter$vungle_ads_release != null ? mraidPresenter$vungle_ads_release.getViewStatus() : null;
            if (viewStatus != null) {
                com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, Sdk$SDKMetric.b.AD_CLOSED_BEFORE_IMPRESSION, viewStatus.longValue(), b.this.logEntry, null, 8, null);
            }
            UnclosedAd nVar = b.this.unclosedAd;
            if (nVar != null) {
                b.m149onCreate$lambda1(this.$signalManager$delegate).removeUnclosedAd(nVar);
            }
            b.this.finish();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class i implements com.vungle.ads.internal.ui.view.j.d {
        i() {
        }

        @Override // com.vungle.ads.internal.ui.view.j.d
        public boolean onTouch(MotionEvent motionEvent) {
            com.vungle.ads.internal.presenter.g mraidPresenter$vungle_ads_release = b.this.getMraidPresenter$vungle_ads_release();
            if (mraidPresenter$vungle_ads_release == null) {
                return false;
            }
            mraidPresenter$vungle_ads_release.onViewTouched(motionEvent);
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class j implements com.vungle.ads.internal.ui.view.j.e {
        j() {
        }

        @Override // com.vungle.ads.internal.ui.view.j.e
        public void setOrientation(int i10) {
            b.this.setRequestedOrientation(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class k implements l {
        k() {
        }

        @Override // com.vungle.ads.internal.presenter.l
        public q openInlineInstall(Intent intent) {
            Object objB;
            s.h(intent, "intent");
            b bVar = b.this;
            try {
                r.a aVar = r.f38769b;
                bVar.willPresentInlineInstall.set(true);
                bVar.startActivityForResult(intent, 10001);
                objB = r.b(g0.f38750a);
            } catch (Throwable th2) {
                r.a aVar2 = r.f38769b;
                objB = r.b(fl.s.a(th2));
            }
            b bVar2 = b.this;
            Throwable thE = r.e(objB);
            if (thE == null) {
                return new q(Boolean.TRUE, null);
            }
            bVar2.willPresentInlineInstall.set(false);
            return new q(Boolean.FALSE, thE.getLocalizedMessage());
        }
    }

    public static /* synthetic */ void getMraidAdWidget$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMraidPresenter$vungle_ads_release$annotations() {
    }

    private final void hideSystemUi() {
        o1 o1VarA = e1.a(getWindow(), getWindow().getDecorView());
        s.g(o1VarA, "getInsetsController(window, window.decorView)");
        o1VarA.e(2);
        o1VarA.a(k1.s.g());
    }

    private final void onConcurrentPlaybackError(String str, String str2) {
        VungleError vungleErrorLogError$vungle_ads_release = new ConcurrentPlaybackUnsupported("Trying to show " + str + " but " + str2 + " is already showing").setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release();
        com.vungle.ads.internal.presenter.a aVar = eventListener;
        if (aVar != null) {
            aVar.onError(vungleErrorLogError$vungle_ads_release, str);
        }
        com.vungle.ads.internal.util.q.Companion.e(TAG, "onConcurrentPlaybackError: " + vungleErrorLogError$vungle_ads_release.getLocalizedMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-1, reason: not valid java name */
    public static final com.vungle.ads.internal.signals.b m149onCreate$lambda1(fl.k kVar) {
        return (com.vungle.ads.internal.signals.b) kVar.getValue();
    }

    /* JADX INFO: renamed from: onCreate$lambda-5, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.a m150onCreate$lambda5(fl.k kVar) {
        return (com.vungle.ads.internal.executor.a) kVar.getValue();
    }

    /* JADX INFO: renamed from: onCreate$lambda-6, reason: not valid java name */
    private static final com.vungle.ads.internal.platform.f m151onCreate$lambda6(fl.k kVar) {
        return (com.vungle.ads.internal.platform.f) kVar.getValue();
    }

    /* JADX INFO: renamed from: onCreate$lambda-7, reason: not valid java name */
    private static final com.vungle.ads.internal.omsdk.d.b m152onCreate$lambda7(fl.k kVar) {
        return (com.vungle.ads.internal.omsdk.d.b) kVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-9, reason: not valid java name */
    public static final k1 m153onCreate$lambda9(b this$0, View v10, k1 insets) {
        s.h(this$0, "this$0");
        s.h(v10, "v");
        s.h(insets, "insets");
        if (!this$0.willPresentInlineInstall.get()) {
            e0.b bVarG = insets.g(k1.s.g() | k1.s.a());
            s.g(bVarG, "insets.getInsets(\n      …t()\n                    )");
            v10.setPadding(bVarG.f37000a, bVarG.f37001b, bVarG.f37002c, bVarG.f37003d);
        }
        return insets;
    }

    public boolean canRotate$vungle_ads_release() {
        return false;
    }

    public final com.vungle.ads.internal.ui.view.j getMraidAdWidget$vungle_ads_release() {
        return this.mraidAdWidget;
    }

    public final com.vungle.ads.internal.presenter.g getMraidPresenter$vungle_ads_release() {
        return this.mraidPresenter;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        com.vungle.ads.internal.util.q.Companion.w(TAG, new c(i10, i11, intent));
        if (i10 == 10001) {
            this.willPresentInlineInstall.set(false);
            com.vungle.ads.internal.presenter.g gVar = this.mraidPresenter;
            if (gVar != null) {
                gVar.logInlineInstallSuccess$vungle_ads_release("onActivityResultCode=" + i11);
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.vungle.ads.internal.presenter.g gVar = this.mraidPresenter;
        if (gVar != null) {
            gVar.handleExit();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        s.h(newConfig, "newConfig");
        try {
            super.onConfigurationChanged(newConfig);
            int i10 = newConfig.orientation;
            if (i10 == 2) {
                com.vungle.ads.internal.util.q.Companion.d(TAG, "landscape");
            } else if (i10 == 1) {
                com.vungle.ads.internal.util.q.Companion.d(TAG, "portrait");
            }
            com.vungle.ads.internal.presenter.g gVar = this.mraidPresenter;
            if (gVar != null) {
                gVar.onViewConfigurationChanged();
            }
        } catch (Exception e10) {
            com.vungle.ads.internal.util.q.Companion.e(TAG, "onConfigurationChanged: " + e10.getLocalizedMessage());
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        com.vungle.ads.internal.presenter.g gVar = this.mraidPresenter;
        if (gVar != null) {
            gVar.detach((isChangingConfigurations() ? 1 : 0) | 2);
        }
        com.vungle.ads.internal.presenter.g gVar2 = this.mraidPresenter;
        if (gVar2 != null) {
            gVar2.setOpenActivityDelegate$vungle_ads_release(null);
        }
        com.vungle.ads.internal.util.a.Companion.removeLifecycleListener(this.lifeCycleCallback);
        try {
            r.a aVar = r.f38769b;
            unregisterReceiver(this.ringerModeReceiver);
            r.b(g0.f38750a);
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            r.b(fl.s.a(th2));
        }
        this.mraidPresenter = null;
        eventListener = null;
        pendingData = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        s.h(intent, "intent");
        super.onNewIntent(intent);
        a aVar = Companion;
        Intent intent2 = getIntent();
        s.g(intent2, "getIntent()");
        q qVarA = w.a(aVar.getPlacement(intent2), aVar.getPlacement(intent));
        String str = (String) qVarA.d();
        String str2 = (String) qVarA.g();
        Intent intent3 = getIntent();
        s.g(intent3, "getIntent()");
        q qVarA2 = w.a(aVar.getEventId(intent3), aVar.getEventId(intent));
        String str3 = (String) qVarA2.d();
        String str4 = (String) qVarA2.g();
        if ((str == null || str2 == null || s.c(str, str2)) && (str3 == null || str4 == null || s.c(str3, str4))) {
            return;
        }
        com.vungle.ads.internal.util.q.Companion.d(TAG, "Tried to play another placement " + str2 + " while playing " + str);
        onConcurrentPlaybackError(str2, str);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        com.vungle.ads.internal.presenter.g gVar = this.mraidPresenter;
        if (gVar != null) {
            gVar.stop();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        com.vungle.ads.internal.presenter.g gVar = this.mraidPresenter;
        if (gVar != null) {
            gVar.start();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            hideSystemUi();
        }
    }

    public final void setMraidAdWidget$vungle_ads_release(com.vungle.ads.internal.ui.view.j jVar) {
        this.mraidAdWidget = jVar;
    }

    public final void setMraidPresenter$vungle_ads_release(com.vungle.ads.internal.presenter.g gVar) {
        this.mraidPresenter = gVar;
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i10) {
        if (canRotate$vungle_ads_release()) {
            super.setRequestedOrientation(i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.app.Activity, android.content.Context, com.vungle.ads.internal.ui.b] */
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
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) throws Throwable {
        long j10;
        UnclosedAd nVar;
        String watermark$vungle_ads_release;
        View decorView;
        FrameLayout frameLayout;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(C.DEFAULT_MUXED_BUFFER_SIZE, C.DEFAULT_MUXED_BUFFER_SIZE);
        com.vungle.ads.internal.g.b bVar = pendingData;
        com.vungle.ads.internal.presenter.a aVar = eventListener;
        if (bVar == null) {
            a aVar2 = Companion;
            Intent intent = getIntent();
            s.g(intent, "intent");
            String placement = aVar2.getPlacement(intent);
            if (placement == null) {
                placement = "";
            }
            if (aVar != null) {
                aVar.onError(new AdNotLoadedCantPlay(UoyZyZEcGYBpIg.eQOPbJkKNT + placement + " pendingData is null").setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release(), placement);
            }
            finish();
            return;
        }
        com.vungle.ads.internal.model.b adPayload = bVar.getAdPayload();
        Placement placement2 = bVar.getPlacement();
        n presenterDelegate = bVar.getPresenterDelegate();
        this.logEntry = adPayload.getLogEntry();
        try {
            com.vungle.ads.internal.ui.view.j jVar = new com.vungle.ads.internal.ui.view.j(this, adPayload.eventId());
            e1.b(getWindow(), false);
            if (getIntent().getBooleanExtra(AD_INVISIBLE_LOGGED_KEY, false)) {
                j10 = 3;
            } else {
                j10 = 2;
            }
            com.vungle.ads.g gVar = com.vungle.ads.g.INSTANCE;
            d0 d0Var = new d0(Sdk$SDKMetric.b.AD_VISIBILITY);
            d0Var.setValue(Long.valueOf(j10));
            com.vungle.ads.g.logMetric$vungle_ads_release$default(gVar, d0Var, this.logEntry, (String) null, 4, (Object) null);
            com.vungle.ads.internal.util.q.Companion.d(TAG, "Log metric AD_VISIBILITY: " + j10);
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            o oVar = o.SYNCHRONIZED;
            fl.k kVarA = fl.l.a(oVar, new d(this));
            a aVar3 = Companion;
            Intent intent2 = getIntent();
            s.g(intent2, "intent");
            String eventId = aVar3.getEventId(intent2);
            ?? r10 = 0;
            r10 = 0;
            if (eventId != null) {
                nVar = new UnclosedAd(eventId, (String) r10, 2, (DefaultConstructorMarker) r10);
            } else {
                nVar = null;
            }
            this.unclosedAd = nVar;
            if (nVar != null) {
                m149onCreate$lambda1(kVarA).recordUnclosedAd(nVar);
            }
            jVar.setCloseDelegate(new h(kVarA));
            jVar.setOnViewTouchListener(new i());
            jVar.setOrientationDelegate(new j());
            fl.k kVarA2 = fl.l.a(oVar, new e(this));
            fl.k kVarA3 = fl.l.a(oVar, new f(this));
            com.vungle.ads.internal.ui.i orCreateWebViewClient = com.vungle.ads.internal.presenter.o.INSTANCE.getOrCreateWebViewClient(adPayload, placement2, m150onCreate$lambda5(kVarA2).getOffloadExecutor(), m151onCreate$lambda6(kVarA3));
            com.vungle.ads.internal.omsdk.d dVarMake = m152onCreate$lambda7(fl.l.a(oVar, new g(this))).make(adPayload.omEnabled());
            com.vungle.ads.internal.executor.i jobExecutor = m150onCreate$lambda5(kVarA2).getJobExecutor();
            orCreateWebViewClient.setWebViewObserver(dVarMake);
            this.ringerModeReceiver.setListener(orCreateWebViewClient);
            com.vungle.ads.internal.presenter.g gVar2 = new com.vungle.ads.internal.presenter.g(jVar, adPayload, placement2, orCreateWebViewClient, jobExecutor, dVarMake, m151onCreate$lambda6(kVarA3));
            gVar2.setEventListener(aVar);
            gVar2.setPresenterDelegate$vungle_ads_release(presenterDelegate);
            gVar2.setOpenActivityDelegate$vungle_ads_release(new k());
            gVar2.prepare();
            setContentView(jVar, jVar.getLayoutParams());
            try {
                r.a aVar4 = r.f38769b;
                getWindow().getDecorView().setBackgroundColor(-16777216);
                r.b(g0.f38750a);
            } catch (Throwable th2) {
                r.a aVar5 = r.f38769b;
                r.b(fl.s.a(th2));
            }
            q0.w0(jVar, new b0() { // from class: com.vungle.ads.internal.ui.a
                @Override // n0.b0
                public final k1 a(View view, k1 k1Var) {
                    return b.m153onCreate$lambda9(this.f35857a, view, k1Var);
                }
            });
            hideSystemUi();
            com.vungle.ads.b adConfig = adPayload.getAdConfig();
            if (adConfig != null && (watermark$vungle_ads_release = adConfig.getWatermark$vungle_ads_release()) != null) {
                Window window = getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    frameLayout = (FrameLayout) decorView.findViewById(R.id.content);
                }
                if (r10 != 0) {
                    r10 = frameLayout;
                    com.vungle.ads.internal.ui.j jVar2 = new com.vungle.ads.internal.ui.j(this, watermark$vungle_ads_release);
                    r10.addView(jVar2);
                    jVar2.bringToFront();
                }
            }
            r10 = frameLayout;
            this.mraidAdWidget = jVar;
            this.mraidPresenter = gVar2;
            com.vungle.ads.internal.util.a.Companion.addLifecycleListener(this.lifeCycleCallback);
            try {
                r.b(registerReceiver(this.ringerModeReceiver, new IntentFilter("android.media.RINGER_MODE_CHANGED")));
            } catch (Throwable th3) {
                r.a aVar6 = r.f38769b;
                r.b(fl.s.a(th3));
            }
        } catch (InstantiationException e10) {
            if (aVar != null) {
                aVar.onError(new AdCantPlayWithoutWebView(e10.getMessage()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release(), placement2.getReferenceId());
            }
            finish();
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.ui.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class C0533b extends com.vungle.ads.internal.util.a.b {
        C0533b() {
        }

        @Override // com.vungle.ads.internal.util.a.b
        public void onBackground() throws Throwable {
            com.vungle.ads.internal.presenter.g mraidPresenter$vungle_ads_release = b.this.getMraidPresenter$vungle_ads_release();
            Long viewStatus = mraidPresenter$vungle_ads_release != null ? mraidPresenter$vungle_ads_release.getViewStatus() : null;
            com.vungle.ads.internal.util.q.Companion.d(b.TAG, "App is in background, status: " + viewStatus);
            if (viewStatus != null) {
                com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, Sdk$SDKMetric.b.AD_BACKGROUND_BEFORE_IMPRESSION, viewStatus.longValue(), b.this.logEntry, null, 8, null);
            }
        }

        @Override // com.vungle.ads.internal.util.a.b
        public void onForeground() {
        }
    }
}
