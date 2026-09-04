package com.inmobi.media;

import android.content.Context;
import android.os.Looper;
import android.transition.TransitionManager;
import android.view.Surface;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoFile;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class R7 {
    public final P7 A;
    public final J7 B;
    public final hm.v C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HtmlVideoPlayerRequest f25588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3322t9 f25589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final em.o0 f25590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final em.o0 f25591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HtmlVideoPlayerConfig f25592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f25593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f25594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f25595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile int f25596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile int f25597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f25598k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicReference f25599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final hm.v f25600m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final G1 f25601n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ProgressBar f25602o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final androidx.media3.exoplayer.o f25603p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f25604q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public WeakReference f25605r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f25606s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bg f25607t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f25608u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public em.z1 f25609v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final L2 f25610w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C3448y6 f25611x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final W7 f25612y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C3295s8 f25613z;

    public R7(Context context, AdConfig.HybridNativeConfig hybridNativeConfig, em.o0 coroutineScope, HtmlVideoPlayerRequest htmlVideoPlayerRequest, InterfaceC3322t9 interfaceC3322t9) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(hybridNativeConfig, "hybridNativeConfig");
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.s.h(htmlVideoPlayerRequest, "htmlVideoPlayerRequest");
        this.f25588a = htmlVideoPlayerRequest;
        this.f25589b = interfaceC3322t9;
        this.f25590c = T4.a(coroutineScope, new O7(em.l0.f38027w2, this));
        em.o0 o0VarA = T4.a(coroutineScope);
        this.f25591d = o0VarA;
        HtmlVideoPlayerConfig config = htmlVideoPlayerRequest.getConfig();
        this.f25592e = config;
        this.f25593f = new AtomicBoolean(false);
        this.f25594g = new AtomicBoolean(false);
        this.f25595h = new AtomicBoolean(false);
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        kotlin.jvm.internal.s.g(listSynchronizedList, "synchronizedList(...)");
        this.f25598k = listSynchronizedList;
        Bg bg2 = Bg.STATE_INITIALIZED;
        this.f25599l = new AtomicReference(bg2);
        hm.v vVarB = hm.b0.b(0, 0, null, 7, null);
        this.f25600m = vVarB;
        G1 g10 = new G1(context);
        this.f25601n = g10;
        this.f25602o = new ProgressBar(context);
        androidx.media3.exoplayer.o oVarE = new androidx.media3.exoplayer.o.b(context).e();
        kotlin.jvm.internal.s.g(oVarE, "build(...)");
        this.f25603p = oVarE;
        List listSynchronizedList2 = Collections.synchronizedList(new ArrayList());
        kotlin.jvm.internal.s.g(listSynchronizedList2, "synchronizedList(...)");
        this.f25606s = listSynchronizedList2;
        this.f25607t = bg2;
        L2 l10 = (L2) L2.f25166h.getValue();
        l10.f25172f.incrementAndGet();
        this.f25610w = l10;
        this.f25611x = new C3448y6(oVarE, hybridNativeConfig, o0VarA, config.getPlaybackUpdateInterval(), vVarB, config.getTrackPercentages());
        Context context2 = g10.getContext();
        kotlin.jvm.internal.s.g(context2, "getContext(...)");
        this.f25612y = new W7(context2, o0VarA, oVarE, config.getMuted(), vVarB);
        this.f25613z = new C3295s8(o0VarA, oVarE, g10, interfaceC3322t9);
        this.A = new P7(this);
        this.B = new J7(this);
        this.C = vVarB;
    }

    public final void a(AbstractC3050im abstractC3050im) {
        em.k.d(this.f25590c, null, null, new K7(this, abstractC3050im, null), 3, null);
    }

    public final Bg b() {
        Object obj = this.f25599l.get();
        kotlin.jvm.internal.s.g(obj, "get(...)");
        return (Bg) obj;
    }

    public final void c() {
        if (!this.f25595h.get() && b() == Bg.STATE_PLAYING) {
            if (!kotlin.jvm.internal.s.c(Looper.myLooper(), Looper.getMainLooper())) {
                em.k.d(this.f25590c, null, null, new H7(null, this), 3, null);
                return;
            }
            this.f25603p.pause();
            this.f25611x.a();
            W7 w10 = this.f25612y;
            w10.f25928b.setVolume(0.0f);
            w10.f25930d.a();
            this.f25599l.set(Bg.STATE_PAUSED);
            a(new C2974fn(this.f25603p.getCurrentPosition()));
        }
    }

    public final void d() {
        if (this.f25595h.get()) {
            return;
        }
        InterfaceC3322t9 interfaceC3322t9 = this.f25589b;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).b("HtmlMediaPlayer", "playVideo called");
        }
        if (b() != Bg.STATE_PAUSED && b() != Bg.STATE_PREPARED && b() != Bg.STATE_PLAYBACK_COMPLETED) {
            InterfaceC3322t9 interfaceC3322t10 = this.f25589b;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).b("HtmlMediaPlayer", "playVideo: Player not in playable state");
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.s.c(Looper.myLooper(), Looper.getMainLooper())) {
            em.k.d(this.f25590c, null, null, new I7(null, this), 3, null);
            return;
        }
        if (b() == Bg.STATE_PLAYBACK_COMPLETED) {
            this.f25603p.seekTo(0L);
            this.f25599l.set(Bg.STATE_PREPARED);
        }
        W7 w10 = this.f25612y;
        if (w10.f25931e) {
            w10.a();
            w10.f25930d.a();
        } else {
            T4.a(w10.f25927a, new V7(w10, null));
        }
        C3448y6 c3448y6 = this.f25611x;
        if (!c3448y6.f27914d.getAndSet(true)) {
            em.o0 o0Var = c3448y6.f27912b;
            long j10 = c3448y6.f27921k;
            C3397w6 action = new C3397w6(c3448y6, null);
            kotlin.jvm.internal.s.h(o0Var, "<this>");
            kotlin.jvm.internal.s.h(action, "action");
            c3448y6.f27915e = em.k.d(o0Var, em.c1.c().X0(), null, new G3(j10, null, action), 2, null);
            em.o0 o0Var2 = c3448y6.f27912b;
            long j11 = c3448y6.f27922l;
            C3423x6 action2 = new C3423x6(c3448y6, null);
            kotlin.jvm.internal.s.h(o0Var2, "<this>");
            kotlin.jvm.internal.s.h(action2, "action");
            c3448y6.f27916f = em.k.d(o0Var2, em.c1.c().X0(), null, new G3(j11, null, action2), 2, null);
        }
        this.f25603p.play();
        this.f25599l.set(Bg.STATE_PLAYING);
        a(new C3465yn(this.f25603p.getCurrentPosition()));
    }

    public final void e() {
        HtmlVideoFile htmlVideoFile;
        if (this.f25595h.get()) {
            return;
        }
        String str = this.f25604q;
        if (str == null) {
            htmlVideoFile = null;
            break;
        }
        Iterator it = this.f25606s.iterator();
        do {
            if (!it.hasNext()) {
                htmlVideoFile = null;
                break;
            }
            htmlVideoFile = (HtmlVideoFile) it.next();
        } while (!kotlin.jvm.internal.s.c(htmlVideoFile.getUrl(), str));
        if (htmlVideoFile == null) {
            InterfaceC3322t9 interfaceC3322t9 = this.f25589b;
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).b("HtmlMediaPlayer", "start() called before successful load – ignoring");
                return;
            }
            return;
        }
        if (!this.f25594g.get()) {
            this.f25594g.set(true);
            em.z1 z1VarD = em.k.d(this.f25590c, null, null, new C3449y7(new B7(this.C), null, this), 3, null);
            List activeJobs = this.f25598k;
            kotlin.jvm.internal.s.h(z1VarD, "<this>");
            kotlin.jvm.internal.s.h(activeJobs, "activeJobs");
            activeJobs.add(z1VarD);
        }
        if (!this.f25593f.get()) {
            this.f25593f.set(true);
            if (kotlin.jvm.internal.s.c(Looper.myLooper(), Looper.getMainLooper())) {
                this.f25603p.q(this.B);
            } else {
                em.k.d(this.f25590c, null, null, new C3398w7(null, this), 3, null);
            }
        }
        if (this.f25592e.getAutoplay()) {
            d();
        }
    }

    public final void f() {
        if (this.f25595h.get()) {
            return;
        }
        if (b() == Bg.STATE_PLAYING) {
            c();
        }
        if (this.f25593f.get()) {
            this.f25593f.set(false);
            if (kotlin.jvm.internal.s.c(Looper.myLooper(), Looper.getMainLooper())) {
                this.f25603p.n(this.B);
            } else {
                em.k.d(this.f25590c, null, null, new M7(null, this), 3, null);
            }
        }
        this.f25611x.a();
        this.f25594g.set(false);
        T4.a(this.f25598k);
    }

    public final void a(RelativeLayout parentView) {
        InterfaceC3322t9 interfaceC3322t9;
        kotlin.jvm.internal.s.h(parentView, "parentView");
        if (this.f25595h.get()) {
            return;
        }
        this.f25605r = new WeakReference(parentView);
        C3295s8 c3295s8 = this.f25613z;
        P7 surfaceViewabilityListener = this.A;
        c3295s8.getClass();
        kotlin.jvm.internal.s.h(surfaceViewabilityListener, "surfaceViewabilityListener");
        T4.a(c3295s8.f27443a, new C3244q8(c3295s8, surfaceViewabilityListener, null));
        G1 g10 = this.f25601n;
        VideoViewPosition videoViewPosition = new VideoViewPosition();
        VideoViewPosition videoViewPosition2 = this.f25592e.getVideoViewPosition();
        if (this.f25592e.getFullscreenEnabled()) {
            videoViewPosition.setX(0);
            videoViewPosition.setY(0);
            videoViewPosition.setWidth(-1);
            videoViewPosition.setHeight(-1);
        } else {
            videoViewPosition.setX(videoViewPosition2 != null ? (int) (N5.b() * videoViewPosition2.getX()) : 0);
            videoViewPosition.setY(videoViewPosition2 != null ? (int) (N5.b() * videoViewPosition2.getY()) : 0);
            videoViewPosition.setWidth(videoViewPosition2 != null ? (int) (N5.b() * videoViewPosition2.getWidth()) : -2);
            videoViewPosition.setHeight(videoViewPosition2 != null ? (int) (N5.b() * videoViewPosition2.getHeight()) : -2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(videoViewPosition.getWidth(), videoViewPosition.getHeight());
        if (this.f25592e.getFullscreenEnabled()) {
            layoutParams.addRule(13, -1);
        } else {
            layoutParams.setMargins(videoViewPosition.getX(), videoViewPosition.getY(), 0, 0);
        }
        g10.setLayoutParams(layoutParams);
        this.f25601n.setOnPositionChangeListener(new F7(this));
        ViewParent parent = this.f25602o.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f25602o);
        }
        ProgressBar progressBar = this.f25602o;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(100, 100);
        layoutParams2.gravity = 17;
        progressBar.setLayoutParams(layoutParams2);
        progressBar.setVisibility(0);
        if (kotlin.jvm.internal.s.c(Looper.myLooper(), Looper.getMainLooper())) {
            this.f25601n.addView(this.f25602o, 0);
        } else {
            em.k.d(this.f25590c, null, null, new N7(null, this), 3, null);
        }
        G1 g11 = this.f25601n;
        if (n0.q0.S(g11)) {
            InterfaceC3322t9 interfaceC3322t10 = this.f25589b;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).a("HtmlMediaPlayer", "inflate: MediaPlayerLayout is attached to window");
            }
            a(C3347u8.f27612a);
        } else {
            g11.addOnAttachStateChangeListener(new E7(g11, this));
        }
        parentView.addView(this.f25601n, 0);
        if (b() == Bg.STATE_PREPARED || (interfaceC3322t9 = this.f25589b) == null) {
            return;
        }
        ((C3348u9) interfaceC3322t9).b("HtmlMediaPlayer", "inflate() called before successful load – waiting for load to complete");
    }

    public final HtmlVideoPlaybackState a() {
        String str;
        HtmlVideoPlaybackState htmlVideoPlaybackState = new HtmlVideoPlaybackState();
        int iOrdinal = b().ordinal();
        if (iOrdinal == 2) {
            EnumC3166n8[] enumC3166n8Arr = EnumC3166n8.f27041a;
            str = "ready";
        } else if (iOrdinal == 3) {
            EnumC3166n8[] enumC3166n8Arr2 = EnumC3166n8.f27041a;
            str = "playing";
        } else if (iOrdinal == 4) {
            EnumC3166n8[] enumC3166n8Arr3 = EnumC3166n8.f27041a;
            str = "paused";
        } else if (iOrdinal == 5) {
            EnumC3166n8[] enumC3166n8Arr4 = EnumC3166n8.f27041a;
            str = "stopped";
        } else if (iOrdinal != 6) {
            EnumC3166n8[] enumC3166n8Arr5 = EnumC3166n8.f27041a;
            str = CIdIVqKnNZ.kfPbhuRo;
        } else {
            EnumC3166n8[] enumC3166n8Arr6 = EnumC3166n8.f27041a;
            str = "failed";
        }
        htmlVideoPlaybackState.setState(str);
        htmlVideoPlaybackState.setDuration(this.f25603p.getDuration() / 1000.0f);
        htmlVideoPlaybackState.setTime(this.f25603p.getCurrentPosition() / 1000.0f);
        htmlVideoPlaybackState.setMuted(this.f25612y.f25931e);
        return htmlVideoPlaybackState;
    }

    public final void a(VideoViewPosition newVideoViewPosition) {
        kotlin.jvm.internal.s.h(newVideoViewPosition, "newVideoViewPosition");
        if (this.f25595h.get()) {
            return;
        }
        if (!kotlin.jvm.internal.s.c(Looper.myLooper(), Looper.getMainLooper())) {
            em.k.d(this.f25590c, null, null, new Q7(null, this, newVideoViewPosition), 3, null);
            return;
        }
        TransitionManager.beginDelayedTransition(this.f25601n);
        this.f25592e.setVideoViewPosition(newVideoViewPosition);
        int iB = (int) (N5.b() * newVideoViewPosition.getWidth());
        int iB2 = (int) (N5.b() * newVideoViewPosition.getHeight());
        G1 g10 = this.f25601n;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iB, iB2);
        if (this.f25592e.getVideoViewPosition() != null) {
            layoutParams.setMargins((int) (N5.b() * newVideoViewPosition.getX()), (int) (N5.b() * newVideoViewPosition.getY()), 0, 0);
        }
        g10.setLayoutParams(layoutParams);
        if (this.f25596i > 0 && this.f25597j > 0) {
            G1 g11 = this.f25601n;
            int i10 = this.f25596i;
            int i11 = this.f25597j;
            g11.getClass();
            if (i10 > 0 && i11 > 0) {
                g11.f24828a = i10 / i11;
                g11.requestLayout();
            }
        }
        this.f25601n.requestLayout();
    }

    public final void a(AbstractC3037i8 abstractC3037i8) {
        Surface surface;
        if (abstractC3037i8 instanceof C3062j8) {
            C3062j8 c3062j8 = (C3062j8) abstractC3037i8;
            this.f25604q = c3062j8.f26793a;
            this.f25609v = null;
            if (!kotlin.jvm.internal.s.c(Looper.myLooper(), Looper.getMainLooper())) {
                em.k.d(this.f25590c, null, null, new D7(null, this, c3062j8), 3, null);
                return;
            }
            this.f25599l.set(Bg.STATE_PREPARED);
            this.f25603p.seekTo(0L);
            C3295s8 c3295s8 = this.f25613z;
            if (!c3295s8.f27449g && (surface = c3295s8.f27447e) != null) {
                c3295s8.f27449g = true;
                c3295s8.f27444b.setVideoSurface(surface);
            }
            HtmlVideoPlaybackState htmlVideoPlaybackState = new HtmlVideoPlaybackState();
            htmlVideoPlaybackState.setDuration(c3062j8.f26794b / 1000.0f);
            htmlVideoPlaybackState.setVideoUrl(c3062j8.f26793a);
            htmlVideoPlaybackState.setLatency(Long.valueOf(System.currentTimeMillis() - this.f25608u));
            htmlVideoPlaybackState.setMuted(this.f25612y.f25931e);
            EnumC3166n8[] enumC3166n8Arr = EnumC3166n8.f27041a;
            htmlVideoPlaybackState.setState("ready");
            htmlVideoPlaybackState.setTime(this.f25603p.getCurrentPosition() / 1000.0f);
            a(new C3088k8(htmlVideoPlaybackState, c3062j8.f26795c));
            return;
        }
        if (abstractC3037i8 instanceof C2985g8) {
            this.f25599l.set(Bg.STATE_ERROR);
            this.f25609v = null;
            a(new C2959f8(this.f25588a, ((C2985g8) abstractC3037i8).f26594a.f25659a.f26312a));
            return;
        }
        throw new NoWhenBranchMatchedException();
    }
}
