package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.VideoView;
import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.inmobi.media.C3222pc;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.inmobi.media.pc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3222pc extends VideoView implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3322t9 f27188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3170nc f27189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f27190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC3196oc f27191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f27192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f27193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f27195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f27196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f27197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27198k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3222pc(Activity activity, InterfaceC3322t9 interfaceC3322t9) {
        super(activity);
        kotlin.jvm.internal.s.h(activity, "activity");
        this.f27188a = interfaceC3322t9;
        setZOrderOnTop(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT < 28) {
            setDrawingCacheEnabled(true);
        }
        this.f27194g = 100;
        this.f27197j = -1;
        this.f27198k = 0;
        this.f27193f = new WeakReference(activity);
        Context context = Xi.f26021a;
        kotlin.jvm.internal.s.h(this, "lifecycleCallbacks");
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        activity.getApplication().registerActivityLifecycleCallbacks(this);
    }

    public static final void a(C3222pc c3222pc, MediaPlayer mediaPlayer, int i10, int i11) {
        InterfaceC3322t9 interfaceC3322t9 = c3222pc.f27188a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("MediaRenderView", ">>> onVideoSizeChanged");
        }
        if (c3222pc.f27189b == null) {
            C3170nc c3170nc = new C3170nc(c3222pc.getContext());
            c3222pc.f27189b = c3170nc;
            c3170nc.setAnchorView(c3222pc);
            c3222pc.setMediaController(c3222pc.f27189b);
            c3222pc.requestLayout();
            c3222pc.requestFocus();
        }
    }

    public final void b() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27188a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("MediaRenderView", "Release the media render view");
        }
        stopPlayback();
        ViewGroup viewGroup = this.f27190c;
        if (viewGroup != null) {
            ViewParent parent = viewGroup.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f27190c);
            }
            ViewParent parent2 = getParent();
            ViewGroup viewGroup3 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(this);
            }
            setBackgroundColor(0);
            this.f27190c = null;
        }
        setMediaController(null);
        this.f27189b = null;
        InterfaceC3196oc interfaceC3196oc = this.f27191d;
        if (interfaceC3196oc != null) {
            kotlin.jvm.internal.s.h(this, "mp");
            InterfaceC3322t9 interfaceC3322t10 = ((Dc) interfaceC3196oc).f24648a.f24709b;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).a("MraidMediaProcessor", ">>> onPlayerCompleted");
            }
            ViewGroup viewContainer = getViewContainer();
            if (viewContainer != null) {
                ViewParent parent3 = viewContainer.getParent();
                ViewGroup viewGroup4 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
                if (viewGroup4 != null) {
                    viewGroup4.removeView(viewContainer);
                }
            }
            setViewContainer(null);
        }
    }

    public final int getCurrentAudioVolume() {
        return this.f27194g;
    }

    @Override // android.view.View
    public final String getId() {
        return this.f27195h;
    }

    public final InterfaceC3196oc getListener() {
        return this.f27191d;
    }

    public final int getMCurrentPosition() {
        return this.f27198k;
    }

    public final String getPlaybackUrl() {
        return this.f27196i;
    }

    public final int getPreviousPosition() {
        return this.f27197j;
    }

    public final ViewGroup getViewContainer() {
        return this.f27190c;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.s.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.s.h(activity, "activity");
        kotlin.jvm.internal.s.h(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        if (this.f27193f.get() == null || !kotlin.jvm.internal.s.c(this.f27193f.get(), activity)) {
            return;
        }
        this.f27192e = false;
        start();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        Activity activity2 = (Activity) this.f27193f.get();
        if (activity2 == null || !kotlin.jvm.internal.s.c(activity2, activity)) {
            return;
        }
        this.f27192e = true;
        if (getCurrentPosition() != 0) {
            this.f27198k = getCurrentPosition();
        }
        pause();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mp2) {
        kotlin.jvm.internal.s.h(mp2, "mp");
        InterfaceC3322t9 interfaceC3322t9 = this.f27188a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("MediaRenderView", ">>> onCompletion");
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mp2, int i10, int i11) {
        kotlin.jvm.internal.s.h(mp2, "mp");
        InterfaceC3322t9 interfaceC3322t9 = this.f27188a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).b("MediaRenderView", ">>> onError (" + i10 + ", " + i11 + ")");
        }
        b();
        return false;
    }

    @Override // android.widget.VideoView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        getHolder().setSizeFromLayout();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mp2) {
        kotlin.jvm.internal.s.h(mp2, "mp");
        InterfaceC3322t9 interfaceC3322t9 = this.f27188a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("MediaRenderView", ">>> onPrepared");
        }
        mp2.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: yh.fa
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
                C3222pc.a(this.f57716a, mediaPlayer, i10, i11);
            }
        });
        int i10 = this.f27198k;
        if (i10 < getDuration()) {
            this.f27198k = i10;
            seekTo(i10);
        }
        InterfaceC3196oc interfaceC3196oc = this.f27191d;
        if (interfaceC3196oc != null) {
            kotlin.jvm.internal.s.h(this, "mp");
            InterfaceC3322t9 interfaceC3322t10 = ((Dc) interfaceC3196oc).f24648a.f24709b;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).a("MraidMediaProcessor", ">>> onPlayerPrepared");
            }
        }
        start();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        Context context;
        kotlin.jvm.internal.s.h(view, "view");
        super.onVisibilityChanged(view, i10);
        InterfaceC3322t9 interfaceC3322t9 = this.f27188a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("MediaRenderView", ">>> onVisibilityChanged (" + i10 + ")");
        }
        if (i10 != 0 || (context = Xi.f26021a) == null) {
            return;
        }
        setBackground(new BitmapDrawable(context.getResources(), (Bitmap) null));
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        InterfaceC3322t9 interfaceC3322t9 = this.f27188a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("MediaRenderView", ">>> onWindowVisibilityChanged (" + i10 + ")");
        }
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27188a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("MediaRenderView", "Pause media playback");
        }
        super.pause();
    }

    public final void setAudioMuted(boolean z10) {
    }

    public final void setCurrentAudioVolume(int i10) {
        this.f27194g = i10;
    }

    public final void setId(String str) {
        this.f27195h = str;
    }

    public final void setListener(InterfaceC3196oc interfaceC3196oc) {
        this.f27191d = interfaceC3196oc;
    }

    public final void setMCurrentPosition(int i10) {
        this.f27198k = i10;
    }

    public final void setPlaybackUrl(String str) {
        this.f27196i = str;
    }

    public final void setPlayerPrepared(boolean z10) {
    }

    public final void setPreviousPosition(int i10) {
        this.f27197j = i10;
    }

    public final void setViewContainer(ViewGroup viewGroup) {
        this.f27190c = viewGroup;
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        if (this.f27192e) {
            return;
        }
        InterfaceC3322t9 interfaceC3322t9 = this.f27188a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("MediaRenderView", "Start media playback");
        }
        super.start();
    }

    public final void setPlaybackData(String str) {
        String str2;
        kotlin.jvm.internal.s.h(str, qEagQqzJZsd.DFXhTxe);
        byte[] bytes = str.getBytes(bm.d.f9079b);
        kotlin.jvm.internal.s.g(bytes, "getBytes(...)");
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bytes) {
            if (((byte) (b10 & (-128))) > 0) {
                sb2.append("%");
                char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                sb2.append(new String(new char[]{cArr[(b10 >> 4) & 15], cArr[(byte) (b10 & 15)]}));
            } else {
                sb2.append((char) b10);
            }
        }
        try {
            String string = sb2.toString();
            kotlin.jvm.internal.s.g(string, "toString(...)");
            byte[] bytes2 = string.getBytes(bm.d.f9079b);
            kotlin.jvm.internal.s.g(bytes2, "getBytes(...)");
            str2 = new String(bytes2, bm.d.f9084g);
        } catch (UnsupportedEncodingException unused) {
            str2 = "";
        }
        this.f27196i = str2;
        this.f27195h = "anonymous";
    }

    public final void a() {
        setVideoPath(this.f27196i);
        setOnCompletionListener(this);
        setOnPreparedListener(this);
        setOnErrorListener(this);
        if (this.f27189b == null) {
            C3170nc c3170nc = new C3170nc(getContext());
            this.f27189b = c3170nc;
            c3170nc.setAnchorView(this);
            setMediaController(this.f27189b);
        }
    }
}
