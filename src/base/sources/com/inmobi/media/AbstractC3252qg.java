package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.qg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3252qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3433xg f27338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f27339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3251qf f27340c;

    public AbstractC3252qg(C3433xg dao) {
        kotlin.jvm.internal.s.h(dao, "dao");
        this.f27338a = dao;
        this.f27339b = new ConcurrentHashMap();
        this.f27340c = new C3251qf(a());
    }

    public static void a(Zf zf2, short s10) {
        C3331ti c3331ti = zf2.f26151k;
        if (c3331ti == null) {
            Ui ui2 = AbstractC3277rg.f27402a;
            AbstractC3277rg.a("PingFailed", gl.l0.m(fl.w.a("trigger", zf2.f26145e), fl.w.a("errorCode", Short.valueOf(s10)), fl.w.a("retryCount", Integer.valueOf(zf2.f26147g))));
            return;
        }
        C3485zi c3485zi = new C3485zi(c3331ti);
        String priority = zf2.f26145e;
        int i10 = zf2.f26147g;
        kotlin.jvm.internal.s.h(priority, "priority");
        Map mapA = c3485zi.a();
        mapA.put("errorCode", Short.valueOf(s10));
        mapA.put("trigger", priority);
        mapA.put("retryCount", String.valueOf(i10));
        AbstractC3277rg.a("PingFailed", mapA);
    }

    public static AdConfig.PingsV2Config a() {
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
        return ((AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class)).getPingV2();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        if (r12 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
    
        if (r12 == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, kotlin.coroutines.jvm.internal.d r12) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3252qg.a(java.lang.String, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public static void a(int i10, String str, short s10, Zf ping, long j10, InterfaceC3174ng interfaceC3174ng) {
        kotlin.jvm.internal.s.h(ping, "ping");
        kotlin.jvm.internal.s.g(AbstractC3252qg.class.getSimpleName(), "getSimpleName(...)");
        String str2 = ping.f26141a;
        kotlin.jvm.internal.s.g(AbstractC3252qg.class.getSimpleName(), "getSimpleName(...)");
        Objects.toString(interfaceC3174ng);
        if (interfaceC3174ng != null) {
            ((C3148mg) interfaceC3174ng).a(ping, i10, str, ping.f26147g, j10);
        } else {
            a(ping, s10);
        }
    }

    public static void a(C2967fg c2967fg, InterfaceC3174ng interfaceC3174ng) {
        kotlin.jvm.internal.s.g(AbstractC3252qg.class.getSimpleName(), "getSimpleName(...)");
        String str = c2967fg.f26556a.f26141a;
        Objects.toString(interfaceC3174ng);
        if (interfaceC3174ng != null) {
            ((C3148mg) interfaceC3174ng).a(c2967fg.f26556a, c2967fg.f26557b, c2967fg.f26559d);
            return;
        }
        Zf zf2 = c2967fg.f26556a;
        C3331ti c3331ti = zf2.f26151k;
        if (c3331ti != null) {
            C3485zi c3485zi = new C3485zi(c3331ti);
            String priority = zf2.f26145e;
            long j10 = zf2.f26149i;
            kotlin.jvm.internal.s.h(priority, "priority");
            Map mapA = c3485zi.a();
            mapA.put("trigger", priority);
            mapA.put("latency", Long.valueOf(j10));
            AbstractC3277rg.a("PingSuccess", mapA);
            return;
        }
        Ui ui2 = AbstractC3277rg.f27402a;
        AbstractC3277rg.a("PingSuccess", gl.l0.m(fl.w.a("trigger", zf2.f26145e), fl.w.a("retryCount", Integer.valueOf(zf2.f26147g))));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object a(C2967fg c2967fg, InterfaceC3174ng interfaceC3174ng, kl.f fVar) {
        C3200og c3200og;
        int maxRetries;
        fl.q qVar;
        Zf zf2;
        Zf zf3;
        InterfaceC3174ng interfaceC3174ng2;
        C2967fg c2967fg2 = c2967fg;
        InterfaceC3174ng interfaceC3174ng3 = interfaceC3174ng;
        if (fVar instanceof C3200og) {
            c3200og = (C3200og) fVar;
            int i10 = c3200og.f27142f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3200og.f27142f = i10 - Integer.MIN_VALUE;
            } else {
                c3200og = new C3200og(this, fVar);
            }
        } else {
            c3200og = new C3200og(this, fVar);
        }
        C3200og c3200og2 = c3200og;
        Object obj = c3200og2.f27140d;
        Object objF = ll.b.f();
        int i11 = c3200og2.f27142f;
        if (i11 != 0) {
            if (i11 == 1) {
                InterfaceC3174ng interfaceC3174ng4 = c3200og2.f27138b;
                C2967fg c2967fg3 = c3200og2.f27137a;
                fl.s.b(obj);
                interfaceC3174ng2 = interfaceC3174ng4;
                c2967fg2 = c2967fg3;
                a(c2967fg2.f26557b, "Redirect URL is malformed", (short) 2258, c2967fg2.f26556a, c2967fg2.f26559d, interfaceC3174ng2);
                return fl.g0.f38750a;
            }
            if (i11 == 2) {
                Zf zf4 = c3200og2.f27139c;
                interfaceC3174ng3 = c3200og2.f27138b;
                C2967fg c2967fg4 = c3200og2.f27137a;
                fl.s.b(obj);
                zf3 = zf4;
                c2967fg2 = c2967fg4;
                a(c2967fg2.f26557b, c2967fg2.f26558c, (short) 2249, zf3, c2967fg2.f26559d, interfaceC3174ng3);
                return fl.g0.f38750a;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Zf zf5 = c3200og2.f27139c;
            interfaceC3174ng3 = c3200og2.f27138b;
            C2967fg c2967fg5 = c3200og2.f27137a;
            fl.s.b(obj);
            zf2 = zf5;
            c2967fg2 = c2967fg5;
            a(c2967fg2.f26557b, c2967fg2.f26558c, (short) 2247, zf2, c2967fg2.f26559d, interfaceC3174ng3);
            return fl.g0.f38750a;
        }
        fl.s.b(obj);
        String str = c2967fg2.f26556a.f26141a;
        int i12 = c2967fg2.f26557b;
        C2880c6 c2880c6 = EnumC2931e6.f26451b;
        if (i12 == 178) {
            String str2 = c2967fg2.f26556a.f26141a;
            C3433xg c3433xg = this.f27338a;
            Zf zf6 = c2967fg2.f26556a;
            c3200og2.f27137a = c2967fg2;
            c3200og2.f27138b = interfaceC3174ng3;
            c3200og2.f27142f = 1;
            Object objA = c3433xg.f27857a.a("pings", "id=?", new String[]{zf6.f26142b}, c3200og2);
            if (objA != ll.b.f()) {
                objA = fl.g0.f38750a;
            }
            if (objA != objF) {
                interfaceC3174ng2 = interfaceC3174ng3;
                a(c2967fg2.f26557b, "Redirect URL is malformed", (short) 2258, c2967fg2.f26556a, c2967fg2.f26559d, interfaceC3174ng2);
                return fl.g0.f38750a;
            }
        } else {
            Zf zf7 = c2967fg2.f26556a;
            int i13 = zf7.f26147g + 1;
            if (kotlin.jvm.internal.s.c(zf7.f26145e, "high")) {
                maxRetries = a().getRetryConfig().getHigh().getMaxRetries();
            } else {
                maxRetries = a().getRetryConfig().getNormal().getMaxRetries();
            }
            if (i13 > maxRetries) {
                C3433xg c3433xg2 = this.f27338a;
                c3200og2.f27137a = c2967fg2;
                c3200og2.f27138b = interfaceC3174ng3;
                c3200og2.f27139c = zf7;
                c3200og2.f27142f = 2;
                Object objA2 = c3433xg2.f27857a.a("pings", "id=?", new String[]{zf7.f26142b}, c3200og2);
                if (objA2 != ll.b.f()) {
                    objA2 = fl.g0.f38750a;
                }
                if (objA2 != objF) {
                    zf3 = zf7;
                    a(c2967fg2.f26557b, c2967fg2.f26558c, (short) 2249, zf3, c2967fg2.f26559d, interfaceC3174ng3);
                    return fl.g0.f38750a;
                }
            } else {
                if (kotlin.jvm.internal.s.c(zf7.f26145e, "high")) {
                    qVar = new fl.q(kotlin.coroutines.jvm.internal.b.e(a().getRetryConfig().getHigh().getRetryInterval()), kotlin.coroutines.jvm.internal.b.b(a().getRetryConfig().getHigh().getFactor()));
                } else {
                    qVar = new fl.q(kotlin.coroutines.jvm.internal.b.e(a().getRetryConfig().getNormal().getRetryInterval()), kotlin.coroutines.jvm.internal.b.b(a().getRetryConfig().getNormal().getFactor()));
                }
                Long lE = kotlin.coroutines.jvm.internal.b.e(System.currentTimeMillis() + ((long) (Math.pow(((Number) qVar.g()).doubleValue(), i13) * ((Number) qVar.d()).longValue() * 1000)));
                String url = zf7.f26141a;
                String id2 = zf7.f26142b;
                Map headers = zf7.f26143c;
                boolean z10 = zf7.f26144d;
                String priority = zf7.f26145e;
                boolean z11 = zf7.f26146f;
                String ownerId = zf7.f26148h;
                long j10 = zf7.f26149i;
                C3331ti c3331ti = zf7.f26151k;
                kotlin.jvm.internal.s.h(url, "url");
                kotlin.jvm.internal.s.h(id2, "id");
                kotlin.jvm.internal.s.h(headers, "headers");
                kotlin.jvm.internal.s.h(priority, "priority");
                kotlin.jvm.internal.s.h(ownerId, "ownerId");
                Zf zf8 = new Zf(url, id2, headers, z10, priority, z11, i13, ownerId, j10, lE, c3331ti);
                C3433xg c3433xg3 = this.f27338a;
                c3200og2.f27137a = c2967fg2;
                c3200og2.f27138b = interfaceC3174ng3;
                c3200og2.f27139c = zf7;
                c3200og2.f27142f = 3;
                Object objA3 = C3167n9.a(c3433xg3.f27857a, "pings", AbstractC3458yg.a(zf8), "id=?", new String[]{id2}, c3200og2, 16);
                if (objA3 != ll.b.f()) {
                    objA3 = fl.g0.f38750a;
                }
                if (objA3 != objF) {
                    zf2 = zf7;
                    a(c2967fg2.f26557b, c2967fg2.f26558c, (short) 2247, zf2, c2967fg2.f26559d, interfaceC3174ng3);
                    return fl.g0.f38750a;
                }
            }
        }
        return objF;
    }
}
