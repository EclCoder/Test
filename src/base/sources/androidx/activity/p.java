package androidx.activity;

import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.c1;
import androidx.lifecycle.h1;
import androidx.lifecycle.s1;
import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends androidx.core.app.h implements androidx.lifecycle.b0, u1, androidx.lifecycle.q, n4.j, j0, e4.d, f.g, androidx.core.content.d, androidx.core.content.e, androidx.core.app.q, androidx.core.app.r, n0.p, z {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final b Companion = new b(null);
    private t1 _viewModelStore;
    private final f.f activityResultRegistry;
    private int contentLayoutId;
    private final fl.k defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final fl.k fullyDrawnReporter$delegate;
    private boolean hasPictureInPictureSystemFeature;
    private final AtomicInteger nextLocalRequestCode;
    private final fl.k onBackPressedDispatcher$delegate;
    private final fl.k onBackPressedInput$delegate;
    private final CopyOnWriteArrayList<m0.a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<m0.a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<m0.a> onNewIntentListeners;
    private final CopyOnWriteArrayList<m0.a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<m0.a> onPictureInPictureUiStateChangedListeners;
    private final CopyOnWriteArrayList<m0.a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final d reportFullyDrawnExecutor;
    private final n4.i savedStateRegistryController;
    private final e.a contextAwareHelper = new e.a();
    private final n0.s menuHostHelper = new n0.s(new Runnable() { // from class: androidx.activity.c
        @Override // java.lang.Runnable
        public final void run() {
            p.Z(this.f560a);
        }
    });

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements androidx.lifecycle.y {
        a() {
        }

        @Override // androidx.lifecycle.y
        public void c(androidx.lifecycle.b0 source, androidx.lifecycle.s.a event) {
            kotlin.jvm.internal.s.h(source, "source");
            kotlin.jvm.internal.s.h(event, "event");
            p.this.V();
            p.this.getLifecycle().d(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private t1 f600b;

        public final Object a() {
            return this.f599a;
        }

        public final t1 b() {
            return this.f600b;
        }

        public final void c(Object obj) {
            this.f599a = obj;
        }

        public final void d(t1 t1Var) {
            this.f600b = t1Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface d extends Executor {
        void d();

        void m(View view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class e implements d, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f601a = SystemClock.uptimeMillis() + ((long) 10000);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Runnable f602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f603c;

        public e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(e eVar) {
            Runnable runnable = eVar.f602b;
            if (runnable != null) {
                kotlin.jvm.internal.s.e(runnable);
                runnable.run();
                eVar.f602b = null;
            }
        }

        @Override // androidx.activity.p.d
        public void d() {
            p.this.getWindow().getDecorView().removeCallbacks(this);
            p.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            kotlin.jvm.internal.s.h(runnable, "runnable");
            this.f602b = runnable;
            View decorView = p.this.getWindow().getDecorView();
            kotlin.jvm.internal.s.g(decorView, "getDecorView(...)");
            if (!this.f603c) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.e.b(this.f606a);
                    }
                });
            } else if (kotlin.jvm.internal.s.c(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // androidx.activity.p.d
        public void m(View view) {
            kotlin.jvm.internal.s.h(view, "view");
            if (this.f603c) {
                return;
            }
            this.f603c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f602b;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f601a) {
                    this.f603c = false;
                    p.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f602b = null;
            if (p.this.getFullyDrawnReporter().c()) {
                this.f603c = false;
                p.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f extends f.f {
        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void u(f fVar, int i10, g.a.C0582a c0582a) {
            fVar.g(i10, c0582a.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void v(f fVar, int i10, IntentSender.SendIntentException sendIntentException) {
            fVar.f(i10, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }

        @Override // f.f
        public void k(final int i10, g.a contract, Object obj, androidx.core.app.c cVar) {
            Bundle bundleC;
            final int i11;
            kotlin.jvm.internal.s.h(contract, "contract");
            p pVar = p.this;
            final g.a.C0582a c0582aB = contract.b(pVar, obj);
            if (c0582aB != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.f.u(this.f607a, i10, c0582aB);
                    }
                });
                return;
            }
            Intent intentA = contract.a(pVar, obj);
            if (intentA.getExtras() != null) {
                Bundle extras = intentA.getExtras();
                kotlin.jvm.internal.s.e(extras);
                if (extras.getClassLoader() == null) {
                    intentA.setExtrasClassLoader(pVar.getClassLoader());
                }
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleC = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleC = cVar != null ? cVar.c() : null;
            }
            Bundle bundle = bundleC;
            if (kotlin.jvm.internal.s.c("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.f(pVar, stringArrayExtra, i10);
                return;
            }
            if (!kotlin.jvm.internal.s.c("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentA.getAction())) {
                androidx.core.app.b.k(pVar, intentA, i10, bundle);
                return;
            }
            f.h hVar = (f.h) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                kotlin.jvm.internal.s.e(hVar);
                i11 = i10;
                try {
                    androidx.core.app.b.l(pVar, hVar.e(), i11, hVar.a(), hVar.b(), hVar.c(), 0, bundle);
                    fl.g0 g0Var = fl.g0.f38750a;
                } catch (IntentSender.SendIntentException e10) {
                    e = e10;
                    final IntentSender.SendIntentException sendIntentException = e;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            p.f.v(this.f610a, i11, sendIntentException);
                        }
                    });
                }
            } catch (IntentSender.SendIntentException e11) {
                e = e11;
                i11 = i10;
            }
        }
    }

    public p() {
        n4.i iVarB = n4.i.f46841c.b(this);
        this.savedStateRegistryController = iVarB;
        this.reportFullyDrawnExecutor = T();
        this.fullyDrawnReporter$delegate = fl.l.b(new tl.a() { // from class: androidx.activity.g
            @Override // tl.a
            public final Object invoke() {
                return p.W(this.f574a);
            }
        });
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new f();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureUiStateChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput$delegate = fl.l.b(new tl.a() { // from class: androidx.activity.h
            @Override // tl.a
            public final Object invoke() {
                return p.d0(this.f577a);
            }
        });
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new androidx.lifecycle.y() { // from class: androidx.activity.i
            @Override // androidx.lifecycle.y
            public final void c(androidx.lifecycle.b0 b0Var, androidx.lifecycle.s.a aVar) {
                p.N(this.f579a, b0Var, aVar);
            }
        });
        getLifecycle().a(new androidx.lifecycle.y() { // from class: androidx.activity.j
            @Override // androidx.lifecycle.y
            public final void c(androidx.lifecycle.b0 b0Var, androidx.lifecycle.s.a aVar) {
                p.O(this.f590a, b0Var, aVar);
            }
        });
        getLifecycle().a(new a());
        iVarB.c();
        c1.c(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new n4.g.b() { // from class: androidx.activity.k
            @Override // n4.g.b
            public final Bundle a() {
                return p.P(this.f591a);
            }
        });
        addOnContextAvailableListener(new e.b() { // from class: androidx.activity.l
            @Override // e.b
            public final void a(Context context) {
                p.Q(this.f594a, context);
            }
        });
        this.defaultViewModelProviderFactory$delegate = fl.l.b(new tl.a() { // from class: androidx.activity.m
            @Override // tl.a
            public final Object invoke() {
                return p.U(this.f595a);
            }
        });
        this.onBackPressedDispatcher$delegate = fl.l.b(new tl.a() { // from class: androidx.activity.n
            @Override // tl.a
            public final Object invoke() {
                return p.a0(this.f596a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(p pVar, androidx.lifecycle.b0 b0Var, androidx.lifecycle.s.a event) {
        Window window;
        View viewPeekDecorView;
        kotlin.jvm.internal.s.h(b0Var, "<unused var>");
        kotlin.jvm.internal.s.h(event, "event");
        if (event != androidx.lifecycle.s.a.ON_STOP || (window = pVar.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(p pVar, androidx.lifecycle.b0 b0Var, androidx.lifecycle.s.a event) {
        kotlin.jvm.internal.s.h(b0Var, "<unused var>");
        kotlin.jvm.internal.s.h(event, "event");
        if (event == androidx.lifecycle.s.a.ON_DESTROY) {
            pVar.contextAwareHelper.b();
            if (!pVar.isChangingConfigurations()) {
                pVar.getViewModelStore().a();
            }
            pVar.reportFullyDrawnExecutor.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle P(p pVar) {
        Bundle bundle = new Bundle();
        pVar.activityResultRegistry.m(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(p pVar, Context it) {
        kotlin.jvm.internal.s.h(it, "it");
        Bundle bundleA = pVar.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            pVar.activityResultRegistry.l(bundleA);
        }
    }

    private final void R(final i0 i0Var) {
        getLifecycle().a(new androidx.lifecycle.y() { // from class: androidx.activity.f
            @Override // androidx.lifecycle.y
            public final void c(androidx.lifecycle.b0 b0Var, androidx.lifecycle.s.a aVar) {
                p.S(i0Var, this, b0Var, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(i0 i0Var, p pVar, androidx.lifecycle.b0 b0Var, androidx.lifecycle.s.a event) {
        kotlin.jvm.internal.s.h(b0Var, "<unused var>");
        kotlin.jvm.internal.s.h(event, "event");
        if (event == androidx.lifecycle.s.a.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = pVar.getOnBackInvokedDispatcher();
            kotlin.jvm.internal.s.g(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            i0Var.m(onBackInvokedDispatcher);
        }
    }

    private final d T() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h1 U(p pVar) {
        return new h1(pVar.getApplication(), pVar, pVar.getIntent() != null ? pVar.getIntent().getExtras() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V() {
        if (this._viewModelStore == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this._viewModelStore = cVar.b();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new t1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y W(final p pVar) {
        return new y(pVar.reportFullyDrawnExecutor, new tl.a() { // from class: androidx.activity.e
            @Override // tl.a
            public final Object invoke() {
                return p.X(this.f568a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 X(p pVar) {
        pVar.reportFullyDrawn();
        return fl.g0.f38750a;
    }

    private final e4.a Y() {
        return (e4.a) this.onBackPressedInput$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(p pVar) {
        pVar.invalidateMenu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a0(final p pVar) {
        final i0 i0Var = new i0(new Runnable() { // from class: androidx.activity.o
            @Override // java.lang.Runnable
            public final void run() {
                p.b0(this.f597a);
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            if (!kotlin.jvm.internal.s.c(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.c0(this.f561a, i0Var);
                    }
                });
                return i0Var;
            }
            pVar.R(i0Var);
        }
        return i0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(p pVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e10) {
            if (!kotlin.jvm.internal.s.c(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e10;
            }
        } catch (NullPointerException e11) {
            if (!kotlin.jvm.internal.s.c(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e11;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(p pVar, i0 i0Var) {
        pVar.R(i0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e4.a d0(p pVar) {
        e4.a aVar = new e4.a();
        pVar.getNavigationEventDispatcher().c(aVar);
        return aVar;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.s.g(decorView, "getDecorView(...)");
        dVar.m(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // n0.p
    public void addMenuProvider(n0.u provider) {
        kotlin.jvm.internal.s.h(provider, "provider");
        this.menuHostHelper.c(provider);
    }

    @Override // androidx.core.content.d
    public final void addOnConfigurationChangedListener(m0.a listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(e.b listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        this.contextAwareHelper.a(listener);
    }

    @Override // androidx.core.app.q
    public final void addOnMultiWindowModeChangedListener(m0.a listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(m0.a listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // androidx.core.app.r
    public final void addOnPictureInPictureModeChangedListener(m0.a listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    public final void addOnPictureInPictureUiStateChangedListener(m0.a listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        this.onPictureInPictureUiStateChangedListeners.add(listener);
    }

    @Override // androidx.core.content.e
    public final void addOnTrimMemoryListener(m0.a listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    public final void enterPictureInPictureMode(androidx.core.app.v params) {
        kotlin.jvm.internal.s.h(params, "params");
        if (this.hasPictureInPictureSystemFeature) {
            throw null;
        }
    }

    @Override // f.g
    public final f.f getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.q
    public q1.a getDefaultViewModelCreationExtras() {
        q1.d dVar = new q1.d(null, 1, null);
        if (getApplication() != null) {
            dVar.c(s1.a.f4487h, getApplication());
        }
        dVar.c(c1.f4341a, this);
        dVar.c(c1.f4342b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            dVar.c(c1.f4343c, extras);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.q
    public s1.c getDefaultViewModelProviderFactory() {
        return (s1.c) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public y getFullyDrawnReporter() {
        return (y) this.fullyDrawnReporter$delegate.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        c cVar = (c) getLastNonConfigurationInstance();
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    @Override // androidx.core.app.h, androidx.lifecycle.b0
    public androidx.lifecycle.s getLifecycle() {
        return super.getLifecycle();
    }

    public e4.c getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().j();
    }

    @Override // androidx.activity.j0
    public final i0 getOnBackPressedDispatcher() {
        return (i0) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // n4.j
    public final n4.g getSavedStateRegistry() {
        return this.savedStateRegistryController.b();
    }

    @Override // androidx.lifecycle.u1
    public t1 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        V();
        t1 t1Var = this._viewModelStore;
        kotlin.jvm.internal.s.e(t1Var);
        return t1Var;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.s.g(decorView, "getDecorView(...)");
        w1.a(decorView, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.s.g(decorView2, "getDecorView(...)");
        x1.a(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.s.g(decorView3, "getDecorView(...)");
        n4.n.a(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.s.g(decorView4, "getDecorView(...)");
        m0.a(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.s.g(decorView5, "getDecorView(...)");
        l0.a(decorView5, this);
        View decorView6 = getWindow().getDecorView();
        kotlin.jvm.internal.s.g(decorView6, "getDecorView(...)");
        e4.r.a(decorView6, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        if (this.activityResultRegistry.f(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Y().m();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.s.h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<m0.a> it = this.onConfigurationChangedListeners.iterator();
        kotlin.jvm.internal.s.g(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.savedStateRegistryController.d(bundle);
        this.contextAwareHelper.c(this);
        super.onCreate(bundle);
        y0.INSTANCE.c(this);
        int i10 = this.contentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
        this.hasPictureInPictureSystemFeature = getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        kotlin.jvm.internal.s.h(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.menuHostHelper.f(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem item) {
        kotlin.jvm.internal.s.h(item, "item");
        if (super.onMenuItemSelected(i10, item)) {
            return true;
        }
        if (i10 == 0) {
            return this.menuHostHelper.h(item);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<m0.a> it = this.onMultiWindowModeChangedListeners.iterator();
        kotlin.jvm.internal.s.g(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.j(z10));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        kotlin.jvm.internal.s.h(intent, "intent");
        super.onNewIntent(intent);
        Iterator<m0.a> it = this.onNewIntentListeners.iterator();
        kotlin.jvm.internal.s.g(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        kotlin.jvm.internal.s.h(menu, "menu");
        this.menuHostHelper.g(menu);
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<m0.a> it = this.onPictureInPictureModeChangedListeners.iterator();
        kotlin.jvm.internal.s.g(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.u(z10));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureUiStateChanged(PictureInPictureUiState pipState) {
        kotlin.jvm.internal.s.h(pipState, "pipState");
        super.onPictureInPictureUiStateChanged(pipState);
        androidx.core.app.w wVarA = androidx.core.app.w.f3321c.a(pipState);
        Iterator<m0.a> it = this.onPictureInPictureUiStateChangedListeners.iterator();
        kotlin.jvm.internal.s.g(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(wVarA);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        kotlin.jvm.internal.s.h(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.menuHostHelper.i(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.s.h(permissions, "permissions");
        kotlin.jvm.internal.s.h(grantResults, "grantResults");
        if (this.activityResultRegistry.f(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i10, permissions, grantResults);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        t1 t1VarB = this._viewModelStore;
        if (t1VarB == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            t1VarB = cVar.b();
        }
        if (t1VarB == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.c(objOnRetainCustomNonConfigurationInstance);
        cVar2.d(t1VarB);
        return cVar2;
    }

    @Override // androidx.core.app.h, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.s.h(outState, "outState");
        if (getLifecycle() instanceof androidx.lifecycle.f0) {
            androidx.lifecycle.s lifecycle = getLifecycle();
            kotlin.jvm.internal.s.f(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((androidx.lifecycle.f0) lifecycle).p(androidx.lifecycle.s.b.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.e(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<m0.a> it = this.onTrimMemoryListeners.iterator();
        kotlin.jvm.internal.s.g(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        kotlin.jvm.internal.s.g(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.d();
    }

    public final <I, O> f.c registerForActivityResult(g.a contract, f.f registry, f.b callback) {
        kotlin.jvm.internal.s.h(contract, "contract");
        kotlin.jvm.internal.s.h(registry, "registry");
        kotlin.jvm.internal.s.h(callback, "callback");
        return registry.n("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // n0.p
    public void removeMenuProvider(n0.u provider) {
        kotlin.jvm.internal.s.h(provider, "provider");
        this.menuHostHelper.j(provider);
    }

    @Override // androidx.core.content.d
    public final void removeOnConfigurationChangedListener(m0.a listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(e.b listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        this.contextAwareHelper.e(listener);
    }

    @Override // androidx.core.app.q
    public final void removeOnMultiWindowModeChangedListener(m0.a listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(m0.a listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // androidx.core.app.r
    public final void removeOnPictureInPictureModeChangedListener(m0.a listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    public final void removeOnPictureInPictureUiStateChangedListener(m0.a listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        this.onPictureInPictureUiStateChangedListeners.remove(listener);
    }

    @Override // androidx.core.content.e
    public final void removeOnTrimMemoryListener(m0.a listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (s4.a.d()) {
                s4.a.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().b();
        } finally {
            s4.a.b();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.s.g(decorView, "getDecorView(...)");
        dVar.m(decorView);
        super.setContentView(i10);
    }

    public final void setPictureInPictureParams(androidx.core.app.v params) {
        kotlin.jvm.internal.s.h(params, "params");
        if (this.hasPictureInPictureSystemFeature && Build.VERSION.SDK_INT >= 26) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10) {
        kotlin.jvm.internal.s.h(intent, "intent");
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.s.h(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13);
    }

    public void addMenuProvider(n0.u provider, androidx.lifecycle.b0 owner) {
        kotlin.jvm.internal.s.h(provider, "provider");
        kotlin.jvm.internal.s.h(owner, "owner");
        this.menuHostHelper.d(provider, owner);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        kotlin.jvm.internal.s.h(intent, "intent");
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.s.h(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13, bundle);
    }

    @Override // n0.p
    public void addMenuProvider(n0.u provider, androidx.lifecycle.b0 owner, androidx.lifecycle.s.b state) {
        kotlin.jvm.internal.s.h(provider, "provider");
        kotlin.jvm.internal.s.h(owner, "owner");
        kotlin.jvm.internal.s.h(state, "state");
        this.menuHostHelper.e(provider, owner, state);
    }

    public final <I, O> f.c registerForActivityResult(g.a contract, f.b callback) {
        kotlin.jvm.internal.s.h(contract, "contract");
        kotlin.jvm.internal.s.h(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration newConfig) {
        kotlin.jvm.internal.s.h(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<m0.a> it = this.onMultiWindowModeChangedListeners.iterator();
            kotlin.jvm.internal.s.g(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.j(z10, newConfig));
            }
        } catch (Throwable th2) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration newConfig) {
        kotlin.jvm.internal.s.h(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<m0.a> it = this.onPictureInPictureModeChangedListeners.iterator();
            kotlin.jvm.internal.s.g(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.u(z10, newConfig));
            }
        } catch (Throwable th2) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.s.g(decorView, "getDecorView(...)");
        dVar.m(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.s.g(decorView, "getDecorView(...)");
        dVar.m(decorView);
        super.setContentView(view, layoutParams);
    }
}
