package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.x8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3425x8 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3475z8 f27834b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3425x8(C3475z8 c3475z8, kl.f fVar) {
        super(2, fVar);
        this.f27834b = c3475z8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        C3425x8 c3425x8 = new C3425x8(this.f27834b, fVar);
        c3425x8.f27833a = obj;
        return c3425x8;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        C3425x8 c3425x8 = new C3425x8(this.f27834b, (kl.f) obj2);
        c3425x8.f27833a = (AbstractC3050im) obj;
        return c3425x8.invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        ll.b.f();
        fl.s.b(obj);
        AbstractC3050im mediaEvent = (AbstractC3050im) this.f27833a;
        this.f27834b.a(mediaEvent);
        C3485zi c3485zi = this.f27834b.f27987b;
        if (c3485zi != null) {
            kotlin.jvm.internal.s.h(mediaEvent, "mediaEvent");
            if (mediaEvent instanceof C3011h8) {
                HtmlVideoPlayerRequest htmlVideoPlayerRequest = ((C3011h8) mediaEvent).f26659a;
                Map mapA = c3485zi.a();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("videoUrls", htmlVideoPlayerRequest.getVideoFiles());
                jSONObject.put("autoplay", htmlVideoPlayerRequest.getConfig().getAutoplay());
                jSONObject.put("muted", htmlVideoPlayerRequest.getConfig().getMuted());
                mapA.put("payload", jSONObject.toString());
                C3178nk c3178nk = C3178nk.f27064a;
                C3178nk.b("VideoLoadStarted", mapA, EnumC3281rk.SDK);
            } else if (mediaEvent instanceof C3088k8) {
                C3088k8 c3088k8 = (C3088k8) mediaEvent;
                Map mapA2 = c3485zi.a();
                Long latency = c3088k8.f26847a.getLatency();
                mapA2.put("latency", Long.valueOf(latency != null ? latency.longValue() : -1L));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("videoUrl", c3088k8.f26847a.getVideoUrl());
                jSONObject2.put("cacheProgress", c3088k8.f26848b);
                mapA2.put("payload", jSONObject2.toString());
                C3178nk c3178nk2 = C3178nk.f27064a;
                C3178nk.b("VideoLoadSuccess", mapA2, EnumC3281rk.SDK);
            } else if (mediaEvent instanceof Bn) {
                Map mapA3 = c3485zi.a();
                C3178nk c3178nk3 = C3178nk.f27064a;
                C3178nk.b("VideoStart", mapA3, EnumC3281rk.SDK);
            } else if (mediaEvent instanceof Om) {
                Map mapA4 = c3485zi.a();
                C3178nk c3178nk4 = C3178nk.f27064a;
                C3178nk.b("VideoFirstQuartile", mapA4, EnumC3281rk.SDK);
            } else if (mediaEvent instanceof C3490zn) {
                Map mapA5 = c3485zi.a();
                C3178nk c3178nk5 = C3178nk.f27064a;
                C3178nk.b("VideoSecondQuartile", mapA5, EnumC3281rk.SDK);
            } else if (mediaEvent instanceof In) {
                Map mapA6 = c3485zi.a();
                C3178nk c3178nk6 = C3178nk.f27064a;
                C3178nk.b("VideoThirdQuartile", mapA6, EnumC3281rk.SDK);
            } else if (mediaEvent instanceof C2999gm) {
                Map mapA7 = c3485zi.a();
                C3178nk c3178nk7 = C3178nk.f27064a;
                C3178nk.b("VideoComplete", mapA7, EnumC3281rk.SDK);
            } else if (mediaEvent instanceof C2959f8) {
                C2959f8 c2959f8 = (C2959f8) mediaEvent;
                Map mapA8 = c3485zi.a();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("videoUrls", c2959f8.f26541a.getVideoFiles());
                mapA8.put("payload", jSONObject3.toString());
                mapA8.put("errorCode", Short.valueOf(c2959f8.f26542b));
                C3178nk c3178nk8 = C3178nk.f27064a;
                C3178nk.b("VideoLoadFailure", mapA8, EnumC3281rk.SDK);
            }
        }
        return fl.g0.f38750a;
    }
}
