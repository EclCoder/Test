package com.inmobi.media;

import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.z8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3475z8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HtmlVideoPlayerRequest f27986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3485zi f27987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3322t9 f27988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final em.o0 f27989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final em.o0 f27990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public em.z1 f27991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f27992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WeakReference f27993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f27994i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HtmlVideoPlayerConfig f27995j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final R7 f27996k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f27997l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C3021hi f27998m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C3176ni f27999n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f28000o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Gf f28001p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicReference f28002q;

    public C3475z8(GestureDetectorOnGestureListenerC3228pi renderView, AdConfig.HybridNativeConfig hybridNativeConfig, HtmlVideoPlayerRequest videoRequestConfig, C3176ni c3176ni, C3485zi c3485zi, InterfaceC3322t9 interfaceC3322t9) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        kotlin.jvm.internal.s.h(hybridNativeConfig, "hybridNativeConfig");
        kotlin.jvm.internal.s.h(videoRequestConfig, "videoRequestConfig");
        this.f27986a = videoRequestConfig;
        this.f27987b = c3485zi;
        this.f27988c = interfaceC3322t9;
        C3450y8 c3450y8 = new C3450y8(em.l0.f38027w2, this);
        em.o0 o0VarA = em.p0.a(em.c1.b().plus(c3450y8));
        this.f27989d = o0VarA;
        this.f27990e = T4.a(o0VarA, c3450y8);
        this.f27992g = new AtomicBoolean(false);
        this.f27993h = new WeakReference(renderView.getContext());
        this.f27995j = videoRequestConfig.getConfig();
        Context context = renderView.getContext();
        kotlin.jvm.internal.s.g(context, "getContext(...)");
        this.f27996k = new R7(context, hybridNativeConfig, o0VarA, videoRequestConfig, interfaceC3322t9);
        this.f27999n = c3176ni;
        this.f28002q = new AtomicReference(EnumC3399w8.INIT);
    }

    public static /* synthetic */ boolean a(C3475z8 c3475z8, EnumC3399w8[] enumC3399w8Arr, String str, String str2, EnumC3399w8 enumC3399w8, int i10) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            enumC3399w8 = null;
        }
        return c3475z8.a(enumC3399w8Arr, str, str2, enumC3399w8);
    }

    public final void b(boolean z10) throws JSONException {
        if (this.f27992g.get()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", z10 ? "show" : "hide");
        EnumC3399w8[] enumC3399w8Arr = {EnumC3399w8.LOADED, EnumC3399w8.PLAYING, EnumC3399w8.PAUSED, EnumC3399w8.COMPLETED, EnumC3399w8.ERROR};
        EnumC2933e8[] enumC2933e8Arr = EnumC2933e8.f26475a;
        if (a(this, enumC3399w8Arr, "executeVideoPlayerActions", jSONObject.toString(), null, 8)) {
            R7 r10 = this.f27996k;
            if (r10.f25595h.get()) {
                return;
            }
            if (z10) {
                r10.e();
            } else {
                r10.f();
            }
            if (kotlin.jvm.internal.s.c(Looper.myLooper(), Looper.getMainLooper())) {
                r10.f25601n.setVisibility(z10 ? 0 : 8);
            } else {
                em.k.d(r10.f25590c, null, null, new C7(null, r10, z10), 3, null);
            }
        }
    }

    public final boolean a(EnumC3399w8[] enumC3399w8Arr, String str, String str2, EnumC3399w8 enumC3399w8) {
        EnumC3399w8 enumC3399w9 = (EnumC3399w8) this.f28002q.get();
        boolean z10 = false;
        if (gl.j.P(enumC3399w8Arr, enumC3399w9)) {
            if (enumC3399w8 != null && !a(enumC3399w8, str, str2)) {
                z10 = true;
            }
            return !z10;
        }
        if (str != null) {
            String str3 = String.format("Invalid state (%s) for %s. Allowed: %s", Arrays.copyOf(new Object[]{enumC3399w9, str2, gl.j.m0(enumC3399w8Arr, null, null, null, 0, null, null, 63, null)}, 3));
            kotlin.jvm.internal.s.g(str3, "format(...)");
            a(str, str3, str2);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:75:0x00b1  */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r5 == com.inmobi.media.EnumC3399w8.f27771i) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r5 != com.inmobi.media.EnumC3399w8.f27770h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003a, code lost:
    
        if (r5 != com.inmobi.media.EnumC3399w8.f27770h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        if (r5 != com.inmobi.media.EnumC3399w8.f27771i) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0051, code lost:
    
        if (r5 == com.inmobi.media.EnumC3399w8.f27771i) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0062, code lost:
    
        if (r5 != com.inmobi.media.EnumC3399w8.f27770h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0073, code lost:
    
        if (r5 != com.inmobi.media.EnumC3399w8.f27771i) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x007c, code lost:
    
        if (r5 != com.inmobi.media.EnumC3399w8.f27771i) goto L61;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x00b1, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.inmobi.media.EnumC3399w8 r5, java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3475z8.a(com.inmobi.media.w8, java.lang.String, java.lang.String):boolean");
    }

    public final void a(String str, String str2, String str3) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27988c;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).b("HybridVideoPlayerHandler", "Manager error (" + str + "): " + str2);
        }
        if (this.f27992g.get()) {
            return;
        }
        EnumC2933e8[] enumC2933e8Arr = EnumC2933e8.f26475a;
        if (kotlin.jvm.internal.s.c(str, "unknown")) {
            return;
        }
        C2856b8 obj = new C2856b8(str3);
        C3176ni c3176ni = this.f27999n;
        if (c3176ni != null) {
            EnumC3321t8 htmlVideoTemplateEvents = EnumC3321t8.VIDEO_COMMAND_ERROR;
            kotlin.jvm.internal.s.h(obj, "obj");
            JSONObject jSONObjectA = AbstractC3323ta.a(obj, C2856b8.class);
            kotlin.jvm.internal.s.h(htmlVideoTemplateEvents, "htmlVideoTemplateEvents");
            c3176ni.f27062a.a(htmlVideoTemplateEvents, jSONObjectA);
        }
    }

    public final void a(boolean z10) throws JSONException {
        if (this.f27992g.get()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", z10 ? CampaignEx.JSON_NATIVE_VIDEO_MUTE : CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
        EnumC3399w8[] enumC3399w8Arr = {EnumC3399w8.LOADED, EnumC3399w8.PLAYING, EnumC3399w8.PAUSED};
        EnumC2933e8[] enumC2933e8Arr = EnumC2933e8.f26475a;
        if (a(this, enumC3399w8Arr, "executeVideoPlayerActions", jSONObject.toString(), null, 8)) {
            R7 r10 = this.f27996k;
            if (r10.f25595h.get()) {
                return;
            }
            if (z10) {
                W7 w10 = r10.f25612y;
                w10.a();
                w10.f25930d.a();
            } else {
                W7 w11 = r10.f25612y;
                T4.a(w11.f25927a, new V7(w11, null));
            }
        }
    }

    public final void a() throws JSONException {
        ViewGroup viewGroup;
        androidx.media3.datasource.cache.h hVar;
        if (this.f27992g.getAndSet(true)) {
            return;
        }
        EnumC3399w8 enumC3399w8 = EnumC3399w8.DESTROYED;
        EnumC2933e8[] enumC2933e8Arr = EnumC2933e8.f26475a;
        a(enumC3399w8, "executeVideoPlayerActions", (String) null);
        InterfaceC3322t9 interfaceC3322t9 = this.f27988c;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("HybridVideoPlayerHandler", "destroy video player");
        }
        R7 r10 = this.f27996k;
        if (!r10.f25595h.getAndSet(true)) {
            InterfaceC3322t9 interfaceC3322t10 = r10.f25589b;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).a("HtmlMediaPlayer", "destroy called");
            }
            em.z1 z1Var = r10.f25609v;
            if (z1Var != null) {
                em.z1.c0(z1Var, null, 1, null);
            }
            r10.f25609v = null;
            r10.f25599l.set(Bg.STATE_DESTROYED);
            r10.f25594g.set(false);
            T4.a(r10.f25598k);
            r10.f25611x.a();
            if (r10.f25593f.get()) {
                r10.f25593f.set(false);
                if (!kotlin.jvm.internal.s.c(Looper.myLooper(), Looper.getMainLooper())) {
                    em.k.d(r10.f25590c, null, null, new M7(null, r10), 3, null);
                } else {
                    r10.f25603p.n(r10.B);
                }
            }
            if (!kotlin.jvm.internal.s.c(Looper.myLooper(), Looper.getMainLooper())) {
                em.k.d(r10.f25590c, null, null, new L7(null, r10), 3, null);
            } else {
                r10.f25603p.stop();
                r10.f25603p.b();
                r10.f25603p.release();
                r10.f25613z.a();
                r10.f25612y.f25930d.d();
            }
            L2 l10 = r10.f25610w;
            while (true) {
                int i10 = l10.f25172f.get();
                if (i10 <= 0) {
                    break;
                }
                int i11 = i10 - 1;
                if (l10.f25172f.compareAndSet(i10, i11)) {
                    if (i11 == 0) {
                        synchronized (l10.f25167a) {
                            try {
                                if (l10.f25172f.get() == 0) {
                                    hVar = l10.f25173g;
                                    l10.f25173g = null;
                                } else {
                                    hVar = null;
                                }
                                fl.g0 g0Var = fl.g0.f38750a;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        hVar = null;
                    }
                    if (hVar == null) {
                        break;
                    }
                    hVar.w();
                    break;
                }
            }
            r10.f25601n.setOnPositionChangeListener(null);
            r10.f25601n.removeAllViews();
            WeakReference weakReference = r10.f25605r;
            if (weakReference != null && (viewGroup = (ViewGroup) weakReference.get()) != null) {
                viewGroup.removeView(r10.f25601n);
            }
            WeakReference weakReference2 = r10.f25605r;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            em.p0.c(r10.f25590c, null, 1, null);
            em.p0.c(r10.f25591d, null, 1, null);
        }
        R7 r11 = this.f27996k;
        r11.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("totalDuration", r11.f25603p.getDuration());
        jSONObject.put("playbackTime", r11.f25603p.getCurrentPosition());
        jSONObject.put("bufferTime", r11.f25603p.getBufferedPosition());
        String durationPayload = jSONObject.toString();
        kotlin.jvm.internal.s.g(durationPayload, "toString(...)");
        C3485zi c3485zi = this.f27987b;
        if (c3485zi != null) {
            kotlin.jvm.internal.s.h(durationPayload, "durationPayload");
            Map mapA = c3485zi.a();
            mapA.put("payload", durationPayload);
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b("VideoDestroyed", mapA, EnumC3281rk.SDK);
        }
        C3176ni c3176ni = this.f27999n;
        if (c3176ni != null) {
            EnumC3321t8 htmlVideoTemplateEvents = EnumC3321t8.VIDEO_PLAYER_DESTROYED;
            kotlin.jvm.internal.s.h(htmlVideoTemplateEvents, "htmlVideoTemplateEvents");
            c3176ni.f27062a.a(htmlVideoTemplateEvents, (Object) null);
        }
        em.z1 z1Var2 = this.f27991f;
        if (z1Var2 != null) {
            em.z1.c0(z1Var2, null, 1, null);
        }
        this.f27991f = null;
        this.f27998m = null;
        this.f27999n = null;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x029b  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    public final void a(AbstractC3050im obj) throws JSONException {
        C3475z8 c3475z8;
        C3485zi c3485zi;
        C3176ni c3176ni;
        C3176ni c3176ni2;
        C3021hi c3021hi;
        C3176ni c3176ni3;
        Gf gf2;
        Ie ie2;
        InterfaceC3322t9 interfaceC3322t9 = this.f27988c;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).b("HybridVideoPlayerHandler", "handleMediaEvent: " + obj);
        }
        boolean z10 = obj instanceof Om;
        if (z10) {
            C3176ni c3176ni4 = this.f27999n;
            if (c3176ni4 != null) {
                EnumC3321t8 htmlVideoTemplateEvents = EnumC3321t8.VIDEO_QUARTILES_EVENT;
                EnumC2908d8[] enumC2908d8Arr = EnumC2908d8.f26398a;
                kotlin.jvm.internal.s.h(htmlVideoTemplateEvents, "htmlVideoTemplateEvents");
                c3176ni4.f27062a.a(htmlVideoTemplateEvents, "q1");
            }
        } else if (obj instanceof C3490zn) {
            C3176ni c3176ni5 = this.f27999n;
            if (c3176ni5 != null) {
                EnumC3321t8 htmlVideoTemplateEvents2 = EnumC3321t8.VIDEO_QUARTILES_EVENT;
                EnumC2908d8[] enumC2908d8Arr2 = EnumC2908d8.f26398a;
                kotlin.jvm.internal.s.h(htmlVideoTemplateEvents2, "htmlVideoTemplateEvents");
                c3176ni5.f27062a.a(htmlVideoTemplateEvents2, "q2");
            }
        } else if (obj instanceof In) {
            C3176ni c3176ni6 = this.f27999n;
            if (c3176ni6 != null) {
                EnumC3321t8 htmlVideoTemplateEvents3 = EnumC3321t8.VIDEO_QUARTILES_EVENT;
                EnumC2908d8[] enumC2908d8Arr3 = EnumC2908d8.f26398a;
                kotlin.jvm.internal.s.h(htmlVideoTemplateEvents3, "htmlVideoTemplateEvents");
                c3176ni6.f27062a.a(htmlVideoTemplateEvents3, "q3");
            }
        } else if (obj instanceof Pm) {
            C3176ni c3176ni7 = this.f27999n;
            if (c3176ni7 != null) {
                EnumC3321t8 htmlVideoTemplateEvents4 = EnumC3321t8.VIDEO_QUARTILES_EVENT;
                EnumC2908d8[] enumC2908d8Arr4 = EnumC2908d8.f26398a;
                kotlin.jvm.internal.s.h(htmlVideoTemplateEvents4, "htmlVideoTemplateEvents");
                c3176ni7.f27062a.a(htmlVideoTemplateEvents4, "q4");
            }
        } else {
            if (obj instanceof C2999gm) {
                if (a(EnumC3399w8.COMPLETED, (String) null, (String) null) && (c3176ni3 = this.f27999n) != null) {
                    EnumC3321t8 htmlVideoTemplateEvents5 = EnumC3321t8.VIDEO_COMPLETE;
                    kotlin.jvm.internal.s.h(htmlVideoTemplateEvents5, "htmlVideoTemplateEvents");
                    c3176ni3.f27062a.a(htmlVideoTemplateEvents5, (Object) null);
                }
            } else if (obj instanceof C3088k8) {
                c3475z8 = this;
                if (a(c3475z8, new EnumC3399w8[]{EnumC3399w8.LOADING}, null, null, EnumC3399w8.LOADED, 6)) {
                    C3021hi c3021hi2 = c3475z8.f27998m;
                    if (c3021hi2 != null) {
                        HtmlVideoPlaybackState obj2 = ((C3088k8) obj).f26847a;
                        kotlin.jvm.internal.s.h(obj2, "videoInfo");
                        InterfaceC3322t9 interfaceC3322t10 = c3021hi2.f26686a.f27233i;
                        if (interfaceC3322t10 != null) {
                            ((C3348u9) interfaceC3322t10).b("HtmlVideoPlayer", "onVideoLoadSuccess");
                        }
                        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = c3021hi2.f26686a;
                        EnumC3321t8 enumC3321t8 = EnumC3321t8.VIDEO_READY;
                        kotlin.jvm.internal.s.h(obj2, "obj");
                        gestureDetectorOnGestureListenerC3228pi.a(enumC3321t8, AbstractC3323ta.a(obj2, HtmlVideoPlaybackState.class));
                    }
                    if (c3475z8.f28000o) {
                        c3475z8.f27996k.e();
                    }
                }
            } else {
                c3475z8 = this;
                if (obj instanceof C2959f8) {
                    if (a(c3475z8, new EnumC3399w8[]{EnumC3399w8.LOADING}, null, null, EnumC3399w8.LOAD_FAILED, 6) && (c3021hi = c3475z8.f27998m) != null) {
                        c3021hi.a((C2959f8) obj);
                    }
                } else if (obj instanceof C3140m8) {
                    a(EnumC3399w8.ERROR, (String) null, (String) null);
                    C3176ni c3176ni8 = c3475z8.f27999n;
                    if (c3176ni8 != null) {
                        EnumC3321t8 htmlVideoTemplateEvents6 = EnumC3321t8.VIDEO_PLAYBACK_ERROR;
                        kotlin.jvm.internal.s.h(obj, "obj");
                        JSONObject jSONObjectA = AbstractC3323ta.a(obj, obj.getClass());
                        kotlin.jvm.internal.s.h(htmlVideoTemplateEvents6, "htmlVideoTemplateEvents");
                        c3176ni8.f27062a.a(htmlVideoTemplateEvents6, jSONObjectA);
                    }
                } else if (obj instanceof C2974fn) {
                    EnumC3399w8[] enumC3399w8Arr = {EnumC3399w8.PLAYING};
                    EnumC3399w8 enumC3399w8 = EnumC3399w8.PAUSED;
                    a(c3475z8, enumC3399w8Arr, null, null, enumC3399w8, 6);
                    if (c3475z8.f28002q.get() == enumC3399w8 && (c3176ni2 = c3475z8.f27999n) != null) {
                        EnumC3321t8 htmlVideoTemplateEvents7 = EnumC3321t8.VIDEO_PLAYBACK_STATE;
                        HtmlVideoPlaybackState obj3 = c3475z8.f27996k.a();
                        kotlin.jvm.internal.s.h(obj3, "obj");
                        JSONObject jSONObjectA2 = AbstractC3323ta.a(obj3, HtmlVideoPlaybackState.class);
                        kotlin.jvm.internal.s.h(htmlVideoTemplateEvents7, "htmlVideoTemplateEvents");
                        c3176ni2.f27062a.a(htmlVideoTemplateEvents7, jSONObjectA2);
                    }
                } else if (obj instanceof C3465yn) {
                    EnumC3399w8[] enumC3399w8Arr2 = {EnumC3399w8.LOADED, EnumC3399w8.PAUSED, EnumC3399w8.COMPLETED};
                    EnumC3399w8 enumC3399w9 = EnumC3399w8.PLAYING;
                    a(c3475z8, enumC3399w8Arr2, null, null, enumC3399w9, 6);
                    if (c3475z8.f28002q.get() == enumC3399w9 && (c3176ni = c3475z8.f27999n) != null) {
                        EnumC3321t8 htmlVideoTemplateEvents8 = EnumC3321t8.VIDEO_PLAYBACK_STATE;
                        HtmlVideoPlaybackState obj4 = c3475z8.f27996k.a();
                        kotlin.jvm.internal.s.h(obj4, "obj");
                        JSONObject jSONObjectA3 = AbstractC3323ta.a(obj4, HtmlVideoPlaybackState.class);
                        kotlin.jvm.internal.s.h(htmlVideoTemplateEvents8, "htmlVideoTemplateEvents");
                        c3176ni.f27062a.a(htmlVideoTemplateEvents8, jSONObjectA3);
                    }
                } else if (obj instanceof Bn) {
                    C3176ni c3176ni9 = c3475z8.f27999n;
                    if (c3176ni9 != null) {
                        EnumC3321t8 htmlVideoTemplateEvents9 = EnumC3321t8.VIDEO_QUARTILES_EVENT;
                        EnumC2908d8[] enumC2908d8Arr5 = EnumC2908d8.f26398a;
                        kotlin.jvm.internal.s.h(htmlVideoTemplateEvents9, "htmlVideoTemplateEvents");
                        c3176ni9.f27062a.a(htmlVideoTemplateEvents9, "q0");
                    }
                } else if (obj instanceof C3218p8) {
                    C3218p8 c3218p8 = (C3218p8) obj;
                    float f10 = c3218p8.f27182a / 1000.0f;
                    float f11 = c3218p8.f27183b / 1000.0f;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("time", Float.valueOf(f10));
                    jSONObject.put("duration", Float.valueOf(f11));
                    C3176ni c3176ni10 = c3475z8.f27999n;
                    if (c3176ni10 != null) {
                        EnumC3321t8 htmlVideoTemplateEvents10 = EnumC3321t8.VIDEO_PLAYBACK_UPDATE;
                        kotlin.jvm.internal.s.h(htmlVideoTemplateEvents10, "htmlVideoTemplateEvents");
                        c3176ni10.f27062a.a(htmlVideoTemplateEvents10, jSONObject);
                    }
                } else if (obj instanceof C3192o8) {
                    C3176ni c3176ni11 = c3475z8.f27999n;
                    if (c3176ni11 != null) {
                        EnumC3321t8 htmlVideoTemplateEvents11 = EnumC3321t8.VIDEO_PLAYER_POSITION;
                        VideoViewPosition obj5 = ((C3192o8) obj).f27127a;
                        kotlin.jvm.internal.s.h(obj5, "obj");
                        JSONObject jSONObjectA4 = AbstractC3323ta.a(obj5, VideoViewPosition.class);
                        kotlin.jvm.internal.s.h(htmlVideoTemplateEvents11, "htmlVideoTemplateEvents");
                        c3176ni11.f27062a.a(htmlVideoTemplateEvents11, jSONObjectA4);
                    }
                } else if (obj instanceof C2830a8) {
                    C3176ni c3176ni12 = c3475z8.f27999n;
                    if (c3176ni12 != null) {
                        EnumC3321t8 htmlVideoTemplateEvents12 = EnumC3321t8.VIDEO_CAN_PLAY_THROUGH;
                        kotlin.jvm.internal.s.h(htmlVideoTemplateEvents12, "htmlVideoTemplateEvents");
                        c3176ni12.f27062a.a(htmlVideoTemplateEvents12, (Object) null);
                    }
                } else if (obj instanceof C3114l8) {
                    C3176ni c3176ni13 = c3475z8.f27999n;
                    if (c3176ni13 != null) {
                        EnumC3321t8 htmlVideoTemplateEvents13 = EnumC3321t8.VIDEO_LOADED_METADATA;
                        kotlin.jvm.internal.s.h(htmlVideoTemplateEvents13, "htmlVideoTemplateEvents");
                        c3176ni13.f27062a.a(htmlVideoTemplateEvents13, (Object) null);
                    }
                } else if (obj instanceof S1) {
                    C3176ni c3176ni14 = c3475z8.f27999n;
                    if (c3176ni14 != null) {
                        EnumC3321t8 htmlVideoTemplateEvents14 = EnumC3321t8.VIDEO_PLAYBACK_STATE;
                        HtmlVideoPlaybackState obj6 = c3475z8.f27996k.a();
                        kotlin.jvm.internal.s.h(obj6, "obj");
                        JSONObject jSONObjectA5 = AbstractC3323ta.a(obj6, HtmlVideoPlaybackState.class);
                        kotlin.jvm.internal.s.h(htmlVideoTemplateEvents14, "htmlVideoTemplateEvents");
                        c3176ni14.f27062a.a(htmlVideoTemplateEvents14, jSONObjectA5);
                    }
                } else if ((obj instanceof C3347u8) && (c3485zi = c3475z8.f27987b) != null) {
                    Map mapA = c3485zi.a();
                    C3178nk c3178nk = C3178nk.f27064a;
                    C3178nk.b("ViewStateOnParentAttached", mapA, EnumC3281rk.SDK);
                }
            }
            if ((!z10 || (obj instanceof C3490zn) || (obj instanceof In) || (obj instanceof C2999gm) || (obj instanceof Bn) || (obj instanceof C2974fn) || (obj instanceof C3465yn) || (obj instanceof C3140m8) || (obj instanceof S1)) && (gf2 = c3475z8.f28001p) != null) {
                kotlin.jvm.internal.s.h(obj, "videoEvent");
                ie2 = gf2.f24863e;
                if (ie2 != null) {
                    ie2.a(obj);
                }
            }
            return;
        }
        c3475z8 = this;
        if (z10) {
        }
        kotlin.jvm.internal.s.h(obj, "videoEvent");
        ie2 = gf2.f24863e;
        if (ie2 != null) {
            ie2.a(obj);
        }
    }
}
