package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.inmobi.media.ae, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2836ae implements InterfaceC3144mc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final em.o0 f26201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3026hn f26202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3348u9 f26203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f26204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bg f26205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final hm.v f26206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RelativeLayout f26207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MediaPlayer f26208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3043ie f26209i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3414wn f26210j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Gn f26211k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Zd f26212l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final hm.v f26213m;

    public C2836ae(Context context, em.o0 coroutineScope, C3026hn config, C3348u9 c3348u9) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.s.h(config, "config");
        this.f26201a = coroutineScope;
        this.f26202b = config;
        this.f26203c = c3348u9;
        this.f26204d = new ArrayList();
        this.f26205e = Bg.STATE_INITIALIZED;
        hm.v vVarB = hm.b0.b(0, 0, null, 7, null);
        this.f26206f = vVarB;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f26207g = relativeLayout;
        Context context2 = relativeLayout.getContext();
        kotlin.jvm.internal.s.g(context2, "getContext(...)");
        MediaPlayer mediaPlayerA = AbstractC3051in.a(context2);
        this.f26208h = mediaPlayerA;
        this.f26209i = new C3043ie(relativeLayout, coroutineScope, mediaPlayerA, config, vVarB);
        this.f26210j = new C3414wn(mediaPlayerA, coroutineScope, config.f26706c.f25423f, vVarB);
        this.f26211k = new Gn(coroutineScope, mediaPlayerA, relativeLayout, config, c3348u9);
        this.f26212l = new Zd(this);
        this.f26213m = vVarB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ArrayList arrayList, kotlin.coroutines.jvm.internal.d dVar) {
        Yd yd2;
        if (dVar instanceof Yd) {
            yd2 = (Yd) dVar;
            int i10 = yd2.f26081c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                yd2.f26081c = i10 - Integer.MIN_VALUE;
            } else {
                yd2 = new Yd(this, dVar);
            }
        } else {
            yd2 = new Yd(this, dVar);
        }
        Object objA = yd2.f26079a;
        Object objF = ll.b.f();
        int i11 = yd2.f26081c;
        if (i11 == 0) {
            fl.s.b(objA);
            if (this.f26205e != Bg.STATE_INITIALIZED) {
                throw new C3118lc();
            }
            this.f26205e = Bg.STATE_PREPARING;
            T4.a(this.f26206f, this.f26201a, Sm.f25715a);
            C3348u9 c3348u9 = this.f26203c;
            if (c3348u9 != null) {
                c3348u9.a("NativeMediaPlayer", "Media Player Load started");
            }
            MediaPlayer mediaPlayer = this.f26208h;
            C3348u9 c3348u10 = this.f26203c;
            yd2.f26081c = 1;
            objA = AbstractC2923dn.a(mediaPlayer, arrayList, c3348u10, yd2);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(objA);
        }
        Tm tm2 = (Tm) objA;
        C3348u9 c3348u11 = this.f26203c;
        if (c3348u11 != null) {
            c3348u11.a("NativeMediaPlayer", "Media Player Load Status " + tm2);
        }
        if (!(tm2 instanceof Um)) {
            if (!(tm2 instanceof Qm)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f26205e = Bg.STATE_ERROR;
            T4.a(this.f26206f, this.f26201a, new C3025hm());
            throw new C3118lc();
        }
        T4.a(this.f26206f, this.f26201a, new Vm(((Um) tm2).f25857a));
        this.f26205e = Bg.STATE_PREPARED;
        MediaPlayer mediaPlayer2 = this.f26208h;
        kotlin.jvm.internal.s.h(mediaPlayer2, "<this>");
        try {
            mediaPlayer2.seekTo(0);
        } catch (IllegalStateException unused) {
        }
        Gn gn2 = this.f26211k;
        Zd surfaceViewabilityListener = this.f26212l;
        gn2.getClass();
        kotlin.jvm.internal.s.h(surfaceViewabilityListener, "surfaceViewabilityListener");
        T4.a(gn2.f24892a, new Cn(gn2, surfaceViewabilityListener, null));
        C3043ie c3043ie = this.f26209i;
        T4.a(c3043ie.f26739b, new C2939ee(c3043ie, null));
        return this.f26207g;
    }
}
