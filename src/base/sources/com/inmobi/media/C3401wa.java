package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.HtmlVideoFile;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o4.Wz.OGoz;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.wa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3401wa extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ca f27773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HtmlVideoPlayerRequest f27774b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3401wa(Ca ca2, HtmlVideoPlayerRequest htmlVideoPlayerRequest, kl.f fVar) {
        super(2, fVar);
        this.f27773a = ca2;
        this.f27774b = htmlVideoPlayerRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3401wa(this.f27773a, this.f27774b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3401wa(this.f27773a, this.f27774b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0177  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        InterfaceC3322t9 interfaceC3322t9;
        ll.b.f();
        fl.s.b(obj);
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f27773a.f24583a;
        HtmlVideoPlayerRequest obj2 = this.f27774b;
        gestureDetectorOnGestureListenerC3228pi.getClass();
        kotlin.jvm.internal.s.h(obj2, "requestConfig");
        InterfaceC3322t9 interfaceC3322t10 = gestureDetectorOnGestureListenerC3228pi.f27233i;
        if (interfaceC3322t10 != null) {
            ((C3348u9) interfaceC3322t10).b("HtmlVideoPlayer", "loadVideoPlayer");
        }
        if (gestureDetectorOnGestureListenerC3228pi.getAdConfig().getHybridNative().getIsEnabled()) {
            String maxSupportedPlayerVersion = gestureDetectorOnGestureListenerC3228pi.getAdConfig().getHybridNative().getMaxSupportedPlayerVersion();
            C3485zi c3485zi = gestureDetectorOnGestureListenerC3228pi.f27224e0;
            try {
                AbstractC3077jn.a(maxSupportedPlayerVersion);
                gestureDetectorOnGestureListenerC3228pi.f27213a1 = true;
                gestureDetectorOnGestureListenerC3228pi.Z0 = new C3475z8(gestureDetectorOnGestureListenerC3228pi, gestureDetectorOnGestureListenerC3228pi.getAdConfig().getHybridNative(), obj2, gestureDetectorOnGestureListenerC3228pi.f27216b1, gestureDetectorOnGestureListenerC3228pi.f27224e0, gestureDetectorOnGestureListenerC3228pi.f27233i);
                EnumC3321t8 enumC3321t8 = EnumC3321t8.VIDEO_PLAYER_CREATED;
                kotlin.jvm.internal.s.h(obj2, "obj");
                gestureDetectorOnGestureListenerC3228pi.a(enumC3321t8, AbstractC3323ta.a(obj2, HtmlVideoPlayerRequest.class));
                C3475z8 c3475z8 = gestureDetectorOnGestureListenerC3228pi.Z0;
                if (c3475z8 != null) {
                    C3021hi videoLoadListener = new C3021hi(gestureDetectorOnGestureListenerC3228pi);
                    kotlin.jvm.internal.s.h(videoLoadListener, "videoLoadListener");
                    if (!c3475z8.f27992g.get()) {
                        HtmlVideoPlayerRequest obj3 = c3475z8.f27986a;
                        kotlin.jvm.internal.s.h(obj3, "obj");
                        String strValueOf = String.valueOf(AbstractC3323ta.a(obj3, HtmlVideoPlayerRequest.class));
                        EnumC3399w8[] enumC3399w8Arr = {EnumC3399w8.INIT};
                        EnumC2933e8[] enumC2933e8Arr = EnumC2933e8.f26475a;
                        if (c3475z8.a(enumC3399w8Arr, "createVideoPlayer", strValueOf, EnumC3399w8.LOADING)) {
                            InterfaceC3322t9 interfaceC3322t11 = c3475z8.f27988c;
                            if (interfaceC3322t11 != null) {
                                ((C3348u9) interfaceC3322t11).b("HybridVideoPlayerHandler", "load called with video files");
                            }
                            c3475z8.f27998m = videoLoadListener;
                            if (c3475z8.f27991f == null) {
                                c3475z8.f27991f = hm.g.v(hm.g.y(c3475z8.f27996k.C, new C3425x8(c3475z8, null)), c3475z8.f27990e);
                            }
                            R7 r10 = c3475z8.f27996k;
                            if (!r10.f25595h.get()) {
                                r10.a(new C3011h8(r10.f25588a));
                                if (r10.b() == Bg.STATE_INITIALIZED) {
                                    r10.f25599l.set(Bg.STATE_PREPARING);
                                    r10.f25606s.clear();
                                    r10.f25606s.addAll(r10.f25588a.getVideoFiles());
                                    List list = r10.f25606s;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((HtmlVideoFile) it.next()).getUrl());
                                    }
                                    if (arrayList.isEmpty()) {
                                        r10.a(new C2985g8(Rm.NO_URL_FOUND));
                                    } else {
                                        r10.f25609v = em.k.d(r10.f25590c, null, null, new G7(r10, arrayList, null), 3, null);
                                    }
                                } else {
                                    r10.a(new C2985g8(Rm.INVALID_STATE));
                                }
                            }
                        }
                    }
                }
                gestureDetectorOnGestureListenerC3228pi.getViewableAd();
            } catch (Ag e10) {
                if (c3485zi != null) {
                    c3485zi.a(e10.f24475a);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorMessage", "Hybrid video is not supported on this device.");
                EnumC2933e8[] enumC2933e8Arr2 = EnumC2933e8.f26475a;
                jSONObject.put(OGoz.ZXhgkZCPmKgb, "createVideoPlayer");
                gestureDetectorOnGestureListenerC3228pi.a(EnumC3321t8.VIDEO_COMMAND_ERROR, jSONObject);
                interfaceC3322t9 = gestureDetectorOnGestureListenerC3228pi.f27233i;
                if (interfaceC3322t9 != null) {
                    ((C3348u9) interfaceC3322t9).b("HtmlVideoPlayer", "Cannot play hybrid video");
                }
            }
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("errorMessage", "Hybrid video is not supported on this device.");
            EnumC2933e8[] enumC2933e8Arr3 = EnumC2933e8.f26475a;
            jSONObject2.put(OGoz.ZXhgkZCPmKgb, "createVideoPlayer");
            gestureDetectorOnGestureListenerC3228pi.a(EnumC3321t8.VIDEO_COMMAND_ERROR, jSONObject2);
            interfaceC3322t9 = gestureDetectorOnGestureListenerC3228pi.f27233i;
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).b("HtmlVideoPlayer", "Cannot play hybrid video");
            }
        }
        return fl.g0.f38750a;
    }
}
