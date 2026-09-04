package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.k3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class HandlerC3083k3 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f26835a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3083k3(Looper looper) {
        super(looper);
        kotlin.jvm.internal.s.h(looper, "looper");
    }

    public final void a(V2 v10) {
        A3 a10 = A3.f24440a;
        kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
        String str = v10.f25870b;
        b(v10);
        A3.a(v10, "RETRY_EXHAUSTED");
        em.j.b(null, new C3032i3(v10, null), 1, null);
        A3.f24445f.remove(v10);
        if (A3.f24445f.isEmpty()) {
            em.j.b(null, new C3057j3(this, null), 1, null);
        }
    }

    public final void b(V2 v10) {
        int iG0 = gl.r.g0(A3.f24445f, v10);
        if (-1 != iG0) {
            V2 v11 = (V2) A3.f24445f.get(iG0 == A3.f24445f.size() + (-1) ? 0 : iG0 + 1);
            Message messageObtain = Message.obtain();
            messageObtain.what = v11.f25873e ? 3 : 2;
            messageObtain.obj = v11;
            long pingInterval = A3.c().getPingInterval() * 1000;
            if (System.currentTimeMillis() - v11.f25875g < pingInterval) {
                sendMessageDelayed(messageObtain, pingInterval);
            } else {
                sendMessage(messageObtain);
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        kotlin.jvm.internal.s.h(msg, "msg");
        if (A3.f24447h.get()) {
            try {
                int i10 = msg.what;
                int i11 = 3;
                if (i10 == 1) {
                    if (A3.e()) {
                        AdConfig.ImaiConfig imaiConfigC = A3.c();
                        Z2 z10 = (Z2) A3.f24441b.getValue();
                        List list = (List) em.j.b(null, new C2903d3(z10, imaiConfigC, null), 1, null);
                        A3.f24445f = list;
                        if (list.isEmpty()) {
                            em.j.b(null, new C2928e3(z10, this, imaiConfigC, null), 1, null);
                            return;
                        }
                        kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
                        for (V2 v10 : A3.f24445f) {
                            A3 a10 = A3.f24440a;
                            kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
                            String str = v10.f25870b;
                        }
                        V2 v11 = (V2) A3.f24445f.get(0);
                        Message messageObtain = Message.obtain();
                        if (!v11.f25873e) {
                            i11 = 2;
                        }
                        messageObtain.what = i11;
                        messageObtain.obj = v11;
                        long jCurrentTimeMillis = System.currentTimeMillis() - v11.f25875g;
                        if (jCurrentTimeMillis < imaiConfigC.getPingInterval() * 1000) {
                            sendMessageDelayed(messageObtain, ((long) (imaiConfigC.getPingInterval() * 1000)) - jCurrentTimeMillis);
                            return;
                        } else {
                            sendMessage(messageObtain);
                            return;
                        }
                    }
                    return;
                }
                if (i10 == 2) {
                    if (Ze.a() != null) {
                        A3.f24446g.set(false);
                        A3.g();
                        return;
                    }
                    Object obj = msg.obj;
                    AdConfig.ImaiConfig imaiConfigC2 = A3.c();
                    if (!(obj instanceof V2)) {
                        kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
                        return;
                    }
                    if (((V2) obj).f25874f != 0) {
                        if (System.currentTimeMillis() - ((V2) obj).f25876h <= imaiConfigC2.getPingCacheExpiry() * ((long) 1000)) {
                            if ((imaiConfigC2.getMaxRetries() - ((V2) obj).f25874f) + 1 == 0) {
                                kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
                            } else {
                                kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
                            }
                            em.j.b(null, new C2954f3((V2) obj, this, null), 1, null);
                            return;
                        }
                    }
                    a((V2) obj);
                    return;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
                        fl.g0 g0Var = fl.g0.f38750a;
                        return;
                    }
                    Object obj2 = msg.obj;
                    kotlin.jvm.internal.s.f(obj2, "null cannot be cast to non-null type com.inmobi.ads.core.Click");
                    V2 click = (V2) obj2;
                    kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
                    String str2 = click.f25870b;
                    LinkedHashMap linkedHashMap = A3.f24449j;
                    C2822a0 c2822a0 = (C2822a0) linkedHashMap.get(Integer.valueOf(click.f25869a));
                    if (c2822a0 != null) {
                        kotlin.jvm.internal.s.h(click, "click");
                        c2822a0.f26163a.a(c2822a0.f26164b);
                    }
                    linkedHashMap.remove(Integer.valueOf(click.f25869a));
                    em.j.b(null, new C3006h3(click, this, null), 1, null);
                    return;
                }
                if (Ze.a() != null) {
                    A3.f24446g.set(false);
                    A3.g();
                    return;
                }
                Object obj3 = msg.obj;
                AdConfig.ImaiConfig imaiConfigC3 = A3.c();
                if (!(obj3 instanceof V2)) {
                    kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
                    return;
                }
                if (((V2) obj3).f25874f != 0) {
                    if (System.currentTimeMillis() - ((V2) obj3).f25876h <= imaiConfigC3.getPingCacheExpiry() * ((long) 1000)) {
                        if ((imaiConfigC3.getMaxRetries() - ((V2) obj3).f25874f) + 1 == 0) {
                            kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
                        } else {
                            kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
                        }
                        new C3135m3(new C2980g3(this)).a((V2) obj3);
                        fl.g0 g0Var2 = fl.g0.f38750a;
                        return;
                    }
                }
                a((V2) obj3);
            } catch (Exception e10) {
                A3 a11 = A3.f24440a;
                kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
                e10.getMessage();
            }
        }
    }
}
