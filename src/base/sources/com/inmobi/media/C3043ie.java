package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.RelativeLayout;
import com.inmobi.media.C3043ie;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.inmobi.media.ie, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3043ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f26738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final em.o0 f26739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaPlayer f26740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3026hn f26741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hm.v f26742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Q1 f26743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RelativeLayout f26744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f26745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f26746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3163n5 f26747j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3163n5 f26748k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C3310sn f26749l;

    public C3043ie(RelativeLayout parentView, em.o0 coroutineScope, MediaPlayer mediaPlayer, C3026hn config, hm.v mediaPlayerFlow) {
        kotlin.jvm.internal.s.h(parentView, "parentView");
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.s.h(mediaPlayer, "mediaPlayer");
        kotlin.jvm.internal.s.h(config, "config");
        kotlin.jvm.internal.s.h(mediaPlayerFlow, "mediaPlayerFlow");
        this.f26738a = parentView;
        this.f26739b = coroutineScope;
        this.f26740c = mediaPlayer;
        this.f26741d = config;
        this.f26742e = mediaPlayerFlow;
        Context context = parentView.getContext();
        kotlin.jvm.internal.s.g(context, "getContext(...)");
        Q1 q10 = new Q1(context);
        this.f26743f = q10;
        RelativeLayout relativeLayout = new RelativeLayout(parentView.getContext());
        this.f26744g = relativeLayout;
        this.f26745h = N5.b();
        this.f26749l = new C3310sn(coroutineScope, relativeLayout, config.f26706c, mediaPlayerFlow);
        C2914de listener = new C2914de(this);
        kotlin.jvm.internal.s.h(listener, "listener");
        q10.f25529c = new WeakReference(listener);
        Context context2 = relativeLayout.getContext();
        kotlin.jvm.internal.s.g(context2, "getContext(...)");
        this.f26747j = new C3163n5(context2, (byte) 9, null);
        Context context3 = relativeLayout.getContext();
        kotlin.jvm.internal.s.g(context3, "getContext(...)");
        this.f26748k = new C3163n5(context3, (byte) 10, null);
        b();
        relativeLayout.setWillNotDraw(true);
        relativeLayout.setBackgroundColor(0);
        AbstractC3051in.a(mediaPlayer, q10);
    }

    public static final void a(C3043ie c3043ie, View view) {
        T4.a(c3043ie.f26739b, new C3017he(c3043ie, null));
    }

    public final void b() {
        this.f26747j.setOnClickListener(new View.OnClickListener() { // from class: yh.v8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3043ie.a(this.f57975a, view);
            }
        });
        this.f26748k.setOnClickListener(new View.OnClickListener() { // from class: yh.w8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3043ie.b(this.f57990a, view);
            }
        });
    }

    public static final void b(C3043ie c3043ie, View view) {
        c3043ie.a();
        c3043ie.f26743f.a();
    }

    public final void a() {
        MediaPlayer mediaPlayer = this.f26740c;
        kotlin.jvm.internal.s.h(mediaPlayer, "<this>");
        try {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } catch (IllegalStateException unused) {
        }
        a(this.f26747j, this.f26748k);
        T4.a(this.f26742e, this.f26739b, new S1(0.0f, true));
        this.f26746i = true;
    }

    public final void a(C3163n5 c3163n5, C3163n5 c3163n6) {
        if (kotlin.jvm.internal.s.c(c3163n5.getParent(), this.f26744g)) {
            return;
        }
        this.f26744g.removeView(c3163n6);
        O1 audioConfig = this.f26741d.f26707d;
        float f10 = this.f26745h;
        kotlin.jvm.internal.s.h(c3163n5, "<this>");
        kotlin.jvm.internal.s.h(audioConfig, "audioConfig");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (audioConfig.f25376b * f10), (int) (audioConfig.f25377c * f10));
        int i10 = audioConfig.f25379e;
        if (i10 == 0) {
            layoutParams.addRule(9, -1);
            layoutParams.addRule(10, -1);
        } else if (i10 == 1) {
            layoutParams.addRule(11, -1);
            layoutParams.addRule(10, -1);
        } else if (i10 == 2) {
            layoutParams.addRule(9, -1);
            layoutParams.addRule(12, -1);
        } else if (i10 == 3) {
            layoutParams.addRule(11, -1);
            layoutParams.addRule(12, -1);
        }
        C2989gc c2989gc = audioConfig.f25378d;
        layoutParams.leftMargin = (int) (c2989gc.f26603a * f10);
        layoutParams.topMargin = (int) (c2989gc.f26604b * f10);
        layoutParams.rightMargin = (int) (c2989gc.f26605c * f10);
        layoutParams.bottomMargin = (int) (c2989gc.f26606d * f10);
        c3163n5.setLayoutParams(layoutParams);
        this.f26744g.addView(c3163n5);
    }
}
