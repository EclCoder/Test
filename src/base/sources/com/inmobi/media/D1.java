package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.inmobi.media.D1;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class D1 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1 f24635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f24636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f24637c;

    public D1(Context context) {
        this.f24637c = context;
        Looper mainLooper = Looper.getMainLooper();
        kotlin.jvm.internal.s.g(mainLooper, "getMainLooper(...)");
        this.f24635a = new C1(mainLooper);
    }

    public static final void a(Context context, D1 d10) {
        if (E1.a(context) || d10.f24636b != null) {
            return;
        }
        d10.f24635a.sendEmptyMessageDelayed(1001, 3000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.s.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        WeakReference weakReference = this.f24636b;
        if (!kotlin.jvm.internal.s.c(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f24636b = new WeakReference(activity);
        }
        this.f24635a.removeMessages(1001);
        this.f24635a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.s.h(activity, "activity");
        kotlin.jvm.internal.s.h(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        WeakReference weakReference = this.f24636b;
        if (!kotlin.jvm.internal.s.c(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f24636b = new WeakReference(activity);
        }
        this.f24635a.removeMessages(1001);
        this.f24635a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        WeakReference weakReference = this.f24636b;
        if (kotlin.jvm.internal.s.c(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f24635a.sendEmptyMessageDelayed(1001, 3000L);
            return;
        }
        if (this.f24636b == null) {
            final Context context = this.f24637c;
            Runnable runnable = new Runnable() { // from class: yh.d1
                @Override // java.lang.Runnable
                public final void run() {
                    D1.a(context, this);
                }
            };
            Context context2 = Xi.f26021a;
            kotlin.jvm.internal.s.h(runnable, "runnable");
            Xi.f26027g.submit(runnable);
        }
    }
}
