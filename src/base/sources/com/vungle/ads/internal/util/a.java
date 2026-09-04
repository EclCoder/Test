package com.vungle.ads.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import fl.g0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a implements Application.ActivityLifecycleCallbacks {
    private static final String TAG = "ActivityManager";
    private volatile int foregroundActivityCount;
    private volatile boolean isAppInForeground;
    private volatile c targetActivityInfo;
    public static final C0535a Companion = new C0535a(null);
    private static final a instance = new a();
    private final AtomicBoolean isInitialized = new AtomicBoolean(false);
    private final CopyOnWriteArraySet<b> callbacks = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: com.vungle.ads.internal.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0535a {
        public /* synthetic */ C0535a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addLifecycleListener(b listener) {
            kotlin.jvm.internal.s.h(listener, "listener");
            getInstance$vungle_ads_release().addListener(listener);
        }

        public final void deInit$vungle_ads_release(Context context) {
            kotlin.jvm.internal.s.h(context, "context");
            getInstance$vungle_ads_release().deInit(context);
        }

        public final a getInstance$vungle_ads_release() {
            return a.instance;
        }

        public final void init(Context context) {
            kotlin.jvm.internal.s.h(context, "context");
            getInstance$vungle_ads_release().init(context);
        }

        public final boolean isForeground() {
            return getInstance$vungle_ads_release().isAppInForeground();
        }

        public final void removeLifecycleListener(b listener) {
            kotlin.jvm.internal.s.h(listener, "listener");
            getInstance$vungle_ads_release().removeListener(listener);
        }

        public final boolean startWhenForeground(Context context, Intent intent, Intent intent2, com.vungle.ads.internal.ui.c cVar) {
            kotlin.jvm.internal.s.h(context, "context");
            if (isForeground()) {
                return getInstance$vungle_ads_release().startActivitySafely(context, intent, intent2, cVar);
            }
            getInstance$vungle_ads_release().targetActivityInfo = new c(new WeakReference(context), intent, intent2, cVar);
            return false;
        }

        private C0535a() {
        }

        public static /* synthetic */ void getInstance$vungle_ads_release$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c {
        private final com.vungle.ads.internal.ui.c adOpenCallback;
        private final WeakReference<Context> context;
        private final Intent deepLinkOverrideIntent;
        private final Intent defaultIntent;

        public c(WeakReference<Context> context, Intent intent, Intent intent2, com.vungle.ads.internal.ui.c cVar) {
            kotlin.jvm.internal.s.h(context, "context");
            this.context = context;
            this.deepLinkOverrideIntent = intent;
            this.defaultIntent = intent2;
            this.adOpenCallback = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c copy$default(c cVar, WeakReference weakReference, Intent intent, Intent intent2, com.vungle.ads.internal.ui.c cVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = cVar.context;
            }
            if ((i10 & 2) != 0) {
                intent = cVar.deepLinkOverrideIntent;
            }
            if ((i10 & 4) != 0) {
                intent2 = cVar.defaultIntent;
            }
            if ((i10 & 8) != 0) {
                cVar2 = cVar.adOpenCallback;
            }
            return cVar.copy(weakReference, intent, intent2, cVar2);
        }

        public final WeakReference<Context> component1() {
            return this.context;
        }

        public final Intent component2() {
            return this.deepLinkOverrideIntent;
        }

        public final Intent component3() {
            return this.defaultIntent;
        }

        public final com.vungle.ads.internal.ui.c component4() {
            return this.adOpenCallback;
        }

        public final c copy(WeakReference<Context> context, Intent intent, Intent intent2, com.vungle.ads.internal.ui.c cVar) {
            kotlin.jvm.internal.s.h(context, "context");
            return new c(context, intent, intent2, cVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.s.c(this.context, cVar.context) && kotlin.jvm.internal.s.c(this.deepLinkOverrideIntent, cVar.deepLinkOverrideIntent) && kotlin.jvm.internal.s.c(this.defaultIntent, cVar.defaultIntent) && kotlin.jvm.internal.s.c(this.adOpenCallback, cVar.adOpenCallback);
        }

        public final com.vungle.ads.internal.ui.c getAdOpenCallback() {
            return this.adOpenCallback;
        }

        public final WeakReference<Context> getContext() {
            return this.context;
        }

        public final Intent getDeepLinkOverrideIntent() {
            return this.deepLinkOverrideIntent;
        }

        public final Intent getDefaultIntent() {
            return this.defaultIntent;
        }

        public int hashCode() {
            int iHashCode = this.context.hashCode() * 31;
            Intent intent = this.deepLinkOverrideIntent;
            int iHashCode2 = (iHashCode + (intent == null ? 0 : intent.hashCode())) * 31;
            Intent intent2 = this.defaultIntent;
            int iHashCode3 = (iHashCode2 + (intent2 == null ? 0 : intent2.hashCode())) * 31;
            com.vungle.ads.internal.ui.c cVar = this.adOpenCallback;
            return iHashCode3 + (cVar != null ? cVar.hashCode() : 0);
        }

        public String toString() {
            return "TargetActivityInfo(context=" + this.context + ", deepLinkOverrideIntent=" + this.deepLinkOverrideIntent + ", defaultIntent=" + this.defaultIntent + ", adOpenCallback=" + this.adOpenCallback + ')';
        }
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addListener(b bVar) {
        this.callbacks.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deInit(Context context) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.s.f(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        this.isInitialized.set(false);
        this.targetActivityInfo = null;
        this.foregroundActivityCount = 0;
        this.isAppInForeground = false;
        this.callbacks.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void init(Context context) {
        Object objB;
        if (this.isInitialized.getAndSet(true)) {
            return;
        }
        try {
            fl.r.a aVar = fl.r.f38769b;
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.s.f(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            objB = fl.r.b(g0.f38750a);
        } catch (Throwable th2) {
            fl.r.a aVar2 = fl.r.f38769b;
            objB = fl.r.b(fl.s.a(th2));
        }
        Throwable thE = fl.r.e(objB);
        if (thE != null) {
            q.Companion.e(TAG, "Error initializing ActivityManager", thE);
            this.isInitialized.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAppInForeground() {
        return !this.isInitialized.get() || this.isAppInForeground;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean startActivitySafely(Context context, Intent intent, Intent intent2, com.vungle.ads.internal.ui.c cVar) {
        try {
            if (intent == null) {
                if (intent2 != null) {
                    context.startActivity(intent2);
                }
                return false;
            }
            context.startActivity(intent);
            if (cVar != null) {
                cVar.onDeeplinkClick(true);
            }
            return true;
        } catch (Exception e10) {
            q.Companion.e(TAG, "Failed to start activity: " + e10);
            if (intent != null && cVar != null) {
                try {
                    cVar.onDeeplinkClick(false);
                    if (intent != null) {
                        context.startActivity(intent2);
                        return true;
                    }
                } catch (Exception unused) {
                }
            } else if (intent != null && intent2 != null) {
                context.startActivity(intent2);
                return true;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.s.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        Iterator<T> it = this.callbacks.iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        Iterator<T> it = this.callbacks.iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.s.h(activity, "activity");
        kotlin.jvm.internal.s.h(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        this.foregroundActivityCount++;
        if (this.isAppInForeground || this.foregroundActivityCount != 1) {
            return;
        }
        this.isAppInForeground = true;
        c cVar = this.targetActivityInfo;
        if (cVar != null) {
            Context it = cVar.getContext().get();
            if (it != null) {
                C0535a c0535a = Companion;
                kotlin.jvm.internal.s.g(it, "it");
                c0535a.startWhenForeground(it, cVar.getDeepLinkOverrideIntent(), cVar.getDefaultIntent(), cVar.getAdOpenCallback());
            }
            this.targetActivityInfo = null;
        }
        Iterator<T> it2 = this.callbacks.iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).onForeground();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        this.foregroundActivityCount--;
        if (this.isAppInForeground && this.foregroundActivityCount == 0) {
            this.isAppInForeground = false;
            Iterator<T> it = this.callbacks.iterator();
            while (it.hasNext()) {
                ((b) it.next()).onBackground();
            }
        }
    }

    public final void removeListener(b callback) {
        kotlin.jvm.internal.s.h(callback, "callback");
        this.callbacks.remove(callback);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.s.h(activity, "activity");
        }

        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.s.h(activity, "activity");
        }

        public void onBackground() {
        }

        public void onForeground() {
        }
    }
}
