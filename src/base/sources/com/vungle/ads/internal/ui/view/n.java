package com.vungle.ads.internal.ui.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.vungle.ads.NativeVideoPlaybackError;
import com.vungle.ads.e0;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.internal.util.r;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.z;
import fl.g0;
import fl.w;
import gl.l0;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import o4.Wz.OGoz;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends h implements zj.a, zj.b, r {
    public static final a Companion = new a(null);
    private static final String TAG = "NativeAd-VideoContentView";
    private final b activityLifecycle;
    private WeakReference<Activity> adActivity;
    private final AtomicBoolean cp100Fired;
    private final AtomicBoolean cp25Fired;
    private final AtomicBoolean cp50Fired;
    private final AtomicBoolean cp75Fired;
    private final AtomicBoolean ignoredFirst;
    private final AtomicBoolean isReceiverRegistered;
    private ImageView muteView;
    private final e0 preparedDurationMetric;
    private final u ringerModeReceiver;
    private final AtomicBoolean startFired;
    private final AtomicBoolean videoErrorHandled;
    private g videoView;

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
    public static final class b extends com.vungle.ads.internal.util.a.b {
        b() {
        }

        @Override // com.vungle.ads.internal.util.a.b
        public void onActivityPaused(Activity activity) {
            s.h(activity, "activity");
            WeakReference weakReference = n.this.adActivity;
            if (s.c(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
                q.Companion.d(n.TAG, "onActivityPaused and pause video");
                g videoView = n.this.getVideoView();
                if (videoView != null) {
                    videoView.pauseOnActivityPaused$vungle_ads_release();
                }
            }
        }

        @Override // com.vungle.ads.internal.util.a.b
        public void onActivityResumed(Activity activity) {
            s.h(activity, "activity");
            WeakReference weakReference = n.this.adActivity;
            if (s.c(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
                q.Companion.d(n.TAG, "onActivityResumed and try to play video");
                g videoView = n.this.getVideoView();
                if (videoView != null) {
                    videoView.playOnActivityResumed$vungle_ads_release();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, com.vungle.ads.internal.l internal) {
        super(context, internal);
        s.h(context, "context");
        s.h(internal, "internal");
        this.startFired = new AtomicBoolean(false);
        this.cp25Fired = new AtomicBoolean(false);
        this.cp50Fired = new AtomicBoolean(false);
        this.cp75Fired = new AtomicBoolean(false);
        this.cp100Fired = new AtomicBoolean(false);
        this.videoErrorHandled = new AtomicBoolean(false);
        this.preparedDurationMetric = new e0(Sdk$SDKMetric.b.NATIVE_VIDEO_PREPARE_DURATION_MS);
        this.ringerModeReceiver = new u();
        this.isReceiverRegistered = new AtomicBoolean(false);
        this.ignoredFirst = new AtomicBoolean(false);
        this.activityLifecycle = new b();
    }

    private final Activity getAdActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            s.g(context, "ctx.baseContext");
        }
        return null;
    }

    public static /* synthetic */ void getVideoView$annotations() {
    }

    private final void onMuteUpdateUI(boolean z10) {
        if (z10) {
            ImageView imageView = this.muteView;
            if (imageView != null) {
                imageView.setImageResource(z.liftoff_icon_mute);
                return;
            }
            return;
        }
        ImageView imageView2 = this.muteView;
        if (imageView2 != null) {
            imageView2.setImageResource(z.liftoff_icon_unmute);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: render$lambda-5, reason: not valid java name */
    public static final void m168render$lambda5(n this$0, float f10, float f11) {
        s.h(this$0, "this$0");
        ImageView imageView = this$0.muteView;
        if (imageView != null) {
            imageView.setTranslationX(f10);
        }
        ImageView imageView2 = this$0.muteView;
        if (imageView2 == null) {
            return;
        }
        imageView2.setTranslationY(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: render$lambda-6, reason: not valid java name */
    public static final void m169render$lambda6(n this$0, View view) {
        s.h(this$0, "this$0");
        this$0.toggleMute();
    }

    private final void showImageViewAsFallback() {
        Context context = getContext();
        s.g(context, "context");
        super.render(context);
        ImageView imageView$vungle_ads_release = getImageView$vungle_ads_release();
        if (imageView$vungle_ads_release != null) {
            imageView$vungle_ads_release.setVisibility(0);
        }
        ImageView imageView = this.muteView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        g gVar = this.videoView;
        if (gVar == null) {
            return;
        }
        gVar.setVisibility(8);
    }

    private final void toggleMute() {
        g gVar = this.videoView;
        if (gVar != null) {
            boolean z10 = !gVar.isMuted();
            gVar.setMuted(z10);
            onMuteUpdateUI(z10);
        }
    }

    private final void unRegisterRingerMode() {
        Object objB;
        try {
            fl.r.a aVar = fl.r.f38769b;
            if (this.isReceiverRegistered.getAndSet(false)) {
                q.Companion.d(TAG, "unregisterReceiver()");
                this.ringerModeReceiver.setListener(null);
                getContext().unregisterReceiver(this.ringerModeReceiver);
            }
            objB = fl.r.b(g0.f38750a);
        } catch (Throwable th2) {
            fl.r.a aVar2 = fl.r.f38769b;
            objB = fl.r.b(fl.s.a(th2));
        }
        Throwable thE = fl.r.e(objB);
        if (thE != null) {
            q.Companion.e(TAG, "unregisterReceiver", thE);
        }
    }

    @Override // com.vungle.ads.internal.ui.view.h
    public void destroy$vungle_ads_release() {
        q.Companion.d(TAG, "destroy()");
        unRegisterRingerMode();
        WeakReference<Activity> weakReference = this.adActivity;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.adActivity = null;
        com.vungle.ads.internal.util.a.Companion.removeLifecycleListener(this.activityLifecycle);
        g gVar = this.videoView;
        if (gVar != null) {
            gVar.release();
        }
        this.videoView = null;
        super.destroy$vungle_ads_release();
    }

    @Override // zj.a
    public int getCurrentTime() {
        g gVar = this.videoView;
        if (gVar != null) {
            return gVar.getCurrentPositionMs();
        }
        return 0;
    }

    @Override // zj.a
    public int getDuration() {
        g gVar = this.videoView;
        if (gVar != null) {
            return gVar.getDurationMs();
        }
        return 0;
    }

    public final g getVideoView() {
        return this.videoView;
    }

    public final Boolean isMuted$vungle_ads_release() {
        g gVar = this.videoView;
        if (gVar != null) {
            return Boolean.valueOf(gVar.isMuted());
        }
        return null;
    }

    @Override // com.vungle.ads.internal.util.r
    public void notifySilentModeChange(boolean z10) {
        Boolean boolIsMuted$vungle_ads_release = isMuted$vungle_ads_release();
        q.Companion.d(TAG, "silentModeEnabled=" + z10 + " currentIsMuted=" + boolIsMuted$vungle_ads_release);
        if (!this.ignoredFirst.getAndSet(true) || boolIsMuted$vungle_ads_release == null || s.c(Boolean.valueOf(z10), boolIsMuted$vungle_ads_release)) {
            return;
        }
        toggleMute();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Object objB;
        super.onAttachedToWindow();
        try {
            fl.r.a aVar = fl.r.f38769b;
            if (!this.isReceiverRegistered.getAndSet(true)) {
                q.Companion.d(TAG, "registerReceiver()");
                this.ignoredFirst.set(false);
                this.ringerModeReceiver.setListener(this);
                getContext().registerReceiver(this.ringerModeReceiver, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
            }
            objB = fl.r.b(g0.f38750a);
        } catch (Throwable th2) {
            fl.r.a aVar2 = fl.r.f38769b;
            objB = fl.r.b(fl.s.a(th2));
        }
        Throwable thE = fl.r.e(objB);
        if (thE != null) {
            q.Companion.e(TAG, "registerReceiver", thE);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        unRegisterRingerMode();
    }

    @Override // zj.b
    public void onVideoCompleted() throws Throwable {
        com.vungle.ads.internal.l.trackTpatEvent$default(getInternal(), com.vungle.ads.internal.f.TPAT_VIDEO_CLOSE, null, 2, null);
        com.vungle.ads.internal.l.trackOMEvent$default(getInternal(), 3, null, 2, null);
        zj.c nativeVideoListener = getNativeVideoListener();
        if (nativeVideoListener != null) {
            nativeVideoListener.onVideoEnd();
        }
    }

    @Override // zj.b
    public void onVideoError(int i10, String extra) {
        s.h(extra, "extra");
        if (this.videoErrorHandled.getAndSet(true)) {
            return;
        }
        showImageViewAsFallback();
        new NativeVideoPlaybackError("w=" + i10 + " e=" + extra + " url=" + getInternal().getOriginalVideoUrl$vungle_ads_release()).setLogEntry$vungle_ads_release(getInternal().getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
    }

    @Override // zj.b
    public void onVideoMuted(boolean z10) throws Throwable {
        if (z10) {
            com.vungle.ads.internal.l.trackTpatEvent$default(getInternal(), com.vungle.ads.internal.f.TPAT_VIDEO_MUTE, null, 2, null);
            com.vungle.ads.internal.l.trackOMEvent$default(getInternal(), 9, null, 2, null);
            zj.c nativeVideoListener = getNativeVideoListener();
            if (nativeVideoListener != null) {
                nativeVideoListener.onVideoMute();
                return;
            }
            return;
        }
        com.vungle.ads.internal.l.trackTpatEvent$default(getInternal(), com.vungle.ads.internal.f.TPAT_VIDEO_UNMUTE, null, 2, null);
        com.vungle.ads.internal.l.trackOMEvent$default(getInternal(), 10, null, 2, null);
        zj.c nativeVideoListener2 = getNativeVideoListener();
        if (nativeVideoListener2 != null) {
            nativeVideoListener2.onVideoUnmute();
        }
    }

    @Override // zj.b
    public void onVideoPause() {
        zj.c nativeVideoListener = getNativeVideoListener();
        if (nativeVideoListener != null) {
            nativeVideoListener.onVideoPause();
        }
    }

    @Override // zj.b
    public void onVideoPlay() {
        zj.c nativeVideoListener = getNativeVideoListener();
        if (nativeVideoListener != null) {
            nativeVideoListener.onVideoPlay();
        }
    }

    @Override // zj.b
    public void onVideoPrepared() throws Throwable {
        this.preparedDurationMetric.markEnd();
        com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, this.preparedDurationMetric, getInternal().getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
    }

    @Override // com.vungle.ads.internal.ui.view.h
    public void render(Context context) {
        Object objB;
        s.h(context, "context");
        q.a aVar = q.Companion;
        aVar.d(TAG, "initView");
        ImageView imageView$vungle_ads_release = getImageView$vungle_ads_release();
        if (imageView$vungle_ads_release != null) {
            imageView$vungle_ads_release.setVisibility(8);
        }
        com.vungle.ads.internal.util.a.Companion.addLifecycleListener(this.activityLifecycle);
        boolean zIsStartMuted$vungle_ads_release = getInternal().isStartMuted$vungle_ads_release();
        aVar.d(TAG, "startMuted=" + zIsStartMuted$vungle_ads_release);
        g0 g0Var = null;
        g gVar = new g(context, null, 2, null);
        this.videoView = gVar;
        gVar.setMuted(zIsStartMuted$vungle_ads_release);
        g gVar2 = this.videoView;
        if (gVar2 != null) {
            gVar2.setLooping(false);
        }
        g gVar3 = this.videoView;
        if (gVar3 != null) {
            gVar3.setAutoVisibility(true, 0.01f);
        }
        g gVar4 = this.videoView;
        if (gVar4 != null) {
            gVar4.setVideoLifecycleCallback(this);
        }
        g gVar5 = this.videoView;
        if (gVar5 != null) {
            gVar5.setVideoTransformCallback$vungle_ads_release(new g.c() { // from class: com.vungle.ads.internal.ui.view.l
                @Override // com.vungle.ads.internal.ui.view.g.c
                public final void onVideoTransformed(float f10, float f11) {
                    n.m168render$lambda5(this.f35880a, f10, f11);
                }
            });
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        g gVar6 = this.videoView;
        if (gVar6 != null) {
            gVar6.setLayoutParams(layoutParams);
        }
        addView(this.videoView);
        this.muteView = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(5);
        layoutParams2.addRule(6);
        ImageView imageView = this.muteView;
        if (imageView != null) {
            imageView.setLayoutParams(layoutParams2);
        }
        ImageView imageView2 = this.muteView;
        if (imageView2 != null) {
            imageView2.setClickable(true);
        }
        ImageView imageView3 = this.muteView;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.vungle.ads.internal.ui.view.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n.m169render$lambda6(this.f35881a, view);
                }
            });
        }
        onMuteUpdateUI(zIsStartMuted$vungle_ads_release);
        addView(this.muteView);
        ImageView imageView4 = this.muteView;
        if (imageView4 != null) {
            imageView4.bringToFront();
        }
        requestLayout();
        try {
            fl.r.a aVar2 = fl.r.f38769b;
            Activity adActivity = getAdActivity(context);
            if (adActivity != null) {
                this.adActivity = new WeakReference<>(adActivity);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("adActivity=");
            WeakReference<Activity> weakReference = this.adActivity;
            sb2.append(weakReference != null ? weakReference.get() : null);
            fl.r.b(Integer.valueOf(aVar.d(TAG, sb2.toString())));
        } catch (Throwable th2) {
            fl.r.a aVar3 = fl.r.f38769b;
            fl.r.b(fl.s.a(th2));
        }
        this.preparedDurationMetric.markStart();
        try {
            Uri uri = Uri.parse(getInternal().getMainVideoPath$vungle_ads_release());
            s.g(uri, "parse(this)");
            g gVar7 = this.videoView;
            if (gVar7 != null) {
                gVar7.setSource(uri);
            }
            g gVar8 = this.videoView;
            if (gVar8 != null) {
                gVar8.play();
                g0Var = g0.f38750a;
            }
            objB = fl.r.b(g0Var);
        } catch (Throwable th3) {
            fl.r.a aVar4 = fl.r.f38769b;
            objB = fl.r.b(fl.s.a(th3));
        }
        Throwable thE = fl.r.e(objB);
        if (thE != null) {
            onVideoError(-2, String.valueOf(thE.getLocalizedMessage()));
        }
    }

    public final void setVideoView(g gVar) {
        this.videoView = gVar;
    }

    @Override // zj.b
    public void onVideoProgress(int i10) throws Throwable {
        if (1 <= i10 && i10 < 25) {
            if (this.startFired.compareAndSet(false, true)) {
                int duration = getDuration();
                Map<String, ? extends Object> mapL = l0.l(w.a(com.vungle.ads.internal.l.QUARTILE_START_KEY_DURATION, Integer.valueOf(duration)), w.a(com.vungle.ads.internal.l.QUARTILE_START_KEY_VOLUME, Integer.valueOf(!s.c(isMuted$vungle_ads_release(), Boolean.TRUE) ? 1 : 0)));
                getInternal().trackTpatEvent(com.vungle.ads.internal.f.VIDEO_LENGTH_TPAT, String.valueOf(duration));
                getInternal().trackOMEvent(4, mapL);
                return;
            }
            return;
        }
        if (25 <= i10 && i10 < 50) {
            if (this.cp25Fired.compareAndSet(false, true)) {
                com.vungle.ads.internal.l.trackTpatEvent$default(getInternal(), com.vungle.ads.internal.f.TPAT_CHECKPOINT_25, null, 2, null);
                com.vungle.ads.internal.l.trackOMEvent$default(getInternal(), 5, null, 2, null);
                return;
            }
            return;
        }
        if (50 <= i10 && i10 < 75) {
            if (this.cp50Fired.compareAndSet(false, true)) {
                com.vungle.ads.internal.l.trackTpatEvent$default(getInternal(), OGoz.EfACqOf, null, 2, null);
                com.vungle.ads.internal.l.trackOMEvent$default(getInternal(), 6, null, 2, null);
                return;
            }
            return;
        }
        if (75 > i10 || i10 >= 100) {
            if (i10 < 100 || !this.cp100Fired.compareAndSet(false, true)) {
                return;
            }
            com.vungle.ads.internal.l.trackTpatEvent$default(getInternal(), com.vungle.ads.internal.f.TPAT_CHECKPOINT_100, null, 2, null);
            return;
        }
        if (this.cp75Fired.compareAndSet(false, true)) {
            com.vungle.ads.internal.l.trackTpatEvent$default(getInternal(), com.vungle.ads.internal.f.TPAT_CHECKPOINT_75, null, 2, null);
            com.vungle.ads.internal.l.trackOMEvent$default(getInternal(), 7, null, 2, null);
        }
    }
}
