package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.Surface;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Gn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final em.o0 f24892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaPlayer f24893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3348u9 f24894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f24895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f24896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2888ce f24897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Surface f24898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Zj f24899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3181nn f24900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Fn f24901j;

    public Gn(em.o0 coroutineScope, MediaPlayer mediaPlayer, RelativeLayout mediaPlayerLayout, C3026hn config, C3348u9 c3348u9) {
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.s.h(mediaPlayer, "mediaPlayer");
        kotlin.jvm.internal.s.h(mediaPlayerLayout, "mediaPlayerLayout");
        kotlin.jvm.internal.s.h(config, "config");
        this.f24892a = coroutineScope;
        this.f24893b = mediaPlayer;
        this.f24894c = c3348u9;
        this.f24895d = new AtomicBoolean(false);
        this.f24896e = new ArrayList();
        Context context = mediaPlayerLayout.getContext();
        kotlin.jvm.internal.s.g(context, "getContext(...)");
        C3111l5 c3111l5 = new C3111l5(context);
        this.f24897f = new C2888ce(c3111l5, mediaPlayerLayout, mediaPlayer, c3348u9);
        this.f24900i = new C3181nn(coroutineScope, c3111l5, config.f26708e);
        this.f24901j = new Fn(this);
    }

    public final void a() {
        if (this.f24898g != null && this.f24895d.get()) {
            Fg fg2 = (Fg) this.f24900i.f27082d.getValue();
            fg2.f24784f.set(false);
            fg2.a();
        } else {
            Fg fg3 = (Fg) this.f24900i.f27082d.getValue();
            fg3.f24780b.setValue(EnumC2949eo.HIDDEN);
            fg3.f24784f.set(true);
            L6.a(fg3.f24783e);
            fg3.f24783e = null;
        }
    }

    public final void b() {
        T4.a(this.f24896e);
        C2888ce c2888ce = this.f24897f;
        c2888ce.f26332e = null;
        c2888ce.f26328a.setSurfaceTextureListener(null);
        c2888ce.f26330c.setOnVideoSizeChangedListener(null);
        Fg fg2 = (Fg) this.f24900i.f27082d.getValue();
        fg2.f24784f.set(true);
        L6.a(fg2.f24783e);
        fg2.f24783e = null;
        Surface surface = this.f24898g;
        if (surface != null) {
            surface.release();
        }
        this.f24898g = null;
        this.f24899h = null;
    }
}
