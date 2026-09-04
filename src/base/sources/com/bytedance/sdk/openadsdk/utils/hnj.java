package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.inmobi.media.core.config.models.CrashConfig;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public static long f14641hn = 0;
    public static boolean hnj = false;
    public static long qor;
    private final gjv aq;
    private volatile WeakReference<Activity> mjg;
    private final gjv ojm;
    private final AtomicBoolean gjv = new AtomicBoolean(false);

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final RunnableC0255hnj f14643sk = new RunnableC0255hnj();
    private final dkl dkl = new dkl();
    private final sk dse = new sk();

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private int f14644ta = 0;
    private volatile CopyOnWriteArrayList<WeakReference<com.bytedance.sdk.component.adexpress.hnj>> dnm = new CopyOnWriteArrayList<>();
    private HandlerThread bug = null;
    private Handler orl = null;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private final LinkedList<Activity> f14642fc = new LinkedList<>();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class dkl implements Runnable {
        dkl() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.fc.hn().removeMessages(1001);
            com.bytedance.sdk.openadsdk.core.oj.hnj();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class dse implements Runnable {
        private boolean gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private long f14646hn;
        private long qor;

        public dse(long j10, long j11, boolean z10) {
            this.f14646hn = j10;
            this.qor = j11;
            this.gjv = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.gjv) {
                com.bytedance.sdk.openadsdk.jip.gjv.hnj().hnj(this.f14646hn / 1000, this.qor / 1000);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class gjv implements Runnable {
        private gjv() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.gjv.hnj.ta taVarXw = com.bytedance.sdk.openadsdk.core.settings.dnm.hn().xw();
            if (taVarXw == null || taVarXw.hnj() || !com.bytedance.sdk.component.utils.oj.aq(com.bytedance.sdk.openadsdk.core.oj.hnj())) {
                return;
            }
            com.bytedance.sdk.openadsdk.gjv.hnj.hn.hnj(com.bytedance.sdk.openadsdk.core.orl.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hn extends gjv {
        private hn() {
            super();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.hnj.gjv, java.lang.Runnable
        public void run() {
            super.run();
            com.bytedance.sdk.openadsdk.dkl.hn.hnj().hn();
            com.bytedance.sdk.openadsdk.utils.sk.hn();
            com.bytedance.sdk.openadsdk.component.dse.hnj.hnj(3);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class RunnableC0255hnj implements Runnable {
        RunnableC0255hnj() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ua.hn(new com.bytedance.sdk.component.aq.hn.qor("reportPvFromBackGround") { // from class: com.bytedance.sdk.openadsdk.utils.hnj.hnj.1
                @Override // java.lang.Runnable
                public void run() {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class qor extends gjv {
        private qor() {
            super();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.hnj.gjv, java.lang.Runnable
        public void run() {
            super.run();
            com.bytedance.sdk.openadsdk.utils.sk.hnj();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class sk implements Runnable {
        sk() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ApmHelper.isIsInit()) {
                Handler handlerHn = com.bytedance.sdk.openadsdk.core.fc.hn();
                Message messageObtain = Message.obtain(handlerHn, hnj.this.f14643sk);
                messageObtain.what = 1001;
                handlerHn.sendMessageDelayed(messageObtain, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
            }
        }
    }

    public hnj() {
        this.aq = new hn();
        this.ojm = new qor();
        qor();
    }

    private void qor() {
        this.bug = com.bytedance.sdk.component.utils.aq.hnj("lifecycle", 10);
        this.orl = new Handler(this.bug.getLooper());
    }

    public boolean hn(com.bytedance.sdk.component.adexpress.hnj hnjVar) {
        return this.dnm.remove(new WeakReference(hnjVar));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f14642fc.addFirst(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.dnm != null && this.dnm.size() > 0) {
            for (WeakReference<com.bytedance.sdk.component.adexpress.hnj> weakReference : this.dnm) {
                if (weakReference != null && weakReference.get() != null) {
                    try {
                        weakReference.get().hnj(activity);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (this.mjg != null && this.mjg.get() == activity) {
            this.mjg = null;
        }
        this.f14642fc.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        int i10 = this.f14644ta - 1;
        this.f14644ta = i10;
        if (i10 < 0) {
            this.f14644ta = 0;
        }
        if (ApmHelper.isIsInit()) {
            hnj(this.dse);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        hnj(this.dkl);
        if (!hnj) {
            f14641hn = System.currentTimeMillis();
            hnj = true;
        }
        this.mjg = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(final Activity activity) {
        Window window;
        try {
            if (sq.hn() && (window = activity.getWindow()) != null) {
                final View decorView = window.getDecorView();
                if (!decorView.isAttachedToWindow()) {
                    decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.hnj.1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View view) {
                            decorView.removeOnAttachStateChangeListener(this);
                            if (sq.gjv(activity)) {
                                sq.hnj(true);
                            }
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View view) {
                            decorView.removeOnAttachStateChangeListener(this);
                        }
                    });
                } else if (sq.gjv(activity)) {
                    sq.hnj(true);
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.hnj("TTAD.ActivityLifecycle", th2);
        }
        this.f14644ta++;
        if (this.gjv.get()) {
            this.orl.removeCallbacks(this.ojm);
            this.orl.removeCallbacks(this.aq);
            hnj(this.ojm);
        }
        this.gjv.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.f14644ta <= 0) {
            this.gjv.set(true);
        }
        if (hnj()) {
            hnj = false;
            com.bytedance.sdk.openadsdk.core.fc.f13727hn.set(false);
            qor = System.currentTimeMillis();
            this.orl.removeCallbacks(this.ojm);
            this.orl.removeCallbacks(this.aq);
            hnj(this.aq);
        }
        hnj(new dse(f14641hn, qor, hnj()));
    }

    private void hnj(Runnable runnable) {
        if (!this.bug.isAlive()) {
            qor();
        }
        this.orl.postDelayed(runnable, 1000L);
    }

    public Activity hn() {
        if (this.f14642fc.isEmpty()) {
            return null;
        }
        return this.f14642fc.getFirst();
    }

    public void hnj(com.bytedance.sdk.component.adexpress.hnj hnjVar) {
        this.dnm.add(new WeakReference<>(hnjVar));
    }

    public boolean hnj() {
        return this.gjv.get();
    }

    public boolean hnj(boolean z10) {
        Window window;
        if (this.mjg == null) {
            return z10;
        }
        try {
            Activity activity = this.mjg.get();
            if (activity != null && (window = activity.getWindow()) != null) {
                return window.getDecorView().hasWindowFocus();
            }
            return z10;
        } catch (Throwable unused) {
            return z10;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
